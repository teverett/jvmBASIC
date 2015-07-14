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
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.DefaultRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.absfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.addingExpressionRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.atnfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.cosfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.datastmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.dimstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.endstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.exponentExpressionRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.forstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.gosubstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.gotostmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.ifstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.includestmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.inputstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.intfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.leftfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.lenfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.linenumberRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.logfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.midfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.multiplyingExpressionRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.printRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.printlistRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.progRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.readstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.relationalExpressionRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.restorestmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.returnstmtRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.rightfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.rndfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.sinfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.sqrfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.strfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.tanfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.valfuncRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.vardeclRule;
import com.khubla.jvmbasic.jvmbasicc.function.impl.rule.variableassignmentRule;
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
      ruleFunctions.put(jvmBasicParser.RULE_printlist, new printlistRule());
      ruleFunctions.put(jvmBasicParser.RULE_expression, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_relationalExpression, new relationalExpressionRule());
      ruleFunctions.put(jvmBasicParser.RULE_addingExpression, new addingExpressionRule());
      ruleFunctions.put(jvmBasicParser.RULE_multiplyingExpression, new multiplyingExpressionRule());
      ruleFunctions.put(jvmBasicParser.RULE_exponentExpression, new exponentExpressionRule());
      ruleFunctions.put(jvmBasicParser.RULE_signExpression, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_func, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_letstmt, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_variableassignment, new variableassignmentRule());
      ruleFunctions.put(jvmBasicParser.RULE_vardecl, new vardeclRule());
      ruleFunctions.put(jvmBasicParser.RULE_var, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_varname, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_exprlist, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_ifstmt, new ifstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_liststmt, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_relop, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_cosfunc, new cosfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_atnfunc, new atnfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_logfunc, new logfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_sinfunc, new sinfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_tanfunc, new tanfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_sqrfunc, new sqrfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_absfunc, new absfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_lenfunc, new lenfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_leftfunc, new leftfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_rightfunc, new rightfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_midfunc, new midfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_rndfunc, new rndfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_intfunc, new intfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_strfunc, new strfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_valfunc, new valfuncRule());
      ruleFunctions.put(jvmBasicParser.RULE_includestmt, new includestmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_inputstmt, new inputstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_datastmt, new datastmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_varlist, new DefaultRule());
      ruleFunctions.put(jvmBasicParser.RULE_dimstmt, new dimstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_gotostmt, new gotostmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_gosubstmt, new gosubstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_endstmt, new endstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_returnstmt, new returnstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_readstmt, new readstmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_restorestmt, new restorestmtRule());
      ruleFunctions.put(jvmBasicParser.RULE_forstmt, new forstmtRule());
   }

   private void populateTokenRegistry() {
      tokenFunctions.put(jvmBasicParser.EQ, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.PRINT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.QUESTION, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.COMMENT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.STRINGLITERAL, new STRINGLITERALToken());
      tokenFunctions.put(jvmBasicParser.NUMBER, new NUMBERToken());
      tokenFunctions.put(jvmBasicLexer.PLUS, new DefaultToken());
      tokenFunctions.put(jvmBasicLexer.MINUS, new DefaultToken());
      tokenFunctions.put(jvmBasicLexer.EXPONENT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.TIMES, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.CR, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LETTERS, new LETTERSToken());
      tokenFunctions.put(jvmBasicParser.FOR, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.NEXT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.TO, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.STEP, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.END, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RND, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LPAREN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RPAREN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.INPUT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.COMMA, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.IF, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.GT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.THEN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LTE, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.GTE, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.DIM, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.ABS, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.DIV, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.SEMICOLON, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.COLON, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.GOTO, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.SQR, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LEN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.SIN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.COS, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.TAN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.ATN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LOG, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.EXP, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.INTF, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.GOSUB, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RETURN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.MID, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LEFT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RIGHT, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.STR, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.VAL, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.DATA, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.READ, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RESTORE, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.SPC, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.FLOAT, new FLOATToken());
      tokenFunctions.put(jvmBasicParser.VTAB, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.HTAB, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.CALL, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.INCLUDE, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.CLEAR, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LET, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.LIST, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.RUN, new DefaultToken());
      tokenFunctions.put(jvmBasicParser.REM, new DefaultToken());
   }
}
