package com.khubla.jvmbasic.jvmbasicc.function;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.util.Hashtable;

import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicLexer;
import com.khubla.jvmbasic.jvmbasicc.antlr.jvmBasicParser;
import com.khubla.jvmbasic.jvmbasicc.function.impl.ABSFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.ATANFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.CALLFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.COLONFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.COMMAFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.COSFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.CRFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.DATAFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.DIMFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.DIVFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.ENDFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.EQFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.EXPFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.FLOATFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.FORFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GOSUBFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GOTOFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GTEFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.HTABFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.IFFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.INCLUDEFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.INPUTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.INTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LEFTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LENFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LETFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LETTERSFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LOGFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LPARENFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LTEFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.MIDFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.MINUSFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.NEQFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.NEXTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.NUMBERFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.PLUSFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.PRINTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.READFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.REMFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RESTOREFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RETURNFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RIGHTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RNDFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RPARENFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.SEMICOLONFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.SINFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.SPCFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.SQRFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.STEPFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.STRFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.STRINGLITERALFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.TANFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.THENFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.TIMESFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.TOFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.VALFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.VTABFunction;

/**
 * @author tome
 */
public class FunctionRegistry {
   /**
    * instance
    */
   private static FunctionRegistry functionRegistry = null;

   public static FunctionRegistry getInstance() {
      if (null == functionRegistry) {
         functionRegistry = new FunctionRegistry();
      }
      return functionRegistry;
   }

   /**
    * hash of all functions
    */
   private final Hashtable<String, Function> functions = new Hashtable<String, Function>();

   /**
    * ctor
    */
   private FunctionRegistry() {
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.REM], new REMFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.PRINT], new PRINTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.STRINGLITERAL], new STRINGLITERALFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.NUMBER], new NUMBERFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.PLUS], new PLUSFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.TIMES], new TIMESFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.CR], new CRFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LET], new LETFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.EQ], new EQFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LETTERS], new LETTERSFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.FOR], new FORFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.NEXT], new NEXTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.TO], new TOFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.STEP], new STEPFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.END], new ENDFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.RND], new RNDFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LPAREN], new LPARENFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.RPAREN], new RPARENFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.INPUT], new INPUTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.COMMA], new COMMAFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.IF], new IFFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LT], new LTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.GT], new GTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.THEN], new THENFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LTE], new LTEFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.GTE], new GTEFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.DIM], new DIMFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.ABS], new ABSFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.MINUS], new MINUSFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.DIV], new DIVFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.SEMICOLON], new SEMICOLONFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.COLON], new COLONFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.GOTO], new GOTOFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.SQR], new SQRFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LEN], new LENFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.SIN], new SINFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.COS], new COSFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.TAN], new TANFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.ATN], new ATANFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LOG], new LOGFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.EXP], new EXPFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.INTF], new INTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.GOSUB], new GOSUBFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.RETURN], new RETURNFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.MID], new MIDFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.LEFT], new LEFTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.RIGHT], new RIGHTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.STR], new STRFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.VAL], new VALFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.DATA], new DATAFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.READ], new READFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.RESTORE], new RESTOREFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.QUESTION], new PRINTFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.SPC], new SPCFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.FLOAT], new FLOATFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.VTAB], new VTABFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.HTAB], new HTABFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.CALL], new CALLFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.NEQ], new NEQFunction());
      functions.put(jvmBasicParser.tokenNames[jvmBasicLexer.INCLUDE], new INCLUDEFunction());
   }

   /**
    * get
    */
   public Function getFunction(String name) throws Exception {
      if (functions.containsKey(name)) {
         return functions.get(name);
      } else {
         throw new Exception("Unknown function '" + name + "'");
      }
   }
}
