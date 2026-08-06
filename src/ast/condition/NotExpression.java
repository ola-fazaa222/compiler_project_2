package ast.condition;

import ast.Consts;

public class NotExpression extends Condition {
    public Condition condition;

    public NotExpression(int line_number) {
        super("NotExpression", line_number);
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String symbolTablePrint() {
        return "not " + (condition != null ? condition.symbolTablePrint() : "None");
    }

    @Override
    public String toString() {
        return super.toString() + Consts.printIndent(1) +
                (condition != null ? condition.toString() : "None");
    }
}
