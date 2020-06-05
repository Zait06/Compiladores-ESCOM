package calculadorahoc4;

public class SymbolHOC {
    public String name;
    public EnumTipoSymbol TipoSymbol;   /* VAR,UNDEF,BLTIN,CONST_NUM,CONS_PREDEF */
    public float val;
    public EnumBLTIN FuncPredef;
    
    public SymbolHOC(){
        name = "";
        val = 0;
    }
    
    public SymbolHOC(String nombre, EnumTipoSymbol TipSimbolo, float valor){
        name = nombre;
        TipoSymbol = TipSimbolo;
        val = valor;
    }
    
    public SymbolHOC(String nombre, EnumTipoSymbol TipSimbolo, EnumBLTIN func){
        name = nombre;
        TipoSymbol = TipSimbolo;
        FuncPredef = func;
    }
    
    public void SetSymbol(String nombre, EnumTipoSymbol TipSimbolo, float valor){
        name = nombre;
        TipoSymbol = TipSimbolo;
        val = valor;
    }
    
    public void SetSymbol(String nombre, EnumTipoSymbol TipSimbolo, EnumBLTIN func){
        name = nombre;
        TipoSymbol = TipSimbolo;
        FuncPredef = func;
    }
}
