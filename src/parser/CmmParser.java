// Generated from C:/Users/Laura/IdeaProjects/dlp2/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, SINGLE_LINE_COMMENT=37, 
		MULTIPLE_LINE_COMMENT=38, ID=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, 
		WS=43;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_type = 3, 
		RULE_block = 4, RULE_varDefinition = 5, RULE_functionDefinition = 6, RULE_returnType = 7, 
		RULE_functionBody = 8, RULE_functionInvocation = 9, RULE_builtin = 10, 
		RULE_main = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "type", "block", "varDefinition", 
			"functionDefinition", "returnType", "functionBody", "functionInvocation", 
			"builtin", "main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", 
			"'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", 
			"'='", "';'", "'write'", "','", "'read'", "'while'", "'if'", "'else'", 
			"'return'", "'struct'", "'{'", "'}'", "'void'", "'int'", "'double'", 
			"'char'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "SINGLE_LINE_COMMENT", "MULTIPLE_LINE_COMMENT", "ID", "INT_CONSTANT", 
			"REAL_CONSTANT", "CHAR_CONSTANT", "WS"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(26);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(24);
						varDefinition();
						}
						break;
					case 2:
						{
						setState(25);
						functionDefinition();
						}
						break;
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(31);
			main();
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(34);
				match(T__0);
				setState(35);
				expression(0);
				setState(36);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(38);
				match(T__0);
				setState(39);
				builtin();
				setState(40);
				match(T__1);
				setState(41);
				expression(12);
				}
				break;
			case 3:
				{
				setState(43);
				match(T__5);
				setState(44);
				expression(11);
				}
				break;
			case 4:
				{
				setState(45);
				match(T__6);
				setState(46);
				expression(10);
				}
				break;
			case 5:
				{
				setState(47);
				functionInvocation();
				}
				break;
			case 6:
				{
				setState(48);
				match(ID);
				}
				break;
			case 7:
				{
				setState(49);
				match(INT_CONSTANT);
				}
				break;
			case 8:
				{
				setState(50);
				match(REAL_CONSTANT);
				}
				break;
			case 9:
				{
				setState(51);
				match(CHAR_CONSTANT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(55);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(58);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(61);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(62);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(64);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(65);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(67);
						match(T__2);
						setState(68);
						expression(0);
						setState(69);
						match(T__3);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(72);
						match(T__4);
						setState(73);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FunctionInvocationContext functionInvocation() {
			return getRuleContext(FunctionInvocationContext.class,0);
		}
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				expression(0);
				setState(80);
				match(T__19);
				setState(81);
				expression(0);
				setState(82);
				match(T__20);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__21);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(85);
							expression(0);
							setState(86);
							match(T__22);
							}
							} 
						}
						setState(92);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					setState(93);
					expression(0);
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208514L) != 0) );
				setState(98);
				match(T__20);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(T__23);
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(101);
							expression(0);
							setState(102);
							match(T__22);
							}
							} 
						}
						setState(108);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					setState(109);
					expression(0);
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208514L) != 0) );
				setState(114);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(T__24);
				setState(117);
				match(T__0);
				setState(118);
				expression(0);
				setState(119);
				match(T__1);
				setState(120);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(T__25);
				setState(123);
				match(T__0);
				setState(124);
				expression(0);
				setState(125);
				match(T__1);
				setState(126);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(T__25);
				setState(129);
				match(T__0);
				setState(130);
				expression(0);
				setState(131);
				match(T__1);
				setState(132);
				block();
				setState(133);
				match(T__26);
				setState(134);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				functionInvocation();
				setState(137);
				match(T__20);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(139);
				match(T__27);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208514L) != 0)) {
					{
					setState(140);
					expression(0);
					}
				}

				setState(143);
				match(T__20);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				varDefinition();
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
	public static class TypeContext extends ParserRuleContext {
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				{
				setState(148);
				builtin();
				}
				break;
			case T__28:
				{
				setState(149);
				match(T__28);
				setState(150);
				match(T__29);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60666413056L) != 0)) {
					{
					{
					setState(151);
					varDefinition();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(160);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(161);
					match(T__2);
					setState(162);
					match(INT_CONSTANT);
					setState(163);
					match(T__3);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__29);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8307393691842L) != 0)) {
					{
					{
					setState(170);
					statement();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(T__30);
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__21:
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__32:
			case T__33:
			case T__34:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				statement();
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
	public static class VarDefinitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			type(0);
			setState(181);
			match(ID);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(182);
				match(T__22);
				setState(183);
				match(ID);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(T__20);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<BuiltinContext> builtin() {
			return getRuleContexts(BuiltinContext.class);
		}
		public BuiltinContext builtin(int i) {
			return getRuleContext(BuiltinContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			returnType();
			setState(192);
			match(ID);
			setState(193);
			match(T__0);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
				{
				{
				{
				setState(194);
				builtin();
				setState(195);
				match(ID);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__22) {
					{
					{
					setState(197);
					match(T__22);
					setState(198);
					builtin();
					setState(199);
					match(ID);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(T__1);
			setState(212);
			match(T__29);
			setState(213);
			functionBody();
			setState(214);
			match(T__30);
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnType);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				builtin();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(T__31);
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60666413056L) != 0)) {
				{
				{
				setState(220);
				varDefinition();
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(221);
						statement();
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				}
				setState(231);
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
	public static class FunctionInvocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvocation; }
	}

	public final FunctionInvocationContext functionInvocation() throws RecognitionException {
		FunctionInvocationContext _localctx = new FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionInvocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ID);
			setState(233);
			match(T__0);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208514L) != 0)) {
				{
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234);
						expression(0);
						setState(235);
						match(T__22);
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(242);
				expression(0);
				}
			}

			setState(245);
			match(T__1);
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
	public static class BuiltinContext extends ParserRuleContext {
		public BuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin; }
	}

	public final BuiltinContext builtin() throws RecognitionException {
		BuiltinContext _localctx = new BuiltinContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_builtin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class MainContext extends ParserRuleContext {
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__31);
			setState(250);
			match(T__35);
			setState(251);
			match(T__0);
			setState(252);
			match(T__1);
			setState(253);
			match(T__29);
			setState(254);
			functionBody();
			setState(255);
			match(T__30);
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
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0102\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001b\b\u0000\n\u0000\f\u0000\u001e\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001K\b\u0001\n\u0001\f\u0001N\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002Y\b\u0002\n\u0002\f\u0002\\\t\u0002"+
		"\u0001\u0002\u0004\u0002_\b\u0002\u000b\u0002\f\u0002`\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002i\b"+
		"\u0002\n\u0002\f\u0002l\t\u0002\u0001\u0002\u0004\u0002o\b\u0002\u000b"+
		"\u0002\f\u0002p\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008e"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0092\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0099\b\u0003"+
		"\n\u0003\f\u0003\u009c\t\u0003\u0001\u0003\u0003\u0003\u009f\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a5\b\u0003\n"+
		"\u0003\f\u0003\u00a8\t\u0003\u0001\u0004\u0001\u0004\u0005\u0004\u00ac"+
		"\b\u0004\n\u0004\f\u0004\u00af\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00b9\b\u0005\n\u0005\f\u0005\u00bc\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ca\b\u0006\n"+
		"\u0006\f\u0006\u00cd\t\u0006\u0005\u0006\u00cf\b\u0006\n\u0006\f\u0006"+
		"\u00d2\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00db\b\u0007\u0001\b\u0001\b\u0005"+
		"\b\u00df\b\b\n\b\f\b\u00e2\t\b\u0005\b\u00e4\b\b\n\b\f\b\u00e7\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ee\b\t\n\t\f\t\u00f1\t\t"+
		"\u0001\t\u0003\t\u00f4\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0002\u0002\u0006\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0005\u0001\u0000\b\n\u0002"+
		"\u0000\u0006\u0006\u000b\u000b\u0001\u0000\f\u0011\u0001\u0000\u0012\u0013"+
		"\u0001\u0000!#\u011f\u0000\u001c\u0001\u0000\u0000\u0000\u00024\u0001"+
		"\u0000\u0000\u0000\u0004\u0091\u0001\u0000\u0000\u0000\u0006\u009e\u0001"+
		"\u0000\u0000\u0000\b\u00b2\u0001\u0000\u0000\u0000\n\u00b4\u0001\u0000"+
		"\u0000\u0000\f\u00bf\u0001\u0000\u0000\u0000\u000e\u00da\u0001\u0000\u0000"+
		"\u0000\u0010\u00e5\u0001\u0000\u0000\u0000\u0012\u00e8\u0001\u0000\u0000"+
		"\u0000\u0014\u00f7\u0001\u0000\u0000\u0000\u0016\u00f9\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0003\n\u0005\u0000\u0019\u001b\u0003\f\u0006\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001e\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001f\u0001\u0000\u0000\u0000"+
		"\u001e\u001c\u0001\u0000\u0000\u0000\u001f \u0003\u0016\u000b\u0000 \u0001"+
		"\u0001\u0000\u0000\u0000!\"\u0006\u0001\uffff\uffff\u0000\"#\u0005\u0001"+
		"\u0000\u0000#$\u0003\u0002\u0001\u0000$%\u0005\u0002\u0000\u0000%5\u0001"+
		"\u0000\u0000\u0000&\'\u0005\u0001\u0000\u0000\'(\u0003\u0014\n\u0000("+
		")\u0005\u0002\u0000\u0000)*\u0003\u0002\u0001\f*5\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0006\u0000\u0000,5\u0003\u0002\u0001\u000b-.\u0005\u0007\u0000"+
		"\u0000.5\u0003\u0002\u0001\n/5\u0003\u0012\t\u000005\u0005\'\u0000\u0000"+
		"15\u0005(\u0000\u000025\u0005)\u0000\u000035\u0005*\u0000\u00004!\u0001"+
		"\u0000\u0000\u00004&\u0001\u0000\u0000\u00004+\u0001\u0000\u0000\u0000"+
		"4-\u0001\u0000\u0000\u00004/\u0001\u0000\u0000\u000040\u0001\u0000\u0000"+
		"\u000041\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000043\u0001\u0000"+
		"\u0000\u00005L\u0001\u0000\u0000\u000067\n\t\u0000\u000078\u0007\u0000"+
		"\u0000\u00008K\u0003\u0002\u0001\n9:\n\b\u0000\u0000:;\u0007\u0001\u0000"+
		"\u0000;K\u0003\u0002\u0001\t<=\n\u0007\u0000\u0000=>\u0007\u0002\u0000"+
		"\u0000>K\u0003\u0002\u0001\b?@\n\u0006\u0000\u0000@A\u0007\u0003\u0000"+
		"\u0000AK\u0003\u0002\u0001\u0007BC\n\u000e\u0000\u0000CD\u0005\u0003\u0000"+
		"\u0000DE\u0003\u0002\u0001\u0000EF\u0005\u0004\u0000\u0000FK\u0001\u0000"+
		"\u0000\u0000GH\n\r\u0000\u0000HI\u0005\u0005\u0000\u0000IK\u0005\'\u0000"+
		"\u0000J6\u0001\u0000\u0000\u0000J9\u0001\u0000\u0000\u0000J<\u0001\u0000"+
		"\u0000\u0000J?\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JG\u0001"+
		"\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OP\u0003\u0002\u0001\u0000PQ\u0005\u0014\u0000\u0000QR\u0003"+
		"\u0002\u0001\u0000RS\u0005\u0015\u0000\u0000S\u0092\u0001\u0000\u0000"+
		"\u0000T^\u0005\u0016\u0000\u0000UV\u0003\u0002\u0001\u0000VW\u0005\u0017"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XU\u0001\u0000\u0000\u0000Y\\\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0003\u0002\u0001"+
		"\u0000^Z\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0015\u0000\u0000c\u0092\u0001\u0000\u0000\u0000dn\u0005\u0018\u0000"+
		"\u0000ef\u0003\u0002\u0001\u0000fg\u0005\u0017\u0000\u0000gi\u0001\u0000"+
		"\u0000\u0000he\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000mo\u0003\u0002\u0001\u0000nj\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005\u0015\u0000\u0000s\u0092"+
		"\u0001\u0000\u0000\u0000tu\u0005\u0019\u0000\u0000uv\u0005\u0001\u0000"+
		"\u0000vw\u0003\u0002\u0001\u0000wx\u0005\u0002\u0000\u0000xy\u0003\b\u0004"+
		"\u0000y\u0092\u0001\u0000\u0000\u0000z{\u0005\u001a\u0000\u0000{|\u0005"+
		"\u0001\u0000\u0000|}\u0003\u0002\u0001\u0000}~\u0005\u0002\u0000\u0000"+
		"~\u007f\u0003\b\u0004\u0000\u007f\u0092\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u001a\u0000\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082"+
		"\u0083\u0003\u0002\u0001\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084"+
		"\u0085\u0003\b\u0004\u0000\u0085\u0086\u0005\u001b\u0000\u0000\u0086\u0087"+
		"\u0003\b\u0004\u0000\u0087\u0092\u0001\u0000\u0000\u0000\u0088\u0089\u0003"+
		"\u0012\t\u0000\u0089\u008a\u0005\u0015\u0000\u0000\u008a\u0092\u0001\u0000"+
		"\u0000\u0000\u008b\u008d\u0005\u001c\u0000\u0000\u008c\u008e\u0003\u0002"+
		"\u0001\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0005\u0015"+
		"\u0000\u0000\u0090\u0092\u0003\n\u0005\u0000\u0091O\u0001\u0000\u0000"+
		"\u0000\u0091T\u0001\u0000\u0000\u0000\u0091d\u0001\u0000\u0000\u0000\u0091"+
		"t\u0001\u0000\u0000\u0000\u0091z\u0001\u0000\u0000\u0000\u0091\u0080\u0001"+
		"\u0000\u0000\u0000\u0091\u0088\u0001\u0000\u0000\u0000\u0091\u008b\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0005\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0006\u0003\uffff\uffff\u0000\u0094\u009f"+
		"\u0003\u0014\n\u0000\u0095\u0096\u0005\u001d\u0000\u0000\u0096\u009a\u0005"+
		"\u001e\u0000\u0000\u0097\u0099\u0003\n\u0005\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u001f"+
		"\u0000\u0000\u009e\u0093\u0001\u0000\u0000\u0000\u009e\u0095\u0001\u0000"+
		"\u0000\u0000\u009f\u00a6\u0001\u0000\u0000\u0000\u00a0\u00a1\n\u0003\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0005(\u0000\u0000"+
		"\u00a3\u00a5\u0005\u0004\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u0007\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ad\u0005\u001e\u0000\u0000"+
		"\u00aa\u00ac\u0003\u0004\u0002\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b3\u0005\u001f\u0000\u0000"+
		"\u00b1\u00b3\u0003\u0004\u0002\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\t\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0003\u0006\u0003\u0000\u00b5\u00ba\u0005\'\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0017\u0000\u0000\u00b7\u00b9\u0005\'\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\u0015\u0000\u0000\u00be\u000b\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003"+
		"\u000e\u0007\u0000\u00c0\u00c1\u0005\'\u0000\u0000\u00c1\u00d0\u0005\u0001"+
		"\u0000\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c4\u0005\'\u0000"+
		"\u0000\u00c4\u00cb\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0017\u0000"+
		"\u0000\u00c6\u00c7\u0003\u0014\n\u0000\u00c7\u00c8\u0005\'\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00c2\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0002\u0000\u0000"+
		"\u00d4\u00d5\u0005\u001e\u0000\u0000\u00d5\u00d6\u0003\u0010\b\u0000\u00d6"+
		"\u00d7\u0005\u001f\u0000\u0000\u00d7\r\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0003\u0014\n\u0000\u00d9\u00db\u0005 \u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u000f\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e0\u0003\n\u0005\u0000\u00dd\u00df\u0003\u0004"+
		"\u0002\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00dc\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u0011\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\'\u0000\u0000\u00e9\u00f3\u0005\u0001\u0000"+
		"\u0000\u00ea\u00eb\u0003\u0002\u0001\u0000\u00eb\u00ec\u0005\u0017\u0000"+
		"\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f4\u0003\u0002\u0001"+
		"\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0002\u0000"+
		"\u0000\u00f6\u0013\u0001\u0000\u0000\u0000\u00f7\u00f8\u0007\u0004\u0000"+
		"\u0000\u00f8\u0015\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005 \u0000\u0000"+
		"\u00fa\u00fb\u0005$\u0000\u0000\u00fb\u00fc\u0005\u0001\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0002\u0000\u0000\u00fd\u00fe\u0005\u001e\u0000\u0000\u00fe"+
		"\u00ff\u0003\u0010\b\u0000\u00ff\u0100\u0005\u001f\u0000\u0000\u0100\u0017"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u001c4JLZ`jp\u008d\u0091\u009a\u009e"+
		"\u00a6\u00ad\u00b2\u00ba\u00cb\u00d0\u00da\u00e0\u00e5\u00ef\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}