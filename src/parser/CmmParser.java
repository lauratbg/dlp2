// Generated from C:/Users/Laura/IdeaProjects/dlp2/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.expressions.*;
    import ast.program.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.types.Record;
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, SINGLE_LINE_COMMENT=37, 
		MULTIPLE_LINE_COMMENT=38, ID=39, INT_CONSTANT=40, REAL_CONSTANT=41, CHAR_CONSTANT=42, 
		WS=43;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_statement = 2, RULE_type = 3, 
		RULE_varDefinitions = 4, RULE_block = 5, RULE_functionDefinition = 6, 
		RULE_returnType = 7, RULE_functionBody = 8, RULE_functionInvocation = 9, 
		RULE_builtin = 10, RULE_main = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "statement", "type", "varDefinitions", "block", 
			"functionDefinition", "returnType", "functionBody", "functionInvocation", 
			"builtin", "main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'.'", "'-'", "'!'", "'/'", "'*'", 
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
		public Program ast;
		public List<Definition> list = new ArrayList<>();
		public VarDefinitionsContext v;
		public FunctionDefinitionContext f;
		public MainContext m;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<VarDefinitionsContext> varDefinitions() {
			return getRuleContexts(VarDefinitionsContext.class);
		}
		public VarDefinitionsContext varDefinitions(int i) {
			return getRuleContext(VarDefinitionsContext.class,i);
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
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(24);
						((ProgramContext)_localctx).v = varDefinitions();
						_localctx.list.addAll(((ProgramContext)_localctx).v.ast);
						}
						break;
					case 2:
						{
						setState(27);
						((ProgramContext)_localctx).f = functionDefinition();
						_localctx.list.add(((ProgramContext)_localctx).f.ast);
						}
						break;
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(35);
			((ProgramContext)_localctx).m = main();
			_localctx.list.add(((ProgramContext)_localctx).m.ast);
			((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).m.ast.getLine(), ((ProgramContext)_localctx).m.ast.getColumn(), _localctx.list);
			setState(38);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public ExpressionContext e;
		public BuiltinContext t;
		public Token OP;
		public FunctionInvocationContext f;
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(41);
				match(T__0);
				setState(42);
				((ExpressionContext)_localctx).e = expression(0);
				setState(43);
				match(T__1);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e.ast;
				}
				break;
			case 2:
				{
				setState(46);
				match(T__0);
				setState(47);
				((ExpressionContext)_localctx).t = builtin();
				setState(48);
				match(T__1);
				setState(49);
				((ExpressionContext)_localctx).e = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).e.ast.getLine(), ((ExpressionContext)_localctx).e.ast.getColumn(), ((ExpressionContext)_localctx).t.ast, ((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 3:
				{
				setState(52);
				((ExpressionContext)_localctx).OP = match(T__5);
				setState(53);
				((ExpressionContext)_localctx).e = expression(11);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, ((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 4:
				{
				setState(56);
				((ExpressionContext)_localctx).OP = match(T__6);
				setState(57);
				((ExpressionContext)_localctx).e = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).OP.getLine(), ((ExpressionContext)_localctx).OP.getCharPositionInLine()+1, ((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 5:
				{
				setState(60);
				((ExpressionContext)_localctx).f = functionInvocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).f.ast;
				}
				break;
			case 6:
				{
				setState(63);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 7:
				{
				setState(65);
				((ExpressionContext)_localctx).IC = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new Int_Literal(((ExpressionContext)_localctx).IC.getLine(), ((ExpressionContext)_localctx).IC.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).IC!=null?((ExpressionContext)_localctx).IC.getText():null)));
				}
				break;
			case 8:
				{
				setState(67);
				((ExpressionContext)_localctx).RC = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new Real_Literal(((ExpressionContext)_localctx).RC.getLine(), ((ExpressionContext)_localctx).RC.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).RC!=null?((ExpressionContext)_localctx).RC.getText():null)));
				}
				break;
			case 9:
				{
				setState(69);
				((ExpressionContext)_localctx).CC = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new Char_Literal(((ExpressionContext)_localctx).CC.getLine(), ((ExpressionContext)_localctx).CC.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CC!=null?((ExpressionContext)_localctx).CC.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(74);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).ast =  Arithmetic.createArithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(79);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__10) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						((ExpressionContext)_localctx).e2 = expression(9);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(84);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(89);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						((ExpressionContext)_localctx).e2 = expression(7);
						((ExpressionContext)_localctx).ast =  new Logical(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(94);
						match(T__2);
						setState(95);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(96);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new Indexing(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(100);
						match(T__4);
						setState(101);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e.ast.getLine(), ((ExpressionContext)_localctx).e.ast.getColumn(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e.ast);
						}
						break;
					}
					} 
				}
				setState(107);
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
		public List<Statement> ast = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token W;
		public Token R;
		public ExpressionContext e;
		public BlockContext b;
		public Token I;
		public BlockContext b1;
		public BlockContext b2;
		public FunctionInvocationContext f;
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((StatementContext)_localctx).e1 = expression(0);
				setState(109);
				match(T__19);
				setState(110);
				((StatementContext)_localctx).e2 = expression(0);
				setState(111);
				match(T__20);
				_localctx.ast.add(new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((StatementContext)_localctx).W = match(T__21);
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(115);
						((StatementContext)_localctx).e1 = expression(0);
						setState(116);
						match(T__22);
						_localctx.ast.add(new Write(((StatementContext)_localctx).W.getLine(), ((StatementContext)_localctx).W.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast));
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(124);
				((StatementContext)_localctx).e2 = expression(0);
				setState(125);
				match(T__20);
				_localctx.ast.add(new Write(((StatementContext)_localctx).W.getLine(), ((StatementContext)_localctx).W.getCharPositionInLine()+1, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				((StatementContext)_localctx).R = match(T__23);
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						((StatementContext)_localctx).e1 = expression(0);
						setState(130);
						match(T__22);
						_localctx.ast.add(new Read(((StatementContext)_localctx).R.getLine(), ((StatementContext)_localctx).R.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast));
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(138);
				((StatementContext)_localctx).e2 = expression(0);
				setState(139);
				match(T__20);
				_localctx.ast.add(new Read(((StatementContext)_localctx).R.getLine(), ((StatementContext)_localctx).R.getCharPositionInLine()+1, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				((StatementContext)_localctx).W = match(T__24);
				setState(143);
				match(T__0);
				setState(144);
				((StatementContext)_localctx).e = expression(0);
				setState(145);
				match(T__1);
				setState(146);
				((StatementContext)_localctx).b = block();
				_localctx.ast.add(new While(((StatementContext)_localctx).W.getLine(), ((StatementContext)_localctx).W.getCharPositionInLine() + 1, ((StatementContext)_localctx).b.ast, ((StatementContext)_localctx).e.ast));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				((StatementContext)_localctx).I = match(T__25);
				setState(150);
				match(T__0);
				setState(151);
				((StatementContext)_localctx).e = expression(0);
				setState(152);
				match(T__1);
				setState(153);
				((StatementContext)_localctx).b = block();
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).I.getLine(), ((StatementContext)_localctx).I.getCharPositionInLine() + 1, ((StatementContext)_localctx).b.ast, ((StatementContext)_localctx).e.ast));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				((StatementContext)_localctx).I = match(T__25);
				setState(157);
				match(T__0);
				setState(158);
				((StatementContext)_localctx).e = expression(0);
				setState(159);
				match(T__1);
				setState(160);
				((StatementContext)_localctx).b1 = block();
				setState(161);
				match(T__26);
				setState(162);
				((StatementContext)_localctx).b2 = block();
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).I.getLine(), ((StatementContext)_localctx).I.getCharPositionInLine() + 1, ((StatementContext)_localctx).b1.ast, ((StatementContext)_localctx).b2.ast, ((StatementContext)_localctx).e.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				((StatementContext)_localctx).f = functionInvocation();
				setState(166);
				match(T__20);
				_localctx.ast.add(((StatementContext)_localctx).f.ast);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				((StatementContext)_localctx).R = match(T__27);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208514L) != 0)) {
					{
					setState(170);
					((StatementContext)_localctx).e = expression(0);
					_localctx.ast.add(new Return(((StatementContext)_localctx).R.getLine(), ((StatementContext)_localctx).R.getCharPositionInLine() + 1, ((StatementContext)_localctx).e.ast));
					}
				}

				setState(175);
				match(T__20);
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
		public Type ast;
		public List<RecordField> list = new ArrayList<>();
		public TypeContext t;
		public BuiltinContext b;
		public Token S;
		public VarDefinitionsContext v;
		public Token IC;
		public BuiltinContext builtin() {
			return getRuleContext(BuiltinContext.class,0);
		}
		public List<VarDefinitionsContext> varDefinitions() {
			return getRuleContexts(VarDefinitionsContext.class);
		}
		public VarDefinitionsContext varDefinitions(int i) {
			return getRuleContext(VarDefinitionsContext.class,i);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				{
				setState(179);
				((TypeContext)_localctx).b = builtin();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b.ast;
				}
				break;
			case T__28:
				{
				setState(182);
				((TypeContext)_localctx).S = match(T__28);
				setState(183);
				match(T__29);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60666413056L) != 0)) {
					{
					{
					int i = 0;
					setState(185);
					((TypeContext)_localctx).v = varDefinitions();

					                for (VarDefinition varDef : ((TypeContext)_localctx).v.ast) {
					                    _localctx.list.add(new RecordField(varDef.getLine(), varDef.getColumn(), varDef.getType(), varDef.getName()));
					                }
					              
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(T__30);
				((TypeContext)_localctx).ast =  new Record(((TypeContext)_localctx).S.getLine(), ((TypeContext)_localctx).S.getCharPositionInLine() + 1, _localctx.list);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.t = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(197);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(198);
					match(T__2);
					setState(199);
					((TypeContext)_localctx).IC = match(INT_CONSTANT);
					setState(200);
					match(T__3);
					((TypeContext)_localctx).ast =  Array.createArray(((TypeContext)_localctx).t.ast.getLine(), ((TypeContext)_localctx).t.ast.getColumn(), ((TypeContext)_localctx).t.ast, Integer.valueOf((((TypeContext)_localctx).IC!=null?((TypeContext)_localctx).IC.getText():null)));
					}
					} 
				}
				setState(206);
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
	public static class VarDefinitionsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();
		public TypeContext t;
		public Token ID1;
		public Token ID2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public VarDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitions; }
	}

	public final VarDefinitionsContext varDefinitions() throws RecognitionException {
		VarDefinitionsContext _localctx = new VarDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((VarDefinitionsContext)_localctx).t = type(0);
			setState(208);
			((VarDefinitionsContext)_localctx).ID1 = match(ID);
			_localctx.ast.add(new VarDefinition(((VarDefinitionsContext)_localctx).t.ast.getLine(), ((VarDefinitionsContext)_localctx).t.ast.getColumn(), ((VarDefinitionsContext)_localctx).t.ast, (((VarDefinitionsContext)_localctx).ID1!=null?((VarDefinitionsContext)_localctx).ID1.getText():null)));
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(210);
				match(T__22);
				setState(211);
				((VarDefinitionsContext)_localctx).ID2 = match(ID);
				_localctx.ast.add(new VarDefinition(((VarDefinitionsContext)_localctx).t.ast.getLine(), ((VarDefinitionsContext)_localctx).t.ast.getColumn(), ((VarDefinitionsContext)_localctx).t.ast, (((VarDefinitionsContext)_localctx).ID2!=null?((VarDefinitionsContext)_localctx).ID2.getText():null)));
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext s1;
		public StatementContext s2;
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__29);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246727278786L) != 0)) {
					{
					{
					setState(221);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
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
			case ID:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((BlockContext)_localctx).s2 = statement();
				_localctx.ast.addAll(((BlockContext)_localctx).s2.ast);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public List<VarDefinition> list = new ArrayList<>();
		public ReturnTypeContext r;
		public Token ID1;
		public BuiltinContext b1;
		public Token ID2;
		public BuiltinContext b2;
		public Token ID3;
		public FunctionBodyContext f;
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((FunctionDefinitionContext)_localctx).r = returnType();
			setState(236);
			((FunctionDefinitionContext)_localctx).ID1 = match(ID);
			setState(237);
			match(T__0);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(238);
					((FunctionDefinitionContext)_localctx).b1 = builtin();
					setState(239);
					((FunctionDefinitionContext)_localctx).ID2 = match(ID);
					setState(240);
					match(T__22);
					_localctx.list.add(new VarDefinition(((FunctionDefinitionContext)_localctx).b1.ast.getLine(), ((FunctionDefinitionContext)_localctx).b1.ast.getColumn(), ((FunctionDefinitionContext)_localctx).b1.ast, (((FunctionDefinitionContext)_localctx).ID2!=null?((FunctionDefinitionContext)_localctx).ID2.getText():null)));
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60129542144L) != 0)) {
				{
				setState(248);
				((FunctionDefinitionContext)_localctx).b2 = builtin();
				setState(249);
				((FunctionDefinitionContext)_localctx).ID3 = match(ID);
				_localctx.list.add(new VarDefinition(((FunctionDefinitionContext)_localctx).b2.ast.getLine(), ((FunctionDefinitionContext)_localctx).b2.ast.getColumn(), ((FunctionDefinitionContext)_localctx).b2.ast, (((FunctionDefinitionContext)_localctx).ID3!=null?((FunctionDefinitionContext)_localctx).ID3.getText():null)));
				}
			}

			setState(254);
			match(T__1);
			setState(255);
			match(T__29);
			setState(256);
			((FunctionDefinitionContext)_localctx).f = functionBody();
			setState(257);
			match(T__30);
			((FunctionDefinitionContext)_localctx).ast =  new FuncDefinition(((FunctionDefinitionContext)_localctx).r.ast.getLine(), ((FunctionDefinitionContext)_localctx).r.ast.getColumn(),
			                                            new FunctionType(((FunctionDefinitionContext)_localctx).ID1.getLine(), ((FunctionDefinitionContext)_localctx).ID1.getCharPositionInLine()+1, ((FunctionDefinitionContext)_localctx).r.ast, _localctx.list),
			                                        (((FunctionDefinitionContext)_localctx).ID1!=null?((FunctionDefinitionContext)_localctx).ID1.getText():null), ((FunctionDefinitionContext)_localctx).f.ast);
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
		public Type ast;
		public BuiltinContext b;
		public Token V;
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((ReturnTypeContext)_localctx).b = builtin();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).b.ast;
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((ReturnTypeContext)_localctx).V = match(T__31);
				((ReturnTypeContext)_localctx).ast =  new VoidType(((ReturnTypeContext)_localctx).V.getLine(), ((ReturnTypeContext)_localctx).V.getCharPositionInLine() + 1);
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
		public List<Statement> ast = new ArrayList<>();
		public VarDefinitionsContext v;
		public StatementContext s;
		public List<VarDefinitionsContext> varDefinitions() {
			return getRuleContexts(VarDefinitionsContext.class);
		}
		public VarDefinitionsContext varDefinitions(int i) {
			return getRuleContext(VarDefinitionsContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60666413056L) != 0)) {
				{
				{
				setState(267);
				((FunctionBodyContext)_localctx).v = varDefinitions();
				_localctx.ast.addAll(((FunctionBodyContext)_localctx).v.ast);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246727278786L) != 0)) {
				{
				{
				setState(275);
				((FunctionBodyContext)_localctx).s = statement();
				_localctx.ast.addAll(((FunctionBodyContext)_localctx).s.ast);
				}
				}
				setState(282);
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
		public FunctionInvocation ast;
		public List<Expression> list = new ArrayList<Expression>();
		public Token ID;
		public ExpressionContext e1;
		public ExpressionContext e2;
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
			setState(283);
			((FunctionInvocationContext)_localctx).ID = match(ID);
			setState(284);
			match(T__0);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208514L) != 0)) {
				{
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(285);
						((FunctionInvocationContext)_localctx).e1 = expression(0);
						setState(286);
						match(T__22);
						_localctx.list.add(((FunctionInvocationContext)_localctx).e1.ast);
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(294);
				((FunctionInvocationContext)_localctx).e2 = expression(0);
				_localctx.list.add(((FunctionInvocationContext)_localctx).e2.ast);
				}
			}

			setState(299);
			match(T__1);
			((FunctionInvocationContext)_localctx).ast =  new FunctionInvocation(((FunctionInvocationContext)_localctx).ID.getLine(), ((FunctionInvocationContext)_localctx).ID.getCharPositionInLine()+1,
			                new Variable(((FunctionInvocationContext)_localctx).ID.getLine(), ((FunctionInvocationContext)_localctx).ID.getCharPositionInLine() + 1, (((FunctionInvocationContext)_localctx).ID!=null?((FunctionInvocationContext)_localctx).ID.getText():null)), _localctx.list);
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
		enterRule(_localctx, 20, RULE_builtin);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				((BuiltinContext)_localctx).I = match(T__32);
				((BuiltinContext)_localctx).ast =  new IntType(((BuiltinContext)_localctx).I.getLine(), ((BuiltinContext)_localctx).I.getCharPositionInLine()+1);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				((BuiltinContext)_localctx).D = match(T__33);
				((BuiltinContext)_localctx).ast =  new DoubleType(((BuiltinContext)_localctx).D.getLine(), ((BuiltinContext)_localctx).D.getCharPositionInLine()+1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				((BuiltinContext)_localctx).C = match(T__34);
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
		public FuncDefinition ast;
		public Token V;
		public Token M;
		public FunctionBodyContext f;
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
			setState(310);
			((MainContext)_localctx).V = match(T__31);
			setState(311);
			((MainContext)_localctx).M = match(T__35);
			setState(312);
			match(T__0);
			setState(313);
			match(T__1);
			setState(314);
			match(T__29);
			setState(315);
			((MainContext)_localctx).f = functionBody();
			setState(316);
			match(T__30);
			((MainContext)_localctx).ast =  new FuncDefinition(((MainContext)_localctx).V.getLine(), ((MainContext)_localctx).V.getCharPositionInLine() + 1,
			            new FunctionType(((MainContext)_localctx).V.getLine(), ((MainContext)_localctx).V.getCharPositionInLine() + 1,
			                            new VoidType(((MainContext)_localctx).V.getLine(), ((MainContext)_localctx).V.getCharPositionInLine() + 1), new ArrayList<VarDefinition>()),
			                 (((MainContext)_localctx).M!=null?((MainContext)_localctx).M.getText():null), ((MainContext)_localctx).f.ast);
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
		"\u0004\u0001+\u0140\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001H\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001h\b\u0001\n\u0001\f\u0001k\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002x\b\u0002\n\u0002\f\u0002"+
		"{\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0086\b\u0002"+
		"\n\u0002\f\u0002\u0089\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u00ae\b\u0002\u0001\u0002\u0003\u0002\u00b1"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00bd"+
		"\b\u0003\n\u0003\f\u0003\u00c0\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00c4\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00cb\b\u0003\n\u0003\f\u0003\u00ce\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00d6"+
		"\b\u0004\n\u0004\f\u0004\u00d9\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00e1\b\u0005\n\u0005"+
		"\f\u0005\u00e4\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00ea\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00f4\b\u0006"+
		"\n\u0006\f\u0006\u00f7\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00fd\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u010a\b\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u010f\b\b\n\b\f\b\u0112\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u0117\b"+
		"\b\n\b\f\b\u011a\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0122\b\t\n\t\f\t\u0125\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u012a\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0135\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0000"+
		"\u0002\u0002\u0006\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0000\u0004\u0001\u0000\b\n\u0002\u0000\u0006\u0006\u000b\u000b"+
		"\u0001\u0000\f\u0011\u0001\u0000\u0012\u0013\u015c\u0000 \u0001\u0000"+
		"\u0000\u0000\u0002G\u0001\u0000\u0000\u0000\u0004\u00b0\u0001\u0000\u0000"+
		"\u0000\u0006\u00c3\u0001\u0000\u0000\u0000\b\u00cf\u0001\u0000\u0000\u0000"+
		"\n\u00e9\u0001\u0000\u0000\u0000\f\u00eb\u0001\u0000\u0000\u0000\u000e"+
		"\u0109\u0001\u0000\u0000\u0000\u0010\u0110\u0001\u0000\u0000\u0000\u0012"+
		"\u011b\u0001\u0000\u0000\u0000\u0014\u0134\u0001\u0000\u0000\u0000\u0016"+
		"\u0136\u0001\u0000\u0000\u0000\u0018\u0019\u0003\b\u0004\u0000\u0019\u001a"+
		"\u0006\u0000\uffff\uffff\u0000\u001a\u001f\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0003\f\u0006\u0000\u001c\u001d\u0006\u0000\uffff\uffff\u0000\u001d"+
		"\u001f\u0001\u0000\u0000\u0000\u001e\u0018\u0001\u0000\u0000\u0000\u001e"+
		"\u001b\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000#$\u0003\u0016\u000b\u0000$%\u0006\u0000"+
		"\uffff\uffff\u0000%&\u0006\u0000\uffff\uffff\u0000&\'\u0005\u0000\u0000"+
		"\u0001\'\u0001\u0001\u0000\u0000\u0000()\u0006\u0001\uffff\uffff\u0000"+
		")*\u0005\u0001\u0000\u0000*+\u0003\u0002\u0001\u0000+,\u0005\u0002\u0000"+
		"\u0000,-\u0006\u0001\uffff\uffff\u0000-H\u0001\u0000\u0000\u0000./\u0005"+
		"\u0001\u0000\u0000/0\u0003\u0014\n\u000001\u0005\u0002\u0000\u000012\u0003"+
		"\u0002\u0001\f23\u0006\u0001\uffff\uffff\u00003H\u0001\u0000\u0000\u0000"+
		"45\u0005\u0006\u0000\u000056\u0003\u0002\u0001\u000b67\u0006\u0001\uffff"+
		"\uffff\u00007H\u0001\u0000\u0000\u000089\u0005\u0007\u0000\u00009:\u0003"+
		"\u0002\u0001\n:;\u0006\u0001\uffff\uffff\u0000;H\u0001\u0000\u0000\u0000"+
		"<=\u0003\u0012\t\u0000=>\u0006\u0001\uffff\uffff\u0000>H\u0001\u0000\u0000"+
		"\u0000?@\u0005\'\u0000\u0000@H\u0006\u0001\uffff\uffff\u0000AB\u0005("+
		"\u0000\u0000BH\u0006\u0001\uffff\uffff\u0000CD\u0005)\u0000\u0000DH\u0006"+
		"\u0001\uffff\uffff\u0000EF\u0005*\u0000\u0000FH\u0006\u0001\uffff\uffff"+
		"\u0000G(\u0001\u0000\u0000\u0000G.\u0001\u0000\u0000\u0000G4\u0001\u0000"+
		"\u0000\u0000G8\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000\u0000G?\u0001"+
		"\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000GC\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000Hi\u0001\u0000\u0000\u0000IJ\n\t\u0000\u0000"+
		"JK\u0007\u0000\u0000\u0000KL\u0003\u0002\u0001\nLM\u0006\u0001\uffff\uffff"+
		"\u0000Mh\u0001\u0000\u0000\u0000NO\n\b\u0000\u0000OP\u0007\u0001\u0000"+
		"\u0000PQ\u0003\u0002\u0001\tQR\u0006\u0001\uffff\uffff\u0000Rh\u0001\u0000"+
		"\u0000\u0000ST\n\u0007\u0000\u0000TU\u0007\u0002\u0000\u0000UV\u0003\u0002"+
		"\u0001\bVW\u0006\u0001\uffff\uffff\u0000Wh\u0001\u0000\u0000\u0000XY\n"+
		"\u0006\u0000\u0000YZ\u0007\u0003\u0000\u0000Z[\u0003\u0002\u0001\u0007"+
		"[\\\u0006\u0001\uffff\uffff\u0000\\h\u0001\u0000\u0000\u0000]^\n\u000e"+
		"\u0000\u0000^_\u0005\u0003\u0000\u0000_`\u0003\u0002\u0001\u0000`a\u0005"+
		"\u0004\u0000\u0000ab\u0006\u0001\uffff\uffff\u0000bh\u0001\u0000\u0000"+
		"\u0000cd\n\r\u0000\u0000de\u0005\u0005\u0000\u0000ef\u0005\'\u0000\u0000"+
		"fh\u0006\u0001\uffff\uffff\u0000gI\u0001\u0000\u0000\u0000gN\u0001\u0000"+
		"\u0000\u0000gS\u0001\u0000\u0000\u0000gX\u0001\u0000\u0000\u0000g]\u0001"+
		"\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0003\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0003\u0002\u0001\u0000mn\u0005"+
		"\u0014\u0000\u0000no\u0003\u0002\u0001\u0000op\u0005\u0015\u0000\u0000"+
		"pq\u0006\u0002\uffff\uffff\u0000q\u00b1\u0001\u0000\u0000\u0000ry\u0005"+
		"\u0016\u0000\u0000st\u0003\u0002\u0001\u0000tu\u0005\u0017\u0000\u0000"+
		"uv\u0006\u0002\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000ws\u0001\u0000"+
		"\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|}\u0003\u0002\u0001\u0000}~\u0005\u0015\u0000\u0000~\u007f\u0006\u0002"+
		"\uffff\uffff\u0000\u007f\u00b1\u0001\u0000\u0000\u0000\u0080\u0087\u0005"+
		"\u0018\u0000\u0000\u0081\u0082\u0003\u0002\u0001\u0000\u0082\u0083\u0005"+
		"\u0017\u0000\u0000\u0083\u0084\u0006\u0002\uffff\uffff\u0000\u0084\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0002\u0001\u0000\u008b\u008c"+
		"\u0005\u0015\u0000\u0000\u008c\u008d\u0006\u0002\uffff\uffff\u0000\u008d"+
		"\u00b1\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0019\u0000\u0000\u008f"+
		"\u0090\u0005\u0001\u0000\u0000\u0090\u0091\u0003\u0002\u0001\u0000\u0091"+
		"\u0092\u0005\u0002\u0000\u0000\u0092\u0093\u0003\n\u0005\u0000\u0093\u0094"+
		"\u0006\u0002\uffff\uffff\u0000\u0094\u00b1\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005\u001a\u0000\u0000\u0096\u0097\u0005\u0001\u0000\u0000\u0097"+
		"\u0098\u0003\u0002\u0001\u0000\u0098\u0099\u0005\u0002\u0000\u0000\u0099"+
		"\u009a\u0003\n\u0005\u0000\u009a\u009b\u0006\u0002\uffff\uffff\u0000\u009b"+
		"\u00b1\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001a\u0000\u0000\u009d"+
		"\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0003\u0002\u0001\u0000\u009f"+
		"\u00a0\u0005\u0002\u0000\u0000\u00a0\u00a1\u0003\n\u0005\u0000\u00a1\u00a2"+
		"\u0005\u001b\u0000\u0000\u00a2\u00a3\u0003\n\u0005\u0000\u00a3\u00a4\u0006"+
		"\u0002\uffff\uffff\u0000\u00a4\u00b1\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0003\u0012\t\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00a8\u0006"+
		"\u0002\uffff\uffff\u0000\u00a8\u00b1\u0001\u0000\u0000\u0000\u00a9\u00ad"+
		"\u0005\u001c\u0000\u0000\u00aa\u00ab\u0003\u0002\u0001\u0000\u00ab\u00ac"+
		"\u0006\u0002\uffff\uffff\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u0015\u0000\u0000\u00b0"+
		"l\u0001\u0000\u0000\u0000\u00b0r\u0001\u0000\u0000\u0000\u00b0\u0080\u0001"+
		"\u0000\u0000\u0000\u00b0\u008e\u0001\u0000\u0000\u0000\u00b0\u0095\u0001"+
		"\u0000\u0000\u0000\u00b0\u009c\u0001\u0000\u0000\u0000\u00b0\u00a5\u0001"+
		"\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000\u0000\u0000\u00b1\u0005\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0006\u0003\uffff\uffff\u0000\u00b3\u00b4"+
		"\u0003\u0014\n\u0000\u00b4\u00b5\u0006\u0003\uffff\uffff\u0000\u00b5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00be"+
		"\u0005\u001e\u0000\u0000\u00b8\u00b9\u0006\u0003\uffff\uffff\u0000\u00b9"+
		"\u00ba\u0003\b\u0004\u0000\u00ba\u00bb\u0006\u0003\uffff\uffff\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u001f\u0000\u0000\u00c2"+
		"\u00c4\u0006\u0003\uffff\uffff\u0000\u00c3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00c3\u00b6\u0001\u0000\u0000\u0000\u00c4\u00cc\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\n\u0003\u0000\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7"+
		"\u00c8\u0005(\u0000\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9\u00cb"+
		"\u0006\u0003\uffff\uffff\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u0007\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003\u0006\u0003\u0000\u00d0"+
		"\u00d1\u0005\'\u0000\u0000\u00d1\u00d7\u0006\u0004\uffff\uffff\u0000\u00d2"+
		"\u00d3\u0005\u0017\u0000\u0000\u00d3\u00d4\u0005\'\u0000\u0000\u00d4\u00d6"+
		"\u0006\u0004\uffff\uffff\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0015\u0000\u0000\u00db"+
		"\t\u0001\u0000\u0000\u0000\u00dc\u00e2\u0005\u001e\u0000\u0000\u00dd\u00de"+
		"\u0003\u0004\u0002\u0000\u00de\u00df\u0006\u0005\uffff\uffff\u0000\u00df"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e5\u00ea\u0005\u001f\u0000\u0000\u00e6"+
		"\u00e7\u0003\u0004\u0002\u0000\u00e7\u00e8\u0006\u0005\uffff\uffff\u0000"+
		"\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e6\u0001\u0000\u0000\u0000\u00ea\u000b\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0003\u000e\u0007\u0000\u00ec\u00ed\u0005\'\u0000\u0000\u00ed"+
		"\u00f5\u0005\u0001\u0000\u0000\u00ee\u00ef\u0003\u0014\n\u0000\u00ef\u00f0"+
		"\u0005\'\u0000\u0000\u00f0\u00f1\u0005\u0017\u0000\u0000\u00f1\u00f2\u0006"+
		"\u0006\uffff\uffff\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00fc"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0003\u0014\n\u0000\u00f9\u00fa\u0005\'\u0000\u0000\u00fa\u00fb\u0006"+
		"\u0006\uffff\uffff\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0002\u0000\u0000\u00ff\u0100"+
		"\u0005\u001e\u0000\u0000\u0100\u0101\u0003\u0010\b\u0000\u0101\u0102\u0005"+
		"\u001f\u0000\u0000\u0102\u0103\u0006\u0006\uffff\uffff\u0000\u0103\r\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0003\u0014\n\u0000\u0105\u0106\u0006\u0007"+
		"\uffff\uffff\u0000\u0106\u010a\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		" \u0000\u0000\u0108\u010a\u0006\u0007\uffff\uffff\u0000\u0109\u0104\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u000f\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0003\b\u0004\u0000\u010c\u010d\u0006\b"+
		"\uffff\uffff\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010b\u0001"+
		"\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0118\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0003"+
		"\u0004\u0002\u0000\u0114\u0115\u0006\b\uffff\uffff\u0000\u0115\u0117\u0001"+
		"\u0000\u0000\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0117\u011a\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u0011\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0005\'\u0000\u0000\u011c\u0129\u0005\u0001"+
		"\u0000\u0000\u011d\u011e\u0003\u0002\u0001\u0000\u011e\u011f\u0005\u0017"+
		"\u0000\u0000\u011f\u0120\u0006\t\uffff\uffff\u0000\u0120\u0122\u0001\u0000"+
		"\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0003\u0002\u0001\u0000\u0127\u0128\u0006\t\uffff"+
		"\uffff\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0123\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005\u0002\u0000\u0000\u012c\u012d\u0006\t\uffff"+
		"\uffff\u0000\u012d\u0013\u0001\u0000\u0000\u0000\u012e\u012f\u0005!\u0000"+
		"\u0000\u012f\u0135\u0006\n\uffff\uffff\u0000\u0130\u0131\u0005\"\u0000"+
		"\u0000\u0131\u0135\u0006\n\uffff\uffff\u0000\u0132\u0133\u0005#\u0000"+
		"\u0000\u0133\u0135\u0006\n\uffff\uffff\u0000\u0134\u012e\u0001\u0000\u0000"+
		"\u0000\u0134\u0130\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0135\u0015\u0001\u0000\u0000\u0000\u0136\u0137\u0005 \u0000\u0000"+
		"\u0137\u0138\u0005$\u0000\u0000\u0138\u0139\u0005\u0001\u0000\u0000\u0139"+
		"\u013a\u0005\u0002\u0000\u0000\u013a\u013b\u0005\u001e\u0000\u0000\u013b"+
		"\u013c\u0003\u0010\b\u0000\u013c\u013d\u0005\u001f\u0000\u0000\u013d\u013e"+
		"\u0006\u000b\uffff\uffff\u0000\u013e\u0017\u0001\u0000\u0000\u0000\u0017"+
		"\u001e Ggiy\u0087\u00ad\u00b0\u00be\u00c3\u00cc\u00d7\u00e2\u00e9\u00f5"+
		"\u00fc\u0109\u0110\u0118\u0123\u0129\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}