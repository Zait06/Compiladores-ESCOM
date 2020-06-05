// Analizador Lexico
package calculadorahoc4;
import java_cup.runtime.*;
import java.io.Reader;

%%
%class AnalizadorLexico
%line
%column
%char
%cup

%{
    public SymbolHOC s;
    public MaquinaHOC4 maqHOC;
    public int TipSimb;

    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }

    private Symbol symbol(int type, Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }
%}

Letra=[a-zA-Z]
Digito=[0-9]

%%

[ \t]+                          {;}
";"                             {return symbol(AnalizadorSintacticoSym.SEMICOLON);}
"\n"                            {return symbol(AnalizadorSintacticoSym.ENTER);}
{Digito}+(\.{Digito}+)?         {   s = new SymbolHOC("",EnumTipoSymbol.CONST_NUM,new Float(yytext()));
                                    return symbol(AnalizadorSintacticoSym.NUM,s);
                                }
"="                             {return symbol(AnalizadorSintacticoSym.ASIG);}
"/"                             {return symbol(AnalizadorSintacticoSym.opDIV);}
"*"                             {return symbol(AnalizadorSintacticoSym.opMULT);}
"-"                             {return symbol(AnalizadorSintacticoSym.opRESTA);}
"+"                             {return symbol(AnalizadorSintacticoSym.opSUMA);}
")"                             {return symbol(AnalizadorSintacticoSym.ParDer);}
"("                             {return symbol(AnalizadorSintacticoSym.ParIzq);}
"^"                             {return symbol(AnalizadorSintacticoSym.POW);}
{Letra}({Letra}|{Digito})*      {
                                    s = maqHOC.TabSimb.lookup(yytext());
                                    if(s == null) // Se agregara' como variable no inicializada
                                        s = maqHOC.TabSimb.install(yytext(),EnumTipoSymbol.UNDEF,(float) 0.0);
                                    switch(s.TipoSymbol){
                                        case UNDEF:
                                            TipSimb = AnalizadorSintacticoSym.VAR;
                                        break;
                                        case VAR:
                                            TipSimb = AnalizadorSintacticoSym.VAR;
                                        break;
                                        case BLTIN:
                                            TipSimb = AnalizadorSintacticoSym.BLTIN;
                                        break;
                                        case CONST_PREDEF:
                                            TipSimb = AnalizadorSintacticoSym.CONST_PRED;
                                        break;
                                    }
                                    return symbol(TipSimb,s);
                                }
. {return symbol(AnalizadorSintacticoSym.error);}