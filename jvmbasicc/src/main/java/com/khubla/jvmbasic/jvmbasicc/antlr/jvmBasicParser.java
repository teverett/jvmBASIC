// Generated from com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g4 by ANTLR 4.1
package com.khubla.jvmbasic.jvmbasicc.antlr;

import java.util.List;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class jvmBasicParser extends Parser {
   public static class AbsfuncContext extends ParserRuleContext {
      public AbsfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode ABS() {
         return getToken(jvmBasicParser.ABS, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterAbsfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitAbsfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_absfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class AddingExpressionContext extends ParserRuleContext {
      public AddingExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterAddingExpression(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitAddingExpression(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_addingExpression;
      }

      public List<TerminalNode> MINUS() {
         return getTokens(jvmBasicParser.MINUS);
      }

      public TerminalNode MINUS(int i) {
         return getToken(jvmBasicParser.MINUS, i);
      }

      public List<MultiplyingExpressionContext> multiplyingExpression() {
         return getRuleContexts(MultiplyingExpressionContext.class);
      }

      public MultiplyingExpressionContext multiplyingExpression(int i) {
         return getRuleContext(MultiplyingExpressionContext.class, i);
      }

      public List<TerminalNode> PLUS() {
         return getTokens(jvmBasicParser.PLUS);
      }

      public TerminalNode PLUS(int i) {
         return getToken(jvmBasicParser.PLUS, i);
      }
   }

   public static class AmperoperContext extends ParserRuleContext {
      public AmperoperContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode AMPERSAND() {
         return getToken(jvmBasicParser.AMPERSAND, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterAmperoper(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitAmperoper(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_amperoper;
      }
   }

   public static class AmprstmtContext extends ParserRuleContext {
      public AmprstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AmperoperContext amperoper() {
         return getRuleContext(AmperoperContext.class, 0);
      }

      public TerminalNode COMMENT() {
         return getToken(jvmBasicParser.COMMENT, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterAmprstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitAmprstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_amprstmt;
      }

      public TerminalNode REM() {
         return getToken(jvmBasicParser.REM, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }
   }

   public static class AmptstmtContext extends ParserRuleContext {
      public AmptstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode AMPERSAND() {
         return getToken(jvmBasicParser.AMPERSAND, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterAmptstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitAmptstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_amptstmt;
      }
   }

   public static class AscfuncContext extends ParserRuleContext {
      public AscfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode ASC() {
         return getToken(jvmBasicParser.ASC, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterAscfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitAscfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ascfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class AtnfuncContext extends ParserRuleContext {
      public AtnfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode ATN() {
         return getToken(jvmBasicParser.ATN, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterAtnfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitAtnfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_atnfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class CallstmtContext extends ParserRuleContext {
      public CallstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode CALL() {
         return getToken(jvmBasicParser.CALL, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterCallstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitCallstmt(this);
         }
      }

      public ExprlistContext exprlist() {
         return getRuleContext(ExprlistContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_callstmt;
      }
   }

   public static class ChrfuncContext extends ParserRuleContext {
      public ChrfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode CHR() {
         return getToken(jvmBasicParser.CHR, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterChrfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitChrfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_chrfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class ColorstmtContext extends ParserRuleContext {
      public ColorstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COLOR() {
         return getToken(jvmBasicParser.COLOR, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterColorstmt(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitColorstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_colorstmt;
      }
   }

   public static class CosfuncContext extends ParserRuleContext {
      public CosfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COS() {
         return getToken(jvmBasicParser.COS, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterCosfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitCosfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_cosfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class DatastmtContext extends ParserRuleContext {
      public DatastmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      public TerminalNode DATA() {
         return getToken(jvmBasicParser.DATA, 0);
      }

      public List<DatumContext> datum() {
         return getRuleContexts(DatumContext.class);
      }

      public DatumContext datum(int i) {
         return getRuleContext(DatumContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterDatastmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitDatastmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_datastmt;
      }
   }

   public static class DatumContext extends ParserRuleContext {
      public DatumContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterDatum(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitDatum(this);
         }
      }

      public TerminalNode FLOAT() {
         return getToken(jvmBasicParser.FLOAT, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_datum;
      }

      public TerminalNode NUMBER() {
         return getToken(jvmBasicParser.NUMBER, 0);
      }

      public TerminalNode STRINGLITERAL() {
         return getToken(jvmBasicParser.STRINGLITERAL, 0);
      }
   }

   public static class DefstmtContext extends ParserRuleContext {
      public DefstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode DEF() {
         return getToken(jvmBasicParser.DEF, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterDefstmt(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitDefstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public TerminalNode FN() {
         return getToken(jvmBasicParser.FN, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_defstmt;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public List<VarContext> var() {
         return getRuleContexts(VarContext.class);
      }

      public VarContext var(int i) {
         return getRuleContext(VarContext.class, i);
      }
   }

   public static class DimstmtContext extends ParserRuleContext {
      public DimstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode DIM() {
         return getToken(jvmBasicParser.DIM, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterDimstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitDimstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_dimstmt;
      }

      public VarlistContext varlist() {
         return getRuleContext(VarlistContext.class, 0);
      }
   }

   public static class DrawstmtContext extends ParserRuleContext {
      public DrawstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode AT() {
         return getToken(jvmBasicParser.AT, 0);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      public TerminalNode DRAW() {
         return getToken(jvmBasicParser.DRAW, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterDrawstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitDrawstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_drawstmt;
      }
   }

   public static class EndstmtContext extends ParserRuleContext {
      public EndstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode END() {
         return getToken(jvmBasicParser.END, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterEndstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitEndstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_endstmt;
      }
   }

   public static class ExpfuncContext extends ParserRuleContext {
      public ExpfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterExpfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitExpfunc(this);
         }
      }

      public TerminalNode EXP() {
         return getToken(jvmBasicParser.EXP, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_expfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class ExponentExpressionContext extends ParserRuleContext {
      public ExponentExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterExponentExpression(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitExponentExpression(this);
         }
      }

      public List<TerminalNode> EXPONENT() {
         return getTokens(jvmBasicParser.EXPONENT);
      }

      public TerminalNode EXPONENT(int i) {
         return getToken(jvmBasicParser.EXPONENT, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_exponentExpression;
      }

      public List<SignExpressionContext> signExpression() {
         return getRuleContexts(SignExpressionContext.class);
      }

      public SignExpressionContext signExpression(int i) {
         return getRuleContext(SignExpressionContext.class, i);
      }
   }

   public static class ExpressionContext extends ParserRuleContext {
      public ExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> AND() {
         return getTokens(jvmBasicParser.AND);
      }

      public TerminalNode AND(int i) {
         return getToken(jvmBasicParser.AND, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterExpression(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitExpression(this);
         }
      }

      public FuncContext func() {
         return getRuleContext(FuncContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_expression;
      }

      public List<TerminalNode> OR() {
         return getTokens(jvmBasicParser.OR);
      }

      public TerminalNode OR(int i) {
         return getToken(jvmBasicParser.OR, i);
      }

      public List<RelationalExpressionContext> relationalExpression() {
         return getRuleContexts(RelationalExpressionContext.class);
      }

      public RelationalExpressionContext relationalExpression(int i) {
         return getRuleContext(RelationalExpressionContext.class, i);
      }
   }

   public static class ExprlistContext extends ParserRuleContext {
      public ExprlistContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterExprlist(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitExprlist(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_exprlist;
      }
   }

   public static class FnfuncContext extends ParserRuleContext {
      public FnfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterFnfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitFnfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public TerminalNode FN() {
         return getToken(jvmBasicParser.FN, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_fnfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public VarContext var() {
         return getRuleContext(VarContext.class, 0);
      }
   }

   public static class ForstmtContext extends ParserRuleContext {
      public ForstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterForstmt(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitForstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      public TerminalNode FOR() {
         return getToken(jvmBasicParser.FOR, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_forstmt;
      }

      public TerminalNode STEP() {
         return getToken(jvmBasicParser.STEP, 0);
      }

      public TerminalNode TO() {
         return getToken(jvmBasicParser.TO, 0);
      }

      public VardeclContext vardecl() {
         return getRuleContext(VardeclContext.class, 0);
      }
   }

   public static class FrefuncContext extends ParserRuleContext {
      public FrefuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterFrefunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitFrefunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public TerminalNode FRE() {
         return getToken(jvmBasicParser.FRE, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_frefunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class FuncContext extends ParserRuleContext {
      public FuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AbsfuncContext absfunc() {
         return getRuleContext(AbsfuncContext.class, 0);
      }

      public AscfuncContext ascfunc() {
         return getRuleContext(AscfuncContext.class, 0);
      }

      public AtnfuncContext atnfunc() {
         return getRuleContext(AtnfuncContext.class, 0);
      }

      public ChrfuncContext chrfunc() {
         return getRuleContext(ChrfuncContext.class, 0);
      }

      public CosfuncContext cosfunc() {
         return getRuleContext(CosfuncContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterFunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitFunc(this);
         }
      }

      public ExpfuncContext expfunc() {
         return getRuleContext(ExpfuncContext.class, 0);
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      public TerminalNode FLOAT() {
         return getToken(jvmBasicParser.FLOAT, 0);
      }

      public FnfuncContext fnfunc() {
         return getRuleContext(FnfuncContext.class, 0);
      }

      public FrefuncContext frefunc() {
         return getRuleContext(FrefuncContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_func;
      }

      public IntfuncContext intfunc() {
         return getRuleContext(IntfuncContext.class, 0);
      }

      public LeftfuncContext leftfunc() {
         return getRuleContext(LeftfuncContext.class, 0);
      }

      public LenfuncContext lenfunc() {
         return getRuleContext(LenfuncContext.class, 0);
      }

      public LogfuncContext logfunc() {
         return getRuleContext(LogfuncContext.class, 0);
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public MidfuncContext midfunc() {
         return getRuleContext(MidfuncContext.class, 0);
      }

      public TerminalNode NUMBER() {
         return getToken(jvmBasicParser.NUMBER, 0);
      }

      public PdlfuncContext pdlfunc() {
         return getRuleContext(PdlfuncContext.class, 0);
      }

      public PeekfuncContext peekfunc() {
         return getRuleContext(PeekfuncContext.class, 0);
      }

      public PosfuncContext posfunc() {
         return getRuleContext(PosfuncContext.class, 0);
      }

      public RightfuncContext rightfunc() {
         return getRuleContext(RightfuncContext.class, 0);
      }

      public RndfuncContext rndfunc() {
         return getRuleContext(RndfuncContext.class, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public ScrnfuncContext scrnfunc() {
         return getRuleContext(ScrnfuncContext.class, 0);
      }

      public SgnfuncContext sgnfunc() {
         return getRuleContext(SgnfuncContext.class, 0);
      }

      public SinfuncContext sinfunc() {
         return getRuleContext(SinfuncContext.class, 0);
      }

      public SpcfuncContext spcfunc() {
         return getRuleContext(SpcfuncContext.class, 0);
      }

      public SqrfuncContext sqrfunc() {
         return getRuleContext(SqrfuncContext.class, 0);
      }

      public StrfuncContext strfunc() {
         return getRuleContext(StrfuncContext.class, 0);
      }

      public TerminalNode STRINGLITERAL() {
         return getToken(jvmBasicParser.STRINGLITERAL, 0);
      }

      public TanfuncContext tanfunc() {
         return getRuleContext(TanfuncContext.class, 0);
      }

      public UsrfuncContext usrfunc() {
         return getRuleContext(UsrfuncContext.class, 0);
      }

      public ValfuncContext valfunc() {
         return getRuleContext(ValfuncContext.class, 0);
      }

      public VardeclContext vardecl() {
         return getRuleContext(VardeclContext.class, 0);
      }
   }

   public static class GetstmtContext extends ParserRuleContext {
      public GetstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterGetstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitGetstmt(this);
         }
      }

      public ExprlistContext exprlist() {
         return getRuleContext(ExprlistContext.class, 0);
      }

      public TerminalNode GET() {
         return getToken(jvmBasicParser.GET, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_getstmt;
      }
   }

   public static class GosubstmtContext extends ParserRuleContext {
      public GosubstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterGosubstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitGosubstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_gosubstmt;
      }

      public TerminalNode GOSUB() {
         return getToken(jvmBasicParser.GOSUB, 0);
      }

      public LinenumberContext linenumber() {
         return getRuleContext(LinenumberContext.class, 0);
      }
   }

   public static class GotostmtContext extends ParserRuleContext {
      public GotostmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterGotostmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitGotostmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_gotostmt;
      }

      public TerminalNode GOTO() {
         return getToken(jvmBasicParser.GOTO, 0);
      }

      public LinenumberContext linenumber() {
         return getRuleContext(LinenumberContext.class, 0);
      }
   }

   public static class GteContext extends ParserRuleContext {
      public GteContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterGte(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitGte(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_gte;
      }

      public TerminalNode GT() {
         return getToken(jvmBasicParser.GT, 0);
      }

      public TerminalNode GTE() {
         return getToken(jvmBasicParser.GTE, 0);
      }
   }

   public static class HcolorstmtContext extends ParserRuleContext {
      public HcolorstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterHcolorstmt(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitHcolorstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_hcolorstmt;
      }

      public TerminalNode HCOLOR() {
         return getToken(jvmBasicParser.HCOLOR, 0);
      }
   }

   public static class HimemstmtContext extends ParserRuleContext {
      public HimemstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COLON() {
         return getToken(jvmBasicParser.COLON, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterHimemstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitHimemstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_himemstmt;
      }

      public TerminalNode HIMEM() {
         return getToken(jvmBasicParser.HIMEM, 0);
      }
   }

   public static class HlinstmtContext extends ParserRuleContext {
      public HlinstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode AT() {
         return getToken(jvmBasicParser.AT, 0);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterHlinstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitHlinstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_hlinstmt;
      }

      public TerminalNode HLIN() {
         return getToken(jvmBasicParser.HLIN, 0);
      }
   }

   public static class HplotstmtContext extends ParserRuleContext {
      public HplotstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterHplotstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitHplotstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_hplotstmt;
      }

      public TerminalNode HPLOT() {
         return getToken(jvmBasicParser.HPLOT, 0);
      }

      public List<TerminalNode> TO() {
         return getTokens(jvmBasicParser.TO);
      }

      public TerminalNode TO(int i) {
         return getToken(jvmBasicParser.TO, i);
      }
   }

   public static class HtabstmntContext extends ParserRuleContext {
      public HtabstmntContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterHtabstmnt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitHtabstmnt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_htabstmnt;
      }

      public TerminalNode HTAB() {
         return getToken(jvmBasicParser.HTAB, 0);
      }
   }

   public static class IfstmtContext extends ParserRuleContext {
      public IfstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterIfstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitIfstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ifstmt;
      }

      public TerminalNode IF() {
         return getToken(jvmBasicParser.IF, 0);
      }

      public LinenumberContext linenumber() {
         return getRuleContext(LinenumberContext.class, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public TerminalNode THEN() {
         return getToken(jvmBasicParser.THEN, 0);
      }
   }

   public static class IncludestmtContext extends ParserRuleContext {
      public IncludestmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterIncludestmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitIncludestmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_includestmt;
      }

      public TerminalNode INCLUDE() {
         return getToken(jvmBasicParser.INCLUDE, 0);
      }
   }

   public static class InputstmtContext extends ParserRuleContext {
      public InputstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterInputstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitInputstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_inputstmt;
      }

      public TerminalNode INPUT() {
         return getToken(jvmBasicParser.INPUT, 0);
      }

      public TerminalNode SEMICOLON() {
         return getToken(jvmBasicParser.SEMICOLON, 0);
      }

      public TerminalNode STRINGLITERAL() {
         return getToken(jvmBasicParser.STRINGLITERAL, 0);
      }

      public VarlistContext varlist() {
         return getRuleContext(VarlistContext.class, 0);
      }
   }

   public static class InstmtContext extends ParserRuleContext {
      public InstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterInstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitInstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_instmt;
      }

      public TerminalNode INNUMBER() {
         return getToken(jvmBasicParser.INNUMBER, 0);
      }

      public TerminalNode NUMBER() {
         return getToken(jvmBasicParser.NUMBER, 0);
      }
   }

   public static class IntfuncContext extends ParserRuleContext {
      public IntfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterIntfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitIntfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_intfunc;
      }

      public TerminalNode INTF() {
         return getToken(jvmBasicParser.INTF, 0);
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class LeftfuncContext extends ParserRuleContext {
      public LeftfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLeftfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLeftfunc(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_leftfunc;
      }

      public TerminalNode LEFT() {
         return getToken(jvmBasicParser.LEFT, 0);
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class LenfuncContext extends ParserRuleContext {
      public LenfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLenfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLenfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lenfunc;
      }

      public TerminalNode LEN() {
         return getToken(jvmBasicParser.LEN, 0);
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class LetstmtContext extends ParserRuleContext {
      public LetstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLetstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLetstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_letstmt;
      }

      public TerminalNode LET() {
         return getToken(jvmBasicParser.LET, 0);
      }

      public VariableassignmentContext variableassignment() {
         return getRuleContext(VariableassignmentContext.class, 0);
      }
   }

   public static class LineContext extends ParserRuleContext {
      public LineContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AmprstmtContext amprstmt() {
         return getRuleContext(AmprstmtContext.class, 0);
      }

      public TerminalNode COLON() {
         return getToken(jvmBasicParser.COLON, 0);
      }

      public TerminalNode COMMENT() {
         return getToken(jvmBasicParser.COMMENT, 0);
      }

      public TerminalNode CR() {
         return getToken(jvmBasicParser.CR, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLine(this);
         }
      }

      public TerminalNode EOF() {
         return getToken(Recognizer.EOF, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLine(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_line;
      }

      public LinenumberContext linenumber() {
         return getRuleContext(LinenumberContext.class, 0);
      }

      public TerminalNode REM() {
         return getToken(jvmBasicParser.REM, 0);
      }
   }

   public static class LinenumberContext extends ParserRuleContext {
      public LinenumberContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLinenumber(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLinenumber(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_linenumber;
      }

      public TerminalNode NUMBER() {
         return getToken(jvmBasicParser.NUMBER, 0);
      }
   }

   public static class ListstmtContext extends ParserRuleContext {
      public ListstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterListstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitListstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_liststmt;
      }

      public TerminalNode LIST() {
         return getToken(jvmBasicParser.LIST, 0);
      }
   }

   public static class LogfuncContext extends ParserRuleContext {
      public LogfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLogfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLogfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_logfunc;
      }

      public TerminalNode LOG() {
         return getToken(jvmBasicParser.LOG, 0);
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class LomemstmtContext extends ParserRuleContext {
      public LomemstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COLON() {
         return getToken(jvmBasicParser.COLON, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLomemstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLomemstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_lomemstmt;
      }

      public TerminalNode LOMEM() {
         return getToken(jvmBasicParser.LOMEM, 0);
      }
   }

   public static class LteContext extends ParserRuleContext {
      public LteContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterLte(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitLte(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_lte;
      }

      public TerminalNode LT() {
         return getToken(jvmBasicParser.LT, 0);
      }

      public TerminalNode LTE() {
         return getToken(jvmBasicParser.LTE, 0);
      }
   }

   public static class MidfuncContext extends ParserRuleContext {
      public MidfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterMidfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitMidfunc(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_midfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode MID() {
         return getToken(jvmBasicParser.MID, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class MultiplyingExpressionContext extends ParserRuleContext {
      public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> DIV() {
         return getTokens(jvmBasicParser.DIV);
      }

      public TerminalNode DIV(int i) {
         return getToken(jvmBasicParser.DIV, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterMultiplyingExpression(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitMultiplyingExpression(this);
         }
      }

      public List<ExponentExpressionContext> exponentExpression() {
         return getRuleContexts(ExponentExpressionContext.class);
      }

      public ExponentExpressionContext exponentExpression(int i) {
         return getRuleContext(ExponentExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_multiplyingExpression;
      }

      public List<TerminalNode> TIMES() {
         return getTokens(jvmBasicParser.TIMES);
      }

      public TerminalNode TIMES(int i) {
         return getToken(jvmBasicParser.TIMES, i);
      }
   }

   public static class NeqContext extends ParserRuleContext {
      public NeqContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterNeq(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitNeq(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_neq;
      }

      public TerminalNode NEQ() {
         return getToken(jvmBasicParser.NEQ, 0);
      }
   }

   public static class NextstmtContext extends ParserRuleContext {
      public NextstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterNextstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitNextstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_nextstmt;
      }

      public TerminalNode NEXT() {
         return getToken(jvmBasicParser.NEXT, 0);
      }

      public VarlistContext varlist() {
         return getRuleContext(VarlistContext.class, 0);
      }
   }

   public static class OnerrstmtContext extends ParserRuleContext {
      public OnerrstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterOnerrstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitOnerrstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_onerrstmt;
      }

      public TerminalNode GOTO() {
         return getToken(jvmBasicParser.GOTO, 0);
      }

      public LinenumberContext linenumber() {
         return getRuleContext(LinenumberContext.class, 0);
      }

      public TerminalNode ONERR() {
         return getToken(jvmBasicParser.ONERR, 0);
      }
   }

   public static class OngosubstmtContext extends ParserRuleContext {
      public OngosubstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterOngosubstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitOngosubstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ongosubstmt;
      }

      public TerminalNode GOSUB() {
         return getToken(jvmBasicParser.GOSUB, 0);
      }

      public List<LinenumberContext> linenumber() {
         return getRuleContexts(LinenumberContext.class);
      }

      public LinenumberContext linenumber(int i) {
         return getRuleContext(LinenumberContext.class, i);
      }

      public TerminalNode ON() {
         return getToken(jvmBasicParser.ON, 0);
      }
   }

   public static class OngotostmtContext extends ParserRuleContext {
      public OngotostmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterOngotostmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitOngotostmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_ongotostmt;
      }

      public TerminalNode GOTO() {
         return getToken(jvmBasicParser.GOTO, 0);
      }

      public List<LinenumberContext> linenumber() {
         return getRuleContexts(LinenumberContext.class);
      }

      public LinenumberContext linenumber(int i) {
         return getRuleContext(LinenumberContext.class, i);
      }

      public TerminalNode ON() {
         return getToken(jvmBasicParser.ON, 0);
      }
   }

   public static class PdlfuncContext extends ParserRuleContext {
      public PdlfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPdlfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPdlfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_pdlfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode PDL() {
         return getToken(jvmBasicParser.PDL, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class PeekfuncContext extends ParserRuleContext {
      public PeekfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPeekfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPeekfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_peekfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode PEEK() {
         return getToken(jvmBasicParser.PEEK, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class PlotstmtContext extends ParserRuleContext {
      public PlotstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPlotstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPlotstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_plotstmt;
      }

      public TerminalNode PLOT() {
         return getToken(jvmBasicParser.PLOT, 0);
      }
   }

   public static class PokestmtContext extends ParserRuleContext {
      public PokestmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPokestmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPokestmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_pokestmt;
      }

      public TerminalNode POKE() {
         return getToken(jvmBasicParser.POKE, 0);
      }
   }

   public static class PopstmtContext extends ParserRuleContext {
      public PopstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPopstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPopstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_popstmt;
      }

      public TerminalNode POP() {
         return getToken(jvmBasicParser.POP, 0);
      }
   }

   public static class PosfuncContext extends ParserRuleContext {
      public PosfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPosfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPosfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_posfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode POS() {
         return getToken(jvmBasicParser.POS, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class PrintlistContext extends ParserRuleContext {
      public PrintlistContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPrintlist(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPrintlist(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_printlist;
      }

      public List<PrintlistContext> printlist() {
         return getRuleContexts(PrintlistContext.class);
      }

      public PrintlistContext printlist(int i) {
         return getRuleContext(PrintlistContext.class, i);
      }

      public TerminalNode SEMICOLON() {
         return getToken(jvmBasicParser.SEMICOLON, 0);
      }
   }

   public static class Printstmt1Context extends ParserRuleContext {
      public Printstmt1Context(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPrintstmt1(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPrintstmt1(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_printstmt1;
      }

      public TerminalNode PRINT() {
         return getToken(jvmBasicParser.PRINT, 0);
      }

      public PrintlistContext printlist() {
         return getRuleContext(PrintlistContext.class, 0);
      }

      public TerminalNode QUESTION() {
         return getToken(jvmBasicParser.QUESTION, 0);
      }
   }

   public static class ProgContext extends ParserRuleContext {
      public ProgContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterProg(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitProg(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_prog;
      }

      public List<LineContext> line() {
         return getRuleContexts(LineContext.class);
      }

      public LineContext line(int i) {
         return getRuleContext(LineContext.class, i);
      }
   }

   public static class PrstmtContext extends ParserRuleContext {
      public PrstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterPrstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitPrstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_prstmt;
      }

      public TerminalNode NUMBER() {
         return getToken(jvmBasicParser.NUMBER, 0);
      }

      public TerminalNode PRNUMBER() {
         return getToken(jvmBasicParser.PRNUMBER, 0);
      }
   }

   public static class ReadstmtContext extends ParserRuleContext {
      public ReadstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterReadstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitReadstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_readstmt;
      }

      public TerminalNode READ() {
         return getToken(jvmBasicParser.READ, 0);
      }

      public VarlistContext varlist() {
         return getRuleContext(VarlistContext.class, 0);
      }
   }

   public static class RecallstmtContext extends ParserRuleContext {
      public RecallstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterRecallstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitRecallstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_recallstmt;
      }

      public TerminalNode RECALL() {
         return getToken(jvmBasicParser.RECALL, 0);
      }

      public VardeclContext vardecl() {
         return getRuleContext(VardeclContext.class, 0);
      }
   }

   public static class RelationalExpressionContext extends ParserRuleContext {
      public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<AddingExpressionContext> addingExpression() {
         return getRuleContexts(AddingExpressionContext.class);
      }

      public AddingExpressionContext addingExpression(int i) {
         return getRuleContext(AddingExpressionContext.class, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterRelationalExpression(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitRelationalExpression(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_relationalExpression;
      }

      public List<RelopContext> relop() {
         return getRuleContexts(RelopContext.class);
      }

      public RelopContext relop(int i) {
         return getRuleContext(RelopContext.class, i);
      }
   }

   public static class RelopContext extends ParserRuleContext {
      public RelopContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterRelop(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitRelop(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_relop;
      }

      public TerminalNode GT() {
         return getToken(jvmBasicParser.GT, 0);
      }

      public GteContext gte() {
         return getRuleContext(GteContext.class, 0);
      }

      public TerminalNode LT() {
         return getToken(jvmBasicParser.LT, 0);
      }

      public LteContext lte() {
         return getRuleContext(LteContext.class, 0);
      }

      public NeqContext neq() {
         return getRuleContext(NeqContext.class, 0);
      }
   }

   public static class ReturnstmtContext extends ParserRuleContext {
      public ReturnstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterReturnstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitReturnstmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_returnstmt;
      }

      public TerminalNode RETURN() {
         return getToken(jvmBasicParser.RETURN, 0);
      }
   }

   public static class RightfuncContext extends ParserRuleContext {
      public RightfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterRightfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitRightfunc(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_rightfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RIGHT() {
         return getToken(jvmBasicParser.RIGHT, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class RndfuncContext extends ParserRuleContext {
      public RndfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterRndfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitRndfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_rndfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RND() {
         return getToken(jvmBasicParser.RND, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }
   }

   public static class RotstmtContext extends ParserRuleContext {
      public RotstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterRotstmt(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitRotstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_rotstmt;
      }

      public TerminalNode ROT() {
         return getToken(jvmBasicParser.ROT, 0);
      }
   }

   public static class ScalestmtContext extends ParserRuleContext {
      public ScalestmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterScalestmt(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitScalestmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_scalestmt;
      }

      public TerminalNode SCALE() {
         return getToken(jvmBasicParser.SCALE, 0);
      }
   }

   public static class ScrnfuncContext extends ParserRuleContext {
      public ScrnfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterScrnfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitScrnfunc(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_scrnfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode SCRN() {
         return getToken(jvmBasicParser.SCRN, 0);
      }
   }

   public static class SgnfuncContext extends ParserRuleContext {
      public SgnfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterSgnfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitSgnfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_sgnfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode SGN() {
         return getToken(jvmBasicParser.SGN, 0);
      }
   }

   public static class SignExpressionContext extends ParserRuleContext {
      public SignExpressionContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterSignExpression(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitSignExpression(this);
         }
      }

      public FuncContext func() {
         return getRuleContext(FuncContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_signExpression;
      }

      public List<TerminalNode> MINUS() {
         return getTokens(jvmBasicParser.MINUS);
      }

      public TerminalNode MINUS(int i) {
         return getToken(jvmBasicParser.MINUS, i);
      }

      public TerminalNode NOT() {
         return getToken(jvmBasicParser.NOT, 0);
      }

      public List<TerminalNode> PLUS() {
         return getTokens(jvmBasicParser.PLUS);
      }

      public TerminalNode PLUS(int i) {
         return getToken(jvmBasicParser.PLUS, i);
      }
   }

   public static class SinfuncContext extends ParserRuleContext {
      public SinfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterSinfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitSinfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_sinfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode SIN() {
         return getToken(jvmBasicParser.SIN, 0);
      }
   }

   public static class SpcfuncContext extends ParserRuleContext {
      public SpcfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterSpcfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitSpcfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_spcfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode SPC() {
         return getToken(jvmBasicParser.SPC, 0);
      }
   }

   public static class SpeedstmtContext extends ParserRuleContext {
      public SpeedstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterSpeedstmt(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitSpeedstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_speedstmt;
      }

      public TerminalNode SPEED() {
         return getToken(jvmBasicParser.SPEED, 0);
      }
   }

   public static class SqrfuncContext extends ParserRuleContext {
      public SqrfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterSqrfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitSqrfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_sqrfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode SQR() {
         return getToken(jvmBasicParser.SQR, 0);
      }
   }

   public static class StatementContext extends ParserRuleContext {
      public StatementContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public AmptstmtContext amptstmt() {
         return getRuleContext(AmptstmtContext.class, 0);
      }

      public CallstmtContext callstmt() {
         return getRuleContext(CallstmtContext.class, 0);
      }

      public TerminalNode CLEAR() {
         return getToken(jvmBasicParser.CLEAR, 0);
      }

      public ColorstmtContext colorstmt() {
         return getRuleContext(ColorstmtContext.class, 0);
      }

      public DatastmtContext datastmt() {
         return getRuleContext(DatastmtContext.class, 0);
      }

      public DefstmtContext defstmt() {
         return getRuleContext(DefstmtContext.class, 0);
      }

      public DimstmtContext dimstmt() {
         return getRuleContext(DimstmtContext.class, 0);
      }

      public DrawstmtContext drawstmt() {
         return getRuleContext(DrawstmtContext.class, 0);
      }

      public EndstmtContext endstmt() {
         return getRuleContext(EndstmtContext.class, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterStatement(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitStatement(this);
         }
      }

      public TerminalNode FLASH() {
         return getToken(jvmBasicParser.FLASH, 0);
      }

      public ForstmtContext forstmt() {
         return getRuleContext(ForstmtContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_statement;
      }

      public GetstmtContext getstmt() {
         return getRuleContext(GetstmtContext.class, 0);
      }

      public GosubstmtContext gosubstmt() {
         return getRuleContext(GosubstmtContext.class, 0);
      }

      public GotostmtContext gotostmt() {
         return getRuleContext(GotostmtContext.class, 0);
      }

      public TerminalNode GR() {
         return getToken(jvmBasicParser.GR, 0);
      }

      public HcolorstmtContext hcolorstmt() {
         return getRuleContext(HcolorstmtContext.class, 0);
      }

      public TerminalNode HGR() {
         return getToken(jvmBasicParser.HGR, 0);
      }

      public TerminalNode HGR2() {
         return getToken(jvmBasicParser.HGR2, 0);
      }

      public HimemstmtContext himemstmt() {
         return getRuleContext(HimemstmtContext.class, 0);
      }

      public HlinstmtContext hlinstmt() {
         return getRuleContext(HlinstmtContext.class, 0);
      }

      public TerminalNode HOME() {
         return getToken(jvmBasicParser.HOME, 0);
      }

      public HplotstmtContext hplotstmt() {
         return getRuleContext(HplotstmtContext.class, 0);
      }

      public HtabstmntContext htabstmnt() {
         return getRuleContext(HtabstmntContext.class, 0);
      }

      public IfstmtContext ifstmt() {
         return getRuleContext(IfstmtContext.class, 0);
      }

      public IncludestmtContext includestmt() {
         return getRuleContext(IncludestmtContext.class, 0);
      }

      public InputstmtContext inputstmt() {
         return getRuleContext(InputstmtContext.class, 0);
      }

      public InstmtContext instmt() {
         return getRuleContext(InstmtContext.class, 0);
      }

      public TerminalNode INVERSE() {
         return getToken(jvmBasicParser.INVERSE, 0);
      }

      public LetstmtContext letstmt() {
         return getRuleContext(LetstmtContext.class, 0);
      }

      public ListstmtContext liststmt() {
         return getRuleContext(ListstmtContext.class, 0);
      }

      public TerminalNode LOAD() {
         return getToken(jvmBasicParser.LOAD, 0);
      }

      public LomemstmtContext lomemstmt() {
         return getRuleContext(LomemstmtContext.class, 0);
      }

      public NextstmtContext nextstmt() {
         return getRuleContext(NextstmtContext.class, 0);
      }

      public TerminalNode NORMAL() {
         return getToken(jvmBasicParser.NORMAL, 0);
      }

      public TerminalNode NOTRACE() {
         return getToken(jvmBasicParser.NOTRACE, 0);
      }

      public OnerrstmtContext onerrstmt() {
         return getRuleContext(OnerrstmtContext.class, 0);
      }

      public OngosubstmtContext ongosubstmt() {
         return getRuleContext(OngosubstmtContext.class, 0);
      }

      public OngotostmtContext ongotostmt() {
         return getRuleContext(OngotostmtContext.class, 0);
      }

      public PlotstmtContext plotstmt() {
         return getRuleContext(PlotstmtContext.class, 0);
      }

      public PokestmtContext pokestmt() {
         return getRuleContext(PokestmtContext.class, 0);
      }

      public PopstmtContext popstmt() {
         return getRuleContext(PopstmtContext.class, 0);
      }

      public Printstmt1Context printstmt1() {
         return getRuleContext(Printstmt1Context.class, 0);
      }

      public PrstmtContext prstmt() {
         return getRuleContext(PrstmtContext.class, 0);
      }

      public ReadstmtContext readstmt() {
         return getRuleContext(ReadstmtContext.class, 0);
      }

      public RecallstmtContext recallstmt() {
         return getRuleContext(RecallstmtContext.class, 0);
      }

      public TerminalNode RESTORE() {
         return getToken(jvmBasicParser.RESTORE, 0);
      }

      public ReturnstmtContext returnstmt() {
         return getRuleContext(ReturnstmtContext.class, 0);
      }

      public RotstmtContext rotstmt() {
         return getRuleContext(RotstmtContext.class, 0);
      }

      public TerminalNode RUN() {
         return getToken(jvmBasicParser.RUN, 0);
      }

      public TerminalNode SAVE() {
         return getToken(jvmBasicParser.SAVE, 0);
      }

      public ScalestmtContext scalestmt() {
         return getRuleContext(ScalestmtContext.class, 0);
      }

      public TerminalNode SHLOAD() {
         return getToken(jvmBasicParser.SHLOAD, 0);
      }

      public SpeedstmtContext speedstmt() {
         return getRuleContext(SpeedstmtContext.class, 0);
      }

      public TerminalNode STOP() {
         return getToken(jvmBasicParser.STOP, 0);
      }

      public StorestmtContext storestmt() {
         return getRuleContext(StorestmtContext.class, 0);
      }

      public TabstmtContext tabstmt() {
         return getRuleContext(TabstmtContext.class, 0);
      }

      public TerminalNode TEXT() {
         return getToken(jvmBasicParser.TEXT, 0);
      }

      public TerminalNode TRACE() {
         return getToken(jvmBasicParser.TRACE, 0);
      }

      public VlinstmtContext vlinstmt() {
         return getRuleContext(VlinstmtContext.class, 0);
      }

      public VplotstmtContext vplotstmt() {
         return getRuleContext(VplotstmtContext.class, 0);
      }

      public VtabstmntContext vtabstmnt() {
         return getRuleContext(VtabstmntContext.class, 0);
      }

      public WaitstmtContext waitstmt() {
         return getRuleContext(WaitstmtContext.class, 0);
      }

      public XdrawstmtContext xdrawstmt() {
         return getRuleContext(XdrawstmtContext.class, 0);
      }
   }

   public static class StorestmtContext extends ParserRuleContext {
      public StorestmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterStorestmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitStorestmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_storestmt;
      }

      public TerminalNode STORE() {
         return getToken(jvmBasicParser.STORE, 0);
      }

      public VardeclContext vardecl() {
         return getRuleContext(VardeclContext.class, 0);
      }
   }

   public static class StrfuncContext extends ParserRuleContext {
      public StrfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterStrfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitStrfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_strfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode STR() {
         return getToken(jvmBasicParser.STR, 0);
      }
   }

   public static class TabstmtContext extends ParserRuleContext {
      public TabstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterTabstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitTabstmt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tabstmt;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode TAB() {
         return getToken(jvmBasicParser.TAB, 0);
      }
   }

   public static class TanfuncContext extends ParserRuleContext {
      public TanfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterTanfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitTanfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_tanfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode TAN() {
         return getToken(jvmBasicParser.TAN, 0);
      }
   }

   public static class UsrfuncContext extends ParserRuleContext {
      public UsrfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterUsrfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitUsrfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_usrfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode USR() {
         return getToken(jvmBasicParser.USR, 0);
      }
   }

   public static class ValfuncContext extends ParserRuleContext {
      public ValfuncContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterValfunc(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitValfunc(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_valfunc;
      }

      public TerminalNode LPAREN() {
         return getToken(jvmBasicParser.LPAREN, 0);
      }

      public TerminalNode RPAREN() {
         return getToken(jvmBasicParser.RPAREN, 0);
      }

      public TerminalNode VAL() {
         return getToken(jvmBasicParser.VAL, 0);
      }
   }

   public static class VarContext extends ParserRuleContext {
      public VarContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVar(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVar(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_var;
      }

      public VarnameContext varname() {
         return getRuleContext(VarnameContext.class, 0);
      }

      public VarsuffixContext varsuffix() {
         return getRuleContext(VarsuffixContext.class, 0);
      }
   }

   public static class VardeclContext extends ParserRuleContext {
      public VardeclContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVardecl(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVardecl(this);
         }
      }

      public List<ExprlistContext> exprlist() {
         return getRuleContexts(ExprlistContext.class);
      }

      public ExprlistContext exprlist(int i) {
         return getRuleContext(ExprlistContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_vardecl;
      }

      public List<TerminalNode> LPAREN() {
         return getTokens(jvmBasicParser.LPAREN);
      }

      public TerminalNode LPAREN(int i) {
         return getToken(jvmBasicParser.LPAREN, i);
      }

      public List<TerminalNode> RPAREN() {
         return getTokens(jvmBasicParser.RPAREN);
      }

      public TerminalNode RPAREN(int i) {
         return getToken(jvmBasicParser.RPAREN, i);
      }

      public VarContext var() {
         return getRuleContext(VarContext.class, 0);
      }
   }

   public static class VariableassignmentContext extends ParserRuleContext {
      public VariableassignmentContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVariableassignment(this);
         }
      }

      public TerminalNode EQ() {
         return getToken(jvmBasicParser.EQ, 0);
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVariableassignment(this);
         }
      }

      public ExprlistContext exprlist() {
         return getRuleContext(ExprlistContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_variableassignment;
      }

      public VardeclContext vardecl() {
         return getRuleContext(VardeclContext.class, 0);
      }
   }

   public static class VarlistContext extends ParserRuleContext {
      public VarlistContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVarlist(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVarlist(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_varlist;
      }

      public List<VardeclContext> vardecl() {
         return getRuleContexts(VardeclContext.class);
      }

      public VardeclContext vardecl(int i) {
         return getRuleContext(VardeclContext.class, i);
      }
   }

   public static class VarnameContext extends ParserRuleContext {
      public VarnameContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVarname(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVarname(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_varname;
      }

      public List<TerminalNode> LETTERS() {
         return getTokens(jvmBasicParser.LETTERS);
      }

      public TerminalNode LETTERS(int i) {
         return getToken(jvmBasicParser.LETTERS, i);
      }

      public List<TerminalNode> NUMBER() {
         return getTokens(jvmBasicParser.NUMBER);
      }

      public TerminalNode NUMBER(int i) {
         return getToken(jvmBasicParser.NUMBER, i);
      }
   }

   public static class VarsuffixContext extends ParserRuleContext {
      public VarsuffixContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode DOLLAR() {
         return getToken(jvmBasicParser.DOLLAR, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVarsuffix(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVarsuffix(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_varsuffix;
      }

      public TerminalNode PERCENT() {
         return getToken(jvmBasicParser.PERCENT, 0);
      }
   }

   public static class VlinstmtContext extends ParserRuleContext {
      public VlinstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode AT() {
         return getToken(jvmBasicParser.AT, 0);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVlinstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVlinstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_vlinstmt;
      }

      public TerminalNode VLIN() {
         return getToken(jvmBasicParser.VLIN, 0);
      }
   }

   public static class VplotstmtContext extends ParserRuleContext {
      public VplotstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVplotstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVplotstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_vplotstmt;
      }

      public List<TerminalNode> TO() {
         return getTokens(jvmBasicParser.TO);
      }

      public TerminalNode TO(int i) {
         return getToken(jvmBasicParser.TO, i);
      }

      public TerminalNode VPLOT() {
         return getToken(jvmBasicParser.VPLOT, 0);
      }
   }

   public static class VtabstmntContext extends ParserRuleContext {
      public VtabstmntContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterVtabstmnt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitVtabstmnt(this);
         }
      }

      public ExpressionContext expression() {
         return getRuleContext(ExpressionContext.class, 0);
      }

      @Override
      public int getRuleIndex() {
         return RULE_vtabstmnt;
      }

      public TerminalNode VTAB() {
         return getToken(jvmBasicParser.VTAB, 0);
      }
   }

   public static class WaitstmtContext extends ParserRuleContext {
      public WaitstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public List<TerminalNode> COMMA() {
         return getTokens(jvmBasicParser.COMMA);
      }

      public TerminalNode COMMA(int i) {
         return getToken(jvmBasicParser.COMMA, i);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterWaitstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitWaitstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_waitstmt;
      }

      public TerminalNode WAIT() {
         return getToken(jvmBasicParser.WAIT, 0);
      }
   }

   public static class XdrawstmtContext extends ParserRuleContext {
      public XdrawstmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      public TerminalNode AT() {
         return getToken(jvmBasicParser.AT, 0);
      }

      public TerminalNode COMMA() {
         return getToken(jvmBasicParser.COMMA, 0);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterXdrawstmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitXdrawstmt(this);
         }
      }

      public List<ExpressionContext> expression() {
         return getRuleContexts(ExpressionContext.class);
      }

      public ExpressionContext expression(int i) {
         return getRuleContext(ExpressionContext.class, i);
      }

      @Override
      public int getRuleIndex() {
         return RULE_xdrawstmt;
      }

      public TerminalNode XDRAW() {
         return getToken(jvmBasicParser.XDRAW, 0);
      }
   }

   protected static final DFA[] _decisionToDFA;
   protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
   public static final int DOLLAR = 1, PERCENT = 2, RETURN = 3, PRINT = 4, GOTO = 5, GOSUB = 6, IF = 7, NEXT = 8, THEN = 9, REM = 10, CHR = 11, MID = 12, LEFT = 13, RIGHT = 14, STR = 15, LPAREN = 16,
         RPAREN = 17, PLUS = 18, MINUS = 19, TIMES = 20, DIV = 21, CLEAR = 22, GTE = 23, LTE = 24, GT = 25, LT = 26, NEQ = 27, COMMA = 28, LIST = 29, RUN = 30, END = 31, LET = 32, EQ = 33, FOR = 34,
         TO = 35, STEP = 36, INPUT = 37, SEMICOLON = 38, DIM = 39, SQR = 40, COLON = 41, TEXT = 42, HGR = 43, HGR2 = 44, LEN = 45, CALL = 46, ASC = 47, HPLOT = 48, VPLOT = 49, PRNUMBER = 50,
         INNUMBER = 51, VTAB = 52, HTAB = 53, HOME = 54, ON = 55, PDL = 56, PLOT = 57, PEEK = 58, POKE = 59, INTF = 60, STOP = 61, HIMEM = 62, LOMEM = 63, FLASH = 64, INVERSE = 65, NORMAL = 66,
         ONERR = 67, SPC = 68, FRE = 69, POS = 70, USR = 71, TRACE = 72, NOTRACE = 73, AND = 74, OR = 75, DATA = 76, WAIT = 77, READ = 78, XDRAW = 79, DRAW = 80, AT = 81, DEF = 82, FN = 83, VAL = 84,
         TAB = 85, SPEED = 86, ROT = 87, SCALE = 88, COLOR = 89, HCOLOR = 90, HLIN = 91, VLIN = 92, SCRN = 93, POP = 94, SHLOAD = 95, SIN = 96, COS = 97, TAN = 98, ATN = 99, RND = 100, SGN = 101,
         EXP = 102, LOG = 103, ABS = 104, STORE = 105, RECALL = 106, GET = 107, EXPONENT = 108, AMPERSAND = 109, GR = 110, NOT = 111, RESTORE = 112, SAVE = 113, LOAD = 114, QUESTION = 115,
         INCLUDE = 116, COMMENT = 117, STRINGLITERAL = 118, LETTERS = 119, NUMBER = 120, FLOAT = 121, CR = 122, WS = 123;
   public static final String[] tokenNames = { "<INVALID>", "'$'", "'%'", "'RETURN'", "'PRINT'", "'GOTO'", "'GOSUB'", "'IF'", "'NEXT'", "'THEN'", "'REM'", "'CHR$'", "'MID$'", "'LEFT$'", "'RIGHT$'",
         "'STR$'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'CLEAR'", "'>: '", "'<: '", "'>'", "'<'", "'< >'", "','", "'LIST'", "'RUN'", "'END'", "'LET'", "'='", "'FOR'", "'TO'", "'STEP'",
         "'INPUT'", "';'", "'DIM'", "'SQR'", "':'", "'TEXT'", "'HGR'", "'HGR2'", "'LEN'", "'CALL'", "'ASC'", "'HPLOT'", "'VPLOT'", "'PR#'", "'IN#'", "'VTAB'", "'HTAB'", "'HOME'", "'ON'", "'PDL'",
         "'PLOT'", "'PEEK'", "'POKE'", "'INT'", "'STOP'", "'HIMEM'", "'LOMEM'", "'FLASH'", "'INVERSE'", "'NORMAL'", "'ONERR'", "'SPC'", "'FRE'", "'POS'", "'USR'", "'TRACE'", "'NOTRACE'", "'AND'",
         "'OR'", "'DATA'", "'WAIT'", "'READ'", "'XDRAW'", "'DRAW'", "'AT'", "'DEF'", "'FN'", "'VAL'", "'TAB'", "'SPEED'", "'ROT'", "'SCALE'", "'COLOR'", "'HCOLOR'", "'HLIN'", "'VLIN'", "'SCRN'",
         "'POP'", "'SHLOAD'", "'SIN'", "'COS'", "'TAN'", "'ATN'", "'RND'", "'SGN'", "'EXP'", "'LOG'", "'ABS'", "'STORE'", "'RECALL'", "'GET'", "'^'", "'&'", "'GR'", "'NOT'", "'RESTORE'", "'SAVE'",
         "'LOAD'", "'?'", "'INCLUDE'", "COMMENT", "STRINGLITERAL", "LETTERS", "NUMBER", "FLOAT", "CR", "WS" };
   public static final int RULE_prog = 0, RULE_line = 1, RULE_amperoper = 2, RULE_linenumber = 3, RULE_amprstmt = 4, RULE_statement = 5, RULE_vardecl = 6, RULE_printstmt1 = 7, RULE_printlist = 8,
         RULE_getstmt = 9, RULE_letstmt = 10, RULE_variableassignment = 11, RULE_relop = 12, RULE_gte = 13, RULE_lte = 14, RULE_neq = 15, RULE_ifstmt = 16, RULE_forstmt = 17, RULE_nextstmt = 18,
         RULE_inputstmt = 19, RULE_readstmt = 20, RULE_dimstmt = 21, RULE_gotostmt = 22, RULE_gosubstmt = 23, RULE_pokestmt = 24, RULE_callstmt = 25, RULE_hplotstmt = 26, RULE_vplotstmt = 27,
         RULE_plotstmt = 28, RULE_ongotostmt = 29, RULE_ongosubstmt = 30, RULE_vtabstmnt = 31, RULE_htabstmnt = 32, RULE_himemstmt = 33, RULE_lomemstmt = 34, RULE_datastmt = 35, RULE_datum = 36,
         RULE_waitstmt = 37, RULE_xdrawstmt = 38, RULE_drawstmt = 39, RULE_defstmt = 40, RULE_tabstmt = 41, RULE_speedstmt = 42, RULE_rotstmt = 43, RULE_scalestmt = 44, RULE_colorstmt = 45,
         RULE_hcolorstmt = 46, RULE_hlinstmt = 47, RULE_vlinstmt = 48, RULE_onerrstmt = 49, RULE_prstmt = 50, RULE_instmt = 51, RULE_storestmt = 52, RULE_recallstmt = 53, RULE_liststmt = 54,
         RULE_popstmt = 55, RULE_amptstmt = 56, RULE_includestmt = 57, RULE_endstmt = 58, RULE_returnstmt = 59, RULE_func = 60, RULE_signExpression = 61, RULE_exponentExpression = 62,
         RULE_multiplyingExpression = 63, RULE_addingExpression = 64, RULE_relationalExpression = 65, RULE_expression = 66, RULE_var = 67, RULE_varname = 68, RULE_varsuffix = 69, RULE_varlist = 70,
         RULE_exprlist = 71, RULE_sqrfunc = 72, RULE_chrfunc = 73, RULE_lenfunc = 74, RULE_ascfunc = 75, RULE_midfunc = 76, RULE_pdlfunc = 77, RULE_peekfunc = 78, RULE_intfunc = 79,
         RULE_spcfunc = 80, RULE_frefunc = 81, RULE_posfunc = 82, RULE_usrfunc = 83, RULE_leftfunc = 84, RULE_rightfunc = 85, RULE_strfunc = 86, RULE_fnfunc = 87, RULE_valfunc = 88,
         RULE_scrnfunc = 89, RULE_sinfunc = 90, RULE_cosfunc = 91, RULE_tanfunc = 92, RULE_atnfunc = 93, RULE_rndfunc = 94, RULE_sgnfunc = 95, RULE_expfunc = 96, RULE_logfunc = 97, RULE_absfunc = 98;
   public static final String[] ruleNames = { "prog", "line", "amperoper", "linenumber", "amprstmt", "statement", "vardecl", "printstmt1", "printlist", "getstmt", "letstmt", "variableassignment",
         "relop", "gte", "lte", "neq", "ifstmt", "forstmt", "nextstmt", "inputstmt", "readstmt", "dimstmt", "gotostmt", "gosubstmt", "pokestmt", "callstmt", "hplotstmt", "vplotstmt", "plotstmt",
         "ongotostmt", "ongosubstmt", "vtabstmnt", "htabstmnt", "himemstmt", "lomemstmt", "datastmt", "datum", "waitstmt", "xdrawstmt", "drawstmt", "defstmt", "tabstmt", "speedstmt", "rotstmt",
         "scalestmt", "colorstmt", "hcolorstmt", "hlinstmt", "vlinstmt", "onerrstmt", "prstmt", "instmt", "storestmt", "recallstmt", "liststmt", "popstmt", "amptstmt", "includestmt", "endstmt",
         "returnstmt", "func", "signExpression", "exponentExpression", "multiplyingExpression", "addingExpression", "relationalExpression", "expression", "var", "varname", "varsuffix", "varlist",
         "exprlist", "sqrfunc", "chrfunc", "lenfunc", "ascfunc", "midfunc", "pdlfunc", "peekfunc", "intfunc", "spcfunc", "frefunc", "posfunc", "usrfunc", "leftfunc", "rightfunc", "strfunc", "fnfunc",
         "valfunc", "scrnfunc", "sinfunc", "cosfunc", "tanfunc", "atnfunc", "rndfunc", "sgnfunc", "expfunc", "logfunc", "absfunc" };
   public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3}\u036d\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
         + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
         + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
         + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
         + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"
         + "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" + "`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\6\2\u00ca\n\2\r\2\16\2\u00cb\3\3\3\3"
         + "\3\3\3\3\5\3\u00d2\n\3\7\3\u00d4\n\3\f\3\16\3\u00d7\13\3\3\3\3\3\5\3\u00db" + "\n\3\3\3\3\3\3\3\5\3\u00e0\n\3\3\4\3\4\3\5\3\5\3\6\5\6\u00e7\n\6\3\6\3"
         + "\6\3\6\5\6\u00ec\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" + "\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0101\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"
         + "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" + "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"
         + "\7\3\7\5\7\u012f\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0136\n\b\f\b\16\b\u0139" + "\13\b\3\t\3\t\5\t\u013d\n\t\3\n\3\n\5\n\u0141\n\n\3\n\7\n\u0144\n\n\f"
         + "\n\16\n\u0147\13\n\3\13\3\13\3\13\3\f\5\f\u014d\n\f\3\f\3\f\3\r\3\r\3" + "\r\3\r\3\16\3\16\3\16\3\16\5\16\u0159\n\16\3\17\3\17\3\17\3\17\3\17\5"
         + "\17\u0160\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0167\n\20\3\21\3\21\3\22" + "\3\22\3\22\5\22\u016e\n\22\3\22\3\22\5\22\u0172\n\22\3\23\3\23\3\23\3"
         + "\23\3\23\3\23\3\23\3\23\5\23\u017c\n\23\3\24\3\24\5\24\u0180\n\24\3\25" + "\3\25\3\25\5\25\u0185\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"
         + "\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34" + "\3\34\3\34\3\34\3\34\5\34\u01a2\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u01a9"
         + "\n\34\f\34\16\34\u01ac\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u01b3\n\35" + "\3\35\3\35\3\35\3\35\3\35\7\35\u01ba\n\35\f\35\16\35\u01bd\13\35\3\36"
         + "\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01ca\n\37\f\37" + "\16\37\u01cd\13\37\3 \3 \3 \3 \3 \3 \7 \u01d5\n \f \16 \u01d8\13 \3!\3"
         + "!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\5%\u01ec\n%\7%\u01ee" + "\n%\f%\16%\u01f1\13%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01fb\n\'\3(\3"
         + "(\3(\3(\3(\3(\3(\5(\u0204\n(\3)\3)\3)\3)\3)\3)\3)\5)\u020d\n)\3*\3*\3" + "*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3"
         + ".\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3" + "\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3"
         + "\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\58\u0251\n8\39\39\3" + "9\39\39\59\u0258\n9\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3"
         + ">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3" + ">\3>\3>\3>\5>\u0285\n>\3?\5?\u0288\n?\3?\7?\u028b\n?\f?\16?\u028e\13?"
         + "\3?\3?\3@\3@\3@\7@\u0295\n@\f@\16@\u0298\13@\3A\3A\3A\7A\u029d\nA\fA\16" + "A\u02a0\13A\3B\3B\3B\7B\u02a5\nB\fB\16B\u02a8\13B\3C\3C\3C\3C\7C\u02ae"
         + "\nC\fC\16C\u02b1\13C\3D\3D\3D\3D\7D\u02b7\nD\fD\16D\u02ba\13D\5D\u02bc" + "\nD\3E\3E\5E\u02c0\nE\3F\3F\7F\u02c4\nF\fF\16F\u02c7\13F\3G\3G\3H\3H\3"
         + "H\7H\u02ce\nH\fH\16H\u02d1\13H\3I\3I\3I\7I\u02d6\nI\fI\16I\u02d9\13I\3" + "J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3"
         + "N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3" + "R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3"
         + "V\3V\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3" + "Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^"
         + "\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c" + "\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\2e\2\4\6\b\n\f\16\20\22\24\26\30\32\34"
         + "\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082" + "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"
         + "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2" + "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\2\f\3\3|"
         + "|\4\2\6\6uu\4\2\36\36((\4\2\33\34##\4\2xxz{\3\2\24\25\3\2\26\27\3\2LM" + "\3\2yz\3\2\3\4\u0397\2\u00c9\3\2\2\2\4\u00df\3\2\2\2\6\u00e1\3\2\2\2\b"
         + "\u00e3\3\2\2\2\n\u00eb\3\2\2\2\f\u012e\3\2\2\2\16\u0130\3\2\2\2\20\u013a" + "\3\2\2\2\22\u013e\3\2\2\2\24\u0148\3\2\2\2\26\u014c\3\2\2\2\30\u0150\3"
         + "\2\2\2\32\u0158\3\2\2\2\34\u015f\3\2\2\2\36\u0166\3\2\2\2 \u0168\3\2\2" + "\2\"\u016a\3\2\2\2$\u0173\3\2\2\2&\u017d\3\2\2\2(\u0181\3\2\2\2*\u0188"
         + "\3\2\2\2,\u018b\3\2\2\2.\u018e\3\2\2\2\60\u0191\3\2\2\2\62\u0194\3\2\2" + "\2\64\u0199\3\2\2\2\66\u019c\3\2\2\28\u01ad\3\2\2\2:\u01be\3\2\2\2<\u01c3"
         + "\3\2\2\2>\u01ce\3\2\2\2@\u01d9\3\2\2\2B\u01dc\3\2\2\2D\u01df\3\2\2\2F" + "\u01e3\3\2\2\2H\u01e7\3\2\2\2J\u01f2\3\2\2\2L\u01f4\3\2\2\2N\u01fc\3\2"
         + "\2\2P\u0205\3\2\2\2R\u020e\3\2\2\2T\u0217\3\2\2\2V\u021c\3\2\2\2X\u0220" + "\3\2\2\2Z\u0224\3\2\2\2\\\u0228\3\2\2\2^\u022c\3\2\2\2`\u0230\3\2\2\2"
         + "b\u0237\3\2\2\2d\u023e\3\2\2\2f\u0242\3\2\2\2h\u0245\3\2\2\2j\u0248\3" + "\2\2\2l\u024b\3\2\2\2n\u024e\3\2\2\2p\u0252\3\2\2\2r\u0259\3\2\2\2t\u025c"
         + "\3\2\2\2v\u025f\3\2\2\2x\u0261\3\2\2\2z\u0284\3\2\2\2|\u0287\3\2\2\2~" + "\u0291\3\2\2\2\u0080\u0299\3\2\2\2\u0082\u02a1\3\2\2\2\u0084\u02a9\3\2"
         + "\2\2\u0086\u02bb\3\2\2\2\u0088\u02bd\3\2\2\2\u008a\u02c1\3\2\2\2\u008c" + "\u02c8\3\2\2\2\u008e\u02ca\3\2\2\2\u0090\u02d2\3\2\2\2\u0092\u02da\3\2"
         + "\2\2\u0094\u02df\3\2\2\2\u0096\u02e4\3\2\2\2\u0098\u02e9\3\2\2\2\u009a" + "\u02ee\3\2\2\2\u009c\u02f7\3\2\2\2\u009e\u02fc\3\2\2\2\u00a0\u0301\3\2"
         + "\2\2\u00a2\u0306\3\2\2\2\u00a4\u030b\3\2\2\2\u00a6\u0310\3\2\2\2\u00a8" + "\u0315\3\2\2\2\u00aa\u031a\3\2\2\2\u00ac\u0321\3\2\2\2\u00ae\u0328\3\2"
         + "\2\2\u00b0\u032d\3\2\2\2\u00b2\u0333\3\2\2\2\u00b4\u0338\3\2\2\2\u00b6" + "\u033f\3\2\2\2\u00b8\u0344\3\2\2\2\u00ba\u0349\3\2\2\2\u00bc\u034e\3\2"
         + "\2\2\u00be\u0353\3\2\2\2\u00c0\u0358\3\2\2\2\u00c2\u035d\3\2\2\2\u00c4" + "\u0362\3\2\2\2\u00c6\u0367\3\2\2\2\u00c8\u00ca\5\4\3\2\u00c9\u00c8\3\2"
         + "\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc" + "\3\3\2\2\2\u00cd\u00da\5\b\5\2\u00ce\u00d5\5\n\6\2\u00cf\u00d1\7+\2\2"
         + "\u00d0\u00d2\5\n\6\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4" + "\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"
         + "\u00d6\3\2\2\2\u00d6\u00db\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\7w" + "\2\2\u00d9\u00db\7\f\2\2\u00da\u00ce\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"
         + "\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\t\2\2\2\u00dd\u00e0\3\2" + "\2\2\u00de\u00e0\7|\2\2\u00df\u00cd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"
         + "\5\3\2\2\2\u00e1\u00e2\7o\2\2\u00e2\7\3\2\2\2\u00e3\u00e4\7z\2\2\u00e4" + "\t\3\2\2\2\u00e5\u00e7\5\6\4\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2"
         + "\u00e7\u00e8\3\2\2\2\u00e8\u00ec\5\f\7\2\u00e9\u00ec\7w\2\2\u00ea\u00ec" + "\7\f\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec"
         + "\13\3\2\2\2\u00ed\u0101\7t\2\2\u00ee\u0101\7s\2\2\u00ef\u0101\7r\2\2\u00f0" + "\u0101\7J\2\2\u00f1\u0101\7K\2\2\u00f2\u0101\7B\2\2\u00f3\u0101\7C\2\2"
         + "\u00f4\u0101\7p\2\2\u00f5\u0101\7D\2\2\u00f6\u0101\7a\2\2\u00f7\u0101" + "\5x=\2\u00f8\u0101\7\30\2\2\u00f9\u0101\7 \2\2\u00fa\u0101\5v<\2\u00fb"
         + "\u0101\7?\2\2\u00fc\u0101\7,\2\2\u00fd\u0101\78\2\2\u00fe\u0101\7-\2\2" + "\u00ff\u0101\7.\2\2\u0100\u00ed\3\2\2\2\u0100\u00ee\3\2\2\2\u0100\u00ef"
         + "\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00f2\3\2\2\2\u0100" + "\u00f3\3\2\2\2\u0100\u00f4\3\2\2\2\u0100\u00f5\3\2\2\2\u0100\u00f6\3\2"
         + "\2\2\u0100\u00f7\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00f9\3\2\2\2\u0100" + "\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd\3\2"
         + "\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u012f\3\2\2\2\u0102" + "\u012f\5r:\2\u0103\u012f\5p9\2\u0104\u012f\5n8\2\u0105\u012f\5j\66\2\u0106"
         + "\u012f\5\24\13\2\u0107\u012f\5l\67\2\u0108\u012f\5h\65\2\u0109\u012f\5" + "f\64\2\u010a\u012f\5d\63\2\u010b\u012f\5`\61\2\u010c\u012f\5b\62\2\u010d"
         + "\u012f\5\\/\2\u010e\u012f\5V,\2\u010f\u012f\5Z.\2\u0110\u012f\5X-\2\u0111" + "\u012f\5^\60\2\u0112\u012f\5D#\2\u0113\u012f\5F$\2\u0114\u012f\5\20\t"
         + "\2\u0115\u012f\5\62\32\2\u0116\u012f\5:\36\2\u0117\u012f\5<\37\2\u0118" + "\u012f\5> \2\u0119\u012f\5\"\22\2\u011a\u012f\5&\24\2\u011b\u012f\5$\23"
         + "\2\u011c\u012f\5(\25\2\u011d\u012f\5T+\2\u011e\u012f\5,\27\2\u011f\u012f" + "\5.\30\2\u0120\u012f\5\60\31\2\u0121\u012f\5\64\33\2\u0122\u012f\5*\26"
         + "\2\u0123\u012f\5\66\34\2\u0124\u012f\58\35\2\u0125\u012f\5@!\2\u0126\u012f" + "\5B\"\2\u0127\u012f\5L\'\2\u0128\u012f\5H%\2\u0129\u012f\5N(\2\u012a\u012f"
         + "\5P)\2\u012b\u012f\5R*\2\u012c\u012f\5\26\f\2\u012d\u012f\5t;\2\u012e" + "\u0100\3\2\2\2\u012e\u0102\3\2\2\2\u012e\u0103\3\2\2\2\u012e\u0104\3\2"
         + "\2\2\u012e\u0105\3\2\2\2\u012e\u0106\3\2\2\2\u012e\u0107\3\2\2\2\u012e" + "\u0108\3\2\2\2\u012e\u0109\3\2\2\2\u012e\u010a\3\2\2\2\u012e\u010b\3\2"
         + "\2\2\u012e\u010c\3\2\2\2\u012e\u010d\3\2\2\2\u012e\u010e\3\2\2\2\u012e" + "\u010f\3\2\2\2\u012e\u0110\3\2\2\2\u012e\u0111\3\2\2\2\u012e\u0112\3\2"
         + "\2\2\u012e\u0113\3\2\2\2\u012e\u0114\3\2\2\2\u012e\u0115\3\2\2\2\u012e" + "\u0116\3\2\2\2\u012e\u0117\3\2\2\2\u012e\u0118\3\2\2\2\u012e\u0119\3\2"
         + "\2\2\u012e\u011a\3\2\2\2\u012e\u011b\3\2\2\2\u012e\u011c\3\2\2\2\u012e" + "\u011d\3\2\2\2\u012e\u011e\3\2\2\2\u012e\u011f\3\2\2\2\u012e\u0120\3\2"
         + "\2\2\u012e\u0121\3\2\2\2\u012e\u0122\3\2\2\2\u012e\u0123\3\2\2\2\u012e" + "\u0124\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0126\3\2\2\2\u012e\u0127\3\2"
         + "\2\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e" + "\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\r\3\2\2\2"
         + "\u0130\u0137\5\u0088E\2\u0131\u0132\7\22\2\2\u0132\u0133\5\u0090I\2\u0133" + "\u0134\7\23\2\2\u0134\u0136\3\2\2\2\u0135\u0131\3\2\2\2\u0136\u0139\3"
         + "\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\17\3\2\2\2\u0139" + "\u0137\3\2\2\2\u013a\u013c\t\3\2\2\u013b\u013d\5\22\n\2\u013c\u013b\3"
         + "\2\2\2\u013c\u013d\3\2\2\2\u013d\21\3\2\2\2\u013e\u0140\5\u0086D\2\u013f" + "\u0141\t\4\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0145\3\2"
         + "\2\2\u0142\u0144\5\22\n\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145" + "\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\23\3\2\2\2\u0147\u0145\3\2\2"
         + "\2\u0148\u0149\7m\2\2\u0149\u014a\5\u0090I\2\u014a\25\3\2\2\2\u014b\u014d" + "\7\"\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e"
         + "\u014f\5\30\r\2\u014f\27\3\2\2\2\u0150\u0151\5\16\b\2\u0151\u0152\7#\2" + "\2\u0152\u0153\5\u0090I\2\u0153\31\3\2\2\2\u0154\u0159\5\36\20\2\u0155"
         + "\u0159\5\34\17\2\u0156\u0159\5 \21\2\u0157\u0159\t\5\2\2\u0158\u0154\3" + "\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"
         + "\33\3\2\2\2\u015a\u0160\7\31\2\2\u015b\u015c\7\33\2\2\u015c\u0160\7#\2" + "\2\u015d\u015e\7#\2\2\u015e\u0160\7\33\2\2\u015f\u015a\3\2\2\2\u015f\u015b"
         + "\3\2\2\2\u015f\u015d\3\2\2\2\u0160\35\3\2\2\2\u0161\u0167\7\32\2\2\u0162" + "\u0163\7\34\2\2\u0163\u0167\7#\2\2\u0164\u0165\7#\2\2\u0165\u0167\7\34"
         + "\2\2\u0166\u0161\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0164\3\2\2\2\u0167" + "\37\3\2\2\2\u0168\u0169\7\35\2\2\u0169!\3\2\2\2\u016a\u016b\7\t\2\2\u016b"
         + "\u016d\5\u0086D\2\u016c\u016e\7\13\2\2\u016d\u016c\3\2\2\2\u016d\u016e" + "\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0172\5\f\7\2\u0170\u0172\5\b\5\2\u0171"
         + "\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172#\3\2\2\2\u0173\u0174\7$\2\2\u0174" + "\u0175\5\16\b\2\u0175\u0176\7#\2\2\u0176\u0177\5\u0086D\2\u0177\u0178"
         + "\7%\2\2\u0178\u017b\5\u0086D\2\u0179\u017a\7&\2\2\u017a\u017c\5\u0086" + "D\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c%\3\2\2\2\u017d\u017f"
         + "\7\n\2\2\u017e\u0180\5\u008eH\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2" + "\2\u0180\'\3\2\2\2\u0181\u0184\7\'\2\2\u0182\u0183\7x\2\2\u0183\u0185"
         + "\t\4\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186" + "\u0187\5\u008eH\2\u0187)\3\2\2\2\u0188\u0189\7P\2\2\u0189\u018a\5\u008e"
         + "H\2\u018a+\3\2\2\2\u018b\u018c\7)\2\2\u018c\u018d\5\u008eH\2\u018d-\3" + "\2\2\2\u018e\u018f\7\7\2\2\u018f\u0190\5\b\5\2\u0190/\3\2\2\2\u0191\u0192"
         + "\7\b\2\2\u0192\u0193\5\b\5\2\u0193\61\3\2\2\2\u0194\u0195\7=\2\2\u0195" + "\u0196\5\u0086D\2\u0196\u0197\7\36\2\2\u0197\u0198\5\u0086D\2\u0198\63"
         + "\3\2\2\2\u0199\u019a\7\60\2\2\u019a\u019b\5\u0090I\2\u019b\65\3\2\2\2" + "\u019c\u01a1\7\62\2\2\u019d\u019e\5\u0086D\2\u019e\u019f\7\36\2\2\u019f"
         + "\u01a0\5\u0086D\2\u01a0\u01a2\3\2\2\2\u01a1\u019d\3\2\2\2\u01a1\u01a2" + "\3\2\2\2\u01a2\u01aa\3\2\2\2\u01a3\u01a4\7%\2\2\u01a4\u01a5\5\u0086D\2"
         + "\u01a5\u01a6\7\36\2\2\u01a6\u01a7\5\u0086D\2\u01a7\u01a9\3\2\2\2\u01a8" + "\u01a3\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"
         + "\2\2\u01ab\67\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b2\7\63\2\2\u01ae\u01af" + "\5\u0086D\2\u01af\u01b0\7\36\2\2\u01b0\u01b1\5\u0086D\2\u01b1\u01b3\3"
         + "\2\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01bb\3\2\2\2\u01b4" + "\u01b5\7%\2\2\u01b5\u01b6\5\u0086D\2\u01b6\u01b7\7\36\2\2\u01b7\u01b8"
         + "\5\u0086D\2\u01b8\u01ba\3\2\2\2\u01b9\u01b4\3\2\2\2\u01ba\u01bd\3\2\2" + "\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc9\3\2\2\2\u01bd\u01bb"
         + "\3\2\2\2\u01be\u01bf\7;\2\2\u01bf\u01c0\5\u0086D\2\u01c0\u01c1\7\36\2" + "\2\u01c1\u01c2\5\u0086D\2\u01c2;\3\2\2\2\u01c3\u01c4\79\2\2\u01c4\u01c5"
         + "\5\u0086D\2\u01c5\u01c6\7\7\2\2\u01c6\u01cb\5\b\5\2\u01c7\u01c8\7\36\2" + "\2\u01c8\u01ca\5\b\5\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9"
         + "\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc=\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce" + "\u01cf\79\2\2\u01cf\u01d0\5\u0086D\2\u01d0\u01d1\7\b\2\2\u01d1\u01d6\5"
         + "\b\5\2\u01d2\u01d3\7\36\2\2\u01d3\u01d5\5\b\5\2\u01d4\u01d2\3\2\2\2\u01d5" + "\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7?\3\2\2\2"
         + "\u01d8\u01d6\3\2\2\2\u01d9\u01da\7\66\2\2\u01da\u01db\5\u0086D\2\u01db" + "A\3\2\2\2\u01dc\u01dd\7\67\2\2\u01dd\u01de\5\u0086D\2\u01deC\3\2\2\2\u01df"
         + "\u01e0\7@\2\2\u01e0\u01e1\7+\2\2\u01e1\u01e2\5\u0086D\2\u01e2E\3\2\2\2" + "\u01e3\u01e4\7A\2\2\u01e4\u01e5\7+\2\2\u01e5\u01e6\5\u0086D\2\u01e6G\3"
         + "\2\2\2\u01e7\u01e8\7N\2\2\u01e8\u01ef\5J&\2\u01e9\u01eb\7\36\2\2\u01ea" + "\u01ec\5J&\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2"
         + "\2\u01ed\u01e9\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0" + "\3\2\2\2\u01f0I\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\t\6\2\2\u01f3"
         + "K\3\2\2\2\u01f4\u01f5\7O\2\2\u01f5\u01f6\5\u0086D\2\u01f6\u01f7\7\36\2" + "\2\u01f7\u01fa\5\u0086D\2\u01f8\u01f9\7\36\2\2\u01f9\u01fb\5\u0086D\2"
         + "\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fbM\3\2\2\2\u01fc\u01fd\7" + "Q\2\2\u01fd\u0203\5\u0086D\2\u01fe\u01ff\7S\2\2\u01ff\u0200\5\u0086D\2"
         + "\u0200\u0201\7\36\2\2\u0201\u0202\5\u0086D\2\u0202\u0204\3\2\2\2\u0203" + "\u01fe\3\2\2\2\u0203\u0204\3\2\2\2\u0204O\3\2\2\2\u0205\u0206\7R\2\2\u0206"
         + "\u020c\5\u0086D\2\u0207\u0208\7S\2\2\u0208\u0209\5\u0086D\2\u0209\u020a" + "\7\36\2\2\u020a\u020b\5\u0086D\2\u020b\u020d\3\2\2\2\u020c\u0207\3\2\2"
         + "\2\u020c\u020d\3\2\2\2\u020dQ\3\2\2\2\u020e\u020f\7T\2\2\u020f\u0210\7" + "U\2\2\u0210\u0211\5\u0088E\2\u0211\u0212\7\22\2\2\u0212\u0213\5\u0088"
         + "E\2\u0213\u0214\7\23\2\2\u0214\u0215\7#\2\2\u0215\u0216\5\u0086D\2\u0216" + "S\3\2\2\2\u0217\u0218\7W\2\2\u0218\u0219\7\22\2\2\u0219\u021a\5\u0086"
         + "D\2\u021a\u021b\7\23\2\2\u021bU\3\2\2\2\u021c\u021d\7X\2\2\u021d\u021e" + "\7#\2\2\u021e\u021f\5\u0086D\2\u021fW\3\2\2\2\u0220\u0221\7Y\2\2\u0221"
         + "\u0222\7#\2\2\u0222\u0223\5\u0086D\2\u0223Y\3\2\2\2\u0224\u0225\7Z\2\2" + "\u0225\u0226\7#\2\2\u0226\u0227\5\u0086D\2\u0227[\3\2\2\2\u0228\u0229"
         + "\7[\2\2\u0229\u022a\7#\2\2\u022a\u022b\5\u0086D\2\u022b]\3\2\2\2\u022c" + "\u022d\7\\\2\2\u022d\u022e\7#\2\2\u022e\u022f\5\u0086D\2\u022f_\3\2\2"
         + "\2\u0230\u0231\7]\2\2\u0231\u0232\5\u0086D\2\u0232\u0233\7\36\2\2\u0233" + "\u0234\5\u0086D\2\u0234\u0235\7S\2\2\u0235\u0236\5\u0086D\2\u0236a\3\2"
         + "\2\2\u0237\u0238\7^\2\2\u0238\u0239\5\u0086D\2\u0239\u023a\7\36\2\2\u023a" + "\u023b\5\u0086D\2\u023b\u023c\7S\2\2\u023c\u023d\5\u0086D\2\u023dc\3\2"
         + "\2\2\u023e\u023f\7E\2\2\u023f\u0240\7\7\2\2\u0240\u0241\5\b\5\2\u0241" + "e\3\2\2\2\u0242\u0243\7\64\2\2\u0243\u0244\7z\2\2\u0244g\3\2\2\2\u0245"
         + "\u0246\7\65\2\2\u0246\u0247\7z\2\2\u0247i\3\2\2\2\u0248\u0249\7k\2\2\u0249" + "\u024a\5\16\b\2\u024ak\3\2\2\2\u024b\u024c\7l\2\2\u024c\u024d\5\16\b\2"
         + "\u024dm\3\2\2\2\u024e\u0250\7\37\2\2\u024f\u0251\5\u0086D\2\u0250\u024f" + "\3\2\2\2\u0250\u0251\3\2\2\2\u0251o\3\2\2\2\u0252\u0257\7`\2\2\u0253\u0254"
         + "\5\u0086D\2\u0254\u0255\7\36\2\2\u0255\u0256\5\u0086D\2\u0256\u0258\3" + "\2\2\2\u0257\u0253\3\2\2\2\u0257\u0258\3\2\2\2\u0258q\3\2\2\2\u0259\u025a"
         + "\7o\2\2\u025a\u025b\5\u0086D\2\u025bs\3\2\2\2\u025c\u025d\7v\2\2\u025d" + "\u025e\5\u0086D\2\u025eu\3\2\2\2\u025f\u0260\7!\2\2\u0260w\3\2\2\2\u0261"
         + "\u0262\7\5\2\2\u0262y\3\2\2\2\u0263\u0285\t\6\2\2\u0264\u0285\5\16\b\2" + "\u0265\u0285\5\u0094K\2\u0266\u0285\5\u0092J\2\u0267\u0285\5\u0096L\2"
         + "\u0268\u0285\5\u00aeX\2\u0269\u0285\5\u0098M\2\u026a\u0285\5\u00b4[\2" + "\u026b\u0285\5\u009aN\2\u026c\u0285\5\u009cO\2\u026d\u0285\5\u009eP\2"
         + "\u026e\u0285\5\u00a0Q\2\u026f\u0285\5\u00a2R\2\u0270\u0285\5\u00a4S\2" + "\u0271\u0285\5\u00a6T\2\u0272\u0285\5\u00a8U\2\u0273\u0285\5\u00aaV\2"
         + "\u0274\u0285\5\u00b2Z\2\u0275\u0285\5\u00acW\2\u0276\u0285\5\u00b0Y\2" + "\u0277\u0285\5\u00b6\\\2\u0278\u0285\5\u00b8]\2\u0279\u0285\5\u00ba^\2"
         + "\u027a\u0285\5\u00bc_\2\u027b\u0285\5\u00be`\2\u027c\u0285\5\u00c0a\2" + "\u027d\u0285\5\u00c2b\2\u027e\u0285\5\u00c4c\2\u027f\u0285\5\u00c6d\2"
         + "\u0280\u0281\7\22\2\2\u0281\u0282\5\u0086D\2\u0282\u0283\7\23\2\2\u0283" + "\u0285\3\2\2\2\u0284\u0263\3\2\2\2\u0284\u0264\3\2\2\2\u0284\u0265\3\2"
         + "\2\2\u0284\u0266\3\2\2\2\u0284\u0267\3\2\2\2\u0284\u0268\3\2\2\2\u0284" + "\u0269\3\2\2\2\u0284\u026a\3\2\2\2\u0284\u026b\3\2\2\2\u0284\u026c\3\2"
         + "\2\2\u0284\u026d\3\2\2\2\u0284\u026e\3\2\2\2\u0284\u026f\3\2\2\2\u0284" + "\u0270\3\2\2\2\u0284\u0271\3\2\2\2\u0284\u0272\3\2\2\2\u0284\u0273\3\2"
         + "\2\2\u0284\u0274\3\2\2\2\u0284\u0275\3\2\2\2\u0284\u0276\3\2\2\2\u0284" + "\u0277\3\2\2\2\u0284\u0278\3\2\2\2\u0284\u0279\3\2\2\2\u0284\u027a\3\2"
         + "\2\2\u0284\u027b\3\2\2\2\u0284\u027c\3\2\2\2\u0284\u027d\3\2\2\2\u0284" + "\u027e\3\2\2\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2\2\2\u0285{\3\2\2\2"
         + "\u0286\u0288\7q\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028c" + "\3\2\2\2\u0289\u028b\t\7\2\2\u028a\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c"
         + "\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2" + "\2\2\u028f\u0290\5z>\2\u0290}\3\2\2\2\u0291\u0296\5|?\2\u0292\u0293\7"
         + "n\2\2\u0293\u0295\5|?\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296" + "\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\177\3\2\2\2\u0298\u0296\3\2\2"
         + "\2\u0299\u029e\5~@\2\u029a\u029b\t\b\2\2\u029b\u029d\5~@\2\u029c\u029a" + "\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"
         + "\u0081\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a6\5\u0080A\2\u02a2\u02a3" + "\t\7\2\2\u02a3\u02a5\5\u0080A\2\u02a4\u02a2\3\2\2\2\u02a5\u02a8\3\2\2"
         + "\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u0083\3\2\2\2\u02a8\u02a6" + "\3\2\2\2\u02a9\u02af\5\u0082B\2\u02aa\u02ab\5\32\16\2\u02ab\u02ac\5\u0082"
         + "B\2\u02ac\u02ae\3\2\2\2\u02ad\u02aa\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af" + "\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u0085\3\2\2\2\u02b1\u02af\3\2"
         + "\2\2\u02b2\u02bc\5z>\2\u02b3\u02b8\5\u0084C\2\u02b4\u02b5\t\t\2\2\u02b5" + "\u02b7\5\u0084C\2\u02b6\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6"
         + "\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb" + "\u02b2\3\2\2\2\u02bb\u02b3\3\2\2\2\u02bc\u0087\3\2\2\2\u02bd\u02bf\5\u008a"
         + "F\2\u02be\u02c0\5\u008cG\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0" + "\u0089\3\2\2\2\u02c1\u02c5\7y\2\2\u02c2\u02c4\t\n\2\2\u02c3\u02c2\3\2"
         + "\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6" + "\u008b\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\t\13\2\2\u02c9\u008d\3"
         + "\2\2\2\u02ca\u02cf\5\16\b\2\u02cb\u02cc\7\36\2\2\u02cc\u02ce\5\16\b\2" + "\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0"
         + "\3\2\2\2\u02d0\u008f\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d7\5\u0086D" + "\2\u02d3\u02d4\7\36\2\2\u02d4\u02d6\5\u0086D\2\u02d5\u02d3\3\2\2\2\u02d6"
         + "\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u0091\3\2" + "\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7*\2\2\u02db\u02dc\7\22\2\2\u02dc"
         + "\u02dd\5\u0086D\2\u02dd\u02de\7\23\2\2\u02de\u0093\3\2\2\2\u02df\u02e0" + "\7\r\2\2\u02e0\u02e1\7\22\2\2\u02e1\u02e2\5\u0086D\2\u02e2\u02e3\7\23"
         + "\2\2\u02e3\u0095\3\2\2\2\u02e4\u02e5\7/\2\2\u02e5\u02e6\7\22\2\2\u02e6" + "\u02e7\5\u0086D\2\u02e7\u02e8\7\23\2\2\u02e8\u0097\3\2\2\2\u02e9\u02ea"
         + "\7\61\2\2\u02ea\u02eb\7\22\2\2\u02eb\u02ec\5\u0086D\2\u02ec\u02ed\7\23" + "\2\2\u02ed\u0099\3\2\2\2\u02ee\u02ef\7\16\2\2\u02ef\u02f0\7\22\2\2\u02f0"
         + "\u02f1\5\u0086D\2\u02f1\u02f2\7\36\2\2\u02f2\u02f3\5\u0086D\2\u02f3\u02f4" + "\7\36\2\2\u02f4\u02f5\5\u0086D\2\u02f5\u02f6\7\23\2\2\u02f6\u009b\3\2"
         + "\2\2\u02f7\u02f8\7:\2\2\u02f8\u02f9\7\22\2\2\u02f9\u02fa\5\u0086D\2\u02fa" + "\u02fb\7\23\2\2\u02fb\u009d\3\2\2\2\u02fc\u02fd\7<\2\2\u02fd\u02fe\7\22"
         + "\2\2\u02fe\u02ff\5\u0086D\2\u02ff\u0300\7\23\2\2\u0300\u009f\3\2\2\2\u0301" + "\u0302\7>\2\2\u0302\u0303\7\22\2\2\u0303\u0304\5\u0086D\2\u0304\u0305"
         + "\7\23\2\2\u0305\u00a1\3\2\2\2\u0306\u0307\7F\2\2\u0307\u0308\7\22\2\2" + "\u0308\u0309\5\u0086D\2\u0309\u030a\7\23\2\2\u030a\u00a3\3\2\2\2\u030b"
         + "\u030c\7G\2\2\u030c\u030d\7\22\2\2\u030d\u030e\5\u0086D\2\u030e\u030f" + "\7\23\2\2\u030f\u00a5\3\2\2\2\u0310\u0311\7H\2\2\u0311\u0312\7\22\2\2"
         + "\u0312\u0313\5\u0086D\2\u0313\u0314\7\23\2\2\u0314\u00a7\3\2\2\2\u0315" + "\u0316\7I\2\2\u0316\u0317\7\22\2\2\u0317\u0318\5\u0086D\2\u0318\u0319"
         + "\7\23\2\2\u0319\u00a9\3\2\2\2\u031a\u031b\7\17\2\2\u031b\u031c\7\22\2" + "\2\u031c\u031d\5\u0086D\2\u031d\u031e\7\36\2\2\u031e\u031f\5\u0086D\2"
         + "\u031f\u0320\7\23\2\2\u0320\u00ab\3\2\2\2\u0321\u0322\7\20\2\2\u0322\u0323" + "\7\22\2\2\u0323\u0324\5\u0086D\2\u0324\u0325\7\36\2\2\u0325\u0326\5\u0086"
         + "D\2\u0326\u0327\7\23\2\2\u0327\u00ad\3\2\2\2\u0328\u0329\7\21\2\2\u0329" + "\u032a\7\22\2\2\u032a\u032b\5\u0086D\2\u032b\u032c\7\23\2\2\u032c\u00af"
         + "\3\2\2\2\u032d\u032e\7U\2\2\u032e\u032f\5\u0088E\2\u032f\u0330\7\22\2" + "\2\u0330\u0331\5\u0086D\2\u0331\u0332\7\23\2\2\u0332\u00b1\3\2\2\2\u0333"
         + "\u0334\7V\2\2\u0334\u0335\7\22\2\2\u0335\u0336\5\u0086D\2\u0336\u0337" + "\7\23\2\2\u0337\u00b3\3\2\2\2\u0338\u0339\7_\2\2\u0339\u033a\7\22\2\2"
         + "\u033a\u033b\5\u0086D\2\u033b\u033c\7\36\2\2\u033c\u033d\5\u0086D\2\u033d" + "\u033e\7\23\2\2\u033e\u00b5\3\2\2\2\u033f\u0340\7b\2\2\u0340\u0341\7\22"
         + "\2\2\u0341\u0342\5\u0086D\2\u0342\u0343\7\23\2\2\u0343\u00b7\3\2\2\2\u0344" + "\u0345\7c\2\2\u0345\u0346\7\22\2\2\u0346\u0347\5\u0086D\2\u0347\u0348"
         + "\7\23\2\2\u0348\u00b9\3\2\2\2\u0349\u034a\7d\2\2\u034a\u034b\7\22\2\2" + "\u034b\u034c\5\u0086D\2\u034c\u034d\7\23\2\2\u034d\u00bb\3\2\2\2\u034e"
         + "\u034f\7e\2\2\u034f\u0350\7\22\2\2\u0350\u0351\5\u0086D\2\u0351\u0352" + "\7\23\2\2\u0352\u00bd\3\2\2\2\u0353\u0354\7f\2\2\u0354\u0355\7\22\2\2"
         + "\u0355\u0356\5\u0086D\2\u0356\u0357\7\23\2\2\u0357\u00bf\3\2\2\2\u0358" + "\u0359\7g\2\2\u0359\u035a\7\22\2\2\u035a\u035b\5\u0086D\2\u035b\u035c"
         + "\7\23\2\2\u035c\u00c1\3\2\2\2\u035d\u035e\7h\2\2\u035e\u035f\7\22\2\2" + "\u035f\u0360\5\u0086D\2\u0360\u0361\7\23\2\2\u0361\u00c3\3\2\2\2\u0362"
         + "\u0363\7i\2\2\u0363\u0364\7\22\2\2\u0364\u0365\5\u0086D\2\u0365\u0366" + "\7\23\2\2\u0366\u00c5\3\2\2\2\u0367\u0368\7j\2\2\u0368\u0369\7\22\2\2"
         + "\u0369\u036a\5\u0086D\2\u036a\u036b\7\23\2\2\u036b\u00c7\3\2\2\2\62\u00cb" + "\u00d1\u00d5\u00da\u00df\u00e6\u00eb\u0100\u012e\u0137\u013c\u0140\u0145"
         + "\u014c\u0158\u015f\u0166\u016d\u0171\u017b\u017f\u0184\u01a1\u01aa\u01b2" + "\u01bb\u01cb\u01d6\u01eb\u01ef\u01fa\u0203\u020c\u0250\u0257\u0284\u0287"
         + "\u028c\u0296\u029e\u02a6\u02af\u02b8\u02bb\u02bf\u02c5\u02cf\u02d7";
   public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN.toCharArray());
   static {
      _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
      for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
         _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
      }
   }

   public jvmBasicParser(TokenStream input) {
      super(input);
      _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
   }

   public final AbsfuncContext absfunc() throws RecognitionException {
      final AbsfuncContext _localctx = new AbsfuncContext(_ctx, getState());
      enterRule(_localctx, 196, RULE_absfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(869);
            match(ABS);
            setState(870);
            match(LPAREN);
            setState(871);
            expression();
            setState(872);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AddingExpressionContext addingExpression() throws RecognitionException {
      final AddingExpressionContext _localctx = new AddingExpressionContext(_ctx, getState());
      enterRule(_localctx, 128, RULE_addingExpression);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(671);
            multiplyingExpression();
            setState(676);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(672);
                        _la = _input.LA(1);
                        if (!((_la == PLUS) || (_la == MINUS))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(673);
                        multiplyingExpression();
                     }
                  }
               }
               setState(678);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 40, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AmperoperContext amperoper() throws RecognitionException {
      final AmperoperContext _localctx = new AmperoperContext(_ctx, getState());
      enterRule(_localctx, 4, RULE_amperoper);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(223);
            match(AMPERSAND);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AmprstmtContext amprstmt() throws RecognitionException {
      final AmprstmtContext _localctx = new AmprstmtContext(_ctx, getState());
      enterRule(_localctx, 8, RULE_amprstmt);
      try {
         setState(233);
         switch (_input.LA(1)) {
            case RETURN:
            case PRINT:
            case GOTO:
            case GOSUB:
            case IF:
            case NEXT:
            case CLEAR:
            case LIST:
            case RUN:
            case END:
            case LET:
            case FOR:
            case INPUT:
            case DIM:
            case TEXT:
            case HGR:
            case HGR2:
            case CALL:
            case HPLOT:
            case VPLOT:
            case PRNUMBER:
            case INNUMBER:
            case VTAB:
            case HTAB:
            case HOME:
            case ON:
            case PLOT:
            case POKE:
            case STOP:
            case HIMEM:
            case LOMEM:
            case FLASH:
            case INVERSE:
            case NORMAL:
            case ONERR:
            case TRACE:
            case NOTRACE:
            case DATA:
            case WAIT:
            case READ:
            case XDRAW:
            case DRAW:
            case DEF:
            case TAB:
            case SPEED:
            case ROT:
            case SCALE:
            case COLOR:
            case HCOLOR:
            case HLIN:
            case VLIN:
            case POP:
            case SHLOAD:
            case STORE:
            case RECALL:
            case GET:
            case AMPERSAND:
            case GR:
            case RESTORE:
            case SAVE:
            case LOAD:
            case QUESTION:
            case INCLUDE:
            case LETTERS:
               enterOuterAlt(_localctx, 1);
               {
                  {
                     setState(228);
                     switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                        case 1: {
                           setState(227);
                           amperoper();
                        }
                           break;
                     }
                     setState(230);
                     statement();
                  }
               }
               break;
            case COMMENT:
               enterOuterAlt(_localctx, 2);
               {
                  setState(231);
                  match(COMMENT);
               }
               break;
            case REM:
               enterOuterAlt(_localctx, 3);
               {
                  setState(232);
                  match(REM);
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AmptstmtContext amptstmt() throws RecognitionException {
      final AmptstmtContext _localctx = new AmptstmtContext(_ctx, getState());
      enterRule(_localctx, 112, RULE_amptstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(599);
            match(AMPERSAND);
            setState(600);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AscfuncContext ascfunc() throws RecognitionException {
      final AscfuncContext _localctx = new AscfuncContext(_ctx, getState());
      enterRule(_localctx, 150, RULE_ascfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(743);
            match(ASC);
            setState(744);
            match(LPAREN);
            setState(745);
            expression();
            setState(746);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final AtnfuncContext atnfunc() throws RecognitionException {
      final AtnfuncContext _localctx = new AtnfuncContext(_ctx, getState());
      enterRule(_localctx, 186, RULE_atnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(844);
            match(ATN);
            setState(845);
            match(LPAREN);
            setState(846);
            expression();
            setState(847);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final CallstmtContext callstmt() throws RecognitionException {
      final CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
      enterRule(_localctx, 50, RULE_callstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(407);
            match(CALL);
            setState(408);
            exprlist();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ChrfuncContext chrfunc() throws RecognitionException {
      final ChrfuncContext _localctx = new ChrfuncContext(_ctx, getState());
      enterRule(_localctx, 146, RULE_chrfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(733);
            match(CHR);
            setState(734);
            match(LPAREN);
            setState(735);
            expression();
            setState(736);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ColorstmtContext colorstmt() throws RecognitionException {
      final ColorstmtContext _localctx = new ColorstmtContext(_ctx, getState());
      enterRule(_localctx, 90, RULE_colorstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(550);
            match(COLOR);
            setState(551);
            match(EQ);
            setState(552);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final CosfuncContext cosfunc() throws RecognitionException {
      final CosfuncContext _localctx = new CosfuncContext(_ctx, getState());
      enterRule(_localctx, 182, RULE_cosfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(834);
            match(COS);
            setState(835);
            match(LPAREN);
            setState(836);
            expression();
            setState(837);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final DatastmtContext datastmt() throws RecognitionException {
      final DatastmtContext _localctx = new DatastmtContext(_ctx, getState());
      enterRule(_localctx, 70, RULE_datastmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(485);
            match(DATA);
            setState(486);
            datum();
            setState(493);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(487);
                     match(COMMA);
                     setState(489);
                     _la = _input.LA(1);
                     if ((((((_la - 118)) & ~0x3f) == 0) && (((1L << (_la - 118)) & ((1L << (STRINGLITERAL - 118)) | (1L << (NUMBER - 118)) | (1L << (FLOAT - 118)))) != 0))) {
                        {
                           setState(488);
                           datum();
                        }
                     }
                  }
               }
               setState(495);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final DatumContext datum() throws RecognitionException {
      final DatumContext _localctx = new DatumContext(_ctx, getState());
      enterRule(_localctx, 72, RULE_datum);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(496);
            _la = _input.LA(1);
            if (!((((((_la - 118)) & ~0x3f) == 0) && (((1L << (_la - 118)) & ((1L << (STRINGLITERAL - 118)) | (1L << (NUMBER - 118)) | (1L << (FLOAT - 118)))) != 0)))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final DefstmtContext defstmt() throws RecognitionException {
      final DefstmtContext _localctx = new DefstmtContext(_ctx, getState());
      enterRule(_localctx, 80, RULE_defstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(524);
            match(DEF);
            setState(525);
            match(FN);
            setState(526);
            var();
            setState(527);
            match(LPAREN);
            setState(528);
            var();
            setState(529);
            match(RPAREN);
            setState(530);
            match(EQ);
            setState(531);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final DimstmtContext dimstmt() throws RecognitionException {
      final DimstmtContext _localctx = new DimstmtContext(_ctx, getState());
      enterRule(_localctx, 42, RULE_dimstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(393);
            match(DIM);
            setState(394);
            varlist();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final DrawstmtContext drawstmt() throws RecognitionException {
      final DrawstmtContext _localctx = new DrawstmtContext(_ctx, getState());
      enterRule(_localctx, 78, RULE_drawstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(515);
            match(DRAW);
            setState(516);
            expression();
            setState(522);
            _la = _input.LA(1);
            if (_la == AT) {
               {
                  setState(517);
                  match(AT);
                  setState(518);
                  expression();
                  setState(519);
                  match(COMMA);
                  setState(520);
                  expression();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final EndstmtContext endstmt() throws RecognitionException {
      final EndstmtContext _localctx = new EndstmtContext(_ctx, getState());
      enterRule(_localctx, 116, RULE_endstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(605);
            match(END);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ExpfuncContext expfunc() throws RecognitionException {
      final ExpfuncContext _localctx = new ExpfuncContext(_ctx, getState());
      enterRule(_localctx, 192, RULE_expfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(859);
            match(EXP);
            setState(860);
            match(LPAREN);
            setState(861);
            expression();
            setState(862);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ExponentExpressionContext exponentExpression() throws RecognitionException {
      final ExponentExpressionContext _localctx = new ExponentExpressionContext(_ctx, getState());
      enterRule(_localctx, 124, RULE_exponentExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(655);
            signExpression();
            setState(660);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == EXPONENT) {
               {
                  {
                     setState(656);
                     match(EXPONENT);
                     setState(657);
                     signExpression();
                  }
               }
               setState(662);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ExpressionContext expression() throws RecognitionException {
      final ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
      enterRule(_localctx, 132, RULE_expression);
      int _la;
      try {
         setState(697);
         switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(688);
                  func();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(689);
                     relationalExpression();
                     setState(694);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                     while ((_la == AND) || (_la == OR)) {
                        {
                           {
                              setState(690);
                              _la = _input.LA(1);
                              if (!((_la == AND) || (_la == OR))) {
                                 _errHandler.recoverInline(this);
                              }
                              consume();
                              setState(691);
                              relationalExpression();
                           }
                        }
                        setState(696);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                     }
                  }
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ExprlistContext exprlist() throws RecognitionException {
      final ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
      enterRule(_localctx, 142, RULE_exprlist);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(720);
            expression();
            setState(725);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(721);
                     match(COMMA);
                     setState(722);
                     expression();
                  }
               }
               setState(727);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FnfuncContext fnfunc() throws RecognitionException {
      final FnfuncContext _localctx = new FnfuncContext(_ctx, getState());
      enterRule(_localctx, 174, RULE_fnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(811);
            match(FN);
            setState(812);
            var();
            setState(813);
            match(LPAREN);
            setState(814);
            expression();
            setState(815);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ForstmtContext forstmt() throws RecognitionException {
      final ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
      enterRule(_localctx, 34, RULE_forstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(369);
            match(FOR);
            setState(370);
            vardecl();
            setState(371);
            match(EQ);
            setState(372);
            expression();
            setState(373);
            match(TO);
            setState(374);
            expression();
            setState(377);
            _la = _input.LA(1);
            if (_la == STEP) {
               {
                  setState(375);
                  match(STEP);
                  setState(376);
                  expression();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FrefuncContext frefunc() throws RecognitionException {
      final FrefuncContext _localctx = new FrefuncContext(_ctx, getState());
      enterRule(_localctx, 162, RULE_frefunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(777);
            match(FRE);
            setState(778);
            match(LPAREN);
            setState(779);
            expression();
            setState(780);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final FuncContext func() throws RecognitionException {
      final FuncContext _localctx = new FuncContext(_ctx, getState());
      enterRule(_localctx, 120, RULE_func);
      int _la;
      try {
         setState(642);
         switch (_input.LA(1)) {
            case STRINGLITERAL:
            case NUMBER:
            case FLOAT:
               enterOuterAlt(_localctx, 1);
               {
                  setState(609);
                  _la = _input.LA(1);
                  if (!((((((_la - 118)) & ~0x3f) == 0) && (((1L << (_la - 118)) & ((1L << (STRINGLITERAL - 118)) | (1L << (NUMBER - 118)) | (1L << (FLOAT - 118)))) != 0)))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
               break;
            case LETTERS:
               enterOuterAlt(_localctx, 2);
               {
                  setState(610);
                  vardecl();
               }
               break;
            case CHR:
               enterOuterAlt(_localctx, 3);
               {
                  setState(611);
                  chrfunc();
               }
               break;
            case SQR:
               enterOuterAlt(_localctx, 4);
               {
                  setState(612);
                  sqrfunc();
               }
               break;
            case LEN:
               enterOuterAlt(_localctx, 5);
               {
                  setState(613);
                  lenfunc();
               }
               break;
            case STR:
               enterOuterAlt(_localctx, 6);
               {
                  setState(614);
                  strfunc();
               }
               break;
            case ASC:
               enterOuterAlt(_localctx, 7);
               {
                  setState(615);
                  ascfunc();
               }
               break;
            case SCRN:
               enterOuterAlt(_localctx, 8);
               {
                  setState(616);
                  scrnfunc();
               }
               break;
            case MID:
               enterOuterAlt(_localctx, 9);
               {
                  setState(617);
                  midfunc();
               }
               break;
            case PDL:
               enterOuterAlt(_localctx, 10);
               {
                  setState(618);
                  pdlfunc();
               }
               break;
            case PEEK:
               enterOuterAlt(_localctx, 11);
               {
                  setState(619);
                  peekfunc();
               }
               break;
            case INTF:
               enterOuterAlt(_localctx, 12);
               {
                  setState(620);
                  intfunc();
               }
               break;
            case SPC:
               enterOuterAlt(_localctx, 13);
               {
                  setState(621);
                  spcfunc();
               }
               break;
            case FRE:
               enterOuterAlt(_localctx, 14);
               {
                  setState(622);
                  frefunc();
               }
               break;
            case POS:
               enterOuterAlt(_localctx, 15);
               {
                  setState(623);
                  posfunc();
               }
               break;
            case USR:
               enterOuterAlt(_localctx, 16);
               {
                  setState(624);
                  usrfunc();
               }
               break;
            case LEFT:
               enterOuterAlt(_localctx, 17);
               {
                  setState(625);
                  leftfunc();
               }
               break;
            case VAL:
               enterOuterAlt(_localctx, 18);
               {
                  setState(626);
                  valfunc();
               }
               break;
            case RIGHT:
               enterOuterAlt(_localctx, 19);
               {
                  setState(627);
                  rightfunc();
               }
               break;
            case FN:
               enterOuterAlt(_localctx, 20);
               {
                  setState(628);
                  fnfunc();
               }
               break;
            case SIN:
               enterOuterAlt(_localctx, 21);
               {
                  setState(629);
                  sinfunc();
               }
               break;
            case COS:
               enterOuterAlt(_localctx, 22);
               {
                  setState(630);
                  cosfunc();
               }
               break;
            case TAN:
               enterOuterAlt(_localctx, 23);
               {
                  setState(631);
                  tanfunc();
               }
               break;
            case ATN:
               enterOuterAlt(_localctx, 24);
               {
                  setState(632);
                  atnfunc();
               }
               break;
            case RND:
               enterOuterAlt(_localctx, 25);
               {
                  setState(633);
                  rndfunc();
               }
               break;
            case SGN:
               enterOuterAlt(_localctx, 26);
               {
                  setState(634);
                  sgnfunc();
               }
               break;
            case EXP:
               enterOuterAlt(_localctx, 27);
               {
                  setState(635);
                  expfunc();
               }
               break;
            case LOG:
               enterOuterAlt(_localctx, 28);
               {
                  setState(636);
                  logfunc();
               }
               break;
            case ABS:
               enterOuterAlt(_localctx, 29);
               {
                  setState(637);
                  absfunc();
               }
               break;
            case LPAREN:
               enterOuterAlt(_localctx, 30);
               {
                  {
                     setState(638);
                     match(LPAREN);
                     setState(639);
                     expression();
                     setState(640);
                     match(RPAREN);
                  }
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   @Override
   public ATN getATN() {
      return _ATN;
   }

   @Override
   public String getGrammarFileName() {
      return "jvmBasic.g4";
   }

   @Override
   public String[] getRuleNames() {
      return ruleNames;
   }

   public final GetstmtContext getstmt() throws RecognitionException {
      final GetstmtContext _localctx = new GetstmtContext(_ctx, getState());
      enterRule(_localctx, 18, RULE_getstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(326);
            match(GET);
            setState(327);
            exprlist();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   @Override
   public String[] getTokenNames() {
      return tokenNames;
   }

   public final GosubstmtContext gosubstmt() throws RecognitionException {
      final GosubstmtContext _localctx = new GosubstmtContext(_ctx, getState());
      enterRule(_localctx, 46, RULE_gosubstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(399);
            match(GOSUB);
            setState(400);
            linenumber();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final GotostmtContext gotostmt() throws RecognitionException {
      final GotostmtContext _localctx = new GotostmtContext(_ctx, getState());
      enterRule(_localctx, 44, RULE_gotostmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(396);
            match(GOTO);
            setState(397);
            linenumber();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final GteContext gte() throws RecognitionException {
      final GteContext _localctx = new GteContext(_ctx, getState());
      enterRule(_localctx, 26, RULE_gte);
      try {
         setState(349);
         switch (_input.LA(1)) {
            case GTE:
               enterOuterAlt(_localctx, 1);
               {
                  setState(344);
                  match(GTE);
               }
               break;
            case GT:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(345);
                     match(GT);
                     setState(346);
                     match(EQ);
                  }
               }
               break;
            case EQ:
               enterOuterAlt(_localctx, 3);
               {
                  {
                     setState(347);
                     match(EQ);
                     setState(348);
                     match(GT);
                  }
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HcolorstmtContext hcolorstmt() throws RecognitionException {
      final HcolorstmtContext _localctx = new HcolorstmtContext(_ctx, getState());
      enterRule(_localctx, 92, RULE_hcolorstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(554);
            match(HCOLOR);
            setState(555);
            match(EQ);
            setState(556);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HimemstmtContext himemstmt() throws RecognitionException {
      final HimemstmtContext _localctx = new HimemstmtContext(_ctx, getState());
      enterRule(_localctx, 66, RULE_himemstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(477);
            match(HIMEM);
            setState(478);
            match(COLON);
            setState(479);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HlinstmtContext hlinstmt() throws RecognitionException {
      final HlinstmtContext _localctx = new HlinstmtContext(_ctx, getState());
      enterRule(_localctx, 94, RULE_hlinstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(558);
            match(HLIN);
            setState(559);
            expression();
            setState(560);
            match(COMMA);
            setState(561);
            expression();
            setState(562);
            match(AT);
            setState(563);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HplotstmtContext hplotstmt() throws RecognitionException {
      final HplotstmtContext _localctx = new HplotstmtContext(_ctx, getState());
      enterRule(_localctx, 52, RULE_hplotstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(410);
            match(HPLOT);
            setState(415);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(411);
                  expression();
                  setState(412);
                  match(COMMA);
                  setState(413);
                  expression();
               }
            }
            setState(424);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == TO) {
               {
                  {
                     setState(417);
                     match(TO);
                     setState(418);
                     expression();
                     setState(419);
                     match(COMMA);
                     setState(420);
                     expression();
                  }
               }
               setState(426);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final HtabstmntContext htabstmnt() throws RecognitionException {
      final HtabstmntContext _localctx = new HtabstmntContext(_ctx, getState());
      enterRule(_localctx, 64, RULE_htabstmnt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(474);
            match(HTAB);
            setState(475);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final IfstmtContext ifstmt() throws RecognitionException {
      final IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
      enterRule(_localctx, 32, RULE_ifstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(360);
            match(IF);
            setState(361);
            expression();
            setState(363);
            _la = _input.LA(1);
            if (_la == THEN) {
               {
                  setState(362);
                  match(THEN);
               }
            }
            setState(367);
            switch (_input.LA(1)) {
               case RETURN:
               case PRINT:
               case GOTO:
               case GOSUB:
               case IF:
               case NEXT:
               case CLEAR:
               case LIST:
               case RUN:
               case END:
               case LET:
               case FOR:
               case INPUT:
               case DIM:
               case TEXT:
               case HGR:
               case HGR2:
               case CALL:
               case HPLOT:
               case VPLOT:
               case PRNUMBER:
               case INNUMBER:
               case VTAB:
               case HTAB:
               case HOME:
               case ON:
               case PLOT:
               case POKE:
               case STOP:
               case HIMEM:
               case LOMEM:
               case FLASH:
               case INVERSE:
               case NORMAL:
               case ONERR:
               case TRACE:
               case NOTRACE:
               case DATA:
               case WAIT:
               case READ:
               case XDRAW:
               case DRAW:
               case DEF:
               case TAB:
               case SPEED:
               case ROT:
               case SCALE:
               case COLOR:
               case HCOLOR:
               case HLIN:
               case VLIN:
               case POP:
               case SHLOAD:
               case STORE:
               case RECALL:
               case GET:
               case AMPERSAND:
               case GR:
               case RESTORE:
               case SAVE:
               case LOAD:
               case QUESTION:
               case INCLUDE:
               case LETTERS: {
                  setState(365);
                  statement();
               }
                  break;
               case NUMBER: {
                  setState(366);
                  linenumber();
               }
                  break;
               default:
                  throw new NoViableAltException(this);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final IncludestmtContext includestmt() throws RecognitionException {
      final IncludestmtContext _localctx = new IncludestmtContext(_ctx, getState());
      enterRule(_localctx, 114, RULE_includestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(602);
            match(INCLUDE);
            setState(603);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final InputstmtContext inputstmt() throws RecognitionException {
      final InputstmtContext _localctx = new InputstmtContext(_ctx, getState());
      enterRule(_localctx, 38, RULE_inputstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(383);
            match(INPUT);
            setState(386);
            _la = _input.LA(1);
            if (_la == STRINGLITERAL) {
               {
                  setState(384);
                  match(STRINGLITERAL);
                  setState(385);
                  _la = _input.LA(1);
                  if (!((_la == COMMA) || (_la == SEMICOLON))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
            }
            setState(388);
            varlist();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final InstmtContext instmt() throws RecognitionException {
      final InstmtContext _localctx = new InstmtContext(_ctx, getState());
      enterRule(_localctx, 102, RULE_instmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(579);
            match(INNUMBER);
            setState(580);
            match(NUMBER);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final IntfuncContext intfunc() throws RecognitionException {
      final IntfuncContext _localctx = new IntfuncContext(_ctx, getState());
      enterRule(_localctx, 158, RULE_intfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(767);
            match(INTF);
            setState(768);
            match(LPAREN);
            setState(769);
            expression();
            setState(770);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LeftfuncContext leftfunc() throws RecognitionException {
      final LeftfuncContext _localctx = new LeftfuncContext(_ctx, getState());
      enterRule(_localctx, 168, RULE_leftfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(792);
            match(LEFT);
            setState(793);
            match(LPAREN);
            setState(794);
            expression();
            setState(795);
            match(COMMA);
            setState(796);
            expression();
            setState(797);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LenfuncContext lenfunc() throws RecognitionException {
      final LenfuncContext _localctx = new LenfuncContext(_ctx, getState());
      enterRule(_localctx, 148, RULE_lenfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(738);
            match(LEN);
            setState(739);
            match(LPAREN);
            setState(740);
            expression();
            setState(741);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LetstmtContext letstmt() throws RecognitionException {
      final LetstmtContext _localctx = new LetstmtContext(_ctx, getState());
      enterRule(_localctx, 20, RULE_letstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(330);
            _la = _input.LA(1);
            if (_la == LET) {
               {
                  setState(329);
                  match(LET);
               }
            }
            setState(332);
            variableassignment();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LineContext line() throws RecognitionException {
      final LineContext _localctx = new LineContext(_ctx, getState());
      enterRule(_localctx, 2, RULE_line);
      int _la;
      try {
         setState(221);
         switch (_input.LA(1)) {
            case NUMBER:
               enterOuterAlt(_localctx, 1);
               {
                  {
                     setState(203);
                     linenumber();
                     setState(216);
                     switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                        case 1: {
                           {
                              setState(204);
                              amprstmt();
                              setState(211);
                              _errHandler.sync(this);
                              _la = _input.LA(1);
                              while (_la == COLON) {
                                 {
                                    {
                                       setState(205);
                                       match(COLON);
                                       setState(207);
                                       _la = _input.LA(1);
                                       if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << GOTO) | (1L << GOSUB) | (1L << IF) | (1L << NEXT) | (1L << REM)
                                             | (1L << CLEAR) | (1L << LIST) | (1L << RUN) | (1L << END) | (1L << LET) | (1L << FOR) | (1L << INPUT) | (1L << DIM) | (1L << TEXT) | (1L << HGR)
                                             | (1L << HGR2) | (1L << CALL) | (1L << HPLOT) | (1L << VPLOT) | (1L << PRNUMBER) | (1L << INNUMBER) | (1L << VTAB) | (1L << HTAB) | (1L << HOME)
                                             | (1L << ON) | (1L << PLOT) | (1L << POKE) | (1L << STOP) | (1L << HIMEM) | (1L << LOMEM))) != 0))
                                             || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (FLASH - 64)) | (1L << (INVERSE - 64)) | (1L << (NORMAL - 64)) | (1L << (ONERR - 64))
                                                   | (1L << (TRACE - 64)) | (1L << (NOTRACE - 64)) | (1L << (DATA - 64)) | (1L << (WAIT - 64)) | (1L << (READ - 64)) | (1L << (XDRAW - 64))
                                                   | (1L << (DRAW - 64)) | (1L << (DEF - 64)) | (1L << (TAB - 64)) | (1L << (SPEED - 64)) | (1L << (ROT - 64)) | (1L << (SCALE - 64))
                                                   | (1L << (COLOR - 64)) | (1L << (HCOLOR - 64)) | (1L << (HLIN - 64)) | (1L << (VLIN - 64)) | (1L << (POP - 64)) | (1L << (SHLOAD - 64))
                                                   | (1L << (STORE - 64)) | (1L << (RECALL - 64)) | (1L << (GET - 64)) | (1L << (AMPERSAND - 64)) | (1L << (GR - 64)) | (1L << (RESTORE - 64))
                                                   | (1L << (SAVE - 64)) | (1L << (LOAD - 64)) | (1L << (QUESTION - 64)) | (1L << (INCLUDE - 64)) | (1L << (COMMENT - 64)) | (1L << (LETTERS - 64)))) != 0))) {
                                          {
                                             setState(206);
                                             amprstmt();
                                          }
                                       }
                                    }
                                 }
                                 setState(213);
                                 _errHandler.sync(this);
                                 _la = _input.LA(1);
                              }
                           }
                        }
                           break;
                        case 2: {
                           setState(214);
                           match(COMMENT);
                        }
                           break;
                        case 3: {
                           setState(215);
                           match(REM);
                        }
                           break;
                     }
                     setState(218);
                     _la = _input.LA(1);
                     if (!((_la == EOF) || (_la == CR))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                  }
               }
               break;
            case CR:
               enterOuterAlt(_localctx, 2);
               {
                  setState(220);
                  match(CR);
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LinenumberContext linenumber() throws RecognitionException {
      final LinenumberContext _localctx = new LinenumberContext(_ctx, getState());
      enterRule(_localctx, 6, RULE_linenumber);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(225);
            match(NUMBER);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ListstmtContext liststmt() throws RecognitionException {
      final ListstmtContext _localctx = new ListstmtContext(_ctx, getState());
      enterRule(_localctx, 108, RULE_liststmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(588);
            match(LIST);
            setState(590);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(589);
                  expression();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LogfuncContext logfunc() throws RecognitionException {
      final LogfuncContext _localctx = new LogfuncContext(_ctx, getState());
      enterRule(_localctx, 194, RULE_logfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(864);
            match(LOG);
            setState(865);
            match(LPAREN);
            setState(866);
            expression();
            setState(867);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LomemstmtContext lomemstmt() throws RecognitionException {
      final LomemstmtContext _localctx = new LomemstmtContext(_ctx, getState());
      enterRule(_localctx, 68, RULE_lomemstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(481);
            match(LOMEM);
            setState(482);
            match(COLON);
            setState(483);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final LteContext lte() throws RecognitionException {
      final LteContext _localctx = new LteContext(_ctx, getState());
      enterRule(_localctx, 28, RULE_lte);
      try {
         setState(356);
         switch (_input.LA(1)) {
            case LTE:
               enterOuterAlt(_localctx, 1);
               {
                  setState(351);
                  match(LTE);
               }
               break;
            case LT:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(352);
                     match(LT);
                     setState(353);
                     match(EQ);
                  }
               }
               break;
            case EQ:
               enterOuterAlt(_localctx, 3);
               {
                  {
                     setState(354);
                     match(EQ);
                     setState(355);
                     match(LT);
                  }
               }
               break;
            default:
               throw new NoViableAltException(this);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final MidfuncContext midfunc() throws RecognitionException {
      final MidfuncContext _localctx = new MidfuncContext(_ctx, getState());
      enterRule(_localctx, 152, RULE_midfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(748);
            match(MID);
            setState(749);
            match(LPAREN);
            setState(750);
            expression();
            setState(751);
            match(COMMA);
            setState(752);
            expression();
            setState(753);
            match(COMMA);
            setState(754);
            expression();
            setState(755);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
      final MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
      enterRule(_localctx, 126, RULE_multiplyingExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(663);
            exponentExpression();
            setState(668);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((_la == TIMES) || (_la == DIV)) {
               {
                  {
                     setState(664);
                     _la = _input.LA(1);
                     if (!((_la == TIMES) || (_la == DIV))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                     setState(665);
                     exponentExpression();
                  }
               }
               setState(670);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final NeqContext neq() throws RecognitionException {
      final NeqContext _localctx = new NeqContext(_ctx, getState());
      enterRule(_localctx, 30, RULE_neq);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(358);
            match(NEQ);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final NextstmtContext nextstmt() throws RecognitionException {
      final NextstmtContext _localctx = new NextstmtContext(_ctx, getState());
      enterRule(_localctx, 36, RULE_nextstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(379);
            match(NEXT);
            setState(381);
            _la = _input.LA(1);
            if (_la == LETTERS) {
               {
                  setState(380);
                  varlist();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final OnerrstmtContext onerrstmt() throws RecognitionException {
      final OnerrstmtContext _localctx = new OnerrstmtContext(_ctx, getState());
      enterRule(_localctx, 98, RULE_onerrstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(572);
            match(ONERR);
            setState(573);
            match(GOTO);
            setState(574);
            linenumber();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final OngosubstmtContext ongosubstmt() throws RecognitionException {
      final OngosubstmtContext _localctx = new OngosubstmtContext(_ctx, getState());
      enterRule(_localctx, 60, RULE_ongosubstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(460);
            match(ON);
            setState(461);
            expression();
            setState(462);
            match(GOSUB);
            setState(463);
            linenumber();
            setState(468);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(464);
                     match(COMMA);
                     setState(465);
                     linenumber();
                  }
               }
               setState(470);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final OngotostmtContext ongotostmt() throws RecognitionException {
      final OngotostmtContext _localctx = new OngotostmtContext(_ctx, getState());
      enterRule(_localctx, 58, RULE_ongotostmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(449);
            match(ON);
            setState(450);
            expression();
            setState(451);
            match(GOTO);
            setState(452);
            linenumber();
            setState(457);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(453);
                     match(COMMA);
                     setState(454);
                     linenumber();
                  }
               }
               setState(459);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PdlfuncContext pdlfunc() throws RecognitionException {
      final PdlfuncContext _localctx = new PdlfuncContext(_ctx, getState());
      enterRule(_localctx, 154, RULE_pdlfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(757);
            match(PDL);
            setState(758);
            match(LPAREN);
            setState(759);
            expression();
            setState(760);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PeekfuncContext peekfunc() throws RecognitionException {
      final PeekfuncContext _localctx = new PeekfuncContext(_ctx, getState());
      enterRule(_localctx, 156, RULE_peekfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(762);
            match(PEEK);
            setState(763);
            match(LPAREN);
            setState(764);
            expression();
            setState(765);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PlotstmtContext plotstmt() throws RecognitionException {
      final PlotstmtContext _localctx = new PlotstmtContext(_ctx, getState());
      enterRule(_localctx, 56, RULE_plotstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(444);
            match(PLOT);
            setState(445);
            expression();
            setState(446);
            match(COMMA);
            setState(447);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PokestmtContext pokestmt() throws RecognitionException {
      final PokestmtContext _localctx = new PokestmtContext(_ctx, getState());
      enterRule(_localctx, 48, RULE_pokestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(402);
            match(POKE);
            setState(403);
            expression();
            setState(404);
            match(COMMA);
            setState(405);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PopstmtContext popstmt() throws RecognitionException {
      final PopstmtContext _localctx = new PopstmtContext(_ctx, getState());
      enterRule(_localctx, 110, RULE_popstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(592);
            match(POP);
            setState(597);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(593);
                  expression();
                  setState(594);
                  match(COMMA);
                  setState(595);
                  expression();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PosfuncContext posfunc() throws RecognitionException {
      final PosfuncContext _localctx = new PosfuncContext(_ctx, getState());
      enterRule(_localctx, 164, RULE_posfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(782);
            match(POS);
            setState(783);
            match(LPAREN);
            setState(784);
            expression();
            setState(785);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PrintlistContext printlist() throws RecognitionException {
      final PrintlistContext _localctx = new PrintlistContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_printlist);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(316);
            expression();
            setState(318);
            _la = _input.LA(1);
            if ((_la == COMMA) || (_la == SEMICOLON)) {
               {
                  setState(317);
                  _la = _input.LA(1);
                  if (!((_la == COMMA) || (_la == SEMICOLON))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
            }
            setState(323);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(320);
                        printlist();
                     }
                  }
               }
               setState(325);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final Printstmt1Context printstmt1() throws RecognitionException {
      final Printstmt1Context _localctx = new Printstmt1Context(_ctx, getState());
      enterRule(_localctx, 14, RULE_printstmt1);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(312);
            _la = _input.LA(1);
            if (!((_la == PRINT) || (_la == QUESTION))) {
               _errHandler.recoverInline(this);
            }
            consume();
            setState(314);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(313);
                  printlist();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ProgContext prog() throws RecognitionException {
      final ProgContext _localctx = new ProgContext(_ctx, getState());
      enterRule(_localctx, 0, RULE_prog);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(199);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(198);
                     line();
                  }
               }
               setState(201);
               _errHandler.sync(this);
               _la = _input.LA(1);
            } while ((_la == NUMBER) || (_la == CR));
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final PrstmtContext prstmt() throws RecognitionException {
      final PrstmtContext _localctx = new PrstmtContext(_ctx, getState());
      enterRule(_localctx, 100, RULE_prstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(576);
            match(PRNUMBER);
            setState(577);
            match(NUMBER);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ReadstmtContext readstmt() throws RecognitionException {
      final ReadstmtContext _localctx = new ReadstmtContext(_ctx, getState());
      enterRule(_localctx, 40, RULE_readstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(390);
            match(READ);
            setState(391);
            varlist();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RecallstmtContext recallstmt() throws RecognitionException {
      final RecallstmtContext _localctx = new RecallstmtContext(_ctx, getState());
      enterRule(_localctx, 106, RULE_recallstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(585);
            match(RECALL);
            setState(586);
            vardecl();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RelationalExpressionContext relationalExpression() throws RecognitionException {
      final RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
      enterRule(_localctx, 130, RULE_relationalExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(679);
            addingExpression();
            setState(685);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << GTE) | (1L << LTE) | (1L << GT) | (1L << LT) | (1L << NEQ) | (1L << EQ))) != 0))) {
               {
                  {
                     {
                        setState(680);
                        relop();
                     }
                     setState(681);
                     addingExpression();
                  }
               }
               setState(687);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RelopContext relop() throws RecognitionException {
      final RelopContext _localctx = new RelopContext(_ctx, getState());
      enterRule(_localctx, 24, RULE_relop);
      int _la;
      try {
         setState(342);
         switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(338);
                  lte();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(339);
                  gte();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(340);
                  neq();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(341);
                  _la = _input.LA(1);
                  if (!(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ReturnstmtContext returnstmt() throws RecognitionException {
      final ReturnstmtContext _localctx = new ReturnstmtContext(_ctx, getState());
      enterRule(_localctx, 118, RULE_returnstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(607);
            match(RETURN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RightfuncContext rightfunc() throws RecognitionException {
      final RightfuncContext _localctx = new RightfuncContext(_ctx, getState());
      enterRule(_localctx, 170, RULE_rightfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(799);
            match(RIGHT);
            setState(800);
            match(LPAREN);
            setState(801);
            expression();
            setState(802);
            match(COMMA);
            setState(803);
            expression();
            setState(804);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RndfuncContext rndfunc() throws RecognitionException {
      final RndfuncContext _localctx = new RndfuncContext(_ctx, getState());
      enterRule(_localctx, 188, RULE_rndfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(849);
            match(RND);
            setState(850);
            match(LPAREN);
            setState(851);
            expression();
            setState(852);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final RotstmtContext rotstmt() throws RecognitionException {
      final RotstmtContext _localctx = new RotstmtContext(_ctx, getState());
      enterRule(_localctx, 86, RULE_rotstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(542);
            match(ROT);
            setState(543);
            match(EQ);
            setState(544);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ScalestmtContext scalestmt() throws RecognitionException {
      final ScalestmtContext _localctx = new ScalestmtContext(_ctx, getState());
      enterRule(_localctx, 88, RULE_scalestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(546);
            match(SCALE);
            setState(547);
            match(EQ);
            setState(548);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ScrnfuncContext scrnfunc() throws RecognitionException {
      final ScrnfuncContext _localctx = new ScrnfuncContext(_ctx, getState());
      enterRule(_localctx, 178, RULE_scrnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(822);
            match(SCRN);
            setState(823);
            match(LPAREN);
            setState(824);
            expression();
            setState(825);
            match(COMMA);
            setState(826);
            expression();
            setState(827);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SgnfuncContext sgnfunc() throws RecognitionException {
      final SgnfuncContext _localctx = new SgnfuncContext(_ctx, getState());
      enterRule(_localctx, 190, RULE_sgnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(854);
            match(SGN);
            setState(855);
            match(LPAREN);
            setState(856);
            expression();
            setState(857);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SignExpressionContext signExpression() throws RecognitionException {
      final SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
      enterRule(_localctx, 122, RULE_signExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(645);
            _la = _input.LA(1);
            if (_la == NOT) {
               {
                  setState(644);
                  match(NOT);
               }
            }
            setState(650);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((_la == PLUS) || (_la == MINUS)) {
               {
                  {
                     setState(647);
                     _la = _input.LA(1);
                     if (!((_la == PLUS) || (_la == MINUS))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                  }
               }
               setState(652);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(653);
            func();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SinfuncContext sinfunc() throws RecognitionException {
      final SinfuncContext _localctx = new SinfuncContext(_ctx, getState());
      enterRule(_localctx, 180, RULE_sinfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(829);
            match(SIN);
            setState(830);
            match(LPAREN);
            setState(831);
            expression();
            setState(832);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SpcfuncContext spcfunc() throws RecognitionException {
      final SpcfuncContext _localctx = new SpcfuncContext(_ctx, getState());
      enterRule(_localctx, 160, RULE_spcfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(772);
            match(SPC);
            setState(773);
            match(LPAREN);
            setState(774);
            expression();
            setState(775);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SpeedstmtContext speedstmt() throws RecognitionException {
      final SpeedstmtContext _localctx = new SpeedstmtContext(_ctx, getState());
      enterRule(_localctx, 84, RULE_speedstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(538);
            match(SPEED);
            setState(539);
            match(EQ);
            setState(540);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final SqrfuncContext sqrfunc() throws RecognitionException {
      final SqrfuncContext _localctx = new SqrfuncContext(_ctx, getState());
      enterRule(_localctx, 144, RULE_sqrfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(728);
            match(SQR);
            setState(729);
            match(LPAREN);
            setState(730);
            expression();
            setState(731);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final StatementContext statement() throws RecognitionException {
      final StatementContext _localctx = new StatementContext(_ctx, getState());
      enterRule(_localctx, 10, RULE_statement);
      try {
         setState(300);
         switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(254);
                  switch (_input.LA(1)) {
                     case LOAD: {
                        setState(235);
                        match(LOAD);
                     }
                        break;
                     case SAVE: {
                        setState(236);
                        match(SAVE);
                     }
                        break;
                     case RESTORE: {
                        setState(237);
                        match(RESTORE);
                     }
                        break;
                     case TRACE: {
                        setState(238);
                        match(TRACE);
                     }
                        break;
                     case NOTRACE: {
                        setState(239);
                        match(NOTRACE);
                     }
                        break;
                     case FLASH: {
                        setState(240);
                        match(FLASH);
                     }
                        break;
                     case INVERSE: {
                        setState(241);
                        match(INVERSE);
                     }
                        break;
                     case GR: {
                        setState(242);
                        match(GR);
                     }
                        break;
                     case NORMAL: {
                        setState(243);
                        match(NORMAL);
                     }
                        break;
                     case SHLOAD: {
                        setState(244);
                        match(SHLOAD);
                     }
                        break;
                     case RETURN: {
                        setState(245);
                        returnstmt();
                     }
                        break;
                     case CLEAR: {
                        setState(246);
                        match(CLEAR);
                     }
                        break;
                     case RUN: {
                        setState(247);
                        match(RUN);
                     }
                        break;
                     case END: {
                        setState(248);
                        endstmt();
                     }
                        break;
                     case STOP: {
                        setState(249);
                        match(STOP);
                     }
                        break;
                     case TEXT: {
                        setState(250);
                        match(TEXT);
                     }
                        break;
                     case HOME: {
                        setState(251);
                        match(HOME);
                     }
                        break;
                     case HGR: {
                        setState(252);
                        match(HGR);
                     }
                        break;
                     case HGR2: {
                        setState(253);
                        match(HGR2);
                     }
                        break;
                     default:
                        throw new NoViableAltException(this);
                  }
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(256);
                  amptstmt();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(257);
                  popstmt();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(258);
                  liststmt();
               }
               break;
            case 5:
               enterOuterAlt(_localctx, 5);
               {
                  setState(259);
                  storestmt();
               }
               break;
            case 6:
               enterOuterAlt(_localctx, 6);
               {
                  setState(260);
                  getstmt();
               }
               break;
            case 7:
               enterOuterAlt(_localctx, 7);
               {
                  setState(261);
                  recallstmt();
               }
               break;
            case 8:
               enterOuterAlt(_localctx, 8);
               {
                  setState(262);
                  instmt();
               }
               break;
            case 9:
               enterOuterAlt(_localctx, 9);
               {
                  setState(263);
                  prstmt();
               }
               break;
            case 10:
               enterOuterAlt(_localctx, 10);
               {
                  setState(264);
                  onerrstmt();
               }
               break;
            case 11:
               enterOuterAlt(_localctx, 11);
               {
                  setState(265);
                  hlinstmt();
               }
               break;
            case 12:
               enterOuterAlt(_localctx, 12);
               {
                  setState(266);
                  vlinstmt();
               }
               break;
            case 13:
               enterOuterAlt(_localctx, 13);
               {
                  setState(267);
                  colorstmt();
               }
               break;
            case 14:
               enterOuterAlt(_localctx, 14);
               {
                  setState(268);
                  speedstmt();
               }
               break;
            case 15:
               enterOuterAlt(_localctx, 15);
               {
                  setState(269);
                  scalestmt();
               }
               break;
            case 16:
               enterOuterAlt(_localctx, 16);
               {
                  setState(270);
                  rotstmt();
               }
               break;
            case 17:
               enterOuterAlt(_localctx, 17);
               {
                  setState(271);
                  hcolorstmt();
               }
               break;
            case 18:
               enterOuterAlt(_localctx, 18);
               {
                  setState(272);
                  himemstmt();
               }
               break;
            case 19:
               enterOuterAlt(_localctx, 19);
               {
                  setState(273);
                  lomemstmt();
               }
               break;
            case 20:
               enterOuterAlt(_localctx, 20);
               {
                  setState(274);
                  printstmt1();
               }
               break;
            case 21:
               enterOuterAlt(_localctx, 21);
               {
                  setState(275);
                  pokestmt();
               }
               break;
            case 22:
               enterOuterAlt(_localctx, 22);
               {
                  setState(276);
                  plotstmt();
               }
               break;
            case 23:
               enterOuterAlt(_localctx, 23);
               {
                  setState(277);
                  ongotostmt();
               }
               break;
            case 24:
               enterOuterAlt(_localctx, 24);
               {
                  setState(278);
                  ongosubstmt();
               }
               break;
            case 25:
               enterOuterAlt(_localctx, 25);
               {
                  setState(279);
                  ifstmt();
               }
               break;
            case 26:
               enterOuterAlt(_localctx, 26);
               {
                  setState(280);
                  nextstmt();
               }
               break;
            case 27:
               enterOuterAlt(_localctx, 27);
               {
                  setState(281);
                  forstmt();
               }
               break;
            case 28:
               enterOuterAlt(_localctx, 28);
               {
                  setState(282);
                  inputstmt();
               }
               break;
            case 29:
               enterOuterAlt(_localctx, 29);
               {
                  setState(283);
                  tabstmt();
               }
               break;
            case 30:
               enterOuterAlt(_localctx, 30);
               {
                  setState(284);
                  dimstmt();
               }
               break;
            case 31:
               enterOuterAlt(_localctx, 31);
               {
                  setState(285);
                  gotostmt();
               }
               break;
            case 32:
               enterOuterAlt(_localctx, 32);
               {
                  setState(286);
                  gosubstmt();
               }
               break;
            case 33:
               enterOuterAlt(_localctx, 33);
               {
                  setState(287);
                  callstmt();
               }
               break;
            case 34:
               enterOuterAlt(_localctx, 34);
               {
                  setState(288);
                  readstmt();
               }
               break;
            case 35:
               enterOuterAlt(_localctx, 35);
               {
                  setState(289);
                  hplotstmt();
               }
               break;
            case 36:
               enterOuterAlt(_localctx, 36);
               {
                  setState(290);
                  vplotstmt();
               }
               break;
            case 37:
               enterOuterAlt(_localctx, 37);
               {
                  setState(291);
                  vtabstmnt();
               }
               break;
            case 38:
               enterOuterAlt(_localctx, 38);
               {
                  setState(292);
                  htabstmnt();
               }
               break;
            case 39:
               enterOuterAlt(_localctx, 39);
               {
                  setState(293);
                  waitstmt();
               }
               break;
            case 40:
               enterOuterAlt(_localctx, 40);
               {
                  setState(294);
                  datastmt();
               }
               break;
            case 41:
               enterOuterAlt(_localctx, 41);
               {
                  setState(295);
                  xdrawstmt();
               }
               break;
            case 42:
               enterOuterAlt(_localctx, 42);
               {
                  setState(296);
                  drawstmt();
               }
               break;
            case 43:
               enterOuterAlt(_localctx, 43);
               {
                  setState(297);
                  defstmt();
               }
               break;
            case 44:
               enterOuterAlt(_localctx, 44);
               {
                  setState(298);
                  letstmt();
               }
               break;
            case 45:
               enterOuterAlt(_localctx, 45);
               {
                  setState(299);
                  includestmt();
               }
               break;
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final StorestmtContext storestmt() throws RecognitionException {
      final StorestmtContext _localctx = new StorestmtContext(_ctx, getState());
      enterRule(_localctx, 104, RULE_storestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(582);
            match(STORE);
            setState(583);
            vardecl();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final StrfuncContext strfunc() throws RecognitionException {
      final StrfuncContext _localctx = new StrfuncContext(_ctx, getState());
      enterRule(_localctx, 172, RULE_strfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(806);
            match(STR);
            setState(807);
            match(LPAREN);
            setState(808);
            expression();
            setState(809);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final TabstmtContext tabstmt() throws RecognitionException {
      final TabstmtContext _localctx = new TabstmtContext(_ctx, getState());
      enterRule(_localctx, 82, RULE_tabstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(533);
            match(TAB);
            setState(534);
            match(LPAREN);
            setState(535);
            expression();
            setState(536);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final TanfuncContext tanfunc() throws RecognitionException {
      final TanfuncContext _localctx = new TanfuncContext(_ctx, getState());
      enterRule(_localctx, 184, RULE_tanfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(839);
            match(TAN);
            setState(840);
            match(LPAREN);
            setState(841);
            expression();
            setState(842);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final UsrfuncContext usrfunc() throws RecognitionException {
      final UsrfuncContext _localctx = new UsrfuncContext(_ctx, getState());
      enterRule(_localctx, 166, RULE_usrfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(787);
            match(USR);
            setState(788);
            match(LPAREN);
            setState(789);
            expression();
            setState(790);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final ValfuncContext valfunc() throws RecognitionException {
      final ValfuncContext _localctx = new ValfuncContext(_ctx, getState());
      enterRule(_localctx, 176, RULE_valfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(817);
            match(VAL);
            setState(818);
            match(LPAREN);
            setState(819);
            expression();
            setState(820);
            match(RPAREN);
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VarContext var() throws RecognitionException {
      final VarContext _localctx = new VarContext(_ctx, getState());
      enterRule(_localctx, 134, RULE_var);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(699);
            varname();
            setState(701);
            _la = _input.LA(1);
            if ((_la == DOLLAR) || (_la == PERCENT)) {
               {
                  setState(700);
                  varsuffix();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VardeclContext vardecl() throws RecognitionException {
      final VardeclContext _localctx = new VardeclContext(_ctx, getState());
      enterRule(_localctx, 12, RULE_vardecl);
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(302);
            var();
            setState(309);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(303);
                        match(LPAREN);
                        setState(304);
                        exprlist();
                        setState(305);
                        match(RPAREN);
                     }
                  }
               }
               setState(311);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VariableassignmentContext variableassignment() throws RecognitionException {
      final VariableassignmentContext _localctx = new VariableassignmentContext(_ctx, getState());
      enterRule(_localctx, 22, RULE_variableassignment);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(334);
            vardecl();
            setState(335);
            match(EQ);
            setState(336);
            exprlist();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VarlistContext varlist() throws RecognitionException {
      final VarlistContext _localctx = new VarlistContext(_ctx, getState());
      enterRule(_localctx, 140, RULE_varlist);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(712);
            vardecl();
            setState(717);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(713);
                     match(COMMA);
                     setState(714);
                     vardecl();
                  }
               }
               setState(719);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VarnameContext varname() throws RecognitionException {
      final VarnameContext _localctx = new VarnameContext(_ctx, getState());
      enterRule(_localctx, 136, RULE_varname);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(703);
            match(LETTERS);
            setState(707);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(704);
                        _la = _input.LA(1);
                        if (!((_la == LETTERS) || (_la == NUMBER))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                     }
                  }
               }
               setState(709);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 45, _ctx);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VarsuffixContext varsuffix() throws RecognitionException {
      final VarsuffixContext _localctx = new VarsuffixContext(_ctx, getState());
      enterRule(_localctx, 138, RULE_varsuffix);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(710);
            _la = _input.LA(1);
            if (!((_la == DOLLAR) || (_la == PERCENT))) {
               _errHandler.recoverInline(this);
            }
            consume();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VlinstmtContext vlinstmt() throws RecognitionException {
      final VlinstmtContext _localctx = new VlinstmtContext(_ctx, getState());
      enterRule(_localctx, 96, RULE_vlinstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(565);
            match(VLIN);
            setState(566);
            expression();
            setState(567);
            match(COMMA);
            setState(568);
            expression();
            setState(569);
            match(AT);
            setState(570);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VplotstmtContext vplotstmt() throws RecognitionException {
      final VplotstmtContext _localctx = new VplotstmtContext(_ctx, getState());
      enterRule(_localctx, 54, RULE_vplotstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(427);
            match(VPLOT);
            setState(432);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(428);
                  expression();
                  setState(429);
                  match(COMMA);
                  setState(430);
                  expression();
               }
            }
            setState(441);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == TO) {
               {
                  {
                     setState(434);
                     match(TO);
                     setState(435);
                     expression();
                     setState(436);
                     match(COMMA);
                     setState(437);
                     expression();
                  }
               }
               setState(443);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final VtabstmntContext vtabstmnt() throws RecognitionException {
      final VtabstmntContext _localctx = new VtabstmntContext(_ctx, getState());
      enterRule(_localctx, 62, RULE_vtabstmnt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(471);
            match(VTAB);
            setState(472);
            expression();
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final WaitstmtContext waitstmt() throws RecognitionException {
      final WaitstmtContext _localctx = new WaitstmtContext(_ctx, getState());
      enterRule(_localctx, 74, RULE_waitstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(498);
            match(WAIT);
            setState(499);
            expression();
            setState(500);
            match(COMMA);
            setState(501);
            expression();
            setState(504);
            _la = _input.LA(1);
            if (_la == COMMA) {
               {
                  setState(502);
                  match(COMMA);
                  setState(503);
                  expression();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }

   public final XdrawstmtContext xdrawstmt() throws RecognitionException {
      final XdrawstmtContext _localctx = new XdrawstmtContext(_ctx, getState());
      enterRule(_localctx, 76, RULE_xdrawstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(506);
            match(XDRAW);
            setState(507);
            expression();
            setState(513);
            _la = _input.LA(1);
            if (_la == AT) {
               {
                  setState(508);
                  match(AT);
                  setState(509);
                  expression();
                  setState(510);
                  match(COMMA);
                  setState(511);
                  expression();
               }
            }
         }
      } catch (final RecognitionException re) {
         _localctx.exception = re;
         _errHandler.reportError(this, re);
         _errHandler.recover(this, re);
      } finally {
         exitRule();
      }
      return _localctx;
   }
}