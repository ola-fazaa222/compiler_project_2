package antlr.jinja;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import java.util.*;

public abstract class JinjaFlaskLexerBase extends Lexer {

    private int indentLevel;
    private final Queue<Token> pendingTokens = new LinkedList<>();
    private boolean atStartOfInput;
    private int bracketDepth;

    public JinjaFlaskLexerBase(CharStream input) {
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

        int nextChar = _input.LA(1);
        if (nextChar == '\n' || nextChar == '\r' || nextChar == '\f') {
            return;
        }

        if (newIndentLevel > indentLevel) {
            pendingTokens.add(createToken(JinjaFlaskParser.INDENT, ""));
            indentLevel++;
        } else if (newIndentLevel < indentLevel) {
            while (indentLevel > newIndentLevel) {
                pendingTokens.add(createToken(JinjaFlaskParser.DEDENT, ""));
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

    public void openBrace() {
        bracketDepth++;
        emit(createToken(JinjaFlaskParser.LKBRACE, "{"));
    }

    public void closeBrace() {
        bracketDepth--;
        emit(createToken(JinjaFlaskParser.RKBRACE, "}"));
    }

    @Override
    public Token nextToken() {
        if (!pendingTokens.isEmpty()) {
            return pendingTokens.poll();
        }
        Token next = super.nextToken();
        if (next.getType() == Token.EOF) {
            boolean emittedDedent = false;
            while (indentLevel > 0) {
                pendingTokens.add(createToken(JinjaFlaskParser.DEDENT, ""));
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
