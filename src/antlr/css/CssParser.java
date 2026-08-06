// Generated from /home/ghifar/Downloads/Telegram Desktop/compiler/psychic-broccoli-main/grammars/CssParser.g4 by ANTLR 4.13.2
package antlr.css;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CSS_LBRACE=1, CSS_RBRACE=2, CSS_LPAREN=3, CSS_RPAREN=4, CSS_COLON=5, CSS_SEMI=6, 
		CSS_COMMA=7, CSS_DOT=8, CSS_GT=9, CSS_HASH=10, CSS_HEX_COLOR=11, CSS_NUMBER=12, 
		CSS_UNIT=13, CSS_STRING=14, CSS_ID=15, CSS_Space=16, CSS_Comment=17, CSS_TILDE=18, 
		CSS_UNIVERSAL=19, CSS_AT=20, CSS_MINUS=21, CSS_IMPORTANT=22;
	public static final int
		RULE_style_sheet = 0, RULE_ruleSet = 1, RULE_selector_decl = 2, RULE_css_selector_list = 3, 
		RULE_css_selector = 4, RULE_declarationList = 5, RULE_declaration = 6, 
		RULE_css_value = 7, RULE_css_function_args = 8, RULE_css_function_call = 9, 
		RULE_cssterm = 10, RULE_css_at_rule = 11, RULE_css_at_rule_body = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"style_sheet", "ruleSet", "selector_decl", "css_selector_list", "css_selector", 
			"declarationList", "declaration", "css_value", "css_function_args", "css_function_call", 
			"cssterm", "css_at_rule", "css_at_rule_body"
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

	@Override
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStyleSheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_sheetContext style_sheet() throws RecognitionException {
		Style_sheetContext _localctx = new Style_sheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_style_sheet);
		int _la;
		try {
			_localctx = new StyleSheetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1605888L) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CSS_DOT:
				case CSS_ID:
				case CSS_UNIVERSAL:
					{
					setState(26);
					ruleSet();
					}
					break;
				case CSS_AT:
					{
					setState(27);
					css_at_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
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
		public TerminalNode CSS_LBRACE() { return getToken(CssParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(CssParser.CSS_RBRACE, 0); }
		public CssRuleContext(RuleSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleSet);
		try {
			_localctx = new CssRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			selector_decl();
			setState(34);
			match(CSS_LBRACE);
			setState(35);
			declarationList();
			setState(36);
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
		public List<TerminalNode> CSS_COMMA() { return getTokens(CssParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(CssParser.CSS_COMMA, i);
		}
		public CssSelectorDeclarationContext(Selector_declContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssSelectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_declContext selector_decl() throws RecognitionException {
		Selector_declContext _localctx = new Selector_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selector_decl);
		int _la;
		try {
			_localctx = new CssSelectorDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			css_selector_list();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(39);
				match(CSS_COMMA);
				setState(40);
				css_selector_list();
				}
				}
				setState(45);
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
		public List<TerminalNode> CSS_GT() { return getTokens(CssParser.CSS_GT); }
		public TerminalNode CSS_GT(int i) {
			return getToken(CssParser.CSS_GT, i);
		}
		public CssSelectorListContext(Css_selector_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssSelectorList(this);
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
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssDescendantSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selector_listContext css_selector_list() throws RecognitionException {
		Css_selector_listContext _localctx = new Css_selector_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_css_selector_list);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CssSelectorListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				css_selector();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_GT) {
					{
					{
					setState(47);
					match(CSS_GT);
					setState(48);
					css_selector();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new CssDescendantSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				css_selector();
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55);
					css_selector();
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 557312L) != 0) );
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
		public TerminalNode CSS_UNIVERSAL() { return getToken(CssParser.CSS_UNIVERSAL, 0); }
		public List<TerminalNode> CSS_COLON() { return getTokens(CssParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(CssParser.CSS_COLON, i);
		}
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public UniversalSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUniversalSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_DOT() { return getTokens(CssParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(CssParser.CSS_DOT, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(CssParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(CssParser.CSS_COLON, i);
		}
		public QualifiedSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitQualifiedSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneSimpleSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_DOT() { return getTokens(CssParser.CSS_DOT); }
		public TerminalNode CSS_DOT(int i) {
			return getToken(CssParser.CSS_DOT, i);
		}
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(CssParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(CssParser.CSS_COLON, i);
		}
		public StandaloneSimpleSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStandaloneSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAndIdSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_HASH() { return getTokens(CssParser.CSS_HASH); }
		public TerminalNode CSS_HASH(int i) {
			return getToken(CssParser.CSS_HASH, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(CssParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(CssParser.CSS_COLON, i);
		}
		public TypeAndIdSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeAndIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends Css_selectorContext {
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public List<TerminalNode> CSS_COLON() { return getTokens(CssParser.CSS_COLON); }
		public TerminalNode CSS_COLON(int i) {
			return getToken(CssParser.CSS_COLON, i);
		}
		public TypeSelectorContext(Css_selectorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selectorContext css_selector() throws RecognitionException {
		Css_selectorContext _localctx = new Css_selectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_css_selector);
		int _la;
		try {
			int _alt;
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new QualifiedSelectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(CSS_ID);
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(63);
						match(CSS_DOT);
						setState(64);
						match(CSS_ID);
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						match(CSS_COLON);
						setState(71);
						match(CSS_ID);
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COLON) {
					{
					{
					setState(77);
					match(CSS_COLON);
					setState(78);
					match(CSS_COLON);
					setState(79);
					match(CSS_ID);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new StandaloneSimpleSelectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(85);
						match(CSS_DOT);
						setState(86);
						match(CSS_ID);
						setState(88);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							setState(87);
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
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						match(CSS_COLON);
						setState(95);
						match(CSS_ID);
						}
						} 
					}
					setState(100);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COLON) {
					{
					{
					setState(101);
					match(CSS_COLON);
					setState(102);
					match(CSS_COLON);
					setState(103);
					match(CSS_ID);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new TypeAndIdSelectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(CSS_ID);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_HASH) {
					{
					{
					setState(110);
					match(CSS_HASH);
					setState(111);
					match(CSS_ID);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(117);
						match(CSS_COLON);
						setState(118);
						match(CSS_ID);
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CSS_COLON) {
					{
					{
					setState(124);
					match(CSS_COLON);
					setState(125);
					match(CSS_COLON);
					setState(126);
					match(CSS_ID);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				_localctx = new UniversalSelectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(CSS_UNIVERSAL);
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(133);
					match(CSS_COLON);
					setState(134);
					match(CSS_ID);
					}
					break;
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_COLON) {
					{
					setState(137);
					match(CSS_COLON);
					setState(138);
					match(CSS_COLON);
					setState(139);
					match(CSS_ID);
					}
				}

				}
				break;
			case 5:
				_localctx = new TypeSelectorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(CSS_ID);
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						match(CSS_COLON);
						setState(144);
						match(CSS_ID);
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_COLON) {
					{
					setState(150);
					match(CSS_COLON);
					setState(151);
					match(CSS_COLON);
					setState(152);
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
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDeclarationBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationList);
		int _la;
		try {
			_localctx = new DeclarationBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(157);
				declaration();
				}
				}
				setState(162);
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
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public TerminalNode CSS_COLON() { return getToken(CssParser.CSS_COLON, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode CSS_SEMI() { return getToken(CssParser.CSS_SEMI, 0); }
		public TerminalNode CSS_IMPORTANT() { return getToken(CssParser.CSS_IMPORTANT, 0); }
		public CssDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			_localctx = new CssDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(CSS_ID);
			setState(164);
			match(CSS_COLON);
			setState(165);
			css_value();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_IMPORTANT) {
				{
				setState(166);
				match(CSS_IMPORTANT);
				}
			}

			setState(169);
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
		public List<TerminalNode> CSS_COMMA() { return getTokens(CssParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(CssParser.CSS_COMMA, i);
		}
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCss_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_css_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				cssterm();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2152448L) != 0) );
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(176);
				match(CSS_COMMA);
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177);
					cssterm();
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2152448L) != 0) );
				}
				}
				setState(186);
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
		public List<TerminalNode> CSS_COMMA() { return getTokens(CssParser.CSS_COMMA); }
		public TerminalNode CSS_COMMA(int i) {
			return getToken(CssParser.CSS_COMMA, i);
		}
		public FunctionArgumentsContext(Css_function_argsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_function_argsContext css_function_args() throws RecognitionException {
		Css_function_argsContext _localctx = new Css_function_argsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_css_function_args);
		int _la;
		try {
			_localctx = new FunctionArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				cssterm();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2152448L) != 0) );
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_COMMA) {
				{
				{
				setState(192);
				match(CSS_COMMA);
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					cssterm();
					}
					}
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2152448L) != 0) );
				}
				}
				setState(202);
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
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(CssParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(CssParser.CSS_RPAREN, 0); }
		public Css_function_argsContext css_function_args() {
			return getRuleContext(Css_function_argsContext.class,0);
		}
		public CssFunctionCallContext(Css_function_callContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_function_callContext css_function_call() throws RecognitionException {
		Css_function_callContext _localctx = new Css_function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_css_function_call);
		int _la;
		try {
			_localctx = new CssFunctionCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(CSS_ID);
			setState(204);
			match(CSS_LPAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2152448L) != 0)) {
				{
				setState(205);
				css_function_args();
				}
			}

			setState(208);
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
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTermContext extends CsstermContext {
		public TerminalNode CSS_STRING() { return getToken(CssParser.CSS_STRING, 0); }
		public StringTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStringTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(CssParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_MINUS() { return getToken(CssParser.CSS_MINUS, 0); }
		public NumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitNumberTermContext extends CsstermContext {
		public TerminalNode CSS_NUMBER() { return getToken(CssParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_UNIT() { return getToken(CssParser.CSS_UNIT, 0); }
		public TerminalNode CSS_MINUS() { return getToken(CssParser.CSS_MINUS, 0); }
		public UnitNumberTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUnitNumberTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorTermContext extends CsstermContext {
		public TerminalNode CSS_HEX_COLOR() { return getToken(CssParser.CSS_HEX_COLOR, 0); }
		public ColorTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitColorTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTermContext extends CsstermContext {
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public IdentifierTermContext(CsstermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdentifierTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsstermContext cssterm() throws RecognitionException {
		CsstermContext _localctx = new CsstermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cssterm);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new FunctionTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				css_function_call();
				}
				break;
			case 2:
				_localctx = new StringTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(CSS_STRING);
				}
				break;
			case 3:
				_localctx = new ColorTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(CSS_HEX_COLOR);
				}
				break;
			case 4:
				_localctx = new UnitNumberTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_MINUS) {
					{
					setState(213);
					match(CSS_MINUS);
					}
				}

				setState(216);
				match(CSS_NUMBER);
				setState(217);
				match(CSS_UNIT);
				}
				break;
			case 5:
				_localctx = new NumberTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_MINUS) {
					{
					setState(218);
					match(CSS_MINUS);
					}
				}

				setState(221);
				match(CSS_NUMBER);
				}
				break;
			case 6:
				_localctx = new IdentifierTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
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
		public TerminalNode CSS_AT() { return getToken(CssParser.CSS_AT, 0); }
		public List<TerminalNode> CSS_ID() { return getTokens(CssParser.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(CssParser.CSS_ID, i);
		}
		public TerminalNode CSS_LBRACE() { return getToken(CssParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(CssParser.CSS_RBRACE, 0); }
		public List<Css_at_rule_bodyContext> css_at_rule_body() {
			return getRuleContexts(Css_at_rule_bodyContext.class);
		}
		public Css_at_rule_bodyContext css_at_rule_body(int i) {
			return getRuleContext(Css_at_rule_bodyContext.class,i);
		}
		public CssAtKeyframesContext(Css_at_ruleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssAtKeyframes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_at_ruleContext css_at_rule() throws RecognitionException {
		Css_at_ruleContext _localctx = new Css_at_ruleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_css_at_rule);
		int _la;
		try {
			_localctx = new CssAtKeyframesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(CSS_AT);
			setState(226);
			match(CSS_ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CSS_ID) {
				{
				setState(227);
				match(CSS_ID);
				}
			}

			setState(230);
			match(CSS_LBRACE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_ID) {
				{
				{
				setState(231);
				css_at_rule_body();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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
		public TerminalNode CSS_ID() { return getToken(CssParser.CSS_ID, 0); }
		public TerminalNode CSS_LBRACE() { return getToken(CssParser.CSS_LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode CSS_RBRACE() { return getToken(CssParser.CSS_RBRACE, 0); }
		public CssAtKeyframeBlockContext(Css_at_rule_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssAtKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_at_rule_bodyContext css_at_rule_body() throws RecognitionException {
		Css_at_rule_bodyContext _localctx = new Css_at_rule_bodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_css_at_rule_body);
		try {
			_localctx = new CssAtKeyframeBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(CSS_ID);
			setState(240);
			match(CSS_LBRACE);
			setState(241);
			declarationList();
			setState(242);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u00f5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000"+
		"\f\u0000 \t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002*\b\u0002\n\u0002"+
		"\f\u0002-\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00032\b\u0003"+
		"\n\u0003\f\u00035\t\u0003\u0001\u0003\u0001\u0003\u0004\u00039\b\u0003"+
		"\u000b\u0003\f\u0003:\u0003\u0003=\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004Q\b\u0004\n\u0004\f\u0004T\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004Y\b\u0004\u0004\u0004[\b\u0004"+
		"\u000b\u0004\f\u0004\\\u0001\u0004\u0001\u0004\u0005\u0004a\b\u0004\n"+
		"\u0004\f\u0004d\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"i\b\u0004\n\u0004\f\u0004l\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004q\b\u0004\n\u0004\f\u0004t\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004x\b\u0004\n\u0004\f\u0004{\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0080\b\u0004\n\u0004\f\u0004\u0083\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0088\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u008d\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0092\b\u0004\n\u0004\f\u0004\u0095\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u009a\b\u0004\u0003\u0004\u009c\b"+
		"\u0004\u0001\u0005\u0005\u0005\u009f\b\u0005\n\u0005\f\u0005\u00a2\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007\u00ad\b\u0007\u000b\u0007"+
		"\f\u0007\u00ae\u0001\u0007\u0001\u0007\u0004\u0007\u00b3\b\u0007\u000b"+
		"\u0007\f\u0007\u00b4\u0005\u0007\u00b7\b\u0007\n\u0007\f\u0007\u00ba\t"+
		"\u0007\u0001\b\u0004\b\u00bd\b\b\u000b\b\f\b\u00be\u0001\b\u0001\b\u0004"+
		"\b\u00c3\b\b\u000b\b\f\b\u00c4\u0005\b\u00c7\b\b\n\b\f\b\u00ca\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00cf\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00d7\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00dc\b\n"+
		"\u0001\n\u0001\n\u0003\n\u00e0\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00e5\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e9\b"+
		"\u000b\n\u000b\f\u000b\u00ec\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000\u0111\u0000\u001e"+
		"\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004&\u0001\u0000"+
		"\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\b\u009b\u0001\u0000\u0000"+
		"\u0000\n\u00a0\u0001\u0000\u0000\u0000\f\u00a3\u0001\u0000\u0000\u0000"+
		"\u000e\u00ac\u0001\u0000\u0000\u0000\u0010\u00bc\u0001\u0000\u0000\u0000"+
		"\u0012\u00cb\u0001\u0000\u0000\u0000\u0014\u00df\u0001\u0000\u0000\u0000"+
		"\u0016\u00e1\u0001\u0000\u0000\u0000\u0018\u00ef\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0003\u0002\u0001\u0000\u001b\u001d\u0003\u0016\u000b\u0000"+
		"\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0001\u0000\u0000\u0000\u001f\u0001\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000!\"\u0003\u0004\u0002\u0000\"#\u0005\u0001\u0000"+
		"\u0000#$\u0003\n\u0005\u0000$%\u0005\u0002\u0000\u0000%\u0003\u0001\u0000"+
		"\u0000\u0000&+\u0003\u0006\u0003\u0000\'(\u0005\u0007\u0000\u0000(*\u0003"+
		"\u0006\u0003\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000"+
		"+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0005\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000.3\u0003\b\u0004\u0000/0\u0005\t"+
		"\u0000\u000002\u0003\b\u0004\u00001/\u0001\u0000\u0000\u000025\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004=\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0003\b\u0004\u000079\u0003"+
		"\b\u0004\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000"+
		"<.\u0001\u0000\u0000\u0000<6\u0001\u0000\u0000\u0000=\u0007\u0001\u0000"+
		"\u0000\u0000>C\u0005\u000f\u0000\u0000?@\u0005\b\u0000\u0000@B\u0005\u000f"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DJ\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000FG\u0005\u0005\u0000\u0000GI\u0005\u000f\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KR\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0005\u0000\u0000NO\u0005\u0005\u0000\u0000"+
		"OQ\u0005\u000f\u0000\u0000PM\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u009c\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005\b\u0000\u0000VX\u0005"+
		"\u000f\u0000\u0000WY\u0005\u000f\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]b\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000"+
		"_a\u0005\u000f\u0000\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cj\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0005\u0005\u0000\u0000fg\u0005"+
		"\u0005\u0000\u0000gi\u0005\u000f\u0000\u0000he\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\u009c\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mr\u0005"+
		"\u000f\u0000\u0000no\u0005\n\u0000\u0000oq\u0005\u000f\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sy\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0005\u0000\u0000vx\u0005\u000f\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z\u0081\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000|}\u0005\u0005\u0000\u0000}~\u0005\u0005\u0000\u0000~\u0080\u0005"+
		"\u000f\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u009c\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0005\u0013\u0000\u0000\u0085\u0086\u0005\u0005"+
		"\u0000\u0000\u0086\u0088\u0005\u000f\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008c\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u0005\u0000\u0000\u008a\u008b\u0005\u0005"+
		"\u0000\u0000\u008b\u008d\u0005\u000f\u0000\u0000\u008c\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u009c\u0001\u0000"+
		"\u0000\u0000\u008e\u0093\u0005\u000f\u0000\u0000\u008f\u0090\u0005\u0005"+
		"\u0000\u0000\u0090\u0092\u0005\u000f\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0099\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0005"+
		"\u0000\u0000\u0097\u0098\u0005\u0005\u0000\u0000\u0098\u009a\u0005\u000f"+
		"\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b>\u0001\u0000\u0000"+
		"\u0000\u009bZ\u0001\u0000\u0000\u0000\u009bm\u0001\u0000\u0000\u0000\u009b"+
		"\u0084\u0001\u0000\u0000\u0000\u009b\u008e\u0001\u0000\u0000\u0000\u009c"+
		"\t\u0001\u0000\u0000\u0000\u009d\u009f\u0003\f\u0006\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u000b"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005\u000f\u0000\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5\u00a7"+
		"\u0003\u000e\u0007\u0000\u00a6\u00a8\u0005\u0016\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa\r\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ad\u0003\u0014\n\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0005\u0007\u0000\u0000\u00b1\u00b3\u0003\u0014"+
		"\n\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u000f\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003\u0014\n\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c8\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005\u0007\u0000\u0000"+
		"\u00c1\u00c3\u0003\u0014\n\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9"+
		"\u0011\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\u000f\u0000\u0000\u00cc\u00ce\u0005\u0003\u0000\u0000\u00cd"+
		"\u00cf\u0003\u0010\b\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0004\u0000\u0000\u00d1\u0013\u0001\u0000\u0000\u0000\u00d2\u00e0"+
		"\u0003\u0012\t\u0000\u00d3\u00e0\u0005\u000e\u0000\u0000\u00d4\u00e0\u0005"+
		"\u000b\u0000\u0000\u00d5\u00d7\u0005\u0015\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005\f\u0000\u0000\u00d9\u00e0\u0005\r"+
		"\u0000\u0000\u00da\u00dc\u0005\u0015\u0000\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e0\u0005\f\u0000\u0000\u00de\u00e0\u0005\u000f\u0000"+
		"\u0000\u00df\u00d2\u0001\u0000\u0000\u0000\u00df\u00d3\u0001\u0000\u0000"+
		"\u0000\u00df\u00d4\u0001\u0000\u0000\u0000\u00df\u00d6\u0001\u0000\u0000"+
		"\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u0015\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0014\u0000"+
		"\u0000\u00e2\u00e4\u0005\u000f\u0000\u0000\u00e3\u00e5\u0005\u000f\u0000"+
		"\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ea\u0005\u0001\u0000"+
		"\u0000\u00e7\u00e9\u0003\u0018\f\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u0002\u0000\u0000"+
		"\u00ee\u0017\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u000f\u0000\u0000"+
		"\u00f0\u00f1\u0005\u0001\u0000\u0000\u00f1\u00f2\u0003\n\u0005\u0000\u00f2"+
		"\u00f3\u0005\u0002\u0000\u0000\u00f3\u0019\u0001\u0000\u0000\u0000#\u001c"+
		"\u001e+3:<CJRX\\bjry\u0081\u0087\u008c\u0093\u0099\u009b\u00a0\u00a7\u00ae"+
		"\u00b4\u00b8\u00be\u00c4\u00c8\u00ce\u00d6\u00db\u00df\u00e4\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}