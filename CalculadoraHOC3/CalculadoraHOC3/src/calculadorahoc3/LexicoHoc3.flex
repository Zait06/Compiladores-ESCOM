// Analizador Lexico
package calculadorahoc3;
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

    private Float findConst(String con){
        Float res = new Float(0);
        if(con.equals("PI")){
            res = new Float(Math.PI);
        }
        if(con.equals("E")){
            res = new Float(Math.E);
        }
        if(con.equals("GAMMA")){
            res = new Float(0.57721566490153286060);
        }
        if(con.equals("DEG")){
            res = new Float(57.29577951308232087680);
        }
        if(con.equals("PHI")){
            res = new Float(1.61803398874989484820);
        }
        return res;
    }
%}

LetraMin=[a-z]
Digito=[0-9]
LetraMay=[A-Z]

%%

[ \t]+                  {;}
";"                     {return symbol(AnalizadorSintacticoSym.SEMICOLON);}
"\n"                    {return symbol(AnalizadorSintacticoSym.ENTER);}
{Digito}+(\.{Digito}+)? {return symbol(AnalizadorSintacticoSym.NUM,new Float(yytext()));}
"="                     {return symbol(AnalizadorSintacticoSym.ASIG);}
"/"                     {return symbol(AnalizadorSintacticoSym.opDIV);}
"*"                     {return symbol(AnalizadorSintacticoSym.opMULT);}
"-"                     {return symbol(AnalizadorSintacticoSym.opRESTA);}
"+"                     {return symbol(AnalizadorSintacticoSym.opSUMA);}
")"                     {return symbol(AnalizadorSintacticoSym.ParDer);}
"("                     {return symbol(AnalizadorSintacticoSym.ParIzq);}
"^"                     {return symbol(AnalizadorSintacticoSym.POW);}
{LetraMin}              {int IndVar; 
                        IndVar=(int)(yytext().charAt(0))-(int)'a'; 
                        return symbol(AnalizadorSintacticoSym.VAR,new Integer(IndVar));}
{LetraMay}+             {Float val;
                        val=findConst(yytext());
                        return symbol(AnalizadorSintacticoSym.CONSTS,val);}
. {return symbol(AnalizadorSintacticoSym.error);}