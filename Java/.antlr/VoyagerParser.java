// Generated from /Users/miguelcuellar/Desktop/Campus/9no Semestre/Compis/Voyager/Voyager/Java/Voyager.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VoyagerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VERDADERO=1, FALSO=2, FUNC=3, VAR=4, IMPRIMIR=5, SI=6, SINO=7, ENTERO=8, 
		CHAR=9, FLOTANTE=10, TEXTO=11, BOOL=12, VACIO=13, REGRESA=14, MIENTRAS=15, 
		ABRE_PAREN=16, CIERRA_PAREN=17, ABRE_BRACKET=18, CIERRA_BRACKET=19, ABRE_CORCHETE=20, 
		CIERRA_CORCHETE=21, SEMI_COLON=22, DOUBLE_DOT=23, DOT=24, COMA=25, SUMA=26, 
		RESTA=27, DIV=28, MULT=29, IGUAL=30, MAS_QUE=31, MENOS_QUE=32, AND=33, 
		OR=34, IGUAL_IGUAL=35, DIFERENTE_DE=36, LETRERO=37, CTE_E=38, CTE_F=39, 
		CTE_C=40, CTE_B=41, PROGRAMA=42, ID=43, WS=44;
	public static final int
		RULE_voyager = 0, RULE_program = 1, RULE_bloqueprogram = 2, RULE_bloque1 = 3, 
		RULE_bloque2 = 4, RULE_bloque3 = 5, RULE_func = 6, RULE_parametros = 7, 
		RULE_parametros1 = 8, RULE_bloquefunc1 = 9, RULE_typefunc = 10, RULE_bloquefunc = 11, 
		RULE_bloque = 12, RULE_vector = 13, RULE_vector_asigna = 14, RULE_estatuto = 15, 
		RULE_asignacion = 16, RULE_idvector_asigna = 17, RULE_condicion = 18, 
		RULE_condicion1 = 19, RULE_declaracion = 20, RULE_idvector = 21, RULE_imprimir = 22, 
		RULE_imprimir1 = 23, RULE_ciclo = 24, RULE_llamada = 25, RULE_argumentos = 26, 
		RULE_argumentos1 = 27, RULE_expbool = 28, RULE_expbool1 = 29, RULE_expresion = 30, 
		RULE_expresion1 = 31, RULE_exp = 32, RULE_exp1 = 33, RULE_termino = 34, 
		RULE_termino2 = 35, RULE_factor = 36, RULE_operando = 37, RULE_cte_var = 38, 
		RULE_vector_acceso = 39, RULE_tipo = 40, RULE_lee_condicion = 41, RULE_verifica_tipo = 42, 
		RULE_sig_argumento = 43, RULE_mete_tipo = 44, RULE_mete_id = 45;
	public static final String[] ruleNames = {
		"voyager", "program", "bloqueprogram", "bloque1", "bloque2", "bloque3", 
		"func", "parametros", "parametros1", "bloquefunc1", "typefunc", "bloquefunc", 
		"bloque", "vector", "vector_asigna", "estatuto", "asignacion", "idvector_asigna", 
		"condicion", "condicion1", "declaracion", "idvector", "imprimir", "imprimir1", 
		"ciclo", "llamada", "argumentos", "argumentos1", "expbool", "expbool1", 
		"expresion", "expresion1", "exp", "exp1", "termino", "termino2", "factor", 
		"operando", "cte_var", "vector_acceso", "tipo", "lee_condicion", "verifica_tipo", 
		"sig_argumento", "mete_tipo", "mete_id"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VERDADERO", "FALSO", "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", "ENTERO", 
		"CHAR", "FLOTANTE", "TEXTO", "BOOL", "VACIO", "REGRESA", "MIENTRAS", "ABRE_PAREN", 
		"CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", 
		"SEMI_COLON", "DOUBLE_DOT", "DOT", "COMA", "SUMA", "RESTA", "DIV", "MULT", 
		"IGUAL", "MAS_QUE", "MENOS_QUE", "AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", 
		"LETRERO", "CTE_E", "CTE_F", "CTE_C", "CTE_B", "PROGRAMA", "ID", "WS"
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

	@Override
	public String getGrammarFileName() { return "Voyager.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VoyagerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class VoyagerContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VoyagerParser.EOF, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public VoyagerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voyager; }
	}

	public final VoyagerContext voyager() throws RecognitionException {
		VoyagerContext _localctx = new VoyagerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_voyager);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				program();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAMA );
			setState(97);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(VoyagerParser.PROGRAMA, 0); }
		public BloqueprogramContext bloqueprogram() {
			return getRuleContext(BloqueprogramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PROGRAMA);
			setState(100);
			bloqueprogram();
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

	public static class BloqueprogramContext extends ParserRuleContext {
		public TerminalNode ABRE_BRACKET() { return getToken(VoyagerParser.ABRE_BRACKET, 0); }
		public Bloque3Context bloque3() {
			return getRuleContext(Bloque3Context.class,0);
		}
		public Bloque2Context bloque2() {
			return getRuleContext(Bloque2Context.class,0);
		}
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public TerminalNode CIERRA_BRACKET() { return getToken(VoyagerParser.CIERRA_BRACKET, 0); }
		public BloqueprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueprogram; }
	}

	public final BloqueprogramContext bloqueprogram() throws RecognitionException {
		BloqueprogramContext _localctx = new BloqueprogramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloqueprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ABRE_BRACKET);
			setState(103);
			bloque3();
			setState(104);
			bloque2();
			setState(105);
			bloque1();
			setState(106);
			match(CIERRA_BRACKET);
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

	public static class Bloque1Context extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public Bloque1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque1; }
	}

	public final Bloque1Context bloque1() throws RecognitionException {
		Bloque1Context _localctx = new Bloque1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque1);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				estatuto();
				setState(109);
				bloque1();
				}
				break;
			case REGRESA:
			case CIERRA_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bloque2Context extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Bloque2Context bloque2() {
			return getRuleContext(Bloque2Context.class,0);
		}
		public Bloque2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque2; }
	}

	public final Bloque2Context bloque2() throws RecognitionException {
		Bloque2Context _localctx = new Bloque2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque2);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				declaracion();
				setState(115);
				bloque2();
				}
				break;
			case IMPRIMIR:
			case SI:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bloque3Context extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Bloque3Context bloque3() {
			return getRuleContext(Bloque3Context.class,0);
		}
		public Bloque3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque3; }
	}

	public final Bloque3Context bloque3() throws RecognitionException {
		Bloque3Context _localctx = new Bloque3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloque3);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
			case VACIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				func();
				setState(121);
				bloque3();
				}
				break;
			case VAR:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case CIERRA_BRACKET:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FuncContext extends ParserRuleContext {
		public TypefuncContext typefunc() {
			return getRuleContext(TypefuncContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public BloquefuncContext bloquefunc() {
			return getRuleContext(BloquefuncContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			typefunc();
			setState(127);
			match(ID);
			setState(128);
			match(ABRE_PAREN);
			setState(129);
			parametros();
			setState(130);
			match(CIERRA_PAREN);
			setState(131);
			bloquefunc();
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

	public static class ParametrosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Mete_tipoContext mete_tipo() {
			return getRuleContext(Mete_tipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Mete_idContext mete_id() {
			return getRuleContext(Mete_idContext.class,0);
		}
		public Parametros1Context parametros1() {
			return getRuleContext(Parametros1Context.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				tipo();
				setState(134);
				mete_tipo();
				setState(135);
				match(ID);
				setState(136);
				mete_id();
				setState(137);
				parametros1();
				}
				break;
			case CIERRA_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Parametros1Context extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(VoyagerParser.COMA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Mete_tipoContext mete_tipo() {
			return getRuleContext(Mete_tipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Mete_idContext mete_id() {
			return getRuleContext(Mete_idContext.class,0);
		}
		public Parametros1Context parametros1() {
			return getRuleContext(Parametros1Context.class,0);
		}
		public Parametros1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros1; }
	}

	public final Parametros1Context parametros1() throws RecognitionException {
		Parametros1Context _localctx = new Parametros1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametros1);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(COMA);
				setState(143);
				tipo();
				setState(144);
				mete_tipo();
				setState(145);
				match(ID);
				setState(146);
				mete_id();
				setState(147);
				parametros1();
				}
				break;
			case CIERRA_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Bloquefunc1Context extends ParserRuleContext {
		public TerminalNode REGRESA() { return getToken(VoyagerParser.REGRESA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public Bloquefunc1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquefunc1; }
	}

	public final Bloquefunc1Context bloquefunc1() throws RecognitionException {
		Bloquefunc1Context _localctx = new Bloquefunc1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloquefunc1);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(REGRESA);
				setState(153);
				expresion();
				setState(154);
				match(SEMI_COLON);
				}
				break;
			case CIERRA_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypefuncContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VACIO() { return getToken(VoyagerParser.VACIO, 0); }
		public TypefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefunc; }
	}

	public final TypefuncContext typefunc() throws RecognitionException {
		TypefuncContext _localctx = new TypefuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typefunc);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				tipo();
				}
				break;
			case VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(VACIO);
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

	public static class BloquefuncContext extends ParserRuleContext {
		public TerminalNode ABRE_BRACKET() { return getToken(VoyagerParser.ABRE_BRACKET, 0); }
		public Bloque2Context bloque2() {
			return getRuleContext(Bloque2Context.class,0);
		}
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public Bloquefunc1Context bloquefunc1() {
			return getRuleContext(Bloquefunc1Context.class,0);
		}
		public TerminalNode CIERRA_BRACKET() { return getToken(VoyagerParser.CIERRA_BRACKET, 0); }
		public BloquefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquefunc; }
	}

	public final BloquefuncContext bloquefunc() throws RecognitionException {
		BloquefuncContext _localctx = new BloquefuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloquefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ABRE_BRACKET);
			setState(164);
			bloque2();
			setState(165);
			bloque1();
			setState(166);
			bloquefunc1();
			setState(167);
			match(CIERRA_BRACKET);
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode ABRE_BRACKET() { return getToken(VoyagerParser.ABRE_BRACKET, 0); }
		public Bloque1Context bloque1() {
			return getRuleContext(Bloque1Context.class,0);
		}
		public TerminalNode CIERRA_BRACKET() { return getToken(VoyagerParser.CIERRA_BRACKET, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ABRE_BRACKET);
			setState(170);
			bloque1();
			setState(171);
			match(CIERRA_BRACKET);
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

	public static class VectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vector);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ID);
				setState(174);
				match(ABRE_CORCHETE);
				setState(175);
				exp();
				setState(176);
				match(CIERRA_CORCHETE);
				}
				break;
			case SEMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Vector_asignaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public Vector_asignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_asigna; }
	}

	public final Vector_asignaContext vector_asigna() throws RecognitionException {
		Vector_asignaContext _localctx = new Vector_asignaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vector_asigna);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(ID);
				setState(182);
				match(ABRE_CORCHETE);
				setState(183);
				exp();
				setState(184);
				match(CIERRA_CORCHETE);
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_estatuto);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(192);
				llamada();
				setState(193);
				match(SEMI_COLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				ciclo();
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

	public static class AsignacionContext extends ParserRuleContext {
		public Idvector_asignaContext idvector_asigna() {
			return getRuleContext(Idvector_asignaContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(VoyagerParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			idvector_asigna();
			setState(199);
			match(IGUAL);
			setState(200);
			expresion();
			setState(201);
			match(SEMI_COLON);
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

	public static class Idvector_asignaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Vector_asignaContext vector_asigna() {
			return getRuleContext(Vector_asignaContext.class,0);
		}
		public Idvector_asignaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idvector_asigna; }
	}

	public final Idvector_asignaContext idvector_asigna() throws RecognitionException {
		Idvector_asignaContext _localctx = new Idvector_asignaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_idvector_asigna);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				vector_asigna();
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(VoyagerParser.SI, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public Lee_condicionContext lee_condicion() {
			return getRuleContext(Lee_condicionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Condicion1Context condicion1() {
			return getRuleContext(Condicion1Context.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SI);
			setState(208);
			match(ABRE_PAREN);
			setState(209);
			expresion();
			setState(210);
			match(CIERRA_PAREN);
			setState(211);
			lee_condicion();
			setState(212);
			bloque();
			setState(213);
			condicion1();
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

	public static class Condicion1Context extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(VoyagerParser.SINO, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Condicion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion1; }
	}

	public final Condicion1Context condicion1() throws RecognitionException {
		Condicion1Context _localctx = new Condicion1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_condicion1);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(SINO);
				setState(216);
				bloque();
				}
				break;
			case IMPRIMIR:
			case SI:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(VoyagerParser.VAR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdvectorContext idvector() {
			return getRuleContext(IdvectorContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(VAR);
			setState(221);
			tipo();
			setState(222);
			idvector();
			setState(223);
			match(SEMI_COLON);
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

	public static class IdvectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public IdvectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idvector; }
	}

	public final IdvectorContext idvector() throws RecognitionException {
		IdvectorContext _localctx = new IdvectorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idvector);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				vector();
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(VoyagerParser.IMPRIMIR, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public Imprimir1Context imprimir1() {
			return getRuleContext(Imprimir1Context.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IMPRIMIR);
			setState(230);
			match(ABRE_PAREN);
			setState(231);
			imprimir1();
			setState(232);
			match(CIERRA_PAREN);
			setState(233);
			match(SEMI_COLON);
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

	public static class Imprimir1Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LETRERO() { return getToken(VoyagerParser.LETRERO, 0); }
		public Imprimir1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir1; }
	}

	public final Imprimir1Context imprimir1() throws RecognitionException {
		Imprimir1Context _localctx = new Imprimir1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_imprimir1);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
			case CIERRA_PAREN:
			case SUMA:
			case RESTA:
			case DIV:
			case MULT:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
			case CTE_E:
			case CTE_F:
			case CTE_C:
			case CTE_B:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				expresion();
				}
				break;
			case LETRERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(LETRERO);
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

	public static class CicloContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(VoyagerParser.MIENTRAS, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public Lee_condicionContext lee_condicion() {
			return getRuleContext(Lee_condicionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(MIENTRAS);
			setState(240);
			match(ABRE_PAREN);
			setState(241);
			expresion();
			setState(242);
			match(CIERRA_PAREN);
			setState(243);
			lee_condicion();
			setState(244);
			bloque();
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

	public static class LlamadaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ID);
			setState(247);
			match(ABRE_PAREN);
			setState(248);
			argumentos();
			setState(249);
			match(CIERRA_PAREN);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Verifica_tipoContext verifica_tipo() {
			return getRuleContext(Verifica_tipoContext.class,0);
		}
		public Argumentos1Context argumentos1() {
			return getRuleContext(Argumentos1Context.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentos);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				expresion();
				setState(252);
				verifica_tipo();
				setState(253);
				argumentos1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Argumentos1Context extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(VoyagerParser.COMA, 0); }
		public Sig_argumentoContext sig_argumento() {
			return getRuleContext(Sig_argumentoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Verifica_tipoContext verifica_tipo() {
			return getRuleContext(Verifica_tipoContext.class,0);
		}
		public Argumentos1Context argumentos1() {
			return getRuleContext(Argumentos1Context.class,0);
		}
		public Argumentos1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos1; }
	}

	public final Argumentos1Context argumentos1() throws RecognitionException {
		Argumentos1Context _localctx = new Argumentos1Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_argumentos1);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(COMA);
				setState(259);
				sig_argumento();
				setState(260);
				expresion();
				setState(261);
				verifica_tipo();
				setState(262);
				argumentos1();
				}
				break;
			case CIERRA_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpboolContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expbool1Context expbool1() {
			return getRuleContext(Expbool1Context.class,0);
		}
		public ExpboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool; }
	}

	public final ExpboolContext expbool() throws RecognitionException {
		ExpboolContext _localctx = new ExpboolContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			exp();
			setState(268);
			expbool1();
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

	public static class Expbool1Context extends ParserRuleContext {
		public TerminalNode MAS_QUE() { return getToken(VoyagerParser.MAS_QUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MENOS_QUE() { return getToken(VoyagerParser.MENOS_QUE, 0); }
		public TerminalNode IGUAL_IGUAL() { return getToken(VoyagerParser.IGUAL_IGUAL, 0); }
		public TerminalNode DIFERENTE_DE() { return getToken(VoyagerParser.DIFERENTE_DE, 0); }
		public Expbool1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool1; }
	}

	public final Expbool1Context expbool1() throws RecognitionException {
		Expbool1Context _localctx = new Expbool1Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_expbool1);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(MAS_QUE);
				setState(271);
				exp();
				}
				break;
			case MENOS_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(MENOS_QUE);
				setState(273);
				exp();
				}
				break;
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(IGUAL_IGUAL);
				setState(275);
				exp();
				}
				break;
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(DIFERENTE_DE);
				setState(277);
				exp();
				}
				break;
			case CIERRA_PAREN:
			case SEMI_COLON:
			case COMA:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public Expresion1Context expresion1() {
			return getRuleContext(Expresion1Context.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			expbool();
			setState(282);
			expresion1();
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

	public static class Expresion1Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(VoyagerParser.AND, 0); }
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public TerminalNode OR() { return getToken(VoyagerParser.OR, 0); }
		public Expresion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion1; }
	}

	public final Expresion1Context expresion1() throws RecognitionException {
		Expresion1Context _localctx = new Expresion1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_expresion1);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(AND);
				setState(285);
				expbool();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(OR);
				setState(287);
				expbool();
				}
				break;
			case CIERRA_PAREN:
			case SEMI_COLON:
			case COMA:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			termino();
			setState(292);
			exp1();
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

	public static class Exp1Context extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(VoyagerParser.SUMA, 0); }
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(VoyagerParser.RESTA, 0); }
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp1);
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(SUMA);
				setState(295);
				termino();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(RESTA);
				setState(297);
				termino();
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino2Context termino2() {
			return getRuleContext(Termino2Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			factor();
			setState(302);
			termino2();
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

	public static class Termino2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(VoyagerParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(VoyagerParser.DIV, 0); }
		public Termino2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino2; }
	}

	public final Termino2Context termino2() throws RecognitionException {
		Termino2Context _localctx = new Termino2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_termino2);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(MULT);
				setState(305);
				factor();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(DIV);
				setState(307);
				factor();
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case SUMA:
			case RESTA:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(ABRE_PAREN);
				setState(312);
				expresion();
				setState(313);
				match(CIERRA_PAREN);
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case SUMA:
			case RESTA:
			case DIV:
			case MULT:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
			case CTE_E:
			case CTE_F:
			case CTE_C:
			case CTE_B:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				operando();
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

	public static class OperandoContext extends ParserRuleContext {
		public Cte_varContext cte_var() {
			return getRuleContext(Cte_varContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Vector_accesoContext vector_acceso() {
			return getRuleContext(Vector_accesoContext.class,0);
		}
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operando);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				cte_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				llamada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				vector_acceso();
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

	public static class Cte_varContext extends ParserRuleContext {
		public TerminalNode CTE_B() { return getToken(VoyagerParser.CTE_B, 0); }
		public TerminalNode CTE_E() { return getToken(VoyagerParser.CTE_E, 0); }
		public TerminalNode CTE_F() { return getToken(VoyagerParser.CTE_F, 0); }
		public TerminalNode CTE_C() { return getToken(VoyagerParser.CTE_C, 0); }
		public Cte_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_var; }
	}

	public final Cte_varContext cte_var() throws RecognitionException {
		Cte_varContext _localctx = new Cte_varContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cte_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CTE_E) | (1L << CTE_F) | (1L << CTE_C) | (1L << CTE_B))) != 0)) ) {
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

	public static class Vector_accesoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public Vector_accesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_acceso; }
	}

	public final Vector_accesoContext vector_acceso() throws RecognitionException {
		Vector_accesoContext _localctx = new Vector_accesoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_vector_acceso);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(ID);
				setState(327);
				match(ABRE_CORCHETE);
				setState(328);
				exp();
				setState(329);
				match(CIERRA_CORCHETE);
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_CORCHETE:
			case SEMI_COLON:
			case COMA:
			case SUMA:
			case RESTA:
			case DIV:
			case MULT:
			case MAS_QUE:
			case MENOS_QUE:
			case AND:
			case OR:
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(VoyagerParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(VoyagerParser.FLOTANTE, 0); }
		public TerminalNode BOOL() { return getToken(VoyagerParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(VoyagerParser.CHAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << CHAR) | (1L << FLOTANTE) | (1L << BOOL))) != 0)) ) {
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

	public static class Lee_condicionContext extends ParserRuleContext {
		public Lee_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lee_condicion; }
	}

	public final Lee_condicionContext lee_condicion() throws RecognitionException {
		Lee_condicionContext _localctx = new Lee_condicionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lee_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Verifica_tipoContext extends ParserRuleContext {
		public Verifica_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verifica_tipo; }
	}

	public final Verifica_tipoContext verifica_tipo() throws RecognitionException {
		Verifica_tipoContext _localctx = new Verifica_tipoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_verifica_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Sig_argumentoContext extends ParserRuleContext {
		public Sig_argumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sig_argumento; }
	}

	public final Sig_argumentoContext sig_argumento() throws RecognitionException {
		Sig_argumentoContext _localctx = new Sig_argumentoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sig_argumento);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Mete_tipoContext extends ParserRuleContext {
		public Mete_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mete_tipo; }
	}

	public final Mete_tipoContext mete_tipo() throws RecognitionException {
		Mete_tipoContext _localctx = new Mete_tipoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mete_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Mete_idContext extends ParserRuleContext {
		public Mete_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mete_id; }
	}

	public final Mete_idContext mete_id() throws RecognitionException {
		Mete_idContext _localctx = new Mete_idContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_mete_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u015d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\6\2`\n\2\r\2\16\2a\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\5\6y\n\6"+
		"\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\5\f\u00a4\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00b6\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00be\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c7\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u00d0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u00dd\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00e6"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00f0\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0103\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u010c\n"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u011a"+
		"\n\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u0124\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5"+
		"#\u012e\n#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0138\n%\3&\3&\3&\3&\3&\5&\u013f"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u0145\n\'\3(\3(\3)\3)\3)\3)\3)\3)\5)\u014f\n)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\\2\4\3\2(+\4\2"+
		"\n\f\16\16\2\u0151\2_\3\2\2\2\4e\3\2\2\2\6h\3\2\2\2\br\3\2\2\2\nx\3\2"+
		"\2\2\f~\3\2\2\2\16\u0080\3\2\2\2\20\u008e\3\2\2\2\22\u0098\3\2\2\2\24"+
		"\u009f\3\2\2\2\26\u00a3\3\2\2\2\30\u00a5\3\2\2\2\32\u00ab\3\2\2\2\34\u00b5"+
		"\3\2\2\2\36\u00bd\3\2\2\2 \u00c6\3\2\2\2\"\u00c8\3\2\2\2$\u00cf\3\2\2"+
		"\2&\u00d1\3\2\2\2(\u00dc\3\2\2\2*\u00de\3\2\2\2,\u00e5\3\2\2\2.\u00e7"+
		"\3\2\2\2\60\u00ef\3\2\2\2\62\u00f1\3\2\2\2\64\u00f8\3\2\2\2\66\u0102\3"+
		"\2\2\28\u010b\3\2\2\2:\u010d\3\2\2\2<\u0119\3\2\2\2>\u011b\3\2\2\2@\u0123"+
		"\3\2\2\2B\u0125\3\2\2\2D\u012d\3\2\2\2F\u012f\3\2\2\2H\u0137\3\2\2\2J"+
		"\u013e\3\2\2\2L\u0144\3\2\2\2N\u0146\3\2\2\2P\u014e\3\2\2\2R\u0150\3\2"+
		"\2\2T\u0152\3\2\2\2V\u0154\3\2\2\2X\u0156\3\2\2\2Z\u0158\3\2\2\2\\\u015a"+
		"\3\2\2\2^`\5\4\3\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2c"+
		"d\7\2\2\3d\3\3\2\2\2ef\7,\2\2fg\5\6\4\2g\5\3\2\2\2hi\7\24\2\2ij\5\f\7"+
		"\2jk\5\n\6\2kl\5\b\5\2lm\7\25\2\2m\7\3\2\2\2no\5 \21\2op\5\b\5\2ps\3\2"+
		"\2\2qs\3\2\2\2rn\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tu\5*\26\2uv\5\n\6\2vy\3"+
		"\2\2\2wy\3\2\2\2xt\3\2\2\2xw\3\2\2\2y\13\3\2\2\2z{\5\16\b\2{|\5\f\7\2"+
		"|\177\3\2\2\2}\177\3\2\2\2~z\3\2\2\2~}\3\2\2\2\177\r\3\2\2\2\u0080\u0081"+
		"\5\26\f\2\u0081\u0082\7-\2\2\u0082\u0083\7\22\2\2\u0083\u0084\5\20\t\2"+
		"\u0084\u0085\7\23\2\2\u0085\u0086\5\30\r\2\u0086\17\3\2\2\2\u0087\u0088"+
		"\5R*\2\u0088\u0089\5Z.\2\u0089\u008a\7-\2\2\u008a\u008b\5\\/\2\u008b\u008c"+
		"\5\22\n\2\u008c\u008f\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0087\3\2\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\7\33\2\2\u0091\u0092"+
		"\5R*\2\u0092\u0093\5Z.\2\u0093\u0094\7-\2\2\u0094\u0095\5\\/\2\u0095\u0096"+
		"\5\22\n\2\u0096\u0099\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0090\3\2\2\2"+
		"\u0098\u0097\3\2\2\2\u0099\23\3\2\2\2\u009a\u009b\7\20\2\2\u009b\u009c"+
		"\5> \2\u009c\u009d\7\30\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009a\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a4\5R*\2"+
		"\u00a2\u00a4\7\17\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\27"+
		"\3\2\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5\n\6\2\u00a7\u00a8\5\b\5\2"+
		"\u00a8\u00a9\5\24\13\2\u00a9\u00aa\7\25\2\2\u00aa\31\3\2\2\2\u00ab\u00ac"+
		"\7\24\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\7\25\2\2\u00ae\33\3\2\2\2\u00af"+
		"\u00b0\7-\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\5B\"\2\u00b2\u00b3\7\27"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\7\26\2"+
		"\2\u00b9\u00ba\5B\"\2\u00ba\u00bb\7\27\2\2\u00bb\u00be\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\37\3\2\2\2\u00bf"+
		"\u00c7\5\"\22\2\u00c0\u00c7\5&\24\2\u00c1\u00c7\5.\30\2\u00c2\u00c3\5"+
		"\64\33\2\u00c3\u00c4\7\30\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c7\5\62\32"+
		"\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00c9\5$\23\2\u00c9"+
		"\u00ca\7 \2\2\u00ca\u00cb\5> \2\u00cb\u00cc\7\30\2\2\u00cc#\3\2\2\2\u00cd"+
		"\u00d0\7-\2\2\u00ce\u00d0\5\36\20\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3"+
		"\2\2\2\u00d0%\3\2\2\2\u00d1\u00d2\7\b\2\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4"+
		"\5> \2\u00d4\u00d5\7\23\2\2\u00d5\u00d6\5T+\2\u00d6\u00d7\5\32\16\2\u00d7"+
		"\u00d8\5(\25\2\u00d8\'\3\2\2\2\u00d9\u00da\7\t\2\2\u00da\u00dd\5\32\16"+
		"\2\u00db\u00dd\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd)"+
		"\3\2\2\2\u00de\u00df\7\6\2\2\u00df\u00e0\5R*\2\u00e0\u00e1\5,\27\2\u00e1"+
		"\u00e2\7\30\2\2\u00e2+\3\2\2\2\u00e3\u00e6\7-\2\2\u00e4\u00e6\5\34\17"+
		"\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6-\3\2\2\2\u00e7\u00e8"+
		"\7\7\2\2\u00e8\u00e9\7\22\2\2\u00e9\u00ea\5\60\31\2\u00ea\u00eb\7\23\2"+
		"\2\u00eb\u00ec\7\30\2\2\u00ec/\3\2\2\2\u00ed\u00f0\5> \2\u00ee\u00f0\7"+
		"\'\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\61\3\2\2\2\u00f1"+
		"\u00f2\7\21\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4\5> \2\u00f4\u00f5\7\23"+
		"\2\2\u00f5\u00f6\5T+\2\u00f6\u00f7\5\32\16\2\u00f7\63\3\2\2\2\u00f8\u00f9"+
		"\7-\2\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\5\66\34\2\u00fb\u00fc\7\23\2"+
		"\2\u00fc\65\3\2\2\2\u00fd\u00fe\5> \2\u00fe\u00ff\5V,\2\u00ff\u0100\5"+
		"8\35\2\u0100\u0103\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u00fd\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\67\3\2\2\2\u0104\u0105\7\33\2\2\u0105\u0106\5X-\2"+
		"\u0106\u0107\5> \2\u0107\u0108\5V,\2\u0108\u0109\58\35\2\u0109\u010c\3"+
		"\2\2\2\u010a\u010c\3\2\2\2\u010b\u0104\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"9\3\2\2\2\u010d\u010e\5B\"\2\u010e\u010f\5<\37\2\u010f;\3\2\2\2\u0110"+
		"\u0111\7!\2\2\u0111\u011a\5B\"\2\u0112\u0113\7\"\2\2\u0113\u011a\5B\""+
		"\2\u0114\u0115\7%\2\2\u0115\u011a\5B\"\2\u0116\u0117\7&\2\2\u0117\u011a"+
		"\5B\"\2\u0118\u011a\3\2\2\2\u0119\u0110\3\2\2\2\u0119\u0112\3\2\2\2\u0119"+
		"\u0114\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0118\3\2\2\2\u011a=\3\2\2\2"+
		"\u011b\u011c\5:\36\2\u011c\u011d\5@!\2\u011d?\3\2\2\2\u011e\u011f\7#\2"+
		"\2\u011f\u0124\5:\36\2\u0120\u0121\7$\2\2\u0121\u0124\5:\36\2\u0122\u0124"+
		"\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"A\3\2\2\2\u0125\u0126\5F$\2\u0126\u0127\5D#\2\u0127C\3\2\2\2\u0128\u0129"+
		"\7\34\2\2\u0129\u012e\5F$\2\u012a\u012b\7\35\2\2\u012b\u012e\5F$\2\u012c"+
		"\u012e\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012c\3\2"+
		"\2\2\u012eE\3\2\2\2\u012f\u0130\5J&\2\u0130\u0131\5H%\2\u0131G\3\2\2\2"+
		"\u0132\u0133\7\37\2\2\u0133\u0138\5J&\2\u0134\u0135\7\36\2\2\u0135\u0138"+
		"\5J&\2\u0136\u0138\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138I\3\2\2\2\u0139\u013a\7\22\2\2\u013a\u013b\5> \2\u013b"+
		"\u013c\7\23\2\2\u013c\u013f\3\2\2\2\u013d\u013f\5L\'\2\u013e\u0139\3\2"+
		"\2\2\u013e\u013d\3\2\2\2\u013fK\3\2\2\2\u0140\u0145\5N(\2\u0141\u0145"+
		"\5\64\33\2\u0142\u0145\7-\2\2\u0143\u0145\5P)\2\u0144\u0140\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145M\3\2\2\2"+
		"\u0146\u0147\t\2\2\2\u0147O\3\2\2\2\u0148\u0149\7-\2\2\u0149\u014a\7\26"+
		"\2\2\u014a\u014b\5B\"\2\u014b\u014c\7\27\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u014d\3\2\2\2\u014fQ\3\2\2\2"+
		"\u0150\u0151\t\3\2\2\u0151S\3\2\2\2\u0152\u0153\3\2\2\2\u0153U\3\2\2\2"+
		"\u0154\u0155\3\2\2\2\u0155W\3\2\2\2\u0156\u0157\3\2\2\2\u0157Y\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159[\3\2\2\2\u015a\u015b\3\2\2\2\u015b]\3\2\2\2"+
		"\32arx~\u008e\u0098\u009f\u00a3\u00b5\u00bd\u00c6\u00cf\u00dc\u00e5\u00ef"+
		"\u0102\u010b\u0119\u0123\u012d\u0137\u013e\u0144\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}