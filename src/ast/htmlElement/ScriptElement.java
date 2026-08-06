package ast.htmlElement;

public class ScriptElement extends HtmlElement {
    public String content;
    public String openTag;

    public ScriptElement(int line_number) {
        super("ScriptElement", line_number);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setOpenTag(String openTag) {
        this.openTag = openTag;
    }

    @Override
    public String toString() {
        return super.toString() + (content != null ? " ( " + content + " ) " : "");
    }
}
