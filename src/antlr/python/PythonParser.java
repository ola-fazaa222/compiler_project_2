// Generated from /home/ghifar/Downloads/Telegram Desktop/compiler/psychic-broccoli-main/grammars/PythonParser.g4 by ANTLR 4.13.2
package antlr.python;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, STRING=3, NUMBER=4, PASS=5, DEF=6, RETURN=7, FROM=8, 
		IMPORT=9, AS=10, IF=11, ELIF=12, ELSE=13, FOR=14, IN=15, GLOBAL=16, CLASS=17, 
		AND=18, OR=19, NOT=20, TRUE=21, FALSE=22, NONE=23, IS=24, WHILE=25, ARROW=26, 
		DEL=27, TRY=28, EXCEPT=29, FINALLY=30, AT=31, EQ=32, NEQ=33, GTE=34, LTE=35, 
		SLASHSLASH=36, POW=37, ASSIGN=38, GT=39, LT=40, SLASH=41, STAR=42, PLUS_ASSIGN=43, 
		MINUS_ASSIGN=44, STAR_ASSIGN=45, SLASH_ASSIGN=46, COLON=47, SEMI=48, COMMA=49, 
		PLUS=50, MINUS=51, MOD=52, NEWLINE=53, CLASS_NAME=54, NAME=55, LP=56, 
		RP=57, LBRACK=58, RBRACK=59, LKBRACE=60, RKBRACE=61, SKIP_=62, SPACES_INLINE=63, 
		DOT=64, TRIPLE_QUOTE_STRING=65, FSTRING=66;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_suite = 2, RULE_compound_stmt = 3, 
		RULE_import_stmt = 4, RULE_del_stmt = 5, RULE_try_stmt = 6, RULE_except_clause = 7, 
		RULE_class_def = 8, RULE_return_stmt = 9, RULE_global_stmt = 10, RULE_import_from = 11, 
		RULE_imptd = 12, RULE_if_stmt = 13, RULE_condition = 14, RULE_python_expr = 15, 
		RULE_atom_expr = 16, RULE_complex_expr = 17, RULE_comp_op = 18, RULE_assign_stmt = 19, 
		RULE_template_literal = 20, RULE_for_loop = 21, RULE_func_def = 22, RULE_dec = 23, 
		RULE_parameters = 24, RULE_fun_params = 25, RULE_atom = 26, RULE_bool_exp = 27, 
		RULE_list_items = 28, RULE_dict_maker = 29, RULE_key_value = 30, RULE_simple_expr = 31, 
		RULE_arithmetic_expr = 32, RULE_arglist = 33, RULE_argument = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "suite", "compound_stmt", "import_stmt", "del_stmt", 
			"try_stmt", "except_clause", "class_def", "return_stmt", "global_stmt", 
			"import_from", "imptd", "if_stmt", "condition", "python_expr", "atom_expr", 
			"complex_expr", "comp_op", "assign_stmt", "template_literal", "for_loop", 
			"func_def", "dec", "parameters", "fun_params", "atom", "bool_exp", "list_items", 
			"dict_maker", "key_value", "simple_expr", "arithmetic_expr", "arglist", 
			"argument"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'pass'", "'def'", "'return'", "'from'", 
			"'import'", "'as'", "'if'", "'elif'", "'else'", "'for'", "'in'", "'global'", 
			"'class'", "'and'", "'or'", "'not'", "'True'", "'False'", "'None'", "'is'", 
			"'while'", "'->'", "'del'", "'try'", "'except'", "'finally'", "'@'", 
			"'=='", "'!='", "'>='", "'<='", "'//'", "'**'", "'='", "'>'", "'<'", 
			"'/'", "'*'", "'+='", "'-='", "'*='", "'/='", "':'", "';'", "','", "'+'", 
			"'-'", "'%'", null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", 
			null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "STRING", "NUMBER", "PASS", "DEF", "RETURN", 
			"FROM", "IMPORT", "AS", "IF", "ELIF", "ELSE", "FOR", "IN", "GLOBAL", 
			"CLASS", "AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "IS", "WHILE", 
			"ARROW", "DEL", "TRY", "EXCEPT", "FINALLY", "AT", "EQ", "NEQ", "GTE", 
			"LTE", "SLASHSLASH", "POW", "ASSIGN", "GT", "LT", "SLASH", "STAR", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "STAR_ASSIGN", "SLASH_ASSIGN", "COLON", "SEMI", "COMMA", 
			"PLUS", "MINUS", "MOD", "NEWLINE", "CLASS_NAME", "NAME", "LP", "RP", 
			"LBRACK", "RBRACK", "LKBRACE", "RKBRACE", "SKIP_", "SPACES_INLINE", "DOT", 
			"TRIPLE_QUOTE_STRING", "FSTRING"
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
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ProgContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					match(NEWLINE);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4414653534409168513L) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends StatementContext {
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public SimpleStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			int _alt;
			_localctx = new SimpleStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(84);
					compound_stmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class SuiteContext extends ParserRuleContext {
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
	 
		public SuiteContext() { }
		public void copyFrom(SuiteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassSuiteContext extends SuiteContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public PassSuiteContext(SuiteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPassSuite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSuiteContext extends SuiteContext {
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public SimpleSuiteContext(SuiteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleSuite(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundSuiteContext extends SuiteContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public CompoundSuiteContext(SuiteContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_suite);
		int _la;
		try {
			int _alt;
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SimpleSuiteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(89);
						compound_stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new CompoundSuiteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(NEWLINE);
				setState(95);
				match(INDENT);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					compound_stmt();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4414653534409168513L) != 0) );
				setState(101);
				match(DEDENT);
				}
				break;
			case 3:
				_localctx = new PassSuiteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(NEWLINE);
				setState(104);
				match(INDENT);
				setState(105);
				match(PASS);
				setState(106);
				match(DEDENT);
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	 
		public Compound_stmtContext() { }
		public void copyFrom(Compound_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends Compound_stmtContext {
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public GlobalStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopStatementContext extends Compound_stmtContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ForLoopStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PythonExpressionContext extends Compound_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PythonExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPythonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExpressionContext extends Compound_stmtContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AtomExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends Compound_stmtContext {
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ImportStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionContext extends Compound_stmtContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ClassDefinitionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStatementContext extends Compound_stmtContext {
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public DeleteStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends Compound_stmtContext {
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public SimpleExpressionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends Compound_stmtContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public IfStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends Compound_stmtContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AssignmentStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends Compound_stmtContext {
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TryStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends Compound_stmtContext {
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ReturnStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends Compound_stmtContext {
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public FunctionDefinitionContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassStatementContext extends Compound_stmtContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PassStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPassStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromStatementContext extends Compound_stmtContext {
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ImportFromStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlankStatementContext extends Compound_stmtContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public BlankStatementContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBlankStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compound_stmt);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				if_stmt();
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(110);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				assign_stmt();
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(114);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AtomExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				atom_expr(0);
				setState(119);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(118);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SimpleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				simple_expr();
				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(122);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ForLoopStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				for_loop();
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(126);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new PythonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				python_expr();
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(130);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				func_def();
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(134);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new ClassDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				class_def();
				setState(139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(138);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				return_stmt();
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(142);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(145);
				import_stmt();
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(146);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new ImportFromStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(149);
				import_from();
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(150);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new GlobalStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(153);
				global_stmt();
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(154);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 13:
				_localctx = new DeleteStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(157);
				del_stmt();
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(158);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 14:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(161);
				try_stmt();
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(162);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new PassStatementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(165);
				match(PASS);
				setState(167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(166);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new BlankStatementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(169);
				match(NEWLINE);
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
	public static class Import_stmtContext extends ParserRuleContext {
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
	 
		public Import_stmtContext() { }
		public void copyFrom(Import_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefContext extends Import_stmtContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ImportDefContext(Import_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_import_stmt);
		int _la;
		try {
			_localctx = new ImportDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IMPORT);
			setState(173);
			match(NAME);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(174);
				match(DOT);
				setState(175);
				match(NAME);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(181);
				match(AS);
				setState(182);
				match(NAME);
				}
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
	public static class Del_stmtContext extends ParserRuleContext {
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
	 
		public Del_stmtContext() { }
		public void copyFrom(Del_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DelDefContext extends Del_stmtContext {
		public TerminalNode DEL() { return getToken(PythonParser.DEL, 0); }
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public DelDefContext(Del_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDelDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_del_stmt);
		try {
			_localctx = new DelDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DEL);
			setState(186);
			atom_expr(0);
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
	public static class Try_stmtContext extends ParserRuleContext {
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
	 
		public Try_stmtContext() { }
		public void copyFrom(Try_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryExceptDefContext extends Try_stmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<Except_clauseContext> except_clause() {
			return getRuleContexts(Except_clauseContext.class);
		}
		public Except_clauseContext except_clause(int i) {
			return getRuleContext(Except_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public TryExceptDefContext(Try_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryExceptDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_try_stmt);
		try {
			int _alt;
			_localctx = new TryExceptDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(TRY);
			setState(189);
			match(COLON);
			setState(190);
			suite();
			setState(192); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(191);
					except_clause();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(194); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(196);
				match(ELSE);
				setState(197);
				match(COLON);
				setState(198);
				suite();
				}
				break;
			}
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(201);
				match(FINALLY);
				setState(202);
				match(COLON);
				setState(203);
				suite();
				}
				break;
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
	public static class Except_clauseContext extends ParserRuleContext {
		public Except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_clause; }
	 
		public Except_clauseContext() { }
		public void copyFrom(Except_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExceptClauseDefContext extends Except_clauseContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ExceptClauseDefContext(Except_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExceptClauseDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_clauseContext except_clause() throws RecognitionException {
		Except_clauseContext _localctx = new Except_clauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_except_clause);
		int _la;
		try {
			_localctx = new ExceptClauseDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(EXCEPT);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4604930618984497149L) != 0)) {
				{
				setState(207);
				atom();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(208);
					match(AS);
					setState(209);
					match(NAME);
					}
				}

				}
			}

			setState(214);
			match(COLON);
			setState(215);
			suite();
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
	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode CLASS_NAME() { return getToken(PythonParser.CLASS_NAME, 0); }
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(CLASS);
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(219);
				match(LP);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4414653534728093693L) != 0)) {
					{
					setState(220);
					arglist();
					}
				}

				setState(223);
				match(RP);
				}
			}

			setState(226);
			match(COLON);
			setState(227);
			suite();
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
	public static class Return_stmtContext extends ParserRuleContext {
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	 
		public Return_stmtContext() { }
		public void copyFrom(Return_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexReturnContext extends Return_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public ComplexReturnContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionReturnContext extends Return_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionReturnContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitConditionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_stmt);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new ConditionReturnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(RETURN);
				setState(230);
				condition(0);
				}
				break;
			case 2:
				_localctx = new ComplexReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(RETURN);
				setState(232);
				python_expr();
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
	public static class Global_stmtContext extends ParserRuleContext {
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
	 
		public Global_stmtContext() { }
		public void copyFrom(Global_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementDefContext extends Global_stmtContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public GlobalStatementDefContext(Global_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStatementDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_global_stmt);
		int _la;
		try {
			_localctx = new GlobalStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(GLOBAL);
			setState(236);
			match(NAME);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(237);
				match(COMMA);
				setState(238);
				match(NAME);
				}
				}
				setState(243);
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
	public static class Import_fromContext extends ParserRuleContext {
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
	 
		public Import_fromContext() { }
		public void copyFrom(Import_fromContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromDefContext extends Import_fromContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public List<ImptdContext> imptd() {
			return getRuleContexts(ImptdContext.class);
		}
		public ImptdContext imptd(int i) {
			return getRuleContext(ImptdContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ImportFromDefContext(Import_fromContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_import_from);
		int _la;
		try {
			_localctx = new ImportFromDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(FROM);
			setState(245);
			match(NAME);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(246);
				match(DOT);
				setState(247);
				match(NAME);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			match(IMPORT);
			setState(254);
			imptd();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				imptd();
				}
				}
				setState(261);
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
	public static class ImptdContext extends ParserRuleContext {
		public ImptdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imptd; }
	 
		public ImptdContext() { }
		public void copyFrom(ImptdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportedContext extends ImptdContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> CLASS_NAME() { return getTokens(PythonParser.CLASS_NAME); }
		public TerminalNode CLASS_NAME(int i) {
			return getToken(PythonParser.CLASS_NAME, i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ImportedContext(ImptdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImported(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImptdContext imptd() throws RecognitionException {
		ImptdContext _localctx = new ImptdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_imptd);
		int _la;
		try {
			_localctx = new ImportedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==CLASS_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(263);
				match(AS);
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==CLASS_NAME || _la==NAME) ) {
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
	public static class If_stmtContext extends ParserRuleContext {
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	 
		public If_stmtContext() { }
		public void copyFrom(If_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementDefContext extends If_stmtContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PythonParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PythonParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public IfStatementDefContext(If_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStatementDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_stmt);
		try {
			int _alt;
			_localctx = new IfStatementDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IF);
			setState(268);
			condition(0);
			setState(269);
			match(COLON);
			setState(270);
			suite();
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(271);
					match(ELIF);
					setState(272);
					condition(0);
					setState(273);
					match(COLON);
					setState(274);
					suite();
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(281);
				match(ELSE);
				setState(282);
				match(COLON);
				setState(283);
				suite();
				}
				break;
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ConditionContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonExpressionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanConditionContext extends ConditionContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BooleanConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBooleanCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NotExpressionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrConditionContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public OrConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndConditionContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public AndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(287);
				match(NOT);
				setState(288);
				condition(5);
				}
				break;
			case 2:
				{
				_localctx = new BooleanConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				bool_exp();
				}
				break;
			case 3:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				python_expr();
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(291);
						comp_op();
						setState(292);
						python_expr();
						}
						} 
					}
					setState(298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(301);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(302);
						match(AND);
						setState(303);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(304);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(305);
						match(OR);
						setState(306);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class Python_exprContext extends ParserRuleContext {
		public Python_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_python_expr; }
	 
		public Python_exprContext() { }
		public void copyFrom(Python_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomComplexExpressionContext extends Python_exprContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public AtomComplexExpressionContext(Python_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomComplexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexExpressionContext extends Python_exprContext {
		public Complex_exprContext complex_expr() {
			return getRuleContext(Complex_exprContext.class,0);
		}
		public ComplexExpressionContext(Python_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Python_exprContext python_expr() throws RecognitionException {
		Python_exprContext _localctx = new Python_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_python_expr);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NONE:
			case CLASS_NAME:
			case NAME:
			case TRIPLE_QUOTE_STRING:
			case FSTRING:
				_localctx = new AtomComplexExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				atom_expr(0);
				}
				break;
			case LP:
			case LBRACK:
			case LKBRACE:
				_localctx = new ComplexExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				complex_expr();
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
	public static class Atom_exprContext extends ParserRuleContext {
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
	 
		public Atom_exprContext() { }
		public void copyFrom(Atom_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceContext extends Atom_exprContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public SliceContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleVarContext extends Atom_exprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SimpleVarContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends Atom_exprContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public SubscriptContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends Atom_exprContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FunctionCallContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodAccessContext extends Atom_exprContext {
		public List<Atom_exprContext> atom_expr() {
			return getRuleContexts(Atom_exprContext.class);
		}
		public Atom_exprContext atom_expr(int i) {
			return getRuleContext(Atom_exprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public MethodAccessContext(Atom_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMethodAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		return atom_expr(0);
	}

	private Atom_exprContext atom_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, _parentState);
		Atom_exprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_atom_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SimpleVarContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(317);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new MethodAccessContext(new Atom_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom_expr);
						setState(319);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(320);
						match(DOT);
						setState(321);
						atom_expr(4);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallContext(new Atom_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom_expr);
						setState(322);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(323);
						match(LP);
						setState(325);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4414653534728093693L) != 0)) {
							{
							setState(324);
							arglist();
							}
						}

						setState(327);
						match(RP);
						}
						break;
					case 3:
						{
						_localctx = new SubscriptContext(new Atom_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom_expr);
						setState(328);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(329);
						match(LBRACK);
						setState(330);
						python_expr();
						setState(331);
						match(RBRACK);
						}
						break;
					case 4:
						{
						_localctx = new SliceContext(new Atom_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom_expr);
						setState(333);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(334);
						match(LBRACK);
						setState(336);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4415779434634936317L) != 0)) {
							{
							setState(335);
							python_expr();
							}
						}

						setState(338);
						match(COLON);
						setState(340);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4415779434634936317L) != 0)) {
							{
							setState(339);
							python_expr();
							}
						}

						setState(346);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COLON) {
							{
							setState(342);
							match(COLON);
							setState(344);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4415779434634936317L) != 0)) {
								{
								setState(343);
								python_expr();
								}
							}

							}
						}

						setState(348);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	public static class Complex_exprContext extends ParserRuleContext {
		public Complex_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_expr; }
	 
		public Complex_exprContext() { }
		public void copyFrom(Complex_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictionaryLiteralContext extends Complex_exprContext {
		public TerminalNode LKBRACE() { return getToken(PythonParser.LKBRACE, 0); }
		public TerminalNode RKBRACE() { return getToken(PythonParser.RKBRACE, 0); }
		public Dict_makerContext dict_maker() {
			return getRuleContext(Dict_makerContext.class,0);
		}
		public DictionaryLiteralContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictionaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends Complex_exprContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public List_itemsContext list_items() {
			return getRuleContext(List_itemsContext.class,0);
		}
		public ListLiteralContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListComprehensionContext extends Complex_exprContext {
		public TerminalNode LBRACK() { return getToken(PythonParser.LBRACK, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PythonParser.RBRACK, 0); }
		public ListComprehensionContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetLiteralContext extends Complex_exprContext {
		public TerminalNode LKBRACE() { return getToken(PythonParser.LKBRACE, 0); }
		public List<Atom_exprContext> atom_expr() {
			return getRuleContexts(Atom_exprContext.class);
		}
		public Atom_exprContext atom_expr(int i) {
			return getRuleContext(Atom_exprContext.class,i);
		}
		public TerminalNode RKBRACE() { return getToken(PythonParser.RKBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public SetLiteralContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSetLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorContext extends Complex_exprContext {
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public GeneratorContext(Complex_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGenerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_exprContext complex_expr() throws RecognitionException {
		Complex_exprContext _localctx = new Complex_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_complex_expr);
		int _la;
		try {
			int _alt;
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new GeneratorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(LP);
				setState(355);
				for_loop();
				setState(356);
				match(RP);
				}
				break;
			case 2:
				_localctx = new ListComprehensionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(LBRACK);
				setState(359);
				for_loop();
				setState(360);
				match(RBRACK);
				}
				break;
			case 3:
				_localctx = new DictionaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(LKBRACE);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4414653534728093693L) != 0)) {
					{
					setState(363);
					dict_maker();
					}
				}

				setState(366);
				match(RKBRACE);
				}
				break;
			case 4:
				_localctx = new SetLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				match(LKBRACE);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(368);
					match(NEWLINE);
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(374);
				atom_expr(0);
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(375);
						match(COMMA);
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(376);
							match(NEWLINE);
							}
							}
							setState(381);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(382);
						atom_expr(0);
						}
						} 
					}
					setState(387);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(388);
					match(COMMA);
					}
				}

				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(391);
					match(NEWLINE);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				match(RKBRACE);
				}
				break;
			case 5:
				_localctx = new ListLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				match(LBRACK);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4603804719077654525L) != 0)) {
					{
					setState(400);
					list_items();
					}
				}

				setState(403);
				match(RBRACK);
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
	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	 
		public Comp_opContext() { }
		public void copyFrom(Comp_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrOperatorContext extends Comp_opContext {
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public OrOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOperatorContext extends Comp_opContext {
		public TerminalNode LT() { return getToken(PythonParser.LT, 0); }
		public LessThanOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLessThanOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InOperatorContext extends Comp_opContext {
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public InOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOperatorContext extends Comp_opContext {
		public TerminalNode GT() { return getToken(PythonParser.GT, 0); }
		public GreaterThanOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGreaterThanOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotOperatorContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public IsNotOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqualOperatorContext extends Comp_opContext {
		public TerminalNode LTE() { return getToken(PythonParser.LTE, 0); }
		public LessEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLessEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqualOperatorContext extends Comp_opContext {
		public TerminalNode GTE() { return getToken(PythonParser.GTE, 0); }
		public GreaterEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGreaterEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInOperatorContext extends Comp_opContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public NotInOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotInOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsOperatorContext extends Comp_opContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public IsOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualOperatorContext extends Comp_opContext {
		public TerminalNode NEQ() { return getToken(PythonParser.NEQ, 0); }
		public NotEqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualOperatorContext extends Comp_opContext {
		public TerminalNode EQ() { return getToken(PythonParser.EQ, 0); }
		public EqualOperatorContext(Comp_opContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEqualOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comp_op);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new LessThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(LT);
				}
				break;
			case 2:
				_localctx = new GreaterThanOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(GT);
				}
				break;
			case 3:
				_localctx = new EqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(EQ);
				}
				break;
			case 4:
				_localctx = new GreaterEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				match(GTE);
				}
				break;
			case 5:
				_localctx = new LessEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(LTE);
				}
				break;
			case 6:
				_localctx = new NotEqualOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				match(NEQ);
				}
				break;
			case 7:
				_localctx = new OrOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				match(OR);
				}
				break;
			case 8:
				_localctx = new InOperatorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(413);
				match(IN);
				}
				break;
			case 9:
				_localctx = new NotInOperatorContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(414);
				match(NOT);
				setState(415);
				match(IN);
				}
				break;
			case 10:
				_localctx = new IsOperatorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(416);
				match(IS);
				}
				break;
			case 11:
				_localctx = new IsNotOperatorContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(417);
				match(IS);
				setState(418);
				match(NOT);
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
	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
	 
		public Assign_stmtContext() { }
		public void copyFrom(Assign_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugmentedDivStmtContext extends Assign_stmtContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public TerminalNode SLASH_ASSIGN() { return getToken(PythonParser.SLASH_ASSIGN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AugmentedDivStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugmentedDivStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugmentedMulStmtContext extends Assign_stmtContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public TerminalNode STAR_ASSIGN() { return getToken(PythonParser.STAR_ASSIGN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AugmentedMulStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugmentedMulStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticAssignStmtContext extends Assign_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ArithmeticAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArithmeticAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonAssignStmtContext extends Assign_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public ComparisonAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparisonAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PythonExpressionAssignStmtContext extends Assign_stmtContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public PythonExpressionAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPythonExpressionAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugmentedAddStmtContext extends Assign_stmtContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public TerminalNode PLUS_ASSIGN() { return getToken(PythonParser.PLUS_ASSIGN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AugmentedAddStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugmentedAddStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralAssignStmtContext extends Assign_stmtContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Template_literalContext template_literal() {
			return getRuleContext(Template_literalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TemplateLiteralAssignStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTemplateLiteralAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugmentedSubStmtContext extends Assign_stmtContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public TerminalNode MINUS_ASSIGN() { return getToken(PythonParser.MINUS_ASSIGN, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public AugmentedSubStmtContext(Assign_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugmentedSubStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign_stmt);
		try {
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				_localctx = new PythonExpressionAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				python_expr();
				setState(422);
				match(ASSIGN);
				setState(423);
				python_expr();
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(424);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ComparisonAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				python_expr();
				setState(428);
				match(ASSIGN);
				setState(429);
				condition(0);
				setState(431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(430);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ArithmeticAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				python_expr();
				setState(434);
				match(ASSIGN);
				setState(435);
				arithmetic_expr();
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(436);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new TemplateLiteralAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				python_expr();
				setState(440);
				match(ASSIGN);
				setState(441);
				template_literal();
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(442);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new AugmentedAddStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
				python_expr();
				setState(446);
				match(PLUS_ASSIGN);
				setState(447);
				python_expr();
				setState(449);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(448);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new AugmentedSubStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				python_expr();
				setState(452);
				match(MINUS_ASSIGN);
				setState(453);
				python_expr();
				setState(455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(454);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new AugmentedMulStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(457);
				python_expr();
				setState(458);
				match(STAR_ASSIGN);
				setState(459);
				python_expr();
				setState(461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(460);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new AugmentedDivStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(463);
				python_expr();
				setState(464);
				match(SLASH_ASSIGN);
				setState(465);
				python_expr();
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(466);
					match(NEWLINE);
					}
					break;
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
	public static class Template_literalContext extends ParserRuleContext {
		public Template_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_literal; }
	 
		public Template_literalContext() { }
		public void copyFrom(Template_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateLiteralContext extends Template_literalContext {
		public TerminalNode TRIPLE_QUOTE_STRING() { return getToken(PythonParser.TRIPLE_QUOTE_STRING, 0); }
		public TemplateLiteralContext(Template_literalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTemplateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_literalContext template_literal() throws RecognitionException {
		Template_literalContext _localctx = new Template_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_template_literal);
		try {
			_localctx = new TemplateLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(TRIPLE_QUOTE_STRING);
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
	public static class For_loopContext extends ParserRuleContext {
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	 
		public For_loopContext() { }
		public void copyFrom(For_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexForLoopContext extends For_loopContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ComplexForLoopContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleForLoopContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SimpleForLoopContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_loop);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new SimpleForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(FOR);
				setState(474);
				atom();
				setState(475);
				match(IN);
				setState(476);
				python_expr();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(477);
					match(COLON);
					}
				}

				setState(480);
				suite();
				}
				break;
			case STRING:
			case NUMBER:
			case TRUE:
			case FALSE:
			case NONE:
			case CLASS_NAME:
			case NAME:
			case TRIPLE_QUOTE_STRING:
			case FSTRING:
				_localctx = new ComplexForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				atom();
				setState(483);
				match(FOR);
				setState(484);
				atom();
				setState(485);
				match(IN);
				setState(486);
				python_expr();
				setState(489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(487);
					match(IF);
					setState(488);
					condition(0);
					}
					break;
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
	public static class Func_defContext extends ParserRuleContext {
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
	 
		public Func_defContext() { }
		public void copyFrom(Func_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefDefContext extends Func_defContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public FunctionDefDefContext(Func_defContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionDefDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_func_def);
		int _la;
		try {
			_localctx = new FunctionDefDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(493);
				dec();
				}
			}

			setState(496);
			match(DEF);
			setState(497);
			match(NAME);
			setState(498);
			parameters();
			setState(499);
			match(COLON);
			setState(500);
			suite();
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
	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends DecContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dec);
		int _la;
		try {
			_localctx = new DecoratorContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(AT);
			setState(503);
			match(NAME);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(504);
				match(DOT);
				setState(505);
				match(NAME);
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(511);
				match(LP);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -4414653534728093693L) != 0)) {
					{
					setState(512);
					arglist();
					}
				}

				setState(515);
				match(RP);
				}
			}

			setState(518);
			match(NEWLINE);
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
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParametersContext extends ParametersContext {
		public TerminalNode LP() { return getToken(PythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(PythonParser.RP, 0); }
		public Fun_paramsContext fun_params() {
			return getRuleContext(Fun_paramsContext.class,0);
		}
		public FunctionParametersContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameters);
		int _la;
		try {
			_localctx = new FunctionParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(LP);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(521);
				fun_params();
				}
			}

			setState(524);
			match(RP);
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
	public static class Fun_paramsContext extends ParserRuleContext {
		public Fun_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_params; }
	 
		public Fun_paramsContext() { }
		public void copyFrom(Fun_paramsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MixedParamsContext extends Fun_paramsContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(PythonParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PythonParser.ASSIGN, i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public MixedParamsContext(Fun_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMixedParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordParamsContext extends Fun_paramsContext {
		public List<TerminalNode> NAME() { return getTokens(PythonParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PythonParser.NAME, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(PythonParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PythonParser.ASSIGN, i);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public KeywordParamsContext(Fun_paramsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_paramsContext fun_params() throws RecognitionException {
		Fun_paramsContext _localctx = new Fun_paramsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fun_params);
		int _la;
		try {
			int _alt;
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new MixedParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(NAME);
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(527);
						match(COMMA);
						setState(528);
						match(NAME);
						}
						} 
					}
					setState(533);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(534);
					match(COMMA);
					setState(535);
					match(NAME);
					setState(536);
					match(ASSIGN);
					setState(537);
					atom();
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new KeywordParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				match(NAME);
				setState(544);
				match(ASSIGN);
				setState(545);
				atom();
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(546);
					match(COMMA);
					setState(547);
					match(NAME);
					setState(548);
					match(ASSIGN);
					setState(549);
					atom();
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TripleQuoteStringAtomContext extends AtomContext {
		public TerminalNode TRIPLE_QUOTE_STRING() { return getToken(PythonParser.TRIPLE_QUOTE_STRING, 0); }
		public TripleQuoteStringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTripleQuoteStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringAtomContext extends AtomContext {
		public TerminalNode FSTRING() { return getToken(PythonParser.FSTRING, 0); }
		public FStringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAtomContext extends AtomContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public NameAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneAtomContext extends AtomContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoneAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomContext extends AtomContext {
		public Bool_expContext bool_exp() {
			return getRuleContext(Bool_expContext.class,0);
		}
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassAtomContext extends AtomContext {
		public TerminalNode CLASS_NAME() { return getToken(PythonParser.CLASS_NAME, 0); }
		public ClassAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atom);
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new NameAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(NAME);
				}
				break;
			case CLASS_NAME:
				_localctx = new ClassAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(CLASS_NAME);
				}
				break;
			case NUMBER:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				match(STRING);
				}
				break;
			case TRIPLE_QUOTE_STRING:
				_localctx = new TripleQuoteStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				match(TRIPLE_QUOTE_STRING);
				}
				break;
			case FSTRING:
				_localctx = new FStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				match(FSTRING);
				}
				break;
			case NONE:
				_localctx = new NoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(563);
				match(NONE);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(564);
				bool_exp();
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
	public static class Bool_expContext extends ParserRuleContext {
		public Bool_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_exp; }
	 
		public Bool_expContext() { }
		public void copyFrom(Bool_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueAtomContext extends Bool_expContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueAtomContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseAtomContext extends Bool_expContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseAtomContext(Bool_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expContext bool_exp() throws RecognitionException {
		Bool_expContext _localctx = new Bool_expContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool_exp);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(FALSE);
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
	public static class List_itemsContext extends ParserRuleContext {
		public List_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_items; }
	 
		public List_itemsContext() { }
		public void copyFrom(List_itemsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListItemsContext extends List_itemsContext {
		public List<Atom_exprContext> atom_expr() {
			return getRuleContexts(Atom_exprContext.class);
		}
		public Atom_exprContext atom_expr(int i) {
			return getRuleContext(Atom_exprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ListItemsContext(List_itemsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_itemsContext list_items() throws RecognitionException {
		List_itemsContext _localctx = new List_itemsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list_items);
		int _la;
		try {
			int _alt;
			_localctx = new ListItemsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(571);
				match(NEWLINE);
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			atom_expr(0);
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(578);
					match(COMMA);
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(579);
						match(NEWLINE);
						}
						}
						setState(584);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(585);
					atom_expr(0);
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(591);
				match(COMMA);
				}
			}

			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(594);
				match(NEWLINE);
				}
				}
				setState(599);
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
	public static class Dict_makerContext extends ParserRuleContext {
		public Dict_makerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_maker; }
	 
		public Dict_makerContext() { }
		public void copyFrom(Dict_makerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeyValuePairsContext extends Dict_makerContext {
		public List<Key_valueContext> key_value() {
			return getRuleContexts(Key_valueContext.class);
		}
		public Key_valueContext key_value(int i) {
			return getRuleContext(Key_valueContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public KeyValuePairsContext(Dict_makerContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeyValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_makerContext dict_maker() throws RecognitionException {
		Dict_makerContext _localctx = new Dict_makerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dict_maker);
		int _la;
		try {
			int _alt;
			_localctx = new KeyValuePairsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(600);
				match(NEWLINE);
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			key_value();
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(607);
					match(COMMA);
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(608);
						match(NEWLINE);
						}
						}
						setState(613);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(614);
					key_value();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(620);
				match(COMMA);
				}
			}

			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(623);
				match(NEWLINE);
				}
				}
				setState(628);
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
	public static class Key_valueContext extends ParserRuleContext {
		public Key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_value; }
	 
		public Key_valueContext() { }
		public void copyFrom(Key_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleKeyValueContext extends Key_valueContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public Simple_exprContext simple_expr() {
			return getRuleContext(Simple_exprContext.class,0);
		}
		public SimpleKeyValueContext(Key_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprKeyValueContext extends Key_valueContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExprKeyValueContext(Key_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExprKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomKeyValueContext extends Key_valueContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public AtomKeyValueContext(Key_valueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Key_valueContext key_value() throws RecognitionException {
		Key_valueContext _localctx = new Key_valueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_key_value);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				_localctx = new AtomKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				atom();
				setState(630);
				match(COLON);
				setState(631);
				atom();
				}
				break;
			case 2:
				_localctx = new SimpleKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				atom();
				setState(634);
				match(COLON);
				setState(635);
				simple_expr();
				}
				break;
			case 3:
				_localctx = new ExprKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				python_expr();
				setState(638);
				match(COLON);
				setState(639);
				python_expr();
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
	public static class Simple_exprContext extends ParserRuleContext {
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
	 
		public Simple_exprContext() { }
		public void copyFrom(Simple_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleComparisonExpressionContext extends Simple_exprContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SimpleComparisonExpressionContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends Simple_exprContext {
		public Arithmetic_exprContext arithmetic_expr() {
			return getRuleContext(Arithmetic_exprContext.class,0);
		}
		public ArithmeticExpressionContext(Simple_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_simple_expr);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new ArithmeticExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				arithmetic_expr();
				}
				break;
			case 2:
				_localctx = new SimpleComparisonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				condition(0);
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
	public static class Arithmetic_exprContext extends ParserRuleContext {
		public Arithmetic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expr; }
	 
		public Arithmetic_exprContext() { }
		public void copyFrom(Arithmetic_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(PythonParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(PythonParser.PLUS, i);
		}
		public AdditionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(PythonParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PythonParser.STAR, i);
		}
		public MultiplicationContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(PythonParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(PythonParser.MINUS, i);
		}
		public SubtractionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends Arithmetic_exprContext {
		public List<Python_exprContext> python_expr() {
			return getRuleContexts(Python_exprContext.class);
		}
		public Python_exprContext python_expr(int i) {
			return getRuleContext(Python_exprContext.class,i);
		}
		public List<TerminalNode> SLASH() { return getTokens(PythonParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PythonParser.SLASH, i);
		}
		public DivisionContext(Arithmetic_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_exprContext arithmetic_expr() throws RecognitionException {
		Arithmetic_exprContext _localctx = new Arithmetic_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arithmetic_expr);
		int _la;
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				python_expr();
				setState(650); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(648);
					match(PLUS);
					setState(649);
					python_expr();
					}
					}
					setState(652); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS );
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				python_expr();
				setState(657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(655);
					match(MINUS);
					setState(656);
					python_expr();
					}
					}
					setState(659); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				}
				break;
			case 3:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				python_expr();
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(662);
					match(SLASH);
					setState(663);
					python_expr();
					}
					}
					setState(666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SLASH );
				}
				break;
			case 4:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				python_expr();
				setState(671); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(669);
					match(STAR);
					setState(670);
					python_expr();
					}
					}
					setState(673); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STAR );
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
	public static class ArglistContext extends ParserRuleContext {
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	 
		public ArglistContext() { }
		public void copyFrom(ArglistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexArgsContext extends ArglistContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ComplexArgsContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomArgsContext extends ArglistContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public AtomArgsContext(ArglistContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arglist);
		int _la;
		try {
			int _alt;
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new AtomArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(677);
					match(NEWLINE);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(683);
				atom();
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(684);
						match(COMMA);
						setState(688);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(685);
							match(NEWLINE);
							}
							}
							setState(690);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(691);
						atom();
						}
						} 
					}
					setState(696);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(697);
					match(COMMA);
					}
				}

				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(700);
					match(NEWLINE);
					}
					}
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new ComplexArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(706);
					match(NEWLINE);
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(712);
				argument();
				setState(723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(713);
						match(COMMA);
						setState(717);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(714);
							match(NEWLINE);
							}
							}
							setState(719);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(720);
						argument();
						}
						} 
					}
					setState(725);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(726);
					match(COMMA);
					}
				}

				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(729);
					match(NEWLINE);
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalArgumentContext extends ArgumentContext {
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public PositionalArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgumentContext extends ArgumentContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public Python_exprContext python_expr() {
			return getRuleContext(Python_exprContext.class,0);
		}
		public KeywordArgumentContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argument);
		try {
			setState(741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				python_expr();
				}
				break;
			case 2:
				_localctx = new KeywordArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(738);
				match(NAME);
				setState(739);
				match(ASSIGN);
				setState(740);
				python_expr();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 16:
			return atom_expr_sempred((Atom_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean atom_expr_sempred(Atom_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001B\u02e8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0005"+
		"\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0004\u0001V\b\u0001\u000b\u0001\f\u0001W\u0001\u0002\u0004\u0002"+
		"[\b\u0002\u000b\u0002\f\u0002\\\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002b\b\u0002\u000b\u0002\f\u0002c\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002l\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"t\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003x\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003|\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0080"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0084\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0088\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u008c\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0090\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0094\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0098\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u009c\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00a0\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00a4\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a8\b"+
		"\u0003\u0001\u0003\u0003\u0003\u00ab\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00b1\b\u0004\n\u0004\f\u0004\u00b4\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00b8\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u00c1\b\u0006\u000b\u0006\f\u0006\u00c2\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00c8\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00cd\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00d3\b\u0007\u0003\u0007\u00d5\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\b"+
		"\u0003\b\u00e1\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00ea\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00f0\b\n"+
		"\n\n\f\n\u00f3\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00f9\b\u000b\n\u000b\f\u000b\u00fc\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0102\b\u000b\n\u000b\f\u000b\u0105"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u010a\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0115\b\r\n"+
		"\r\f\r\u0118\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u011d\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0127\b\u000e\n\u000e\f\u000e\u012a\t\u000e\u0003"+
		"\u000e\u012c\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0134\b\u000e\n\u000e\f\u000e\u0137\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u013b\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0146\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0151\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0155\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0159\b\u0010\u0003\u0010\u015b"+
		"\b\u0010\u0001\u0010\u0005\u0010\u015e\b\u0010\n\u0010\f\u0010\u0161\t"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u016d"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0172\b\u0011"+
		"\n\u0011\f\u0011\u0175\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u017a\b\u0011\n\u0011\f\u0011\u017d\t\u0011\u0001\u0011\u0005\u0011"+
		"\u0180\b\u0011\n\u0011\f\u0011\u0183\t\u0011\u0001\u0011\u0003\u0011\u0186"+
		"\b\u0011\u0001\u0011\u0005\u0011\u0189\b\u0011\n\u0011\f\u0011\u018c\t"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0192"+
		"\b\u0011\u0001\u0011\u0003\u0011\u0195\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01a4\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01aa\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01b0\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01b6\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01bc\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01c2\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01c8\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01ce\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01d4\b\u0013\u0003\u0013\u01d6\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01df"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01ea\b\u0015\u0003"+
		"\u0015\u01ec\b\u0015\u0001\u0016\u0003\u0016\u01ef\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01fb\b\u0017\n\u0017"+
		"\f\u0017\u01fe\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0202\b\u0017"+
		"\u0001\u0017\u0003\u0017\u0205\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u020b\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0212\b\u0019\n\u0019\f\u0019\u0215"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u021b"+
		"\b\u0019\n\u0019\f\u0019\u021e\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0227\b\u0019"+
		"\n\u0019\f\u0019\u022a\t\u0019\u0003\u0019\u022c\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0236\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u023a"+
		"\b\u001b\u0001\u001c\u0005\u001c\u023d\b\u001c\n\u001c\f\u001c\u0240\t"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0245\b\u001c\n"+
		"\u001c\f\u001c\u0248\t\u001c\u0001\u001c\u0005\u001c\u024b\b\u001c\n\u001c"+
		"\f\u001c\u024e\t\u001c\u0001\u001c\u0003\u001c\u0251\b\u001c\u0001\u001c"+
		"\u0005\u001c\u0254\b\u001c\n\u001c\f\u001c\u0257\t\u001c\u0001\u001d\u0005"+
		"\u001d\u025a\b\u001d\n\u001d\f\u001d\u025d\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0262\b\u001d\n\u001d\f\u001d\u0265\t\u001d\u0001"+
		"\u001d\u0005\u001d\u0268\b\u001d\n\u001d\f\u001d\u026b\t\u001d\u0001\u001d"+
		"\u0003\u001d\u026e\b\u001d\u0001\u001d\u0005\u001d\u0271\b\u001d\n\u001d"+
		"\f\u001d\u0274\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0282\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0286\b\u001f\u0001 \u0001 \u0001 \u0004 \u028b\b \u000b"+
		" \f \u028c\u0001 \u0001 \u0001 \u0004 \u0292\b \u000b \f \u0293\u0001"+
		" \u0001 \u0001 \u0004 \u0299\b \u000b \f \u029a\u0001 \u0001 \u0001 \u0004"+
		" \u02a0\b \u000b \f \u02a1\u0003 \u02a4\b \u0001!\u0005!\u02a7\b!\n!\f"+
		"!\u02aa\t!\u0001!\u0001!\u0001!\u0005!\u02af\b!\n!\f!\u02b2\t!\u0001!"+
		"\u0005!\u02b5\b!\n!\f!\u02b8\t!\u0001!\u0003!\u02bb\b!\u0001!\u0005!\u02be"+
		"\b!\n!\f!\u02c1\t!\u0001!\u0005!\u02c4\b!\n!\f!\u02c7\t!\u0001!\u0001"+
		"!\u0001!\u0005!\u02cc\b!\n!\f!\u02cf\t!\u0001!\u0005!\u02d2\b!\n!\f!\u02d5"+
		"\t!\u0001!\u0003!\u02d8\b!\u0001!\u0005!\u02db\b!\n!\f!\u02de\t!\u0003"+
		"!\u02e0\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02e6\b\"\u0001\"\u0000"+
		"\u0002\u001c #\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0001\u0001\u00006"+
		"7\u0360\u0000I\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000"+
		"\u0004k\u0001\u0000\u0000\u0000\u0006\u00aa\u0001\u0000\u0000\u0000\b"+
		"\u00ac\u0001\u0000\u0000\u0000\n\u00b9\u0001\u0000\u0000\u0000\f\u00bc"+
		"\u0001\u0000\u0000\u0000\u000e\u00ce\u0001\u0000\u0000\u0000\u0010\u00d9"+
		"\u0001\u0000\u0000\u0000\u0012\u00e9\u0001\u0000\u0000\u0000\u0014\u00eb"+
		"\u0001\u0000\u0000\u0000\u0016\u00f4\u0001\u0000\u0000\u0000\u0018\u0106"+
		"\u0001\u0000\u0000\u0000\u001a\u010b\u0001\u0000\u0000\u0000\u001c\u012b"+
		"\u0001\u0000\u0000\u0000\u001e\u013a\u0001\u0000\u0000\u0000 \u013c\u0001"+
		"\u0000\u0000\u0000\"\u0194\u0001\u0000\u0000\u0000$\u01a3\u0001\u0000"+
		"\u0000\u0000&\u01d5\u0001\u0000\u0000\u0000(\u01d7\u0001\u0000\u0000\u0000"+
		"*\u01eb\u0001\u0000\u0000\u0000,\u01ee\u0001\u0000\u0000\u0000.\u01f6"+
		"\u0001\u0000\u0000\u00000\u0208\u0001\u0000\u0000\u00002\u022b\u0001\u0000"+
		"\u0000\u00004\u0235\u0001\u0000\u0000\u00006\u0239\u0001\u0000\u0000\u0000"+
		"8\u023e\u0001\u0000\u0000\u0000:\u025b\u0001\u0000\u0000\u0000<\u0281"+
		"\u0001\u0000\u0000\u0000>\u0285\u0001\u0000\u0000\u0000@\u02a3\u0001\u0000"+
		"\u0000\u0000B\u02df\u0001\u0000\u0000\u0000D\u02e5\u0001\u0000\u0000\u0000"+
		"FH\u00055\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JO\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000\u0000TV\u0003\u0006"+
		"\u0003\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0003\u0001\u0000\u0000"+
		"\u0000Y[\u0003\u0006\u0003\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]l\u0001"+
		"\u0000\u0000\u0000^_\u00055\u0000\u0000_a\u0005\u0001\u0000\u0000`b\u0003"+
		"\u0006\u0003\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0002\u0000\u0000fl\u0001\u0000\u0000\u0000gh\u00055\u0000"+
		"\u0000hi\u0005\u0001\u0000\u0000ij\u0005\u0005\u0000\u0000jl\u0005\u0002"+
		"\u0000\u0000kZ\u0001\u0000\u0000\u0000k^\u0001\u0000\u0000\u0000kg\u0001"+
		"\u0000\u0000\u0000l\u0005\u0001\u0000\u0000\u0000mo\u0003\u001a\r\u0000"+
		"np\u00055\u0000\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p\u00ab\u0001\u0000\u0000\u0000qs\u0003&\u0013\u0000rt\u00055\u0000\u0000"+
		"sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u00ab\u0001\u0000"+
		"\u0000\u0000uw\u0003 \u0010\u0000vx\u00055\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u00ab\u0001\u0000\u0000\u0000y{\u0003"+
		">\u001f\u0000z|\u00055\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|\u00ab\u0001\u0000\u0000\u0000}\u007f\u0003*\u0015\u0000"+
		"~\u0080\u00055\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u00ab\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0003\u001e\u000f\u0000\u0082\u0084\u00055\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u00ab\u0001"+
		"\u0000\u0000\u0000\u0085\u0087\u0003,\u0016\u0000\u0086\u0088\u00055\u0000"+
		"\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u00ab\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0010\b\u0000"+
		"\u008a\u008c\u00055\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u00ab\u0001\u0000\u0000\u0000\u008d"+
		"\u008f\u0003\u0012\t\u0000\u008e\u0090\u00055\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u00ab"+
		"\u0001\u0000\u0000\u0000\u0091\u0093\u0003\b\u0004\u0000\u0092\u0094\u0005"+
		"5\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u00ab\u0001\u0000\u0000\u0000\u0095\u0097\u0003\u0016"+
		"\u000b\u0000\u0096\u0098\u00055\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00ab\u0001\u0000\u0000"+
		"\u0000\u0099\u009b\u0003\u0014\n\u0000\u009a\u009c\u00055\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u00ab\u0001\u0000\u0000\u0000\u009d\u009f\u0003\n\u0005\u0000\u009e"+
		"\u00a0\u00055\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00ab\u0001\u0000\u0000\u0000\u00a1\u00a3"+
		"\u0003\f\u0006\u0000\u00a2\u00a4\u00055\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00ab\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0005\u0005\u0000\u0000\u00a6\u00a8\u0005"+
		"5\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00ab\u00055\u0000"+
		"\u0000\u00aam\u0001\u0000\u0000\u0000\u00aaq\u0001\u0000\u0000\u0000\u00aa"+
		"u\u0001\u0000\u0000\u0000\u00aay\u0001\u0000\u0000\u0000\u00aa}\u0001"+
		"\u0000\u0000\u0000\u00aa\u0081\u0001\u0000\u0000\u0000\u00aa\u0085\u0001"+
		"\u0000\u0000\u0000\u00aa\u0089\u0001\u0000\u0000\u0000\u00aa\u008d\u0001"+
		"\u0000\u0000\u0000\u00aa\u0091\u0001\u0000\u0000\u0000\u00aa\u0095\u0001"+
		"\u0000\u0000\u0000\u00aa\u0099\u0001\u0000\u0000\u0000\u00aa\u009d\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u0007\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\t\u0000\u0000\u00ad\u00b2\u00057"+
		"\u0000\u0000\u00ae\u00af\u0005@\u0000\u0000\u00af\u00b1\u00057\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b7\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\n\u0000\u0000\u00b6\u00b8\u00057\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8"+
		"\t\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u001b\u0000\u0000\u00ba\u00bb"+
		"\u0003 \u0010\u0000\u00bb\u000b\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u001c\u0000\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u00c0\u0003\u0004"+
		"\u0002\u0000\u00bf\u00c1\u0003\u000e\u0007\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\r\u0000\u0000\u00c5\u00c6\u0005/\u0000"+
		"\u0000\u00c6\u00c8\u0003\u0004\u0002\u0000\u00c7\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cc\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca\u00cb\u0005/\u0000\u0000"+
		"\u00cb\u00cd\u0003\u0004\u0002\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\r\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d4\u0005\u001d\u0000\u0000\u00cf\u00d2\u00034\u001a\u0000\u00d0\u00d1"+
		"\u0005\n\u0000\u0000\u00d1\u00d3\u00057\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005"+
		"/\u0000\u0000\u00d7\u00d8\u0003\u0004\u0002\u0000\u00d8\u000f\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u0011\u0000\u0000\u00da\u00e0\u0007\u0000"+
		"\u0000\u0000\u00db\u00dd\u00058\u0000\u0000\u00dc\u00de\u0003B!\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u00059\u0000\u0000\u00e0"+
		"\u00db\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005/\u0000\u0000\u00e3\u00e4"+
		"\u0003\u0004\u0002\u0000\u00e4\u0011\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\u0007\u0000\u0000\u00e6\u00ea\u0003\u001c\u000e\u0000\u00e7\u00e8"+
		"\u0005\u0007\u0000\u0000\u00e8\u00ea\u0003\u001e\u000f\u0000\u00e9\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u0013"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00f1"+
		"\u00057\u0000\u0000\u00ed\u00ee\u00051\u0000\u0000\u00ee\u00f0\u00057"+
		"\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f2\u0015\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005\b\u0000\u0000\u00f5\u00fa\u00057\u0000"+
		"\u0000\u00f6\u00f7\u0005@\u0000\u0000\u00f7\u00f9\u00057\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\t\u0000\u0000\u00fe\u0103\u0003\u0018\f\u0000\u00ff\u0100"+
		"\u00051\u0000\u0000\u0100\u0102\u0003\u0018\f\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0017\u0001"+
		"\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0007"+
		"\u0000\u0000\u0000\u0107\u0108\u0005\n\u0000\u0000\u0108\u010a\u0007\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u0019\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u000b"+
		"\u0000\u0000\u010c\u010d\u0003\u001c\u000e\u0000\u010d\u010e\u0005/\u0000"+
		"\u0000\u010e\u0116\u0003\u0004\u0002\u0000\u010f\u0110\u0005\f\u0000\u0000"+
		"\u0110\u0111\u0003\u001c\u000e\u0000\u0111\u0112\u0005/\u0000\u0000\u0112"+
		"\u0113\u0003\u0004\u0002\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114"+
		"\u010f\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117"+
		"\u011c\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\r\u0000\u0000\u011a\u011b\u0005/\u0000\u0000\u011b\u011d"+
		"\u0003\u0004\u0002\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u001b\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0006\u000e\uffff\uffff\u0000\u011f\u0120\u0005\u0014\u0000\u0000\u0120"+
		"\u012c\u0003\u001c\u000e\u0005\u0121\u012c\u00036\u001b\u0000\u0122\u0128"+
		"\u0003\u001e\u000f\u0000\u0123\u0124\u0003$\u0012\u0000\u0124\u0125\u0003"+
		"\u001e\u000f\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0123\u0001"+
		"\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012c\u0001"+
		"\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u011e\u0001"+
		"\u0000\u0000\u0000\u012b\u0121\u0001\u0000\u0000\u0000\u012b\u0122\u0001"+
		"\u0000\u0000\u0000\u012c\u0135\u0001\u0000\u0000\u0000\u012d\u012e\n\u0004"+
		"\u0000\u0000\u012e\u012f\u0005\u0012\u0000\u0000\u012f\u0134\u0003\u001c"+
		"\u000e\u0005\u0130\u0131\n\u0003\u0000\u0000\u0131\u0132\u0005\u0013\u0000"+
		"\u0000\u0132\u0134\u0003\u001c\u000e\u0004\u0133\u012d\u0001\u0000\u0000"+
		"\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000"+
		"\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u001d\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0138\u013b\u0003 \u0010\u0000\u0139\u013b\u0003\"\u0011\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u001f\u0001\u0000\u0000\u0000\u013c\u013d\u0006\u0010\uffff\uffff"+
		"\u0000\u013d\u013e\u00034\u001a\u0000\u013e\u015f\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\n\u0003\u0000\u0000\u0140\u0141\u0005@\u0000\u0000\u0141"+
		"\u015e\u0003 \u0010\u0004\u0142\u0143\n\u0004\u0000\u0000\u0143\u0145"+
		"\u00058\u0000\u0000\u0144\u0146\u0003B!\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u015e\u00059\u0000\u0000\u0148\u0149\n\u0002\u0000"+
		"\u0000\u0149\u014a\u0005:\u0000\u0000\u014a\u014b\u0003\u001e\u000f\u0000"+
		"\u014b\u014c\u0005;\u0000\u0000\u014c\u015e\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\n\u0001\u0000\u0000\u014e\u0150\u0005:\u0000\u0000\u014f\u0151"+
		"\u0003\u001e\u000f\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154"+
		"\u0005/\u0000\u0000\u0153\u0155\u0003\u001e\u000f\u0000\u0154\u0153\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u015a\u0001"+
		"\u0000\u0000\u0000\u0156\u0158\u0005/\u0000\u0000\u0157\u0159\u0003\u001e"+
		"\u000f\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0156\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000"+
		"\u0000\u0000\u015c\u015e\u0005;\u0000\u0000\u015d\u013f\u0001\u0000\u0000"+
		"\u0000\u015d\u0142\u0001\u0000\u0000\u0000\u015d\u0148\u0001\u0000\u0000"+
		"\u0000\u015d\u014d\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000"+
		"\u0000\u0160!\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u00058\u0000\u0000\u0163\u0164\u0003*\u0015\u0000\u0164\u0165"+
		"\u00059\u0000\u0000\u0165\u0195\u0001\u0000\u0000\u0000\u0166\u0167\u0005"+
		":\u0000\u0000\u0167\u0168\u0003*\u0015\u0000\u0168\u0169\u0005;\u0000"+
		"\u0000\u0169\u0195\u0001\u0000\u0000\u0000\u016a\u016c\u0005<\u0000\u0000"+
		"\u016b\u016d\u0003:\u001d\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e"+
		"\u0195\u0005=\u0000\u0000\u016f\u0173\u0005<\u0000\u0000\u0170\u0172\u0005"+
		"5\u0000\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000"+
		"\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0176\u0181\u0003 \u0010\u0000\u0177\u017b\u00051\u0000\u0000"+
		"\u0178\u017a\u00055\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017e\u0180\u0003 \u0010\u0000\u017f\u0177"+
		"\u0001\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0185"+
		"\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0186"+
		"\u00051\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u018a\u0001\u0000\u0000\u0000\u0187\u0189\u0005"+
		"5\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000"+
		"\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000"+
		"\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0005=\u0000\u0000\u018e\u0195\u0001\u0000\u0000"+
		"\u0000\u018f\u0191\u0005:\u0000\u0000\u0190\u0192\u00038\u001c\u0000\u0191"+
		"\u0190\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0005;\u0000\u0000\u0194\u0162"+
		"\u0001\u0000\u0000\u0000\u0194\u0166\u0001\u0000\u0000\u0000\u0194\u016a"+
		"\u0001\u0000\u0000\u0000\u0194\u016f\u0001\u0000\u0000\u0000\u0194\u018f"+
		"\u0001\u0000\u0000\u0000\u0195#\u0001\u0000\u0000\u0000\u0196\u01a4\u0005"+
		"(\u0000\u0000\u0197\u01a4\u0005\'\u0000\u0000\u0198\u01a4\u0005 \u0000"+
		"\u0000\u0199\u01a4\u0005\"\u0000\u0000\u019a\u01a4\u0005#\u0000\u0000"+
		"\u019b\u01a4\u0005!\u0000\u0000\u019c\u01a4\u0005\u0013\u0000\u0000\u019d"+
		"\u01a4\u0005\u000f\u0000\u0000\u019e\u019f\u0005\u0014\u0000\u0000\u019f"+
		"\u01a4\u0005\u000f\u0000\u0000\u01a0\u01a4\u0005\u0018\u0000\u0000\u01a1"+
		"\u01a2\u0005\u0018\u0000\u0000\u01a2\u01a4\u0005\u0014\u0000\u0000\u01a3"+
		"\u0196\u0001\u0000\u0000\u0000\u01a3\u0197\u0001\u0000\u0000\u0000\u01a3"+
		"\u0198\u0001\u0000\u0000\u0000\u01a3\u0199\u0001\u0000\u0000\u0000\u01a3"+
		"\u019a\u0001\u0000\u0000\u0000\u01a3\u019b\u0001\u0000\u0000\u0000\u01a3"+
		"\u019c\u0001\u0000\u0000\u0000\u01a3\u019d\u0001\u0000\u0000\u0000\u01a3"+
		"\u019e\u0001\u0000\u0000\u0000\u01a3\u01a0\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a4%\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0003\u001e\u000f\u0000\u01a6\u01a7\u0005&\u0000\u0000\u01a7\u01a9\u0003"+
		"\u001e\u000f\u0000\u01a8\u01aa\u00055\u0000\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01d6\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0003\u001e\u000f\u0000\u01ac\u01ad\u0005&\u0000"+
		"\u0000\u01ad\u01af\u0003\u001c\u000e\u0000\u01ae\u01b0\u00055\u0000\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01d6\u0001\u0000\u0000\u0000\u01b1\u01b2\u0003\u001e\u000f\u0000"+
		"\u01b2\u01b3\u0005&\u0000\u0000\u01b3\u01b5\u0003@ \u0000\u01b4\u01b6"+
		"\u00055\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b6\u01d6\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003"+
		"\u001e\u000f\u0000\u01b8\u01b9\u0005&\u0000\u0000\u01b9\u01bb\u0003(\u0014"+
		"\u0000\u01ba\u01bc\u00055\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01d6\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0003\u001e\u000f\u0000\u01be\u01bf\u0005+\u0000\u0000\u01bf"+
		"\u01c1\u0003\u001e\u000f\u0000\u01c0\u01c2\u00055\u0000\u0000\u01c1\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01d6"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0003\u001e\u000f\u0000\u01c4\u01c5"+
		"\u0005,\u0000\u0000\u01c5\u01c7\u0003\u001e\u000f\u0000\u01c6\u01c8\u0005"+
		"5\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01d6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003\u001e"+
		"\u000f\u0000\u01ca\u01cb\u0005-\u0000\u0000\u01cb\u01cd\u0003\u001e\u000f"+
		"\u0000\u01cc\u01ce\u00055\u0000\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d6\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0003\u001e\u000f\u0000\u01d0\u01d1\u0005.\u0000\u0000\u01d1"+
		"\u01d3\u0003\u001e\u000f\u0000\u01d2\u01d4\u00055\u0000\u0000\u01d3\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d5\u01a5\u0001\u0000\u0000\u0000\u01d5\u01ab"+
		"\u0001\u0000\u0000\u0000\u01d5\u01b1\u0001\u0000\u0000\u0000\u01d5\u01b7"+
		"\u0001\u0000\u0000\u0000\u01d5\u01bd\u0001\u0000\u0000\u0000\u01d5\u01c3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01c9\u0001\u0000\u0000\u0000\u01d5\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d6\'\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005"+
		"A\u0000\u0000\u01d8)\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\u000e\u0000"+
		"\u0000\u01da\u01db\u00034\u001a\u0000\u01db\u01dc\u0005\u000f\u0000\u0000"+
		"\u01dc\u01de\u0003\u001e\u000f\u0000\u01dd\u01df\u0005/\u0000\u0000\u01de"+
		"\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003\u0004\u0002\u0000\u01e1"+
		"\u01ec\u0001\u0000\u0000\u0000\u01e2\u01e3\u00034\u001a\u0000\u01e3\u01e4"+
		"\u0005\u000e\u0000\u0000\u01e4\u01e5\u00034\u001a\u0000\u01e5\u01e6\u0005"+
		"\u000f\u0000\u0000\u01e6\u01e9\u0003\u001e\u000f\u0000\u01e7\u01e8\u0005"+
		"\u000b\u0000\u0000\u01e8\u01ea\u0003\u001c\u000e\u0000\u01e9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001"+
		"\u0000\u0000\u0000\u01eb\u01d9\u0001\u0000\u0000\u0000\u01eb\u01e2\u0001"+
		"\u0000\u0000\u0000\u01ec+\u0001\u0000\u0000\u0000\u01ed\u01ef\u0003.\u0017"+
		"\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005\u0006\u0000"+
		"\u0000\u01f1\u01f2\u00057\u0000\u0000\u01f2\u01f3\u00030\u0018\u0000\u01f3"+
		"\u01f4\u0005/\u0000\u0000\u01f4\u01f5\u0003\u0004\u0002\u0000\u01f5-\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0005\u001f\u0000\u0000\u01f7\u01fc\u0005"+
		"7\u0000\u0000\u01f8\u01f9\u0005@\u0000\u0000\u01f9\u01fb\u00057\u0000"+
		"\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u0204\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000"+
		"\u0000\u01ff\u0201\u00058\u0000\u0000\u0200\u0202\u0003B!\u0000\u0201"+
		"\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203\u0205\u00059\u0000\u0000\u0204\u01ff"+
		"\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u00055\u0000\u0000\u0207/\u0001\u0000"+
		"\u0000\u0000\u0208\u020a\u00058\u0000\u0000\u0209\u020b\u00032\u0019\u0000"+
		"\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u00059\u0000\u0000\u020d"+
		"1\u0001\u0000\u0000\u0000\u020e\u0213\u00057\u0000\u0000\u020f\u0210\u0005"+
		"1\u0000\u0000\u0210\u0212\u00057\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000"+
		"\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u021c\u0001\u0000\u0000"+
		"\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u0217\u00051\u0000\u0000"+
		"\u0217\u0218\u00057\u0000\u0000\u0218\u0219\u0005&\u0000\u0000\u0219\u021b"+
		"\u00034\u001a\u0000\u021a\u0216\u0001\u0000\u0000\u0000\u021b\u021e\u0001"+
		"\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001"+
		"\u0000\u0000\u0000\u021d\u022c\u0001\u0000\u0000\u0000\u021e\u021c\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u00057\u0000\u0000\u0220\u0221\u0005&\u0000"+
		"\u0000\u0221\u0228\u00034\u001a\u0000\u0222\u0223\u00051\u0000\u0000\u0223"+
		"\u0224\u00057\u0000\u0000\u0224\u0225\u0005&\u0000\u0000\u0225\u0227\u0003"+
		"4\u001a\u0000\u0226\u0222\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000"+
		"\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000"+
		"\u0000\u0000\u022b\u020e\u0001\u0000\u0000\u0000\u022b\u021f\u0001\u0000"+
		"\u0000\u0000\u022c3\u0001\u0000\u0000\u0000\u022d\u0236\u00057\u0000\u0000"+
		"\u022e\u0236\u00056\u0000\u0000\u022f\u0236\u0005\u0004\u0000\u0000\u0230"+
		"\u0236\u0005\u0003\u0000\u0000\u0231\u0236\u0005A\u0000\u0000\u0232\u0236"+
		"\u0005B\u0000\u0000\u0233\u0236\u0005\u0017\u0000\u0000\u0234\u0236\u0003"+
		"6\u001b\u0000\u0235\u022d\u0001\u0000\u0000\u0000\u0235\u022e\u0001\u0000"+
		"\u0000\u0000\u0235\u022f\u0001\u0000\u0000\u0000\u0235\u0230\u0001\u0000"+
		"\u0000\u0000\u0235\u0231\u0001\u0000\u0000\u0000\u0235\u0232\u0001\u0000"+
		"\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0234\u0001\u0000"+
		"\u0000\u0000\u02365\u0001\u0000\u0000\u0000\u0237\u023a\u0005\u0015\u0000"+
		"\u0000\u0238\u023a\u0005\u0016\u0000\u0000\u0239\u0237\u0001\u0000\u0000"+
		"\u0000\u0239\u0238\u0001\u0000\u0000\u0000\u023a7\u0001\u0000\u0000\u0000"+
		"\u023b\u023d\u00055\u0000\u0000\u023c\u023b\u0001\u0000\u0000\u0000\u023d"+
		"\u0240\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0001\u0000\u0000\u0000\u023f\u0241\u0001\u0000\u0000\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0241\u024c\u0003 \u0010\u0000\u0242\u0246"+
		"\u00051\u0000\u0000\u0243\u0245\u00055\u0000\u0000\u0244\u0243\u0001\u0000"+
		"\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0249\u0001\u0000"+
		"\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024b\u0003 \u0010"+
		"\u0000\u024a\u0242\u0001\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000"+
		"\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000"+
		"\u0000\u024f\u0251\u00051\u0000\u0000\u0250\u024f\u0001\u0000\u0000\u0000"+
		"\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0255\u0001\u0000\u0000\u0000"+
		"\u0252\u0254\u00055\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254"+
		"\u0257\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0001\u0000\u0000\u0000\u02569\u0001\u0000\u0000\u0000\u0257\u0255"+
		"\u0001\u0000\u0000\u0000\u0258\u025a\u00055\u0000\u0000\u0259\u0258\u0001"+
		"\u0000\u0000\u0000\u025a\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025e\u0001"+
		"\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000\u0000\u025e\u0269\u0003"+
		"<\u001e\u0000\u025f\u0263\u00051\u0000\u0000\u0260\u0262\u00055\u0000"+
		"\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000"+
		"\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000"+
		"\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000"+
		"\u0000\u0266\u0268\u0003<\u001e\u0000\u0267\u025f\u0001\u0000\u0000\u0000"+
		"\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d\u0001\u0000\u0000\u0000"+
		"\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026e\u00051\u0000\u0000\u026d"+
		"\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e"+
		"\u0272\u0001\u0000\u0000\u0000\u026f\u0271\u00055\u0000\u0000\u0270\u026f"+
		"\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000\u0000\u0000\u0272\u0270"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273;\u0001"+
		"\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0276\u0003"+
		"4\u001a\u0000\u0276\u0277\u0005/\u0000\u0000\u0277\u0278\u00034\u001a"+
		"\u0000\u0278\u0282\u0001\u0000\u0000\u0000\u0279\u027a\u00034\u001a\u0000"+
		"\u027a\u027b\u0005/\u0000\u0000\u027b\u027c\u0003>\u001f\u0000\u027c\u0282"+
		"\u0001\u0000\u0000\u0000\u027d\u027e\u0003\u001e\u000f\u0000\u027e\u027f"+
		"\u0005/\u0000\u0000\u027f\u0280\u0003\u001e\u000f\u0000\u0280\u0282\u0001"+
		"\u0000\u0000\u0000\u0281\u0275\u0001\u0000\u0000\u0000\u0281\u0279\u0001"+
		"\u0000\u0000\u0000\u0281\u027d\u0001\u0000\u0000\u0000\u0282=\u0001\u0000"+
		"\u0000\u0000\u0283\u0286\u0003@ \u0000\u0284\u0286\u0003\u001c\u000e\u0000"+
		"\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000"+
		"\u0286?\u0001\u0000\u0000\u0000\u0287\u028a\u0003\u001e\u000f\u0000\u0288"+
		"\u0289\u00052\u0000\u0000\u0289\u028b\u0003\u001e\u000f\u0000\u028a\u0288"+
		"\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000\u0000\u028c\u028a"+
		"\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u02a4"+
		"\u0001\u0000\u0000\u0000\u028e\u0291\u0003\u001e\u000f\u0000\u028f\u0290"+
		"\u00053\u0000\u0000\u0290\u0292\u0003\u001e\u000f\u0000\u0291\u028f\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0291\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u02a4\u0001"+
		"\u0000\u0000\u0000\u0295\u0298\u0003\u001e\u000f\u0000\u0296\u0297\u0005"+
		")\u0000\u0000\u0297\u0299\u0003\u001e\u000f\u0000\u0298\u0296\u0001\u0000"+
		"\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u0298\u0001\u0000"+
		"\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u02a4\u0001\u0000"+
		"\u0000\u0000\u029c\u029f\u0003\u001e\u000f\u0000\u029d\u029e\u0005*\u0000"+
		"\u0000\u029e\u02a0\u0003\u001e\u000f\u0000\u029f\u029d\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a3\u0287\u0001\u0000\u0000\u0000\u02a3\u028e\u0001\u0000\u0000"+
		"\u0000\u02a3\u0295\u0001\u0000\u0000\u0000\u02a3\u029c\u0001\u0000\u0000"+
		"\u0000\u02a4A\u0001\u0000\u0000\u0000\u02a5\u02a7\u00055\u0000\u0000\u02a6"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9"+
		"\u02ab\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab"+
		"\u02b6\u00034\u001a\u0000\u02ac\u02b0\u00051\u0000\u0000\u02ad\u02af\u0005"+
		"5\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b3\u02b5\u00034\u001a\u0000\u02b4\u02ac\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9\u02bb\u00051\u0000\u0000"+
		"\u02ba\u02b9\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bf\u0001\u0000\u0000\u0000\u02bc\u02be\u00055\u0000\u0000\u02bd"+
		"\u02bc\u0001\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0"+
		"\u02e0\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c4\u00055\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c8\u0001\u0000\u0000\u0000\u02c7\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c8\u02d3\u0003D\"\u0000\u02c9\u02cd\u0005"+
		"1\u0000\u0000\u02ca\u02cc\u00055\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cf\u0001\u0000\u0000\u0000\u02cd\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d0\u0001\u0000\u0000"+
		"\u0000\u02cf\u02cd\u0001\u0000\u0000\u0000\u02d0\u02d2\u0003D\"\u0000"+
		"\u02d1\u02c9\u0001\u0000\u0000\u0000\u02d2\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d7\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d8\u00051\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d8\u0001\u0000\u0000\u0000\u02d8\u02dc\u0001\u0000\u0000\u0000\u02d9"+
		"\u02db\u00055\u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02db\u02de"+
		"\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02dd"+
		"\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000\u0000\u0000\u02de\u02dc"+
		"\u0001\u0000\u0000\u0000\u02df\u02a8\u0001\u0000\u0000\u0000\u02df\u02c5"+
		"\u0001\u0000\u0000\u0000\u02e0C\u0001\u0000\u0000\u0000\u02e1\u02e6\u0003"+
		"\u001e\u000f\u0000\u02e2\u02e3\u00057\u0000\u0000\u02e3\u02e4\u0005&\u0000"+
		"\u0000\u02e4\u02e6\u0003\u001e\u000f\u0000\u02e5\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e2\u0001\u0000\u0000\u0000\u02e6E\u0001\u0000\u0000\u0000"+
		"oIOW\\ckosw{\u007f\u0083\u0087\u008b\u008f\u0093\u0097\u009b\u009f\u00a3"+
		"\u00a7\u00aa\u00b2\u00b7\u00c2\u00c7\u00cc\u00d2\u00d4\u00dd\u00e0\u00e9"+
		"\u00f1\u00fa\u0103\u0109\u0116\u011c\u0128\u012b\u0133\u0135\u013a\u0145"+
		"\u0150\u0154\u0158\u015a\u015d\u015f\u016c\u0173\u017b\u0181\u0185\u018a"+
		"\u0191\u0194\u01a3\u01a9\u01af\u01b5\u01bb\u01c1\u01c7\u01cd\u01d3\u01d5"+
		"\u01de\u01e9\u01eb\u01ee\u01fc\u0201\u0204\u020a\u0213\u021c\u0228\u022b"+
		"\u0235\u0239\u023e\u0246\u024c\u0250\u0255\u025b\u0263\u0269\u026d\u0272"+
		"\u0281\u0285\u028c\u0293\u029a\u02a1\u02a3\u02a8\u02b0\u02b6\u02ba\u02bf"+
		"\u02c5\u02cd\u02d3\u02d7\u02dc\u02df\u02e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}