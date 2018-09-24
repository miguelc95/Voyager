// Generated from /Users/iramD24/Workspace/Compiler/Voyager/Java/Voyager.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VoyagerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNC=1, VAR=2, IMPRIMIR=3, SI=4, SINO=5, ENTERO=6, FLOTANTE=7, TEXTO=8, 
		BOOL=9, VACIO=10, ABRE_PAREN=11, CIERRA_PAREN=12, ABRE_BRACKET=13, CIERRA_BRACKET=14, 
		ABRE_CORCHETE=15, CIERRA_CORCHETE=16, SEMI_COLON=17, DOUBLE_DOT=18, DOT=19, 
		SUMA=20, RESTA=21, DIV=22, MULT=23, IGUAL=24, MAS_QUE=25, MENOS_QUE=26, 
		NO_IGUAL=27, CTE_STRING=28, CTE_E=29, CTE_F=30, PROGRAMA=31, ID=32, NEWLINE=33, 
		TEXT=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "E", "F", "G", "I", "O", "S", "Y", "H", "U", "V", "T", 
		"L", "M", "N", "P", "R", "X", "QUOTE", "SIGNO", "DIGITO", "LOWERCASE", 
		"UPPERCASE", "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", "ENTERO", "FLOTANTE", 
		"TEXTO", "BOOL", "VACIO", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", 
		"CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", "SEMI_COLON", "DOUBLE_DOT", 
		"DOT", "SUMA", "RESTA", "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", 
		"NO_IGUAL", "CTE_STRING", "CTE_E", "CTE_F", "PROGRAMA", "ID", "NEWLINE", 
		"TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", "ENTERO", "FLOTANTE", "TEXTO", 
		"BOOL", "VACIO", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", 
		"ABRE_CORCHETE", "CIERRA_CORCHETE", "SEMI_COLON", "DOUBLE_DOT", "DOT", 
		"SUMA", "RESTA", "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", "NO_IGUAL", 
		"CTE_STRING", "CTE_E", "CTE_F", "PROGRAMA", "ID", "NEWLINE", "TEXT"
	};
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


	public VoyagerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Voyager.g4"; }

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
		case 54:
			CTE_F_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CTE_F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			1
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0154\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\7\66\u0109\n\66\f\66\16\66\u010c\13\66\3\66"+
		"\3\66\3\67\7\67\u0111\n\67\f\67\16\67\u0114\13\67\38\78\u0117\n8\f8\16"+
		"8\u011a\138\38\38\38\68\u011f\n8\r8\168\u0120\39\39\39\39\39\39\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3;\5;\u0144\n;\3;\3;\6;\u0148\n;\r;\16;\u0149\3<\3<\7<\u014e\n<\f"+
		"<\16<\u0151\13<\3<\3<\3\u014f\2=\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23"+
		"\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65"+
		"\3\67\49\5;\6=\7?\bA\tC\nE\13G\fI\rK\16M\17O\20Q\21S\22U\23W\24Y\25[\26"+
		"]\27_\30a\31c\32e\33g\34i\35k\36m\37o q!s\"u#w$\3\2\33\4\2CCcc\4\2DDd"+
		"d\4\2EEee\4\2GGgg\4\2HHhh\4\2IIii\4\2KKkk\4\2QQqq\4\2UUuu\4\2[[{{\4\2"+
		"JJjj\4\2WWww\4\2XXxx\4\2VVvv\4\2NNnn\4\2OOoo\4\2PPpp\4\2RRrr\4\2TTtt\4"+
		"\2ZZzz\4\2--//\3\2c|\3\2C\\\4\2**]]\4\2++__\2\u0142\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\3y\3\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3"+
		"\2\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23\u0089\3\2"+
		"\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0091\3\2\2"+
		"\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009b"+
		"\3\2\2\2\'\u009d\3\2\2\2)\u009f\3\2\2\2+\u00a1\3\2\2\2-\u00a2\3\2\2\2"+
		"/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8\3\2\2\2\65\u00aa\3\2\2\2\67"+
		"\u00af\3\2\2\29\u00b3\3\2\2\2;\u00bc\3\2\2\2=\u00bf\3\2\2\2?\u00c4\3\2"+
		"\2\2A\u00cb\3\2\2\2C\u00d4\3\2\2\2E\u00da\3\2\2\2G\u00df\3\2\2\2I\u00e5"+
		"\3\2\2\2K\u00e7\3\2\2\2M\u00e9\3\2\2\2O\u00eb\3\2\2\2Q\u00ed\3\2\2\2S"+
		"\u00ef\3\2\2\2U\u00f1\3\2\2\2W\u00f3\3\2\2\2Y\u00f5\3\2\2\2[\u00f7\3\2"+
		"\2\2]\u00f9\3\2\2\2_\u00fb\3\2\2\2a\u00fd\3\2\2\2c\u00ff\3\2\2\2e\u0101"+
		"\3\2\2\2g\u0103\3\2\2\2i\u0105\3\2\2\2k\u010a\3\2\2\2m\u0112\3\2\2\2o"+
		"\u0118\3\2\2\2q\u0122\3\2\2\2s\u012b\3\2\2\2u\u0147\3\2\2\2w\u014b\3\2"+
		"\2\2yz\t\2\2\2z\4\3\2\2\2{|\t\3\2\2|\6\3\2\2\2}~\t\4\2\2~\b\3\2\2\2\177"+
		"\u0080\t\5\2\2\u0080\n\3\2\2\2\u0081\u0082\t\6\2\2\u0082\f\3\2\2\2\u0083"+
		"\u0084\t\7\2\2\u0084\16\3\2\2\2\u0085\u0086\t\b\2\2\u0086\20\3\2\2\2\u0087"+
		"\u0088\t\t\2\2\u0088\22\3\2\2\2\u0089\u008a\t\n\2\2\u008a\24\3\2\2\2\u008b"+
		"\u008c\t\13\2\2\u008c\26\3\2\2\2\u008d\u008e\t\f\2\2\u008e\30\3\2\2\2"+
		"\u008f\u0090\t\r\2\2\u0090\32\3\2\2\2\u0091\u0092\t\16\2\2\u0092\34\3"+
		"\2\2\2\u0093\u0094\t\17\2\2\u0094\36\3\2\2\2\u0095\u0096\t\20\2\2\u0096"+
		" \3\2\2\2\u0097\u0098\t\21\2\2\u0098\"\3\2\2\2\u0099\u009a\t\22\2\2\u009a"+
		"$\3\2\2\2\u009b\u009c\t\23\2\2\u009c&\3\2\2\2\u009d\u009e\t\24\2\2\u009e"+
		"(\3\2\2\2\u009f\u00a0\t\25\2\2\u00a0*\3\2\2\2\u00a1,\3\2\2\2\u00a2\u00a3"+
		"\t\26\2\2\u00a3.\3\2\2\2\u00a4\u00a5\4\62;\2\u00a5\60\3\2\2\2\u00a6\u00a7"+
		"\t\27\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\t\30\2\2\u00a9\64\3\2\2\2\u00aa"+
		"\u00ab\5\13\6\2\u00ab\u00ac\5\31\r\2\u00ac\u00ad\5#\22\2\u00ad\u00ae\5"+
		"\7\4\2\u00ae\66\3\2\2\2\u00af\u00b0\5\33\16\2\u00b0\u00b1\5\3\2\2\u00b1"+
		"\u00b2\5\'\24\2\u00b28\3\2\2\2\u00b3\u00b4\5\17\b\2\u00b4\u00b5\5!\21"+
		"\2\u00b5\u00b6\5%\23\2\u00b6\u00b7\5\'\24\2\u00b7\u00b8\5\17\b\2\u00b8"+
		"\u00b9\5!\21\2\u00b9\u00ba\5\17\b\2\u00ba\u00bb\5\'\24\2\u00bb:\3\2\2"+
		"\2\u00bc\u00bd\5\23\n\2\u00bd\u00be\5\17\b\2\u00be<\3\2\2\2\u00bf\u00c0"+
		"\5\23\n\2\u00c0\u00c1\5\17\b\2\u00c1\u00c2\5#\22\2\u00c2\u00c3\5\21\t"+
		"\2\u00c3>\3\2\2\2\u00c4\u00c5\5\t\5\2\u00c5\u00c6\5#\22\2\u00c6\u00c7"+
		"\5\35\17\2\u00c7\u00c8\5\t\5\2\u00c8\u00c9\5\'\24\2\u00c9\u00ca\5\21\t"+
		"\2\u00ca@\3\2\2\2\u00cb\u00cc\5\13\6\2\u00cc\u00cd\5\37\20\2\u00cd\u00ce"+
		"\5\21\t\2\u00ce\u00cf\5\35\17\2\u00cf\u00d0\5\3\2\2\u00d0\u00d1\5#\22"+
		"\2\u00d1\u00d2\5\35\17\2\u00d2\u00d3\5\t\5\2\u00d3B\3\2\2\2\u00d4\u00d5"+
		"\5\35\17\2\u00d5\u00d6\5\t\5\2\u00d6\u00d7\5)\25\2\u00d7\u00d8\5\35\17"+
		"\2\u00d8\u00d9\5\21\t\2\u00d9D\3\2\2\2\u00da\u00db\5\5\3\2\u00db\u00dc"+
		"\5\21\t\2\u00dc\u00dd\5\21\t\2\u00dd\u00de\5\37\20\2\u00deF\3\2\2\2\u00df"+
		"\u00e0\5\33\16\2\u00e0\u00e1\5\3\2\2\u00e1\u00e2\5\7\4\2\u00e2\u00e3\5"+
		"\17\b\2\u00e3\u00e4\5\21\t\2\u00e4H\3\2\2\2\u00e5\u00e6\7*\2\2\u00e6J"+
		"\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8L\3\2\2\2\u00e9\u00ea\7}\2\2\u00eaN\3"+
		"\2\2\2\u00eb\u00ec\7\177\2\2\u00ecP\3\2\2\2\u00ed\u00ee\7]\2\2\u00eeR"+
		"\3\2\2\2\u00ef\u00f0\7_\2\2\u00f0T\3\2\2\2\u00f1\u00f2\7=\2\2\u00f2V\3"+
		"\2\2\2\u00f3\u00f4\7<\2\2\u00f4X\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6Z\3"+
		"\2\2\2\u00f7\u00f8\7-\2\2\u00f8\\\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa^\3"+
		"\2\2\2\u00fb\u00fc\7\61\2\2\u00fc`\3\2\2\2\u00fd\u00fe\7,\2\2\u00feb\3"+
		"\2\2\2\u00ff\u0100\7?\2\2\u0100d\3\2\2\2\u0101\u0102\7@\2\2\u0102f\3\2"+
		"\2\2\u0103\u0104\7>\2\2\u0104h\3\2\2\2\u0105\u0106\7#\2\2\u0106j\3\2\2"+
		"\2\u0107\u0109\5+\26\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\5+\26\2\u010el\3\2\2\2\u010f\u0111\5/\30\2\u0110\u010f\3\2\2\2"+
		"\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113n\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5/\30\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011c\5Y-\2\u011c\u011e\b8\2\2\u011d\u011f"+
		"\5/\30\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121p\3\2\2\2\u0122\u0123\5%\23\2\u0123\u0124\5\'\24\2"+
		"\u0124\u0125\5\21\t\2\u0125\u0126\5\r\7\2\u0126\u0127\5\'\24\2\u0127\u0128"+
		"\5\3\2\2\u0128\u0129\5!\21\2\u0129\u012a\5\3\2\2\u012ar\3\2\2\2\u012b"+
		"\u012c\7\17\2\2\u012c\u012d\7]\2\2\u012d\u012e\7C\2\2\u012e\u012f\7/\2"+
		"\2\u012f\u0130\7\\\2\2\u0130\u0131\7c\2\2\u0131\u0132\7/\2\2\u0132\u0133"+
		"\7|\2\2\u0133\u0134\7_\2\2\u0134\u0135\7]\2\2\u0135\u0136\7C\2\2\u0136"+
		"\u0137\7/\2\2\u0137\u0138\7\\\2\2\u0138\u0139\7c\2\2\u0139\u013a\7/\2"+
		"\2\u013a\u013b\7|\2\2\u013b\u013c\7\62\2\2\u013c\u013d\7/\2\2\u013d\u013e"+
		"\7;\2\2\u013e\u013f\7a\2\2\u013f\u0140\7_\2\2\u0140\u0141\7,\2\2\u0141"+
		"t\3\2\2\2\u0142\u0144\7\17\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145\u0148\7\f\2\2\u0146\u0148\7\17\2\2\u0147\u0143"+
		"\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014av\3\2\2\2\u014b\u014f\t\31\2\2\u014c\u014e\13\2\2"+
		"\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\t\32\2\2"+
		"\u0153x\3\2\2\2\13\2\u010a\u0112\u0118\u0120\u0143\u0147\u0149\u014f\3"+
		"\38\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}