// Generated from C:/Users/Laura/IdeaProjects/dlp2/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.expressions.*;
    import ast.program.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.types.builtin.*;

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
		T__31=32, T__32=33, T__33=34, SINGLE_LINE_COMMENT=35, MULTIPLE_LINE_COMMENT=36, 
		ID=37, INT_CONSTANT=38, REAL_CONSTANT=39, CHAR_CONSTANT=40, WS=41;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_expressionList = 3, 
		RULE_type = 4, RULE_block = 5, RULE_varDefinition = 6, RULE_functionDefinition = 7, 
		RULE_returnType = 8, RULE_functionBody = 9, RULE_functionInvocation = 10, 
		RULE_builtin = 11, RULE_main = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "expressionList", "type", "block", 
			"varDefinition", "functionDefinition", "returnType", "functionBody", 
			"functionInvocation", "builtin", "main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'%'", "'+'", 
			"'>'", "'>='", "'<'", "'<='", "'!='", "'=='", "'&&'", "'||'", "'='", 
			"';'", "'write'", "'read'", "'while'", "'if'", "'else'", "'return'", 
			"','", "'struct'", "'{'", "'}'", "'void'", "'int'", "'double'", "'char'", 
			"'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "SINGLE_LINE_COMMENT", 
			"MULTIPLE_LINE_COMMENT", "ID", "INT_CONSTANT", "REAL_CONSTANT", "CHAR_CONSTANT", 
			"WS"
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
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(28);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(26);
						varDefinition();
						}
						break;
					case 2:
						{
						setState(27);
						functionDefinition();
						}
						break;
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(33);
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
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext e;
		public BuiltinContext t;
		public Token OP;
		public Token ID;
		public Token IC;
		public Token RC;
		public Token CC;
		public ExpressionContext e2;
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(36);
				match(T__0);
				setState(37);
				expression(0);
				setState(38);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(40);
				match(T__0);
				setState(41);
				((ExpressionContext)_localctx).t = builtin();
				setState(42);
				match(T__1);
				setState(43);
				((ExpressionContext)_localctx).e = expression(13);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e.ast.getLine(), ((ExpressionContext)_localctx).e.ast.getColumn(), ((ExpressionContext)_localctx).t.ast, ((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 3:
				{
				setState(46);
				((ExpressionContext)_localctx).OP = match(T__5);
				setState(47);
				((ExpressionContext)_localctx).e = expression(12);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 4:
				{
				setState(50);
				((ExpressionContext)_localctx).OP = match(T__6);
				setState(51);
				((ExpressionContext)_localctx).e = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 5:
				{
				setState(54);
				functionInvocation();
				}
				break;
			case 6:
				{
				setState(55);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 7:
				{
				setState(57);
				((ExpressionContext)_localctx).IC = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new Int_Literal(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).IC!=null?((ExpressionContext)_localctx).IC.getText():null)));
				}
				break;
			case 8:
				{
				setState(59);
				((ExpressionContext)_localctx).RC = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new Real_Literal(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).RC!=null?((ExpressionContext)_localctx).RC.getText():null)));
				}
				break;
			case 9:
				{
				setState(61);
				((ExpressionContext)_localctx).CC = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new Char_Literal(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CC!=null?((ExpressionContext)_localctx).CC.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(66);
						match(T__7);
						}
						setState(67);
						((ExpressionContext)_localctx).e2 = expression(11);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(71);
						match(T__7);
						}
						setState(72);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).ast =  new Modulus(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(76);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__8) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						((ExpressionContext)_localctx).e2 = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(81);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expression(8);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(85);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(86);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						((ExpressionContext)_localctx).e2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(91);
						match(T__2);
						setState(92);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(93);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new Indexing(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(97);
						match(T__4);
						setState(98);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e.ast.getLine(), ((ExpressionContext)_localctx).e.ast.getColumn(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e.ast);
						}
						break;
					}
					} 
				}
				setState(104);
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
		public Statement ast;
		public List<Statement> list = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token W;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				((StatementContext)_localctx).e1 = expression(0);
				setState(106);
				match(T__17);
				setState(107);
				((StatementContext)_localctx).e2 = expression(0);
				setState(108);
				match(T__18);
				((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((StatementContext)_localctx).W = match(T__19);
				setState(112);
				expressionList();
				setState(113);
				match(T__18);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__20);
				setState(116);
				expressionList();
				setState(117);
				match(T__18);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__21);
				setState(120);
				match(T__0);
				setState(121);
				expression(0);
				setState(122);
				match(T__1);
				setState(123);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(T__22);
				setState(126);
				match(T__0);
				setState(127);
				expression(0);
				setState(128);
				match(T__1);
				setState(129);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				match(T__22);
				setState(132);
				match(T__0);
				setState(133);
				expression(0);
				setState(134);
				match(T__1);
				setState(135);
				block();
				setState(136);
				match(T__23);
				setState(137);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				functionInvocation();
				setState(140);
				match(T__18);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(T__24);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302274L) != 0)) {
					{
					setState(143);
					expression(0);
					}
				}

				setState(146);
				match(T__18);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionList);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				expression(0);
				setState(151);
				match(T__25);
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					expression(0);
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302274L) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				expression(0);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
				{
				setState(161);
				builtin();
				}
				break;
			case T__26:
				{
				setState(162);
				match(T__26);
				setState(163);
				match(T__27);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15166603264L) != 0)) {
					{
					{
					setState(164);
					varDefinition();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(173);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(174);
					match(T__2);
					setState(175);
					match(INT_CONSTANT);
					setState(176);
					match(T__3);
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__27);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2076800188610L) != 0)) {
					{
					{
					setState(183);
					statement();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__28);
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__24:
			case T__26:
			case T__30:
			case T__31:
			case T__32:
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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
		enterRule(_localctx, 12, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			type(0);
			setState(194);
			match(ID);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(195);
				match(T__25);
				setState(196);
				match(ID);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(T__18);
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
		enterRule(_localctx, 14, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			returnType();
			setState(205);
			match(ID);
			setState(206);
			match(T__0);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) {
				{
				{
				{
				setState(207);
				builtin();
				setState(208);
				match(ID);
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(210);
					match(T__25);
					setState(211);
					builtin();
					setState(212);
					match(ID);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(T__1);
			setState(225);
			match(T__27);
			setState(226);
			functionBody();
			setState(227);
			match(T__28);
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
		enterRule(_localctx, 16, RULE_returnType);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				builtin();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__29);
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
		enterRule(_localctx, 18, RULE_functionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15166603264L) != 0)) {
				{
				{
				setState(233);
				varDefinition();
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234);
						statement();
						}
						} 
					}
					setState(239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				}
				setState(244);
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
		enterRule(_localctx, 20, RULE_functionInvocation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(T__0);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2061584302274L) != 0)) {
				{
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(247);
						expression(0);
						setState(248);
						match(T__25);
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(255);
				expression(0);
				}
			}

			setState(258);
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
		public Type ast;
		public Token I;
		public Token D;
		public Token C;
		public BuiltinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin; }
	}

	public final BuiltinContext builtin() throws RecognitionException {
		BuiltinContext _localctx = new BuiltinContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_builtin);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((BuiltinContext)_localctx).I = match(T__30);
				((BuiltinContext)_localctx).ast =  new IntType(((BuiltinContext)_localctx).I.getLine(), ((BuiltinContext)_localctx).I.getCharPositionInLine()+1);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				((BuiltinContext)_localctx).D = match(T__31);
				((BuiltinContext)_localctx).ast =  new DoubleType(((BuiltinContext)_localctx).D.getLine(), ((BuiltinContext)_localctx).D.getCharPositionInLine()+1);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				((BuiltinContext)_localctx).C = match(T__32);
				((BuiltinContext)_localctx).ast =  new CharType(((BuiltinContext)_localctx).C.getLine(), ((BuiltinContext)_localctx).C.getCharPositionInLine()+1);
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
		enterRule(_localctx, 24, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__29);
			setState(269);
			match(T__33);
			setState(270);
			match(T__0);
			setState(271);
			match(T__1);
			setState(272);
			match(T__27);
			setState(273);
			functionBody();
			setState(274);
			match(T__28);
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
		case 4:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u0115\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000\n\u0000\f"+
		"\u0000 \t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001e\b\u0001\n\u0001\f\u0001h\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0091\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0095\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0004\u0003\u009a\b\u0003\u000b\u0003\f\u0003\u009b\u0001\u0003"+
		"\u0003\u0003\u009f\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00a6\b\u0004\n\u0004\f\u0004\u00a9\t\u0004\u0001"+
		"\u0004\u0003\u0004\u00ac\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00b2\b\u0004\n\u0004\f\u0004\u00b5\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00b9\b\u0005\n\u0005\f\u0005\u00bc\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00c0\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00c6\b\u0006\n\u0006\f\u0006\u00c9\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00d7\b\u0007\n\u0007\f\u0007\u00da\t\u0007\u0005\u0007\u00dc"+
		"\b\u0007\n\u0007\f\u0007\u00df\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00e8\b\b\u0001\t\u0001"+
		"\t\u0005\t\u00ec\b\t\n\t\f\t\u00ef\t\t\u0005\t\u00f1\b\t\n\t\f\t\u00f4"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00fb\b\n\n\n\f\n"+
		"\u00fe\t\n\u0001\n\u0003\n\u0101\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u010b"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0000\u0002\u0002\b\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0003\u0002\u0000\u0006\u0006\t\t\u0001"+
		"\u0000\n\u000f\u0001\u0000\u0010\u0011\u0132\u0000\u001e\u0001\u0000\u0000"+
		"\u0000\u0002?\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000\u0000"+
		"\u0006\u009e\u0001\u0000\u0000\u0000\b\u00ab\u0001\u0000\u0000\u0000\n"+
		"\u00bf\u0001\u0000\u0000\u0000\f\u00c1\u0001\u0000\u0000\u0000\u000e\u00cc"+
		"\u0001\u0000\u0000\u0000\u0010\u00e7\u0001\u0000\u0000\u0000\u0012\u00f2"+
		"\u0001\u0000\u0000\u0000\u0014\u00f5\u0001\u0000\u0000\u0000\u0016\u010a"+
		"\u0001\u0000\u0000\u0000\u0018\u010c\u0001\u0000\u0000\u0000\u001a\u001d"+
		"\u0003\f\u0006\u0000\u001b\u001d\u0003\u000e\u0007\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		"!\"\u0003\u0018\f\u0000\"\u0001\u0001\u0000\u0000\u0000#$\u0006\u0001"+
		"\uffff\uffff\u0000$%\u0005\u0001\u0000\u0000%&\u0003\u0002\u0001\u0000"+
		"&\'\u0005\u0002\u0000\u0000\'@\u0001\u0000\u0000\u0000()\u0005\u0001\u0000"+
		"\u0000)*\u0003\u0016\u000b\u0000*+\u0005\u0002\u0000\u0000+,\u0003\u0002"+
		"\u0001\r,-\u0006\u0001\uffff\uffff\u0000-@\u0001\u0000\u0000\u0000./\u0005"+
		"\u0006\u0000\u0000/0\u0003\u0002\u0001\f01\u0006\u0001\uffff\uffff\u0000"+
		"1@\u0001\u0000\u0000\u000023\u0005\u0007\u0000\u000034\u0003\u0002\u0001"+
		"\u000b45\u0006\u0001\uffff\uffff\u00005@\u0001\u0000\u0000\u00006@\u0003"+
		"\u0014\n\u000078\u0005%\u0000\u00008@\u0006\u0001\uffff\uffff\u00009:"+
		"\u0005&\u0000\u0000:@\u0006\u0001\uffff\uffff\u0000;<\u0005\'\u0000\u0000"+
		"<@\u0006\u0001\uffff\uffff\u0000=>\u0005(\u0000\u0000>@\u0006\u0001\uffff"+
		"\uffff\u0000?#\u0001\u0000\u0000\u0000?(\u0001\u0000\u0000\u0000?.\u0001"+
		"\u0000\u0000\u0000?2\u0001\u0000\u0000\u0000?6\u0001\u0000\u0000\u0000"+
		"?7\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000@f\u0001\u0000\u0000\u0000AB\n\n\u0000"+
		"\u0000BC\u0005\b\u0000\u0000CD\u0003\u0002\u0001\u000bDE\u0006\u0001\uffff"+
		"\uffff\u0000Ee\u0001\u0000\u0000\u0000FG\n\t\u0000\u0000GH\u0005\b\u0000"+
		"\u0000HI\u0003\u0002\u0001\nIJ\u0006\u0001\uffff\uffff\u0000Je\u0001\u0000"+
		"\u0000\u0000KL\n\b\u0000\u0000LM\u0007\u0000\u0000\u0000MN\u0003\u0002"+
		"\u0001\tNO\u0006\u0001\uffff\uffff\u0000Oe\u0001\u0000\u0000\u0000PQ\n"+
		"\u0007\u0000\u0000QR\u0007\u0001\u0000\u0000RS\u0003\u0002\u0001\bST\u0006"+
		"\u0001\uffff\uffff\u0000Te\u0001\u0000\u0000\u0000UV\n\u0006\u0000\u0000"+
		"VW\u0007\u0002\u0000\u0000WX\u0003\u0002\u0001\u0007XY\u0006\u0001\uffff"+
		"\uffff\u0000Ye\u0001\u0000\u0000\u0000Z[\n\u000f\u0000\u0000[\\\u0005"+
		"\u0003\u0000\u0000\\]\u0003\u0002\u0001\u0000]^\u0005\u0004\u0000\u0000"+
		"^_\u0006\u0001\uffff\uffff\u0000_e\u0001\u0000\u0000\u0000`a\n\u000e\u0000"+
		"\u0000ab\u0005\u0005\u0000\u0000bc\u0005%\u0000\u0000ce\u0006\u0001\uffff"+
		"\uffff\u0000dA\u0001\u0000\u0000\u0000dF\u0001\u0000\u0000\u0000dK\u0001"+
		"\u0000\u0000\u0000dP\u0001\u0000\u0000\u0000dU\u0001\u0000\u0000\u0000"+
		"dZ\u0001\u0000\u0000\u0000d`\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0003\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0003\u0002\u0001\u0000"+
		"jk\u0005\u0012\u0000\u0000kl\u0003\u0002\u0001\u0000lm\u0005\u0013\u0000"+
		"\u0000mn\u0006\u0002\uffff\uffff\u0000n\u0095\u0001\u0000\u0000\u0000"+
		"op\u0005\u0014\u0000\u0000pq\u0003\u0006\u0003\u0000qr\u0005\u0013\u0000"+
		"\u0000r\u0095\u0001\u0000\u0000\u0000st\u0005\u0015\u0000\u0000tu\u0003"+
		"\u0006\u0003\u0000uv\u0005\u0013\u0000\u0000v\u0095\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0016\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0003\u0002"+
		"\u0001\u0000z{\u0005\u0002\u0000\u0000{|\u0003\n\u0005\u0000|\u0095\u0001"+
		"\u0000\u0000\u0000}~\u0005\u0017\u0000\u0000~\u007f\u0005\u0001\u0000"+
		"\u0000\u007f\u0080\u0003\u0002\u0001\u0000\u0080\u0081\u0005\u0002\u0000"+
		"\u0000\u0081\u0082\u0003\n\u0005\u0000\u0082\u0095\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005\u0017\u0000\u0000\u0084\u0085\u0005\u0001\u0000\u0000"+
		"\u0085\u0086\u0003\u0002\u0001\u0000\u0086\u0087\u0005\u0002\u0000\u0000"+
		"\u0087\u0088\u0003\n\u0005\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089"+
		"\u008a\u0003\n\u0005\u0000\u008a\u0095\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0003\u0014\n\u0000\u008c\u008d\u0005\u0013\u0000\u0000\u008d\u0095\u0001"+
		"\u0000\u0000\u0000\u008e\u0090\u0005\u0019\u0000\u0000\u008f\u0091\u0003"+
		"\u0002\u0001\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0005"+
		"\u0013\u0000\u0000\u0093\u0095\u0003\f\u0006\u0000\u0094i\u0001\u0000"+
		"\u0000\u0000\u0094o\u0001\u0000\u0000\u0000\u0094s\u0001\u0000\u0000\u0000"+
		"\u0094w\u0001\u0000\u0000\u0000\u0094}\u0001\u0000\u0000\u0000\u0094\u0083"+
		"\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u008e"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0005"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0002\u0001\u0000\u0097\u0099"+
		"\u0005\u001a\u0000\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0003\u0002\u0001\u0000\u009e\u0096"+
		"\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u0007"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006\u0004\uffff\uffff\u0000\u00a1"+
		"\u00ac\u0003\u0016\u000b\u0000\u00a2\u00a3\u0005\u001b\u0000\u0000\u00a3"+
		"\u00a7\u0005\u001c\u0000\u0000\u00a4\u00a6\u0003\f\u0006\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ac"+
		"\u0005\u001d\u0000\u0000\u00ab\u00a0\u0001\u0000\u0000\u0000\u00ab\u00a2"+
		"\u0001\u0000\u0000\u0000\u00ac\u00b3\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\n\u0003\u0000\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b0\u0005"+
		"&\u0000\u0000\u00b0\u00b2\u0005\u0004\u0000\u0000\u00b1\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\t\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005\u001c\u0000"+
		"\u0000\u00b7\u00b9\u0003\u0004\u0002\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0005\u001d\u0000"+
		"\u0000\u00be\u00c0\u0003\u0004\u0002\u0000\u00bf\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u000b\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0003\b\u0004\u0000\u00c2\u00c7\u0005%\u0000\u0000"+
		"\u00c3\u00c4\u0005\u001a\u0000\u0000\u00c4\u00c6\u0005%\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0013\u0000\u0000\u00cb\r\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0003\u0010\b\u0000\u00cd\u00ce\u0005%\u0000\u0000\u00ce\u00dd\u0005"+
		"\u0001\u0000\u0000\u00cf\u00d0\u0003\u0016\u000b\u0000\u00d0\u00d1\u0005"+
		"%\u0000\u0000\u00d1\u00d8\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001a"+
		"\u0000\u0000\u00d3\u00d4\u0003\u0016\u000b\u0000\u00d4\u00d5\u0005%\u0000"+
		"\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00cf\u0001\u0000\u0000"+
		"\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000"+
		"\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0002\u0000"+
		"\u0000\u00e1\u00e2\u0005\u001c\u0000\u0000\u00e2\u00e3\u0003\u0012\t\u0000"+
		"\u00e3\u00e4\u0005\u001d\u0000\u0000\u00e4\u000f\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e8\u0003\u0016\u000b\u0000\u00e6\u00e8\u0005\u001e\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u0011\u0001\u0000\u0000\u0000\u00e9\u00ed\u0003\f\u0006\u0000\u00ea"+
		"\u00ec\u0003\u0004\u0002\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f0\u00e9\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u0013\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005%\u0000\u0000\u00f6\u0100"+
		"\u0005\u0001\u0000\u0000\u00f7\u00f8\u0003\u0002\u0001\u0000\u00f8\u00f9"+
		"\u0005\u001a\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f7"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0101"+
		"\u0003\u0002\u0001\u0000\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\u0002\u0000\u0000\u0103\u0015\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0005\u001f\u0000\u0000\u0105\u010b\u0006\u000b\uffff\uffff\u0000\u0106"+
		"\u0107\u0005 \u0000\u0000\u0107\u010b\u0006\u000b\uffff\uffff\u0000\u0108"+
		"\u0109\u0005!\u0000\u0000\u0109\u010b\u0006\u000b\uffff\uffff\u0000\u010a"+
		"\u0104\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010b\u0017\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005\u001e\u0000\u0000\u010d\u010e\u0005\"\u0000\u0000\u010e\u010f"+
		"\u0005\u0001\u0000\u0000\u010f\u0110\u0005\u0002\u0000\u0000\u0110\u0111"+
		"\u0005\u001c\u0000\u0000\u0111\u0112\u0003\u0012\t\u0000\u0112\u0113\u0005"+
		"\u001d\u0000\u0000\u0113\u0019\u0001\u0000\u0000\u0000\u0017\u001c\u001e"+
		"?df\u0090\u0094\u009b\u009e\u00a7\u00ab\u00b3\u00ba\u00bf\u00c7\u00d8"+
		"\u00dd\u00e7\u00ed\u00f2\u00fc\u0100\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}