package calculadorahoc4;

import java_cup.runtime.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class HOC4JFrame extends javax.swing.JFrame {

    AnalizadorSintactico Sintac;
    /**
     * Creates new form HOC4JFrame
     */
    public HOC4JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonSalir = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLexico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSintactico = new javax.swing.JTextArea();
        BotonLexico = new javax.swing.JButton();
        BotonSintactico = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaCodigo = new javax.swing.JTable();
        BotonEjecutar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        txtLexico.setColumns(20);
        txtLexico.setRows(5);
        jScrollPane2.setViewportView(txtLexico);

        txtSintactico.setColumns(20);
        txtSintactico.setRows(5);
        jScrollPane3.setViewportView(txtSintactico);

        BotonLexico.setText("Analizar Lexicamente");
        BotonLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLexicoActionPerformed(evt);
            }
        });

        BotonSintactico.setText("Analizar Sintacticamente");
        BotonSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSintacticoActionPerformed(evt);
            }
        });

        TablaCodigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "INST-SYMB-FUNC", "NAME", "VAR", "FUNTION"
            }
        ));
        jScrollPane5.setViewportView(TablaCodigo);

        BotonEjecutar.setText("Ejecutar");
        BotonEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEjecutarActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane6.setViewportView(txtResultado);

        jLabel1.setText("Operaciones");

        jLabel2.setText("Analisis Lexico");

        jLabel3.setText("Analisis Sintactico");

        jLabel4.setText("Codigo");

        jLabel5.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonLexico)))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonSintactico))
                                .addComponent(jScrollPane3)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addComponent(BotonLimpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonSalir)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonEjecutar)))
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonEjecutar)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonLexico)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotonSalir)
                                    .addComponent(BotonLimpiar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonSintactico, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSintacticoActionPerformed
        String cadAux = new String();
        InstrucProgram instruc;
        AnalizadorLexico Lexic = null;
        
        String CadInst = new String();
        String Name = new String();
        String Valor = new String();
        String ptrFunc = new String();
        Object os[] = new Object[4];
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaCodigo.getModel();
        
        try{
            Lexic = new AnalizadorLexico(new FileReader("./ArchEntrada.txt"));
        }catch(FileNotFoundException ex){
            Logger.getLogger(HOC4JFrame.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        modeloTabla.setRowCount(0);
        
        try{
            Sintac = new AnalizadorSintactico(Lexic);
            Sintac.frmInterfaz = this;
            Sintac.maquinaHoc4 = new MaquinaHOC4();
            Lexic.maqHOC = Sintac.maquinaHoc4;
            
            SymbolHOC s;
            Iterator it= Lexic.maqHOC.TabSimb.ListaSimbolos.iterator();
            /*while(it.hasNext()){
                s = (SymbolHOC) it.next();
            }*/
            Object result = Sintac.parse().value;
            InstrucProgram ins2 =  new InstrucProgram();
            ins2.TipInstr = EnumTipoInstr.INSTRUC;
            ins2.Instruc = EnumInstrMaq.STOP;
            Sintac.maquinaHoc4.code(ins2);
            
            for(int i=0;i<Sintac.maquinaHoc4.progp;i++){
                instruc = Sintac.maquinaHoc4.Prog[i];
                cadAux = "----ERROR----";
                CadInst = "";
                Name = "";
                Valor = "";
                ptrFunc = "";
                switch(instruc.TipInstr){
                    case INSTRUC:
                        switch(instruc.Instruc){
                            case ADD:
                                cadAux = "instruc ADD";
                                CadInst = "ADD";
                            break;
                            case ASSIGN:
                                cadAux = "instruc ASSGN";
                                CadInst = "ASSIGN";
                            break;
                            case BLTIN:
                                cadAux = "instruc BLTIN";
                                CadInst = "BLTIN";
                            break;
                            case EVAL:
                                cadAux = "instruc EVAL";
                                CadInst = "EVAL";
                            break;
                            case SUB:
                                cadAux = "instruc SUB";
                                CadInst = "SUB";
                            break;
                            case MUL:
                                cadAux = "instruc MUL";
                                CadInst = "MUL";
                            break;
                            case DIV:
                                cadAux = "instruc DIV";
                                CadInst = "DIV";
                            break;
                            case NEGATE:
                                cadAux = "instruc NEGATE";
                                CadInst = "NEGATE";
                            break;
                            case POWER:
                                cadAux = "instruc POWER";
                                CadInst = "POWER";
                            break;
                            case VARPUSH:
                                cadAux = "instruc VARPUSH";
                                CadInst = "VARPUSH";
                            break;
                            case CONSTPUSH:
                                cadAux = "instruc CONSTPUSH";
                                CadInst = "CONSTPUSH";
                            break;
                            case PRINT:
                                cadAux = "instruc PRINT";
                                CadInst = "PRINT";
                            break;
                            case STOP:
                                cadAux = "instruc STOP";
                                CadInst = "STOP";
                            break;
                        }
                        cadAux+='\n';
                        txtSintactico.append(cadAux);
                    break;
                    case BLTIN:
                        switch(instruc.func_BLTIN){
                            case SIN:
                                cadAux = "bltin SIN";
                                Name = "sin";
                                ptrFunc = "SIN";
                            break;
                            case COS:
                                cadAux = "bltin COS";
                                Name = "cos";
                                ptrFunc = "COS";
                            break;
                            case ATAN:
                                cadAux = "bltin ATAN";
                                Name = "atan";
                                ptrFunc = "ATAN";
                            break;
                            case LOG:
                                cadAux = "bltin LOG";
                                Name = "log";
                                ptrFunc = "LOG";
                            break;
                            case LOG10:
                                cadAux = "bltin LOG10";
                                Name = "log10";
                                ptrFunc = "LOG10";
                            break;
                            case EXP:
                                cadAux = "bltin EXP";
                                Name = "exp";
                                ptrFunc = "EXP";
                            break;
                            case SQRT:
                                cadAux = "bltin SQRT";
                                Name = "sqrt";
                                ptrFunc = "SQRT";
                            break;
                            case INTEGER:
                                cadAux = "bltin INTEGER";
                                Name = "int";
                                ptrFunc = "INTEGER";
                            break;
                            case ABS:
                                cadAux = "bltin ABS";
                                Name = "abs";
                                ptrFunc = "ABS";
                            break;
                        }
                        cadAux+='\n';
                        txtSintactico.append(cadAux);
                    break;
                    case SYMBOL:
                        cadAux = "Symbol name: "+instruc.symbolHoc.name+
                                 " val = "+Float.toString(instruc.symbolHoc.val);
                        cadAux += "\n";
                        txtSintactico.append(cadAux);
                        switch(instruc.symbolHoc.TipoSymbol){
                            case VAR:
                                CadInst = "VAR";
                                Name = instruc.symbolHoc.name;
                                Valor = Float.toString(instruc.symbolHoc.val);
                                ptrFunc = "";
                            break;
                            case UNDEF:
                                CadInst = "UNDEF";
                                Name = instruc.symbolHoc.name;
                                Valor = "---";
                                ptrFunc = "";
                            break;
                            case CONST_NUM:
                                CadInst = "CONST_NUM";
                                Name = instruc.symbolHoc.name;
                                Valor = Float.toString(instruc.symbolHoc.val);
                                ptrFunc = "";
                            break;
                            case CONST_PREDEF:
                                CadInst = "CONST_PREDEF";
                                Name = instruc.symbolHoc.name;
                                Valor = Float.toString(instruc.symbolHoc.val);
                                ptrFunc = "";
                            break;
                        }
                    break;
                }
                os[0] = (Object) CadInst;
                os[1] = (Object) Name;
                os[2] = (Object) Valor;
                os[3] = (Object) ptrFunc;
                modeloTabla.addRow(os);
            }
            txtSintactico.append("\nFin de analisis sintactico\n");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_BotonSintacticoActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
        txtArea.setText("");
        txtLexico.setText("");
        txtSintactico.setText("");
        txtResultado.setText("");
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaCodigo.getModel();
        for (int i = 0; i < TablaCodigo.getRowCount(); i++) {
            modeloTabla.removeRow(i);
            i-=1;
        }
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLexicoActionPerformed
        Symbol simb;
        String Lexema = new String();
        String CadAux = new String();
        File ArchEntrada = new File("./ArchEntrada.txt");
        PrintWriter escribir;

        try{
            escribir = new PrintWriter(ArchEntrada);
            escribir.print(txtArea.getText());
            escribir.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(HOC4JFrame.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        // System.out.println("Eco");
        
        try{
            Reader lector;
            lector = new BufferedReader(new FileReader("./ArchEntrada.txt"));
            
            AnalizadorLexico AnalysLex = new AnalizadorLexico(lector);
            AnalysLex.maqHOC = new MaquinaHOC4();
            
            do{
                simb = AnalysLex.next_token();
                CadAux = Integer.toString(simb.sym);
                Lexema = AnalysLex.yytext();
                if(simb.sym == AnalizadorSintacticoSym.EOF)
                    CadAux = "Token: "+CadAux+"\tIdentToken: FIN\n";
                else{
                    switch(simb.sym){
                        case AnalizadorSintacticoSym.SEMICOLON:
                            CadAux = "Token: "+CadAux+"\tIdentToken: SEMICOLON\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.ENTER:
                            CadAux = "Token: "+CadAux+"\tIdentToken: Enter\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.NUM:
                            CadAux = "Token: "+CadAux+"\tIdentToken: NUM\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.opSUMA:
                            CadAux = "Token: "+CadAux+"\tIdentToken: SUMA\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.opRESTA:
                            CadAux = "Token: "+CadAux+"\tIdentToken: RESTA\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.opMULT:
                            CadAux = "Token: "+CadAux+"\tIdentToken: MULT\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.opDIV:
                            CadAux = "Token: "+CadAux+"\tIdentToken: DIV\t\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.ASIG:
                            CadAux = "Token: "+CadAux+"\tIdentToken: ASIG\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.ParIzq:
                            CadAux = "Token: "+CadAux+"\tIdentToken: ParIzq\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.ParDer:
                            CadAux = "Token: "+CadAux+"\tIdentToken: ParDer\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.error:
                            CadAux = "Token: "+CadAux+"\tIdentToken: error\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.POW:
                            CadAux = "Token: "+CadAux+"\tIdentToken: POW\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.BLTIN:
                            CadAux = "Token: "+CadAux+"\tIdentToken: BLTIN\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.CONST_PRED:
                            CadAux = "Token: "+CadAux+"\tIdentToken: CONST_PRED\t Lexema: "+Lexema+"\n";
                        break;
                        case AnalizadorSintacticoSym.VAR:
                            CadAux = "Token: "+CadAux+"\tIdentToken: VAR\t Lexema: "+Lexema+"\n";
                        break;
                        default:
                            CadAux = "Token: "+CadAux+"\tIdentToken: OTRO\t Lexema: "+AnalysLex.yytext()+"\n";
                        break;
                    }
                }
                txtLexico.append(CadAux);
            }while(simb.sym != AnalizadorSintacticoSym.EOF);
        }catch(IOException ex){
            txtLexico.append("Entro\' al catch");
            Logger.getLogger(HOC4JFrame.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_BotonLexicoActionPerformed

    private void BotonEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEjecutarActionPerformed
        Object os[] = new Object[5];
        DefaultTableModel modeloPila = (DefaultTableModel) jTable1.getModel();
        modeloPila.setNumRows(0);
        String Cad1 = new String();
        String Cad2 = new String();
        String Cad3 = new String();
        String Cad4 = new String();
        String Cad5 = new String();
        txtResultado.setText("");
        os[0] = Cad1;
        os[1] = Cad2;
        os[2] = Cad3;
        os[3] = Cad4;
        os[4] = Cad5;
        modeloPila.addRow(os);
        modeloPila.addRow(os);
        modeloPila.addRow(os);
        modeloPila.addRow(os);
        modeloPila.fireTableDataChanged();
        Sintac.maquinaHoc4.execute(0, txtResultado, jTable1);
    }//GEN-LAST:event_BotonEjecutarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEjecutar;
    private javax.swing.JButton BotonLexico;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSintactico;
    private javax.swing.JTable TablaCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextArea txtLexico;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtSintactico;
    // End of variables declaration//GEN-END:variables
}
