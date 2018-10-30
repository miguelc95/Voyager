// Generated from /Users/iramD24/Workspace/Compiler/Voyager/Python/Voyager.g4 by ANTLR 4.7.1
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
		RULE_bloque = 12, RULE_vector = 13, RULE_estatuto = 14, RULE_asignacion = 15, 
		RULE_condicion = 16, RULE_condicion1 = 17, RULE_declaracion = 18, RULE_idvector = 19, 
		RULE_imprimir = 20, RULE_imprimir1 = 21, RULE_ciclo = 22, RULE_llamada = 23, 
		RULE_argumentos = 24, RULE_argumentos1 = 25, RULE_expbool = 26, RULE_expbool1 = 27, 
		RULE_expresion = 28, RULE_expresion1 = 29, RULE_exp = 30, RULE_exp1 = 31, 
		RULE_termino = 32, RULE_termino2 = 33, RULE_factor = 34, RULE_operando = 35, 
		RULE_cte_var = 36, RULE_tipo = 37, RULE_lee_condicion = 38, RULE_verifica_tipo = 39, 
		RULE_sig_argumento = 40, RULE_mete_tipo = 41, RULE_mete_id = 42;
	public static final String[] ruleNames = {
		"voyager", "program", "bloqueprogram", "bloque1", "bloque2", "bloque3", 
		"func", "parametros", "parametros1", "bloquefunc1", "typefunc", "bloquefunc", 
		"bloque", "vector", "estatuto", "asignacion", "condicion", "condicion1", 
		"declaracion", "idvector", "imprimir", "imprimir1", "ciclo", "llamada", 
		"argumentos", "argumentos1", "expbool", "expbool1", "expresion", "expresion1", 
		"exp", "exp1", "termino", "termino2", "factor", "operando", "cte_var", 
		"tipo", "lee_condicion", "verifica_tipo", "sig_argumento", "mete_tipo", 
		"mete_id"
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
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				program();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAMA );
			setState(91);
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
			setState(93);
			match(PROGRAMA);
			setState(94);
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
			setState(96);
			match(ABRE_BRACKET);
			setState(97);
			bloque3();
			setState(98);
			bloque2();
			setState(99);
			bloque1();
			setState(100);
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case IGUAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				estatuto();
				setState(103);
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				declaracion();
				setState(109);
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
			case VACIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				func();
				setState(115);
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
			setState(120);
			typefunc();
			setState(121);
			match(ID);
			setState(122);
			match(ABRE_PAREN);
			setState(123);
			parametros();
			setState(124);
			match(CIERRA_PAREN);
			setState(125);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				tipo();
				setState(128);
				mete_tipo();
				setState(129);
				match(ID);
				setState(130);
				mete_id();
				setState(131);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(COMA);
				setState(137);
				tipo();
				setState(138);
				mete_tipo();
				setState(139);
				match(ID);
				setState(140);
				mete_id();
				setState(141);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(REGRESA);
				setState(147);
				expresion();
				setState(148);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				tipo();
				}
				break;
			case VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
			setState(157);
			match(ABRE_BRACKET);
			setState(158);
			bloque2();
			setState(159);
			bloque1();
			setState(160);
			bloquefunc1();
			setState(161);
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
			setState(163);
			match(ABRE_BRACKET);
			setState(164);
			bloque1();
			setState(165);
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
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ID);
				setState(168);
				match(ABRE_CORCHETE);
				setState(169);
				exp();
				setState(170);
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
			case IGUAL:
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
		enterRule(_localctx, 28, RULE_estatuto);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(178);
				llamada();
				setState(179);
				match(SEMI_COLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
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
		public IdvectorContext idvector() {
			return getRuleContext(IdvectorContext.class,0);
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
		enterRule(_localctx, 30, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			idvector();
			setState(185);
			match(IGUAL);
			setState(186);
			expresion();
			setState(187);
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
		enterRule(_localctx, 32, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(SI);
			setState(190);
			match(ABRE_PAREN);
			setState(191);
			expresion();
			setState(192);
			match(CIERRA_PAREN);
			setState(193);
			lee_condicion();
			setState(194);
			bloque();
			setState(195);
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
		enterRule(_localctx, 34, RULE_condicion1);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(SINO);
				setState(198);
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
		enterRule(_localctx, 36, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(VAR);
			setState(203);
			tipo();
			setState(204);
			idvector();
			setState(205);
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
		enterRule(_localctx, 38, RULE_idvector);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
		enterRule(_localctx, 40, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(IMPRIMIR);
			setState(212);
			match(ABRE_PAREN);
			setState(213);
			imprimir1();
			setState(214);
			match(CIERRA_PAREN);
			setState(215);
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
		enterRule(_localctx, 42, RULE_imprimir1);
		try {
			setState(219);
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
				setState(217);
				expresion();
				}
				break;
			case LETRERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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
		enterRule(_localctx, 44, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(MIENTRAS);
			setState(222);
			match(ABRE_PAREN);
			setState(223);
			expresion();
			setState(224);
			match(CIERRA_PAREN);
			setState(225);
			lee_condicion();
			setState(226);
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
		enterRule(_localctx, 46, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(229);
			match(ABRE_PAREN);
			setState(230);
			argumentos();
			setState(231);
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
		enterRule(_localctx, 48, RULE_argumentos);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				expresion();
				setState(234);
				verifica_tipo();
				setState(235);
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
		enterRule(_localctx, 50, RULE_argumentos1);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(COMA);
				setState(241);
				sig_argumento();
				setState(242);
				expresion();
				setState(243);
				verifica_tipo();
				setState(244);
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
		enterRule(_localctx, 52, RULE_expbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			exp();
			setState(250);
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
		enterRule(_localctx, 54, RULE_expbool1);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(MAS_QUE);
				setState(253);
				exp();
				}
				break;
			case MENOS_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(MENOS_QUE);
				setState(255);
				exp();
				}
				break;
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(IGUAL_IGUAL);
				setState(257);
				exp();
				}
				break;
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(DIFERENTE_DE);
				setState(259);
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
		enterRule(_localctx, 56, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			expbool();
			setState(264);
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
		enterRule(_localctx, 58, RULE_expresion1);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(AND);
				setState(267);
				expbool();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(OR);
				setState(269);
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
		enterRule(_localctx, 60, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			termino();
			setState(274);
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
		enterRule(_localctx, 62, RULE_exp1);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(SUMA);
				setState(277);
				termino();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(RESTA);
				setState(279);
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
		enterRule(_localctx, 64, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			factor();
			setState(284);
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
		enterRule(_localctx, 66, RULE_termino2);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(MULT);
				setState(287);
				factor();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(DIV);
				setState(289);
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
		enterRule(_localctx, 68, RULE_factor);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(ABRE_PAREN);
				setState(294);
				expresion();
				setState(295);
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
				setState(297);
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
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operando);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				cte_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				llamada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
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
		enterRule(_localctx, 72, RULE_cte_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 74, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		enterRule(_localctx, 76, RULE_lee_condicion);
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
		enterRule(_localctx, 78, RULE_verifica_tipo);
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
		enterRule(_localctx, 80, RULE_sig_argumento);
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
		enterRule(_localctx, 82, RULE_mete_tipo);
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
		enterRule(_localctx, 84, RULE_mete_id);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0143\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\6\2Z\n\2\r\2\16\2[\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\6\3\6\5\6s\n\6\3\7\3\7\3\7\3\7\5"+
		"\7y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0089"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u009a\n\13\3\f\3\f\5\f\u009e\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b9\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00cb\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u00d4\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\5\27\u00de\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\5\32\u00f1\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00fa\n\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0108\n\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0112\n\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u011c"+
		"\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0126\n#\3$\3$\3$\3$\3$\5$\u012d\n$"+
		"\3%\3%\3%\3%\5%\u0133\n%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		",\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTV\2\4\3\2(+\4\2\n\f\16\16\2\u0137\2Y\3\2\2\2\4_\3\2\2\2\6"+
		"b\3\2\2\2\bl\3\2\2\2\nr\3\2\2\2\fx\3\2\2\2\16z\3\2\2\2\20\u0088\3\2\2"+
		"\2\22\u0092\3\2\2\2\24\u0099\3\2\2\2\26\u009d\3\2\2\2\30\u009f\3\2\2\2"+
		"\32\u00a5\3\2\2\2\34\u00af\3\2\2\2\36\u00b8\3\2\2\2 \u00ba\3\2\2\2\"\u00bf"+
		"\3\2\2\2$\u00ca\3\2\2\2&\u00cc\3\2\2\2(\u00d3\3\2\2\2*\u00d5\3\2\2\2,"+
		"\u00dd\3\2\2\2.\u00df\3\2\2\2\60\u00e6\3\2\2\2\62\u00f0\3\2\2\2\64\u00f9"+
		"\3\2\2\2\66\u00fb\3\2\2\28\u0107\3\2\2\2:\u0109\3\2\2\2<\u0111\3\2\2\2"+
		">\u0113\3\2\2\2@\u011b\3\2\2\2B\u011d\3\2\2\2D\u0125\3\2\2\2F\u012c\3"+
		"\2\2\2H\u0132\3\2\2\2J\u0134\3\2\2\2L\u0136\3\2\2\2N\u0138\3\2\2\2P\u013a"+
		"\3\2\2\2R\u013c\3\2\2\2T\u013e\3\2\2\2V\u0140\3\2\2\2XZ\5\4\3\2YX\3\2"+
		"\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\2\2\3^\3\3\2\2\2_`"+
		"\7,\2\2`a\5\6\4\2a\5\3\2\2\2bc\7\24\2\2cd\5\f\7\2de\5\n\6\2ef\5\b\5\2"+
		"fg\7\25\2\2g\7\3\2\2\2hi\5\36\20\2ij\5\b\5\2jm\3\2\2\2km\3\2\2\2lh\3\2"+
		"\2\2lk\3\2\2\2m\t\3\2\2\2no\5&\24\2op\5\n\6\2ps\3\2\2\2qs\3\2\2\2rn\3"+
		"\2\2\2rq\3\2\2\2s\13\3\2\2\2tu\5\16\b\2uv\5\f\7\2vy\3\2\2\2wy\3\2\2\2"+
		"xt\3\2\2\2xw\3\2\2\2y\r\3\2\2\2z{\5\26\f\2{|\7-\2\2|}\7\22\2\2}~\5\20"+
		"\t\2~\177\7\23\2\2\177\u0080\5\30\r\2\u0080\17\3\2\2\2\u0081\u0082\5L"+
		"\'\2\u0082\u0083\5T+\2\u0083\u0084\7-\2\2\u0084\u0085\5V,\2\u0085\u0086"+
		"\5\22\n\2\u0086\u0089\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0081\3\2\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b\7\33\2\2\u008b\u008c"+
		"\5L\'\2\u008c\u008d\5T+\2\u008d\u008e\7-\2\2\u008e\u008f\5V,\2\u008f\u0090"+
		"\5\22\n\2\u0090\u0093\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\23\3\2\2\2\u0094\u0095\7\20\2\2\u0095\u0096"+
		"\5:\36\2\u0096\u0097\7\30\2\2\u0097\u009a\3\2\2\2\u0098\u009a\3\2\2\2"+
		"\u0099\u0094\3\2\2\2\u0099\u0098\3\2\2\2\u009a\25\3\2\2\2\u009b\u009e"+
		"\5L\'\2\u009c\u009e\7\17\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\27\3\2\2\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\5\b\5"+
		"\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\25\2\2\u00a4\31\3\2\2\2\u00a5\u00a6"+
		"\7\24\2\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\7\25\2\2\u00a8\33\3\2\2\2\u00a9"+
		"\u00aa\7-\2\2\u00aa\u00ab\7\26\2\2\u00ab\u00ac\5> \2\u00ac\u00ad\7\27"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a9\3\2\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00b9\5 \21\2\u00b2\u00b9\5\"\22"+
		"\2\u00b3\u00b9\5*\26\2\u00b4\u00b5\5\60\31\2\u00b5\u00b6\7\30\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b9\5.\30\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2"+
		"\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\37\3\2\2\2\u00ba\u00bb\5(\25\2\u00bb\u00bc\7 \2\2\u00bc\u00bd\5:\36\2"+
		"\u00bd\u00be\7\30\2\2\u00be!\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\7"+
		"\22\2\2\u00c1\u00c2\5:\36\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4\5N(\2\u00c4"+
		"\u00c5\5\32\16\2\u00c5\u00c6\5$\23\2\u00c6#\3\2\2\2\u00c7\u00c8\7\t\2"+
		"\2\u00c8\u00cb\5\32\16\2\u00c9\u00cb\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\5L\'\2\u00ce"+
		"\u00cf\5(\25\2\u00cf\u00d0\7\30\2\2\u00d0\'\3\2\2\2\u00d1\u00d4\7-\2\2"+
		"\u00d2\u00d4\5\34\17\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4)"+
		"\3\2\2\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\7\22\2\2\u00d7\u00d8\5,\27\2"+
		"\u00d8\u00d9\7\23\2\2\u00d9\u00da\7\30\2\2\u00da+\3\2\2\2\u00db\u00de"+
		"\5:\36\2\u00dc\u00de\7\'\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"-\3\2\2\2\u00df\u00e0\7\21\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\5:\36"+
		"\2\u00e2\u00e3\7\23\2\2\u00e3\u00e4\5N(\2\u00e4\u00e5\5\32\16\2\u00e5"+
		"/\3\2\2\2\u00e6\u00e7\7-\2\2\u00e7\u00e8\7\22\2\2\u00e8\u00e9\5\62\32"+
		"\2\u00e9\u00ea\7\23\2\2\u00ea\61\3\2\2\2\u00eb\u00ec\5:\36\2\u00ec\u00ed"+
		"\5P)\2\u00ed\u00ee\5\64\33\2\u00ee\u00f1\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00eb\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\63\3\2\2\2\u00f2\u00f3\7\33\2"+
		"\2\u00f3\u00f4\5R*\2\u00f4\u00f5\5:\36\2\u00f5\u00f6\5P)\2\u00f6\u00f7"+
		"\5\64\33\2\u00f7\u00fa\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f2\3\2\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\65\3\2\2\2\u00fb\u00fc\5> \2\u00fc\u00fd\5"+
		"8\35\2\u00fd\67\3\2\2\2\u00fe\u00ff\7!\2\2\u00ff\u0108\5> \2\u0100\u0101"+
		"\7\"\2\2\u0101\u0108\5> \2\u0102\u0103\7%\2\2\u0103\u0108\5> \2\u0104"+
		"\u0105\7&\2\2\u0105\u0108\5> \2\u0106\u0108\3\2\2\2\u0107\u00fe\3\2\2"+
		"\2\u0107\u0100\3\2\2\2\u0107\u0102\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u01089\3\2\2\2\u0109\u010a\5\66\34\2\u010a\u010b\5<\37\2\u010b"+
		";\3\2\2\2\u010c\u010d\7#\2\2\u010d\u0112\5\66\34\2\u010e\u010f\7$\2\2"+
		"\u010f\u0112\5\66\34\2\u0110\u0112\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010e"+
		"\3\2\2\2\u0111\u0110\3\2\2\2\u0112=\3\2\2\2\u0113\u0114\5B\"\2\u0114\u0115"+
		"\5@!\2\u0115?\3\2\2\2\u0116\u0117\7\34\2\2\u0117\u011c\5B\"\2\u0118\u0119"+
		"\7\35\2\2\u0119\u011c\5B\"\2\u011a\u011c\3\2\2\2\u011b\u0116\3\2\2\2\u011b"+
		"\u0118\3\2\2\2\u011b\u011a\3\2\2\2\u011cA\3\2\2\2\u011d\u011e\5F$\2\u011e"+
		"\u011f\5D#\2\u011fC\3\2\2\2\u0120\u0121\7\37\2\2\u0121\u0126\5F$\2\u0122"+
		"\u0123\7\36\2\2\u0123\u0126\5F$\2\u0124\u0126\3\2\2\2\u0125\u0120\3\2"+
		"\2\2\u0125\u0122\3\2\2\2\u0125\u0124\3\2\2\2\u0126E\3\2\2\2\u0127\u0128"+
		"\7\22\2\2\u0128\u0129\5:\36\2\u0129\u012a\7\23\2\2\u012a\u012d\3\2\2\2"+
		"\u012b\u012d\5H%\2\u012c\u0127\3\2\2\2\u012c\u012b\3\2\2\2\u012dG\3\2"+
		"\2\2\u012e\u0133\5J&\2\u012f\u0133\5\60\31\2\u0130\u0133\7-\2\2\u0131"+
		"\u0133\5\34\17\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3"+
		"\2\2\2\u0132\u0131\3\2\2\2\u0133I\3\2\2\2\u0134\u0135\t\2\2\2\u0135K\3"+
		"\2\2\2\u0136\u0137\t\3\2\2\u0137M\3\2\2\2\u0138\u0139\3\2\2\2\u0139O\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013bQ\3\2\2\2\u013c\u013d\3\2\2\2\u013dS\3"+
		"\2\2\2\u013e\u013f\3\2\2\2\u013fU\3\2\2\2\u0140\u0141\3\2\2\2\u0141W\3"+
		"\2\2\2\27[lrx\u0088\u0092\u0099\u009d\u00af\u00b8\u00ca\u00d3\u00dd\u00f0"+
		"\u00f9\u0107\u0111\u011b\u0125\u012c\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}