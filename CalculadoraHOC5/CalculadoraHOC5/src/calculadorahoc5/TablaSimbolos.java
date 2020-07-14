package calculadorahoc5;

import java.util.*;

public class TablaSimbolos {
    List<SymbolHOC> ListaSimbolos;
    
    public TablaSimbolos(){
        ListaSimbolos = new LinkedList<>();
        ListaSimbolos.clear();
    }
    
    public SymbolHOC lookup(String name){
        SymbolHOC s;
        Iterator it = ListaSimbolos.iterator();
        while(it.hasNext()){
            s = (SymbolHOC) it.next();
            if(s.name.equals(name))
                return s;
        }
        return null;
    }
    
    public SymbolHOC install(String name, EnumTipoSymbol type, float val){
        SymbolHOC s;
        s = new SymbolHOC();
        s.SetSymbol(name, type, val);
        ListaSimbolos.add(s);
        return s;
    }
    
    public SymbolHOC install(String name, EnumTipoSymbol type, EnumBLTIN funcPredef){
        SymbolHOC s;
        s = new SymbolHOC();
        s.SetSymbol(name, type, funcPredef);
        ListaSimbolos.add(s);
        return s;
    }
    
    public void init(){
        ListaSimbolos.clear();
        InitConstPredef();
        InitFuncPredef();
    }
    
    private void InitConstPredef(){
        SymbolHOC s;
        float val;
        
        s = new SymbolHOC();
        val = (float) Math.PI;
        s.SetSymbol("PI",EnumTipoSymbol.CONST_PREDEF,val);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        val = (float) Math.E;
        s.SetSymbol("E",EnumTipoSymbol.CONST_PREDEF,val);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        val = (float) 0.577215664901;
        s.SetSymbol("GAMMA",EnumTipoSymbol.CONST_PREDEF,val);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        val = (float) 57.2957795130;
        s.SetSymbol("DEG",EnumTipoSymbol.CONST_PREDEF,val);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        val = (float) 1.6180334989;
        s.SetSymbol("PHI",EnumTipoSymbol.CONST_PREDEF,val);
        ListaSimbolos.add(s);
    }
    
    private void InitFuncPredef(){
        SymbolHOC s;
        
        s = new SymbolHOC();
        s.SetSymbol("sin", EnumTipoSymbol.BLTIN, EnumBLTIN.SIN);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("cos", EnumTipoSymbol.BLTIN, EnumBLTIN.COS);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("atan", EnumTipoSymbol.BLTIN, EnumBLTIN.ATAN);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("log", EnumTipoSymbol.BLTIN, EnumBLTIN.LOG);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("log10", EnumTipoSymbol.BLTIN, EnumBLTIN.LOG10);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("exp", EnumTipoSymbol.BLTIN, EnumBLTIN.EXP);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("sqrt", EnumTipoSymbol.BLTIN, EnumBLTIN.SQRT);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("int", EnumTipoSymbol.BLTIN, EnumBLTIN.INTEGER);
        ListaSimbolos.add(s);
        
        s = new SymbolHOC();
        s.SetSymbol("abs", EnumTipoSymbol.BLTIN, EnumBLTIN.ABS);
        ListaSimbolos.add(s);
    }
}
