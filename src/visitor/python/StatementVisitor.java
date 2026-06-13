package visitor.python;

import antlr.python.PythonParser;
import antlr.python.PythonParserBaseVisitor;
import ast.Statement;
import ast.compundStmt.CompoundStatement;

import java.util.ArrayList;
import java.util.List;
public class StatementVisitor extends PythonParserBaseVisitor<Statement> {

    private CompoundStatementVisitor compoundStatementVisitor;

    public StatementVisitor(CompoundStatementVisitor compoundStatementVisitor) {
        this.compoundStatementVisitor = compoundStatementVisitor;
    }

    public StatementVisitor() {
        this.compoundStatementVisitor = new CompoundStatementVisitor(this);
    }

    @Override
    public Statement visitCompoundStatement(PythonParser.CompoundStatementContext ctx) {
        Statement statement = new Statement(ctx.getStart().getLine());
        List<CompoundStatement> compoundStatementList = new ArrayList<>();

        for (PythonParser.Compound_stmtContext stmtCtx : ctx.compound_stmt()) {
            compoundStatementList.add(compoundStatementVisitor.visit(stmtCtx));
        }

        statement.setCompoundStatements(compoundStatementList);
        return statement;
    }
    @Override
    public Statement visitPassStatement(PythonParser.PassStatementContext ctx) {
        Statement statement = new Statement(ctx.getStart().getLine());
        statement.setPass(true);
        return statement;
    }
}
