package ast.condition;

import ast.Consts;

public class OrCondition extends Condition {
    public Condition left;
    public Condition right;

    public OrCondition(int line_number) {
        super("OrCondition", line_number);
    }

    public void setLeft(Condition left) { this.left = left; }
    public Condition getLeft() { return left; }

    public void setRight(Condition right) { this.right = right; }
    public Condition getRight() { return right; }

    @Override
    public String symbolTablePrint() {
        return (left != null ? left.symbolTablePrint() : "None") + " or " +
               (right != null ? right.symbolTablePrint() : "None");
    }

    @Override
    public String toString() {
        return super.toString() + Consts.printIndent(1) +
               (left != null ? left.toString() : "None") +
               Consts.printIndent(1) + "or" +
               Consts.printIndent(1) +
               (right != null ? right.toString() : "None");
    }
}
