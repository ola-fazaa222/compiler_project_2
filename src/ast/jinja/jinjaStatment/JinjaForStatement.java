package ast.jinja.jinjaStatment;

import ast.Consts;
import ast.HtmlContent;
import ast.jinja.jinjaExpression.JinjaExpression;

import java.util.List;

public class JinjaForStatement extends JinjaStatement {
    public List<String> ids;
    public HtmlContent htmlContent;
    public JinjaExpression iterable;

    public JinjaForStatement(int line_number) {
        super("JinjaForStatement", line_number);
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void setIterable(JinjaExpression iterable) {
        this.iterable = iterable;
    }

    @Override
    public String toString() {
        return super.toString() + " ( " +
                (ids != null ? String.join(", ", ids) : "?") +
                " in " + (iterable != null ? iterable.toString() : "?") + " ) " +
                (htmlContent != null ? Consts.printIndent(3) + htmlContent.toString() : "");
    }
}
