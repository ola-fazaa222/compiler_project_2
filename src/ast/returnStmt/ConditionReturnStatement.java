package ast.returnStmt;

import ast.condition.Condition;

public class ConditionReturnStatement extends ReturnStatement {
    public Condition condition;

    public ConditionReturnStatement(int line_number) {
        super("ConditionReturnStatement", line_number);
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String symbolTablePrint() {
        return "return " + (condition != null ? condition.symbolTablePrint() : "None");
    }

    @Override
    public String toString() {
        return super.toString() + " ( return " + (condition != null ? condition.toString() : "None") + " ) ";
    }
}
