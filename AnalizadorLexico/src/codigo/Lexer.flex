package codigo;
import static codigo.TipoToken.*;
%%
%class Lexer
%type TipoToken
%line
%column

%{
    public String lexeme;
    public Integer row;
    public Integer column;
%}

L=[a-zA-Z_]
DecDigit = [0-9]
HexDigit = 0x [0-9A-Fa-f]+
BinDigit = [0|1]+
OctDigit = [0-7]+
WhiteSpace = [ ,\t,\r,\n]+
Invalid = [ "ñ","Ñ","+","-",">","?","<","!","&","*","/","%","[","]","{","}",":",".","^","@","'","ê","«","¿","¡","Ü","╝",]
%%

/*Regular expression*/


/*Operators*/
( "," | ";" | "++" | "--" | "==" | ">=" | ">" | "?" | "<=" | "<" | "!=" | "||" | "&&" | "!" | "=" | "+" | "-" | "*" | "/" | "%" | "(" | ")" | "[" | "]" | "{" | "}" | ":" | "." | "+=" | "-=" | "*=" | "/=" | "&" | "^" | "|" | ">>" | "<<" | "~" | "%=" | "&=" | "^=" | "|=" | "<<=" | ">>=" | "->" ) {lexeme = yytext(); row = yyline; column = yycolumn; return Operator;}


/*LITERALS*/

/*Strings*/
"\'"({L}|{DecDigit}|{Invalid})*"\'" {lexeme = yytext(); row = yyline; column = yycolumn; return LiteralString; }

/*Numbers*/
/*Decimal number*/
{DecDigit}+|("-"{DecDigit}+) {lexeme = yytext(); row = yyline; column = yycolumn; return Number;}
/*Float number*/
({DecDigit}+|"-"{DecDigit}+)"."{DecDigit}+ {lexeme = yytext(); row = yyline; column = yycolumn; return FloatNumber;}
/*Hexa number*/

/*Octal number*/


/*ERROR*/
({DecDigit}{L})({L}|{DecDigit}|{Invalid})* {lexeme = yytext(); row = yyline; column = yycolumn; return Error;}

/*White Space*/
{WhiteSpace} {/*Ignore*/}

/*Comments*/
("//") {/*Ignore*/}
("/*"){L}*("*/") {/*Ignore*/}


/*KeyWords*/
( "auto" | "break" | "case" | "char" | "const" | "continue" | "default" | "do" | "double" | "else" | "enum" | "extern" | "float" | "for" | "goto" | "if" | "int" | "long" | "register" | "return" | "short" | "signed" | "sizeof" | "static" | "struct" | "switch" | "typedef" | "union" | "unsigned" | "void" | "volatile" | "while" ) {lexeme = yytext(); row = yyline; column = yycolumn; return Keyword;}

/*Identifiers*/
{L}({L}|{DecDigit})* {lexeme = yytext(); row = yyline; column = yycolumn; return Identifier;}




. {return ERROR;}