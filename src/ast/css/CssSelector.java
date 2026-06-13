package ast.css;

import ast.ASTNode;
import ast.Consts;

import java.util.ArrayList;
import java.util.List;

public class CssSelector extends ASTNode {
    // 1. Element Name (Type Selector, e.g., "div")
    public String elementName;

    // 2. ID Selector (e.g., "main"). Note: A selector should only have one ID.
    public String id;

    // 3. Class Selectors (e.g., ["active", "large"])
    public List<String> classes;

    public CssSelector(int line_number) {
        super("CssSelector", line_number);
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String toSelectorString() {
        StringBuilder sb = new StringBuilder();
        if (elementName != null && !elementName.isEmpty()) {
            sb.append(elementName);
        }
        if (id != null && !id.isEmpty()) {
            sb.append("#").append(id);
        }
        if (classes != null && !classes.isEmpty()) {
            for (String className : classes) {
                sb.append(".").append(className);
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(Consts.printIndent(7));
        sb.append(toSelectorString());
        return sb.toString();
    }
}
