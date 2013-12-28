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
import com.khubla.jvmbasic.jvmbasicc.function.impl.COSFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.DATAFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.DIMFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.DIVFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.ENDFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.FORFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GOSUBFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GOTOFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GTEFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.GTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.INCLUDEFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.INPUTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.INTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LEFTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LENFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LOGFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LTEFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.LTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.MIDFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.MINUSFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.NEXTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.READFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RESTOREFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RETURNFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RIGHTFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.RNDFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.SEMICOLONFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.SINFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.SQRFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.STEPFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.STRFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.TANFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.VALFunction;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.DefaultRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.addingExpressionRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.exponentExpressionRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.ifstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.linenumberRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.multiplyingExpressionRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.printRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.progRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.variableassignmentRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.varnameRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.token.DefaultToken;
import com.khubla.jvmbasic.jvmbasicc.function.impl.token.FLOATToken;
import com.khubla.jvmbasic.jvmbasicc.function.impl.token.LETTERSToken;
import com.khubla.jvmbasic.jvmbasicc.function.impl.token.NUMBERToken;
import com.khubla.jvmbasic.jvmbasicc.function.impl.token.STRINGLITERALToken;

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
    * hash of token functions
    */
   private final Hashtable<Integer, Function> tokenFunctions = new Hashtable<Integer, Function>();
   /**
    * hash of rule functions
    */
   private final Hashtable<Integer, Function> ruleFunctions = new Hashtable<Integer, Function>();

   /**
    * ctor
    */
   private FunctionRegistry() {
      populateTokenRegistry();
      populateRuleRegistry();
   }

   public Function getRuleFunction(int id) throws Exception {
      if (ruleFunctions.containsKey(id)) {
         return ruleFunctions.get(id);
      } else {
         throw new Exception("Unknown rule function '" + jvmBasicParser.ruleNames[id] + " (" + id + ")'");
      }
   }

   /**
    * get
    */
   public Function getTokenFunction(int id) throws Exception {
      if (tokenFunctions.containsKey(id)) {
         return tokenFunctions.get(id);
      } else {
         throw new Exception("Unknown token function '" + jvmBasicParser.tokenNames[id] + " (" + id + ")'  ");
      }
   }

   private void populateRuleRegistry() {
      ruleFunctions.put(jvmBasicParser.RULE_prog, new progRule());
      ruleFunctions.put(jvmBasicParser.RULE_amprstmt, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_line, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_linenumber, new linenumberRule());
      ruleFunctions.put(jvmBasicParser.RULE_statement, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_printstmt1, new printRule());
      ruleFunctions.put(jvmBasicParser.RULE_printlist, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_expression, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_relationalExpression, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_addingExpression, new addingExpressionRule());
      ruleFunctions.put(jvmBasicParser.RULE_multiplyingExpression, new multiplyingExpressionRule());
      ruleFunctions.put(jvmBasicParser.RULE_exponentExpression, new exponentExpressionRule());
      ruleFunctions.put(jvmBasicParser.RULE_signExpression, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_func, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_letstmt, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_variableassignment, new variableassignmentRule());
      ruleFunctions.put(jvmBasicParser.RULE_vardecl, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_var, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_varname, new varnameRule());
      ruleFunctions.put(jvmBasicParser.RULE_exprlist, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_ifstmt, new ifstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_liststmt, new DefaultRule());
   }

   private void populateTokenRegistry() {
      tokenFunctions.put(jvmBasicParser.EQ, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.PRINT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.QUESTION, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.COMMENT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.STRINGLITERAL, new STRINGLITERALToken());
      tokenFunctions.put(jvmBasicParser.NUMBER, new NUMBERToken());
      tokenFunctions.put(jvmBasicLexer.PLUS, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.TIMES, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.CR, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LETTERS, new LETTERSToken());
      tokenFunctions.put(jvmBasicParser.FOR, new FORFunction());
      tokenFunctions.put(jvmBasicParser.NEXT, new NEXTFunction());
      tokenFunctions.put(jvmBasicParser.TO, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.STEP, new STEPFunction());
      tokenFunctions.put(jvmBasicParser.END, new ENDFunction());
      tokenFunctions.put(jvmBasicParser.RND, new RNDFunction());
      tokenFunctions.put(jvmBasicParser.LPAREN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RPAREN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.INPUT, new INPUTFunction());
      tokenFunctions.put(jvmBasicParser.COMMA, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.IF, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LT, new LTFunction());
      tokenFunctions.put(jvmBasicParser.GT, new GTFunction());
      tokenFunctions.put(jvmBasicParser.THEN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LTE, new LTEFunction());
      tokenFunctions.put(jvmBasicParser.GTE, new GTEFunction());
      tokenFunctions.put(jvmBasicParser.DIM, new DIMFunction());
      tokenFunctions.put(jvmBasicParser.ABS, new ABSFunction());
      tokenFunctions.put(jvmBasicParser.MINUS, new MINUSFunction());
      tokenFunctions.put(jvmBasicParser.DIV, new DIVFunction());
      tokenFunctions.put(jvmBasicParser.SEMICOLON, new SEMICOLONFunction());
      tokenFunctions.put(jvmBasicParser.COLON, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.GOTO, new GOTOFunction());
      tokenFunctions.put(jvmBasicParser.SQR, new SQRFunction());
      tokenFunctions.put(jvmBasicParser.LEN, new LENFunction());
      tokenFunctions.put(jvmBasicParser.SIN, new SINFunction());
      tokenFunctions.put(jvmBasicParser.COS, new COSFunction());
      tokenFunctions.put(jvmBasicParser.TAN, new TANFunction());
      tokenFunctions.put(jvmBasicParser.ATN, new ATANFunction());
      tokenFunctions.put(jvmBasicParser.LOG, new LOGFunction());
      tokenFunctions.put(jvmBasicParser.EXP, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.INTF, new INTFunction());
      tokenFunctions.put(jvmBasicParser.GOSUB, new GOSUBFunction());
      tokenFunctions.put(jvmBasicParser.RETURN, new RETURNFunction());
      tokenFunctions.put(jvmBasicParser.MID, new MIDFunction());
      tokenFunctions.put(jvmBasicParser.LEFT, new LEFTFunction());
      tokenFunctions.put(jvmBasicParser.RIGHT, new RIGHTFunction());
      tokenFunctions.put(jvmBasicParser.STR, new STRFunction());
      tokenFunctions.put(jvmBasicParser.VAL, new VALFunction());
      tokenFunctions.put(jvmBasicParser.DATA, new DATAFunction());
      tokenFunctions.put(jvmBasicParser.READ, new READFunction());
      tokenFunctions.put(jvmBasicParser.RESTORE, new RESTOREFunction());
      tokenFunctions.put(jvmBasicParser.SPC, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.FLOAT, new FLOATToken());
      tokenFunctions.put(jvmBasicParser.VTAB, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.HTAB, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.CALL, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.INCLUDE, new INCLUDEFunction());
      tokenFunctions.put(jvmBasicParser.CLEAR, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LET, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LIST, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RUN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.REM, new DefaultToken());
   }
}
