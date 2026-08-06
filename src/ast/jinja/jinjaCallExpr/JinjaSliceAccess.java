package ast.jinja.jinjaCallExpr;

public class JinjaSliceAccess extends JinjaCallExpression {
    public JinjaVariableAccess baseVariable;
    public String sliceStart;
    public String sliceEnd;
    public String sliceStep;

    public JinjaSliceAccess(int line_number) {
        super("JinjaSliceAccess", line_number);
    }

    public void setBaseVariable(JinjaVariableAccess baseVariable) {
        this.baseVariable = baseVariable;
    }

    public void setSliceStart(String sliceStart) {
        this.sliceStart = sliceStart;
    }

    public void setSliceEnd(String sliceEnd) {
        this.sliceEnd = sliceEnd;
    }

    public void setSliceStep(String sliceStep) {
        this.sliceStep = sliceStep;
    }
}
