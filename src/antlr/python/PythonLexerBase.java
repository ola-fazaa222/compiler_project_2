package antlr.python;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import java.util.*;

public abstract class PythonLexerBase extends Lexer {

    private int indentLevel;
    private final Queue<Token> pendingTokens = new LinkedList<>();
    private boolean atStartOfInput;
    private int bracketDepth;

    public PythonLexerBase(CharStream input) {
        super(input);
        this.atStartOfInput = true;
    }

    public boolean atStartOfInput() {
        return atStartOfInput;
    }

    private Token createToken(int type, String text) {
        TokenFactory factory = getTokenFactory();
        return factory.create(new Pair<TokenSource, CharStream>(this, _input), type, text, Token.DEFAULT_CHANNEL, -1, -1, -1, -1);
    }

    public void onNewLine() {
        atStartOfInput = false;
        if (bracketDepth > 0) {
            skip();
            return;
        }

        int spaces = getCurrentSpaces();
        int newIndentLevel = spaces / 4;

        // If the next character is a newline, the next line is blank.
        // Skip indent changes for blank lines.
        int nextChar = _input.LA(1);
        if (nextChar == '\n' || nextChar == '\r' || nextChar == '\f') {
            return;
        }

        if (newIndentLevel > indentLevel) {
            pendingTokens.add(createToken(PythonParser.INDENT, ""));
            indentLevel++;
        } else if (newIndentLevel < indentLevel) {
            while (indentLevel > newIndentLevel) {
                pendingTokens.add(createToken(PythonParser.DEDENT, ""));
                indentLevel--;
            }
        }
    }

    private int getCurrentSpaces() {
        String text = getText();
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                count++;
            } else if (c == '\t') {
                count += 4;
            }
        }
        return count;
    }

    public void openParen() {
        bracketDepth++;
        emit(createToken(PythonParser.LP, "("));
    }

    public void closeParen() {
        bracketDepth--;
        emit(createToken(PythonParser.RP, ")"));
    }

    public void openBracket() {
        bracketDepth++;
        emit(createToken(PythonParser.LBRACK, "["));
    }

    public void closeBracket() {
        bracketDepth--;
        emit(createToken(PythonParser.RBRACK, "]"));
    }

    public void openBrace() {
        bracketDepth++;
        emit(createToken(PythonParser.LKBRACE, "{"));
    }

    public void closeBrace() {
        bracketDepth--;
        emit(createToken(PythonParser.RKBRACE, "}"));
    }

    @Override
    public Token nextToken() {
        if (!pendingTokens.isEmpty()) {
            return pendingTokens.poll();
        }
        Token next = super.nextToken();
        if (next.getType() == Token.EOF) {
            // On first EOF, emit DEDENTs for all remaining open blocks before actual EOF
            boolean emittedDedent = false;
            while (indentLevel > 0) {
                pendingTokens.add(createToken(PythonParser.DEDENT, ""));
                indentLevel--;
                emittedDedent = true;
            }
            if (emittedDedent) {
                return pendingTokens.poll();
            }
        } else {
            atStartOfInput = false;
        }
        return next;
    }
}
