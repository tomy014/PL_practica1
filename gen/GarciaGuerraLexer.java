// Generated from C:/Users/Alberto/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/Práctica1 complementaria/GarciaGuerra/src/GarciaGuerra.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GarciaGuerraLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HASHTAG=1, USR=2, LINK=3, TEXT=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HASHTAG", "USR", "LINK", "TEXT", "WS"
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
			null, "HASHTAG", "USR", "LINK", "TEXT", "WS"
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


	public GarciaGuerraLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GarciaGuerra.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			HASHTAG_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			USR_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			LINK_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TEXT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void HASHTAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.print("<span class='hashtag'>" + getText() + "</span> " ); 
			break;
		}
	}
	private void USR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.print("<span class='usr'>" + getText() + "</span> " ); 
			break;
		}
	}
	private void LINK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.print("<span class='link'>" + getText() + "</span> " ); 
			break;
		}
	}
	private void TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			System.out.print(getText()+" ");
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0005?\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0001\u0000\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000"+
		"\f\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u0016\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002+\b\u0002\u0001\u0002\u0004"+
		"\u0002.\b\u0002\u000b\u0002\f\u0002/\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u00035\b\u0003\u000b\u0003\f\u00036\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u0004<\b\u0004\u000b\u0004\f\u0004=\u0000\u0000\u0005\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u0001\u0000\u0004\u0004"+
		"\u000009AZ__az\u0004\u0000,,.9AZaz\u0005\u0000\t\n\r\r  ##@@\u0003\u0000"+
		"\t\n\r\r  D\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0001\u000b\u0001\u0000\u0000"+
		"\u0000\u0003\u0013\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000"+
		"\u00074\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b\r\u0005"+
		"#\u0000\u0000\f\u000e\u0007\u0000\u0000\u0000\r\f\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0006\u0000\u0000\u0000\u0012\u0002\u0001\u0000\u0000\u0000\u0013"+
		"\u0015\u0005@\u0000\u0000\u0014\u0016\u0007\u0000\u0000\u0000\u0015\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0006\u0001\u0001\u0000\u001a\u0004"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005h\u0000\u0000\u001c\u001d\u0005"+
		"t\u0000\u0000\u001d\u001e\u0005t\u0000\u0000\u001e\u001f\u0005p\u0000"+
		"\u0000\u001f \u0005:\u0000\u0000 !\u0005/\u0000\u0000!+\u0005/\u0000\u0000"+
		"\"#\u0005h\u0000\u0000#$\u0005t\u0000\u0000$%\u0005t\u0000\u0000%&\u0005"+
		"p\u0000\u0000&\'\u0005s\u0000\u0000\'(\u0005:\u0000\u0000()\u0005/\u0000"+
		"\u0000)+\u0005/\u0000\u0000*\u001b\u0001\u0000\u0000\u0000*\"\u0001\u0000"+
		"\u0000\u0000+-\u0001\u0000\u0000\u0000,.\u0007\u0001\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0006\u0002\u0002"+
		"\u00002\u0006\u0001\u0000\u0000\u000035\b\u0002\u0000\u000043\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0006\u0003\u0003\u0000"+
		"9\b\u0001\u0000\u0000\u0000:<\u0007\u0003\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>\n\u0001\u0000\u0000\u0000\u0007\u0000\u000f\u0017*/6=\u0004"+
		"\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0001\u0003\u0003";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}