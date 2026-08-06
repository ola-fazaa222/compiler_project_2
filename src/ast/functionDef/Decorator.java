package ast.functionDef;

import ast.ASTNode;
import ast.argsList.ArgumentsList;

public class Decorator extends ASTNode {
    private String decoratorName;
    private ArgumentsList arguments;

    public Decorator(int line_number) {
        super("Decorator", line_number);
    }

    public void setDecoratorName(String decoratorName) {
        this.decoratorName = decoratorName;
    }

    public void setArguments(ArgumentsList arguments) {
        this.arguments = arguments;
    }

    public String getDecoratorName() {
        return decoratorName;
    }

    public ArgumentsList getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return super.toString() + " ( @" + decoratorName + (arguments == null ? "" : "( " + arguments.toString() + ")") + " ";
    }
}
