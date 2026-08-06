package ast.returnStmt;

import ast.atom.Atom;

public class SimpleReturnStatement extends ReturnStatement {
    private Atom atom;
    public SimpleReturnStatement(int line_number) {
        super("SimpleReturnStatement", line_number);
    }

    public void setAtom(Atom atom) {
        this.atom = atom;
    }

    public Atom getAtom() {
        return atom;
    }

    @Override
    public String toString() {
        return super.toString() + atom.toString();
    }
}
