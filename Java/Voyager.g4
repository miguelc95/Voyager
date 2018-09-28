grammar Voyager;


/*
 * Parser Rules
 */

voyager                : program+ EOF ;

program                : PROGRAMA bloqueprogram;

bloqueprogram          : ABRE_BRACKET bloque3 bloque2 bloque1 CIERRA_BRACKET;

bloque1                : estatuto bloque1 | /*epsilon*/;

bloque2                : declaracion bloque2 | /*epsilon*/;

bloque3                : func bloque3 | /*epsilon*/;

func                   : typefunc ID ABRE_PAREN func1 CIERRA_PAREN bloquefunc;

typeid                 : tipo ID;

func1                  : typeid func2 | /*epsilon*/;

func2                  : COMA typeid func2 | /*epsilon*/;

bloquefunc1            : REGRESA expresion | /*epsilon*/;

typefunc               : tipo | VACIO;

bloquefunc             : ABRE_BRACKET bloque2 bloque1 bloquefunc1 CIERRA_BRACKET;

bloque                 : ABRE_BRACKET bloque1 CIERRA_BRACKET;

vector                 : ABRE_CORCHETE CTE_E CIERRA_CORCHETE | /*epsilon*/;

vector1                : ABRE_CORCHETE exp CIERRA_CORCHETE | /*epsilon*/;

estatuto               : asignacion | condicion | imprimir | llamada | ciclo;

asignacion             : ID vector1 IGUAL expresion SEMI_COLON;

condicion              : SI ABRE_PAREN expbool CIERRA_PAREN bloque condicion1;

condicion1             : SINO bloque | /*epsilon*/;

declaracion            : VAR tipo ID vector SEMI_COLON;

imprimir               : IMPRIMIR ABRE_PAREN imprimir1 CIERRA_PAREN SEMI_COLON;

imprimir1              : expresion | LETRERO;

ciclo                  : MIENTRAS ABRE_PAREN expbool CIERRA_PAREN bloque;

llamada                : ID ABRE_PAREN parametros CIERRA_PAREN SEMI_COLON;

parametros             : exp parametros1 | /*epsilon*/;

parametros1            : COMA cte_var parametros1 | /*epsilon*/;

expresion              : exp expresion1;

expresion1             : MAS_QUE exp | MENOS_QUE exp | IGUAL_IGUAL exp | DIFERENTE_DE exp | /*epsilon*/;

expbool                : expresion expbool1;

expbool1               : AND expresion | OR expresion | /*epsilon*/;

exp                    : termino exp1;

exp1                   : SUMA exp | RESTA exp | /*epsilon*/;

termino                : factor termino2;

termino2               : MULT termino | DIV termino | /*epsilon*/;

factor                 : ABRE_PAREN expresion CIERRA_PAREN | factor2 operando;

factor2                : SUMA | RESTA | /*epsilon*/;

operando               : cte_var | llamada | ID vector1;

cte_var                : variable2 | CTE_E | CTE_F;

variable1              : ID vector1 variable2;

variable2              : ABRE_PAREN parametros CIERRA_PAREN | /*epsilon*/;

tipo                   : ENTERO | FLOTANTE | BOOL;








/*
 * Lexer Rules
 */

fragment A          : ('A'|'a') ;
fragment B          : ('B'|'b') ;
fragment C          : ('C'|'c') ;
fragment E          : ('E'|'e') ;
fragment F          : ('F'|'f') ;
fragment G          : ('G'|'g') ;
fragment I          : ('I'|'i') ;
fragment O          : ('O'|'o') ;
fragment S          : ('S'|'s') ;
fragment Y          : ('Y'|'y') ;
fragment H          : ('H'|'h') ;
fragment U          : ('U'|'u') ;
fragment V          : ('V'|'v') ;
fragment T          : ('T'|'t') ;
fragment L          : ('L'|'l') ;
fragment M          : ('M'|'m') ;
fragment N          : ('N'|'n') ;
fragment P          : ('P'|'p') ;
fragment R          : ('R'|'r') ;
fragment X          : ('X'|'x') ;
fragment QUOTE      : ('"') ;
fragment EQUAL      : ('=') ;
fragment NOT        : ('!') ;
fragment SIGNO      : ('+'|'-') ;
fragment DIGITO     : ('0'..'9');
fragment AMPERSAND  : ('&');
fragment PALITO     : ('|');



fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;

FUNC                : F U N C ;

VAR                 : V A R;

IMPRIMIR            : I M P R I M I R;

SI                  : S I;

SINO                : S I N O;

ENTERO              : E N T E R O;

FLOTANTE            : F L O T A N T E;

TEXTO               : T E X T O;

BOOL                : B O O L;

VACIO               : V A C I O;

REGRESA             : R E G R E S A;

MIENTRAS            : M I E N T R A S;

ABRE_PAREN          : ('(');

CIERRA_PAREN        : (')');

ABRE_BRACKET        : ('{');

CIERRA_BRACKET      : ('}');

ABRE_CORCHETE       : ('[');

CIERRA_CORCHETE     : (']');

SEMI_COLON          : (';');

DOUBLE_DOT          : (':');

DOT                 : ('.');

COMA                 : (',');

SUMA                : ('+');

RESTA               : ('-');

DIV                 : ('/');

MULT                : ('*');

IGUAL               : ('=');

MAS_QUE             : ('>');

MENOS_QUE           : ('<');

AND                 : AMPERSAND AMPERSAND;

OR                 : PALITO PALITO;

IGUAL_IGUAL         : EQUAL EQUAL;

DIFERENTE_DE        : NOT EQUAL;

LETRERO             : QUOTE .*? QUOTE;

CTE_E               : DIGITO+;

CTE_F               : DIGITO+ DOT DIGITO+;

PROGRAMA             : P R O G R A M A;

ID                  : [A-Za-z][A-Za-z0-9_]*;

TEXT                : ('['|'(') .*? (']'|')');

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
