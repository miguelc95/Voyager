// Generated from Voyager.g4 by ANTLR 4.7.1
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
		FUNC=1, VAR=2, IMPRIMIR=3, SI=4, SINO=5, ENTERO=6, CHAR=7, FLOTANTE=8, 
		TEXTO=9, BOOL=10, VACIO=11, REGRESA=12, MIENTRAS=13, ABRE_PAREN=14, CIERRA_PAREN=15, 
		ABRE_BRACKET=16, CIERRA_BRACKET=17, ABRE_CORCHETE=18, CIERRA_CORCHETE=19, 
		SEMI_COLON=20, DOUBLE_DOT=21, DOT=22, COMA=23, SUMA=24, RESTA=25, DIV=26, 
		MULT=27, IGUAL=28, MAS_QUE=29, MENOS_QUE=30, AND=31, OR=32, IGUAL_IGUAL=33, 
		DIFERENTE_DE=34, LETRERO=35, CTE_E=36, CTE_F=37, CTE_C=38, PROGRAMA=39, 
		ID=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "E", "F", "G", "I", "O", "S", "Y", "H", "U", "V", "T", 
		"L", "M", "N", "P", "R", "X", "QUOTE", "EQUAL", "NOT", "SIGNO", "DIGITO", 
		"AMPERSAND", "PALITO", "LOWERCASE", "UPPERCASE", "FUNC", "VAR", "IMPRIMIR", 
		"SI", "SINO", "ENTERO", "CHAR", "FLOTANTE", "TEXTO", "BOOL", "VACIO", 
		"REGRESA", "MIENTRAS", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", 
		"ABRE_CORCHETE", "CIERRA_CORCHETE", "SEMI_COLON", "DOUBLE_DOT", "DOT", 
		"COMA", "SUMA", "RESTA", "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", 
		"AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", "LETRERO", "CTE_E", "CTE_F", 
		"CTE_C", "PROGRAMA", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", "ENTERO", "CHAR", "FLOTANTE", 
		"TEXTO", "BOOL", "VACIO", "REGRESA", "MIENTRAS", "ABRE_PAREN", "CIERRA_PAREN", 
		"ABRE_BRACKET", "CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", 
		"SEMI_COLON", "DOUBLE_DOT", "DOT", "COMA", "SUMA", "RESTA", "DIV", "MULT", 
		"IGUAL", "MAS_QUE", "MENOS_QUE", "AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", 
		"LETRERO", "CTE_E", "CTE_F", "CTE_C", "PROGRAMA", "ID", "WS"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u017a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3"+
		"A\7A\u014b\nA\fA\16A\u014e\13A\3A\3A\3B\6B\u0153\nB\rB\16B\u0154\3C\6"+
		"C\u0158\nC\rC\16C\u0159\3C\3C\6C\u015e\nC\rC\16C\u015f\3D\3D\3E\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3F\3F\7F\u016f\nF\fF\16F\u0172\13F\3G\6G\u0175\nG\r"+
		"G\16G\u0176\3G\3G\3\u014c\2H\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\3?\4A\5C\6E\7G\bI\tK\nM\13O\fQ\rS\16U\17W\20Y\21[\22]\23_\24"+
		"a\25c\26e\27g\30i\31k\32m\33o\34q\35s\36u\37w y!{\"}#\177$\u0081%\u0083"+
		"&\u0085\'\u0087(\u0089)\u008b*\u008d+\3\2\35\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2GGgg\4\2HHhh\4\2IIii\4\2KKkk\4\2QQqq\4\2UUuu\4\2[[{{\4\2JJjj\4\2WWw"+
		"w\4\2XXxx\4\2VVvv\4\2NNnn\4\2OOoo\4\2PPpp\4\2RRrr\4\2TTtt\4\2ZZzz\4\2"+
		"--//\3\2c|\3\2C\\\5\2\62;C\\c|\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u0162\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0091\3\2\2\2\7\u0093\3\2\2\2\t\u0095"+
		"\3\2\2\2\13\u0097\3\2\2\2\r\u0099\3\2\2\2\17\u009b\3\2\2\2\21\u009d\3"+
		"\2\2\2\23\u009f\3\2\2\2\25\u00a1\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2"+
		"\2\2\33\u00a7\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00ad\3\2\2\2"+
		"#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00b7\3"+
		"\2\2\2-\u00b9\3\2\2\2/\u00bb\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2\2"+
		"\65\u00c1\3\2\2\2\67\u00c3\3\2\2\29\u00c5\3\2\2\2;\u00c7\3\2\2\2=\u00c9"+
		"\3\2\2\2?\u00ce\3\2\2\2A\u00d2\3\2\2\2C\u00db\3\2\2\2E\u00de\3\2\2\2G"+
		"\u00e3\3\2\2\2I\u00ea\3\2\2\2K\u00ef\3\2\2\2M\u00f8\3\2\2\2O\u00fe\3\2"+
		"\2\2Q\u0103\3\2\2\2S\u0109\3\2\2\2U\u0111\3\2\2\2W\u011a\3\2\2\2Y\u011c"+
		"\3\2\2\2[\u011e\3\2\2\2]\u0120\3\2\2\2_\u0122\3\2\2\2a\u0124\3\2\2\2c"+
		"\u0126\3\2\2\2e\u0128\3\2\2\2g\u012a\3\2\2\2i\u012c\3\2\2\2k\u012e\3\2"+
		"\2\2m\u0130\3\2\2\2o\u0132\3\2\2\2q\u0134\3\2\2\2s\u0136\3\2\2\2u\u0138"+
		"\3\2\2\2w\u013a\3\2\2\2y\u013c\3\2\2\2{\u013f\3\2\2\2}\u0142\3\2\2\2\177"+
		"\u0145\3\2\2\2\u0081\u0148\3\2\2\2\u0083\u0152\3\2\2\2\u0085\u0157\3\2"+
		"\2\2\u0087\u0161\3\2\2\2\u0089\u0163\3\2\2\2\u008b\u016c\3\2\2\2\u008d"+
		"\u0174\3\2\2\2\u008f\u0090\t\2\2\2\u0090\4\3\2\2\2\u0091\u0092\t\3\2\2"+
		"\u0092\6\3\2\2\2\u0093\u0094\t\4\2\2\u0094\b\3\2\2\2\u0095\u0096\t\5\2"+
		"\2\u0096\n\3\2\2\2\u0097\u0098\t\6\2\2\u0098\f\3\2\2\2\u0099\u009a\t\7"+
		"\2\2\u009a\16\3\2\2\2\u009b\u009c\t\b\2\2\u009c\20\3\2\2\2\u009d\u009e"+
		"\t\t\2\2\u009e\22\3\2\2\2\u009f\u00a0\t\n\2\2\u00a0\24\3\2\2\2\u00a1\u00a2"+
		"\t\13\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\t\f\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\t\r\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\t\16\2\2\u00a8\34\3\2\2\2"+
		"\u00a9\u00aa\t\17\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\t\20\2\2\u00ac \3\2"+
		"\2\2\u00ad\u00ae\t\21\2\2\u00ae\"\3\2\2\2\u00af\u00b0\t\22\2\2\u00b0$"+
		"\3\2\2\2\u00b1\u00b2\t\23\2\2\u00b2&\3\2\2\2\u00b3\u00b4\t\24\2\2\u00b4"+
		"(\3\2\2\2\u00b5\u00b6\t\25\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8"+
		",\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba.\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\60"+
		"\3\2\2\2\u00bd\u00be\t\26\2\2\u00be\62\3\2\2\2\u00bf\u00c0\4\62;\2\u00c0"+
		"\64\3\2\2\2\u00c1\u00c2\7(\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7~\2\2\u00c4"+
		"8\3\2\2\2\u00c5\u00c6\t\27\2\2\u00c6:\3\2\2\2\u00c7\u00c8\t\30\2\2\u00c8"+
		"<\3\2\2\2\u00c9\u00ca\5\13\6\2\u00ca\u00cb\5\31\r\2\u00cb\u00cc\5#\22"+
		"\2\u00cc\u00cd\5\7\4\2\u00cd>\3\2\2\2\u00ce\u00cf\5\33\16\2\u00cf\u00d0"+
		"\5\3\2\2\u00d0\u00d1\5\'\24\2\u00d1@\3\2\2\2\u00d2\u00d3\5\17\b\2\u00d3"+
		"\u00d4\5!\21\2\u00d4\u00d5\5%\23\2\u00d5\u00d6\5\'\24\2\u00d6\u00d7\5"+
		"\17\b\2\u00d7\u00d8\5!\21\2\u00d8\u00d9\5\17\b\2\u00d9\u00da\5\'\24\2"+
		"\u00daB\3\2\2\2\u00db\u00dc\5\23\n\2\u00dc\u00dd\5\17\b\2\u00ddD\3\2\2"+
		"\2\u00de\u00df\5\23\n\2\u00df\u00e0\5\17\b\2\u00e0\u00e1\5#\22\2\u00e1"+
		"\u00e2\5\21\t\2\u00e2F\3\2\2\2\u00e3\u00e4\5\t\5\2\u00e4\u00e5\5#\22\2"+
		"\u00e5\u00e6\5\35\17\2\u00e6\u00e7\5\t\5\2\u00e7\u00e8\5\'\24\2\u00e8"+
		"\u00e9\5\21\t\2\u00e9H\3\2\2\2\u00ea\u00eb\5\7\4\2\u00eb\u00ec\5\27\f"+
		"\2\u00ec\u00ed\5\3\2\2\u00ed\u00ee\5\'\24\2\u00eeJ\3\2\2\2\u00ef\u00f0"+
		"\5\13\6\2\u00f0\u00f1\5\37\20\2\u00f1\u00f2\5\21\t\2\u00f2\u00f3\5\35"+
		"\17\2\u00f3\u00f4\5\3\2\2\u00f4\u00f5\5#\22\2\u00f5\u00f6\5\35\17\2\u00f6"+
		"\u00f7\5\t\5\2\u00f7L\3\2\2\2\u00f8\u00f9\5\35\17\2\u00f9\u00fa\5\t\5"+
		"\2\u00fa\u00fb\5)\25\2\u00fb\u00fc\5\35\17\2\u00fc\u00fd\5\21\t\2\u00fd"+
		"N\3\2\2\2\u00fe\u00ff\5\5\3\2\u00ff\u0100\5\21\t\2\u0100\u0101\5\21\t"+
		"\2\u0101\u0102\5\37\20\2\u0102P\3\2\2\2\u0103\u0104\5\33\16\2\u0104\u0105"+
		"\5\3\2\2\u0105\u0106\5\7\4\2\u0106\u0107\5\17\b\2\u0107\u0108\5\21\t\2"+
		"\u0108R\3\2\2\2\u0109\u010a\5\'\24\2\u010a\u010b\5\t\5\2\u010b\u010c\5"+
		"\r\7\2\u010c\u010d\5\'\24\2\u010d\u010e\5\t\5\2\u010e\u010f\5\23\n\2\u010f"+
		"\u0110\5\3\2\2\u0110T\3\2\2\2\u0111\u0112\5!\21\2\u0112\u0113\5\17\b\2"+
		"\u0113\u0114\5\t\5\2\u0114\u0115\5#\22\2\u0115\u0116\5\35\17\2\u0116\u0117"+
		"\5\'\24\2\u0117\u0118\5\3\2\2\u0118\u0119\5\23\n\2\u0119V\3\2\2\2\u011a"+
		"\u011b\7*\2\2\u011bX\3\2\2\2\u011c\u011d\7+\2\2\u011dZ\3\2\2\2\u011e\u011f"+
		"\7}\2\2\u011f\\\3\2\2\2\u0120\u0121\7\177\2\2\u0121^\3\2\2\2\u0122\u0123"+
		"\7]\2\2\u0123`\3\2\2\2\u0124\u0125\7_\2\2\u0125b\3\2\2\2\u0126\u0127\7"+
		"=\2\2\u0127d\3\2\2\2\u0128\u0129\7<\2\2\u0129f\3\2\2\2\u012a\u012b\7\60"+
		"\2\2\u012bh\3\2\2\2\u012c\u012d\7.\2\2\u012dj\3\2\2\2\u012e\u012f\7-\2"+
		"\2\u012fl\3\2\2\2\u0130\u0131\7/\2\2\u0131n\3\2\2\2\u0132\u0133\7\61\2"+
		"\2\u0133p\3\2\2\2\u0134\u0135\7,\2\2\u0135r\3\2\2\2\u0136\u0137\7?\2\2"+
		"\u0137t\3\2\2\2\u0138\u0139\7@\2\2\u0139v\3\2\2\2\u013a\u013b\7>\2\2\u013b"+
		"x\3\2\2\2\u013c\u013d\5\65\33\2\u013d\u013e\5\65\33\2\u013ez\3\2\2\2\u013f"+
		"\u0140\5\67\34\2\u0140\u0141\5\67\34\2\u0141|\3\2\2\2\u0142\u0143\5-\27"+
		"\2\u0143\u0144\5-\27\2\u0144~\3\2\2\2\u0145\u0146\5/\30\2\u0146\u0147"+
		"\5-\27\2\u0147\u0080\3\2\2\2\u0148\u014c\5+\26\2\u0149\u014b\13\2\2\2"+
		"\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014d\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\5+\26\2\u0150"+
		"\u0082\3\2\2\2\u0151\u0153\5\63\32\2\u0152\u0151\3\2\2\2\u0153\u0154\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0084\3\2\2\2\u0156"+
		"\u0158\5\63\32\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\5g\64\2\u015c"+
		"\u015e\5\63\32\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u0086\3\2\2\2\u0161\u0162\t\31\2\2\u0162"+
		"\u0088\3\2\2\2\u0163\u0164\5%\23\2\u0164\u0165\5\'\24\2\u0165\u0166\5"+
		"\21\t\2\u0166\u0167\5\r\7\2\u0167\u0168\5\'\24\2\u0168\u0169\5\3\2\2\u0169"+
		"\u016a\5!\21\2\u016a\u016b\5\3\2\2\u016b\u008a\3\2\2\2\u016c\u0170\t\32"+
		"\2\2\u016d\u016f\t\33\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u008c\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0173\u0175\t\34\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\bG"+
		"\2\2\u0179\u008e\3\2\2\2\t\2\u014c\u0154\u0159\u015f\u0170\u0176\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}