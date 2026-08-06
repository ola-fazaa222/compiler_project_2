package ast.jinja.jinjaStatment;

import ast.Consts;
import ast.HtmlContent;
import ast.jinja.jinjaExpression.JinjaExpression;

import java.util.ArrayList;
import java.util.List;

public class JinjaIfStatement extends JinjaStatement {
    public JinjaExpression condition;
    public HtmlContent htmlContent;
    public List<JinjaExpression> elifConditions;
    public List<HtmlContent> elifBodies;
    public HtmlContent elseBody;

    public JinjaIfStatement(int line_number) {
        super("JinjaIfStatement", line_number);
        this.elifConditions = new ArrayList<>();
        this.elifBodies = new ArrayList<>();
    }

    public void setCondition(JinjaExpression condition) {
        this.condition = condition;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void addElif(JinjaExpression cond, HtmlContent body) {
        this.elifConditions.add(cond);
        this.elifBodies.add(body);
    }

    public void setElseBody(HtmlContent elseBody) {
        this.elseBody = elseBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ( ").append(condition != null ? condition.toString() : "?").append(" ) ");
        if (htmlContent != null) sb.append(Consts.printIndent(3)).append(htmlContent.toString());
        for (int i = 0; i < elifConditions.size(); i++) {
            sb.append(Consts.printIndent(3)).append("elif ").append(elifConditions.get(i).toString());
            if (elifBodies.get(i) != null) sb.append(Consts.printIndent(3)).append(elifBodies.get(i).toString());
        }
        if (elseBody != null) {
            sb.append(Consts.printIndent(3)).append("else");
            sb.append(Consts.printIndent(3)).append(elseBody.toString());
        }
        return sb.toString();
    }
}

