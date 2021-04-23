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
OctDigit = 0[1-7]+
WhiteSpace = [ \t\r\n]+
Operators = ","|";"|"++"|"--"|"=="|">="|">"|"?"|"<="|"<"|"!="|"||"|"&&"|"!"|"="|"+"|"-"|"*"|"/"|"%"|"("|")"|"["|"]"|"{"|"}"|":"|"."|"+="|"-="|"*="|"/="|"&"|"^"|"|"|">>"|"<<"|"~"|"%="|"&="|"^="|"|="|"<<="|">>="|"->"
Invalid = "ç"|"Ç"|"ñ"|"Ñ"|"&"|"/"|"%"|"^"|"@"|"'"|"ê"|"«"|"¿"|"¡"|"Ü"|"╝"
KeyWords = "auto"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while"
CommentMultiline = "/*" ~"*/"
Comment = "//".*
%%

/*Regular expression*/


/*Operators*/
{Operators} {lexeme = yytext(); row = yyline; column = yycolumn; return Operator;}

/*Comments*/
{Comment} {/*Ignore*/} 
{CommentMultiline} {/* Ignore */}
/*LITERALS*/

/*Strings*/
("\""({L}|{DecDigit}|{Invalid})*"\"") | ("\'"({L}|{DecDigit}|{Invalid})*"\'")  {lexeme = yytext(); row = yyline; column = yycolumn; return LiteralString; }


/*Numbers*/

/*Flotante con exponente*/
{DecDigit}+.{DecDigit}+e(-{DecDigit}+|{DecDigit}+) {lexeme = yytext(); row = yyline; column = yycolumn; return PointFloatingNumber;}


/*Octal number*/
{OctDigit} {lexeme = yytext(); row = yyline; column = yycolumn; return OctalNumber;}

/*Decimal number*/
{DecDigit}+|("-"{DecDigit}+) {lexeme = yytext(); row = yyline; column = yycolumn; return Number;}

/*Hexadecimal number*/
{HexDigit} {lexeme = yytext(); row = yyline; column = yycolumn; return HexadecimalNumber;}


/*Float number*/
({DecDigit}+|{DecDigit}+)"."{DecDigit}+ {lexeme = yytext(); row = yyline; column = yycolumn; return FloatNumber;}


/*ERROR*/
(({DecDigit}|{Invalid}{L})({L}|{DecDigit}|{Invalid})*)|({L}*{Invalid}+{DecDigit}*{L}*)* {lexeme = yytext(); row = yyline; column = yycolumn; return Error;}

/*White Space*/
{WhiteSpace} {/*Ignore*/}



/*KeyWords*/
( "auto" | "break" | "case" | "char" | "const" | "continue" | "default" | "do" | "double" | "else" | "enum" | "extern" | "float" | "for" | "goto" | "if" | "int" | "long" | "register" | "return" | "short" | "signed" | "sizeof" | "static" | "struct" | "switch" | "typedef" | "union" | "unsigned" | "void" | "volatile" | "while" ) {lexeme = yytext(); row = yyline; column = yycolumn; return Keyword;}

/*Identifiers*/
{L}({L}|{DecDigit})* {lexeme = yytext(); row = yyline; column = yycolumn; return Identifier;}




. {lexeme = yytext(); row = yyline; column = yycolumn; return ERROR;}