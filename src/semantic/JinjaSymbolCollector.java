package semantic;

import ast.HtmlContent;
import ast.htmlContentItem.HtmlContentItem;
import ast.htmlElement.TagElement;
import ast.htmlElement.StyleSheet;
import ast.jinja.jinjaCallExpr.*;
import ast.jinja.jinjaExpression.*;
import ast.jinja.jinjaStatment.*;
import ast.tagContent.TagElementItem;
import symbolTable.*;

import java.util.*;

public class JinjaSymbolCollector {

    private Scope rootScope;
    private Scope currentScope;
    private final Map<String, Integer> readVars = new LinkedHashMap<>();
    private final Map<String, Integer> loopVars = new LinkedHashMap<>();
    private final Map<String, Integer> blocks = new LinkedHashMap<>();
    private String extendsTemplate = null;
    private int extendsLine = -1;

    public void analyze(HtmlContent htmlContent) {
        rootScope = new Scope(null, ScopeType.TEMPLATE, -1);
        currentScope = rootScope;

        if (htmlContent != null && htmlContent.items != null) {
            for (HtmlContentItem item : htmlContent.items) {
                traverseItem(item);
            }
        }
    }

    private void traverseItem(HtmlContentItem item) {
        if (item == null) return;

        if (item instanceof TagElement tag) {
            if (tag.tags != null) {
                for (TagElementItem attr : tag.tags) {
                    if (attr == null) continue;
                }
            }
        } else if (item instanceof StyleSheet) {
            // no jinja vars in raw CSS
        } else if (item instanceof JinjaBlockStatement jbs) {
            blocks.putIfAbsent(jbs.blockName, jbs.line_number);

            Scope previous = currentScope;
            currentScope = new Scope(currentScope, ScopeType.JINJA_BLOCK, jbs.line_number);

            if (jbs.htmlContent != null && jbs.htmlContent.items != null) {
                for (HtmlContentItem child : jbs.htmlContent.items) {
                    traverseItem(child);
                }
            }

            currentScope = previous;
        } else if (item instanceof JinjaIfStatement jis) {
            collectVariablesFromExpr(jis.condition);
            if (jis.htmlContent != null && jis.htmlContent.items != null) {
                for (HtmlContentItem child : jis.htmlContent.items) {
                    traverseItem(child);
                }
            }
            if (jis.elifConditions != null) {
                for (int ei = 0; ei < jis.elifConditions.size(); ei++) {
                    collectVariablesFromExpr(jis.elifConditions.get(ei));
                    if (ei < jis.elifBodies.size() && jis.elifBodies.get(ei) != null) {
                        for (HtmlContentItem child : jis.elifBodies.get(ei).items) {
                            traverseItem(child);
                        }
                    }
                }
            }
            if (jis.elseBody != null && jis.elseBody.items != null) {
                for (HtmlContentItem child : jis.elseBody.items) {
                    traverseItem(child);
                }
            }
        } else if (item instanceof JinjaForStatement jfs) {
            if (jfs.ids != null) {
                for (String id : jfs.ids) {
                    loopVars.putIfAbsent(id, jfs.line_number);
                }
            }

            Scope previous = currentScope;
            currentScope = new Scope(currentScope, ScopeType.JINJA_FOR, jfs.line_number);
            if (jfs.ids != null) {
                for (String id : jfs.ids) {
                    currentScope.define(id, SymbolKind.LOOP_VAR, jfs.line_number);
                }
            }

            collectVariablesFromExpr(jfs.iterable);
            if (jfs.htmlContent != null && jfs.htmlContent.items != null) {
                for (HtmlContentItem child : jfs.htmlContent.items) {
                    traverseItem(child);
                }
            }

            currentScope = previous;
        } else if (item instanceof JinjaExtendStatement jes) {
            extendsTemplate = jes.extended;
            extendsLine = jes.line_number;
        } else if (item instanceof JinjaSimpleExpression jse) {
            collectVariablesFromCallExpr(jse.expr);
        } else if (item instanceof JinjaBinaryExpression jbe) {
            collectVariablesFromCallExpr(jbe.left);
            collectVariablesFromCallExpr(jbe.right);
        }
    }

