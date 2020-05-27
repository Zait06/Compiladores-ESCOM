// Analizador Lexico
package calculadorahoc2;
import java_cup.runtime.*;
import java.io.Reader;

%%
%class AnalizadorLexico
%line
%column
%char
%cup

%{
    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }
%}

LetraMin=[a-z]
Digito=[0-9]

%%

[ \t]+                  {;}
"\n"                    {return symbol(AnalizadorSintacticoSym.ENTER);}
{Digito}+(\.{Digito}+)? {return symbol(AnalizadorSintacticoSym.NUM,new Float(yytext()));}
"="                     {return symbol(AnalizadorSintacticoSym.ASIG);}
"/"                     {return symbol(AnalizadorSintacticoSym.opDIV);}
"*"                     {return symbol(AnalizadorSintacticoSym.opMULT);}
"-"                     {return symbol(AnalizadorSintacticoSym.opRESTA);}
"+"                     {return symbol(AnalizadorSintacticoSym.opSUMA);}
")"                     {return symbol(AnalizadorSintacticoSym.ParDer);}
"("                     {return symbol(AnalizadorSintacticoSym.ParIzq);}
{LetraMin}              {int IndVar; 
                        IndVar=(int)(yytext().charAt(0))-(int)'a'; 
                        return symbol(AnalizadorSintacticoSym.VAR,new Integer(IndVar));}
. {return symbol(AnalizadorSintacticoSym.error);}