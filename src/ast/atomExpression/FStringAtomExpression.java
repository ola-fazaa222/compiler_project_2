package ast.atomExpression;

public class FStringAtomExpression extends AtomExpression {
    private String rawValue;

    public FStringAtomExpression(int line_number, String rawValue) {
        super("FStringAtomExpression", line_number);
        this.rawValue = rawValue;
    }

    public String getRawValue() {
        return rawValue;
    }

    @Override
    public String getVarName() {
        return null;
    }

    @Override
    public String symbolTablePrint() {
        return " ( f-string ) ";
    }

    @Override
    public String toString() {
        return super.toString() + " ( f\"" + rawValue + "\" ) ";
    }
}
