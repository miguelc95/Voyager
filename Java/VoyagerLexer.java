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
		FUNC=1, VAR=2, IMPRIMIR=3, SI=4, SINO=5, ENTERO=6, FLOTANTE=7, TEXTO=8, 
		BOOL=9, VACIO=10, REGRESA=11, MIENTRAS=12, ABRE_PAREN=13, CIERRA_PAREN=14, 
		ABRE_BRACKET=15, CIERRA_BRACKET=16, ABRE_CORCHETE=17, CIERRA_CORCHETE=18, 
		SEMI_COLON=19, DOUBLE_DOT=20, DOT=21, COMA=22, SUMA=23, RESTA=24, DIV=25, 
		MULT=26, IGUAL=27, MAS_QUE=28, MENOS_QUE=29, AND=30, OR=31, IGUAL_IGUAL=32, 
		DIFERENTE_DE=33, LETRERO=34, CTE_E=35, CTE_F=36, PROGRAMA=37, ID=38, NEWLINE=39, 
		TEXT=40;
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
		"SI", "SINO", "ENTERO", "FLOTANTE", "TEXTO", "BOOL", "VACIO", "REGRESA", 
		"MIENTRAS", "ABRE_PAREN", "CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", 
		"ABRE_CORCHETE", "CIERRA_CORCHETE", "SEMI_COLON", "DOUBLE_DOT", "DOT", 
		"COMA", "SUMA", "RESTA", "DIV", "MULT", "IGUAL", "MAS_QUE", "MENOS_QUE", 
		"AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", "LETRERO", "CTE_E", "CTE_F", 
		"PROGRAMA", "ID", "NEWLINE", "TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", "ENTERO", "FLOTANTE", "TEXTO", 
		"BOOL", "VACIO", "REGRESA", "MIENTRAS", "ABRE_PAREN", "CIERRA_PAREN", 
		"ABRE_BRACKET", "CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", 
		"SEMI_COLON", "DOUBLE_DOT", "DOT", "COMA", "SUMA", "RESTA", "DIV", "MULT", 
		"IGUAL", "MAS_QUE", "MENOS_QUE", "AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", 
		"LETRERO", "CTE_E", "CTE_F", "PROGRAMA", "ID", "NEWLINE", "TEXT"
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
		case 58:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 64:
			CTE_F_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			2
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			2
			break;
		}
	}
	private void CTE_F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			1
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u018d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\7@\u0144\n@\f@\16@\u0147"+
		"\13@\3@\3@\3A\6A\u014c\nA\rA\16A\u014d\3B\6B\u0151\nB\rB\16B\u0152\3B"+
		"\3B\3B\6B\u0158\nB\rB\16B\u0159\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\5E\u017d"+
		"\nE\3E\3E\6E\u0181\nE\rE\16E\u0182\3F\3F\7F\u0187\nF\fF\16F\u018a\13F"+
		"\3F\3F\4\u0145\u0188\2G\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27"+
		"\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2"+
		";\2=\3?\4A\5C\6E\7G\bI\tK\nM\13O\fQ\rS\16U\17W\20Y\21[\22]\23_\24a\25"+
		"c\26e\27g\30i\31k\32m\33o\34q\35s\36u\37w y!{\"}#\177$\u0081%\u0083&\u0085"+
		"\'\u0087(\u0089)\u008b*\3\2\33\4\2CCcc\4\2DDdd\4\2EEee\4\2GGgg\4\2HHh"+
		"h\4\2IIii\4\2KKkk\4\2QQqq\4\2UUuu\4\2[[{{\4\2JJjj\4\2WWww\4\2XXxx\4\2"+
		"VVvv\4\2NNnn\4\2OOoo\4\2PPpp\4\2RRrr\4\2TTtt\4\2ZZzz\4\2--//\3\2c|\3\2"+
		"C\\\4\2**]]\4\2++__\2\u0177\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091\3\2\2\2\t\u0093\3\2\2"+
		"\2\13\u0095\3\2\2\2\r\u0097\3\2\2\2\17\u0099\3\2\2\2\21\u009b\3\2\2\2"+
		"\23\u009d\3\2\2\2\25\u009f\3\2\2\2\27\u00a1\3\2\2\2\31\u00a3\3\2\2\2\33"+
		"\u00a5\3\2\2\2\35\u00a7\3\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad"+
		"\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2"+
		"-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf"+
		"\3\2\2\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2"+
		"?\u00cc\3\2\2\2A\u00d0\3\2\2\2C\u00d9\3\2\2\2E\u00dc\3\2\2\2G\u00e1\3"+
		"\2\2\2I\u00e8\3\2\2\2K\u00f1\3\2\2\2M\u00f7\3\2\2\2O\u00fc\3\2\2\2Q\u0102"+
		"\3\2\2\2S\u010a\3\2\2\2U\u0113\3\2\2\2W\u0115\3\2\2\2Y\u0117\3\2\2\2["+
		"\u0119\3\2\2\2]\u011b\3\2\2\2_\u011d\3\2\2\2a\u011f\3\2\2\2c\u0121\3\2"+
		"\2\2e\u0123\3\2\2\2g\u0125\3\2\2\2i\u0127\3\2\2\2k\u0129\3\2\2\2m\u012b"+
		"\3\2\2\2o\u012d\3\2\2\2q\u012f\3\2\2\2s\u0131\3\2\2\2u\u0133\3\2\2\2w"+
		"\u0135\3\2\2\2y\u0138\3\2\2\2{\u013b\3\2\2\2}\u013e\3\2\2\2\177\u0141"+
		"\3\2\2\2\u0081\u014b\3\2\2\2\u0083\u0150\3\2\2\2\u0085\u015b\3\2\2\2\u0087"+
		"\u0164\3\2\2\2\u0089\u0180\3\2\2\2\u008b\u0184\3\2\2\2\u008d\u008e\t\2"+
		"\2\2\u008e\4\3\2\2\2\u008f\u0090\t\3\2\2\u0090\6\3\2\2\2\u0091\u0092\t"+
		"\4\2\2\u0092\b\3\2\2\2\u0093\u0094\t\5\2\2\u0094\n\3\2\2\2\u0095\u0096"+
		"\t\6\2\2\u0096\f\3\2\2\2\u0097\u0098\t\7\2\2\u0098\16\3\2\2\2\u0099\u009a"+
		"\t\b\2\2\u009a\20\3\2\2\2\u009b\u009c\t\t\2\2\u009c\22\3\2\2\2\u009d\u009e"+
		"\t\n\2\2\u009e\24\3\2\2\2\u009f\u00a0\t\13\2\2\u00a0\26\3\2\2\2\u00a1"+
		"\u00a2\t\f\2\2\u00a2\30\3\2\2\2\u00a3\u00a4\t\r\2\2\u00a4\32\3\2\2\2\u00a5"+
		"\u00a6\t\16\2\2\u00a6\34\3\2\2\2\u00a7\u00a8\t\17\2\2\u00a8\36\3\2\2\2"+
		"\u00a9\u00aa\t\20\2\2\u00aa \3\2\2\2\u00ab\u00ac\t\21\2\2\u00ac\"\3\2"+
		"\2\2\u00ad\u00ae\t\22\2\2\u00ae$\3\2\2\2\u00af\u00b0\t\23\2\2\u00b0&\3"+
		"\2\2\2\u00b1\u00b2\t\24\2\2\u00b2(\3\2\2\2\u00b3\u00b4\t\25\2\2\u00b4"+
		"*\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8."+
		"\3\2\2\2\u00b9\u00ba\7#\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\t\26\2\2\u00bc"+
		"\62\3\2\2\2\u00bd\u00be\4\62;\2\u00be\64\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0"+
		"\66\3\2\2\2\u00c1\u00c2\7~\2\2\u00c28\3\2\2\2\u00c3\u00c4\t\27\2\2\u00c4"+
		":\3\2\2\2\u00c5\u00c6\t\30\2\2\u00c6<\3\2\2\2\u00c7\u00c8\5\13\6\2\u00c8"+
		"\u00c9\5\31\r\2\u00c9\u00ca\5#\22\2\u00ca\u00cb\5\7\4\2\u00cb>\3\2\2\2"+
		"\u00cc\u00cd\5\33\16\2\u00cd\u00ce\5\3\2\2\u00ce\u00cf\5\'\24\2\u00cf"+
		"@\3\2\2\2\u00d0\u00d1\5\17\b\2\u00d1\u00d2\5!\21\2\u00d2\u00d3\5%\23\2"+
		"\u00d3\u00d4\5\'\24\2\u00d4\u00d5\5\17\b\2\u00d5\u00d6\5!\21\2\u00d6\u00d7"+
		"\5\17\b\2\u00d7\u00d8\5\'\24\2\u00d8B\3\2\2\2\u00d9\u00da\5\23\n\2\u00da"+
		"\u00db\5\17\b\2\u00dbD\3\2\2\2\u00dc\u00dd\5\23\n\2\u00dd\u00de\5\17\b"+
		"\2\u00de\u00df\5#\22\2\u00df\u00e0\5\21\t\2\u00e0F\3\2\2\2\u00e1\u00e2"+
		"\5\t\5\2\u00e2\u00e3\5#\22\2\u00e3\u00e4\5\35\17\2\u00e4\u00e5\5\t\5\2"+
		"\u00e5\u00e6\5\'\24\2\u00e6\u00e7\5\21\t\2\u00e7H\3\2\2\2\u00e8\u00e9"+
		"\5\13\6\2\u00e9\u00ea\5\37\20\2\u00ea\u00eb\5\21\t\2\u00eb\u00ec\5\35"+
		"\17\2\u00ec\u00ed\5\3\2\2\u00ed\u00ee\5#\22\2\u00ee\u00ef\5\35\17\2\u00ef"+
		"\u00f0\5\t\5\2\u00f0J\3\2\2\2\u00f1\u00f2\5\35\17\2\u00f2\u00f3\5\t\5"+
		"\2\u00f3\u00f4\5)\25\2\u00f4\u00f5\5\35\17\2\u00f5\u00f6\5\21\t\2\u00f6"+
		"L\3\2\2\2\u00f7\u00f8\5\5\3\2\u00f8\u00f9\5\21\t\2\u00f9\u00fa\5\21\t"+
		"\2\u00fa\u00fb\5\37\20\2\u00fbN\3\2\2\2\u00fc\u00fd\5\33\16\2\u00fd\u00fe"+
		"\5\3\2\2\u00fe\u00ff\5\7\4\2\u00ff\u0100\5\17\b\2\u0100\u0101\5\21\t\2"+
		"\u0101P\3\2\2\2\u0102\u0103\5\'\24\2\u0103\u0104\5\t\5\2\u0104\u0105\5"+
		"\r\7\2\u0105\u0106\5\'\24\2\u0106\u0107\5\t\5\2\u0107\u0108\5\23\n\2\u0108"+
		"\u0109\5\3\2\2\u0109R\3\2\2\2\u010a\u010b\5!\21\2\u010b\u010c\5\17\b\2"+
		"\u010c\u010d\5\t\5\2\u010d\u010e\5#\22\2\u010e\u010f\5\35\17\2\u010f\u0110"+
		"\5\'\24\2\u0110\u0111\5\3\2\2\u0111\u0112\5\23\n\2\u0112T\3\2\2\2\u0113"+
		"\u0114\7*\2\2\u0114V\3\2\2\2\u0115\u0116\7+\2\2\u0116X\3\2\2\2\u0117\u0118"+
		"\7}\2\2\u0118Z\3\2\2\2\u0119\u011a\7\177\2\2\u011a\\\3\2\2\2\u011b\u011c"+
		"\7]\2\2\u011c^\3\2\2\2\u011d\u011e\7_\2\2\u011e`\3\2\2\2\u011f\u0120\7"+
		"=\2\2\u0120b\3\2\2\2\u0121\u0122\7<\2\2\u0122d\3\2\2\2\u0123\u0124\7\60"+
		"\2\2\u0124f\3\2\2\2\u0125\u0126\7.\2\2\u0126h\3\2\2\2\u0127\u0128\7-\2"+
		"\2\u0128j\3\2\2\2\u0129\u012a\7/\2\2\u012al\3\2\2\2\u012b\u012c\7\61\2"+
		"\2\u012cn\3\2\2\2\u012d\u012e\7,\2\2\u012ep\3\2\2\2\u012f\u0130\7?\2\2"+
		"\u0130r\3\2\2\2\u0131\u0132\7@\2\2\u0132t\3\2\2\2\u0133\u0134\7>\2\2\u0134"+
		"v\3\2\2\2\u0135\u0136\5\65\33\2\u0136\u0137\b<\2\2\u0137x\3\2\2\2\u0138"+
		"\u0139\5\67\34\2\u0139\u013a\b=\3\2\u013az\3\2\2\2\u013b\u013c\5-\27\2"+
		"\u013c\u013d\5-\27\2\u013d|\3\2\2\2\u013e\u013f\5/\30\2\u013f\u0140\5"+
		"-\27\2\u0140~\3\2\2\2\u0141\u0145\5+\26\2\u0142\u0144\13\2\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\5+\26\2\u0149\u0080\3\2"+
		"\2\2\u014a\u014c\5\63\32\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0082\3\2\2\2\u014f\u0151\5\63"+
		"\32\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\5e\63\2\u0155\u0157\bB"+
		"\4\2\u0156\u0158\5\63\32\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0084\3\2\2\2\u015b\u015c\5%"+
		"\23\2\u015c\u015d\5\'\24\2\u015d\u015e\5\21\t\2\u015e\u015f\5\r\7\2\u015f"+
		"\u0160\5\'\24\2\u0160\u0161\5\3\2\2\u0161\u0162\5!\21\2\u0162\u0163\5"+
		"\3\2\2\u0163\u0086\3\2\2\2\u0164\u0165\7\17\2\2\u0165\u0166\7]\2\2\u0166"+
		"\u0167\7C\2\2\u0167\u0168\7/\2\2\u0168\u0169\7\\\2\2\u0169\u016a\7c\2"+
		"\2\u016a\u016b\7/\2\2\u016b\u016c\7|\2\2\u016c\u016d\7_\2\2\u016d\u016e"+
		"\7]\2\2\u016e\u016f\7C\2\2\u016f\u0170\7/\2\2\u0170\u0171\7\\\2\2\u0171"+
		"\u0172\7c\2\2\u0172\u0173\7/\2\2\u0173\u0174\7|\2\2\u0174\u0175\7\62\2"+
		"\2\u0175\u0176\7/\2\2\u0176\u0177\7;\2\2\u0177\u0178\7a\2\2\u0178\u0179"+
		"\7_\2\2\u0179\u017a\7,\2\2\u017a\u0088\3\2\2\2\u017b\u017d\7\17\2\2\u017c"+
		"\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\7\f"+
		"\2\2\u017f\u0181\7\17\2\2\u0180\u017c\3\2\2\2\u0180\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u008a\3\2"+
		"\2\2\u0184\u0188\t\31\2\2\u0185\u0187\13\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018c\t\32\2\2\u018c\u008c\3\2\2\2\13\2"+
		"\u0145\u014d\u0152\u0159\u017c\u0180\u0182\u0188\5\3<\2\3=\3\3B\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}