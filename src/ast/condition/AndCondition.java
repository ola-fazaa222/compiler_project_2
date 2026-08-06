package ast.condition;

import ast.Consts;

public class AndCondition extends Condition {
    public Condition left;
    public Condition right;

    public AndCondition(int line_number) {
        super("AndCondition", line_number);
    }

    public void setLeft(Condition left) { this.left = left; }
    public Condition getLeft() { return left; }

    public void setRight(Condition right) { this.right = right; }
    public Condition getRight() { return right; }

    @Override
    public String symbolTablePrint() {
        return (left != null ? left.symbolTablePrint() : "None") + " and " +
               (right != null ? right.symbolTablePrint() : "None");
    }

    @Override
    public String toString() {
        return super.toString() + Consts.printIndent(1) +
               (left != null ? left.toString() : "None") +
               Consts.printIndent(1) + "and" +
               Consts.printIndent(1) +
               (right != null ? right.toString() : "None");
    }
}
