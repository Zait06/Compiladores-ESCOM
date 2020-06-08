package calculadorahoc4;

import java.util.*;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

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
    
    public void execute(int ind, JTextArea AreaResult, JTable jTablePila){
        InstrucProgram instruc;
        Datum op1,op2;
        String CadResult = new String();
        
        Object os[]=new Object[5];
        String TipDatum = new String();
        String Val = new String();
        String NombSymbol = new String();
        String TypeSymbol = new String();
        String ValSymbol = new String();
        
        DefaultTableModel modeloTablaPila = (DefaultTableModel) jTablePila.getModel();
        pc = ind;
        
        while(Prog[pc].Instruc != EnumInstrMaq.STOP){
            TipDatum = "";
            Val = "";
            NombSymbol = "";
            TypeSymbol = "";
            ValSymbol = "";
            
            instruc = Prog[pc++];
            switch(instruc.Instruc){
                case ADD:
                    op2 = stack.pop();
                    op1 = stack.pop();
                    op1.val += op2.val;
                    stack.push(op1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case ASSIGN:
                    op2 = stack.pop();
                    op1 = stack.pop();
                    op2.symb.val = op1.val;
                    op2.symb.TipoSymbol = EnumTipoSymbol.VAR;
                    stack.push(op1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case BLTIN:
                    instruc = Prog[pc++];
                    switch(instruc.func_BLTIN){
                        case ABS:
                            op1 = stack.pop();
                            op1.val = Math.abs(op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case ATAN:
                            op1 = stack.pop();
                            op1.val = (float) Math.atan((double) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case COS:
                            op1 = stack.pop();
                            op1.val = (float) Math.cos((double) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case EXP:
                            op1 = stack.pop();
                            op1.val = (float) Math.exp((double) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case INTEGER:
                            op1 = stack.pop();
                            op1.val = (float)((int) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case LOG10:
                            op1 = stack.pop();
                            op1.val = (float) Math.log10((double) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case LOG:
                            op1 = stack.pop();
                            op1.val = (float) Math.log((double) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case SIN:
                            op1 = stack.pop();
                            op1.val = (float) Math.sin((double) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                        case SQRT:
                            op1 = stack.pop();
                            op1.val = (float) Math.sqrt((double) op1.val);
                            stack.push(op1);
                            modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                            os[0] = (Object) "Val";
                            os[1] = (Object) op1.val;
                            os[2] = "";
                            os[3] = "";
                            os[4] = "";
                            modeloTablaPila.addRow(os);
                        break;
                    }
                break;
                case CONSTPUSH:
                    op1 = new Datum();
                    op1.val = Prog[pc++].symbolHoc.val;
                    stack.push(op1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                    jTablePila.repaint();
                break;
                case DIV:
                    op2 = stack.pop();
                    op1 = stack.pop();
                    op1.val /= op2.val;
                    stack.push(op1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case EVAL:
                    op2 = new Datum();
                    op1 = stack.pop();
                    op2.val = op1.symb.val;
                    stack.push(op2);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op2.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case MUL:
                    op2 = stack.pop();
                    op1 = stack.pop();
                    op1.val *= op2.val;
                    stack.push(op1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case NEGATE:
                    op1 = stack.pop();
                    op1.val = -op1.val;
                    stack.push(op1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case POWER:
                    op2 = stack.pop();
                    op1 = stack.pop();
                    double a = (double) op1.val;
                    double b = (double) op2.val;
                    op1.val = (float) Math.pow(a,b);
                    stack.push(op1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case PRINT:
                    op1 = stack.pop();
                    CadResult = Float.toString(op1.val)+"\n";
                    AreaResult.append(CadResult);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                break;
                case STOP:
                    return;
                case SUB:
                    op2 = stack.pop();
                    op1 = stack.pop();
                    op1.val -= op2.val;
                    stack.push(op1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    modeloTablaPila.removeRow(modeloTablaPila.getRowCount()-1);
                    os[0] = (Object) "Val";
                    os[1] = (Object) op1.val;
                    os[2] = "";
                    os[3] = "";
                    os[4] = "";
                    modeloTablaPila.addRow(os);
                break;
                case VARPUSH:
                    op1 = new Datum();
                    op1.symb = Prog[pc++].symbolHoc;
                    stack.push(op1);
                    os[0] = (Object) "SYMBOL";
                    os[1] = (Object) "";
                    os[2] = op1.symb.name;
                    os[3] = op1.symb.TipoSymbol;
                    os[4] = op1.symb.val;
                    modeloTablaPila.addRow(os);
                break;
            }
        }
    }
}
