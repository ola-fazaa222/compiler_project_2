package ast.jinja.jinjaCallExpr;

import ast.jinja.JinjaArgumentsList;

public class JinjaFilteredExpression extends JinjaCallExpression{
    public JinjaVariableAccess jinjaVariableAccess;
    public String filterName;
    public JinjaArgumentsList filterArgs;
    public String rawAtomValue;
    public JinjaFilteredExpression( int line_number) {
        super("JinjaFilteredExpression", line_number);
    }

    public void setJinjaVariableAccess(JinjaVariableAccess jinjaVariableAccess) {
        this.jinjaVariableAccess = jinjaVariableAccess;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    public void setFilterArgs(JinjaArgumentsList filterArgs) {
        this.filterArgs = filterArgs;
    }

    public void setRawAtomValue(String rawAtomValue) {
        this.rawAtomValue = rawAtomValue;
    }

    @Override
    public String toString() {
        return super.toString() + " ( " + (jinjaVariableAccess != null ? jinjaVariableAccess.toString() : (rawAtomValue != null ? rawAtomValue : "?"))
                + (filterName != null ? (" | " + filterName) : "")
                + (filterArgs != null ? ("(" + filterArgs.toString() + ")") : "") + " ) ";
    }
}
