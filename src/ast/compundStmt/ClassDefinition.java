package ast.compundStmt;

import ast.Consts;
import ast.Statement;
import ast.argsList.ArgumentsList;
import ast.functionDef.Decorator;

import java.util.List;

public class ClassDefinition extends CompoundStatement {
    public String className;
    public ArgumentsList baseClasses;
    public Statement classBody;
    public List<Decorator> decorators;

    public ClassDefinition(int line_number) {
        super("ClassDefinition", line_number);
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setBaseClasses(ArgumentsList baseClasses) {
        this.baseClasses = baseClasses;
    }

    public void setClassBody(Statement classBody) {
        this.classBody = classBody;
    }

    public void setDecorators(List<Decorator> decorators) {
        this.decorators = decorators;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("( ");
        if (decorators != null) {
            for (Decorator d : decorators) {
                sb.append(d.toString()).append(" ");
            }
        }
        sb.append("class ").append(className);
        if (baseClasses != null) {
            sb.append("(").append(baseClasses.toString()).append(")");
        }
        sb.append(" )");
        if (classBody != null && classBody.compoundStatements != null) {
            for (CompoundStatement cs : classBody.compoundStatements) {
                sb.append(Consts.printIndent(2)).append(cs.toString());
            }
        }
        return sb.toString();
    }
}
