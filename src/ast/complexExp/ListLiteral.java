package ast.complexExp;

import ast.atomExpression.AtomExpression;

import java.util.List;

public class ListLiteral extends ComplexExpression {
    public List<AtomExpression> listItems;

    public ListLiteral(int line_number) {
        super("ListLiteral", line_number);
    }

    public void setListItems(List<AtomExpression> listItems) {
        this.listItems = listItems;
    }

    @Override
    public String symbolTablePrint() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" [ ");
        if (listItems != null) {
            for (int i = 0; i < listItems.size(); i++) {
                stringBuilder.append(listItems.get(i).toString());
                if (i < listItems.size() - 1) stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ] ");

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString()).append(" ( [ ");
        if (listItems != null) {
            for (int i = 0; i < listItems.size(); i++) {
                stringBuilder.append(listItems.get(i).toString());
                if (i < listItems.size() - 1) stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ] ) ");

        return stringBuilder.toString();
    }
}
