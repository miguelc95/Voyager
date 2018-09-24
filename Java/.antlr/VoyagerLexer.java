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
		BOOL=9, VACIO=10, REGRESA=11, ABRE_PAREN=12, CIERRA_PAREN=13, ABRE_BRACKET=14, 
		CIERRA_BRACKET=15, ABRE_CORCHETE=16, CIERRA_CORCHETE=17, SEMI_COLON=18, 
		DOUBLE_DOT=19, DOT=20, SUMA=21, RESTA=22, DIV=23, MULT=24, IGUAL=25, MAS_QUE=26, 
		MENOS_QUE=27, NO_IGUAL=28, LETRERO=29, CTE_E=30, CTE_F=31, PROGRAMA=32, 
		ID=33, NEWLINE=34, TEXT=35;
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
		"TEXTO", "BOOL", "VACIO", "REGRESA", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", 
		"CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", "SEMI_COLON", "DOUBLE_DOT", 
		"DOT", "SUMA", "RESTA", "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", 
		"NO_IGUAL", "LETRERO", "CTE_E", "CTE_F", "PROGRAMA", "ID", "NEWLINE", 
		"TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", "ENTERO", "FLOTANTE", "TEXTO", 
		"BOOL", "VACIO", "REGRESA", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", 
		"CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", "SEMI_COLON", "DOUBLE_DOT", 
		"DOT", "SUMA", "RESTA", "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", 
		"NO_IGUAL", "LETRERO", "CTE_E", "CTE_F", "PROGRAMA", "ID", "NEWLINE", 
		"TEXT"
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
		case 55:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\7\67\u0115\n\67\f\67\16\67\u0118\13\67\3\67\3\67\38\78\u011d\n8\f8\16"+
		"8\u0120\138\39\79\u0123\n9\f9\169\u0126\139\39\39\39\69\u012b\n9\r9\16"+
		"9\u012c\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\5<\u0150\n<\3<\3<\6<\u0154\n<\r"+
		"<\16<\u0155\3=\3=\7=\u015a\n=\f=\16=\u015d\13=\3=\3=\4\u0116\u015b\2>"+
		"\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2"+
		"!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\3\67\49\5;\6=\7?\bA\tC\nE\13G\f"+
		"I\rK\16M\17O\20Q\21S\22U\23W\24Y\25[\26]\27_\30a\31c\32e\33g\34i\35k\36"+
		"m\37o q!s\"u#w$y%\3\2\33\4\2CCcc\4\2DDdd\4\2EEee\4\2GGgg\4\2HHhh\4\2I"+
		"Iii\4\2KKkk\4\2QQqq\4\2UUuu\4\2[[{{\4\2JJjj\4\2WWww\4\2XXxx\4\2VVvv\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2RRrr\4\2TTtt\4\2ZZzz\4\2--//\3\2c|\3\2C\\\4"+
		"\2**]]\4\2++__\2\u014e\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2"+
		"\2\2\5}\3\2\2\2\7\177\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085"+
		"\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3"+
		"\2\2\2\27\u008f\3\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2"+
		"\2\2\37\u0097\3\2\2\2!\u0099\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u009f"+
		"\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61"+
		"\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2\2\2\67\u00b2\3\2\2\29\u00b6"+
		"\3\2\2\2;\u00bf\3\2\2\2=\u00c2\3\2\2\2?\u00c7\3\2\2\2A\u00ce\3\2\2\2C"+
		"\u00d7\3\2\2\2E\u00dd\3\2\2\2G\u00e2\3\2\2\2I\u00e8\3\2\2\2K\u00f0\3\2"+
		"\2\2M\u00f2\3\2\2\2O\u00f4\3\2\2\2Q\u00f6\3\2\2\2S\u00f8\3\2\2\2U\u00fa"+
		"\3\2\2\2W\u00fc\3\2\2\2Y\u00fe\3\2\2\2[\u0100\3\2\2\2]\u0102\3\2\2\2_"+
		"\u0104\3\2\2\2a\u0106\3\2\2\2c\u0108\3\2\2\2e\u010a\3\2\2\2g\u010c\3\2"+
		"\2\2i\u010e\3\2\2\2k\u0110\3\2\2\2m\u0112\3\2\2\2o\u011e\3\2\2\2q\u0124"+
		"\3\2\2\2s\u012e\3\2\2\2u\u0137\3\2\2\2w\u0153\3\2\2\2y\u0157\3\2\2\2{"+
		"|\t\2\2\2|\4\3\2\2\2}~\t\3\2\2~\6\3\2\2\2\177\u0080\t\4\2\2\u0080\b\3"+
		"\2\2\2\u0081\u0082\t\5\2\2\u0082\n\3\2\2\2\u0083\u0084\t\6\2\2\u0084\f"+
		"\3\2\2\2\u0085\u0086\t\7\2\2\u0086\16\3\2\2\2\u0087\u0088\t\b\2\2\u0088"+
		"\20\3\2\2\2\u0089\u008a\t\t\2\2\u008a\22\3\2\2\2\u008b\u008c\t\n\2\2\u008c"+
		"\24\3\2\2\2\u008d\u008e\t\13\2\2\u008e\26\3\2\2\2\u008f\u0090\t\f\2\2"+
		"\u0090\30\3\2\2\2\u0091\u0092\t\r\2\2\u0092\32\3\2\2\2\u0093\u0094\t\16"+
		"\2\2\u0094\34\3\2\2\2\u0095\u0096\t\17\2\2\u0096\36\3\2\2\2\u0097\u0098"+
		"\t\20\2\2\u0098 \3\2\2\2\u0099\u009a\t\21\2\2\u009a\"\3\2\2\2\u009b\u009c"+
		"\t\22\2\2\u009c$\3\2\2\2\u009d\u009e\t\23\2\2\u009e&\3\2\2\2\u009f\u00a0"+
		"\t\24\2\2\u00a0(\3\2\2\2\u00a1\u00a2\t\25\2\2\u00a2*\3\2\2\2\u00a3\u00a4"+
		"\7$\2\2\u00a4,\3\2\2\2\u00a5\u00a6\t\26\2\2\u00a6.\3\2\2\2\u00a7\u00a8"+
		"\4\62;\2\u00a8\60\3\2\2\2\u00a9\u00aa\t\27\2\2\u00aa\62\3\2\2\2\u00ab"+
		"\u00ac\t\30\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\5\13\6\2\u00ae\u00af\5\31"+
		"\r\2\u00af\u00b0\5#\22\2\u00b0\u00b1\5\7\4\2\u00b1\66\3\2\2\2\u00b2\u00b3"+
		"\5\33\16\2\u00b3\u00b4\5\3\2\2\u00b4\u00b5\5\'\24\2\u00b58\3\2\2\2\u00b6"+
		"\u00b7\5\17\b\2\u00b7\u00b8\5!\21\2\u00b8\u00b9\5%\23\2\u00b9\u00ba\5"+
		"\'\24\2\u00ba\u00bb\5\17\b\2\u00bb\u00bc\5!\21\2\u00bc\u00bd\5\17\b\2"+
		"\u00bd\u00be\5\'\24\2\u00be:\3\2\2\2\u00bf\u00c0\5\23\n\2\u00c0\u00c1"+
		"\5\17\b\2\u00c1<\3\2\2\2\u00c2\u00c3\5\23\n\2\u00c3\u00c4\5\17\b\2\u00c4"+
		"\u00c5\5#\22\2\u00c5\u00c6\5\21\t\2\u00c6>\3\2\2\2\u00c7\u00c8\5\t\5\2"+
		"\u00c8\u00c9\5#\22\2\u00c9\u00ca\5\35\17\2\u00ca\u00cb\5\t\5\2\u00cb\u00cc"+
		"\5\'\24\2\u00cc\u00cd\5\21\t\2\u00cd@\3\2\2\2\u00ce\u00cf\5\13\6\2\u00cf"+
		"\u00d0\5\37\20\2\u00d0\u00d1\5\21\t\2\u00d1\u00d2\5\35\17\2\u00d2\u00d3"+
		"\5\3\2\2\u00d3\u00d4\5#\22\2\u00d4\u00d5\5\35\17\2\u00d5\u00d6\5\t\5\2"+
		"\u00d6B\3\2\2\2\u00d7\u00d8\5\35\17\2\u00d8\u00d9\5\t\5\2\u00d9\u00da"+
		"\5)\25\2\u00da\u00db\5\35\17\2\u00db\u00dc\5\21\t\2\u00dcD\3\2\2\2\u00dd"+
		"\u00de\5\5\3\2\u00de\u00df\5\21\t\2\u00df\u00e0\5\21\t\2\u00e0\u00e1\5"+
		"\37\20\2\u00e1F\3\2\2\2\u00e2\u00e3\5\33\16\2\u00e3\u00e4\5\3\2\2\u00e4"+
		"\u00e5\5\7\4\2\u00e5\u00e6\5\17\b\2\u00e6\u00e7\5\21\t\2\u00e7H\3\2\2"+
		"\2\u00e8\u00e9\5\'\24\2\u00e9\u00ea\5\t\5\2\u00ea\u00eb\5\r\7\2\u00eb"+
		"\u00ec\5\'\24\2\u00ec\u00ed\5\t\5\2\u00ed\u00ee\5\23\n\2\u00ee\u00ef\5"+
		"\3\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1L\3\2\2\2\u00f2\u00f3\7"+
		"+\2\2\u00f3N\3\2\2\2\u00f4\u00f5\7}\2\2\u00f5P\3\2\2\2\u00f6\u00f7\7\177"+
		"\2\2\u00f7R\3\2\2\2\u00f8\u00f9\7]\2\2\u00f9T\3\2\2\2\u00fa\u00fb\7_\2"+
		"\2\u00fbV\3\2\2\2\u00fc\u00fd\7=\2\2\u00fdX\3\2\2\2\u00fe\u00ff\7<\2\2"+
		"\u00ffZ\3\2\2\2\u0100\u0101\7\60\2\2\u0101\\\3\2\2\2\u0102\u0103\7-\2"+
		"\2\u0103^\3\2\2\2\u0104\u0105\7/\2\2\u0105`\3\2\2\2\u0106\u0107\7\61\2"+
		"\2\u0107b\3\2\2\2\u0108\u0109\7,\2\2\u0109d\3\2\2\2\u010a\u010b\7?\2\2"+
		"\u010bf\3\2\2\2\u010c\u010d\7@\2\2\u010dh\3\2\2\2\u010e\u010f\7>\2\2\u010f"+
		"j\3\2\2\2\u0110\u0111\7#\2\2\u0111l\3\2\2\2\u0112\u0116\5+\26\2\u0113"+
		"\u0115\13\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0117\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\5+\26\2\u011an\3\2\2\2\u011b\u011d\5/\30\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011fp\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123\5/\30\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0128\5[.\2\u0128\u012a\b9\2\2\u0129\u012b"+
		"\5/\30\2\u012a\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012dr\3\2\2\2\u012e\u012f\5%\23\2\u012f\u0130\5\'\24\2"+
		"\u0130\u0131\5\21\t\2\u0131\u0132\5\r\7\2\u0132\u0133\5\'\24\2\u0133\u0134"+
		"\5\3\2\2\u0134\u0135\5!\21\2\u0135\u0136\5\3\2\2\u0136t\3\2\2\2\u0137"+
		"\u0138\7\17\2\2\u0138\u0139\7]\2\2\u0139\u013a\7C\2\2\u013a\u013b\7/\2"+
		"\2\u013b\u013c\7\\\2\2\u013c\u013d\7c\2\2\u013d\u013e\7/\2\2\u013e\u013f"+
		"\7|\2\2\u013f\u0140\7_\2\2\u0140\u0141\7]\2\2\u0141\u0142\7C\2\2\u0142"+
		"\u0143\7/\2\2\u0143\u0144\7\\\2\2\u0144\u0145\7c\2\2\u0145\u0146\7/\2"+
		"\2\u0146\u0147\7|\2\2\u0147\u0148\7\62\2\2\u0148\u0149\7/\2\2\u0149\u014a"+
		"\7;\2\2\u014a\u014b\7a\2\2\u014b\u014c\7_\2\2\u014c\u014d\7,\2\2\u014d"+
		"v\3\2\2\2\u014e\u0150\7\17\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2"+
		"\u0150\u0151\3\2\2\2\u0151\u0154\7\f\2\2\u0152\u0154\7\17\2\2\u0153\u014f"+
		"\3\2\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156x\3\2\2\2\u0157\u015b\t\31\2\2\u0158\u015a\13\2\2"+
		"\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015c\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\t\32\2\2"+
		"\u015fz\3\2\2\2\13\2\u0116\u011e\u0124\u012c\u014f\u0153\u0155\u015b\3"+
		"\39\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}