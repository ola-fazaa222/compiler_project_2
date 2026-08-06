// Generated from /home/ghifar/Downloads/Telegram Desktop/compiler/psychic-broccoli-main/grammars/HtmlParser.g4 by ANTLR 4.13.2
package antlr.html;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HtmlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JINJA_EXPR_START=1, JINJA_STMT_START=2, JINJA_COMMENT_START=3, HTML_COMMENT=4, 
		HTML_CONDITIONAL_COMMENT=5, XML_DECLARATION=6, CDATA=7, DTD=8, SCRIPTLET=9, 
		SEA_WS=10, STYLE_OPEN=11, SCRIPT_OPEN=12, TAG_OPEN=13, HTML_TEXT=14, TAG_CLOSE=15, 
		TAG_SLASH_CLOSE=16, TAG_SLASH=17, TAG_EQUALS=18, TAG_NAME=19, TAG_WHITESPACE=20, 
		ATTVALUE_VALUE=21, STYLE_CLOSE=22, CSS_LBRACE=23, CSS_RBRACE=24, CSS_LPAREN=25, 
		CSS_RPAREN=26, CSS_COLON=27, CSS_SEMI=28, CSS_COMMA=29, CSS_DOT=30, CSS_GT=31, 
		CSS_HASH=32, CSS_HEX_COLOR=33, CSS_NUMBER=34, CSS_UNIT=35, CSS_STRING=36, 
		CSS_ID=37, CSS_Space=38, CSS_Comment=39, CSS_TILDE=40, CSS_UNIVERSAL=41, 
		CSS_AT=42, CSS_MINUS=43, CSS_IMPORTANT=44, SCRIPT_CLOSE=45, SCRIPT_CONTENT=46, 
		JINJA_EXPR_END=47, JINJA_STMT_END=48, J_EXTENDS=49, J_BLOCK=50, J_ENDBLOCK=51, 
		J_FOR=52, J_ENDFOR=53, J_IF=54, J_ELIF=55, J_ELSE=56, J_ENDIF=57, J_IN=58, 
		J_WITH=59, J_ENDWITH=60, J_LENGTH=61, J_OR=62, J_AND=63, J_NOT=64, J_IS=65, 
		J_FILTER=66, J_TRUE=67, J_FALSE=68, J_NONE=69, J_LPAREN=70, J_RPAREN=71, 
		J_LBRACK=72, J_RBRACK=73, J_COMMA=74, J_DOT=75, J_COLON=76, J_PIPE=77, 
		J_EQ=78, J_NEQ=79, J_GT=80, J_LT=81, J_ASSIGN=82, J_NUMBER=83, J_STRING=84, 
		J_NAME=85, J_WS=86;
	public static final int
		RULE_html_content = 0, RULE_html_content_item = 1, RULE_htmlElement = 2, 
		RULE_tag_content = 3, RULE_style_sheet = 4, RULE_ruleSet = 5, RULE_selector_decl = 6, 
		RULE_css_selector_list = 7, RULE_css_selector = 8, RULE_declarationList = 9, 
		RULE_declaration = 10, RULE_css_value = 11, RULE_css_function_args = 12, 
		RULE_css_function_call = 13, RULE_cssterm = 14, RULE_css_at_rule = 15, 
		RULE_css_at_rule_body = 16, RULE_jinjaStatementBlock = 17, RULE_jinjaExpressionBlock = 18, 
		RULE_jStatement = 19, RULE_j_with_stmt = 20, RULE_j_extends_stmt = 21, 
		RULE_j_block_stmt = 22, RULE_j_for_stmt = 23, RULE_j_if_stmt = 24, RULE_j_expression = 25, 
		RULE_j_call_expr = 26, RULE_j_slice = 27, RULE_j_var_access = 28, RULE_j_argument_list = 29, 
		RULE_j_argument = 30, RULE_j_atom = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"html_content", "html_content_item", "htmlElement", "tag_content", "style_sheet", 
			"ruleSet", "selector_decl", "css_selector_list", "css_selector", "declarationList", 
			"declaration", "css_value", "css_function_args", "css_function_call", 
			"cssterm", "css_at_rule", "css_at_rule_body", "jinjaStatementBlock", 
			"jinjaExpressionBlock", "jStatement", "j_with_stmt", "j_extends_stmt", 
			"j_block_stmt", "j_for_stmt", "j_if_stmt", "j_expression", "j_call_expr", 
			"j_slice", "j_var_access", "j_argument_list", "j_argument", "j_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'{%'", "'{#'", null, null, null, null, null, null, null, 
			null, null, null, null, null, "'/>'", "'/'", null, null, null, null, 
			null, "'{'", "'}'", null, null, null, "';'", null, null, null, "'#'", 
			null, null, null, null, null, null, null, "'~'", "'*'", "'@'", "'-'", 
			"'!important'", null, null, "'}}'", "'%}'", "'extends'", "'block'", "'endblock'", 
			"'for'", "'endfor'", "'if'", "'elif'", "'else'", "'endif'", "'in'", "'with'", 
			"'endwith'", "'length'", "'or'", "'and'", "'not'", "'is'", "'filter'", 
			"'true'", "'false'", "'none'", null, null, "'['", "']'", null, null, 
			null, "'|'", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_COMMENT_START", 
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
			"DTD", "SCRIPTLET", "SEA_WS", "STYLE_OPEN", "SCRIPT_OPEN", "TAG_OPEN", 
			"HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", 
			"TAG_NAME", "TAG_WHITESPACE", "ATTVALUE_VALUE", "STYLE_CLOSE", "CSS_LBRACE", 
			"CSS_RBRACE", "CSS_LPAREN", "CSS_RPAREN", "CSS_COLON", "CSS_SEMI", "CSS_COMMA", 
			"CSS_DOT", "CSS_GT", "CSS_HASH", "CSS_HEX_COLOR", "CSS_NUMBER", "CSS_UNIT", 
			"CSS_STRING", "CSS_ID", "CSS_Space", "CSS_Comment", "CSS_TILDE", "CSS_UNIVERSAL", 
			"CSS_AT", "CSS_MINUS", "CSS_IMPORTANT", "SCRIPT_CLOSE", "SCRIPT_CONTENT", 
			"JINJA_EXPR_END", "JINJA_STMT_END", "J_EXTENDS", "J_BLOCK", "J_ENDBLOCK", 
			"J_FOR", "J_ENDFOR", "J_IF", "J_ELIF", "J_ELSE", "J_ENDIF", "J_IN", "J_WITH", 
			"J_ENDWITH", "J_LENGTH", "J_OR", "J_AND", "J_NOT", "J_IS", "J_FILTER", 
			"J_TRUE", "J_FALSE", "J_NONE", "J_LPAREN", "J_RPAREN", "J_LBRACK", "J_RBRACK", 
			"J_COMMA", "J_DOT", "J_COLON", "J_PIPE", "J_EQ", "J_NEQ", "J_GT", "J_LT", 
			"J_ASSIGN", "J_NUMBER", "J_STRING", "J_NAME", "J_WS"
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

	@Override
	public String getGrammarFileName() { return "HtmlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_contentContext extends ParserRuleContext {
		public Html_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_content; }
	 
		public Html_contentContext() { }
		public void copyFrom(Html_contentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends Html_contentContext {
		public List<Html_content_itemContext> html_content_item() {
			return getRuleContexts(Html_content_itemContext.class);
		}
		public Html_content_itemContext html_content_item(int i) {
			return getRuleContext(Html_content_itemContext.class,i);
		}
		public HtmlContentContext(Html_contentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_html_content);
		try {
			int _alt;
			_localctx = new HtmlContentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					html_content_item();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Html_content_itemContext extends ParserRuleContext {
		public Html_content_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_content_item; }
	 
		public Html_content_itemContext() { }
		public void copyFrom(Html_content_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtItemContext extends Html_content_itemContext {
		public JinjaStatementBlockContext jinjaStatementBlock() {
			return getRuleContext(JinjaStatementBlockContext.class,0);
		}
		public JinjaStmtItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaStmtItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprItemContext extends Html_content_itemContext {
		public JinjaExpressionBlockContext jinjaExpressionBlock() {
			return getRuleContext(JinjaExpressionBlockContext.class,0);
		}
		public JinjaExprItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaExprItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementItemContext extends Html_content_itemContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtmlElementItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextItemContext extends Html_content_itemContext {
		public TerminalNode HTML_TEXT() { return getToken(HtmlParser.HTML_TEXT, 0); }
		public HtmlTextItemContext(Html_content_itemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtmlTextItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_content_itemContext html_content_item() throws RecognitionException {
		Html_content_itemContext _localctx = new Html_content_itemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html_content_item);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STYLE_OPEN:
			case SCRIPT_OPEN:
			case TAG_OPEN:
				_localctx = new HtmlElementItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				htmlElement();
				}
				break;
			case HTML_TEXT:
				_localctx = new HtmlTextItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(HTML_TEXT);
				}
				break;
			case JINJA_STMT_START:
				_localctx = new JinjaStmtItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				jinjaStatementBlock();
				}
				break;
			case JINJA_EXPR_START:
				_localctx = new JinjaExprItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				jinjaExpressionBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptElementContext extends HtmlElementContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HtmlParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(HtmlParser.SCRIPT_CLOSE, 0); }
		public TerminalNode SCRIPT_CONTENT() { return getToken(HtmlParser.SCRIPT_CONTENT, 0); }
		public ScriptElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitScriptElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagElementContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HtmlParser.TAG_OPEN, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HtmlParser.TAG_SLASH_CLOSE, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(HtmlParser.TAG_CLOSE, 0); }
		public List<Tag_contentContext> tag_content() {
			return getRuleContexts(Tag_contentContext.class);
		}
		public Tag_contentContext tag_content(int i) {
			return getRuleContext(Tag_contentContext.class,i);
		}
		public TagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends HtmlElementContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlParser.STYLE_OPEN, 0); }
		public Style_sheetContext style_sheet() {
			return getRuleContext(Style_sheetContext.class,0);
		}
		public TerminalNode STYLE_CLOSE() { return getToken(HtmlParser.STYLE_CLOSE, 0); }
		public StyleElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new TagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(TAG_OPEN);
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(77);
						tag_content();
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==TAG_CLOSE || _la==TAG_SLASH_CLOSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STYLE_OPEN:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(STYLE_OPEN);
				setState(85);
				style_sheet();
				setState(86);
				match(STYLE_CLOSE);
				}
				break;
			case SCRIPT_OPEN:
				_localctx = new ScriptElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(SCRIPT_OPEN);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCRIPT_CONTENT) {
					{
					setState(89);
					match(SCRIPT_CONTENT);
					}
				}

				setState(92);
				match(SCRIPT_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tag_contentContext extends ParserRuleContext {
		public Tag_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_content; }
	 
		public Tag_contentContext() { }
		public void copyFrom(Tag_contentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClosingMarkerContext extends Tag_contentContext {
		public TerminalNode TAG_SLASH() { return getToken(HtmlParser.TAG_SLASH, 0); }
		public ClosingMarkerContext(Tag_contentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitClosingMarker(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends Tag_contentContext {
		public TerminalNode TAG_NAME() { return getToken(HtmlParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HtmlParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HtmlParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(Tag_contentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_contentContext tag_content() throws RecognitionException {
		Tag_contentContext _localctx = new Tag_contentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag_content);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				_localctx = new HtmlAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(TAG_NAME);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(96);
					match(TAG_EQUALS);
					setState(97);
					match(ATTVALUE_VALUE);
					}
				}

				}
				break;
			case TAG_SLASH:
				_localctx = new ClosingMarkerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(TAG_SLASH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Style_sheetContext extends ParserRuleContext {
		public Style_sheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_sheet; }
	 
		public Style_sheetContext() { }
		public void copyFrom(Style_sheetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleSheetContext extends Style_sheetContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public List<Css_at_ruleContext> css_at_rule() {
			return getRuleContexts(Css_at_ruleContext.class);
		}
		public Css_at_ruleContext css_at_rule(int i) {
			return getRuleContext(Css_at_ruleContext.class,i);
		}
		public StyleSheetContext(Style_sheetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitStyleSheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_sheetContext style_sheet() throws RecognitionException {
		Style_sheetContext _localctx = new Style_sheetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_style_sheet);
		int _la;
		try {
			_localctx = new StyleSheetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6735582461952L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_DOT:
				case CSS_ID:
				case CSS_UNIVERSAL:
					{
					setState(103);
					ruleSet();
					}
					break;
				case CSS_AT:
					{
					setState(104);
					css_at_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetContext extends ParserRuleContext {
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
	 
		public RuleSetContext() { }
		public void copyFrom(RuleSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends RuleSetContext {
		public Selector_declContext selector_decl() {
			return getRuleContext(Selector_declContext.class,0);
		}
		public TerminalNode CSS_LBRACE() { return getToken(HtmlParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(HtmlParser.CSS_RBRACE, 0); }
		public CssRuleContext(RuleSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruleSet);
		try {
			_localctx = new CssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			selector_decl();
			setState(111);
			match(CSS_LBRACE);
			setState(112);
			declarationList();
			setState(113);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Selector_declContext extends ParserRuleContext {
		public Selector_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_decl; }
	 
		public Selector_declContext() { }
		public void copyFrom(Selector_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorDeclarationContext extends Selector_declContext {
		public List<Css_selector_listContext> css_selector_list() {
			return getRuleContexts(Css_selector_listContext.class);
		}
		public Css_selector_listContext css_selector_list(int i) {
			return getRuleContext(Css_selector_listContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(HtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(HtmlParser.CSS_COMMA, i);
		}
		public CssSelectorDeclarationContext(Selector_declContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssSelectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_declContext selector_decl() throws RecognitionException {
		Selector_declContext _localctx = new Selector_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selector_decl);
		int _la;
		try {
			_localctx = new CssSelectorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			css_selector_list();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(116);
				match(CSS_COMMA);
				setState(117);
				css_selector_list();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_selector_listContext extends ParserRuleContext {
		public Css_selector_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_selector_list; }
	 
		public Css_selector_listContext() { }
		public void copyFrom(Css_selector_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssSelectorListContext extends Css_selector_listContext {
		public List<Css_selectorContext> css_selector() {
			return getRuleContexts(Css_selectorContext.class);
		}
		public Css_selectorContext css_selector(int i) {
			return getRuleContext(Css_selectorContext.class,i);
		}
		public List<TerminalNode> CSS_GT() { return getTokens(HtmlParser.CSS_GT); }
		public TerminalNode CSS_GT(int i) {
			return getToken(HtmlParser.CSS_GT, i);
		}
		public CssSelectorListContext(Css_selector_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssSelectorList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDescendantSelectorContext extends Css_selector_listContext {
		public List<Css_selectorContext> css_selector() {
			return getRuleContexts(Css_selectorContext.class);
		}
		public Css_selectorContext css_selector(int i) {
			return getRuleContext(Css_selectorContext.class,i);
		}
		public CssDescendantSelectorContext(Css_selector_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssDescendantSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selector_listContext css_selector_list() throws RecognitionException {
		Css_selector_listContext _localctx = new Css_selector_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_css_selector_list);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new CssSelectorListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				css_selector();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_GT) {
					{
					{
					setState(124);
					match(CSS_GT);
					setState(125);
					css_selector();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new CssDescendantSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				css_selector();
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(132);
					css_selector();
					}
					}
					setState(135); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2337535950848L) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_selectorContext extends ParserRuleContext {
		public Css_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_selector; }
	 
		public Css_selectorContext() { }
		public void copyFrom(Css_selectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UniversalSelectorContext extends Css_selectorContext {
		public TerminalNode CSS_UNIVERSAL() { return getToken(HtmlParser.CSS_UNIVERSAL, 0); }
		public List<TerminalNode> CSS_COLON() { return getTokens(HtmlParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(HtmlParser.CSS_COLON, i);
		}
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public UniversalSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_DOT() { return getTokens(HtmlParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(HtmlParser.CSS_DOT, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(HtmlParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(HtmlParser.CSS_COLON, i);
		}
		public QualifiedSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitQualifiedSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneSimpleSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_DOT() { return getTokens(HtmlParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(HtmlParser.CSS_DOT, i);
		}
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(HtmlParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(HtmlParser.CSS_COLON, i);
		}
		public StandaloneSimpleSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitStandaloneSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAndIdSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_HASH() { return getTokens(HtmlParser.CSS_HASH); }
		public TerminalNode CSS_HASH(int i) {
			return getToken(HtmlParser.CSS_HASH, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(HtmlParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(HtmlParser.CSS_COLON, i);
		}
		public TypeAndIdSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitTypeAndIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(HtmlParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(HtmlParser.CSS_COLON, i);
		}
		public TypeSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selectorContext css_selector() throws RecognitionException {
		Css_selectorContext _localctx = new Css_selectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_css_selector);
		int _la;
		try {
			int _alt;
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new QualifiedSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(CSS_ID);
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(140);
						match(CSS_DOT);
						setState(141);
						match(CSS_ID);
						}
						} 
					}
					setState(146);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(147);
						match(CSS_COLON);
						setState(148);
						match(CSS_ID);
						}
						} 
					}
					setState(153);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COLON) {
					{
					{
					setState(154);
					match(CSS_COLON);
					setState(155);
					match(CSS_COLON);
					setState(156);
					match(CSS_ID);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new StandaloneSimpleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						match(CSS_DOT);
						setState(163);
						match(CSS_ID);
						setState(165);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
						case 1:
							{
							setState(164);
							match(CSS_ID);
							}
							break;
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(169); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						match(CSS_COLON);
						setState(172);
						match(CSS_ID);
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COLON) {
					{
					{
					setState(178);
					match(CSS_COLON);
					setState(179);
					match(CSS_COLON);
					setState(180);
					match(CSS_ID);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new TypeAndIdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				match(CSS_ID);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_HASH) {
					{
					{
					setState(187);
					match(CSS_HASH);
					setState(188);
					match(CSS_ID);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						match(CSS_COLON);
						setState(195);
						match(CSS_ID);
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COLON) {
					{
					{
					setState(201);
					match(CSS_COLON);
					setState(202);
					match(CSS_COLON);
					setState(203);
					match(CSS_ID);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new UniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(CSS_UNIVERSAL);
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(210);
					match(CSS_COLON);
					setState(211);
					match(CSS_ID);
					}
					break;
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_COLON) {
					{
					setState(214);
					match(CSS_COLON);
					setState(215);
					match(CSS_COLON);
					setState(216);
					match(CSS_ID);
					}
				}

				}
				break;
			case 5:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				match(CSS_ID);
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(220);
						match(CSS_COLON);
						setState(221);
						match(CSS_ID);
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_COLON) {
					{
					setState(227);
					match(CSS_COLON);
					setState(228);
					match(CSS_COLON);
					setState(229);
					match(CSS_ID);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	 
		public DeclarationListContext() { }
		public void copyFrom(DeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationBlockContext extends DeclarationListContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationBlockContext(DeclarationListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationList);
		int _la;
		try {
			_localctx = new DeclarationBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(234);
				declaration();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssDeclarationContext extends DeclarationContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public TerminalNode CSS_COLON() { return getToken(HtmlParser.CSS_COLON, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(HtmlParser.CSS_SEMI, 0); }
		public TerminalNode CSS_IMPORTANT() { return getToken(HtmlParser.CSS_IMPORTANT, 0); }
		public CssDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(CSS_ID);
			setState(241);
			match(CSS_COLON);
			setState(242);
			css_value();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_IMPORTANT) {
				{
				setState(243);
				match(CSS_IMPORTANT);
				}
			}

			setState(246);
			match(CSS_SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_valueContext extends ParserRuleContext {
		public List<CsstermContext> cssterm() {
			return getRuleContexts(CsstermContext.class);
		}
		public CsstermContext cssterm(int i) {
			return getRuleContext(CsstermContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(HtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(HtmlParser.CSS_COMMA, i);
		}
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCss_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_css_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				cssterm();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9028021256192L) != 0) );
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(253);
				match(CSS_COMMA);
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					cssterm();
					}
					}
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9028021256192L) != 0) );
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_function_argsContext extends ParserRuleContext {
		public Css_function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_function_args; }
	 
		public Css_function_argsContext() { }
		public void copyFrom(Css_function_argsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgumentsContext extends Css_function_argsContext {
		public List<CsstermContext> cssterm() {
			return getRuleContexts(CsstermContext.class);
		}
		public CsstermContext cssterm(int i) {
			return getRuleContext(CsstermContext.class,i);
		}
		public List<TerminalNode> CSS_COMMA() { return getTokens(HtmlParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(HtmlParser.CSS_COMMA, i);
		}
		public FunctionArgumentsContext(Css_function_argsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_function_argsContext css_function_args() throws RecognitionException {
		Css_function_argsContext _localctx = new Css_function_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_css_function_args);
		int _la;
		try {
			_localctx = new FunctionArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(264);
				cssterm();
				}
				}
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9028021256192L) != 0) );
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(269);
				match(CSS_COMMA);
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270);
					cssterm();
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 9028021256192L) != 0) );
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_function_callContext extends ParserRuleContext {
		public Css_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_function_call; }
	 
		public Css_function_callContext() { }
		public void copyFrom(Css_function_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssFunctionCallContext extends Css_function_callContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(HtmlParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(HtmlParser.CSS_RPAREN, 0); }
		public Css_function_argsContext css_function_args() {
			return getRuleContext(Css_function_argsContext.class,0);
		}
		public CssFunctionCallContext(Css_function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_function_callContext css_function_call() throws RecognitionException {
		Css_function_callContext _localctx = new Css_function_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_css_function_call);
		int _la;
		try {
			_localctx = new CssFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(CSS_ID);
			setState(281);
			match(CSS_LPAREN);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9028021256192L) != 0)) {
				{
				setState(282);
				css_function_args();
				}
			}

			setState(285);
			match(CSS_RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CsstermContext extends ParserRuleContext {
		public CsstermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssterm; }
	 
		public CsstermContext() { }
		public void copyFrom(CsstermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTermContext extends CsstermContext {
		public Css_function_callContext css_function_call() {
			return getRuleContext(Css_function_callContext.class,0);
		}
		public FunctionTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitFunctionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTermContext extends CsstermContext {
		public TerminalNode CSS_STRING() { return getToken(HtmlParser.CSS_STRING, 0); }
		public StringTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitStringTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(HtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_MINUS() { return getToken(HtmlParser.CSS_MINUS, 0); }
		public NumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitNumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(HtmlParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(HtmlParser.CSS_UNIT, 0); }
		public TerminalNode CSS_MINUS() { return getToken(HtmlParser.CSS_MINUS, 0); }
		public UnitNumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitUnitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorTermContext extends CsstermContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(HtmlParser.CSS_HEX_COLOR, 0); }
		public ColorTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitColorTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTermContext extends CsstermContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public IdentifierTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitIdentifierTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsstermContext cssterm() throws RecognitionException {
		CsstermContext _localctx = new CsstermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cssterm);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new FunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				css_function_call();
				}
				break;
			case 2:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(CSS_STRING);
				}
				break;
			case 3:
				_localctx = new ColorTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(CSS_HEX_COLOR);
				}
				break;
			case 4:
				_localctx = new UnitNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_MINUS) {
					{
					setState(290);
					match(CSS_MINUS);
					}
				}

				setState(293);
				match(CSS_NUMBER);
				setState(294);
				match(CSS_UNIT);
				}
				break;
			case 5:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_MINUS) {
					{
					setState(295);
					match(CSS_MINUS);
					}
				}

				setState(298);
				match(CSS_NUMBER);
				}
				break;
			case 6:
				_localctx = new IdentifierTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(299);
				match(CSS_ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_at_ruleContext extends ParserRuleContext {
		public Css_at_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_at_rule; }
	 
		public Css_at_ruleContext() { }
		public void copyFrom(Css_at_ruleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAtKeyframesContext extends Css_at_ruleContext {
		public TerminalNode CSS_AT() { return getToken(HtmlParser.CSS_AT, 0); }
		public List<TerminalNode> CSS_ID() { return getTokens(HtmlParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(HtmlParser.CSS_ID, i);
		}
		public TerminalNode CSS_LBRACE() { return getToken(HtmlParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(HtmlParser.CSS_RBRACE, 0); }
		public List<Css_at_rule_bodyContext> css_at_rule_body() {
			return getRuleContexts(Css_at_rule_bodyContext.class);
		}
		public Css_at_rule_bodyContext css_at_rule_body(int i) {
			return getRuleContext(Css_at_rule_bodyContext.class,i);
		}
		public CssAtKeyframesContext(Css_at_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssAtKeyframes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_at_ruleContext css_at_rule() throws RecognitionException {
		Css_at_ruleContext _localctx = new Css_at_ruleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_css_at_rule);
		int _la;
		try {
			_localctx = new CssAtKeyframesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CSS_AT);
			setState(303);
			match(CSS_ID);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_ID) {
				{
				setState(304);
				match(CSS_ID);
				}
			}

			setState(307);
			match(CSS_LBRACE);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(308);
				css_at_rule_body();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Css_at_rule_bodyContext extends ParserRuleContext {
		public Css_at_rule_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_at_rule_body; }
	 
		public Css_at_rule_bodyContext() { }
		public void copyFrom(Css_at_rule_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAtKeyframeBlockContext extends Css_at_rule_bodyContext {
		public TerminalNode CSS_ID() { return getToken(HtmlParser.CSS_ID, 0); }
		public TerminalNode CSS_LBRACE() { return getToken(HtmlParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(HtmlParser.CSS_RBRACE, 0); }
		public CssAtKeyframeBlockContext(Css_at_rule_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitCssAtKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_at_rule_bodyContext css_at_rule_body() throws RecognitionException {
		Css_at_rule_bodyContext _localctx = new Css_at_rule_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_css_at_rule_body);
		try {
			_localctx = new CssAtKeyframeBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(CSS_ID);
			setState(317);
			match(CSS_LBRACE);
			setState(318);
			declarationList();
			setState(319);
			match(CSS_RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementBlockContext extends ParserRuleContext {
		public JinjaStatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatementBlock; }
	 
		public JinjaStatementBlockContext() { }
		public void copyFrom(JinjaStatementBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtBlockContext extends JinjaStatementBlockContext {
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public JStatementContext jStatement() {
			return getRuleContext(JStatementContext.class,0);
		}
		public JinjaStmtBlockContext(JinjaStatementBlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaStmtBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementBlockContext jinjaStatementBlock() throws RecognitionException {
		JinjaStatementBlockContext _localctx = new JinjaStatementBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaStatementBlock);
		try {
			_localctx = new JinjaStmtBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(JINJA_STMT_START);
			setState(322);
			jStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionBlockContext extends ParserRuleContext {
		public JinjaExpressionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpressionBlock; }
	 
		public JinjaExpressionBlockContext() { }
		public void copyFrom(JinjaExpressionBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprBlockContext extends JinjaExpressionBlockContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(HtmlParser.JINJA_EXPR_START, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(HtmlParser.JINJA_EXPR_END, 0); }
		public JinjaExprBlockContext(JinjaExpressionBlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaExprBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionBlockContext jinjaExpressionBlock() throws RecognitionException {
		JinjaExpressionBlockContext _localctx = new JinjaExpressionBlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinjaExpressionBlock);
		try {
			_localctx = new JinjaExprBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(JINJA_EXPR_START);
			setState(325);
			j_expression();
			setState(326);
			match(JINJA_EXPR_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JStatementContext extends ParserRuleContext {
		public JStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jStatement; }
	 
		public JStatementContext() { }
		public void copyFrom(JStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForStmtContext extends JStatementContext {
		public J_for_stmtContext j_for_stmt() {
			return getRuleContext(J_for_stmtContext.class,0);
		}
		public JinjaForStmtContext(JStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaWithStmtContext extends JStatementContext {
		public J_with_stmtContext j_with_stmt() {
			return getRuleContext(J_with_stmtContext.class,0);
		}
		public JinjaWithStmtContext(JStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaWithStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExtendsStmtContext extends JStatementContext {
		public J_extends_stmtContext j_extends_stmt() {
			return getRuleContext(J_extends_stmtContext.class,0);
		}
		public JinjaExtendsStmtContext(JStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaExtendsStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockStmtContext extends JStatementContext {
		public J_block_stmtContext j_block_stmt() {
			return getRuleContext(J_block_stmtContext.class,0);
		}
		public JinjaBlockStmtContext(JStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfStmtContext extends JStatementContext {
		public J_if_stmtContext j_if_stmt() {
			return getRuleContext(J_if_stmtContext.class,0);
		}
		public JinjaIfStmtContext(JStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JStatementContext jStatement() throws RecognitionException {
		JStatementContext _localctx = new JStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jStatement);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_EXTENDS:
				_localctx = new JinjaExtendsStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				j_extends_stmt();
				}
				break;
			case J_BLOCK:
				_localctx = new JinjaBlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				j_block_stmt();
				}
				break;
			case J_FOR:
				_localctx = new JinjaForStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				j_for_stmt();
				}
				break;
			case J_IF:
				_localctx = new JinjaIfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				j_if_stmt();
				}
				break;
			case J_WITH:
				_localctx = new JinjaWithStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				j_with_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_with_stmtContext extends ParserRuleContext {
		public J_with_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_with_stmt; }
	 
		public J_with_stmtContext() { }
		public void copyFrom(J_with_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaWithStmtDefContext extends J_with_stmtContext {
		public TerminalNode J_WITH() { return getToken(HtmlParser.J_WITH, 0); }
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public TerminalNode J_ASSIGN() { return getToken(HtmlParser.J_ASSIGN, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDWITH() { return getToken(HtmlParser.J_ENDWITH, 0); }
		public JinjaWithStmtDefContext(J_with_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaWithStmtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_with_stmtContext j_with_stmt() throws RecognitionException {
		J_with_stmtContext _localctx = new J_with_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_j_with_stmt);
		try {
			_localctx = new JinjaWithStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(J_WITH);
			setState(336);
			match(J_NAME);
			setState(337);
			match(J_ASSIGN);
			setState(338);
			j_expression();
			setState(339);
			match(JINJA_STMT_END);
			setState(340);
			html_content();
			setState(341);
			match(JINJA_STMT_START);
			setState(342);
			match(J_ENDWITH);
			setState(343);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_extends_stmtContext extends ParserRuleContext {
		public J_extends_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_extends_stmt; }
	 
		public J_extends_stmtContext() { }
		public void copyFrom(J_extends_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExtendsStmtDefContext extends J_extends_stmtContext {
		public TerminalNode J_EXTENDS() { return getToken(HtmlParser.J_EXTENDS, 0); }
		public TerminalNode J_STRING() { return getToken(HtmlParser.J_STRING, 0); }
		public TerminalNode JINJA_STMT_END() { return getToken(HtmlParser.JINJA_STMT_END, 0); }
		public JinjaExtendsStmtDefContext(J_extends_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaExtendsStmtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_extends_stmtContext j_extends_stmt() throws RecognitionException {
		J_extends_stmtContext _localctx = new J_extends_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_j_extends_stmt);
		try {
			_localctx = new JinjaExtendsStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(J_EXTENDS);
			setState(346);
			match(J_STRING);
			setState(347);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_block_stmtContext extends ParserRuleContext {
		public J_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_block_stmt; }
	 
		public J_block_stmtContext() { }
		public void copyFrom(J_block_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockStmtDefContext extends J_block_stmtContext {
		public TerminalNode J_BLOCK() { return getToken(HtmlParser.J_BLOCK, 0); }
		public List<TerminalNode> J_NAME() { return getTokens(HtmlParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(HtmlParser.J_NAME, i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDBLOCK() { return getToken(HtmlParser.J_ENDBLOCK, 0); }
		public JinjaBlockStmtDefContext(J_block_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaBlockStmtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_block_stmtContext j_block_stmt() throws RecognitionException {
		J_block_stmtContext _localctx = new J_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_j_block_stmt);
		int _la;
		try {
			_localctx = new JinjaBlockStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(J_BLOCK);
			setState(350);
			match(J_NAME);
			setState(351);
			match(JINJA_STMT_END);
			setState(352);
			html_content();
			setState(353);
			match(JINJA_STMT_START);
			setState(354);
			match(J_ENDBLOCK);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==J_NAME) {
				{
				setState(355);
				match(J_NAME);
				}
			}

			setState(358);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_for_stmtContext extends ParserRuleContext {
		public J_for_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_for_stmt; }
	 
		public J_for_stmtContext() { }
		public void copyFrom(J_for_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForStmtDefContext extends J_for_stmtContext {
		public TerminalNode J_FOR() { return getToken(HtmlParser.J_FOR, 0); }
		public List<TerminalNode> J_NAME() { return getTokens(HtmlParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(HtmlParser.J_NAME, i);
		}
		public TerminalNode J_IN() { return getToken(HtmlParser.J_IN, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlParser.JINJA_STMT_END, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode JINJA_STMT_START() { return getToken(HtmlParser.JINJA_STMT_START, 0); }
		public TerminalNode J_ENDFOR() { return getToken(HtmlParser.J_ENDFOR, 0); }
		public List<TerminalNode> J_COMMA() { return getTokens(HtmlParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(HtmlParser.J_COMMA, i);
		}
		public JinjaForStmtDefContext(J_for_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaForStmtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_for_stmtContext j_for_stmt() throws RecognitionException {
		J_for_stmtContext _localctx = new J_for_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_j_for_stmt);
		int _la;
		try {
			_localctx = new JinjaForStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(J_FOR);
			setState(361);
			match(J_NAME);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(362);
				match(J_COMMA);
				setState(363);
				match(J_NAME);
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(J_IN);
			setState(370);
			j_expression();
			setState(371);
			match(JINJA_STMT_END);
			setState(372);
			html_content();
			setState(373);
			match(JINJA_STMT_START);
			setState(374);
			match(J_ENDFOR);
			setState(375);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_if_stmtContext extends ParserRuleContext {
		public J_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_if_stmt; }
	 
		public J_if_stmtContext() { }
		public void copyFrom(J_if_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfStmtDefContext extends J_if_stmtContext {
		public TerminalNode J_IF() { return getToken(HtmlParser.J_IF, 0); }
		public List<J_expressionContext> j_expression() {
			return getRuleContexts(J_expressionContext.class);
		}
		public J_expressionContext j_expression(int i) {
			return getRuleContext(J_expressionContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_END() { return getTokens(HtmlParser.JINJA_STMT_END); }
		public TerminalNode JINJA_STMT_END(int i) {
			return getToken(HtmlParser.JINJA_STMT_END, i);
		}
		public List<Html_contentContext> html_content() {
			return getRuleContexts(Html_contentContext.class);
		}
		public Html_contentContext html_content(int i) {
			return getRuleContext(Html_contentContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_START() { return getTokens(HtmlParser.JINJA_STMT_START); }
		public TerminalNode JINJA_STMT_START(int i) {
			return getToken(HtmlParser.JINJA_STMT_START, i);
		}
		public TerminalNode J_ENDIF() { return getToken(HtmlParser.J_ENDIF, 0); }
		public List<TerminalNode> J_ELIF() { return getTokens(HtmlParser.J_ELIF); }
		public TerminalNode J_ELIF(int i) {
			return getToken(HtmlParser.J_ELIF, i);
		}
		public TerminalNode J_ELSE() { return getToken(HtmlParser.J_ELSE, 0); }
		public JinjaIfStmtDefContext(J_if_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaIfStmtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_if_stmtContext j_if_stmt() throws RecognitionException {
		J_if_stmtContext _localctx = new J_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_j_if_stmt);
		try {
			int _alt;
			_localctx = new JinjaIfStmtDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(J_IF);
			setState(378);
			j_expression();
			setState(379);
			match(JINJA_STMT_END);
			setState(380);
			html_content();
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					match(JINJA_STMT_START);
					setState(382);
					match(J_ELIF);
					setState(383);
					j_expression();
					setState(384);
					match(JINJA_STMT_END);
					setState(385);
					html_content();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(392);
				match(JINJA_STMT_START);
				setState(393);
				match(J_ELSE);
				setState(394);
				match(JINJA_STMT_END);
				setState(395);
				html_content();
				}
				break;
			}
			setState(398);
			match(JINJA_STMT_START);
			setState(399);
			match(J_ENDIF);
			setState(400);
			match(JINJA_STMT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_expressionContext extends ParserRuleContext {
		public J_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_expression; }
	 
		public J_expressionContext() { }
		public void copyFrom(J_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSimpleExprContext extends J_expressionContext {
		public J_call_exprContext j_call_expr() {
			return getRuleContext(J_call_exprContext.class,0);
		}
		public JinjaSimpleExprContext(J_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBinaryExprContext extends J_expressionContext {
		public List<J_call_exprContext> j_call_expr() {
			return getRuleContexts(J_call_exprContext.class);
		}
		public J_call_exprContext j_call_expr(int i) {
			return getRuleContext(J_call_exprContext.class,i);
		}
		public TerminalNode J_EQ() { return getToken(HtmlParser.J_EQ, 0); }
		public TerminalNode J_NEQ() { return getToken(HtmlParser.J_NEQ, 0); }
		public TerminalNode J_GT() { return getToken(HtmlParser.J_GT, 0); }
		public TerminalNode J_LT() { return getToken(HtmlParser.J_LT, 0); }
		public JinjaBinaryExprContext(J_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_expressionContext j_expression() throws RecognitionException {
		J_expressionContext _localctx = new J_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_j_expression);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new JinjaBinaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				j_call_expr(0);
				setState(403);
				_la = _input.LA(1);
				if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(404);
				j_call_expr(0);
				}
				break;
			case 2:
				_localctx = new JinjaSimpleExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				j_call_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_call_exprContext extends ParserRuleContext {
		public J_call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_call_expr; }
	 
		public J_call_exprContext() { }
		public void copyFrom(J_call_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarAccessOnlyContext extends J_call_exprContext {
		public J_var_accessContext j_var_access() {
			return getRuleContext(J_var_accessContext.class,0);
		}
		public JinjaVarAccessOnlyContext(J_call_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaVarAccessOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFunctionCallContext extends J_call_exprContext {
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public TerminalNode J_LPAREN() { return getToken(HtmlParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(HtmlParser.J_RPAREN, 0); }
		public J_argument_listContext j_argument_list() {
			return getRuleContext(J_argument_listContext.class,0);
		}
		public JinjaFunctionCallContext(J_call_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaAtomOnlyContext extends J_call_exprContext {
		public J_atomContext j_atom() {
			return getRuleContext(J_atomContext.class,0);
		}
		public JinjaAtomOnlyContext(J_call_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaAtomOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFilteredExprContext extends J_call_exprContext {
		public List<J_call_exprContext> j_call_expr() {
			return getRuleContexts(J_call_exprContext.class);
		}
		public J_call_exprContext j_call_expr(int i) {
			return getRuleContext(J_call_exprContext.class,i);
		}
		public TerminalNode J_PIPE() { return getToken(HtmlParser.J_PIPE, 0); }
		public JinjaFilteredExprContext(J_call_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaFilteredExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaMethodCallContext extends J_call_exprContext {
		public J_var_accessContext j_var_access() {
			return getRuleContext(J_var_accessContext.class,0);
		}
		public TerminalNode J_LPAREN() { return getToken(HtmlParser.J_LPAREN, 0); }
		public TerminalNode J_RPAREN() { return getToken(HtmlParser.J_RPAREN, 0); }
		public J_argument_listContext j_argument_list() {
			return getRuleContext(J_argument_listContext.class,0);
		}
		public JinjaMethodCallContext(J_call_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSliceAccessContext extends J_call_exprContext {
		public J_call_exprContext j_call_expr() {
			return getRuleContext(J_call_exprContext.class,0);
		}
		public TerminalNode J_LBRACK() { return getToken(HtmlParser.J_LBRACK, 0); }
		public TerminalNode J_RBRACK() { return getToken(HtmlParser.J_RBRACK, 0); }
		public J_sliceContext j_slice() {
			return getRuleContext(J_sliceContext.class,0);
		}
		public JinjaSliceAccessContext(J_call_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaSliceAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_call_exprContext j_call_expr() throws RecognitionException {
		return j_call_expr(0);
	}

	private J_call_exprContext j_call_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		J_call_exprContext _localctx = new J_call_exprContext(_ctx, _parentState);
		J_call_exprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_j_call_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new JinjaMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(410);
				j_var_access();
				setState(411);
				match(J_LPAREN);
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 29360577L) != 0)) {
					{
					setState(412);
					j_argument_list();
					}
				}

				setState(415);
				match(J_RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new JinjaFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(417);
				match(J_NAME);
				setState(418);
				match(J_LPAREN);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 29360577L) != 0)) {
					{
					setState(419);
					j_argument_list();
					}
				}

				setState(422);
				match(J_RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new JinjaVarAccessOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(423);
				j_var_access();
				}
				break;
			case 4:
				{
				_localctx = new JinjaAtomOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				j_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new JinjaFilteredExprContext(new J_call_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_j_call_expr);
						setState(427);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(428);
						match(J_PIPE);
						setState(429);
						j_call_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new JinjaSliceAccessContext(new J_call_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_j_call_expr);
						setState(430);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(431);
						match(J_LBRACK);
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 29393345L) != 0)) {
							{
							setState(432);
							j_slice();
							}
						}

						setState(435);
						match(J_RBRACK);
						}
						break;
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_sliceContext extends ParserRuleContext {
		public List<J_expressionContext> j_expression() {
			return getRuleContexts(J_expressionContext.class);
		}
		public J_expressionContext j_expression(int i) {
			return getRuleContext(J_expressionContext.class,i);
		}
		public TerminalNode J_COLON() { return getToken(HtmlParser.J_COLON, 0); }
		public J_sliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_slice; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJ_slice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_sliceContext j_slice() throws RecognitionException {
		J_sliceContext _localctx = new J_sliceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_j_slice);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_LENGTH:
			case J_TRUE:
			case J_FALSE:
			case J_NONE:
			case J_NUMBER:
			case J_STRING:
			case J_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				j_expression();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==J_COLON) {
					{
					setState(442);
					match(J_COLON);
					setState(444);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 29360577L) != 0)) {
						{
						setState(443);
						j_expression();
						}
					}

					}
				}

				}
				break;
			case J_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(J_COLON);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 29360577L) != 0)) {
					{
					setState(449);
					j_expression();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_var_accessContext extends ParserRuleContext {
		public J_var_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_var_access; }
	 
		public J_var_accessContext() { }
		public void copyFrom(J_var_accessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaVarAccessOnlyDefContext extends J_var_accessContext {
		public List<TerminalNode> J_NAME() { return getTokens(HtmlParser.J_NAME); }
		public TerminalNode J_NAME(int i) {
			return getToken(HtmlParser.J_NAME, i);
		}
		public List<TerminalNode> J_LENGTH() { return getTokens(HtmlParser.J_LENGTH); }
		public TerminalNode J_LENGTH(int i) {
			return getToken(HtmlParser.J_LENGTH, i);
		}
		public List<TerminalNode> J_DOT() { return getTokens(HtmlParser.J_DOT); }
		public TerminalNode J_DOT(int i) {
			return getToken(HtmlParser.J_DOT, i);
		}
		public JinjaVarAccessOnlyDefContext(J_var_accessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaVarAccessOnlyDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_var_accessContext j_var_access() throws RecognitionException {
		J_var_accessContext _localctx = new J_var_accessContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_j_var_access);
		int _la;
		try {
			int _alt;
			_localctx = new JinjaVarAccessOnlyDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==J_LENGTH || _la==J_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					match(J_DOT);
					setState(456);
					_la = _input.LA(1);
					if ( !(_la==J_LENGTH || _la==J_NAME) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_argument_listContext extends ParserRuleContext {
		public J_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_argument_list; }
	 
		public J_argument_listContext() { }
		public void copyFrom(J_argument_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaArgListDefContext extends J_argument_listContext {
		public List<J_argumentContext> j_argument() {
			return getRuleContexts(J_argumentContext.class);
		}
		public J_argumentContext j_argument(int i) {
			return getRuleContext(J_argumentContext.class,i);
		}
		public List<TerminalNode> J_COMMA() { return getTokens(HtmlParser.J_COMMA); }
		public TerminalNode J_COMMA(int i) {
			return getToken(HtmlParser.J_COMMA, i);
		}
		public JinjaArgListDefContext(J_argument_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaArgListDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_argument_listContext j_argument_list() throws RecognitionException {
		J_argument_listContext _localctx = new J_argument_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_j_argument_list);
		int _la;
		try {
			_localctx = new JinjaArgListDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			j_argument();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==J_COMMA) {
				{
				{
				setState(463);
				match(J_COMMA);
				setState(464);
				j_argument();
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_argumentContext extends ParserRuleContext {
		public J_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_argument; }
	 
		public J_argumentContext() { }
		public void copyFrom(J_argumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaKwArgContext extends J_argumentContext {
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public TerminalNode J_ASSIGN() { return getToken(HtmlParser.J_ASSIGN, 0); }
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public JinjaKwArgContext(J_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaKwArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaPosArgContext extends J_argumentContext {
		public J_expressionContext j_expression() {
			return getRuleContext(J_expressionContext.class,0);
		}
		public JinjaPosArgContext(J_argumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaPosArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_argumentContext j_argument() throws RecognitionException {
		J_argumentContext _localctx = new J_argumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_j_argument);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new JinjaPosArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				j_expression();
				}
				break;
			case 2:
				_localctx = new JinjaKwArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(J_NAME);
				setState(472);
				match(J_ASSIGN);
				setState(473);
				j_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class J_atomContext extends ParserRuleContext {
		public J_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j_atom; }
	 
		public J_atomContext() { }
		public void copyFrom(J_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNumberAtomContext extends J_atomContext {
		public TerminalNode J_NUMBER() { return getToken(HtmlParser.J_NUMBER, 0); }
		public JinjaNumberAtomContext(J_atomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaTrueAtomContext extends J_atomContext {
		public TerminalNode J_TRUE() { return getToken(HtmlParser.J_TRUE, 0); }
		public JinjaTrueAtomContext(J_atomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFalseAtomContext extends J_atomContext {
		public TerminalNode J_FALSE() { return getToken(HtmlParser.J_FALSE, 0); }
		public JinjaFalseAtomContext(J_atomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNoneAtomContext extends J_atomContext {
		public TerminalNode J_NONE() { return getToken(HtmlParser.J_NONE, 0); }
		public JinjaNoneAtomContext(J_atomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaNoneAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStringAtomContext extends J_atomContext {
		public TerminalNode J_STRING() { return getToken(HtmlParser.J_STRING, 0); }
		public JinjaStringAtomContext(J_atomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaNameAtomContext extends J_atomContext {
		public TerminalNode J_NAME() { return getToken(HtmlParser.J_NAME, 0); }
		public JinjaNameAtomContext(J_atomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaNameAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaLengthAtomContext extends J_atomContext {
		public TerminalNode J_LENGTH() { return getToken(HtmlParser.J_LENGTH, 0); }
		public JinjaLengthAtomContext(J_atomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlParserVisitor ) return ((HtmlParserVisitor<? extends T>)visitor).visitJinjaLengthAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final J_atomContext j_atom() throws RecognitionException {
		J_atomContext _localctx = new J_atomContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_j_atom);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case J_NUMBER:
				_localctx = new JinjaNumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(J_NUMBER);
				}
				break;
			case J_STRING:
				_localctx = new JinjaStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(J_STRING);
				}
				break;
			case J_TRUE:
				_localctx = new JinjaTrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(J_TRUE);
				}
				break;
			case J_FALSE:
				_localctx = new JinjaFalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(J_FALSE);
				}
				break;
			case J_NONE:
				_localctx = new JinjaNoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(J_NONE);
				}
				break;
			case J_NAME:
				_localctx = new JinjaNameAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(481);
				match(J_NAME);
				}
				break;
			case J_LENGTH:
				_localctx = new JinjaLengthAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(482);
				match(J_LENGTH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return j_call_expr_sempred((J_call_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean j_call_expr_sempred(J_call_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001V\u01e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"K\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002"+
		"R\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0002\u0003\u0002"+
		"^\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b\u0003\u0001"+
		"\u0003\u0003\u0003f\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004j\b\u0004"+
		"\n\u0004\f\u0004m\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006w\b\u0006"+
		"\n\u0006\f\u0006z\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u007f\b\u0007\n\u0007\f\u0007\u0082\t\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u0086\b\u0007\u000b\u0007\f\u0007\u0087\u0003\u0007\u008a\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u008f\b\b\n\b\f\b\u0092\t\b\u0001\b\u0001"+
		"\b\u0005\b\u0096\b\b\n\b\f\b\u0099\t\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u009e\b\b\n\b\f\b\u00a1\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a6\b\b"+
		"\u0004\b\u00a8\b\b\u000b\b\f\b\u00a9\u0001\b\u0001\b\u0005\b\u00ae\b\b"+
		"\n\b\f\b\u00b1\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00b6\b\b\n\b\f\b\u00b9"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00be\b\b\n\b\f\b\u00c1\t\b\u0001"+
		"\b\u0001\b\u0005\b\u00c5\b\b\n\b\f\b\u00c8\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00cd\b\b\n\b\f\b\u00d0\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d5"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00da\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00df\b\b\n\b\f\b\u00e2\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e7"+
		"\b\b\u0003\b\u00e9\b\b\u0001\t\u0005\t\u00ec\b\t\n\t\f\t\u00ef\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f5\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0004\u000b\u00fa\b\u000b\u000b\u000b\f\u000b\u00fb\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0100\b\u000b\u000b\u000b\f\u000b\u0101\u0005\u000b"+
		"\u0104\b\u000b\n\u000b\f\u000b\u0107\t\u000b\u0001\f\u0004\f\u010a\b\f"+
		"\u000b\f\f\f\u010b\u0001\f\u0001\f\u0004\f\u0110\b\f\u000b\f\f\f\u0111"+
		"\u0005\f\u0114\b\f\n\f\f\f\u0117\t\f\u0001\r\u0001\r\u0001\r\u0003\r\u011c"+
		"\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0124\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0129"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012d\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0132\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0136\b\u000f\n\u000f\f\u000f\u0139\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u014e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0165"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u016d\b\u0017\n\u0017\f\u0017\u0170\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u0184\b\u0018\n\u0018\f\u0018\u0187\t\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u018d\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0198\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u019e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01a5\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01aa\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01b2\b\u001a\u0001\u001a\u0005"+
		"\u001a\u01b5\b\u001a\n\u001a\f\u001a\u01b8\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01bd\b\u001b\u0003\u001b\u01bf\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01c3\b\u001b\u0003\u001b\u01c5\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01ca\b\u001c\n\u001c"+
		"\f\u001c\u01cd\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01d2\b\u001d\n\u001d\f\u001d\u01d5\t\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01db\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e4"+
		"\b\u001f\u0001\u001f\u0001P\u00014 \u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000"+
		"\u0003\u0001\u0000\u000f\u0010\u0001\u0000NQ\u0002\u0000==UU\u0217\u0000"+
		"C\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004]\u0001"+
		"\u0000\u0000\u0000\u0006e\u0001\u0000\u0000\u0000\bk\u0001\u0000\u0000"+
		"\u0000\nn\u0001\u0000\u0000\u0000\fs\u0001\u0000\u0000\u0000\u000e\u0089"+
		"\u0001\u0000\u0000\u0000\u0010\u00e8\u0001\u0000\u0000\u0000\u0012\u00ed"+
		"\u0001\u0000\u0000\u0000\u0014\u00f0\u0001\u0000\u0000\u0000\u0016\u00f9"+
		"\u0001\u0000\u0000\u0000\u0018\u0109\u0001\u0000\u0000\u0000\u001a\u0118"+
		"\u0001\u0000\u0000\u0000\u001c\u012c\u0001\u0000\u0000\u0000\u001e\u012e"+
		"\u0001\u0000\u0000\u0000 \u013c\u0001\u0000\u0000\u0000\"\u0141\u0001"+
		"\u0000\u0000\u0000$\u0144\u0001\u0000\u0000\u0000&\u014d\u0001\u0000\u0000"+
		"\u0000(\u014f\u0001\u0000\u0000\u0000*\u0159\u0001\u0000\u0000\u0000,"+
		"\u015d\u0001\u0000\u0000\u0000.\u0168\u0001\u0000\u0000\u00000\u0179\u0001"+
		"\u0000\u0000\u00002\u0197\u0001\u0000\u0000\u00004\u01a9\u0001\u0000\u0000"+
		"\u00006\u01c4\u0001\u0000\u0000\u00008\u01c6\u0001\u0000\u0000\u0000:"+
		"\u01ce\u0001\u0000\u0000\u0000<\u01da\u0001\u0000\u0000\u0000>\u01e3\u0001"+
		"\u0000\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\u0001\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FK\u0003"+
		"\u0004\u0002\u0000GK\u0005\u000e\u0000\u0000HK\u0003\"\u0011\u0000IK\u0003"+
		"$\u0012\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u0003\u0001\u0000\u0000"+
		"\u0000LP\u0005\r\u0000\u0000MO\u0003\u0006\u0003\u0000NM\u0001\u0000\u0000"+
		"\u0000OR\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S^\u0007"+
		"\u0000\u0000\u0000TU\u0005\u000b\u0000\u0000UV\u0003\b\u0004\u0000VW\u0005"+
		"\u0016\u0000\u0000W^\u0001\u0000\u0000\u0000XZ\u0005\f\u0000\u0000Y[\u0005"+
		".\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\^\u0005-\u0000\u0000]L\u0001\u0000\u0000\u0000]T\u0001"+
		"\u0000\u0000\u0000]X\u0001\u0000\u0000\u0000^\u0005\u0001\u0000\u0000"+
		"\u0000_b\u0005\u0013\u0000\u0000`a\u0005\u0012\u0000\u0000ac\u0005\u0015"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000df\u0005\u0011\u0000\u0000e_\u0001\u0000\u0000\u0000"+
		"ed\u0001\u0000\u0000\u0000f\u0007\u0001\u0000\u0000\u0000gj\u0003\n\u0005"+
		"\u0000hj\u0003\u001e\u000f\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000l\t\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"no\u0003\f\u0006\u0000op\u0005\u0017\u0000\u0000pq\u0003\u0012\t\u0000"+
		"qr\u0005\u0018\u0000\u0000r\u000b\u0001\u0000\u0000\u0000sx\u0003\u000e"+
		"\u0007\u0000tu\u0005\u001d\u0000\u0000uw\u0003\u000e\u0007\u0000vt\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y\r\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000{\u0080\u0003\u0010\b\u0000|}\u0005\u001f\u0000\u0000}\u007f\u0003"+
		"\u0010\b\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u008a\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0003\u0010\b\u0000\u0084\u0086\u0003\u0010\b\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0001\u0000\u0000\u0000\u0089{\u0001\u0000\u0000\u0000\u0089\u0083"+
		"\u0001\u0000\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u0090"+
		"\u0005%\u0000\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u008f\u0005"+
		"%\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0097\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u001b\u0000\u0000\u0094\u0096\u0005%\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009f\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0005\u001b\u0000\u0000\u009b\u009c\u0005\u001b\u0000"+
		"\u0000\u009c\u009e\u0005%\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00e9\u0001\u0000\u0000\u0000"+
		"\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u001e\u0000\u0000"+
		"\u00a3\u00a5\u0005%\u0000\u0000\u00a4\u00a6\u0005%\u0000\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00af\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\u001b\u0000\u0000\u00ac\u00ae\u0005%\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u001b\u0000\u0000\u00b3\u00b4\u0005\u001b\u0000\u0000\u00b4\u00b6\u0005"+
		"%\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00e9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bf\u0005%\u0000\u0000\u00bb\u00bc\u0005 \u0000\u0000"+
		"\u00bc\u00be\u0005%\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c6\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u001b\u0000\u0000\u00c3"+
		"\u00c5\u0005%\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ce\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u001b\u0000\u0000\u00ca\u00cb"+
		"\u0005\u001b\u0000\u0000\u00cb\u00cd\u0005%\u0000\u0000\u00cc\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00e9\u0001"+
		"\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d4\u0005"+
		")\u0000\u0000\u00d2\u00d3\u0005\u001b\u0000\u0000\u00d3\u00d5\u0005%\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d9\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u001b\u0000"+
		"\u0000\u00d7\u00d8\u0005\u001b\u0000\u0000\u00d8\u00da\u0005%\u0000\u0000"+
		"\u00d9\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00e9\u0001\u0000\u0000\u0000\u00db\u00e0\u0005%\u0000\u0000\u00dc"+
		"\u00dd\u0005\u001b\u0000\u0000\u00dd\u00df\u0005%\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u001b\u0000\u0000\u00e4\u00e5\u0005\u001b\u0000\u0000\u00e5\u00e7"+
		"\u0005%\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u008b\u0001"+
		"\u0000\u0000\u0000\u00e8\u00a7\u0001\u0000\u0000\u0000\u00e8\u00ba\u0001"+
		"\u0000\u0000\u0000\u00e8\u00d1\u0001\u0000\u0000\u0000\u00e8\u00db\u0001"+
		"\u0000\u0000\u0000\u00e9\u0011\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003"+
		"\u0014\n\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u0013\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0005%\u0000\u0000\u00f1\u00f2\u0005\u001b\u0000"+
		"\u0000\u00f2\u00f4\u0003\u0016\u000b\u0000\u00f3\u00f5\u0005,\u0000\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u001c\u0000\u0000"+
		"\u00f7\u0015\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003\u001c\u000e\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u0105\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005\u001d\u0000\u0000"+
		"\u00fe\u0100\u0003\u001c\u000e\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000"+
		"\u0103\u00fd\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0017\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0003\u001c\u000e\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0115\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u0005\u001d\u0000\u0000\u010e\u0110\u0003\u001c\u000e\u0000"+
		"\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000"+
		"\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000"+
		"\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u010d\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0019\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119\u0005%\u0000\u0000\u0119"+
		"\u011b\u0005\u0019\u0000\u0000\u011a\u011c\u0003\u0018\f\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u001a\u0000\u0000\u011e\u001b"+
		"\u0001\u0000\u0000\u0000\u011f\u012d\u0003\u001a\r\u0000\u0120\u012d\u0005"+
		"$\u0000\u0000\u0121\u012d\u0005!\u0000\u0000\u0122\u0124\u0005+\u0000"+
		"\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005\"\u0000\u0000"+
		"\u0126\u012d\u0005#\u0000\u0000\u0127\u0129\u0005+\u0000\u0000\u0128\u0127"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0001\u0000\u0000\u0000\u012a\u012d\u0005\"\u0000\u0000\u012b\u012d\u0005"+
		"%\u0000\u0000\u012c\u011f\u0001\u0000\u0000\u0000\u012c\u0120\u0001\u0000"+
		"\u0000\u0000\u012c\u0121\u0001\u0000\u0000\u0000\u012c\u0123\u0001\u0000"+
		"\u0000\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012c\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u001d\u0001\u0000\u0000\u0000\u012e\u012f\u0005*\u0000"+
		"\u0000\u012f\u0131\u0005%\u0000\u0000\u0130\u0132\u0005%\u0000\u0000\u0131"+
		"\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0001\u0000\u0000\u0000\u0133\u0137\u0005\u0017\u0000\u0000\u0134"+
		"\u0136\u0003 \u0010\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139"+
		"\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0018\u0000\u0000\u013b\u001f"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0005%\u0000\u0000\u013d\u013e\u0005"+
		"\u0017\u0000\u0000\u013e\u013f\u0003\u0012\t\u0000\u013f\u0140\u0005\u0018"+
		"\u0000\u0000\u0140!\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0002\u0000"+
		"\u0000\u0142\u0143\u0003&\u0013\u0000\u0143#\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005\u0001\u0000\u0000\u0145\u0146\u00032\u0019\u0000\u0146\u0147"+
		"\u0005/\u0000\u0000\u0147%\u0001\u0000\u0000\u0000\u0148\u014e\u0003*"+
		"\u0015\u0000\u0149\u014e\u0003,\u0016\u0000\u014a\u014e\u0003.\u0017\u0000"+
		"\u014b\u014e\u00030\u0018\u0000\u014c\u014e\u0003(\u0014\u0000\u014d\u0148"+
		"\u0001\u0000\u0000\u0000\u014d\u0149\u0001\u0000\u0000\u0000\u014d\u014a"+
		"\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c"+
		"\u0001\u0000\u0000\u0000\u014e\'\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		";\u0000\u0000\u0150\u0151\u0005U\u0000\u0000\u0151\u0152\u0005R\u0000"+
		"\u0000\u0152\u0153\u00032\u0019\u0000\u0153\u0154\u00050\u0000\u0000\u0154"+
		"\u0155\u0003\u0000\u0000\u0000\u0155\u0156\u0005\u0002\u0000\u0000\u0156"+
		"\u0157\u0005<\u0000\u0000\u0157\u0158\u00050\u0000\u0000\u0158)\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u00051\u0000\u0000\u015a\u015b\u0005T\u0000"+
		"\u0000\u015b\u015c\u00050\u0000\u0000\u015c+\u0001\u0000\u0000\u0000\u015d"+
		"\u015e\u00052\u0000\u0000\u015e\u015f\u0005U\u0000\u0000\u015f\u0160\u0005"+
		"0\u0000\u0000\u0160\u0161\u0003\u0000\u0000\u0000\u0161\u0162\u0005\u0002"+
		"\u0000\u0000\u0162\u0164\u00053\u0000\u0000\u0163\u0165\u0005U\u0000\u0000"+
		"\u0164\u0163\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u00050\u0000\u0000\u0167"+
		"-\u0001\u0000\u0000\u0000\u0168\u0169\u00054\u0000\u0000\u0169\u016e\u0005"+
		"U\u0000\u0000\u016a\u016b\u0005J\u0000\u0000\u016b\u016d\u0005U\u0000"+
		"\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000"+
		"\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0005:\u0000\u0000\u0172\u0173\u00032\u0019\u0000\u0173"+
		"\u0174\u00050\u0000\u0000\u0174\u0175\u0003\u0000\u0000\u0000\u0175\u0176"+
		"\u0005\u0002\u0000\u0000\u0176\u0177\u00055\u0000\u0000\u0177\u0178\u0005"+
		"0\u0000\u0000\u0178/\u0001\u0000\u0000\u0000\u0179\u017a\u00056\u0000"+
		"\u0000\u017a\u017b\u00032\u0019\u0000\u017b\u017c\u00050\u0000\u0000\u017c"+
		"\u0185\u0003\u0000\u0000\u0000\u017d\u017e\u0005\u0002\u0000\u0000\u017e"+
		"\u017f\u00057\u0000\u0000\u017f\u0180\u00032\u0019\u0000\u0180\u0181\u0005"+
		"0\u0000\u0000\u0181\u0182\u0003\u0000\u0000\u0000\u0182\u0184\u0001\u0000"+
		"\u0000\u0000\u0183\u017d\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000"+
		"\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000"+
		"\u0000\u0000\u0186\u018c\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005\u0002\u0000\u0000\u0189\u018a\u00058\u0000"+
		"\u0000\u018a\u018b\u00050\u0000\u0000\u018b\u018d\u0003\u0000\u0000\u0000"+
		"\u018c\u0188\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0002\u0000\u0000"+
		"\u018f\u0190\u00059\u0000\u0000\u0190\u0191\u00050\u0000\u0000\u01911"+
		"\u0001\u0000\u0000\u0000\u0192\u0193\u00034\u001a\u0000\u0193\u0194\u0007"+
		"\u0001\u0000\u0000\u0194\u0195\u00034\u001a\u0000\u0195\u0198\u0001\u0000"+
		"\u0000\u0000\u0196\u0198\u00034\u001a\u0000\u0197\u0192\u0001\u0000\u0000"+
		"\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u01983\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0006\u001a\uffff\uffff\u0000\u019a\u019b\u00038\u001c\u0000"+
		"\u019b\u019d\u0005F\u0000\u0000\u019c\u019e\u0003:\u001d\u0000\u019d\u019c"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0005G\u0000\u0000\u01a0\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0005U\u0000\u0000\u01a2\u01a4\u0005F\u0000"+
		"\u0000\u01a3\u01a5\u0003:\u001d\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a6\u01aa\u0005G\u0000\u0000\u01a7\u01aa\u00038\u001c\u0000\u01a8\u01aa"+
		"\u0003>\u001f\u0000\u01a9\u0199\u0001\u0000\u0000\u0000\u01a9\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01a8\u0001"+
		"\u0000\u0000\u0000\u01aa\u01b6\u0001\u0000\u0000\u0000\u01ab\u01ac\n\u0006"+
		"\u0000\u0000\u01ac\u01ad\u0005M\u0000\u0000\u01ad\u01b5\u00034\u001a\u0007"+
		"\u01ae\u01af\n\u0003\u0000\u0000\u01af\u01b1\u0005H\u0000\u0000\u01b0"+
		"\u01b2\u00036\u001b\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5"+
		"\u0005I\u0000\u0000\u01b4\u01ab\u0001\u0000\u0000\u0000\u01b4\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b75\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01be\u00032\u0019"+
		"\u0000\u01ba\u01bc\u0005L\u0000\u0000\u01bb\u01bd\u00032\u0019\u0000\u01bc"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bf\u0001\u0000\u0000\u0000\u01be\u01ba\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c5\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c2\u0005L\u0000\u0000\u01c1\u01c3\u00032\u0019\u0000\u01c2\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c4\u01b9\u0001\u0000\u0000\u0000\u01c4\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c57\u0001\u0000\u0000\u0000\u01c6\u01cb\u0007\u0002"+
		"\u0000\u0000\u01c7\u01c8\u0005K\u0000\u0000\u01c8\u01ca\u0007\u0002\u0000"+
		"\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000"+
		"\u0000\u01cc9\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d3\u0003<\u001e\u0000\u01cf\u01d0\u0005J\u0000\u0000\u01d0\u01d2"+
		"\u0003<\u001e\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d4;\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d6\u01db\u00032\u0019\u0000\u01d7\u01d8\u0005U\u0000\u0000"+
		"\u01d8\u01d9\u0005R\u0000\u0000\u01d9\u01db\u00032\u0019\u0000\u01da\u01d6"+
		"\u0001\u0000\u0000\u0000\u01da\u01d7\u0001\u0000\u0000\u0000\u01db=\u0001"+
		"\u0000\u0000\u0000\u01dc\u01e4\u0005S\u0000\u0000\u01dd\u01e4\u0005T\u0000"+
		"\u0000\u01de\u01e4\u0005C\u0000\u0000\u01df\u01e4\u0005D\u0000\u0000\u01e0"+
		"\u01e4\u0005E\u0000\u0000\u01e1\u01e4\u0005U\u0000\u0000\u01e2\u01e4\u0005"+
		"=\u0000\u0000\u01e3\u01dc\u0001\u0000\u0000\u0000\u01e3\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e3\u01de\u0001\u0000\u0000\u0000\u01e3\u01df\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4?\u0001\u0000\u0000"+
		"\u0000>CJPZ]beikx\u0080\u0087\u0089\u0090\u0097\u009f\u00a5\u00a9\u00af"+
		"\u00b7\u00bf\u00c6\u00ce\u00d4\u00d9\u00e0\u00e6\u00e8\u00ed\u00f4\u00fb"+
		"\u0101\u0105\u010b\u0111\u0115\u011b\u0123\u0128\u012c\u0131\u0137\u014d"+
		"\u0164\u016e\u0185\u018c\u0197\u019d\u01a4\u01a9\u01b1\u01b4\u01b6\u01bc"+
		"\u01be\u01c2\u01c4\u01cb\u01d3\u01da\u01e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}