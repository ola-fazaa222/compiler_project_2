package ast.jinja.jinjaStatment;

import ast.Consts;
import ast.HtmlContent;
import ast.jinja.jinjaExpression.JinjaExpression;

public class JinjaWithStatement extends JinjaStatement {
    public String varName;
    public JinjaExpression valueExpr;
    public HtmlContent htmlContent;

    public JinjaWithStatement(int line_number) {
        super("JinjaWithStatement", line_number);
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public void setValueExpr(JinjaExpression valueExpr) {
        this.valueExpr = valueExpr;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public String toString() {
        return super.toString() +
                " ( " + varName + " = " + (valueExpr != null ? valueExpr.toString() : "?") + " ) " +
                (htmlContent != null ? Consts.printIndent(3) + htmlContent.toString() : "");
    }
}
