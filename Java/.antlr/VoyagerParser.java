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
		FUNC=1, VAR=2, IMPRIMIR=3, SI=4, SINO=5, ENTERO=6, FLOTANTE=7, TEXTO=8, 
		BOOL=9, VACIO=10, REGRESA=11, MIENTRAS=12, ABRE_PAREN=13, CIERRA_PAREN=14, 
		ABRE_BRACKET=15, CIERRA_BRACKET=16, ABRE_CORCHETE=17, CIERRA_CORCHETE=18, 
		SEMI_COLON=19, DOUBLE_DOT=20, DOT=21, COMA=22, SUMA=23, RESTA=24, DIV=25, 
		MULT=26, IGUAL=27, MAS_QUE=28, MENOS_QUE=29, AND=30, OR=31, IGUAL_IGUAL=32, 
		DIFERENTE_DE=33, LETRERO=34, CTE_E=35, CTE_F=36, PROGRAMA=37, ID=38, NEWLINE=39, 
		TEXT=40;
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
		RULE_tipo = 41;
	public static final String[] ruleNames = {
		"voyager", "program", "bloqueprogram", "bloque1", "bloque2", "bloque3", 
		"func", "typeid", "func1", "func2", "bloquefunc1", "typefunc", "bloquefunc", 
		"bloque", "vector", "vector1", "estatuto", "asignacion", "condicion", 
		"condicion1", "declaracion", "imprimir", "imprimir1", "ciclo", "llamada", 
		"parametros", "parametros1", "expresion", "expresion1", "expbool", "expbool1", 
		"exp", "exp1", "termino", "termino2", "factor", "factor2", "operando", 
		"cte_var", "variable1", "variable2", "tipo"
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				program();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROGRAMA );
			setState(89);
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
			setState(91);
			match(PROGRAMA);
			setState(92);
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
			setState(94);
			match(ABRE_BRACKET);
			setState(95);
			bloque3();
			setState(96);
			bloque2();
			setState(97);
			bloque1();
			setState(98);
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
			case SI:
			case MIENTRAS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				estatuto();
				setState(101);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				declaracion();
				setState(107);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case BOOL:
			case VACIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				func();
				setState(113);
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
			setState(118);
			typefunc();
			setState(119);
			match(ID);
			setState(120);
			match(ABRE_PAREN);
			setState(121);
			func1();
			setState(122);
			match(CIERRA_PAREN);
			setState(123);
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
			setState(125);
			tipo();
			setState(126);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			typeid();
			setState(129);
			func2();
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				typeid();
				setState(132);
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
		public Bloquefunc1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloquefunc1; }
	}

	public final Bloquefunc1Context bloquefunc1() throws RecognitionException {
		Bloquefunc1Context _localctx = new Bloquefunc1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloquefunc1);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGRESA:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(REGRESA);
				setState(138);
				expresion();
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				tipo();
				}
				break;
			case VACIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
			setState(146);
			match(ABRE_BRACKET);
			setState(147);
			bloque2();
			setState(148);
			bloque1();
			setState(149);
			bloquefunc1();
			setState(150);
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
			setState(152);
			match(ABRE_BRACKET);
			setState(153);
			bloque1();
			setState(154);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CORCHETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(ABRE_CORCHETE);
				setState(157);
				match(CTE_E);
				setState(158);
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
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CORCHETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(ABRE_CORCHETE);
				setState(163);
				exp();
				setState(164);
				match(CIERRA_CORCHETE);
				}
				break;
			case EOF:
			case ABRE_PAREN:
			case CIERRA_PAREN:
			case CIERRA_BRACKET:
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
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				condicion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				imprimir();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				llamada();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
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
			setState(176);
			match(ID);
			setState(177);
			vector1();
			setState(178);
			match(IGUAL);
			setState(179);
			expresion();
			setState(180);
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
			setState(182);
			match(SI);
			setState(183);
			match(ABRE_PAREN);
			setState(184);
			expbool();
			setState(185);
			match(CIERRA_PAREN);
			setState(186);
			bloque();
			setState(187);
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(SINO);
				setState(190);
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
			setState(194);
			match(VAR);
			setState(195);
			tipo();
			setState(196);
			match(ID);
			setState(197);
			vector();
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
		enterRule(_localctx, 42, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IMPRIMIR);
			setState(201);
			match(ABRE_PAREN);
			setState(202);
			imprimir1();
			setState(203);
			match(CIERRA_PAREN);
			setState(204);
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
		enterRule(_localctx, 44, RULE_imprimir1);
		try {
			setState(208);
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
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				expresion();
				}
				break;
			case LETRERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
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
			setState(210);
			match(MIENTRAS);
			setState(211);
			match(ABRE_PAREN);
			setState(212);
			expbool();
			setState(213);
			match(CIERRA_PAREN);
			setState(214);
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
		public TerminalNode SEMI_COLON() { return getToken(VoyagerParser.SEMI_COLON, 0); }
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
			setState(216);
			match(ID);
			setState(217);
			match(ABRE_PAREN);
			setState(218);
			parametros();
			setState(219);
			match(CIERRA_PAREN);
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
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				exp();
				setState(223);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(COMA);
				setState(229);
				cte_var();
				setState(230);
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
			setState(235);
			exp();
			setState(236);
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
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(MAS_QUE);
				setState(239);
				exp();
				}
				break;
			case MENOS_QUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(MENOS_QUE);
				setState(241);
				exp();
				}
				break;
			case IGUAL_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(IGUAL_IGUAL);
				setState(243);
				exp();
				}
				break;
			case DIFERENTE_DE:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(DIFERENTE_DE);
				setState(245);
				exp();
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_BRACKET:
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
			setState(249);
			expresion();
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
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(AND);
				setState(253);
				expresion();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(OR);
				setState(255);
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
			setState(259);
			termino();
			setState(260);
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(SUMA);
				setState(263);
				exp();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(RESTA);
				setState(265);
				exp();
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_BRACKET:
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
			setState(269);
			factor();
			setState(270);
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
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(MULT);
				setState(273);
				termino();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(DIV);
				setState(275);
				termino();
				}
				break;
			case CIERRA_PAREN:
			case CIERRA_BRACKET:
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(ABRE_PAREN);
				setState(280);
				expresion();
				setState(281);
				match(CIERRA_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				factor2();
				setState(284);
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
		public TerminalNode SUMA() { return getToken(VoyagerParser.SUMA, 0); }
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
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(SUMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(RESTA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				cte_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				llamada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(ID);
				setState(296);
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
		public Cte_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_var; }
	}

	public final Cte_varContext cte_var() throws RecognitionException {
		Cte_varContext _localctx = new Cte_varContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cte_var);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
			case CIERRA_PAREN:
			case CIERRA_BRACKET:
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
				setState(299);
				variable2();
				}
				break;
			case CTE_E:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(CTE_E);
				}
				break;
			case CTE_F:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(CTE_F);
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
			setState(304);
			match(ID);
			setState(305);
			vector1();
			setState(306);
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(ABRE_PAREN);
				setState(309);
				parametros();
				setState(310);
				match(CIERRA_PAREN);
				}
				break;
			case EOF:
			case CIERRA_PAREN:
			case CIERRA_BRACKET:
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
			setState(315);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\5\6q\n\6\3\7\3\7\3\7\3\7\5\7w\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\5\13\u008a\n\13\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r\5\r\u0093\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\5\20\u00a3\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00aa\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00b1\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00c3\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00d3\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\5\33\u00e5\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u00ec\n\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00fa"+
		"\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0104\n \3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u010e\n\"\3#\3#\3#\3$\3$\3$\3$\3$\5$\u0118\n$\3%\3%\3%\3%\3"+
		"%\3%\3%\5%\u0121\n%\3&\3&\3&\5&\u0126\n&\3\'\3\'\3\'\3\'\5\'\u012c\n\'"+
		"\3(\3(\3(\5(\u0131\n(\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u013c\n*\3+\3+\3+"+
		"\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRT\2\3\4\2\b\t\13\13\2\u0138\2W\3\2\2\2\4]\3\2\2\2\6`\3\2\2\2"+
		"\bj\3\2\2\2\np\3\2\2\2\fv\3\2\2\2\16x\3\2\2\2\20\177\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\u0089\3\2\2\2\26\u008e\3\2\2\2\30\u0092\3\2\2\2\32\u0094\3"+
		"\2\2\2\34\u009a\3\2\2\2\36\u00a2\3\2\2\2 \u00a9\3\2\2\2\"\u00b0\3\2\2"+
		"\2$\u00b2\3\2\2\2&\u00b8\3\2\2\2(\u00c2\3\2\2\2*\u00c4\3\2\2\2,\u00ca"+
		"\3\2\2\2.\u00d2\3\2\2\2\60\u00d4\3\2\2\2\62\u00da\3\2\2\2\64\u00e4\3\2"+
		"\2\2\66\u00eb\3\2\2\28\u00ed\3\2\2\2:\u00f9\3\2\2\2<\u00fb\3\2\2\2>\u0103"+
		"\3\2\2\2@\u0105\3\2\2\2B\u010d\3\2\2\2D\u010f\3\2\2\2F\u0117\3\2\2\2H"+
		"\u0120\3\2\2\2J\u0125\3\2\2\2L\u012b\3\2\2\2N\u0130\3\2\2\2P\u0132\3\2"+
		"\2\2R\u013b\3\2\2\2T\u013d\3\2\2\2VX\5\4\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\2\2\3\\\3\3\2\2\2]^\7\'\2\2^_\5\6\4\2_\5"+
		"\3\2\2\2`a\7\21\2\2ab\5\f\7\2bc\5\n\6\2cd\5\b\5\2de\7\22\2\2e\7\3\2\2"+
		"\2fg\5\"\22\2gh\5\b\5\2hk\3\2\2\2ik\3\2\2\2jf\3\2\2\2ji\3\2\2\2k\t\3\2"+
		"\2\2lm\5*\26\2mn\5\n\6\2nq\3\2\2\2oq\3\2\2\2pl\3\2\2\2po\3\2\2\2q\13\3"+
		"\2\2\2rs\5\16\b\2st\5\f\7\2tw\3\2\2\2uw\3\2\2\2vr\3\2\2\2vu\3\2\2\2w\r"+
		"\3\2\2\2xy\5\30\r\2yz\7(\2\2z{\7\17\2\2{|\5\22\n\2|}\7\20\2\2}~\5\32\16"+
		"\2~\17\3\2\2\2\177\u0080\5T+\2\u0080\u0081\7(\2\2\u0081\21\3\2\2\2\u0082"+
		"\u0083\5\20\t\2\u0083\u0084\5\24\13\2\u0084\23\3\2\2\2\u0085\u0086\5\20"+
		"\t\2\u0086\u0087\5\24\13\2\u0087\u008a\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0085\3\2\2\2\u0089\u0088\3\2\2\2\u008a\25\3\2\2\2\u008b\u008c\7\r\2"+
		"\2\u008c\u008f\58\35\2\u008d\u008f\3\2\2\2\u008e\u008b\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\27\3\2\2\2\u0090\u0093\5T+\2\u0091\u0093\7\f\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095\7\21\2"+
		"\2\u0095\u0096\5\n\6\2\u0096\u0097\5\b\5\2\u0097\u0098\5\26\f\2\u0098"+
		"\u0099\7\22\2\2\u0099\33\3\2\2\2\u009a\u009b\7\21\2\2\u009b\u009c\5\b"+
		"\5\2\u009c\u009d\7\22\2\2\u009d\35\3\2\2\2\u009e\u009f\7\23\2\2\u009f"+
		"\u00a0\7%\2\2\u00a0\u00a3\7\24\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009e\3\2"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6"+
		"\5@!\2\u00a6\u00a7\7\24\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a4\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa!\3\2\2\2\u00ab\u00b1\5$\23\2"+
		"\u00ac\u00b1\5&\24\2\u00ad\u00b1\5,\27\2\u00ae\u00b1\5\62\32\2\u00af\u00b1"+
		"\5\60\31\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1#\3\2\2\2\u00b2\u00b3\7"+
		"(\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\58\35\2\u00b6"+
		"\u00b7\7\25\2\2\u00b7%\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\7\17\2"+
		"\2\u00ba\u00bb\5<\37\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\5\34\17\2\u00bd"+
		"\u00be\5(\25\2\u00be\'\3\2\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c3\5\34\17"+
		"\2\u00c1\u00c3\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3)"+
		"\3\2\2\2\u00c4\u00c5\7\4\2\2\u00c5\u00c6\5T+\2\u00c6\u00c7\7(\2\2\u00c7"+
		"\u00c8\5\36\20\2\u00c8\u00c9\7\25\2\2\u00c9+\3\2\2\2\u00ca\u00cb\7\5\2"+
		"\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\5.\30\2\u00cd\u00ce\7\20\2\2\u00ce"+
		"\u00cf\7\25\2\2\u00cf-\3\2\2\2\u00d0\u00d3\58\35\2\u00d1\u00d3\7$\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3/\3\2\2\2\u00d4\u00d5\7"+
		"\16\2\2\u00d5\u00d6\7\17\2\2\u00d6\u00d7\5<\37\2\u00d7\u00d8\7\20\2\2"+
		"\u00d8\u00d9\5\34\17\2\u00d9\61\3\2\2\2\u00da\u00db\7(\2\2\u00db\u00dc"+
		"\7\17\2\2\u00dc\u00dd\5\64\33\2\u00dd\u00de\7\20\2\2\u00de\u00df\7\25"+
		"\2\2\u00df\63\3\2\2\2\u00e0\u00e1\5@!\2\u00e1\u00e2\5\66\34\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\65\3\2\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8\5N(\2\u00e8\u00e9\5\66\34"+
		"\2\u00e9\u00ec\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\67\3\2\2\2\u00ed\u00ee\5@!\2\u00ee\u00ef\5:\36\2\u00ef"+
		"9\3\2\2\2\u00f0\u00f1\7\36\2\2\u00f1\u00fa\5@!\2\u00f2\u00f3\7\37\2\2"+
		"\u00f3\u00fa\5@!\2\u00f4\u00f5\7\"\2\2\u00f5\u00fa\5@!\2\u00f6\u00f7\7"+
		"#\2\2\u00f7\u00fa\5@!\2\u00f8\u00fa\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9"+
		"\u00f2\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa;\3\2\2\2\u00fb\u00fc\58\35\2\u00fc\u00fd\5> \2\u00fd=\3\2\2"+
		"\2\u00fe\u00ff\7 \2\2\u00ff\u0104\58\35\2\u0100\u0101\7!\2\2\u0101\u0104"+
		"\58\35\2\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104?\3\2\2\2\u0105\u0106\5D#\2\u0106\u0107\5B\"\2\u0107"+
		"A\3\2\2\2\u0108\u0109\7\31\2\2\u0109\u010e\5@!\2\u010a\u010b\7\32\2\2"+
		"\u010b\u010e\5@!\2\u010c\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u010a"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010eC\3\2\2\2\u010f\u0110\5H%\2\u0110\u0111"+
		"\5F$\2\u0111E\3\2\2\2\u0112\u0113\7\34\2\2\u0113\u0118\5D#\2\u0114\u0115"+
		"\7\33\2\2\u0115\u0118\5D#\2\u0116\u0118\3\2\2\2\u0117\u0112\3\2\2\2\u0117"+
		"\u0114\3\2\2\2\u0117\u0116\3\2\2\2\u0118G\3\2\2\2\u0119\u011a\7\17\2\2"+
		"\u011a\u011b\58\35\2\u011b\u011c\7\20\2\2\u011c\u0121\3\2\2\2\u011d\u011e"+
		"\5J&\2\u011e\u011f\5L\'\2\u011f\u0121\3\2\2\2\u0120\u0119\3\2\2\2\u0120"+
		"\u011d\3\2\2\2\u0121I\3\2\2\2\u0122\u0126\7\31\2\2\u0123\u0126\7\32\2"+
		"\2\u0124\u0126\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124"+
		"\3\2\2\2\u0126K\3\2\2\2\u0127\u012c\5N(\2\u0128\u012c\5\62\32\2\u0129"+
		"\u012a\7(\2\2\u012a\u012c\5 \21\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012cM\3\2\2\2\u012d\u0131\5R*\2\u012e\u0131"+
		"\7%\2\2\u012f\u0131\7&\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u012f\3\2\2\2\u0131O\3\2\2\2\u0132\u0133\7(\2\2\u0133\u0134\5 \21\2\u0134"+
		"\u0135\5R*\2\u0135Q\3\2\2\2\u0136\u0137\7\17\2\2\u0137\u0138\5\64\33\2"+
		"\u0138\u0139\7\20\2\2\u0139\u013c\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0136"+
		"\3\2\2\2\u013b\u013a\3\2\2\2\u013cS\3\2\2\2\u013d\u013e\t\2\2\2\u013e"+
		"U\3\2\2\2\31Yjpv\u0089\u008e\u0092\u00a2\u00a9\u00b0\u00c2\u00d2\u00e4"+
		"\u00eb\u00f9\u0103\u010d\u0117\u0120\u0125\u012b\u0130\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}