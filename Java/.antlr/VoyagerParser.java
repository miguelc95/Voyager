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
		CTE_C=40, CTE_V=41, PROGRAMA=42, ID=43, WS=44;
	public static final int
		RULE_voyager = 0, RULE_program = 1, RULE_bloqueprogram = 2, RULE_bloque1 = 3, 
		RULE_bloque2 = 4, RULE_bloque3 = 5, RULE_func = 6, RULE_typeid = 7, RULE_func1 = 8, 
		RULE_func2 = 9, RULE_bloquefunc1 = 10, RULE_typefunc = 11, RULE_bloquefunc = 12, 
		RULE_bloque = 13, RULE_vector = 14, RULE_vector1 = 15, RULE_estatuto = 16, 
		RULE_asignacion = 17, RULE_condicion = 18, RULE_condicion1 = 19, RULE_declaracion = 20, 
		RULE_imprimir = 21, RULE_imprimir1 = 22, RULE_ciclo = 23, RULE_llamada = 24, 
		RULE_parametros = 25, RULE_parametros1 = 26, RULE_expresion = 27, RULE_expresion1 = 28, 
		RULE_expbool = 29, RULE_expbool1 = 30, RULE_exp = 31, RULE_exp1 = 32, 
		RULE_termino = 33, RULE_termino2 = 34, RULE_factor = 35, RULE_factor2 = 36, 
		RULE_operando = 37, RULE_cte_var = 38, RULE_variable1 = 39, RULE_variable2 = 40, 
		RULE_tipo = 41, RULE_lee_condicion = 42, RULE_termina_condicion = 43, 
		RULE_entra_sino = 44, RULE_entra_ciclo = 45, RULE_termina_ciclo = 46;
	public static final String[] ruleNames = {
		"voyager", "program", "bloqueprogram", "bloque1", "bloque2", "bloque3", 
		"func", "typeid", "func1", "func2", "bloquefunc1", "typefunc", "bloquefunc", 
		"bloque", "vector", "vector1", "estatuto", "asignacion", "condicion", 
		"condicion1", "declaracion", "imprimir", "imprimir1", "ciclo", "llamada", 
		"parametros", "parametros1", "expresion", "expresion1", "expbool", "expbool1", 
		"exp", "exp1", "termino", "termino2", "factor", "factor2", "operando", 
		"cte_var", "variable1", "variable2", "tipo", "lee_condicion", "termina_condicion", 
		"entra_sino", "entra_ciclo", "termina_ciclo"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VERDADERO", "FALSO", "FUNC", "VAR", "IMPRIMIR", "SI", "SINO", "ENTERO", 
		"CHAR", "FLOTANTE", "TEXTO", "BOOL", "VACIO", "REGRESA", "MIENTRAS", "ABRE_PAREN", 
		"CIERRA_PAREN", "ABRE_BRACKET", "CIERRA_BRACKET", "ABRE_CORCHETE", "CIERRA_CORCHETE", 
		"SEMI_COLON", "DOUBLE_DOT", "DOT", "COMA", "SUMA", "RESTA", "DIV", "MULT", 
		"IGUAL", "MAS_QUE", "MENOS_QUE", "AND", "OR", "IGUAL_IGUAL", "DIFERENTE_DE", 
		"LETRERO", "CTE_E", "CTE_F", "CTE_C", "CTE_V", "PROGRAMA", "ID", "WS"
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				program();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAMA );
			setState(99);
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
			setState(101);
			match(PROGRAMA);
			setState(102);
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
			setState(104);
			match(ABRE_BRACKET);
			setState(105);
			bloque3();
			setState(106);
			bloque2();
			setState(107);
			bloque1();
			setState(108);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				estatuto();
				setState(111);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				declaracion();
				setState(117);
				bloque2();
				}
				break;
			case IMPRIMIR:
			case SI:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
			case VACIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				func();
				setState(123);
				bloque3();
				}
				break;
			case VAR:
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case CIERRA_BRACKET:
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
		public Func1Context func1() {
			return getRuleContext(Func1Context.class,0);
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
			setState(128);
			typefunc();
			setState(129);
			match(ID);
			setState(130);
			match(ABRE_PAREN);
			setState(131);
			func1();
			setState(132);
			match(CIERRA_PAREN);
			setState(133);
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

	public static class TypeidContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			tipo();
			setState(136);
			match(ID);
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

	public static class Func1Context extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public Func2Context func2() {
			return getRuleContext(Func2Context.class,0);
		}
		public Func1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func1; }
	}

	public final Func1Context func1() throws RecognitionException {
		Func1Context _localctx = new Func1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_func1);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				typeid();
				setState(139);
				func2();
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

	public static class Func2Context extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(VoyagerParser.COMA, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public Func2Context func2() {
			return getRuleContext(Func2Context.class,0);
		}
		public Func2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func2; }
	}

	public final Func2Context func2() throws RecognitionException {
		Func2Context _localctx = new Func2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_func2);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(COMA);
				setState(145);
				typeid();
				setState(146);
				func2();
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
		enterRule(_localctx, 20, RULE_bloquefunc1);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(REGRESA);
				setState(152);
				expresion();
				setState(153);
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
		enterRule(_localctx, 22, RULE_typefunc);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CHAR:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				tipo();
				}
				break;
			case VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
		enterRule(_localctx, 24, RULE_bloquefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ABRE_BRACKET);
			setState(163);
			bloque2();
			setState(164);
			bloque1();
			setState(165);
			bloquefunc1();
			setState(166);
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
		enterRule(_localctx, 26, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(ABRE_BRACKET);
			setState(169);
			bloque1();
			setState(170);
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
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public TerminalNode CTE_E() { return getToken(VoyagerParser.CTE_E, 0); }
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vector);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CORCHETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(ABRE_CORCHETE);
				setState(173);
				match(CTE_E);
				setState(174);
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

	public static class Vector1Context extends ParserRuleContext {
		public TerminalNode ABRE_CORCHETE() { return getToken(VoyagerParser.ABRE_CORCHETE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CIERRA_CORCHETE() { return getToken(VoyagerParser.CIERRA_CORCHETE, 0); }
		public Vector1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector1; }
	}

	public final Vector1Context vector1() throws RecognitionException {
		Vector1Context _localctx = new Vector1Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_vector1);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CORCHETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ABRE_CORCHETE);
				setState(179);
				exp();
				setState(180);
				match(CIERRA_CORCHETE);
				}
				break;
			case EOF:
			case ABRE_PAREN:
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
		enterRule(_localctx, 32, RULE_estatuto);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(188);
				llamada();
				setState(189);
				match(SEMI_COLON);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
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
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Vector1Context vector1() {
			return getRuleContext(Vector1Context.class,0);
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
		enterRule(_localctx, 34, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			vector1();
			setState(196);
			match(IGUAL);
			setState(197);
			expresion();
			setState(198);
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
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
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
		public Termina_condicionContext termina_condicion() {
			return getRuleContext(Termina_condicionContext.class,0);
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
			setState(200);
			match(SI);
			setState(201);
			match(ABRE_PAREN);
			setState(202);
			expbool();
			setState(203);
			match(CIERRA_PAREN);
			setState(204);
			lee_condicion();
			setState(205);
			bloque();
			setState(206);
			condicion1();
			setState(207);
			termina_condicion();
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
		public Entra_sinoContext entra_sino() {
			return getRuleContext(Entra_sinoContext.class,0);
		}
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
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(SINO);
				setState(210);
				entra_sino();
				setState(211);
				bloque();
				}
				break;
			case IMPRIMIR:
			case SI:
			case REGRESA:
			case MIENTRAS:
			case CIERRA_BRACKET:
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
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
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
			setState(216);
			match(VAR);
			setState(217);
			tipo();
			setState(218);
			match(ID);
			setState(219);
			vector();
			setState(220);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(VoyagerParser.IMPRIMIR, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public Imprimir1Context imprimir1() {
			return getRuleContext(Imprimir1Context.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public Lee_condicionContext lee_condicion() {
			return getRuleContext(Lee_condicionContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
		public Termina_cicloContext termina_ciclo() {
			return getRuleContext(Termina_cicloContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IMPRIMIR);
			setState(223);
			match(ABRE_PAREN);
			setState(224);
			imprimir1();
			setState(225);
			match(CIERRA_PAREN);
			setState(226);
			lee_condicion();
			setState(227);
			match(SEMI_COLON);
			setState(228);
			termina_ciclo();
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
		enterRule(_localctx, 44, RULE_imprimir1);
		try {
			setState(232);
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
			case IGUAL_IGUAL:
			case DIFERENTE_DE:
			case CTE_E:
			case CTE_F:
			case CTE_C:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				expresion();
				}
				break;
			case LETRERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
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
		public Entra_cicloContext entra_ciclo() {
			return getRuleContext(Entra_cicloContext.class,0);
		}
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ExpboolContext expbool() {
			return getRuleContext(ExpboolContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
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
		enterRule(_localctx, 46, RULE_ciclo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(MIENTRAS);
			setState(235);
			entra_ciclo();
			setState(236);
			match(ABRE_PAREN);
			setState(237);
			expbool();
			setState(238);
			match(CIERRA_PAREN);
			setState(239);
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
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_llamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			match(ABRE_PAREN);
			setState(243);
			parametros();
			setState(244);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 50, RULE_parametros);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				exp();
				setState(247);
				parametros1();
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

	public static class Parametros1Context extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(VoyagerParser.COMA, 0); }
		public Cte_varContext cte_var() {
			return getRuleContext(Cte_varContext.class,0);
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
		enterRule(_localctx, 52, RULE_parametros1);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(COMA);
				setState(253);
				cte_var();
				setState(254);
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

	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		enterRule(_localctx, 54, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			exp();
			setState(260);
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
		public TerminalNode MAS_QUE() { return getToken(VoyagerParser.MAS_QUE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MENOS_QUE() { return getToken(VoyagerParser.MENOS_QUE, 0); }
		public TerminalNode IGUAL_IGUAL() { return getToken(VoyagerParser.IGUAL_IGUAL, 0); }
		public TerminalNode DIFERENTE_DE() { return getToken(VoyagerParser.DIFERENTE_DE, 0); }
		public Expresion1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion1; }
	}

	public final Expresion1Context expresion1() throws RecognitionException {
		Expresion1Context _localctx = new Expresion1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expresion1);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(MAS_QUE);
				setState(263);
				exp();
				}
				break;
			case MENOS_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(MENOS_QUE);
				setState(265);
				exp();
				}
				break;
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(IGUAL_IGUAL);
				setState(267);
				exp();
				}
				break;
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(DIFERENTE_DE);
				setState(269);
				exp();
				}
				break;
			case CIERRA_PAREN:
			case SEMI_COLON:
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

	public static class ExpboolContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
		enterRule(_localctx, 58, RULE_expbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			expresion();
			setState(274);
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
		public TerminalNode AND() { return getToken(VoyagerParser.AND, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode OR() { return getToken(VoyagerParser.OR, 0); }
		public Expbool1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expbool1; }
	}

	public final Expbool1Context expbool1() throws RecognitionException {
		Expbool1Context _localctx = new Expbool1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_expbool1);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(AND);
				setState(277);
				expresion();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(OR);
				setState(279);
				expresion();
				}
				break;
			case CIERRA_PAREN:
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
		enterRule(_localctx, 62, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			termino();
			setState(284);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(VoyagerParser.RESTA, 0); }
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_exp1);
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(SUMA);
				setState(287);
				exp();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(RESTA);
				setState(289);
				exp();
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
		enterRule(_localctx, 66, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			factor();
			setState(294);
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
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public TerminalNode DIV() { return getToken(VoyagerParser.DIV, 0); }
		public Termino2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino2; }
	}

	public final Termino2Context termino2() throws RecognitionException {
		Termino2Context _localctx = new Termino2Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_termino2);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(MULT);
				setState(297);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(DIV);
				setState(299);
				termino();
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
		public Factor2Context factor2() {
			return getRuleContext(Factor2Context.class,0);
		}
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
		enterRule(_localctx, 70, RULE_factor);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(ABRE_PAREN);
				setState(304);
				expresion();
				setState(305);
				match(CIERRA_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				factor2();
				setState(308);
				operando();
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

	public static class Factor2Context extends ParserRuleContext {
		public TerminalNode RESTA() { return getToken(VoyagerParser.RESTA, 0); }
		public Factor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor2; }
	}

	public final Factor2Context factor2() throws RecognitionException {
		Factor2Context _localctx = new Factor2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_factor2);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(RESTA);
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

	public static class OperandoContext extends ParserRuleContext {
		public Cte_varContext cte_var() {
			return getRuleContext(Cte_varContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Vector1Context vector1() {
			return getRuleContext(Vector1Context.class,0);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				cte_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				llamada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(ID);
				setState(319);
				vector1();
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
		public Variable2Context variable2() {
			return getRuleContext(Variable2Context.class,0);
		}
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
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				variable2();
				}
				break;
			case CTE_E:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(CTE_E);
				}
				break;
			case CTE_F:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(CTE_F);
				}
				break;
			case CTE_C:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(CTE_C);
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

	public static class Variable1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VoyagerParser.ID, 0); }
		public Vector1Context vector1() {
			return getRuleContext(Vector1Context.class,0);
		}
		public Variable2Context variable2() {
			return getRuleContext(Variable2Context.class,0);
		}
		public Variable1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable1; }
	}

	public final Variable1Context variable1() throws RecognitionException {
		Variable1Context _localctx = new Variable1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_variable1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ID);
			setState(329);
			vector1();
			setState(330);
			variable2();
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

	public static class Variable2Context extends ParserRuleContext {
		public TerminalNode ABRE_PAREN() { return getToken(VoyagerParser.ABRE_PAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode CIERRA_PAREN() { return getToken(VoyagerParser.CIERRA_PAREN, 0); }
		public Variable2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable2; }
	}

	public final Variable2Context variable2() throws RecognitionException {
		Variable2Context _localctx = new Variable2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_variable2);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(ABRE_PAREN);
				setState(333);
				parametros();
				setState(334);
				match(CIERRA_PAREN);
				}
				break;
			case EOF:
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
		enterRule(_localctx, 82, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 84, RULE_lee_condicion);
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

	public static class Termina_condicionContext extends ParserRuleContext {
		public Termina_condicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termina_condicion; }
	}

	public final Termina_condicionContext termina_condicion() throws RecognitionException {
		Termina_condicionContext _localctx = new Termina_condicionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_termina_condicion);
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

	public static class Entra_sinoContext extends ParserRuleContext {
		public Entra_sinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entra_sino; }
	}

	public final Entra_sinoContext entra_sino() throws RecognitionException {
		Entra_sinoContext _localctx = new Entra_sinoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_entra_sino);
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

	public static class Entra_cicloContext extends ParserRuleContext {
		public Entra_cicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entra_ciclo; }
	}

	public final Entra_cicloContext entra_ciclo() throws RecognitionException {
		Entra_cicloContext _localctx = new Entra_cicloContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_entra_ciclo);
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

	public static class Termina_cicloContext extends ParserRuleContext {
		public Termina_cicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termina_ciclo; }
	}

	public final Termina_cicloContext termina_ciclo() throws RecognitionException {
		Termina_cicloContext _localctx = new Termina_cicloContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_termina_ciclo);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0162\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2b\n\2\r\2\16\2c\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5u\n\5\3\6\3\6\3\6\3"+
		"\6\5\6{\n\6\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0098\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3\r\3\r\5\r\u00a3\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u00b3\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00ba\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u00d9\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\5\30\u00eb\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u00fd\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0104\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0112\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \5 \u011c\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0126\n\"\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\5$\u0130\n$\3%\3%\3%\3%\3%\3%\3%\5%\u0139\n%\3&\3&\5&\u013d"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u0143\n\'\3(\3(\3(\3(\5(\u0149\n(\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\5*\u0154\n*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^\2\3\4\2\n\f\16\16\2\u0156\2a\3\2\2\2\4g\3\2\2\2"+
		"\6j\3\2\2\2\bt\3\2\2\2\nz\3\2\2\2\f\u0080\3\2\2\2\16\u0082\3\2\2\2\20"+
		"\u0089\3\2\2\2\22\u0090\3\2\2\2\24\u0097\3\2\2\2\26\u009e\3\2\2\2\30\u00a2"+
		"\3\2\2\2\32\u00a4\3\2\2\2\34\u00aa\3\2\2\2\36\u00b2\3\2\2\2 \u00b9\3\2"+
		"\2\2\"\u00c2\3\2\2\2$\u00c4\3\2\2\2&\u00ca\3\2\2\2(\u00d8\3\2\2\2*\u00da"+
		"\3\2\2\2,\u00e0\3\2\2\2.\u00ea\3\2\2\2\60\u00ec\3\2\2\2\62\u00f3\3\2\2"+
		"\2\64\u00fc\3\2\2\2\66\u0103\3\2\2\28\u0105\3\2\2\2:\u0111\3\2\2\2<\u0113"+
		"\3\2\2\2>\u011b\3\2\2\2@\u011d\3\2\2\2B\u0125\3\2\2\2D\u0127\3\2\2\2F"+
		"\u012f\3\2\2\2H\u0138\3\2\2\2J\u013c\3\2\2\2L\u0142\3\2\2\2N\u0148\3\2"+
		"\2\2P\u014a\3\2\2\2R\u0153\3\2\2\2T\u0155\3\2\2\2V\u0157\3\2\2\2X\u0159"+
		"\3\2\2\2Z\u015b\3\2\2\2\\\u015d\3\2\2\2^\u015f\3\2\2\2`b\5\4\3\2a`\3\2"+
		"\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\2\2\3f\3\3\2\2\2gh\7"+
		",\2\2hi\5\6\4\2i\5\3\2\2\2jk\7\24\2\2kl\5\f\7\2lm\5\n\6\2mn\5\b\5\2no"+
		"\7\25\2\2o\7\3\2\2\2pq\5\"\22\2qr\5\b\5\2ru\3\2\2\2su\3\2\2\2tp\3\2\2"+
		"\2ts\3\2\2\2u\t\3\2\2\2vw\5*\26\2wx\5\n\6\2x{\3\2\2\2y{\3\2\2\2zv\3\2"+
		"\2\2zy\3\2\2\2{\13\3\2\2\2|}\5\16\b\2}~\5\f\7\2~\u0081\3\2\2\2\177\u0081"+
		"\3\2\2\2\u0080|\3\2\2\2\u0080\177\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083"+
		"\5\30\r\2\u0083\u0084\7-\2\2\u0084\u0085\7\22\2\2\u0085\u0086\5\22\n\2"+
		"\u0086\u0087\7\23\2\2\u0087\u0088\5\32\16\2\u0088\17\3\2\2\2\u0089\u008a"+
		"\5T+\2\u008a\u008b\7-\2\2\u008b\21\3\2\2\2\u008c\u008d\5\20\t\2\u008d"+
		"\u008e\5\24\13\2\u008e\u0091\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008c\3"+
		"\2\2\2\u0090\u008f\3\2\2\2\u0091\23\3\2\2\2\u0092\u0093\7\33\2\2\u0093"+
		"\u0094\5\20\t\2\u0094\u0095\5\24\13\2\u0095\u0098\3\2\2\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099"+
		"\u009a\7\20\2\2\u009a\u009b\58\35\2\u009b\u009c\7\30\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009f\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\27\3\2\2\2\u00a0\u00a3\5T+\2\u00a1\u00a3\7\17\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a6"+
		"\5\n\6\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\25\2\2"+
		"\u00a9\33\3\2\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\5\b\5\2\u00ac\u00ad"+
		"\7\25\2\2\u00ad\35\3\2\2\2\u00ae\u00af\7\26\2\2\u00af\u00b0\7(\2\2\u00b0"+
		"\u00b3\7\27\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b1\3"+
		"\2\2\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\26\2\2\u00b5\u00b6\5@!\2\u00b6\u00b7"+
		"\7\27\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4\3\2\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00c3\5$\23\2\u00bc\u00c3\5"+
		"&\24\2\u00bd\u00c3\5,\27\2\u00be\u00bf\5\62\32\2\u00bf\u00c0\7\30\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00c3\5\60\31\2\u00c2\u00bb\3\2\2\2\u00c2\u00bc"+
		"\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"#\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\u00c6\5 \21\2\u00c6\u00c7\7 \2\2\u00c7"+
		"\u00c8\58\35\2\u00c8\u00c9\7\30\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\b\2\2"+
		"\u00cb\u00cc\7\22\2\2\u00cc\u00cd\5<\37\2\u00cd\u00ce\7\23\2\2\u00ce\u00cf"+
		"\5V,\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\5X-\2\u00d2"+
		"\'\3\2\2\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\5Z.\2\u00d5\u00d6\5\34\17\2"+
		"\u00d6\u00d9\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d9)\3\2\2\2\u00da\u00db\7\6\2\2\u00db\u00dc\5T+\2\u00dc\u00dd"+
		"\7-\2\2\u00dd\u00de\5\36\20\2\u00de\u00df\7\30\2\2\u00df+\3\2\2\2\u00e0"+
		"\u00e1\7\7\2\2\u00e1\u00e2\7\22\2\2\u00e2\u00e3\5.\30\2\u00e3\u00e4\7"+
		"\23\2\2\u00e4\u00e5\5V,\2\u00e5\u00e6\7\30\2\2\u00e6\u00e7\5^\60\2\u00e7"+
		"-\3\2\2\2\u00e8\u00eb\58\35\2\u00e9\u00eb\7\'\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00eb/\3\2\2\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\5"+
		"\\/\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\5<\37\2\u00f0\u00f1\7\23\2\2\u00f1"+
		"\u00f2\5\34\17\2\u00f2\61\3\2\2\2\u00f3\u00f4\7-\2\2\u00f4\u00f5\7\22"+
		"\2\2\u00f5\u00f6\5\64\33\2\u00f6\u00f7\7\23\2\2\u00f7\63\3\2\2\2\u00f8"+
		"\u00f9\5@!\2\u00f9\u00fa\5\66\34\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\65\3\2\2\2\u00fe\u00ff"+
		"\7\33\2\2\u00ff\u0100\5N(\2\u0100\u0101\5\66\34\2\u0101\u0104\3\2\2\2"+
		"\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u0102\3\2\2\2\u0104\67"+
		"\3\2\2\2\u0105\u0106\5@!\2\u0106\u0107\5:\36\2\u01079\3\2\2\2\u0108\u0109"+
		"\7!\2\2\u0109\u0112\5@!\2\u010a\u010b\7\"\2\2\u010b\u0112\5@!\2\u010c"+
		"\u010d\7%\2\2\u010d\u0112\5@!\2\u010e\u010f\7&\2\2\u010f\u0112\5@!\2\u0110"+
		"\u0112\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010c\3\2"+
		"\2\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112;\3\2\2\2\u0113\u0114"+
		"\58\35\2\u0114\u0115\5> \2\u0115=\3\2\2\2\u0116\u0117\7#\2\2\u0117\u011c"+
		"\58\35\2\u0118\u0119\7$\2\2\u0119\u011c\58\35\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0116\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u011a\3\2\2\2\u011c?\3\2\2\2"+
		"\u011d\u011e\5D#\2\u011e\u011f\5B\"\2\u011fA\3\2\2\2\u0120\u0121\7\34"+
		"\2\2\u0121\u0126\5@!\2\u0122\u0123\7\35\2\2\u0123\u0126\5@!\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0124\3\2\2\2\u0126"+
		"C\3\2\2\2\u0127\u0128\5H%\2\u0128\u0129\5F$\2\u0129E\3\2\2\2\u012a\u012b"+
		"\7\37\2\2\u012b\u0130\5D#\2\u012c\u012d\7\36\2\2\u012d\u0130\5D#\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u012e\3\2"+
		"\2\2\u0130G\3\2\2\2\u0131\u0132\7\22\2\2\u0132\u0133\58\35\2\u0133\u0134"+
		"\7\23\2\2\u0134\u0139\3\2\2\2\u0135\u0136\5J&\2\u0136\u0137\5L\'\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0135\3\2\2\2\u0139I\3\2\2\2"+
		"\u013a\u013d\7\35\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b"+
		"\3\2\2\2\u013dK\3\2\2\2\u013e\u0143\5N(\2\u013f\u0143\5\62\32\2\u0140"+
		"\u0141\7-\2\2\u0141\u0143\5 \21\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143M\3\2\2\2\u0144\u0149\5R*\2\u0145\u0149"+
		"\7(\2\2\u0146\u0149\7)\2\2\u0147\u0149\7*\2\2\u0148\u0144\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149O\3\2\2\2"+
		"\u014a\u014b\7-\2\2\u014b\u014c\5 \21\2\u014c\u014d\5R*\2\u014dQ\3\2\2"+
		"\2\u014e\u014f\7\22\2\2\u014f\u0150\5\64\33\2\u0150\u0151\7\23\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u014e\3\2\2\2\u0153\u0152\3\2"+
		"\2\2\u0154S\3\2\2\2\u0155\u0156\t\2\2\2\u0156U\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158W\3\2\2\2\u0159\u015a\3\2\2\2\u015aY\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c[\3\2\2\2\u015d\u015e\3\2\2\2\u015e]\3\2\2\2\u015f\u0160\3\2"+
		"\2\2\u0160_\3\2\2\2\32ctz\u0080\u0090\u0097\u009e\u00a2\u00b2\u00b9\u00c2"+
		"\u00d8\u00ea\u00fc\u0103\u0111\u011b\u0125\u012f\u0138\u013c\u0142\u0148"+
		"\u0153";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}