package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.ElIfStatement;
import ast.Imported;
import ast.Statement;
import ast.atom.Atom;
import ast.compundStmt.*;
import ast.condition.Condition;
import ast.functionDef.FunctionDefinition;
import ast.functionDef.FunctionParameters;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbolTable.SymbolEntry;
import symbolTable.SymbolTableManager;
import visitor.UniversalPythonVisitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundStatementVisitor extends PythonParserBaseVisitor<CompoundStatement> {

    UniversalPythonVisitor universalVisitor = new UniversalPythonVisitor();
    SymbolTableManager stm = SymbolTableManager.INSTANCE;


    private StatementVisitor sharedStatementVisitor;

    public CompoundStatementVisitor(StatementVisitor statementVisitor) {
        this.sharedStatementVisitor = new StatementVisitor(this);
    }

    private void registerSymbol(String name, String type, Object value) {
        SymbolEntry entry = stm.insert(name);
        if (entry != null) {
            entry.setAttribute("Type", type);
            entry.setAttribute("Value", value);
        }
    }

    @Override
    public CompoundStatement visitAtomExpression(PythonParser.AtomExpressionContext ctx) {
        return new AtomExpressionVisitor().visit(ctx.atom_expr());
    }

    @Override
    public CompoundStatement visitSimpleExpression(PythonParser.SimpleExpressionContext ctx) {
        return new SimpleExpressionVisitor().visit(ctx.simple_expr());
    }

    @Override
    public CompoundStatement visitIfStatement(PythonParser.IfStatementContext ctx) {
        return visit(ctx.if_stmt());
    }

    @Override
    public CompoundStatement visitIfStatementDef(PythonParser.IfStatementDefContext ctx) {
        IfStatement ifStatement = new IfStatement(ctx.getStart().getLine());
        ConditionVisitor conditionVisitor = new ConditionVisitor();
        StatementVisitor statementVisitor = new StatementVisitor();


        Condition condition = conditionVisitor.visit(ctx.condition(0));

        stm.enterScope("If_Block_Line_" + ctx.getStart().getLine());

        Statement statement = statementVisitor.visit(ctx.statement(0));
        stm.exitScope();

        ifStatement.setCondition(condition);
        ifStatement.setStatement(statement);


        int elifCount = ctx.ELIF().size();
        List<ElIfStatement> elIfStatements = new ArrayList<>();
        for (int i = 0; i < elifCount; i++) {
            ElIfStatement elIfStatement = new ElIfStatement(ctx.ELIF(i).getSymbol().getLine());
            Condition elifCond = conditionVisitor.visit(ctx.condition(i + 1));

            stm.enterScope("Elif_Block_Line_" + ctx.ELIF(i).getSymbol().getLine());
            Statement elifStmt = statementVisitor.visit(ctx.statement(i + 1));
            stm.exitScope();

            elIfStatement.setCondition(elifCond);
            elIfStatement.setStatement(elifStmt);
            elIfStatements.add(elIfStatement);
        }
        ifStatement.setElifStatements(elIfStatements);


        if (ctx.ELSE() != null) {
            int elseStmtIndex = ctx.statement().size() - 1;
            stm.enterScope("Else_Block_Line_" + ctx.ELSE().getSymbol().getLine());
            Statement elseStmt = statementVisitor.visit(ctx.statement(elseStmtIndex));
            stm.exitScope();
            ifStatement.setElseStatement(elseStmt);
        }

        return ifStatement;
    }

    @Override
    public CompoundStatement visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx) {

        return new AssignmentStatementVisitor().visit(ctx.assign_stmt());
    }

    @Override
    public CompoundStatement visitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx) {
        return visit(ctx.func_def());
    }

    @Override
    public CompoundStatement visitFunctionDefDef(PythonParser.FunctionDefDefContext ctx) {
        FunctionDefinition functionDefinition = new FunctionDefinition(ctx.getStart().getLine());
        String funcName = ctx.NAME().getText();

        registerSymbol(funcName, "Function", "Defined at line " + ctx.getStart().getLine());
        functionDefinition.setFunctionName(funcName);

        stm.enterScope("Function_Scope_" + funcName);


        if (ctx.parameters() != null) {
            var paramsContext = ctx.parameters().getChild(1);

            if (paramsContext instanceof PythonParser.PositionalParamsContext) {
                PythonParser.PositionalParamsContext positional = (PythonParser.PositionalParamsContext) paramsContext;
                for (org.antlr.v4.runtime.tree.TerminalNode param : positional.NAME()) {
                    registerSymbol(param.getText(), "Parameter", "Positional");
                }
            }
            else if (paramsContext instanceof PythonParser.KeywordParamsContext) {
                PythonParser.KeywordParamsContext keyword = (PythonParser.KeywordParamsContext) paramsContext;
                for (org.antlr.v4.runtime.tree.TerminalNode param : keyword.NAME()) {
                    registerSymbol(param.getText(), "Parameter", "Keyword");
                }
            }
        }

        FunctionParameters functionParameters = (FunctionParameters) universalVisitor.visit(ctx.parameters());
        System.out.println("Entering Function: " + funcName + " | Current Scope Before Exit: " + stm.toString());
        Statement statement = new StatementVisitor().visit(ctx.statement());
        System.out.println("Exiting Function: " + funcName + " | Current Scope Before Exit: " + stm.toString());
        stm.exitScope();

        functionDefinition.setFunctionParameters(functionParameters);
        functionDefinition.setFunctionBody(statement);

        return functionDefinition;
    }

    @Override
    public CompoundStatement visitReturnStatement(PythonParser.ReturnStatementContext ctx) {
        return new ReturnStatementVisitor().visit(ctx.return_stmt());
    }

    @Override
    public CompoundStatement visitImportStatement(PythonParser.ImportStatementContext ctx) {
        return visit(ctx.import_from());
    }
    @Override
    public ImportStatement visitImportFromDef(PythonParser.ImportFromDefContext ctx) {
        ImportStatement importStatement = new ImportStatement(ctx.getStart().getLine());

      StringBuilder moduleBuilder = new StringBuilder();
        List<TerminalNode> names = ctx.NAME();

        int modulePartsCount = names.size() - ctx.imptd().size();
        for (int i = 0; i < modulePartsCount; i++) {
            if (i > 0) moduleBuilder.append(".");
            moduleBuilder.append(names.get(i).getText());
        }
        String module = moduleBuilder.toString();

        List<Imported> importedList = new ArrayList<>();
        for (PythonParser.ImptdContext importedCtx : ctx.imptd()) {
            Imported importedNode = (Imported) universalVisitor.visit(importedCtx);
            importedList.add(importedNode);

            registerSymbol(importedNode.getName(), "Imported", "From " + module);
        }

        importStatement.setImportedList(importedList);
        importStatement.setModule(module);
        return importStatement;
    }

    @Override
    public CompoundStatement visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        return (CompoundStatement) universalVisitor.visit(ctx.global_stmt());
    }

    @Override
    public CompoundStatement visitSimpleForLoop(PythonParser.SimpleForLoopContext ctx) {
        ForLoop node = new ForLoop(ctx.getStart().getLine());

        Atom varAtom = new AtomVisitor().visit(ctx.atom());
        PythonExpression iter = new PythonExpressionVisitor().visit(ctx.python_expr());

        node.setVar(varAtom);
        node.setIter(iter);

        stm.enterScope("For_Loop_Line_" + ctx.getStart().getLine());


        String loopVarName = varAtom.symbolTablePrint();
        registerSymbol(loopVarName, "LoopVariable", "Dynamic");


        Statement body = new StatementVisitor().visit(ctx.statement());
        node.statement = body;

        stm.exitScope();

        return node;
    }
}