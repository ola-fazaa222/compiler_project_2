package ast.compundStmt;

import ast.Statement;

import java.util.List;

public class TryStatement extends CompoundStatement {
    private Statement tryBody;
    private List<ExceptClause> exceptClauses;
    private Statement elseBody;
    private Statement finallyBody;

    public TryStatement(int line_number) {
        super("TryStatement", line_number);
    }

    public void setTryBody(Statement tryBody) { this.tryBody = tryBody; }
    public Statement getTryBody() { return tryBody; }

    public void setExceptClauses(List<ExceptClause> exceptClauses) { this.exceptClauses = exceptClauses; }
    public List<ExceptClause> getExceptClauses() { return exceptClauses; }

    public void setElseBody(Statement elseBody) { this.elseBody = elseBody; }
    public Statement getElseBody() { return elseBody; }

    public void setFinallyBody(Statement finallyBody) { this.finallyBody = finallyBody; }
    public Statement getFinallyBody() { return finallyBody; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ( try: ");
        if (tryBody != null) sb.append(tryBody.toString());
        sb.append(" )");
        return sb.toString();
    }
}
