package semantic;

public class SemanticError {
    public final int line;
    public final String message;
    public String fileName;

    public SemanticError(int line, String message) {
        this.line = line;
        this.message = message;
        this.fileName = null;
    }

    public SemanticError(int line, String message, String fileName) {
        this.line = line;
        this.message = message;
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        String loc = fileName != null ? "[" + fileName + "] " : "";
        if (line < 0) return loc + message;
        return loc + "Line " + line + ": " + message;
    }
}
