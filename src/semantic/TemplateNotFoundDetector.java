package semantic;

import ast.*;
import ast.argsList.AtomArguments;
import ast.argsList.ComplexArguments;
import ast.argument.*;
import ast.assignStmt.PythonExpressionAssignStatement;
import ast.assignStmt.TemplateLiteralAssignmentStatement;
import ast.atom.Atom;
import ast.atom.Str;
import ast.atomExpression.*;
import ast.compundStmt.*;
import ast.compundStmt.ClassDefinition;
import ast.compundStmt.PythonExpression;
import ast.condition.*;
import ast.functionDef.FunctionDefinition;
import ast.returnStmt.ComplexReturnStatement;
import ast.returnStmt.ConditionReturnStatement;
import ast.returnStmt.ReturnStatement;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TemplateNotFoundDetector implements ErrorDetector {

    private final List<SemanticError> errors = new ArrayList<>();
    private final Set<String> templatesRendered = new HashSet<>();
    private final Set<String> inlineTemplateVars = new HashSet<>();
    private String baseDir = "";
    private String filePath = "";

    @Override
    public void reset() {
        errors.clear();
        templatesRendered.clear();
        inlineTemplateVars.clear();
    }

    @Override
    public void detect(Program program) {
        if (program == null) return;

        for (Statement stmt : program.statements) {
            if (stmt == null || stmt.isPass || stmt.compoundStatements == null) continue;
            for (CompoundStatement cs : stmt.compoundStatements) {
                collectInlineTemplates(cs);
                analyzeCompoundStatement(cs);
            }
        }
        checkTemplatesExist();
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
        this.baseDir = new File(filePath).getParent();
    }

    private void collectInlineTemplates(CompoundStatement cs) {
        if (cs == null) return;
        if (cs instanceof TemplateLiteralAssignmentStatement ta) {
            if (ta.var != null) {
                String name = extractVarName(ta.var);
                if (name != null) {
                    inlineTemplateVars.add(name);
                }
            }
        } else if (cs instanceof PythonExpressionAssignStatement pa) {
            if (pa.var != null && isTripleQuoteString(pa.value)) {
                String name = extractVarName(pa.var);
                if (name != null) {
                    inlineTemplateVars.add(name);
                }
            }
        } else if (cs instanceof ClassDefinition cd) {
            if (cd.classBody != null && cd.classBody.compoundStatements != null) {
                for (CompoundStatement child : cd.classBody.compoundStatements) {
                    collectInlineTemplates(child);
                }
            }
        } else if (cs instanceof FunctionDefinition fd) {
            if (fd.functionBody != null && fd.functionBody.compoundStatements != null) {
                for (CompoundStatement child : fd.functionBody.compoundStatements) {
                    collectInlineTemplates(child);
                }
            }
        }
    }

    private boolean isTripleQuoteString(PythonExpression expr) {
        if (expr instanceof SimpleVariable sv) {
            String name = sv.getVarName();
            return name != null && name.startsWith("\"\"\"");
        }
        return false;
    }

    private String extractVarName(PythonExpression expr) {
        if (expr instanceof SimpleVariable sv) {
            return sv.getVarName();
        }
        if (expr instanceof ListAccess la) {
            return la.getVarName();
        }
        if (expr instanceof DictionaryAccess da) {
            return da.getVarName();
        }
        return null;
    }

    private void analyzeCompoundStatement(CompoundStatement cs) {
        if (cs == null) return;
        if (cs instanceof FunctionDefinition fd) {
            if (fd.functionBody != null) analyzeStatement(fd.functionBody);
        } else if (cs instanceof ClassDefinition cd) {
            if (cd.classBody != null) analyzeStatement(cd.classBody);
        } else if (cs instanceof IfStatement is) {
            if (is.statement != null) analyzeStatement(is.statement);
            if (is.elifStatements != null) {
                for (ElIfStatement elif : is.elifStatements) {
                    if (elif.statement != null) analyzeStatement(elif.statement);
                }
            }
            if (is.elseStatement != null) analyzeStatement(is.elseStatement);
        } else if (cs instanceof ForLoop fl) {
            if (fl.statement != null) analyzeStatement(fl.statement);
        } else if (cs instanceof ReturnStatement rs) {
            if (rs instanceof ComplexReturnStatement crs && crs.pythonExpression != null) {
                PythonExpression expr = crs.pythonExpression;
                if (expr instanceof AtomExpression ae) analyzeAtomExpression(ae);
            } else if (rs instanceof ConditionReturnStatement crs && crs.condition != null) {
                if (crs.condition instanceof ComparisonExpression ce) {
                    if (ce.baseExpr instanceof AtomExpression ae) analyzeAtomExpression(ae);
                }
            }
        } else if (cs instanceof AtomExpression ae) {
            analyzeAtomExpression(ae);
        }
    }

    private void analyzeStatement(Statement stmt) {
        if (stmt.isPass || stmt.compoundStatements == null) return;
        for (CompoundStatement cs : stmt.compoundStatements) {
            analyzeCompoundStatement(cs);
        }
    }

    private void analyzeAtomExpression(AtomExpression ae) {
        if (ae instanceof FunctionCall fc) {
            String funcName = fc.getVarName();
            if ("render_template".equals(funcName)) {
                String templateName = null;
                if (fc.argumentsList instanceof AtomArguments aa) {
                    if (aa.getArgs() != null && !aa.getArgs().isEmpty()) {
                        Atom first = aa.getArgs().get(0);
                        if (first != null && first.getValue() instanceof String s) {
                            templateName = s.replace("\"", "").replace("'", "");
                        }
                    }
                } else if (fc.argumentsList instanceof ComplexArguments ca) {
                    if (ca.getArguments() != null && !ca.getArguments().isEmpty()) {
                        Argument first = ca.getArguments().get(0);
                        if (first instanceof PositionalArgument pa && pa.getArg() != null) {
                            templateName = extractTemplateNameFromExpr(pa.getArg());
                        }
                    }
                }
                if (templateName != null) {
                    templatesRendered.add(templateName);
                }
            }
        }
    }

    private String extractTemplateNameFromExpr(PythonExpression expr) {
        if (expr instanceof SimpleVariable sv) {
            String val = sv.getVarName();
            return val.replace("\"", "").replace("'", "");
        }
        return null;
    }

    private boolean isInlineTemplate(String tmpl) {
        String nameNoExt = tmpl.contains(".") ? tmpl.substring(0, tmpl.lastIndexOf('.')) : tmpl;
        String nameWithUnderscore = tmpl.replace(".", "_").replace("-", "_");
        String lowerTmpl = tmpl.toLowerCase();
        String lowerNoExt = nameNoExt.toLowerCase();
        String lowerUnderscore = nameWithUnderscore.toLowerCase();
        for (String varName : inlineTemplateVars) {
            String lowerVar = varName.toLowerCase();
            if (lowerVar.equals(lowerTmpl) || lowerVar.equals(lowerNoExt) || lowerVar.equals(lowerUnderscore)) {
                return true;
            }
        }
        return false;
    }

    private void checkTemplatesExist() {
        for (String tmpl : templatesRendered) {
            if (isInlineTemplate(tmpl)) continue;

            boolean found = false;
            String[] pathsToCheck = {
                    baseDir + File.separator + tmpl,
                    baseDir + File.separator + "templates" + File.separator + tmpl,
                    filePath.substring(0, filePath.lastIndexOf(File.separator) + 1) + "templates" + File.separator + tmpl
            };
            for (String p : pathsToCheck) {
                if (Files.exists(Paths.get(p))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                errors.add(new SemanticError(-1,
                        "Semantic Error : Template '" + tmpl + "' not found. Checked: " + pathsToCheck[0] + ", " + pathsToCheck[1]));
            }
        }
    }

    @Override
    public List<SemanticError> getErrors() {
        return errors;
    }
}
