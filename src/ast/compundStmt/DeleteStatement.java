package ast.compundStmt;

import ast.atomExpression.AtomExpression;

public class DeleteStatement extends CompoundStatement {
    private AtomExpression target;

    public DeleteStatement(int line_number) {
        super("DeleteStatement", line_number);
    }

    public void setTarget(AtomExpression target) {
        this.target = target;
    }

    public AtomExpression getTarget() {
        return target;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ( target: ");
        if (target != null) sb.append(target.toString());
        sb.append(" )");
        return sb.toString();
    }
}
