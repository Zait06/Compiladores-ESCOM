package calculadorahoc4;

import java.util.*;

public class MaquinaHOC4 {
    TablaSimbolos TabSimb;
    InstrucProgram Prog[];
    int progp = 0;
    int pc;
    Stack<Datum> stack;
    
    public MaquinaHOC4(){
        TabSimb = new TablaSimbolos();
        TabSimb.init();
        Prog = new InstrucProgram[2048];
        progp = 0;
        pc = 0 ;
        
        stack = new Stack();
        stack.clear();
    }
    
    public void initcode(){
        progp = 0;
        stack.clear();
    }
    
    public Integer code(InstrucProgram inst){
        Integer oprogp = progp;
        Prog[progp++] = inst;
        return oprogp;
    }
    
    public Integer code2(InstrucProgram inst1,InstrucProgram inst2){
        Integer oprogp = progp;
        Prog[progp++] = inst1;
        Prog[progp++] = inst2;
        return oprogp;
    }
    
    public Integer code3(InstrucProgram inst1,InstrucProgram inst2,InstrucProgram inst3){
        Integer oprogp = progp;
        Prog[progp++] = inst1;
        Prog[progp++] = inst2;
        Prog[progp++] = inst3;
        return oprogp;
    }
}
