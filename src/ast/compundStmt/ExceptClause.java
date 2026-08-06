package ast.compundStmt;

import ast.Statement;
import ast.atom.Atom;

public class ExceptClause {
    private Atom exceptionType;
    private String alias;
    private Statement body;

    public ExceptClause() {}

    public void setExceptionType(Atom exceptionType) { this.exceptionType = exceptionType; }
    public Atom getExceptionType() { return exceptionType; }

    public void setAlias(String alias) { this.alias = alias; }
    public String getAlias() { return alias; }

    public void setBody(Statement body) { this.body = body; }
    public Statement getBody() { return body; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExceptClause ( ");
        if (exceptionType != null) sb.append("type: ").append(exceptionType.getValue());
        if (alias != null) sb.append(" as ").append(alias);
        if (body != null) sb.append(" body: ").append(body.toString());
        sb.append(" )");
        return sb.toString();
    }
}
