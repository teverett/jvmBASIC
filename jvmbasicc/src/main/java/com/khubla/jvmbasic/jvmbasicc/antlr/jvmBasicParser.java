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

   public static class RestorestmtContext extends ParserRuleContext {
      public RestorestmtContext(ParserRuleContext parent, int invokingState) {
         super(parent, invokingState);
      }

      @Override
      public void enterRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).enterRestorestmt(this);
         }
      }

      @Override
      public void exitRule(ParseTreeListener listener) {
         if (listener instanceof jvmBasicListener) {
            ((jvmBasicListener) listener).exitRestorestmt(this);
         }
      }

      @Override
      public int getRuleIndex() {
         return RULE_restorestmt;
      }

      public TerminalNode RESTORE() {
         return getToken(jvmBasicParser.RESTORE, 0);
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

      public RestorestmtContext restorestmt() {
         return getRuleContext(RestorestmtContext.class, 0);
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
         RULE_popstmt = 55, RULE_amptstmt = 56, RULE_includestmt = 57, RULE_endstmt = 58, RULE_returnstmt = 59, RULE_restorestmt = 60, RULE_func = 61, RULE_signExpression = 62,
         RULE_exponentExpression = 63, RULE_multiplyingExpression = 64, RULE_addingExpression = 65, RULE_relationalExpression = 66, RULE_expression = 67, RULE_var = 68, RULE_varname = 69,
         RULE_varsuffix = 70, RULE_varlist = 71, RULE_exprlist = 72, RULE_sqrfunc = 73, RULE_chrfunc = 74, RULE_lenfunc = 75, RULE_ascfunc = 76, RULE_midfunc = 77, RULE_pdlfunc = 78,
         RULE_peekfunc = 79, RULE_intfunc = 80, RULE_spcfunc = 81, RULE_frefunc = 82, RULE_posfunc = 83, RULE_usrfunc = 84, RULE_leftfunc = 85, RULE_rightfunc = 86, RULE_strfunc = 87,
         RULE_fnfunc = 88, RULE_valfunc = 89, RULE_scrnfunc = 90, RULE_sinfunc = 91, RULE_cosfunc = 92, RULE_tanfunc = 93, RULE_atnfunc = 94, RULE_rndfunc = 95, RULE_sgnfunc = 96, RULE_expfunc = 97,
         RULE_logfunc = 98, RULE_absfunc = 99;
   public static final String[] ruleNames = { "prog", "line", "amperoper", "linenumber", "amprstmt", "statement", "vardecl", "printstmt1", "printlist", "getstmt", "letstmt", "variableassignment",
         "relop", "gte", "lte", "neq", "ifstmt", "forstmt", "nextstmt", "inputstmt", "readstmt", "dimstmt", "gotostmt", "gosubstmt", "pokestmt", "callstmt", "hplotstmt", "vplotstmt", "plotstmt",
         "ongotostmt", "ongosubstmt", "vtabstmnt", "htabstmnt", "himemstmt", "lomemstmt", "datastmt", "datum", "waitstmt", "xdrawstmt", "drawstmt", "defstmt", "tabstmt", "speedstmt", "rotstmt",
         "scalestmt", "colorstmt", "hcolorstmt", "hlinstmt", "vlinstmt", "onerrstmt", "prstmt", "instmt", "storestmt", "recallstmt", "liststmt", "popstmt", "amptstmt", "includestmt", "endstmt",
         "returnstmt", "restorestmt", "func", "signExpression", "exponentExpression", "multiplyingExpression", "addingExpression", "relationalExpression", "expression", "var", "varname", "varsuffix",
         "varlist", "exprlist", "sqrfunc", "chrfunc", "lenfunc", "ascfunc", "midfunc", "pdlfunc", "peekfunc", "intfunc", "spcfunc", "frefunc", "posfunc", "usrfunc", "leftfunc", "rightfunc",
         "strfunc", "fnfunc", "valfunc", "scrnfunc", "sinfunc", "cosfunc", "tanfunc", "atnfunc", "rndfunc", "sgnfunc", "expfunc", "logfunc", "absfunc" };
   public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3}\u035e\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
         + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
         + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
         + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
         + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"
         + "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" + "`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\3\2\6\2\u00cc\n\2\r\2\16\2\u00cd\3"
         + "\3\3\3\3\3\3\3\5\3\u00d4\n\3\7\3\u00d6\n\3\f\3\16\3\u00d9\13\3\3\3\5\3" + "\u00dc\n\3\3\3\3\3\3\3\5\3\u00e1\n\3\3\4\3\4\3\5\3\5\3\6\5\6\u00e8\n\6"
         + "\3\6\3\6\5\6\u00ec\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" + "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"
         + "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7" + "\3\7\5\7\u011e\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0125\n\b\f\b\16\b\u0128\13"
         + "\b\3\t\3\t\5\t\u012c\n\t\3\n\3\n\5\n\u0130\n\n\3\n\7\n\u0133\n\n\f\n\16" + "\n\u0136\13\n\3\13\3\13\3\13\3\f\5\f\u013c\n\f\3\f\3\f\3\r\3\r\3\r\3\r"
         + "\3\16\3\16\3\16\3\16\5\16\u0148\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u014f" + "\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u0156\n\20\3\21\3\21\3\22\3\22\3\22"
         + "\5\22\u015d\n\22\3\22\3\22\5\22\u0161\n\22\3\23\3\23\3\23\3\23\3\23\3" + "\23\3\23\3\23\5\23\u016b\n\23\3\24\3\24\5\24\u016f\n\24\3\25\3\25\3\25"
         + "\5\25\u0174\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30" + "\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"
         + "\3\34\3\34\5\34\u0191\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u0198\n\34\f" + "\34\16\34\u019b\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u01a2\n\35\3\35\3"
         + "\35\3\35\3\35\3\35\7\35\u01a9\n\35\f\35\16\35\u01ac\13\35\3\36\3\36\3" + "\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01b9\n\37\f\37\16\37"
         + "\u01bc\13\37\3 \3 \3 \3 \3 \3 \7 \u01c4\n \f \16 \u01c7\13 \3!\3!\3!\3" + "\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\5%\u01db\n%\7%\u01dd\n"
         + "%\f%\16%\u01e0\13%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ea\n\'\3(\3(\3" + "(\3(\3(\3(\3(\5(\u01f3\n(\3)\3)\3)\3)\3)\3)\3)\5)\u01fc\n)\3*\3*\3*\3"
         + "*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3" + "/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62"
         + "\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\65" + "\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\58\u0240\n8\39\39\39\3"
         + "9\39\59\u0247\n9\3:\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3?\3" + "?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"
         + "?\3?\3?\3?\3?\5?\u0276\n?\3@\5@\u0279\n@\3@\7@\u027c\n@\f@\16@\u027f\13" + "@\3@\3@\3A\3A\3A\7A\u0286\nA\fA\16A\u0289\13A\3B\3B\3B\7B\u028e\nB\fB"
         + "\16B\u0291\13B\3C\3C\3C\7C\u0296\nC\fC\16C\u0299\13C\3D\3D\3D\3D\7D\u029f" + "\nD\fD\16D\u02a2\13D\3E\3E\3E\3E\7E\u02a8\nE\fE\16E\u02ab\13E\5E\u02ad"
         + "\nE\3F\3F\5F\u02b1\nF\3G\3G\7G\u02b5\nG\fG\16G\u02b8\13G\3H\3H\3I\3I\3" + "I\7I\u02bf\nI\fI\16I\u02c2\13I\3J\3J\3J\7J\u02c7\nJ\fJ\16J\u02ca\13J\3"
         + "K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3" + "O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3"
         + "S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3" + "W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3"
         + "[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3" + "_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3"
         + "d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\2f\2\4\6\b\n\f\16\20\22\24\26\30\32\34" + "\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"
         + "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a" + "\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"
         + "\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\2\16" + "\4\2\f\fww\3\3||\f\2\30\30  ,.88??BDJKaappst\4\2\6\6uu\4\2\36\36((\4\2"
         + "\33\34##\4\2xxz{\3\2\24\25\3\2\26\27\3\2LM\3\2yz\3\2\3\4\u0376\2\u00cb" + "\3\2\2\2\4\u00e0\3\2\2\2\6\u00e2\3\2\2\2\b\u00e4\3\2\2\2\n\u00eb\3\2\2"
         + "\2\f\u011d\3\2\2\2\16\u011f\3\2\2\2\20\u0129\3\2\2\2\22\u012d\3\2\2\2" + "\24\u0137\3\2\2\2\26\u013b\3\2\2\2\30\u013f\3\2\2\2\32\u0147\3\2\2\2\34"
         + "\u014e\3\2\2\2\36\u0155\3\2\2\2 \u0157\3\2\2\2\"\u0159\3\2\2\2$\u0162" + "\3\2\2\2&\u016c\3\2\2\2(\u0170\3\2\2\2*\u0177\3\2\2\2,\u017a\3\2\2\2."
         + "\u017d\3\2\2\2\60\u0180\3\2\2\2\62\u0183\3\2\2\2\64\u0188\3\2\2\2\66\u018b" + "\3\2\2\28\u019c\3\2\2\2:\u01ad\3\2\2\2<\u01b2\3\2\2\2>\u01bd\3\2\2\2@"
         + "\u01c8\3\2\2\2B\u01cb\3\2\2\2D\u01ce\3\2\2\2F\u01d2\3\2\2\2H\u01d6\3\2" + "\2\2J\u01e1\3\2\2\2L\u01e3\3\2\2\2N\u01eb\3\2\2\2P\u01f4\3\2\2\2R\u01fd"
         + "\3\2\2\2T\u0206\3\2\2\2V\u020b\3\2\2\2X\u020f\3\2\2\2Z\u0213\3\2\2\2\\" + "\u0217\3\2\2\2^\u021b\3\2\2\2`\u021f\3\2\2\2b\u0226\3\2\2\2d\u022d\3\2"
         + "\2\2f\u0231\3\2\2\2h\u0234\3\2\2\2j\u0237\3\2\2\2l\u023a\3\2\2\2n\u023d" + "\3\2\2\2p\u0241\3\2\2\2r\u0248\3\2\2\2t\u024b\3\2\2\2v\u024e\3\2\2\2x"
         + "\u0250\3\2\2\2z\u0252\3\2\2\2|\u0275\3\2\2\2~\u0278\3\2\2\2\u0080\u0282" + "\3\2\2\2\u0082\u028a\3\2\2\2\u0084\u0292\3\2\2\2\u0086\u029a\3\2\2\2\u0088"
         + "\u02ac\3\2\2\2\u008a\u02ae\3\2\2\2\u008c\u02b2\3\2\2\2\u008e\u02b9\3\2" + "\2\2\u0090\u02bb\3\2\2\2\u0092\u02c3\3\2\2\2\u0094\u02cb\3\2\2\2\u0096"
         + "\u02d0\3\2\2\2\u0098\u02d5\3\2\2\2\u009a\u02da\3\2\2\2\u009c\u02df\3\2" + "\2\2\u009e\u02e8\3\2\2\2\u00a0\u02ed\3\2\2\2\u00a2\u02f2\3\2\2\2\u00a4"
         + "\u02f7\3\2\2\2\u00a6\u02fc\3\2\2\2\u00a8\u0301\3\2\2\2\u00aa\u0306\3\2" + "\2\2\u00ac\u030b\3\2\2\2\u00ae\u0312\3\2\2\2\u00b0\u0319\3\2\2\2\u00b2"
         + "\u031e\3\2\2\2\u00b4\u0324\3\2\2\2\u00b6\u0329\3\2\2\2\u00b8\u0330\3\2" + "\2\2\u00ba\u0335\3\2\2\2\u00bc\u033a\3\2\2\2\u00be\u033f\3\2\2\2\u00c0"
         + "\u0344\3\2\2\2\u00c2\u0349\3\2\2\2\u00c4\u034e\3\2\2\2\u00c6\u0353\3\2" + "\2\2\u00c8\u0358\3\2\2\2\u00ca\u00cc\5\4\3\2\u00cb\u00ca\3\2\2\2\u00cc"
         + "\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\3\3\2\2\2" + "\u00cf\u00db\5\b\5\2\u00d0\u00d7\5\n\6\2\u00d1\u00d3\7+\2\2\u00d2\u00d4"
         + "\5\n\6\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5" + "\u00d1\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2"
         + "\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\t\2\2\2\u00db" + "\u00d0\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\t\3"
         + "\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\7|\2\2\u00e0\u00cf\3\2\2\2\u00e0" + "\u00df\3\2\2\2\u00e1\5\3\2\2\2\u00e2\u00e3\7o\2\2\u00e3\7\3\2\2\2\u00e4"
         + "\u00e5\7z\2\2\u00e5\t\3\2\2\2\u00e6\u00e8\5\6\4\2\u00e7\u00e6\3\2\2\2" + "\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\5\f\7\2\u00ea\u00ec"
         + "\t\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\13\3\2\2\2\u00ed" + "\u011e\t\4\2\2\u00ee\u011e\5v<\2\u00ef\u011e\5x=\2\u00f0\u011e\5z>\2\u00f1"
         + "\u011e\5r:\2\u00f2\u011e\5p9\2\u00f3\u011e\5n8\2\u00f4\u011e\5j\66\2\u00f5" + "\u011e\5\24\13\2\u00f6\u011e\5l\67\2\u00f7\u011e\5h\65\2\u00f8\u011e\5"
         + "f\64\2\u00f9\u011e\5d\63\2\u00fa\u011e\5`\61\2\u00fb\u011e\5b\62\2\u00fc" + "\u011e\5\\/\2\u00fd\u011e\5V,\2\u00fe\u011e\5Z.\2\u00ff\u011e\5X-\2\u0100"
         + "\u011e\5^\60\2\u0101\u011e\5D#\2\u0102\u011e\5F$\2\u0103\u011e\5\20\t" + "\2\u0104\u011e\5\62\32\2\u0105\u011e\5:\36\2\u0106\u011e\5<\37\2\u0107"
         + "\u011e\5> \2\u0108\u011e\5\"\22\2\u0109\u011e\5&\24\2\u010a\u011e\5$\23" + "\2\u010b\u011e\5(\25\2\u010c\u011e\5T+\2\u010d\u011e\5,\27\2\u010e\u011e"
         + "\5.\30\2\u010f\u011e\5\60\31\2\u0110\u011e\5\64\33\2\u0111\u011e\5*\26" + "\2\u0112\u011e\5\66\34\2\u0113\u011e\58\35\2\u0114\u011e\5@!\2\u0115\u011e"
         + "\5B\"\2\u0116\u011e\5L\'\2\u0117\u011e\5H%\2\u0118\u011e\5N(\2\u0119\u011e" + "\5P)\2\u011a\u011e\5R*\2\u011b\u011e\5\26\f\2\u011c\u011e\5t;\2\u011d"
         + "\u00ed\3\2\2\2\u011d\u00ee\3\2\2\2\u011d\u00ef\3\2\2\2\u011d\u00f0\3\2" + "\2\2\u011d\u00f1\3\2\2\2\u011d\u00f2\3\2\2\2\u011d\u00f3\3\2\2\2\u011d"
         + "\u00f4\3\2\2\2\u011d\u00f5\3\2\2\2\u011d\u00f6\3\2\2\2\u011d\u00f7\3\2" + "\2\2\u011d\u00f8\3\2\2\2\u011d\u00f9\3\2\2\2\u011d\u00fa\3\2\2\2\u011d"
         + "\u00fb\3\2\2\2\u011d\u00fc\3\2\2\2\u011d\u00fd\3\2\2\2\u011d\u00fe\3\2" + "\2\2\u011d\u00ff\3\2\2\2\u011d\u0100\3\2\2\2\u011d\u0101\3\2\2\2\u011d"
         + "\u0102\3\2\2\2\u011d\u0103\3\2\2\2\u011d\u0104\3\2\2\2\u011d\u0105\3\2" + "\2\2\u011d\u0106\3\2\2\2\u011d\u0107\3\2\2\2\u011d\u0108\3\2\2\2\u011d"
         + "\u0109\3\2\2\2\u011d\u010a\3\2\2\2\u011d\u010b\3\2\2\2\u011d\u010c\3\2" + "\2\2\u011d\u010d\3\2\2\2\u011d\u010e\3\2\2\2\u011d\u010f\3\2\2\2\u011d"
         + "\u0110\3\2\2\2\u011d\u0111\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u0113\3\2" + "\2\2\u011d\u0114\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2\2\2\u011d"
         + "\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2" + "\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\r\3\2\2\2\u011f\u0126"
         + "\5\u008aF\2\u0120\u0121\7\22\2\2\u0121\u0122\5\u0092J\2\u0122\u0123\7" + "\23\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0125\u0128\3\2\2\2\u0126"
         + "\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\17\3\2\2\2\u0128\u0126\3\2\2" + "\2\u0129\u012b\t\5\2\2\u012a\u012c\5\22\n\2\u012b\u012a\3\2\2\2\u012b"
         + "\u012c\3\2\2\2\u012c\21\3\2\2\2\u012d\u012f\5\u0088E\2\u012e\u0130\t\6" + "\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\3\2\2\2\u0131"
         + "\u0133\5\22\n\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3" + "\2\2\2\u0134\u0135\3\2\2\2\u0135\23\3\2\2\2\u0136\u0134\3\2\2\2\u0137"
         + "\u0138\7m\2\2\u0138\u0139\5\u0092J\2\u0139\25\3\2\2\2\u013a\u013c\7\"" + "\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"
         + "\u013e\5\30\r\2\u013e\27\3\2\2\2\u013f\u0140\5\16\b\2\u0140\u0141\7#\2" + "\2\u0141\u0142\5\u0092J\2\u0142\31\3\2\2\2\u0143\u0148\5\36\20\2\u0144"
         + "\u0148\5\34\17\2\u0145\u0148\5 \21\2\u0146\u0148\t\7\2\2\u0147\u0143\3" + "\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148"
         + "\33\3\2\2\2\u0149\u014f\7\31\2\2\u014a\u014b\7\33\2\2\u014b\u014f\7#\2" + "\2\u014c\u014d\7#\2\2\u014d\u014f\7\33\2\2\u014e\u0149\3\2\2\2\u014e\u014a"
         + "\3\2\2\2\u014e\u014c\3\2\2\2\u014f\35\3\2\2\2\u0150\u0156\7\32\2\2\u0151" + "\u0152\7\34\2\2\u0152\u0156\7#\2\2\u0153\u0154\7#\2\2\u0154\u0156\7\34"
         + "\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0153\3\2\2\2\u0156" + "\37\3\2\2\2\u0157\u0158\7\35\2\2\u0158!\3\2\2\2\u0159\u015a\7\t\2\2\u015a"
         + "\u015c\5\u0088E\2\u015b\u015d\7\13\2\2\u015c\u015b\3\2\2\2\u015c\u015d" + "\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u0161\5\f\7\2\u015f\u0161\5\b\5\2\u0160"
         + "\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161#\3\2\2\2\u0162\u0163\7$\2\2\u0163" + "\u0164\5\16\b\2\u0164\u0165\7#\2\2\u0165\u0166\5\u0088E\2\u0166\u0167"
         + "\7%\2\2\u0167\u016a\5\u0088E\2\u0168\u0169\7&\2\2\u0169\u016b\5\u0088" + "E\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b%\3\2\2\2\u016c\u016e"
         + "\7\n\2\2\u016d\u016f\5\u0090I\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2" + "\2\u016f\'\3\2\2\2\u0170\u0173\7\'\2\2\u0171\u0172\7x\2\2\u0172\u0174"
         + "\t\6\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175" + "\u0176\5\u0090I\2\u0176)\3\2\2\2\u0177\u0178\7P\2\2\u0178\u0179\5\u0090"
         + "I\2\u0179+\3\2\2\2\u017a\u017b\7)\2\2\u017b\u017c\5\u0090I\2\u017c-\3" + "\2\2\2\u017d\u017e\7\7\2\2\u017e\u017f\5\b\5\2\u017f/\3\2\2\2\u0180\u0181"
         + "\7\b\2\2\u0181\u0182\5\b\5\2\u0182\61\3\2\2\2\u0183\u0184\7=\2\2\u0184" + "\u0185\5\u0088E\2\u0185\u0186\7\36\2\2\u0186\u0187\5\u0088E\2\u0187\63"
         + "\3\2\2\2\u0188\u0189\7\60\2\2\u0189\u018a\5\u0092J\2\u018a\65\3\2\2\2" + "\u018b\u0190\7\62\2\2\u018c\u018d\5\u0088E\2\u018d\u018e\7\36\2\2\u018e"
         + "\u018f\5\u0088E\2\u018f\u0191\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u0191" + "\3\2\2\2\u0191\u0199\3\2\2\2\u0192\u0193\7%\2\2\u0193\u0194\5\u0088E\2"
         + "\u0194\u0195\7\36\2\2\u0195\u0196\5\u0088E\2\u0196\u0198\3\2\2\2\u0197" + "\u0192\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"
         + "\2\2\u019a\67\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a1\7\63\2\2\u019d\u019e" + "\5\u0088E\2\u019e\u019f\7\36\2\2\u019f\u01a0\5\u0088E\2\u01a0\u01a2\3"
         + "\2\2\2\u01a1\u019d\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01aa\3\2\2\2\u01a3" + "\u01a4\7%\2\2\u01a4\u01a5\5\u0088E\2\u01a5\u01a6\7\36\2\2\u01a6\u01a7"
         + "\5\u0088E\2\u01a7\u01a9\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a9\u01ac\3\2\2" + "\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab9\3\2\2\2\u01ac\u01aa"
         + "\3\2\2\2\u01ad\u01ae\7;\2\2\u01ae\u01af\5\u0088E\2\u01af\u01b0\7\36\2" + "\2\u01b0\u01b1\5\u0088E\2\u01b1;\3\2\2\2\u01b2\u01b3\79\2\2\u01b3\u01b4"
         + "\5\u0088E\2\u01b4\u01b5\7\7\2\2\u01b5\u01ba\5\b\5\2\u01b6\u01b7\7\36\2" + "\2\u01b7\u01b9\5\b\5\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8"
         + "\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb=\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd" + "\u01be\79\2\2\u01be\u01bf\5\u0088E\2\u01bf\u01c0\7\b\2\2\u01c0\u01c5\5"
         + "\b\5\2\u01c1\u01c2\7\36\2\2\u01c2\u01c4\5\b\5\2\u01c3\u01c1\3\2\2\2\u01c4" + "\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6?\3\2\2\2"
         + "\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7\66\2\2\u01c9\u01ca\5\u0088E\2\u01ca" + "A\3\2\2\2\u01cb\u01cc\7\67\2\2\u01cc\u01cd\5\u0088E\2\u01cdC\3\2\2\2\u01ce"
         + "\u01cf\7@\2\2\u01cf\u01d0\7+\2\2\u01d0\u01d1\5\u0088E\2\u01d1E\3\2\2\2" + "\u01d2\u01d3\7A\2\2\u01d3\u01d4\7+\2\2\u01d4\u01d5\5\u0088E\2\u01d5G\3"
         + "\2\2\2\u01d6\u01d7\7N\2\2\u01d7\u01de\5J&\2\u01d8\u01da\7\36\2\2\u01d9" + "\u01db\5J&\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2"
         + "\2\u01dc\u01d8\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df" + "\3\2\2\2\u01dfI\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\t\b\2\2\u01e2"
         + "K\3\2\2\2\u01e3\u01e4\7O\2\2\u01e4\u01e5\5\u0088E\2\u01e5\u01e6\7\36\2" + "\2\u01e6\u01e9\5\u0088E\2\u01e7\u01e8\7\36\2\2\u01e8\u01ea\5\u0088E\2"
         + "\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eaM\3\2\2\2\u01eb\u01ec\7" + "Q\2\2\u01ec\u01f2\5\u0088E\2\u01ed\u01ee\7S\2\2\u01ee\u01ef\5\u0088E\2"
         + "\u01ef\u01f0\7\36\2\2\u01f0\u01f1\5\u0088E\2\u01f1\u01f3\3\2\2\2\u01f2" + "\u01ed\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3O\3\2\2\2\u01f4\u01f5\7R\2\2\u01f5"
         + "\u01fb\5\u0088E\2\u01f6\u01f7\7S\2\2\u01f7\u01f8\5\u0088E\2\u01f8\u01f9" + "\7\36\2\2\u01f9\u01fa\5\u0088E\2\u01fa\u01fc\3\2\2\2\u01fb\u01f6\3\2\2"
         + "\2\u01fb\u01fc\3\2\2\2\u01fcQ\3\2\2\2\u01fd\u01fe\7T\2\2\u01fe\u01ff\7" + "U\2\2\u01ff\u0200\5\u008aF\2\u0200\u0201\7\22\2\2\u0201\u0202\5\u008a"
         + "F\2\u0202\u0203\7\23\2\2\u0203\u0204\7#\2\2\u0204\u0205\5\u0088E\2\u0205" + "S\3\2\2\2\u0206\u0207\7W\2\2\u0207\u0208\7\22\2\2\u0208\u0209\5\u0088"
         + "E\2\u0209\u020a\7\23\2\2\u020aU\3\2\2\2\u020b\u020c\7X\2\2\u020c\u020d" + "\7#\2\2\u020d\u020e\5\u0088E\2\u020eW\3\2\2\2\u020f\u0210\7Y\2\2\u0210"
         + "\u0211\7#\2\2\u0211\u0212\5\u0088E\2\u0212Y\3\2\2\2\u0213\u0214\7Z\2\2" + "\u0214\u0215\7#\2\2\u0215\u0216\5\u0088E\2\u0216[\3\2\2\2\u0217\u0218"
         + "\7[\2\2\u0218\u0219\7#\2\2\u0219\u021a\5\u0088E\2\u021a]\3\2\2\2\u021b" + "\u021c\7\\\2\2\u021c\u021d\7#\2\2\u021d\u021e\5\u0088E\2\u021e_\3\2\2"
         + "\2\u021f\u0220\7]\2\2\u0220\u0221\5\u0088E\2\u0221\u0222\7\36\2\2\u0222" + "\u0223\5\u0088E\2\u0223\u0224\7S\2\2\u0224\u0225\5\u0088E\2\u0225a\3\2"
         + "\2\2\u0226\u0227\7^\2\2\u0227\u0228\5\u0088E\2\u0228\u0229\7\36\2\2\u0229" + "\u022a\5\u0088E\2\u022a\u022b\7S\2\2\u022b\u022c\5\u0088E\2\u022cc\3\2"
         + "\2\2\u022d\u022e\7E\2\2\u022e\u022f\7\7\2\2\u022f\u0230\5\b\5\2\u0230" + "e\3\2\2\2\u0231\u0232\7\64\2\2\u0232\u0233\7z\2\2\u0233g\3\2\2\2\u0234"
         + "\u0235\7\65\2\2\u0235\u0236\7z\2\2\u0236i\3\2\2\2\u0237\u0238\7k\2\2\u0238" + "\u0239\5\16\b\2\u0239k\3\2\2\2\u023a\u023b\7l\2\2\u023b\u023c\5\16\b\2"
         + "\u023cm\3\2\2\2\u023d\u023f\7\37\2\2\u023e\u0240\5\u0088E\2\u023f\u023e" + "\3\2\2\2\u023f\u0240\3\2\2\2\u0240o\3\2\2\2\u0241\u0246\7`\2\2\u0242\u0243"
         + "\5\u0088E\2\u0243\u0244\7\36\2\2\u0244\u0245\5\u0088E\2\u0245\u0247\3" + "\2\2\2\u0246\u0242\3\2\2\2\u0246\u0247\3\2\2\2\u0247q\3\2\2\2\u0248\u0249"
         + "\7o\2\2\u0249\u024a\5\u0088E\2\u024as\3\2\2\2\u024b\u024c\7v\2\2\u024c" + "\u024d\5\u0088E\2\u024du\3\2\2\2\u024e\u024f\7!\2\2\u024fw\3\2\2\2\u0250"
         + "\u0251\7\5\2\2\u0251y\3\2\2\2\u0252\u0253\7r\2\2\u0253{\3\2\2\2\u0254" + "\u0276\t\b\2\2\u0255\u0276\5\16\b\2\u0256\u0276\5\u0096L\2\u0257\u0276"
         + "\5\u0094K\2\u0258\u0276\5\u0098M\2\u0259\u0276\5\u00b0Y\2\u025a\u0276" + "\5\u009aN\2\u025b\u0276\5\u00b6\\\2\u025c\u0276\5\u009cO\2\u025d\u0276"
         + "\5\u009eP\2\u025e\u0276\5\u00a0Q\2\u025f\u0276\5\u00a2R\2\u0260\u0276" + "\5\u00a4S\2\u0261\u0276\5\u00a6T\2\u0262\u0276\5\u00a8U\2\u0263\u0276"
         + "\5\u00aaV\2\u0264\u0276\5\u00acW\2\u0265\u0276\5\u00b4[\2\u0266\u0276" + "\5\u00aeX\2\u0267\u0276\5\u00b2Z\2\u0268\u0276\5\u00b8]\2\u0269\u0276"
         + "\5\u00ba^\2\u026a\u0276\5\u00bc_\2\u026b\u0276\5\u00be`\2\u026c\u0276" + "\5\u00c0a\2\u026d\u0276\5\u00c2b\2\u026e\u0276\5\u00c4c\2\u026f\u0276"
         + "\5\u00c6d\2\u0270\u0276\5\u00c8e\2\u0271\u0272\7\22\2\2\u0272\u0273\5" + "\u0088E\2\u0273\u0274\7\23\2\2\u0274\u0276\3\2\2\2\u0275\u0254\3\2\2\2"
         + "\u0275\u0255\3\2\2\2\u0275\u0256\3\2\2\2\u0275\u0257\3\2\2\2\u0275\u0258" + "\3\2\2\2\u0275\u0259\3\2\2\2\u0275\u025a\3\2\2\2\u0275\u025b\3\2\2\2\u0275"
         + "\u025c\3\2\2\2\u0275\u025d\3\2\2\2\u0275\u025e\3\2\2\2\u0275\u025f\3\2" + "\2\2\u0275\u0260\3\2\2\2\u0275\u0261\3\2\2\2\u0275\u0262\3\2\2\2\u0275"
         + "\u0263\3\2\2\2\u0275\u0264\3\2\2\2\u0275\u0265\3\2\2\2\u0275\u0266\3\2" + "\2\2\u0275\u0267\3\2\2\2\u0275\u0268\3\2\2\2\u0275\u0269\3\2\2\2\u0275"
         + "\u026a\3\2\2\2\u0275\u026b\3\2\2\2\u0275\u026c\3\2\2\2\u0275\u026d\3\2" + "\2\2\u0275\u026e\3\2\2\2\u0275\u026f\3\2\2\2\u0275\u0270\3\2\2\2\u0275"
         + "\u0271\3\2\2\2\u0276}\3\2\2\2\u0277\u0279\7q\2\2\u0278\u0277\3\2\2\2\u0278" + "\u0279\3\2\2\2\u0279\u027d\3\2\2\2\u027a\u027c\t\t\2\2\u027b\u027a\3\2"
         + "\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e" + "\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281\5|?\2\u0281\177\3\2\2\2"
         + "\u0282\u0287\5~@\2\u0283\u0284\7n\2\2\u0284\u0286\5~@\2\u0285\u0283\3" + "\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288"
         + "\u0081\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028f\5\u0080A\2\u028b\u028c" + "\t\n\2\2\u028c\u028e\5\u0080A\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2"
         + "\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0083\3\2\2\2\u0291\u028f" + "\3\2\2\2\u0292\u0297\5\u0082B\2\u0293\u0294\t\t\2\2\u0294\u0296\5\u0082"
         + "B\2\u0295\u0293\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297" + "\u0298\3\2\2\2\u0298\u0085\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u02a0\5\u0084"
         + "C\2\u029b\u029c\5\32\16\2\u029c\u029d\5\u0084C\2\u029d\u029f\3\2\2\2\u029e" + "\u029b\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2"
         + "\2\2\u02a1\u0087\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02ad\5|?\2\u02a4\u02a9" + "\5\u0086D\2\u02a5\u02a6\t\13\2\2\u02a6\u02a8\5\u0086D\2\u02a7\u02a5\3"
         + "\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa" + "\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02a3\3\2\2\2\u02ac\u02a4\3\2"
         + "\2\2\u02ad\u0089\3\2\2\2\u02ae\u02b0\5\u008cG\2\u02af\u02b1\5\u008eH\2" + "\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u008b\3\2\2\2\u02b2\u02b6"
         + "\7y\2\2\u02b3\u02b5\t\f\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6" + "\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u008d\3\2\2\2\u02b8\u02b6\3\2"
         + "\2\2\u02b9\u02ba\t\r\2\2\u02ba\u008f\3\2\2\2\u02bb\u02c0\5\16\b\2\u02bc" + "\u02bd\7\36\2\2\u02bd\u02bf\5\16\b\2\u02be\u02bc\3\2\2\2\u02bf\u02c2\3"
         + "\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u0091\3\2\2\2\u02c2" + "\u02c0\3\2\2\2\u02c3\u02c8\5\u0088E\2\u02c4\u02c5\7\36\2\2\u02c5\u02c7"
         + "\5\u0088E\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2" + "\2\u02c8\u02c9\3\2\2\2\u02c9\u0093\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc"
         + "\7*\2\2\u02cc\u02cd\7\22\2\2\u02cd\u02ce\5\u0088E\2\u02ce\u02cf\7\23\2" + "\2\u02cf\u0095\3\2\2\2\u02d0\u02d1\7\r\2\2\u02d1\u02d2\7\22\2\2\u02d2"
         + "\u02d3\5\u0088E\2\u02d3\u02d4\7\23\2\2\u02d4\u0097\3\2\2\2\u02d5\u02d6" + "\7/\2\2\u02d6\u02d7\7\22\2\2\u02d7\u02d8\5\u0088E\2\u02d8\u02d9\7\23\2"
         + "\2\u02d9\u0099\3\2\2\2\u02da\u02db\7\61\2\2\u02db\u02dc\7\22\2\2\u02dc" + "\u02dd\5\u0088E\2\u02dd\u02de\7\23\2\2\u02de\u009b\3\2\2\2\u02df\u02e0"
         + "\7\16\2\2\u02e0\u02e1\7\22\2\2\u02e1\u02e2\5\u0088E\2\u02e2\u02e3\7\36" + "\2\2\u02e3\u02e4\5\u0088E\2\u02e4\u02e5\7\36\2\2\u02e5\u02e6\5\u0088E"
         + "\2\u02e6\u02e7\7\23\2\2\u02e7\u009d\3\2\2\2\u02e8\u02e9\7:\2\2\u02e9\u02ea" + "\7\22\2\2\u02ea\u02eb\5\u0088E\2\u02eb\u02ec\7\23\2\2\u02ec\u009f\3\2"
         + "\2\2\u02ed\u02ee\7<\2\2\u02ee\u02ef\7\22\2\2\u02ef\u02f0\5\u0088E\2\u02f0" + "\u02f1\7\23\2\2\u02f1\u00a1\3\2\2\2\u02f2\u02f3\7>\2\2\u02f3\u02f4\7\22"
         + "\2\2\u02f4\u02f5\5\u0088E\2\u02f5\u02f6\7\23\2\2\u02f6\u00a3\3\2\2\2\u02f7" + "\u02f8\7F\2\2\u02f8\u02f9\7\22\2\2\u02f9\u02fa\5\u0088E\2\u02fa\u02fb"
         + "\7\23\2\2\u02fb\u00a5\3\2\2\2\u02fc\u02fd\7G\2\2\u02fd\u02fe\7\22\2\2" + "\u02fe\u02ff\5\u0088E\2\u02ff\u0300\7\23\2\2\u0300\u00a7\3\2\2\2\u0301"
         + "\u0302\7H\2\2\u0302\u0303\7\22\2\2\u0303\u0304\5\u0088E\2\u0304\u0305" + "\7\23\2\2\u0305\u00a9\3\2\2\2\u0306\u0307\7I\2\2\u0307\u0308\7\22\2\2"
         + "\u0308\u0309\5\u0088E\2\u0309\u030a\7\23\2\2\u030a\u00ab\3\2\2\2\u030b" + "\u030c\7\17\2\2\u030c\u030d\7\22\2\2\u030d\u030e\5\u0088E\2\u030e\u030f"
         + "\7\36\2\2\u030f\u0310\5\u0088E\2\u0310\u0311\7\23\2\2\u0311\u00ad\3\2" + "\2\2\u0312\u0313\7\20\2\2\u0313\u0314\7\22\2\2\u0314\u0315\5\u0088E\2"
         + "\u0315\u0316\7\36\2\2\u0316\u0317\5\u0088E\2\u0317\u0318\7\23\2\2\u0318" + "\u00af\3\2\2\2\u0319\u031a\7\21\2\2\u031a\u031b\7\22\2\2\u031b\u031c\5"
         + "\u0088E\2\u031c\u031d\7\23\2\2\u031d\u00b1\3\2\2\2\u031e\u031f\7U\2\2" + "\u031f\u0320\5\u008aF\2\u0320\u0321\7\22\2\2\u0321\u0322\5\u0088E\2\u0322"
         + "\u0323\7\23\2\2\u0323\u00b3\3\2\2\2\u0324\u0325\7V\2\2\u0325\u0326\7\22" + "\2\2\u0326\u0327\5\u0088E\2\u0327\u0328\7\23\2\2\u0328\u00b5\3\2\2\2\u0329"
         + "\u032a\7_\2\2\u032a\u032b\7\22\2\2\u032b\u032c\5\u0088E\2\u032c\u032d" + "\7\36\2\2\u032d\u032e\5\u0088E\2\u032e\u032f\7\23\2\2\u032f\u00b7\3\2"
         + "\2\2\u0330\u0331\7b\2\2\u0331\u0332\7\22\2\2\u0332\u0333\5\u0088E\2\u0333" + "\u0334\7\23\2\2\u0334\u00b9\3\2\2\2\u0335\u0336\7c\2\2\u0336\u0337\7\22"
         + "\2\2\u0337\u0338\5\u0088E\2\u0338\u0339\7\23\2\2\u0339\u00bb\3\2\2\2\u033a" + "\u033b\7d\2\2\u033b\u033c\7\22\2\2\u033c\u033d\5\u0088E\2\u033d\u033e"
         + "\7\23\2\2\u033e\u00bd\3\2\2\2\u033f\u0340\7e\2\2\u0340\u0341\7\22\2\2" + "\u0341\u0342\5\u0088E\2\u0342\u0343\7\23\2\2\u0343\u00bf\3\2\2\2\u0344"
         + "\u0345\7f\2\2\u0345\u0346\7\22\2\2\u0346\u0347\5\u0088E\2\u0347\u0348" + "\7\23\2\2\u0348\u00c1\3\2\2\2\u0349\u034a\7g\2\2\u034a\u034b\7\22\2\2"
         + "\u034b\u034c\5\u0088E\2\u034c\u034d\7\23\2\2\u034d\u00c3\3\2\2\2\u034e" + "\u034f\7h\2\2\u034f\u0350\7\22\2\2\u0350\u0351\5\u0088E\2\u0351\u0352"
         + "\7\23\2\2\u0352\u00c5\3\2\2\2\u0353\u0354\7i\2\2\u0354\u0355\7\22\2\2" + "\u0355\u0356\5\u0088E\2\u0356\u0357\7\23\2\2\u0357\u00c7\3\2\2\2\u0358"
         + "\u0359\7j\2\2\u0359\u035a\7\22\2\2\u035a\u035b\5\u0088E\2\u035b\u035c" + "\7\23\2\2\u035c\u00c9\3\2\2\2\61\u00cd\u00d3\u00d7\u00db\u00e0\u00e7\u00eb"
         + "\u011d\u0126\u012b\u012f\u0134\u013b\u0147\u014e\u0155\u015c\u0160\u016a" + "\u016e\u0173\u0190\u0199\u01a1\u01aa\u01ba\u01c5\u01da\u01de\u01e9\u01f2"
         + "\u01fb\u023f\u0246\u0275\u0278\u027d\u0287\u028f\u0297\u02a0\u02a9\u02ac" + "\u02b0\u02b6\u02c0\u02c8";
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
      enterRule(_localctx, 198, RULE_absfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(854);
            match(ABS);
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

   public final AddingExpressionContext addingExpression() throws RecognitionException {
      final AddingExpressionContext _localctx = new AddingExpressionContext(_ctx, getState());
      enterRule(_localctx, 130, RULE_addingExpression);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(656);
            multiplyingExpression();
            setState(661);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(657);
                        _la = _input.LA(1);
                        if (!((_la == PLUS) || (_la == MINUS))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(658);
                        multiplyingExpression();
                     }
                  }
               }
               setState(663);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
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
            setState(224);
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
      int _la;
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
                     setState(229);
                     switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                        case 1: {
                           setState(228);
                           amperoper();
                        }
                           break;
                     }
                     setState(231);
                     statement();
                  }
               }
               break;
            case REM:
            case COMMENT:
               enterOuterAlt(_localctx, 2);
               {
                  setState(232);
                  _la = _input.LA(1);
                  if (!((_la == REM) || (_la == COMMENT))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
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
            setState(582);
            match(AMPERSAND);
            setState(583);
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
      enterRule(_localctx, 152, RULE_ascfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(728);
            match(ASC);
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

   public final AtnfuncContext atnfunc() throws RecognitionException {
      final AtnfuncContext _localctx = new AtnfuncContext(_ctx, getState());
      enterRule(_localctx, 188, RULE_atnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(829);
            match(ATN);
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

   public final CallstmtContext callstmt() throws RecognitionException {
      final CallstmtContext _localctx = new CallstmtContext(_ctx, getState());
      enterRule(_localctx, 50, RULE_callstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(390);
            match(CALL);
            setState(391);
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
      enterRule(_localctx, 148, RULE_chrfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(718);
            match(CHR);
            setState(719);
            match(LPAREN);
            setState(720);
            expression();
            setState(721);
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
            setState(533);
            match(COLOR);
            setState(534);
            match(EQ);
            setState(535);
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
      enterRule(_localctx, 184, RULE_cosfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(819);
            match(COS);
            setState(820);
            match(LPAREN);
            setState(821);
            expression();
            setState(822);
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
            setState(468);
            match(DATA);
            setState(469);
            datum();
            setState(476);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(470);
                     match(COMMA);
                     setState(472);
                     _la = _input.LA(1);
                     if ((((((_la - 118)) & ~0x3f) == 0) && (((1L << (_la - 118)) & ((1L << (STRINGLITERAL - 118)) | (1L << (NUMBER - 118)) | (1L << (FLOAT - 118)))) != 0))) {
                        {
                           setState(471);
                           datum();
                        }
                     }
                  }
               }
               setState(478);
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
            setState(479);
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
            setState(507);
            match(DEF);
            setState(508);
            match(FN);
            setState(509);
            var();
            setState(510);
            match(LPAREN);
            setState(511);
            var();
            setState(512);
            match(RPAREN);
            setState(513);
            match(EQ);
            setState(514);
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
            setState(376);
            match(DIM);
            setState(377);
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
            setState(498);
            match(DRAW);
            setState(499);
            expression();
            setState(505);
            _la = _input.LA(1);
            if (_la == AT) {
               {
                  setState(500);
                  match(AT);
                  setState(501);
                  expression();
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

   public final EndstmtContext endstmt() throws RecognitionException {
      final EndstmtContext _localctx = new EndstmtContext(_ctx, getState());
      enterRule(_localctx, 116, RULE_endstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(588);
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
      enterRule(_localctx, 194, RULE_expfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(844);
            match(EXP);
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

   public final ExponentExpressionContext exponentExpression() throws RecognitionException {
      final ExponentExpressionContext _localctx = new ExponentExpressionContext(_ctx, getState());
      enterRule(_localctx, 126, RULE_exponentExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(640);
            signExpression();
            setState(645);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == EXPONENT) {
               {
                  {
                     setState(641);
                     match(EXPONENT);
                     setState(642);
                     signExpression();
                  }
               }
               setState(647);
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
      enterRule(_localctx, 134, RULE_expression);
      int _la;
      try {
         setState(682);
         switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(673);
                  func();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(674);
                     relationalExpression();
                     setState(679);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                     while ((_la == AND) || (_la == OR)) {
                        {
                           {
                              setState(675);
                              _la = _input.LA(1);
                              if (!((_la == AND) || (_la == OR))) {
                                 _errHandler.recoverInline(this);
                              }
                              consume();
                              setState(676);
                              relationalExpression();
                           }
                        }
                        setState(681);
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
      enterRule(_localctx, 144, RULE_exprlist);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(705);
            expression();
            setState(710);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(706);
                     match(COMMA);
                     setState(707);
                     expression();
                  }
               }
               setState(712);
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
      enterRule(_localctx, 176, RULE_fnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(796);
            match(FN);
            setState(797);
            var();
            setState(798);
            match(LPAREN);
            setState(799);
            expression();
            setState(800);
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
            setState(352);
            match(FOR);
            setState(353);
            vardecl();
            setState(354);
            match(EQ);
            setState(355);
            expression();
            setState(356);
            match(TO);
            setState(357);
            expression();
            setState(360);
            _la = _input.LA(1);
            if (_la == STEP) {
               {
                  setState(358);
                  match(STEP);
                  setState(359);
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
      enterRule(_localctx, 164, RULE_frefunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(762);
            match(FRE);
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

   public final FuncContext func() throws RecognitionException {
      final FuncContext _localctx = new FuncContext(_ctx, getState());
      enterRule(_localctx, 122, RULE_func);
      int _la;
      try {
         setState(627);
         switch (_input.LA(1)) {
            case STRINGLITERAL:
            case NUMBER:
            case FLOAT:
               enterOuterAlt(_localctx, 1);
               {
                  setState(594);
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
                  setState(595);
                  vardecl();
               }
               break;
            case CHR:
               enterOuterAlt(_localctx, 3);
               {
                  setState(596);
                  chrfunc();
               }
               break;
            case SQR:
               enterOuterAlt(_localctx, 4);
               {
                  setState(597);
                  sqrfunc();
               }
               break;
            case LEN:
               enterOuterAlt(_localctx, 5);
               {
                  setState(598);
                  lenfunc();
               }
               break;
            case STR:
               enterOuterAlt(_localctx, 6);
               {
                  setState(599);
                  strfunc();
               }
               break;
            case ASC:
               enterOuterAlt(_localctx, 7);
               {
                  setState(600);
                  ascfunc();
               }
               break;
            case SCRN:
               enterOuterAlt(_localctx, 8);
               {
                  setState(601);
                  scrnfunc();
               }
               break;
            case MID:
               enterOuterAlt(_localctx, 9);
               {
                  setState(602);
                  midfunc();
               }
               break;
            case PDL:
               enterOuterAlt(_localctx, 10);
               {
                  setState(603);
                  pdlfunc();
               }
               break;
            case PEEK:
               enterOuterAlt(_localctx, 11);
               {
                  setState(604);
                  peekfunc();
               }
               break;
            case INTF:
               enterOuterAlt(_localctx, 12);
               {
                  setState(605);
                  intfunc();
               }
               break;
            case SPC:
               enterOuterAlt(_localctx, 13);
               {
                  setState(606);
                  spcfunc();
               }
               break;
            case FRE:
               enterOuterAlt(_localctx, 14);
               {
                  setState(607);
                  frefunc();
               }
               break;
            case POS:
               enterOuterAlt(_localctx, 15);
               {
                  setState(608);
                  posfunc();
               }
               break;
            case USR:
               enterOuterAlt(_localctx, 16);
               {
                  setState(609);
                  usrfunc();
               }
               break;
            case LEFT:
               enterOuterAlt(_localctx, 17);
               {
                  setState(610);
                  leftfunc();
               }
               break;
            case VAL:
               enterOuterAlt(_localctx, 18);
               {
                  setState(611);
                  valfunc();
               }
               break;
            case RIGHT:
               enterOuterAlt(_localctx, 19);
               {
                  setState(612);
                  rightfunc();
               }
               break;
            case FN:
               enterOuterAlt(_localctx, 20);
               {
                  setState(613);
                  fnfunc();
               }
               break;
            case SIN:
               enterOuterAlt(_localctx, 21);
               {
                  setState(614);
                  sinfunc();
               }
               break;
            case COS:
               enterOuterAlt(_localctx, 22);
               {
                  setState(615);
                  cosfunc();
               }
               break;
            case TAN:
               enterOuterAlt(_localctx, 23);
               {
                  setState(616);
                  tanfunc();
               }
               break;
            case ATN:
               enterOuterAlt(_localctx, 24);
               {
                  setState(617);
                  atnfunc();
               }
               break;
            case RND:
               enterOuterAlt(_localctx, 25);
               {
                  setState(618);
                  rndfunc();
               }
               break;
            case SGN:
               enterOuterAlt(_localctx, 26);
               {
                  setState(619);
                  sgnfunc();
               }
               break;
            case EXP:
               enterOuterAlt(_localctx, 27);
               {
                  setState(620);
                  expfunc();
               }
               break;
            case LOG:
               enterOuterAlt(_localctx, 28);
               {
                  setState(621);
                  logfunc();
               }
               break;
            case ABS:
               enterOuterAlt(_localctx, 29);
               {
                  setState(622);
                  absfunc();
               }
               break;
            case LPAREN:
               enterOuterAlt(_localctx, 30);
               {
                  {
                     setState(623);
                     match(LPAREN);
                     setState(624);
                     expression();
                     setState(625);
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
            setState(309);
            match(GET);
            setState(310);
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
            setState(382);
            match(GOSUB);
            setState(383);
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
            setState(379);
            match(GOTO);
            setState(380);
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
         setState(332);
         switch (_input.LA(1)) {
            case GTE:
               enterOuterAlt(_localctx, 1);
               {
                  setState(327);
                  match(GTE);
               }
               break;
            case GT:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(328);
                     match(GT);
                     setState(329);
                     match(EQ);
                  }
               }
               break;
            case EQ:
               enterOuterAlt(_localctx, 3);
               {
                  {
                     setState(330);
                     match(EQ);
                     setState(331);
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
            setState(537);
            match(HCOLOR);
            setState(538);
            match(EQ);
            setState(539);
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
            setState(460);
            match(HIMEM);
            setState(461);
            match(COLON);
            setState(462);
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
            setState(541);
            match(HLIN);
            setState(542);
            expression();
            setState(543);
            match(COMMA);
            setState(544);
            expression();
            setState(545);
            match(AT);
            setState(546);
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
            setState(393);
            match(HPLOT);
            setState(398);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(394);
                  expression();
                  setState(395);
                  match(COMMA);
                  setState(396);
                  expression();
               }
            }
            setState(407);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == TO) {
               {
                  {
                     setState(400);
                     match(TO);
                     setState(401);
                     expression();
                     setState(402);
                     match(COMMA);
                     setState(403);
                     expression();
                  }
               }
               setState(409);
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
            setState(457);
            match(HTAB);
            setState(458);
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
            setState(343);
            match(IF);
            setState(344);
            expression();
            setState(346);
            _la = _input.LA(1);
            if (_la == THEN) {
               {
                  setState(345);
                  match(THEN);
               }
            }
            setState(350);
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
                  setState(348);
                  statement();
               }
                  break;
               case NUMBER: {
                  setState(349);
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
            setState(585);
            match(INCLUDE);
            setState(586);
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
            setState(366);
            match(INPUT);
            setState(369);
            _la = _input.LA(1);
            if (_la == STRINGLITERAL) {
               {
                  setState(367);
                  match(STRINGLITERAL);
                  setState(368);
                  _la = _input.LA(1);
                  if (!((_la == COMMA) || (_la == SEMICOLON))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
            }
            setState(371);
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
            setState(562);
            match(INNUMBER);
            setState(563);
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
      enterRule(_localctx, 160, RULE_intfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(752);
            match(INTF);
            setState(753);
            match(LPAREN);
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

   public final LeftfuncContext leftfunc() throws RecognitionException {
      final LeftfuncContext _localctx = new LeftfuncContext(_ctx, getState());
      enterRule(_localctx, 170, RULE_leftfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(777);
            match(LEFT);
            setState(778);
            match(LPAREN);
            setState(779);
            expression();
            setState(780);
            match(COMMA);
            setState(781);
            expression();
            setState(782);
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
      enterRule(_localctx, 150, RULE_lenfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(723);
            match(LEN);
            setState(724);
            match(LPAREN);
            setState(725);
            expression();
            setState(726);
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
            setState(313);
            _la = _input.LA(1);
            if (_la == LET) {
               {
                  setState(312);
                  match(LET);
               }
            }
            setState(315);
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
         setState(222);
         switch (_input.LA(1)) {
            case NUMBER:
               enterOuterAlt(_localctx, 1);
               {
                  {
                     setState(205);
                     linenumber();
                     setState(217);
                     switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                        case 1: {
                           {
                              setState(206);
                              amprstmt();
                              setState(213);
                              _errHandler.sync(this);
                              _la = _input.LA(1);
                              while (_la == COLON) {
                                 {
                                    {
                                       setState(207);
                                       match(COLON);
                                       setState(209);
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
                                             setState(208);
                                             amprstmt();
                                          }
                                       }
                                    }
                                 }
                                 setState(215);
                                 _errHandler.sync(this);
                                 _la = _input.LA(1);
                              }
                           }
                        }
                           break;
                        case 2: {
                           setState(216);
                           _la = _input.LA(1);
                           if (!((_la == REM) || (_la == COMMENT))) {
                              _errHandler.recoverInline(this);
                           }
                           consume();
                        }
                           break;
                     }
                     setState(219);
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
                  setState(221);
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
            setState(226);
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
            setState(571);
            match(LIST);
            setState(573);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(572);
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
      enterRule(_localctx, 196, RULE_logfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(849);
            match(LOG);
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

   public final LomemstmtContext lomemstmt() throws RecognitionException {
      final LomemstmtContext _localctx = new LomemstmtContext(_ctx, getState());
      enterRule(_localctx, 68, RULE_lomemstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(464);
            match(LOMEM);
            setState(465);
            match(COLON);
            setState(466);
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
         setState(339);
         switch (_input.LA(1)) {
            case LTE:
               enterOuterAlt(_localctx, 1);
               {
                  setState(334);
                  match(LTE);
               }
               break;
            case LT:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(335);
                     match(LT);
                     setState(336);
                     match(EQ);
                  }
               }
               break;
            case EQ:
               enterOuterAlt(_localctx, 3);
               {
                  {
                     setState(337);
                     match(EQ);
                     setState(338);
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
      enterRule(_localctx, 154, RULE_midfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(733);
            match(MID);
            setState(734);
            match(LPAREN);
            setState(735);
            expression();
            setState(736);
            match(COMMA);
            setState(737);
            expression();
            setState(738);
            match(COMMA);
            setState(739);
            expression();
            setState(740);
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
      enterRule(_localctx, 128, RULE_multiplyingExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(648);
            exponentExpression();
            setState(653);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((_la == TIMES) || (_la == DIV)) {
               {
                  {
                     setState(649);
                     _la = _input.LA(1);
                     if (!((_la == TIMES) || (_la == DIV))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                     setState(650);
                     exponentExpression();
                  }
               }
               setState(655);
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
            setState(341);
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
            setState(362);
            match(NEXT);
            setState(364);
            _la = _input.LA(1);
            if (_la == LETTERS) {
               {
                  setState(363);
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
            setState(555);
            match(ONERR);
            setState(556);
            match(GOTO);
            setState(557);
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
            setState(443);
            match(ON);
            setState(444);
            expression();
            setState(445);
            match(GOSUB);
            setState(446);
            linenumber();
            setState(451);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(447);
                     match(COMMA);
                     setState(448);
                     linenumber();
                  }
               }
               setState(453);
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
            setState(432);
            match(ON);
            setState(433);
            expression();
            setState(434);
            match(GOTO);
            setState(435);
            linenumber();
            setState(440);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(436);
                     match(COMMA);
                     setState(437);
                     linenumber();
                  }
               }
               setState(442);
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
      enterRule(_localctx, 156, RULE_pdlfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(742);
            match(PDL);
            setState(743);
            match(LPAREN);
            setState(744);
            expression();
            setState(745);
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
      enterRule(_localctx, 158, RULE_peekfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(747);
            match(PEEK);
            setState(748);
            match(LPAREN);
            setState(749);
            expression();
            setState(750);
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
            setState(427);
            match(PLOT);
            setState(428);
            expression();
            setState(429);
            match(COMMA);
            setState(430);
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
            setState(385);
            match(POKE);
            setState(386);
            expression();
            setState(387);
            match(COMMA);
            setState(388);
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
            setState(575);
            match(POP);
            setState(580);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(576);
                  expression();
                  setState(577);
                  match(COMMA);
                  setState(578);
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
      enterRule(_localctx, 166, RULE_posfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(767);
            match(POS);
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

   public final PrintlistContext printlist() throws RecognitionException {
      final PrintlistContext _localctx = new PrintlistContext(_ctx, getState());
      enterRule(_localctx, 16, RULE_printlist);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(299);
            expression();
            setState(301);
            _la = _input.LA(1);
            if ((_la == COMMA) || (_la == SEMICOLON)) {
               {
                  setState(300);
                  _la = _input.LA(1);
                  if (!((_la == COMMA) || (_la == SEMICOLON))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
            }
            setState(306);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(303);
                        printlist();
                     }
                  }
               }
               setState(308);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
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
            setState(295);
            _la = _input.LA(1);
            if (!((_la == PRINT) || (_la == QUESTION))) {
               _errHandler.recoverInline(this);
            }
            consume();
            setState(297);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(296);
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
            setState(201);
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
               {
                  {
                     setState(200);
                     line();
                  }
               }
               setState(203);
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
            setState(559);
            match(PRNUMBER);
            setState(560);
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
            setState(373);
            match(READ);
            setState(374);
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
            setState(568);
            match(RECALL);
            setState(569);
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
      enterRule(_localctx, 132, RULE_relationalExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(664);
            addingExpression();
            setState(670);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << GTE) | (1L << LTE) | (1L << GT) | (1L << LT) | (1L << NEQ) | (1L << EQ))) != 0))) {
               {
                  {
                     {
                        setState(665);
                        relop();
                     }
                     setState(666);
                     addingExpression();
                  }
               }
               setState(672);
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
         setState(325);
         switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(321);
                  lte();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(322);
                  gte();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(323);
                  neq();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(324);
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

   public final RestorestmtContext restorestmt() throws RecognitionException {
      final RestorestmtContext _localctx = new RestorestmtContext(_ctx, getState());
      enterRule(_localctx, 120, RULE_restorestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(592);
            match(RESTORE);
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
            setState(590);
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
      enterRule(_localctx, 172, RULE_rightfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(784);
            match(RIGHT);
            setState(785);
            match(LPAREN);
            setState(786);
            expression();
            setState(787);
            match(COMMA);
            setState(788);
            expression();
            setState(789);
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
      enterRule(_localctx, 190, RULE_rndfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(834);
            match(RND);
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

   public final RotstmtContext rotstmt() throws RecognitionException {
      final RotstmtContext _localctx = new RotstmtContext(_ctx, getState());
      enterRule(_localctx, 86, RULE_rotstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(525);
            match(ROT);
            setState(526);
            match(EQ);
            setState(527);
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
            setState(529);
            match(SCALE);
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

   public final ScrnfuncContext scrnfunc() throws RecognitionException {
      final ScrnfuncContext _localctx = new ScrnfuncContext(_ctx, getState());
      enterRule(_localctx, 180, RULE_scrnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(807);
            match(SCRN);
            setState(808);
            match(LPAREN);
            setState(809);
            expression();
            setState(810);
            match(COMMA);
            setState(811);
            expression();
            setState(812);
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
      enterRule(_localctx, 192, RULE_sgnfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(839);
            match(SGN);
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

   public final SignExpressionContext signExpression() throws RecognitionException {
      final SignExpressionContext _localctx = new SignExpressionContext(_ctx, getState());
      enterRule(_localctx, 124, RULE_signExpression);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(630);
            _la = _input.LA(1);
            if (_la == NOT) {
               {
                  setState(629);
                  match(NOT);
               }
            }
            setState(635);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((_la == PLUS) || (_la == MINUS)) {
               {
                  {
                     setState(632);
                     _la = _input.LA(1);
                     if (!((_la == PLUS) || (_la == MINUS))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                  }
               }
               setState(637);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(638);
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
      enterRule(_localctx, 182, RULE_sinfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(814);
            match(SIN);
            setState(815);
            match(LPAREN);
            setState(816);
            expression();
            setState(817);
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
      enterRule(_localctx, 162, RULE_spcfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(757);
            match(SPC);
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

   public final SpeedstmtContext speedstmt() throws RecognitionException {
      final SpeedstmtContext _localctx = new SpeedstmtContext(_ctx, getState());
      enterRule(_localctx, 84, RULE_speedstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(521);
            match(SPEED);
            setState(522);
            match(EQ);
            setState(523);
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
      enterRule(_localctx, 146, RULE_sqrfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(713);
            match(SQR);
            setState(714);
            match(LPAREN);
            setState(715);
            expression();
            setState(716);
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
      int _la;
      try {
         setState(283);
         switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(235);
                  _la = _input.LA(1);
                  if (!(((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CLEAR) | (1L << RUN) | (1L << TEXT) | (1L << HGR) | (1L << HGR2) | (1L << HOME) | (1L << STOP))) != 0)) || (((((_la - 64)) & ~0x3f) == 0) && (((1L << (_la - 64)) & ((1L << (FLASH - 64))
                        | (1L << (INVERSE - 64)) | (1L << (NORMAL - 64)) | (1L << (TRACE - 64)) | (1L << (NOTRACE - 64)) | (1L << (SHLOAD - 64)) | (1L << (GR - 64)) | (1L << (SAVE - 64)) | (1L << (LOAD - 64)))) != 0)))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(236);
                  endstmt();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(237);
                  returnstmt();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(238);
                  restorestmt();
               }
               break;
            case 5:
               enterOuterAlt(_localctx, 5);
               {
                  setState(239);
                  amptstmt();
               }
               break;
            case 6:
               enterOuterAlt(_localctx, 6);
               {
                  setState(240);
                  popstmt();
               }
               break;
            case 7:
               enterOuterAlt(_localctx, 7);
               {
                  setState(241);
                  liststmt();
               }
               break;
            case 8:
               enterOuterAlt(_localctx, 8);
               {
                  setState(242);
                  storestmt();
               }
               break;
            case 9:
               enterOuterAlt(_localctx, 9);
               {
                  setState(243);
                  getstmt();
               }
               break;
            case 10:
               enterOuterAlt(_localctx, 10);
               {
                  setState(244);
                  recallstmt();
               }
               break;
            case 11:
               enterOuterAlt(_localctx, 11);
               {
                  setState(245);
                  instmt();
               }
               break;
            case 12:
               enterOuterAlt(_localctx, 12);
               {
                  setState(246);
                  prstmt();
               }
               break;
            case 13:
               enterOuterAlt(_localctx, 13);
               {
                  setState(247);
                  onerrstmt();
               }
               break;
            case 14:
               enterOuterAlt(_localctx, 14);
               {
                  setState(248);
                  hlinstmt();
               }
               break;
            case 15:
               enterOuterAlt(_localctx, 15);
               {
                  setState(249);
                  vlinstmt();
               }
               break;
            case 16:
               enterOuterAlt(_localctx, 16);
               {
                  setState(250);
                  colorstmt();
               }
               break;
            case 17:
               enterOuterAlt(_localctx, 17);
               {
                  setState(251);
                  speedstmt();
               }
               break;
            case 18:
               enterOuterAlt(_localctx, 18);
               {
                  setState(252);
                  scalestmt();
               }
               break;
            case 19:
               enterOuterAlt(_localctx, 19);
               {
                  setState(253);
                  rotstmt();
               }
               break;
            case 20:
               enterOuterAlt(_localctx, 20);
               {
                  setState(254);
                  hcolorstmt();
               }
               break;
            case 21:
               enterOuterAlt(_localctx, 21);
               {
                  setState(255);
                  himemstmt();
               }
               break;
            case 22:
               enterOuterAlt(_localctx, 22);
               {
                  setState(256);
                  lomemstmt();
               }
               break;
            case 23:
               enterOuterAlt(_localctx, 23);
               {
                  setState(257);
                  printstmt1();
               }
               break;
            case 24:
               enterOuterAlt(_localctx, 24);
               {
                  setState(258);
                  pokestmt();
               }
               break;
            case 25:
               enterOuterAlt(_localctx, 25);
               {
                  setState(259);
                  plotstmt();
               }
               break;
            case 26:
               enterOuterAlt(_localctx, 26);
               {
                  setState(260);
                  ongotostmt();
               }
               break;
            case 27:
               enterOuterAlt(_localctx, 27);
               {
                  setState(261);
                  ongosubstmt();
               }
               break;
            case 28:
               enterOuterAlt(_localctx, 28);
               {
                  setState(262);
                  ifstmt();
               }
               break;
            case 29:
               enterOuterAlt(_localctx, 29);
               {
                  setState(263);
                  nextstmt();
               }
               break;
            case 30:
               enterOuterAlt(_localctx, 30);
               {
                  setState(264);
                  forstmt();
               }
               break;
            case 31:
               enterOuterAlt(_localctx, 31);
               {
                  setState(265);
                  inputstmt();
               }
               break;
            case 32:
               enterOuterAlt(_localctx, 32);
               {
                  setState(266);
                  tabstmt();
               }
               break;
            case 33:
               enterOuterAlt(_localctx, 33);
               {
                  setState(267);
                  dimstmt();
               }
               break;
            case 34:
               enterOuterAlt(_localctx, 34);
               {
                  setState(268);
                  gotostmt();
               }
               break;
            case 35:
               enterOuterAlt(_localctx, 35);
               {
                  setState(269);
                  gosubstmt();
               }
               break;
            case 36:
               enterOuterAlt(_localctx, 36);
               {
                  setState(270);
                  callstmt();
               }
               break;
            case 37:
               enterOuterAlt(_localctx, 37);
               {
                  setState(271);
                  readstmt();
               }
               break;
            case 38:
               enterOuterAlt(_localctx, 38);
               {
                  setState(272);
                  hplotstmt();
               }
               break;
            case 39:
               enterOuterAlt(_localctx, 39);
               {
                  setState(273);
                  vplotstmt();
               }
               break;
            case 40:
               enterOuterAlt(_localctx, 40);
               {
                  setState(274);
                  vtabstmnt();
               }
               break;
            case 41:
               enterOuterAlt(_localctx, 41);
               {
                  setState(275);
                  htabstmnt();
               }
               break;
            case 42:
               enterOuterAlt(_localctx, 42);
               {
                  setState(276);
                  waitstmt();
               }
               break;
            case 43:
               enterOuterAlt(_localctx, 43);
               {
                  setState(277);
                  datastmt();
               }
               break;
            case 44:
               enterOuterAlt(_localctx, 44);
               {
                  setState(278);
                  xdrawstmt();
               }
               break;
            case 45:
               enterOuterAlt(_localctx, 45);
               {
                  setState(279);
                  drawstmt();
               }
               break;
            case 46:
               enterOuterAlt(_localctx, 46);
               {
                  setState(280);
                  defstmt();
               }
               break;
            case 47:
               enterOuterAlt(_localctx, 47);
               {
                  setState(281);
                  letstmt();
               }
               break;
            case 48:
               enterOuterAlt(_localctx, 48);
               {
                  setState(282);
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
            setState(565);
            match(STORE);
            setState(566);
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
      enterRule(_localctx, 174, RULE_strfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(791);
            match(STR);
            setState(792);
            match(LPAREN);
            setState(793);
            expression();
            setState(794);
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
            setState(516);
            match(TAB);
            setState(517);
            match(LPAREN);
            setState(518);
            expression();
            setState(519);
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
      enterRule(_localctx, 186, RULE_tanfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(824);
            match(TAN);
            setState(825);
            match(LPAREN);
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

   public final UsrfuncContext usrfunc() throws RecognitionException {
      final UsrfuncContext _localctx = new UsrfuncContext(_ctx, getState());
      enterRule(_localctx, 168, RULE_usrfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(772);
            match(USR);
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

   public final ValfuncContext valfunc() throws RecognitionException {
      final ValfuncContext _localctx = new ValfuncContext(_ctx, getState());
      enterRule(_localctx, 178, RULE_valfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(802);
            match(VAL);
            setState(803);
            match(LPAREN);
            setState(804);
            expression();
            setState(805);
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
      enterRule(_localctx, 136, RULE_var);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(684);
            varname();
            setState(686);
            _la = _input.LA(1);
            if ((_la == DOLLAR) || (_la == PERCENT)) {
               {
                  setState(685);
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
            setState(285);
            var();
            setState(292);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(286);
                        match(LPAREN);
                        setState(287);
                        exprlist();
                        setState(288);
                        match(RPAREN);
                     }
                  }
               }
               setState(294);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
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
            setState(317);
            vardecl();
            setState(318);
            match(EQ);
            setState(319);
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
      enterRule(_localctx, 142, RULE_varlist);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(697);
            vardecl();
            setState(702);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(698);
                     match(COMMA);
                     setState(699);
                     vardecl();
                  }
               }
               setState(704);
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
      enterRule(_localctx, 138, RULE_varname);
      int _la;
      try {
         int _alt;
         enterOuterAlt(_localctx, 1);
         {
            setState(688);
            match(LETTERS);
            setState(692);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(689);
                        _la = _input.LA(1);
                        if (!((_la == LETTERS) || (_la == NUMBER))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                     }
                  }
               }
               setState(694);
               _errHandler.sync(this);
               _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
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
      enterRule(_localctx, 140, RULE_varsuffix);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(695);
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
            setState(548);
            match(VLIN);
            setState(549);
            expression();
            setState(550);
            match(COMMA);
            setState(551);
            expression();
            setState(552);
            match(AT);
            setState(553);
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
            setState(410);
            match(VPLOT);
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

   public final VtabstmntContext vtabstmnt() throws RecognitionException {
      final VtabstmntContext _localctx = new VtabstmntContext(_ctx, getState());
      enterRule(_localctx, 62, RULE_vtabstmnt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(454);
            match(VTAB);
            setState(455);
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
            setState(481);
            match(WAIT);
            setState(482);
            expression();
            setState(483);
            match(COMMA);
            setState(484);
            expression();
            setState(487);
            _la = _input.LA(1);
            if (_la == COMMA) {
               {
                  setState(485);
                  match(COMMA);
                  setState(486);
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
            setState(489);
            match(XDRAW);
            setState(490);
            expression();
            setState(496);
            _la = _input.LA(1);
            if (_la == AT) {
               {
                  setState(491);
                  match(AT);
                  setState(492);
                  expression();
                  setState(493);
                  match(COMMA);
                  setState(494);
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