    private void collectVariablesFromExpr(JinjaExpression expr) {
        if (expr == null) return;
        if (expr instanceof JinjaSimpleExpression jse) {
            collectVariablesFromCallExpr(jse.expr);
        } else if (expr instanceof JinjaBinaryExpression jbe) {
            collectVariablesFromCallExpr(jbe.left);
            collectVariablesFromCallExpr(jbe.right);
        }
    }

    private void collectVariablesFromCallExpr(JinjaCallExpression expr) {
        if (expr == null) return;
        if (expr instanceof JinjaVariableAccess jva) {
            if (jva.dottedName != null && !jva.dottedName.isEmpty()) {
                String baseVar = jva.dottedName.contains(".")
                        ? jva.dottedName.substring(0, jva.dottedName.indexOf('.'))
                        : jva.dottedName;
                readVars.putIfAbsent(jva.dottedName, jva.line_number);

                if (currentScope != null) {
                    Symbol existing = currentScope.resolve(baseVar);
                    if (existing == null) {
                        currentScope.define(baseVar, SymbolKind.TEMPLATE_VAR, jva.line_number);
                    }
                }
            }
        } else if (expr instanceof JinjaFilteredExpression jfe) {
            if (jfe.jinjaVariableAccess != null && jfe.jinjaVariableAccess.dottedName != null) {
                String dotted = jfe.jinjaVariableAccess.dottedName;
                readVars.putIfAbsent(dotted, jfe.jinjaVariableAccess.line_number);

                String baseVar = dotted.contains(".")
                        ? dotted.substring(0, dotted.indexOf('.'))
                        : dotted;
                if (currentScope != null) {
                    Symbol existing = currentScope.resolve(baseVar);
                    if (existing == null) {
                        currentScope.define(baseVar, SymbolKind.TEMPLATE_VAR, jfe.jinjaVariableAccess.line_number);
                    }
                }
            }
        } else if (expr instanceof JinjaFunctionCall jfc) {
            if (jfc.argumentsList != null && jfc.argumentsList.arguments != null) {
                for (var arg : jfc.argumentsList.arguments) {
                    if (arg != null && arg.argument != null) {
                        collectVariablesFromExpr(arg.argument);
                    }
                }
            }
        }
    }

    public Scope getRootScope() {
        return rootScope;
    }

    public Map<String, Integer> getReadVars() {
        return readVars;
    }

    public Map<String, Integer> getLoopVars() {
        return loopVars;
    }

    public Map<String, Integer> getBlocks() {
        return blocks;
    }

    public String getExtendsTemplate() {
        return extendsTemplate != null ? extendsTemplate.replaceAll("^['\"]+|['\"]+$", "") : null;
    }

    public void printTable() {
        System.out.println("========== JINJA SYMBOL TABLE (SCOPE-BASED) ==========");

        if (extendsTemplate != null) {
            System.out.println("\n--- Template Extends ---");
            String display = extendsTemplate.replaceAll("^['\"]+|['\"]+$", "");
            System.out.println("  Line " + extendsLine + ": extends \"" + display + "\"");
        }

        if (!blocks.isEmpty()) {
            System.out.println("\n--- Blocks ---");
            for (var e : blocks.entrySet()) {
                System.out.println("  Line " + e.getValue() + ": " + e.getKey());
            }
        }

        if (!loopVars.isEmpty()) {
            System.out.println("\n--- Loop Variables ---");
            for (var e : loopVars.entrySet()) {
                System.out.println("  Line " + e.getValue() + ": " + e.getKey());
            }
        }

        if (!readVars.isEmpty()) {
            System.out.println("\n--- Variables Referenced ---");
            for (var e : readVars.entrySet()) {
                System.out.println("  Line " + e.getValue() + ": " + e.getKey());
            }
        }

        if (rootScope != null) {
            System.out.println("\n--- Scope Tree ---");
            printScope(rootScope, 0);
        }

        if (extendsTemplate == null && blocks.isEmpty() && loopVars.isEmpty() && readVars.isEmpty()) {
            System.out.println("  (no Jinja symbols found)");
        }

        System.out.println();
    }

    private void printScope(Scope scope, int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + scope.toString());
        for (Symbol sym : scope.getSymbolsInScope()) {
            System.out.println(indent + "  " + sym);
        }
        for (Scope child : scope.children) {
            printScope(child, level + 1);
        }
    }
}
