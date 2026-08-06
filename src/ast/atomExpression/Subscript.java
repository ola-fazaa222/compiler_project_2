package ast.atomExpression;

import ast.atom.Atom;

public class Subscript extends AtomExpression {
    private AtomExpression target;
    private String index;

    public Subscript(int line_number) {
        super("Subscript", line_number);
    }

    public void setTarget(AtomExpression target) { this.target = target; }
    public AtomExpression getTarget() { return target; }

    public void setIndex(String index) { this.index = index; }
    public String getIndex() { return index; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ( ");
        if (target != null) sb.append(target.toString());
        sb.append(" [ ").append(index).append(" ] )");
        return sb.toString();
    }
}
