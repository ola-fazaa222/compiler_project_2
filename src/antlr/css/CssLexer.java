// Generated from /home/ghifar/Downloads/Telegram Desktop/compiler/psychic-broccoli-main/grammars/CssLexer.g4 by ANTLR 4.13.2
package antlr.css;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSS_LBRACE=1, CSS_RBRACE=2, CSS_LPAREN=3, CSS_RPAREN=4, CSS_COLON=5, CSS_SEMI=6, 
		CSS_COMMA=7, CSS_DOT=8, CSS_GT=9, CSS_HASH=10, CSS_HEX_COLOR=11, CSS_NUMBER=12, 
		CSS_UNIT=13, CSS_STRING=14, CSS_ID=15, CSS_Space=16, CSS_Comment=17, CSS_TILDE=18, 
		CSS_UNIVERSAL=19, CSS_AT=20, CSS_MINUS=21, CSS_IMPORTANT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CSS_LBRACE", "CSS_RBRACE", "CSS_LPAREN", "CSS_RPAREN", "CSS_COLON", 
			"CSS_SEMI", "CSS_COMMA", "CSS_DOT", "CSS_GT", "CSS_HASH", "CSS_HEX_COLOR", 
			"CSS_NUMBER", "CSS_UNIT", "CSS_STRING", "CSS_ID", "CSS_Space", "CSS_Comment", 
			"CSS_TILDE", "CSS_UNIVERSAL", "CSS_AT", "CSS_MINUS", "CSS_IMPORTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "':'", "';'", "','", "'.'", "'>'", 
			"'#'", null, null, null, null, null, null, null, "'~'", "'*'", "'@'", 
			"'-'", "'!important'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CSS_LBRACE", "CSS_RBRACE", "CSS_LPAREN", "CSS_RPAREN", "CSS_COLON", 
			"CSS_SEMI", "CSS_COMMA", "CSS_DOT", "CSS_GT", "CSS_HASH", "CSS_HEX_COLOR", 
			"CSS_NUMBER", "CSS_UNIT", "CSS_STRING", "CSS_ID", "CSS_Space", "CSS_Comment", 
			"CSS_TILDE", "CSS_UNIVERSAL", "CSS_AT", "CSS_MINUS", "CSS_IMPORTANT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CssLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CssLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u00af\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0004"+
		"\nF\b\n\u000b\n\f\nG\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bM"+
		"\b\u000b\n\u000b\f\u000bP\t\u000b\u0003\u000bR\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000bV\b\u000b\u000b\u000b\f\u000bW\u0003\u000bZ\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\fm\b\f\u0001\r\u0001\r\u0005\rq\b\r\n\r\f\rt\t\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\ry\b\r\n\r\f\r|\t\r\u0001\r\u0003\r\u007f\b\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0083\b\u000e\n\u000e\f\u000e\u0086\t\u000e\u0001\u000f"+
		"\u0004\u000f\u0089\b\u000f\u000b\u000f\f\u000f\u008a\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0093"+
		"\b\u0010\n\u0010\f\u0010\u0096\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0094\u0000\u0016\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\b"+
		"\u0003\u000009AFaf\u0001\u000019\u0001\u000009\u0001\u0000\"\"\u0001\u0000"+
		"\'\'\u0002\u0000AZaz\u0004\u0000--09AZaz\u0003\u0000\t\n\r\r  \u00c1\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/"+
		"\u0001\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00073\u0001\u0000"+
		"\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000"+
		"\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000\u0011=\u0001"+
		"\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015A\u0001\u0000\u0000"+
		"\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019l\u0001\u0000\u0000\u0000\u001b"+
		"~\u0001\u0000\u0000\u0000\u001d\u0080\u0001\u0000\u0000\u0000\u001f\u0088"+
		"\u0001\u0000\u0000\u0000!\u008e\u0001\u0000\u0000\u0000#\u009c\u0001\u0000"+
		"\u0000\u0000%\u009e\u0001\u0000\u0000\u0000\'\u00a0\u0001\u0000\u0000"+
		"\u0000)\u00a2\u0001\u0000\u0000\u0000+\u00a4\u0001\u0000\u0000\u0000-"+
		".\u0005{\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005}\u0000\u0000"+
		"0\u0004\u0001\u0000\u0000\u000012\u0005(\u0000\u00002\u0006\u0001\u0000"+
		"\u0000\u000034\u0005)\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005:"+
		"\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005;\u0000\u00008\f\u0001"+
		"\u0000\u0000\u00009:\u0005,\u0000\u0000:\u000e\u0001\u0000\u0000\u0000"+
		";<\u0005.\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005>\u0000\u0000"+
		">\u0012\u0001\u0000\u0000\u0000?@\u0005#\u0000\u0000@\u0014\u0001\u0000"+
		"\u0000\u0000AE\u0005#\u0000\u0000BC\u0007\u0000\u0000\u0000CD\u0007\u0000"+
		"\u0000\u0000DF\u0007\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"H\u0016\u0001\u0000\u0000\u0000IR\u00050\u0000\u0000JN\u0007\u0001\u0000"+
		"\u0000KM\u0007\u0002\u0000\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QI\u0001\u0000\u0000\u0000"+
		"QJ\u0001\u0000\u0000\u0000RY\u0001\u0000\u0000\u0000SU\u0005.\u0000\u0000"+
		"TV\u0007\u0002\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000"+
		"\u0000\u0000YS\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0018"+
		"\u0001\u0000\u0000\u0000[\\\u0005p\u0000\u0000\\m\u0005x\u0000\u0000]"+
		"^\u0005f\u0000\u0000^m\u0005r\u0000\u0000_m\u0005%\u0000\u0000`a\u0005"+
		"e\u0000\u0000am\u0005m\u0000\u0000bc\u0005v\u0000\u0000cm\u0005h\u0000"+
		"\u0000de\u0005v\u0000\u0000em\u0005w\u0000\u0000fg\u0005r\u0000\u0000"+
		"gh\u0005e\u0000\u0000hm\u0005m\u0000\u0000im\u0005s\u0000\u0000jk\u0005"+
		"m\u0000\u0000km\u0005s\u0000\u0000l[\u0001\u0000\u0000\u0000l]\u0001\u0000"+
		"\u0000\u0000l_\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000lb\u0001"+
		"\u0000\u0000\u0000ld\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000"+
		"li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000m\u001a\u0001\u0000"+
		"\u0000\u0000nr\u0005\"\u0000\u0000oq\b\u0003\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"u\u007f\u0005\"\u0000\u0000vz\u0005\'\u0000\u0000wy\b\u0004\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}\u007f\u0005\'\u0000\u0000~n\u0001\u0000\u0000\u0000~v\u0001"+
		"\u0000\u0000\u0000\u007f\u001c\u0001\u0000\u0000\u0000\u0080\u0084\u0007"+
		"\u0005\u0000\u0000\u0081\u0083\u0007\u0006\u0000\u0000\u0082\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u001e\u0001"+
		"\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u0007"+
		"\u0007\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0006"+
		"\u000f\u0000\u0000\u008d \u0001\u0000\u0000\u0000\u008e\u008f\u0005/\u0000"+
		"\u0000\u008f\u0090\u0005*\u0000\u0000\u0090\u0094\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\t\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005*\u0000\u0000\u0098\u0099"+
		"\u0005/\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0006"+
		"\u0010\u0000\u0000\u009b\"\u0001\u0000\u0000\u0000\u009c\u009d\u0005~"+
		"\u0000\u0000\u009d$\u0001\u0000\u0000\u0000\u009e\u009f\u0005*\u0000\u0000"+
		"\u009f&\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005@\u0000\u0000\u00a1("+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005-\u0000\u0000\u00a3*\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005!\u0000\u0000\u00a5\u00a6\u0005i\u0000\u0000"+
		"\u00a6\u00a7\u0005m\u0000\u0000\u00a7\u00a8\u0005p\u0000\u0000\u00a8\u00a9"+
		"\u0005o\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005t"+
		"\u0000\u0000\u00ab\u00ac\u0005a\u0000\u0000\u00ac\u00ad\u0005n\u0000\u0000"+
		"\u00ad\u00ae\u0005t\u0000\u0000\u00ae,\u0001\u0000\u0000\u0000\r\u0000"+
		"GNQWYlrz~\u0084\u008a\u0094\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}