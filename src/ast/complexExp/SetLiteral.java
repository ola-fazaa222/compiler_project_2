package ast.complexExp;

import ast.atomExpression.AtomExpression;

import java.util.List;

public class SetLiteral extends ComplexExpression {
    public List<AtomExpression> items;

    public SetLiteral(int line_number) {
        super("SetLiteral", line_number);
    }

    public void setItems(List<AtomExpression> items) { this.items = items; }
    public List<AtomExpression> getItems() { return items; }

    @Override
    public String symbolTablePrint() {
        StringBuilder sb = new StringBuilder("{");
        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(items.get(i) != null ? items.get(i).symbolTablePrint() : "");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                if (i > 0) sb.append(", ");
                sb.append(items.get(i) != null ? items.get(i).toString() : "");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
