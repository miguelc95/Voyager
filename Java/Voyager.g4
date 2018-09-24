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

typefunc               : tipo | VACIO;

bloquefunc             : ABRE_BRACKET bloque2 bloque1 bloquefunc1 CIERRA_BRACKET;

bloquefunc1            : REGRESA expresion | /*epsilon*/;

bloque                 : ABRE_BRACKET bloque1 CIERRA_BRACKET;

vector                 : ABRE_CORCHETE CTE_E CIERRA_CORCHETE | /*epsilon*/;






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
fragment SIGNO      : ('+'|'-') ;
fragment DIGITO     : ('0'..'9');



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

ABRE_PAREN          : ('(');

CIERRA_PAREN        : (')');

ABRE_BRACKET        : ('{');

CIERRA_BRACKET      : ('}');

ABRE_CORCHETE       : ('[');

CIERRA_CORCHETE     : (']');

SEMI_COLON          : (';');

DOUBLE_DOT          : (':');

DOT                 : ('.');

SUMA                : ('+');

RESTA               : ('-');

DIV                 : ('/');

MULT                : ('*');

IGUAL               : ('=');

MAS_QUE             : ('>');

MENOS_QUE           : ('<');

NO_IGUAL            : ('!');

LETRERO             : QUOTE .*? QUOTE;

CTE_E               : DIGITO*;

CTE_F               : DIGITO* DOT{1} DIGITO+;

PROGRAMA             : P R O G R A M A;

ID                  : ('\r[A-Za-z][A-Za-z0-9_]*');

NEWLINE             : ('\r'? '\n' | '\r')+ ;

TEXT                : ('['|'(') .*? (']'|')');
