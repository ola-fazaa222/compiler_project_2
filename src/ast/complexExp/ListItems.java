package ast.complexExp;

import ast.atomExpression.AtomExpression;

import java.util.List;

public class ListItems extends ComplexExpression {
    private List<AtomExpression> items;

    public ListItems(int line_number) {
        super("ExpressionList", line_number);
    }

    public void setItems(List<AtomExpression> items) {
        this.items = items;
    }

    public List<AtomExpression> getItems() {
        return items;
    }
}
