
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

package calculadorahoc2;

import java_cup.runtime.*;
import java.io.FileReader;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class AnalizadorSintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return AnalizadorSintacticoSym.class;
}

  /** Default constructor. */
  public AnalizadorSintactico() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\002\000\002\002\004\000\002\002" +
    "\003\000\002\002\005\000\002\002\006\000\002\003\005" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\005\000\002\004\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\016\002\001\005\001\011\001\013\005\015" +
    "\001\016\001\001\002\000\014\002\014\005\012\011\007" +
    "\015\006\016\010\001\002\000\014\002\uffff\005\uffff\011" +
    "\uffff\015\uffff\016\uffff\001\002\000\016\004\ufffb\005\ufffb" +
    "\006\ufffb\007\ufffb\012\ufffb\014\ufffb\001\002\000\012\005" +
    "\012\011\007\015\006\016\010\001\002\000\020\004\ufffa" +
    "\005\ufffa\006\ufffa\007\ufffa\010\030\012\ufffa\014\ufffa\001" +
    "\002\000\016\004\ufff9\005\ufff9\006\ufff9\007\ufff9\012\ufff9" +
    "\014\ufff9\001\002\000\012\005\012\011\007\015\006\016" +
    "\010\001\002\000\014\004\020\005\017\006\016\007\021" +
    "\014\015\001\002\000\004\002\000\001\002\000\016\002" +
    "\ufffe\005\ufffe\011\ufffe\013\026\015\ufffe\016\ufffe\001\002" +
    "\000\012\005\012\011\007\015\006\016\010\001\002\000" +
    "\012\005\012\011\007\015\006\016\010\001\002\000\012" +
    "\005\012\011\007\015\006\016\010\001\002\000\012\005" +
    "\012\011\007\015\006\016\010\001\002\000\016\004\ufff5" +
    "\005\ufff5\006\ufff5\007\ufff5\012\ufff5\014\ufff5\001\002\000" +
    "\016\004\ufff8\005\ufff8\006\016\007\021\012\ufff8\014\ufff8" +
    "\001\002\000\016\004\ufff7\005\ufff7\006\016\007\021\012" +
    "\ufff7\014\ufff7\001\002\000\016\004\ufff6\005\ufff6\006\ufff6" +
    "\007\ufff6\012\ufff6\014\ufff6\001\002\000\014\002\ufffd\005" +
    "\ufffd\011\ufffd\015\ufffd\016\ufffd\001\002\000\016\004\ufff3" +
    "\005\ufff3\006\ufff3\007\ufff3\012\ufff3\014\ufff3\001\002\000" +
    "\012\005\012\011\007\015\006\016\010\001\002\000\016" +
    "\004\020\005\017\006\016\007\021\012\ufffc\014\ufffc\001" +
    "\002\000\014\004\020\005\017\006\016\007\021\012\033" +
    "\001\002\000\016\004\ufff4\005\ufff4\006\ufff4\007\ufff4\012" +
    "\ufff4\014\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\031\000\004\002\003\001\001\000\006\003\010\004" +
    "\012\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\010\004\031\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\003\010\004\026\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\003\010\004" +
    "\024\001\001\000\006\003\010\004\023\001\001\000\006" +
    "\003\010\004\022\001\001\000\006\003\010\004\021\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\003\010\004\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalizadorSintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    HOC2JFrame frmInterfaz;
    Float variables[] = new Float[26];

    public void report_error(String mensaje, Object info){
        StringBuilder m = new StringBuilder("Error");
        if(info instanceof java_cup.runtime.Symbol){
            java_cup.runtime.Symbol s = (java_cup.runtime.Symbol) info;
            if(s.left >= 0){
                m.append(" en la linea "+(s.left+1));
                if(s.right >= 0)
                    m.append(", columna "+(s.right+1));
            }
        }
        m.append(" : "+mensaje);
        System.err.println(m);
    }

    public void report_fatal_error(String mssg, Object info){
        report_error(mssg, info);
        System.exit(1);
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$AnalizadorSintactico$actions {
  private final AnalizadorSintactico parser;

  /** Constructor */
  CUP$AnalizadorSintactico$actions(AnalizadorSintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action_part00000000(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintactico$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // list ::= 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintactico$parser.done_parsing();
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // list ::= ENTER 
            {
              Object RESULT =null;

              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // list ::= list expr SEMICOLON 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Float e = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		 frmInterfaz.PonerTextSintac(Float.toString(e)+"\n"); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // list ::= list expr SEMICOLON ENTER 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float e = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		 frmInterfaz.PonerTextSintac(Float.toString(e)+"\n"); 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("list",0, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-3)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // asgn ::= VAR ASIG expr 
            {
              Float RESULT =null;
		int indexleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int indexright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Integer index = (Integer)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float e = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 variables[index]=e; RESULT=e; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("asgn",1, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= NUM 
            {
              Float RESULT =null;
		int valNumleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int valNumright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float valNum = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=valNum; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= VAR 
            {
              Float RESULT =null;
		int indexleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int indexright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Integer index = (Integer)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=variables[index]; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= asgn 
            {
              Float RESULT =null;
		int valAsgnleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int valAsgnright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float valAsgn = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=valAsgn; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= expr opSUMA expr 
            {
              Float RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float e1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float e2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=e1+e2; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= expr opRESTA expr 
            {
              Float RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float e1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float e2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=e1-e2; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= expr opMULT expr 
            {
              Float RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float e1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float e2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=e1*e2; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= expr opDIV expr 
            {
              Float RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).right;
		Float e1 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float e2 = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=e1/e2; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= ParIzq expr ParDer 
            {
              Float RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).right;
		Float e = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)).value;
		 RESULT=e; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-2)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expr ::= opRESTA expr 
            {
              Float RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()).right;
		Float e = (Float)((java_cup.runtime.Symbol) CUP$AnalizadorSintactico$stack.peek()).value;
		 RESULT=-e; 
              CUP$AnalizadorSintactico$result = parser.getSymbolFactory().newSymbol("expr",2, ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.elementAt(CUP$AnalizadorSintactico$top-1)), ((java_cup.runtime.Symbol)CUP$AnalizadorSintactico$stack.peek()), RESULT);
            }
          return CUP$AnalizadorSintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorSintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintactico$do_action(
    int                        CUP$AnalizadorSintactico$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintactico$parser,
    java.util.Stack            CUP$AnalizadorSintactico$stack,
    int                        CUP$AnalizadorSintactico$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorSintactico$do_action_part00000000(
                               CUP$AnalizadorSintactico$act_num,
                               CUP$AnalizadorSintactico$parser,
                               CUP$AnalizadorSintactico$stack,
                               CUP$AnalizadorSintactico$top);
    }
}

}
