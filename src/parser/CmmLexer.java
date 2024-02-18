// Generated from C:/Users/Laura/IdeaProjects/dlp2/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, MULTIPLE_LINE_COMMENT=2, ID=3, INT_CONSTANT=4, 
		REAL_CONSTANT=5, CHAR_CONSTANT=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLE_LINE_COMMENT", "MULTIPLE_LINE_COMMENT", "ID", "INT_CONSTANT", 
			"REAL", "REAL_CONSTANT", "NUMBER", "CHAR_CONSTANT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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
		"\u0004\u0000\u0007u\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000"+
		"\u0003\u0000\u001e\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u00022\b\u0002\n\u0002\f\u00025\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003:\b\u0003\n\u0003\f\u0003=\t\u0003"+
		"\u0003\u0003?\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"D\b\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004K\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005X\b\u0005\u0001\u0006\u0004\u0006[\b\u0006\u000b\u0006\f\u0006"+
		"\\\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0001\u0007\u0003\u0007"+
		"p\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0002\u0019\'\u0000\t\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0005\r\u0000"+
		"\u000f\u0006\u0011\u0007\u0001\u0000\b\u0001\u0001\n\n\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0001\u000019\u0001\u000009\u0002\u0000EEee\u0002"+
		"\u0000++--\u0003\u0000\t\n\r\r  \u0082\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0001\u0013\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005"+
		"/\u0001\u0000\u0000\u0000\u0007>\u0001\u0000\u0000\u0000\tJ\u0001\u0000"+
		"\u0000\u0000\u000bW\u0001\u0000\u0000\u0000\rZ\u0001\u0000\u0000\u0000"+
		"\u000fo\u0001\u0000\u0000\u0000\u0011q\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005/\u0000\u0000\u0014\u0015\u0005/\u0000\u0000\u0015\u0019\u0001\u0000"+
		"\u0000\u0000\u0016\u0018\t\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e\u0007\u0000\u0000"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f \u0006\u0000\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!"+
		"\"\u0005/\u0000\u0000\"#\u0005*\u0000\u0000#\'\u0001\u0000\u0000\u0000"+
		"$&\t\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000*+\u0005*\u0000\u0000+,\u0005/\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-.\u0006\u0001\u0000\u0000.\u0004\u0001"+
		"\u0000\u0000\u0000/3\u0007\u0001\u0000\u000002\u0007\u0002\u0000\u0000"+
		"10\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0006\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u00006?\u00050\u0000\u00007;\u0007\u0003\u0000\u00008:\u0007"+
		"\u0004\u0000\u000098\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>6\u0001\u0000\u0000\u0000>7\u0001\u0000"+
		"\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0003\u0007\u0003\u0000AC\u0005"+
		".\u0000\u0000BD\u0003\r\u0006\u0000CB\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DK\u0001\u0000\u0000\u0000EG\u0003\u0007\u0003\u0000"+
		"FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0005.\u0000\u0000IK\u0003\r\u0006\u0000J@\u0001\u0000\u0000"+
		"\u0000JF\u0001\u0000\u0000\u0000K\n\u0001\u0000\u0000\u0000LO\u0003\t"+
		"\u0004\u0000MO\u0003\u0007\u0003\u0000NL\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0007\u0005\u0000\u0000"+
		"QS\u0007\u0006\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TU\u0003\u0007\u0003\u0000UX\u0001\u0000"+
		"\u0000\u0000VX\u0003\t\u0004\u0000WN\u0001\u0000\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X\f\u0001\u0000\u0000\u0000Y[\u0007\u0004\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000]\u000e\u0001\u0000\u0000\u0000^_\u0005\'\u0000"+
		"\u0000_`\t\u0000\u0000\u0000`p\u0005\'\u0000\u0000ab\u0005\'\u0000\u0000"+
		"bc\u0005\\\u0000\u0000cd\u0003\u0007\u0003\u0000de\u0005\'\u0000\u0000"+
		"ep\u0001\u0000\u0000\u0000fl\u0005\'\u0000\u0000gm\t\u0000\u0000\u0000"+
		"hi\u0005\\\u0000\u0000im\u0005n\u0000\u0000jk\u0005\\\u0000\u0000km\u0005"+
		"t\u0000\u0000lg\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0005\'\u0000\u0000o^\u0001"+
		"\u0000\u0000\u0000oa\u0001\u0000\u0000\u0000of\u0001\u0000\u0000\u0000"+
		"p\u0010\u0001\u0000\u0000\u0000qr\u0007\u0007\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0006\b\u0000\u0000t\u0012\u0001\u0000\u0000\u0000\u0010"+
		"\u0000\u0019\u001d\'3;>CFJNRW\\lo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}