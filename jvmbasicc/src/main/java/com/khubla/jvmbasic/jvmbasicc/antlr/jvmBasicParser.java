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

      public TerminalNode NEXT() {
         return getToken(jvmBasicParser.NEXT, 0);
      }

      public StatementContext statement() {
         return getRuleContext(StatementContext.class, 0);
      }

      public TerminalNode STEP() {
         return getToken(jvmBasicParser.STEP, 0);
      }

      public TerminalNode TO() {
         return getToken(jvmBasicParser.TO, 0);
      }

      public List<VardeclContext> vardecl() {
         return getRuleContexts(VardeclContext.class);
      }

      public VardeclContext vardecl(int i) {
         return getRuleContext(VardeclContext.class, i);
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
         RULE_getstmt = 9, RULE_letstmt = 10, RULE_variableassignment = 11, RULE_relop = 12, RULE_gte = 13, RULE_lte = 14, RULE_neq = 15, RULE_ifstmt = 16, RULE_forstmt = 17, RULE_inputstmt = 18,
         RULE_readstmt = 19, RULE_dimstmt = 20, RULE_gotostmt = 21, RULE_gosubstmt = 22, RULE_pokestmt = 23, RULE_callstmt = 24, RULE_hplotstmt = 25, RULE_vplotstmt = 26, RULE_plotstmt = 27,
         RULE_ongotostmt = 28, RULE_ongosubstmt = 29, RULE_vtabstmnt = 30, RULE_htabstmnt = 31, RULE_himemstmt = 32, RULE_lomemstmt = 33, RULE_datastmt = 34, RULE_datum = 35, RULE_waitstmt = 36,
         RULE_xdrawstmt = 37, RULE_drawstmt = 38, RULE_defstmt = 39, RULE_tabstmt = 40, RULE_speedstmt = 41, RULE_rotstmt = 42, RULE_scalestmt = 43, RULE_colorstmt = 44, RULE_hcolorstmt = 45,
         RULE_hlinstmt = 46, RULE_vlinstmt = 47, RULE_onerrstmt = 48, RULE_prstmt = 49, RULE_instmt = 50, RULE_storestmt = 51, RULE_recallstmt = 52, RULE_liststmt = 53, RULE_popstmt = 54,
         RULE_amptstmt = 55, RULE_includestmt = 56, RULE_endstmt = 57, RULE_returnstmt = 58, RULE_restorestmt = 59, RULE_func = 60, RULE_signExpression = 61, RULE_exponentExpression = 62,
         RULE_multiplyingExpression = 63, RULE_addingExpression = 64, RULE_relationalExpression = 65, RULE_expression = 66, RULE_var = 67, RULE_varname = 68, RULE_varsuffix = 69, RULE_varlist = 70,
         RULE_exprlist = 71, RULE_sqrfunc = 72, RULE_chrfunc = 73, RULE_lenfunc = 74, RULE_ascfunc = 75, RULE_midfunc = 76, RULE_pdlfunc = 77, RULE_peekfunc = 78, RULE_intfunc = 79,
         RULE_spcfunc = 80, RULE_frefunc = 81, RULE_posfunc = 82, RULE_usrfunc = 83, RULE_leftfunc = 84, RULE_rightfunc = 85, RULE_strfunc = 86, RULE_fnfunc = 87, RULE_valfunc = 88,
         RULE_scrnfunc = 89, RULE_sinfunc = 90, RULE_cosfunc = 91, RULE_tanfunc = 92, RULE_atnfunc = 93, RULE_rndfunc = 94, RULE_sgnfunc = 95, RULE_expfunc = 96, RULE_logfunc = 97, RULE_absfunc = 98;
   public static final String[] ruleNames = { "prog", "line", "amperoper", "linenumber", "amprstmt", "statement", "vardecl", "printstmt1", "printlist", "getstmt", "letstmt", "variableassignment",
         "relop", "gte", "lte", "neq", "ifstmt", "forstmt", "inputstmt", "readstmt", "dimstmt", "gotostmt", "gosubstmt", "pokestmt", "callstmt", "hplotstmt", "vplotstmt", "plotstmt", "ongotostmt",
         "ongosubstmt", "vtabstmnt", "htabstmnt", "himemstmt", "lomemstmt", "datastmt", "datum", "waitstmt", "xdrawstmt", "drawstmt", "defstmt", "tabstmt", "speedstmt", "rotstmt", "scalestmt",
         "colorstmt", "hcolorstmt", "hlinstmt", "vlinstmt", "onerrstmt", "prstmt", "instmt", "storestmt", "recallstmt", "liststmt", "popstmt", "amptstmt", "includestmt", "endstmt", "returnstmt",
         "restorestmt", "func", "signExpression", "exponentExpression", "multiplyingExpression", "addingExpression", "relationalExpression", "expression", "var", "varname", "varsuffix", "varlist",
         "exprlist", "sqrfunc", "chrfunc", "lenfunc", "ascfunc", "midfunc", "pdlfunc", "peekfunc", "intfunc", "spcfunc", "frefunc", "posfunc", "usrfunc", "leftfunc", "rightfunc", "strfunc", "fnfunc",
         "valfunc", "scrnfunc", "sinfunc", "cosfunc", "tanfunc", "atnfunc", "rndfunc", "sgnfunc", "expfunc", "logfunc", "absfunc" };
   public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3}\u035c\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
         + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
         + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
         + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
         + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"
         + "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4" + "`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\6\2\u00ca\n\2\r\2\16\2\u00cb\3\3\3\3"
         + "\3\3\3\3\5\3\u00d2\n\3\7\3\u00d4\n\3\f\3\16\3\u00d7\13\3\3\3\5\3\u00da" + "\n\3\3\3\3\3\3\3\5\3\u00df\n\3\3\4\3\4\3\5\3\5\3\6\5\6\u00e6\n\6\3\6\3"
         + "\6\5\6\u00ea\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" + "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"
         + "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u011b" + "\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0122\n\b\f\b\16\b\u0125\13\b\3\t\3\t\5\t"
         + "\u0129\n\t\3\n\3\n\5\n\u012d\n\n\3\n\7\n\u0130\n\n\f\n\16\n\u0133\13\n" + "\3\13\3\13\3\13\3\f\5\f\u0139\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"
         + "\16\3\16\5\16\u0145\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u014c\n\17\3\20" + "\3\20\3\20\3\20\3\20\5\20\u0153\n\20\3\21\3\21\3\22\3\22\3\22\5\22\u015a"
         + "\n\22\3\22\3\22\5\22\u015e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23" + "\5\23\u0168\n\23\3\23\3\23\3\23\5\23\u016d\n\23\3\24\3\24\3\24\5\24\u0172"
         + "\n\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30" + "\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"
         + "\5\33\u018f\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u0196\n\33\f\33\16\33\u0199" + "\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u01a0\n\34\3\34\3\34\3\34\3\34\3"
         + "\34\7\34\u01a7\n\34\f\34\16\34\u01aa\13\34\3\35\3\35\3\35\3\35\3\35\3" + "\36\3\36\3\36\3\36\3\36\3\36\7\36\u01b7\n\36\f\36\16\36\u01ba\13\36\3"
         + "\37\3\37\3\37\3\37\3\37\3\37\7\37\u01c2\n\37\f\37\16\37\u01c5\13\37\3" + " \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\5$\u01d9\n$\7"
         + "$\u01db\n$\f$\16$\u01de\13$\3%\3%\3&\3&\3&\3&\3&\3&\5&\u01e8\n&\3\'\3" + "\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f1\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u01fa\n("
         + "\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-" + "\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"
         + "\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3" + "\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\5\67\u023e\n\67"
         + "\38\38\38\38\38\58\u0245\n8\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>" + "\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"
         + "\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0274\n>\3?\5?\u0277\n?\3?\7?\u027a\n?\f?" + "\16?\u027d\13?\3?\3?\3@\3@\3@\7@\u0284\n@\f@\16@\u0287\13@\3A\3A\3A\7"
         + "A\u028c\nA\fA\16A\u028f\13A\3B\3B\3B\7B\u0294\nB\fB\16B\u0297\13B\3C\3" + "C\3C\3C\7C\u029d\nC\fC\16C\u02a0\13C\3D\3D\3D\3D\7D\u02a6\nD\fD\16D\u02a9"
         + "\13D\5D\u02ab\nD\3E\3E\5E\u02af\nE\3F\3F\7F\u02b3\nF\fF\16F\u02b6\13F" + "\3G\3G\3H\3H\3H\7H\u02bd\nH\fH\16H\u02c0\13H\3I\3I\3I\7I\u02c5\nI\fI\16"
         + "I\u02c8\13I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3" + "M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3"
         + "Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3" + "V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3"
         + "Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]" + "\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3b\3b"
         + "\3b\3b\3b\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\2e\2\4\6\b\n\f\16\20\22\24" + "\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"
         + "xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094" + "\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"
         + "\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4" + "\u00c6\2\16\4\2\f\fww\3\3||\f\2\30\30  ,.88??BDJKaappst\4\2\6\6uu\4\2"
         + "\36\36((\4\2\33\34##\4\2xxz{\3\2\24\25\3\2\26\27\3\2LM\3\2yz\3\2\3\4\u0374" + "\2\u00c9\3\2\2\2\4\u00de\3\2\2\2\6\u00e0\3\2\2\2\b\u00e2\3\2\2\2\n\u00e9"
         + "\3\2\2\2\f\u011a\3\2\2\2\16\u011c\3\2\2\2\20\u0126\3\2\2\2\22\u012a\3" + "\2\2\2\24\u0134\3\2\2\2\26\u0138\3\2\2\2\30\u013c\3\2\2\2\32\u0144\3\2"
         + "\2\2\34\u014b\3\2\2\2\36\u0152\3\2\2\2 \u0154\3\2\2\2\"\u0156\3\2\2\2" + "$\u015f\3\2\2\2&\u016e\3\2\2\2(\u0175\3\2\2\2*\u0178\3\2\2\2,\u017b\3"
         + "\2\2\2.\u017e\3\2\2\2\60\u0181\3\2\2\2\62\u0186\3\2\2\2\64\u0189\3\2\2" + "\2\66\u019a\3\2\2\28\u01ab\3\2\2\2:\u01b0\3\2\2\2<\u01bb\3\2\2\2>\u01c6"
         + "\3\2\2\2@\u01c9\3\2\2\2B\u01cc\3\2\2\2D\u01d0\3\2\2\2F\u01d4\3\2\2\2H" + "\u01df\3\2\2\2J\u01e1\3\2\2\2L\u01e9\3\2\2\2N\u01f2\3\2\2\2P\u01fb\3\2"
         + "\2\2R\u0204\3\2\2\2T\u0209\3\2\2\2V\u020d\3\2\2\2X\u0211\3\2\2\2Z\u0215" + "\3\2\2\2\\\u0219\3\2\2\2^\u021d\3\2\2\2`\u0224\3\2\2\2b\u022b\3\2\2\2"
         + "d\u022f\3\2\2\2f\u0232\3\2\2\2h\u0235\3\2\2\2j\u0238\3\2\2\2l\u023b\3" + "\2\2\2n\u023f\3\2\2\2p\u0246\3\2\2\2r\u0249\3\2\2\2t\u024c\3\2\2\2v\u024e"
         + "\3\2\2\2x\u0250\3\2\2\2z\u0273\3\2\2\2|\u0276\3\2\2\2~\u0280\3\2\2\2\u0080" + "\u0288\3\2\2\2\u0082\u0290\3\2\2\2\u0084\u0298\3\2\2\2\u0086\u02aa\3\2"
         + "\2\2\u0088\u02ac\3\2\2\2\u008a\u02b0\3\2\2\2\u008c\u02b7\3\2\2\2\u008e" + "\u02b9\3\2\2\2\u0090\u02c1\3\2\2\2\u0092\u02c9\3\2\2\2\u0094\u02ce\3\2"
         + "\2\2\u0096\u02d3\3\2\2\2\u0098\u02d8\3\2\2\2\u009a\u02dd\3\2\2\2\u009c" + "\u02e6\3\2\2\2\u009e\u02eb\3\2\2\2\u00a0\u02f0\3\2\2\2\u00a2\u02f5\3\2"
         + "\2\2\u00a4\u02fa\3\2\2\2\u00a6\u02ff\3\2\2\2\u00a8\u0304\3\2\2\2\u00aa" + "\u0309\3\2\2\2\u00ac\u0310\3\2\2\2\u00ae\u0317\3\2\2\2\u00b0\u031c\3\2"
         + "\2\2\u00b2\u0322\3\2\2\2\u00b4\u0327\3\2\2\2\u00b6\u032e\3\2\2\2\u00b8" + "\u0333\3\2\2\2\u00ba\u0338\3\2\2\2\u00bc\u033d\3\2\2\2\u00be\u0342\3\2"
         + "\2\2\u00c0\u0347\3\2\2\2\u00c2\u034c\3\2\2\2\u00c4\u0351\3\2\2\2\u00c6" + "\u0356\3\2\2\2\u00c8\u00ca\5\4\3\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2"
         + "\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\3\3\2\2\2\u00cd\u00d9" + "\5\b\5\2\u00ce\u00d5\5\n\6\2\u00cf\u00d1\7+\2\2\u00d0\u00d2\5\n\6\2\u00d1"
         + "\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2" + "\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"
         + "\u00da\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\t\2\2\2\u00d9\u00ce\3\2" + "\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\t\3\2\2\u00dc"
         + "\u00df\3\2\2\2\u00dd\u00df\7|\2\2\u00de\u00cd\3\2\2\2\u00de\u00dd\3\2" + "\2\2\u00df\5\3\2\2\2\u00e0\u00e1\7o\2\2\u00e1\7\3\2\2\2\u00e2\u00e3\7"
         + "z\2\2\u00e3\t\3\2\2\2\u00e4\u00e6\5\6\4\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6" + "\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\5\f\7\2\u00e8\u00ea\t\2\2\2\u00e9"
         + "\u00e5\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\13\3\2\2\2\u00eb\u011b\t\4\2" + "\2\u00ec\u011b\5t;\2\u00ed\u011b\5v<\2\u00ee\u011b\5x=\2\u00ef\u011b\5"
         + "p9\2\u00f0\u011b\5n8\2\u00f1\u011b\5l\67\2\u00f2\u011b\5h\65\2\u00f3\u011b" + "\5\24\13\2\u00f4\u011b\5j\66\2\u00f5\u011b\5f\64\2\u00f6\u011b\5d\63\2"
         + "\u00f7\u011b\5b\62\2\u00f8\u011b\5^\60\2\u00f9\u011b\5`\61\2\u00fa\u011b" + "\5Z.\2\u00fb\u011b\5T+\2\u00fc\u011b\5X-\2\u00fd\u011b\5V,\2\u00fe\u011b"
         + "\5\\/\2\u00ff\u011b\5B\"\2\u0100\u011b\5D#\2\u0101\u011b\5\20\t\2\u0102" + "\u011b\5\60\31\2\u0103\u011b\58\35\2\u0104\u011b\5:\36\2\u0105\u011b\5"
         + "<\37\2\u0106\u011b\5\"\22\2\u0107\u011b\5$\23\2\u0108\u011b\5&\24\2\u0109" + "\u011b\5R*\2\u010a\u011b\5*\26\2\u010b\u011b\5,\27\2\u010c\u011b\5.\30"
         + "\2\u010d\u011b\5\62\32\2\u010e\u011b\5(\25\2\u010f\u011b\5\64\33\2\u0110" + "\u011b\5\66\34\2\u0111\u011b\5> \2\u0112\u011b\5@!\2\u0113\u011b\5J&\2"
         + "\u0114\u011b\5F$\2\u0115\u011b\5L\'\2\u0116\u011b\5N(\2\u0117\u011b\5" + "P)\2\u0118\u011b\5\26\f\2\u0119\u011b\5r:\2\u011a\u00eb\3\2\2\2\u011a"
         + "\u00ec\3\2\2\2\u011a\u00ed\3\2\2\2\u011a\u00ee\3\2\2\2\u011a\u00ef\3\2" + "\2\2\u011a\u00f0\3\2\2\2\u011a\u00f1\3\2\2\2\u011a\u00f2\3\2\2\2\u011a"
         + "\u00f3\3\2\2\2\u011a\u00f4\3\2\2\2\u011a\u00f5\3\2\2\2\u011a\u00f6\3\2" + "\2\2\u011a\u00f7\3\2\2\2\u011a\u00f8\3\2\2\2\u011a\u00f9\3\2\2\2\u011a"
         + "\u00fa\3\2\2\2\u011a\u00fb\3\2\2\2\u011a\u00fc\3\2\2\2\u011a\u00fd\3\2" + "\2\2\u011a\u00fe\3\2\2\2\u011a\u00ff\3\2\2\2\u011a\u0100\3\2\2\2\u011a"
         + "\u0101\3\2\2\2\u011a\u0102\3\2\2\2\u011a\u0103\3\2\2\2\u011a\u0104\3\2" + "\2\2\u011a\u0105\3\2\2\2\u011a\u0106\3\2\2\2\u011a\u0107\3\2\2\2\u011a"
         + "\u0108\3\2\2\2\u011a\u0109\3\2\2\2\u011a\u010a\3\2\2\2\u011a\u010b\3\2" + "\2\2\u011a\u010c\3\2\2\2\u011a\u010d\3\2\2\2\u011a\u010e\3\2\2\2\u011a"
         + "\u010f\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0111\3\2\2\2\u011a\u0112\3\2" + "\2\2\u011a\u0113\3\2\2\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a"
         + "\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2" + "\2\2\u011b\r\3\2\2\2\u011c\u0123\5\u0088E\2\u011d\u011e\7\22\2\2\u011e"
         + "\u011f\5\u0090I\2\u011f\u0120\7\23\2\2\u0120\u0122\3\2\2\2\u0121\u011d" + "\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"
         + "\17\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\t\5\2\2\u0127\u0129\5\22\n" + "\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\21\3\2\2\2\u012a\u012c"
         + "\5\u0086D\2\u012b\u012d\t\6\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2" + "\2\u012d\u0131\3\2\2\2\u012e\u0130\5\22\n\2\u012f\u012e\3\2\2\2\u0130"
         + "\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\23\3\2\2" + "\2\u0133\u0131\3\2\2\2\u0134\u0135\7m\2\2\u0135\u0136\5\u0090I\2\u0136"
         + "\25\3\2\2\2\u0137\u0139\7\"\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2" + "\2\u0139\u013a\3\2\2\2\u013a\u013b\5\30\r\2\u013b\27\3\2\2\2\u013c\u013d"
         + "\5\16\b\2\u013d\u013e\7#\2\2\u013e\u013f\5\u0090I\2\u013f\31\3\2\2\2\u0140" + "\u0145\5\36\20\2\u0141\u0145\5\34\17\2\u0142\u0145\5 \21\2\u0143\u0145"
         + "\t\7\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144" + "\u0143\3\2\2\2\u0145\33\3\2\2\2\u0146\u014c\7\31\2\2\u0147\u0148\7\33"
         + "\2\2\u0148\u014c\7#\2\2\u0149\u014a\7#\2\2\u014a\u014c\7\33\2\2\u014b" + "\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c\35\3\2\2"
         + "\2\u014d\u0153\7\32\2\2\u014e\u014f\7\34\2\2\u014f\u0153\7#\2\2\u0150" + "\u0151\7#\2\2\u0151\u0153\7\34\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2"
         + "\2\2\u0152\u0150\3\2\2\2\u0153\37\3\2\2\2\u0154\u0155\7\35\2\2\u0155!" + "\3\2\2\2\u0156\u0157\7\t\2\2\u0157\u0159\5\u0086D\2\u0158\u015a\7\13\2"
         + "\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015e" + "\5\f\7\2\u015c\u015e\5\b\5\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"
         + "#\3\2\2\2\u015f\u0160\7$\2\2\u0160\u0161\5\16\b\2\u0161\u0162\7#\2\2\u0162" + "\u0163\5\u0086D\2\u0163\u0164\7%\2\2\u0164\u0167\5\u0086D\2\u0165\u0166"
         + "\7&\2\2\u0166\u0168\5\u0086D\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2" + "\u0168\u0169\3\2\2\2\u0169\u016a\5\f\7\2\u016a\u016c\7\n\2\2\u016b\u016d"
         + "\5\16\b\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d%\3\2\2\2\u016e" + "\u0171\7\'\2\2\u016f\u0170\7x\2\2\u0170\u0172\t\6\2\2\u0171\u016f\3\2"
         + "\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\5\u008eH\2\u0174" + "\'\3\2\2\2\u0175\u0176\7P\2\2\u0176\u0177\5\u008eH\2\u0177)\3\2\2\2\u0178"
         + "\u0179\7)\2\2\u0179\u017a\5\u008eH\2\u017a+\3\2\2\2\u017b\u017c\7\7\2" + "\2\u017c\u017d\5\b\5\2\u017d-\3\2\2\2\u017e\u017f\7\b\2\2\u017f\u0180"
         + "\5\b\5\2\u0180/\3\2\2\2\u0181\u0182\7=\2\2\u0182\u0183\5\u0086D\2\u0183" + "\u0184\7\36\2\2\u0184\u0185\5\u0086D\2\u0185\61\3\2\2\2\u0186\u0187\7"
         + "\60\2\2\u0187\u0188\5\u0090I\2\u0188\63\3\2\2\2\u0189\u018e\7\62\2\2\u018a" + "\u018b\5\u0086D\2\u018b\u018c\7\36\2\2\u018c\u018d\5\u0086D\2\u018d\u018f"
         + "\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0197\3\2\2\2\u0190" + "\u0191\7%\2\2\u0191\u0192\5\u0086D\2\u0192\u0193\7\36\2\2\u0193\u0194"
         + "\5\u0086D\2\u0194\u0196\3\2\2\2\u0195\u0190\3\2\2\2\u0196\u0199\3\2\2" + "\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\65\3\2\2\2\u0199\u0197"
         + "\3\2\2\2\u019a\u019f\7\63\2\2\u019b\u019c\5\u0086D\2\u019c\u019d\7\36" + "\2\2\u019d\u019e\5\u0086D\2\u019e\u01a0\3\2\2\2\u019f\u019b\3\2\2\2\u019f"
         + "\u01a0\3\2\2\2\u01a0\u01a8\3\2\2\2\u01a1\u01a2\7%\2\2\u01a2\u01a3\5\u0086" + "D\2\u01a3\u01a4\7\36\2\2\u01a4\u01a5\5\u0086D\2\u01a5\u01a7\3\2\2\2\u01a6"
         + "\u01a1\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2" + "\2\2\u01a9\67\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7;\2\2\u01ac\u01ad"
         + "\5\u0086D\2\u01ad\u01ae\7\36\2\2\u01ae\u01af\5\u0086D\2\u01af9\3\2\2\2" + "\u01b0\u01b1\79\2\2\u01b1\u01b2\5\u0086D\2\u01b2\u01b3\7\7\2\2\u01b3\u01b8"
         + "\5\b\5\2\u01b4\u01b5\7\36\2\2\u01b5\u01b7\5\b\5\2\u01b6\u01b4\3\2\2\2" + "\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9;\3"
         + "\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\79\2\2\u01bc\u01bd\5\u0086D\2\u01bd" + "\u01be\7\b\2\2\u01be\u01c3\5\b\5\2\u01bf\u01c0\7\36\2\2\u01c0\u01c2\5"
         + "\b\5\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3" + "\u01c4\3\2\2\2\u01c4=\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\7\66\2\2"
         + "\u01c7\u01c8\5\u0086D\2\u01c8?\3\2\2\2\u01c9\u01ca\7\67\2\2\u01ca\u01cb" + "\5\u0086D\2\u01cbA\3\2\2\2\u01cc\u01cd\7@\2\2\u01cd\u01ce\7+\2\2\u01ce"
         + "\u01cf\5\u0086D\2\u01cfC\3\2\2\2\u01d0\u01d1\7A\2\2\u01d1\u01d2\7+\2\2" + "\u01d2\u01d3\5\u0086D\2\u01d3E\3\2\2\2\u01d4\u01d5\7N\2\2\u01d5\u01dc"
         + "\5H%\2\u01d6\u01d8\7\36\2\2\u01d7\u01d9\5H%\2\u01d8\u01d7\3\2\2\2\u01d8" + "\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da\u01d6\3\2\2\2\u01db\u01de\3\2"
         + "\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddG\3\2\2\2\u01de\u01dc" + "\3\2\2\2\u01df\u01e0\t\b\2\2\u01e0I\3\2\2\2\u01e1\u01e2\7O\2\2\u01e2\u01e3"
         + "\5\u0086D\2\u01e3\u01e4\7\36\2\2\u01e4\u01e7\5\u0086D\2\u01e5\u01e6\7" + "\36\2\2\u01e6\u01e8\5\u0086D\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2"
         + "\u01e8K\3\2\2\2\u01e9\u01ea\7Q\2\2\u01ea\u01f0\5\u0086D\2\u01eb\u01ec" + "\7S\2\2\u01ec\u01ed\5\u0086D\2\u01ed\u01ee\7\36\2\2\u01ee\u01ef\5\u0086"
         + "D\2\u01ef\u01f1\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1" + "M\3\2\2\2\u01f2\u01f3\7R\2\2\u01f3\u01f9\5\u0086D\2\u01f4\u01f5\7S\2\2"
         + "\u01f5\u01f6\5\u0086D\2\u01f6\u01f7\7\36\2\2\u01f7\u01f8\5\u0086D\2\u01f8" + "\u01fa\3\2\2\2\u01f9\u01f4\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faO\3\2\2\2"
         + "\u01fb\u01fc\7T\2\2\u01fc\u01fd\7U\2\2\u01fd\u01fe\5\u0088E\2\u01fe\u01ff" + "\7\22\2\2\u01ff\u0200\5\u0088E\2\u0200\u0201\7\23\2\2\u0201\u0202\7#\2"
         + "\2\u0202\u0203\5\u0086D\2\u0203Q\3\2\2\2\u0204\u0205\7W\2\2\u0205\u0206" + "\7\22\2\2\u0206\u0207\5\u0086D\2\u0207\u0208\7\23\2\2\u0208S\3\2\2\2\u0209"
         + "\u020a\7X\2\2\u020a\u020b\7#\2\2\u020b\u020c\5\u0086D\2\u020cU\3\2\2\2" + "\u020d\u020e\7Y\2\2\u020e\u020f\7#\2\2\u020f\u0210\5\u0086D\2\u0210W\3"
         + "\2\2\2\u0211\u0212\7Z\2\2\u0212\u0213\7#\2\2\u0213\u0214\5\u0086D\2\u0214" + "Y\3\2\2\2\u0215\u0216\7[\2\2\u0216\u0217\7#\2\2\u0217\u0218\5\u0086D\2"
         + "\u0218[\3\2\2\2\u0219\u021a\7\\\2\2\u021a\u021b\7#\2\2\u021b\u021c\5\u0086" + "D\2\u021c]\3\2\2\2\u021d\u021e\7]\2\2\u021e\u021f\5\u0086D\2\u021f\u0220"
         + "\7\36\2\2\u0220\u0221\5\u0086D\2\u0221\u0222\7S\2\2\u0222\u0223\5\u0086" + "D\2\u0223_\3\2\2\2\u0224\u0225\7^\2\2\u0225\u0226\5\u0086D\2\u0226\u0227"
         + "\7\36\2\2\u0227\u0228\5\u0086D\2\u0228\u0229\7S\2\2\u0229\u022a\5\u0086" + "D\2\u022aa\3\2\2\2\u022b\u022c\7E\2\2\u022c\u022d\7\7\2\2\u022d\u022e"
         + "\5\b\5\2\u022ec\3\2\2\2\u022f\u0230\7\64\2\2\u0230\u0231\7z\2\2\u0231" + "e\3\2\2\2\u0232\u0233\7\65\2\2\u0233\u0234\7z\2\2\u0234g\3\2\2\2\u0235"
         + "\u0236\7k\2\2\u0236\u0237\5\16\b\2\u0237i\3\2\2\2\u0238\u0239\7l\2\2\u0239" + "\u023a\5\16\b\2\u023ak\3\2\2\2\u023b\u023d\7\37\2\2\u023c\u023e\5\u0086"
         + "D\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023em\3\2\2\2\u023f\u0244" + "\7`\2\2\u0240\u0241\5\u0086D\2\u0241\u0242\7\36\2\2\u0242\u0243\5\u0086"
         + "D\2\u0243\u0245\3\2\2\2\u0244\u0240\3\2\2\2\u0244\u0245\3\2\2\2\u0245" + "o\3\2\2\2\u0246\u0247\7o\2\2\u0247\u0248\5\u0086D\2\u0248q\3\2\2\2\u0249"
         + "\u024a\7v\2\2\u024a\u024b\5\u0086D\2\u024bs\3\2\2\2\u024c\u024d\7!\2\2" + "\u024du\3\2\2\2\u024e\u024f\7\5\2\2\u024fw\3\2\2\2\u0250\u0251\7r\2\2"
         + "\u0251y\3\2\2\2\u0252\u0274\t\b\2\2\u0253\u0274\5\16\b\2\u0254\u0274\5" + "\u0094K\2\u0255\u0274\5\u0092J\2\u0256\u0274\5\u0096L\2\u0257\u0274\5"
         + "\u00aeX\2\u0258\u0274\5\u0098M\2\u0259\u0274\5\u00b4[\2\u025a\u0274\5" + "\u009aN\2\u025b\u0274\5\u009cO\2\u025c\u0274\5\u009eP\2\u025d\u0274\5"
         + "\u00a0Q\2\u025e\u0274\5\u00a2R\2\u025f\u0274\5\u00a4S\2\u0260\u0274\5" + "\u00a6T\2\u0261\u0274\5\u00a8U\2\u0262\u0274\5\u00aaV\2\u0263\u0274\5"
         + "\u00b2Z\2\u0264\u0274\5\u00acW\2\u0265\u0274\5\u00b0Y\2\u0266\u0274\5" + "\u00b6\\\2\u0267\u0274\5\u00b8]\2\u0268\u0274\5\u00ba^\2\u0269\u0274\5"
         + "\u00bc_\2\u026a\u0274\5\u00be`\2\u026b\u0274\5\u00c0a\2\u026c\u0274\5" + "\u00c2b\2\u026d\u0274\5\u00c4c\2\u026e\u0274\5\u00c6d\2\u026f\u0270\7"
         + "\22\2\2\u0270\u0271\5\u0086D\2\u0271\u0272\7\23\2\2\u0272\u0274\3\2\2" + "\2\u0273\u0252\3\2\2\2\u0273\u0253\3\2\2\2\u0273\u0254\3\2\2\2\u0273\u0255"
         + "\3\2\2\2\u0273\u0256\3\2\2\2\u0273\u0257\3\2\2\2\u0273\u0258\3\2\2\2\u0273" + "\u0259\3\2\2\2\u0273\u025a\3\2\2\2\u0273\u025b\3\2\2\2\u0273\u025c\3\2"
         + "\2\2\u0273\u025d\3\2\2\2\u0273\u025e\3\2\2\2\u0273\u025f\3\2\2\2\u0273" + "\u0260\3\2\2\2\u0273\u0261\3\2\2\2\u0273\u0262\3\2\2\2\u0273\u0263\3\2"
         + "\2\2\u0273\u0264\3\2\2\2\u0273\u0265\3\2\2\2\u0273\u0266\3\2\2\2\u0273" + "\u0267\3\2\2\2\u0273\u0268\3\2\2\2\u0273\u0269\3\2\2\2\u0273\u026a\3\2"
         + "\2\2\u0273\u026b\3\2\2\2\u0273\u026c\3\2\2\2\u0273\u026d\3\2\2\2\u0273" + "\u026e\3\2\2\2\u0273\u026f\3\2\2\2\u0274{\3\2\2\2\u0275\u0277\7q\2\2\u0276"
         + "\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027b\3\2\2\2\u0278\u027a\t\t" + "\2\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b"
         + "\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u027f\5z" + ">\2\u027f}\3\2\2\2\u0280\u0285\5|?\2\u0281\u0282\7n\2\2\u0282\u0284\5"
         + "|?\2\u0283\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285" + "\u0286\3\2\2\2\u0286\177\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028d\5~@\2"
         + "\u0289\u028a\t\n\2\2\u028a\u028c\5~@\2\u028b\u0289\3\2\2\2\u028c\u028f" + "\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0081\3\2\2\2\u028f"
         + "\u028d\3\2\2\2\u0290\u0295\5\u0080A\2\u0291\u0292\t\t\2\2\u0292\u0294" + "\5\u0080A\2\u0293\u0291\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2"
         + "\2\u0295\u0296\3\2\2\2\u0296\u0083\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029e" + "\5\u0082B\2\u0299\u029a\5\32\16\2\u029a\u029b\5\u0082B\2\u029b\u029d\3"
         + "\2\2\2\u029c\u0299\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e" + "\u029f\3\2\2\2\u029f\u0085\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02ab\5z"
         + ">\2\u02a2\u02a7\5\u0084C\2\u02a3\u02a4\t\13\2\2\u02a4\u02a6\5\u0084C\2" + "\u02a5\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8"
         + "\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02a1\3\2\2\2\u02aa" + "\u02a2\3\2\2\2\u02ab\u0087\3\2\2\2\u02ac\u02ae\5\u008aF\2\u02ad\u02af"
         + "\5\u008cG\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u0089\3\2\2" + "\2\u02b0\u02b4\7y\2\2\u02b1\u02b3\t\f\2\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6"
         + "\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u008b\3\2\2\2\u02b6" + "\u02b4\3\2\2\2\u02b7\u02b8\t\r\2\2\u02b8\u008d\3\2\2\2\u02b9\u02be\5\16"
         + "\b\2\u02ba\u02bb\7\36\2\2\u02bb\u02bd\5\16\b\2\u02bc\u02ba\3\2\2\2\u02bd" + "\u02c0\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u008f\3\2"
         + "\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c6\5\u0086D\2\u02c2\u02c3\7\36\2\2\u02c3" + "\u02c5\5\u0086D\2\u02c4\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4"
         + "\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u0091\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9" + "\u02ca\7*\2\2\u02ca\u02cb\7\22\2\2\u02cb\u02cc\5\u0086D\2\u02cc\u02cd"
         + "\7\23\2\2\u02cd\u0093\3\2\2\2\u02ce\u02cf\7\r\2\2\u02cf\u02d0\7\22\2\2" + "\u02d0\u02d1\5\u0086D\2\u02d1\u02d2\7\23\2\2\u02d2\u0095\3\2\2\2\u02d3"
         + "\u02d4\7/\2\2\u02d4\u02d5\7\22\2\2\u02d5\u02d6\5\u0086D\2\u02d6\u02d7" + "\7\23\2\2\u02d7\u0097\3\2\2\2\u02d8\u02d9\7\61\2\2\u02d9\u02da\7\22\2"
         + "\2\u02da\u02db\5\u0086D\2\u02db\u02dc\7\23\2\2\u02dc\u0099\3\2\2\2\u02dd" + "\u02de\7\16\2\2\u02de\u02df\7\22\2\2\u02df\u02e0\5\u0086D\2\u02e0\u02e1"
         + "\7\36\2\2\u02e1\u02e2\5\u0086D\2\u02e2\u02e3\7\36\2\2\u02e3\u02e4\5\u0086" + "D\2\u02e4\u02e5\7\23\2\2\u02e5\u009b\3\2\2\2\u02e6\u02e7\7:\2\2\u02e7"
         + "\u02e8\7\22\2\2\u02e8\u02e9\5\u0086D\2\u02e9\u02ea\7\23\2\2\u02ea\u009d" + "\3\2\2\2\u02eb\u02ec\7<\2\2\u02ec\u02ed\7\22\2\2\u02ed\u02ee\5\u0086D"
         + "\2\u02ee\u02ef\7\23\2\2\u02ef\u009f\3\2\2\2\u02f0\u02f1\7>\2\2\u02f1\u02f2" + "\7\22\2\2\u02f2\u02f3\5\u0086D\2\u02f3\u02f4\7\23\2\2\u02f4\u00a1\3\2"
         + "\2\2\u02f5\u02f6\7F\2\2\u02f6\u02f7\7\22\2\2\u02f7\u02f8\5\u0086D\2\u02f8" + "\u02f9\7\23\2\2\u02f9\u00a3\3\2\2\2\u02fa\u02fb\7G\2\2\u02fb\u02fc\7\22"
         + "\2\2\u02fc\u02fd\5\u0086D\2\u02fd\u02fe\7\23\2\2\u02fe\u00a5\3\2\2\2\u02ff" + "\u0300\7H\2\2\u0300\u0301\7\22\2\2\u0301\u0302\5\u0086D\2\u0302\u0303"
         + "\7\23\2\2\u0303\u00a7\3\2\2\2\u0304\u0305\7I\2\2\u0305\u0306\7\22\2\2" + "\u0306\u0307\5\u0086D\2\u0307\u0308\7\23\2\2\u0308\u00a9\3\2\2\2\u0309"
         + "\u030a\7\17\2\2\u030a\u030b\7\22\2\2\u030b\u030c\5\u0086D\2\u030c\u030d" + "\7\36\2\2\u030d\u030e\5\u0086D\2\u030e\u030f\7\23\2\2\u030f\u00ab\3\2"
         + "\2\2\u0310\u0311\7\20\2\2\u0311\u0312\7\22\2\2\u0312\u0313\5\u0086D\2" + "\u0313\u0314\7\36\2\2\u0314\u0315\5\u0086D\2\u0315\u0316\7\23\2\2\u0316"
         + "\u00ad\3\2\2\2\u0317\u0318\7\21\2\2\u0318\u0319\7\22\2\2\u0319\u031a\5" + "\u0086D\2\u031a\u031b\7\23\2\2\u031b\u00af\3\2\2\2\u031c\u031d\7U\2\2"
         + "\u031d\u031e\5\u0088E\2\u031e\u031f\7\22\2\2\u031f\u0320\5\u0086D\2\u0320" + "\u0321\7\23\2\2\u0321\u00b1\3\2\2\2\u0322\u0323\7V\2\2\u0323\u0324\7\22"
         + "\2\2\u0324\u0325\5\u0086D\2\u0325\u0326\7\23\2\2\u0326\u00b3\3\2\2\2\u0327" + "\u0328\7_\2\2\u0328\u0329\7\22\2\2\u0329\u032a\5\u0086D\2\u032a\u032b"
         + "\7\36\2\2\u032b\u032c\5\u0086D\2\u032c\u032d\7\23\2\2\u032d\u00b5\3\2" + "\2\2\u032e\u032f\7b\2\2\u032f\u0330\7\22\2\2\u0330\u0331\5\u0086D\2\u0331"
         + "\u0332\7\23\2\2\u0332\u00b7\3\2\2\2\u0333\u0334\7c\2\2\u0334\u0335\7\22" + "\2\2\u0335\u0336\5\u0086D\2\u0336\u0337\7\23\2\2\u0337\u00b9\3\2\2\2\u0338"
         + "\u0339\7d\2\2\u0339\u033a\7\22\2\2\u033a\u033b\5\u0086D\2\u033b\u033c" + "\7\23\2\2\u033c\u00bb\3\2\2\2\u033d\u033e\7e\2\2\u033e\u033f\7\22\2\2"
         + "\u033f\u0340\5\u0086D\2\u0340\u0341\7\23\2\2\u0341\u00bd\3\2\2\2\u0342" + "\u0343\7f\2\2\u0343\u0344\7\22\2\2\u0344\u0345\5\u0086D\2\u0345\u0346"
         + "\7\23\2\2\u0346\u00bf\3\2\2\2\u0347\u0348\7g\2\2\u0348\u0349\7\22\2\2" + "\u0349\u034a\5\u0086D\2\u034a\u034b\7\23\2\2\u034b\u00c1\3\2\2\2\u034c"
         + "\u034d\7h\2\2\u034d\u034e\7\22\2\2\u034e\u034f\5\u0086D\2\u034f\u0350" + "\7\23\2\2\u0350\u00c3\3\2\2\2\u0351\u0352\7i\2\2\u0352\u0353\7\22\2\2"
         + "\u0353\u0354\5\u0086D\2\u0354\u0355\7\23\2\2\u0355\u00c5\3\2\2\2\u0356" + "\u0357\7j\2\2\u0357\u0358\7\22\2\2\u0358\u0359\5\u0086D\2\u0359\u035a"
         + "\7\23\2\2\u035a\u00c7\3\2\2\2\61\u00cb\u00d1\u00d5\u00d9\u00de\u00e5\u00e9" + "\u011a\u0123\u0128\u012c\u0131\u0138\u0144\u014b\u0152\u0159\u015d\u0167"
         + "\u016c\u0171\u018e\u0197\u019f\u01a8\u01b8\u01c3\u01d8\u01dc\u01e7\u01f0" + "\u01f9\u023d\u0244\u0273\u0276\u027b\u0285\u028d\u0295\u029e\u02a7\u02aa" + "\u02ae\u02b4\u02be\u02c6";
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
            setState(852);
            match(ABS);
            setState(853);
            match(LPAREN);
            setState(854);
            expression();
            setState(855);
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
            setState(654);
            multiplyingExpression();
            setState(659);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 39, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(655);
                        _la = _input.LA(1);
                        if (!((_la == PLUS) || (_la == MINUS))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(656);
                        multiplyingExpression();
                     }
                  }
               }
               setState(661);
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
            setState(222);
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
         setState(231);
         switch (_input.LA(1)) {
            case RETURN:
            case PRINT:
            case GOTO:
            case GOSUB:
            case IF:
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
                     setState(227);
                     switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                        case 1: {
                           setState(226);
                           amperoper();
                        }
                           break;
                     }
                     setState(229);
                     statement();
                  }
               }
               break;
            case REM:
            case COMMENT:
               enterOuterAlt(_localctx, 2);
               {
                  setState(230);
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
      enterRule(_localctx, 110, RULE_amptstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(580);
            match(AMPERSAND);
            setState(581);
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
            setState(726);
            match(ASC);
            setState(727);
            match(LPAREN);
            setState(728);
            expression();
            setState(729);
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
            setState(827);
            match(ATN);
            setState(828);
            match(LPAREN);
            setState(829);
            expression();
            setState(830);
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
      enterRule(_localctx, 48, RULE_callstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(388);
            match(CALL);
            setState(389);
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
            setState(716);
            match(CHR);
            setState(717);
            match(LPAREN);
            setState(718);
            expression();
            setState(719);
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
      enterRule(_localctx, 88, RULE_colorstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(531);
            match(COLOR);
            setState(532);
            match(EQ);
            setState(533);
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
            setState(817);
            match(COS);
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

   public final DatastmtContext datastmt() throws RecognitionException {
      final DatastmtContext _localctx = new DatastmtContext(_ctx, getState());
      enterRule(_localctx, 68, RULE_datastmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(466);
            match(DATA);
            setState(467);
            datum();
            setState(474);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(468);
                     match(COMMA);
                     setState(470);
                     _la = _input.LA(1);
                     if ((((((_la - 118)) & ~0x3f) == 0) && (((1L << (_la - 118)) & ((1L << (STRINGLITERAL - 118)) | (1L << (NUMBER - 118)) | (1L << (FLOAT - 118)))) != 0))) {
                        {
                           setState(469);
                           datum();
                        }
                     }
                  }
               }
               setState(476);
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
      enterRule(_localctx, 70, RULE_datum);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(477);
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
      enterRule(_localctx, 78, RULE_defstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(505);
            match(DEF);
            setState(506);
            match(FN);
            setState(507);
            var();
            setState(508);
            match(LPAREN);
            setState(509);
            var();
            setState(510);
            match(RPAREN);
            setState(511);
            match(EQ);
            setState(512);
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
      enterRule(_localctx, 40, RULE_dimstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(374);
            match(DIM);
            setState(375);
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
      enterRule(_localctx, 76, RULE_drawstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(496);
            match(DRAW);
            setState(497);
            expression();
            setState(503);
            _la = _input.LA(1);
            if (_la == AT) {
               {
                  setState(498);
                  match(AT);
                  setState(499);
                  expression();
                  setState(500);
                  match(COMMA);
                  setState(501);
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
      enterRule(_localctx, 114, RULE_endstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(586);
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
            setState(842);
            match(EXP);
            setState(843);
            match(LPAREN);
            setState(844);
            expression();
            setState(845);
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
            setState(638);
            signExpression();
            setState(643);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == EXPONENT) {
               {
                  {
                     setState(639);
                     match(EXPONENT);
                     setState(640);
                     signExpression();
                  }
               }
               setState(645);
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
         setState(680);
         switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(671);
                  func();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(672);
                     relationalExpression();
                     setState(677);
                     _errHandler.sync(this);
                     _la = _input.LA(1);
                     while ((_la == AND) || (_la == OR)) {
                        {
                           {
                              setState(673);
                              _la = _input.LA(1);
                              if (!((_la == AND) || (_la == OR))) {
                                 _errHandler.recoverInline(this);
                              }
                              consume();
                              setState(674);
                              relationalExpression();
                           }
                        }
                        setState(679);
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
            setState(703);
            expression();
            setState(708);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(704);
                     match(COMMA);
                     setState(705);
                     expression();
                  }
               }
               setState(710);
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
            setState(794);
            match(FN);
            setState(795);
            var();
            setState(796);
            match(LPAREN);
            setState(797);
            expression();
            setState(798);
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
            setState(349);
            match(FOR);
            setState(350);
            vardecl();
            setState(351);
            match(EQ);
            setState(352);
            expression();
            setState(353);
            match(TO);
            setState(354);
            expression();
            setState(357);
            _la = _input.LA(1);
            if (_la == STEP) {
               {
                  setState(355);
                  match(STEP);
                  setState(356);
                  expression();
               }
            }
            setState(359);
            statement();
            setState(360);
            match(NEXT);
            setState(362);
            _la = _input.LA(1);
            if (_la == LETTERS) {
               {
                  setState(361);
                  vardecl();
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
            setState(760);
            match(FRE);
            setState(761);
            match(LPAREN);
            setState(762);
            expression();
            setState(763);
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
         setState(625);
         switch (_input.LA(1)) {
            case STRINGLITERAL:
            case NUMBER:
            case FLOAT:
               enterOuterAlt(_localctx, 1);
               {
                  setState(592);
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
                  setState(593);
                  vardecl();
               }
               break;
            case CHR:
               enterOuterAlt(_localctx, 3);
               {
                  setState(594);
                  chrfunc();
               }
               break;
            case SQR:
               enterOuterAlt(_localctx, 4);
               {
                  setState(595);
                  sqrfunc();
               }
               break;
            case LEN:
               enterOuterAlt(_localctx, 5);
               {
                  setState(596);
                  lenfunc();
               }
               break;
            case STR:
               enterOuterAlt(_localctx, 6);
               {
                  setState(597);
                  strfunc();
               }
               break;
            case ASC:
               enterOuterAlt(_localctx, 7);
               {
                  setState(598);
                  ascfunc();
               }
               break;
            case SCRN:
               enterOuterAlt(_localctx, 8);
               {
                  setState(599);
                  scrnfunc();
               }
               break;
            case MID:
               enterOuterAlt(_localctx, 9);
               {
                  setState(600);
                  midfunc();
               }
               break;
            case PDL:
               enterOuterAlt(_localctx, 10);
               {
                  setState(601);
                  pdlfunc();
               }
               break;
            case PEEK:
               enterOuterAlt(_localctx, 11);
               {
                  setState(602);
                  peekfunc();
               }
               break;
            case INTF:
               enterOuterAlt(_localctx, 12);
               {
                  setState(603);
                  intfunc();
               }
               break;
            case SPC:
               enterOuterAlt(_localctx, 13);
               {
                  setState(604);
                  spcfunc();
               }
               break;
            case FRE:
               enterOuterAlt(_localctx, 14);
               {
                  setState(605);
                  frefunc();
               }
               break;
            case POS:
               enterOuterAlt(_localctx, 15);
               {
                  setState(606);
                  posfunc();
               }
               break;
            case USR:
               enterOuterAlt(_localctx, 16);
               {
                  setState(607);
                  usrfunc();
               }
               break;
            case LEFT:
               enterOuterAlt(_localctx, 17);
               {
                  setState(608);
                  leftfunc();
               }
               break;
            case VAL:
               enterOuterAlt(_localctx, 18);
               {
                  setState(609);
                  valfunc();
               }
               break;
            case RIGHT:
               enterOuterAlt(_localctx, 19);
               {
                  setState(610);
                  rightfunc();
               }
               break;
            case FN:
               enterOuterAlt(_localctx, 20);
               {
                  setState(611);
                  fnfunc();
               }
               break;
            case SIN:
               enterOuterAlt(_localctx, 21);
               {
                  setState(612);
                  sinfunc();
               }
               break;
            case COS:
               enterOuterAlt(_localctx, 22);
               {
                  setState(613);
                  cosfunc();
               }
               break;
            case TAN:
               enterOuterAlt(_localctx, 23);
               {
                  setState(614);
                  tanfunc();
               }
               break;
            case ATN:
               enterOuterAlt(_localctx, 24);
               {
                  setState(615);
                  atnfunc();
               }
               break;
            case RND:
               enterOuterAlt(_localctx, 25);
               {
                  setState(616);
                  rndfunc();
               }
               break;
            case SGN:
               enterOuterAlt(_localctx, 26);
               {
                  setState(617);
                  sgnfunc();
               }
               break;
            case EXP:
               enterOuterAlt(_localctx, 27);
               {
                  setState(618);
                  expfunc();
               }
               break;
            case LOG:
               enterOuterAlt(_localctx, 28);
               {
                  setState(619);
                  logfunc();
               }
               break;
            case ABS:
               enterOuterAlt(_localctx, 29);
               {
                  setState(620);
                  absfunc();
               }
               break;
            case LPAREN:
               enterOuterAlt(_localctx, 30);
               {
                  {
                     setState(621);
                     match(LPAREN);
                     setState(622);
                     expression();
                     setState(623);
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
            setState(306);
            match(GET);
            setState(307);
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
      enterRule(_localctx, 44, RULE_gosubstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(380);
            match(GOSUB);
            setState(381);
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
      enterRule(_localctx, 42, RULE_gotostmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(377);
            match(GOTO);
            setState(378);
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
         setState(329);
         switch (_input.LA(1)) {
            case GTE:
               enterOuterAlt(_localctx, 1);
               {
                  setState(324);
                  match(GTE);
               }
               break;
            case GT:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(325);
                     match(GT);
                     setState(326);
                     match(EQ);
                  }
               }
               break;
            case EQ:
               enterOuterAlt(_localctx, 3);
               {
                  {
                     setState(327);
                     match(EQ);
                     setState(328);
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
      enterRule(_localctx, 90, RULE_hcolorstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(535);
            match(HCOLOR);
            setState(536);
            match(EQ);
            setState(537);
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
      enterRule(_localctx, 64, RULE_himemstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(458);
            match(HIMEM);
            setState(459);
            match(COLON);
            setState(460);
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
      enterRule(_localctx, 92, RULE_hlinstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(539);
            match(HLIN);
            setState(540);
            expression();
            setState(541);
            match(COMMA);
            setState(542);
            expression();
            setState(543);
            match(AT);
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

   public final HplotstmtContext hplotstmt() throws RecognitionException {
      final HplotstmtContext _localctx = new HplotstmtContext(_ctx, getState());
      enterRule(_localctx, 50, RULE_hplotstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(391);
            match(HPLOT);
            setState(396);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(392);
                  expression();
                  setState(393);
                  match(COMMA);
                  setState(394);
                  expression();
               }
            }
            setState(405);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == TO) {
               {
                  {
                     setState(398);
                     match(TO);
                     setState(399);
                     expression();
                     setState(400);
                     match(COMMA);
                     setState(401);
                     expression();
                  }
               }
               setState(407);
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
      enterRule(_localctx, 62, RULE_htabstmnt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(455);
            match(HTAB);
            setState(456);
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
            setState(340);
            match(IF);
            setState(341);
            expression();
            setState(343);
            _la = _input.LA(1);
            if (_la == THEN) {
               {
                  setState(342);
                  match(THEN);
               }
            }
            setState(347);
            switch (_input.LA(1)) {
               case RETURN:
               case PRINT:
               case GOTO:
               case GOSUB:
               case IF:
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
                  setState(345);
                  statement();
               }
                  break;
               case NUMBER: {
                  setState(346);
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
      enterRule(_localctx, 112, RULE_includestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(583);
            match(INCLUDE);
            setState(584);
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
      enterRule(_localctx, 36, RULE_inputstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(364);
            match(INPUT);
            setState(367);
            _la = _input.LA(1);
            if (_la == STRINGLITERAL) {
               {
                  setState(365);
                  match(STRINGLITERAL);
                  setState(366);
                  _la = _input.LA(1);
                  if (!((_la == COMMA) || (_la == SEMICOLON))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
            }
            setState(369);
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
      enterRule(_localctx, 100, RULE_instmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(560);
            match(INNUMBER);
            setState(561);
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
            setState(750);
            match(INTF);
            setState(751);
            match(LPAREN);
            setState(752);
            expression();
            setState(753);
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
            setState(775);
            match(LEFT);
            setState(776);
            match(LPAREN);
            setState(777);
            expression();
            setState(778);
            match(COMMA);
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

   public final LenfuncContext lenfunc() throws RecognitionException {
      final LenfuncContext _localctx = new LenfuncContext(_ctx, getState());
      enterRule(_localctx, 148, RULE_lenfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(721);
            match(LEN);
            setState(722);
            match(LPAREN);
            setState(723);
            expression();
            setState(724);
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
            setState(310);
            _la = _input.LA(1);
            if (_la == LET) {
               {
                  setState(309);
                  match(LET);
               }
            }
            setState(312);
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
         setState(220);
         switch (_input.LA(1)) {
            case NUMBER:
               enterOuterAlt(_localctx, 1);
               {
                  {
                     setState(203);
                     linenumber();
                     setState(215);
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
                                       if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << RETURN) | (1L << PRINT) | (1L << GOTO) | (1L << GOSUB) | (1L << IF) | (1L << REM) | (1L << CLEAR)
                                             | (1L << LIST) | (1L << RUN) | (1L << END) | (1L << LET) | (1L << FOR) | (1L << INPUT) | (1L << DIM) | (1L << TEXT) | (1L << HGR) | (1L << HGR2)
                                             | (1L << CALL) | (1L << HPLOT) | (1L << VPLOT) | (1L << PRNUMBER) | (1L << INNUMBER) | (1L << VTAB) | (1L << HTAB) | (1L << HOME) | (1L << ON)
                                             | (1L << PLOT) | (1L << POKE) | (1L << STOP) | (1L << HIMEM) | (1L << LOMEM))) != 0))
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
                           _la = _input.LA(1);
                           if (!((_la == REM) || (_la == COMMENT))) {
                              _errHandler.recoverInline(this);
                           }
                           consume();
                        }
                           break;
                     }
                     setState(217);
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
                  setState(219);
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
            setState(224);
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
      enterRule(_localctx, 106, RULE_liststmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(569);
            match(LIST);
            setState(571);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(570);
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
            setState(847);
            match(LOG);
            setState(848);
            match(LPAREN);
            setState(849);
            expression();
            setState(850);
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
      enterRule(_localctx, 66, RULE_lomemstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(462);
            match(LOMEM);
            setState(463);
            match(COLON);
            setState(464);
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
         setState(336);
         switch (_input.LA(1)) {
            case LTE:
               enterOuterAlt(_localctx, 1);
               {
                  setState(331);
                  match(LTE);
               }
               break;
            case LT:
               enterOuterAlt(_localctx, 2);
               {
                  {
                     setState(332);
                     match(LT);
                     setState(333);
                     match(EQ);
                  }
               }
               break;
            case EQ:
               enterOuterAlt(_localctx, 3);
               {
                  {
                     setState(334);
                     match(EQ);
                     setState(335);
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
            setState(731);
            match(MID);
            setState(732);
            match(LPAREN);
            setState(733);
            expression();
            setState(734);
            match(COMMA);
            setState(735);
            expression();
            setState(736);
            match(COMMA);
            setState(737);
            expression();
            setState(738);
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
            setState(646);
            exponentExpression();
            setState(651);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((_la == TIMES) || (_la == DIV)) {
               {
                  {
                     setState(647);
                     _la = _input.LA(1);
                     if (!((_la == TIMES) || (_la == DIV))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                     setState(648);
                     exponentExpression();
                  }
               }
               setState(653);
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
            setState(338);
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

   public final OnerrstmtContext onerrstmt() throws RecognitionException {
      final OnerrstmtContext _localctx = new OnerrstmtContext(_ctx, getState());
      enterRule(_localctx, 96, RULE_onerrstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(553);
            match(ONERR);
            setState(554);
            match(GOTO);
            setState(555);
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
      enterRule(_localctx, 58, RULE_ongosubstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(441);
            match(ON);
            setState(442);
            expression();
            setState(443);
            match(GOSUB);
            setState(444);
            linenumber();
            setState(449);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(445);
                     match(COMMA);
                     setState(446);
                     linenumber();
                  }
               }
               setState(451);
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
      enterRule(_localctx, 56, RULE_ongotostmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(430);
            match(ON);
            setState(431);
            expression();
            setState(432);
            match(GOTO);
            setState(433);
            linenumber();
            setState(438);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(434);
                     match(COMMA);
                     setState(435);
                     linenumber();
                  }
               }
               setState(440);
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
            setState(740);
            match(PDL);
            setState(741);
            match(LPAREN);
            setState(742);
            expression();
            setState(743);
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
            setState(745);
            match(PEEK);
            setState(746);
            match(LPAREN);
            setState(747);
            expression();
            setState(748);
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
      enterRule(_localctx, 54, RULE_plotstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(425);
            match(PLOT);
            setState(426);
            expression();
            setState(427);
            match(COMMA);
            setState(428);
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
      enterRule(_localctx, 46, RULE_pokestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(383);
            match(POKE);
            setState(384);
            expression();
            setState(385);
            match(COMMA);
            setState(386);
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
      enterRule(_localctx, 108, RULE_popstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(573);
            match(POP);
            setState(578);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(574);
                  expression();
                  setState(575);
                  match(COMMA);
                  setState(576);
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
            setState(765);
            match(POS);
            setState(766);
            match(LPAREN);
            setState(767);
            expression();
            setState(768);
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
            setState(296);
            expression();
            setState(298);
            _la = _input.LA(1);
            if ((_la == COMMA) || (_la == SEMICOLON)) {
               {
                  setState(297);
                  _la = _input.LA(1);
                  if (!((_la == COMMA) || (_la == SEMICOLON))) {
                     _errHandler.recoverInline(this);
                  }
                  consume();
               }
            }
            setState(303);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 11, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(300);
                        printlist();
                     }
                  }
               }
               setState(305);
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
            setState(292);
            _la = _input.LA(1);
            if (!((_la == PRINT) || (_la == QUESTION))) {
               _errHandler.recoverInline(this);
            }
            consume();
            setState(294);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(293);
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
      enterRule(_localctx, 98, RULE_prstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(557);
            match(PRNUMBER);
            setState(558);
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
      enterRule(_localctx, 38, RULE_readstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(371);
            match(READ);
            setState(372);
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
      enterRule(_localctx, 104, RULE_recallstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(566);
            match(RECALL);
            setState(567);
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
            setState(662);
            addingExpression();
            setState(668);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << GTE) | (1L << LTE) | (1L << GT) | (1L << LT) | (1L << NEQ) | (1L << EQ))) != 0))) {
               {
                  {
                     {
                        setState(663);
                        relop();
                     }
                     setState(664);
                     addingExpression();
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

   public final RelopContext relop() throws RecognitionException {
      final RelopContext _localctx = new RelopContext(_ctx, getState());
      enterRule(_localctx, 24, RULE_relop);
      int _la;
      try {
         setState(322);
         switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(318);
                  lte();
               }
               break;
            case 2:
               enterOuterAlt(_localctx, 2);
               {
                  setState(319);
                  gte();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(320);
                  neq();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(321);
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
      enterRule(_localctx, 118, RULE_restorestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(590);
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
      enterRule(_localctx, 116, RULE_returnstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(588);
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
            setState(782);
            match(RIGHT);
            setState(783);
            match(LPAREN);
            setState(784);
            expression();
            setState(785);
            match(COMMA);
            setState(786);
            expression();
            setState(787);
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
            setState(832);
            match(RND);
            setState(833);
            match(LPAREN);
            setState(834);
            expression();
            setState(835);
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
      enterRule(_localctx, 84, RULE_rotstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(523);
            match(ROT);
            setState(524);
            match(EQ);
            setState(525);
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
      enterRule(_localctx, 86, RULE_scalestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(527);
            match(SCALE);
            setState(528);
            match(EQ);
            setState(529);
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
            setState(805);
            match(SCRN);
            setState(806);
            match(LPAREN);
            setState(807);
            expression();
            setState(808);
            match(COMMA);
            setState(809);
            expression();
            setState(810);
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
            setState(837);
            match(SGN);
            setState(838);
            match(LPAREN);
            setState(839);
            expression();
            setState(840);
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
            setState(628);
            _la = _input.LA(1);
            if (_la == NOT) {
               {
                  setState(627);
                  match(NOT);
               }
            }
            setState(633);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while ((_la == PLUS) || (_la == MINUS)) {
               {
                  {
                     setState(630);
                     _la = _input.LA(1);
                     if (!((_la == PLUS) || (_la == MINUS))) {
                        _errHandler.recoverInline(this);
                     }
                     consume();
                  }
               }
               setState(635);
               _errHandler.sync(this);
               _la = _input.LA(1);
            }
            setState(636);
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
            setState(812);
            match(SIN);
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

   public final SpcfuncContext spcfunc() throws RecognitionException {
      final SpcfuncContext _localctx = new SpcfuncContext(_ctx, getState());
      enterRule(_localctx, 160, RULE_spcfunc);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(755);
            match(SPC);
            setState(756);
            match(LPAREN);
            setState(757);
            expression();
            setState(758);
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
      enterRule(_localctx, 82, RULE_speedstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(519);
            match(SPEED);
            setState(520);
            match(EQ);
            setState(521);
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
            setState(711);
            match(SQR);
            setState(712);
            match(LPAREN);
            setState(713);
            expression();
            setState(714);
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
         setState(280);
         switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
            case 1:
               enterOuterAlt(_localctx, 1);
               {
                  setState(233);
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
                  setState(234);
                  endstmt();
               }
               break;
            case 3:
               enterOuterAlt(_localctx, 3);
               {
                  setState(235);
                  returnstmt();
               }
               break;
            case 4:
               enterOuterAlt(_localctx, 4);
               {
                  setState(236);
                  restorestmt();
               }
               break;
            case 5:
               enterOuterAlt(_localctx, 5);
               {
                  setState(237);
                  amptstmt();
               }
               break;
            case 6:
               enterOuterAlt(_localctx, 6);
               {
                  setState(238);
                  popstmt();
               }
               break;
            case 7:
               enterOuterAlt(_localctx, 7);
               {
                  setState(239);
                  liststmt();
               }
               break;
            case 8:
               enterOuterAlt(_localctx, 8);
               {
                  setState(240);
                  storestmt();
               }
               break;
            case 9:
               enterOuterAlt(_localctx, 9);
               {
                  setState(241);
                  getstmt();
               }
               break;
            case 10:
               enterOuterAlt(_localctx, 10);
               {
                  setState(242);
                  recallstmt();
               }
               break;
            case 11:
               enterOuterAlt(_localctx, 11);
               {
                  setState(243);
                  instmt();
               }
               break;
            case 12:
               enterOuterAlt(_localctx, 12);
               {
                  setState(244);
                  prstmt();
               }
               break;
            case 13:
               enterOuterAlt(_localctx, 13);
               {
                  setState(245);
                  onerrstmt();
               }
               break;
            case 14:
               enterOuterAlt(_localctx, 14);
               {
                  setState(246);
                  hlinstmt();
               }
               break;
            case 15:
               enterOuterAlt(_localctx, 15);
               {
                  setState(247);
                  vlinstmt();
               }
               break;
            case 16:
               enterOuterAlt(_localctx, 16);
               {
                  setState(248);
                  colorstmt();
               }
               break;
            case 17:
               enterOuterAlt(_localctx, 17);
               {
                  setState(249);
                  speedstmt();
               }
               break;
            case 18:
               enterOuterAlt(_localctx, 18);
               {
                  setState(250);
                  scalestmt();
               }
               break;
            case 19:
               enterOuterAlt(_localctx, 19);
               {
                  setState(251);
                  rotstmt();
               }
               break;
            case 20:
               enterOuterAlt(_localctx, 20);
               {
                  setState(252);
                  hcolorstmt();
               }
               break;
            case 21:
               enterOuterAlt(_localctx, 21);
               {
                  setState(253);
                  himemstmt();
               }
               break;
            case 22:
               enterOuterAlt(_localctx, 22);
               {
                  setState(254);
                  lomemstmt();
               }
               break;
            case 23:
               enterOuterAlt(_localctx, 23);
               {
                  setState(255);
                  printstmt1();
               }
               break;
            case 24:
               enterOuterAlt(_localctx, 24);
               {
                  setState(256);
                  pokestmt();
               }
               break;
            case 25:
               enterOuterAlt(_localctx, 25);
               {
                  setState(257);
                  plotstmt();
               }
               break;
            case 26:
               enterOuterAlt(_localctx, 26);
               {
                  setState(258);
                  ongotostmt();
               }
               break;
            case 27:
               enterOuterAlt(_localctx, 27);
               {
                  setState(259);
                  ongosubstmt();
               }
               break;
            case 28:
               enterOuterAlt(_localctx, 28);
               {
                  setState(260);
                  ifstmt();
               }
               break;
            case 29:
               enterOuterAlt(_localctx, 29);
               {
                  setState(261);
                  forstmt();
               }
               break;
            case 30:
               enterOuterAlt(_localctx, 30);
               {
                  setState(262);
                  inputstmt();
               }
               break;
            case 31:
               enterOuterAlt(_localctx, 31);
               {
                  setState(263);
                  tabstmt();
               }
               break;
            case 32:
               enterOuterAlt(_localctx, 32);
               {
                  setState(264);
                  dimstmt();
               }
               break;
            case 33:
               enterOuterAlt(_localctx, 33);
               {
                  setState(265);
                  gotostmt();
               }
               break;
            case 34:
               enterOuterAlt(_localctx, 34);
               {
                  setState(266);
                  gosubstmt();
               }
               break;
            case 35:
               enterOuterAlt(_localctx, 35);
               {
                  setState(267);
                  callstmt();
               }
               break;
            case 36:
               enterOuterAlt(_localctx, 36);
               {
                  setState(268);
                  readstmt();
               }
               break;
            case 37:
               enterOuterAlt(_localctx, 37);
               {
                  setState(269);
                  hplotstmt();
               }
               break;
            case 38:
               enterOuterAlt(_localctx, 38);
               {
                  setState(270);
                  vplotstmt();
               }
               break;
            case 39:
               enterOuterAlt(_localctx, 39);
               {
                  setState(271);
                  vtabstmnt();
               }
               break;
            case 40:
               enterOuterAlt(_localctx, 40);
               {
                  setState(272);
                  htabstmnt();
               }
               break;
            case 41:
               enterOuterAlt(_localctx, 41);
               {
                  setState(273);
                  waitstmt();
               }
               break;
            case 42:
               enterOuterAlt(_localctx, 42);
               {
                  setState(274);
                  datastmt();
               }
               break;
            case 43:
               enterOuterAlt(_localctx, 43);
               {
                  setState(275);
                  xdrawstmt();
               }
               break;
            case 44:
               enterOuterAlt(_localctx, 44);
               {
                  setState(276);
                  drawstmt();
               }
               break;
            case 45:
               enterOuterAlt(_localctx, 45);
               {
                  setState(277);
                  defstmt();
               }
               break;
            case 46:
               enterOuterAlt(_localctx, 46);
               {
                  setState(278);
                  letstmt();
               }
               break;
            case 47:
               enterOuterAlt(_localctx, 47);
               {
                  setState(279);
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
      enterRule(_localctx, 102, RULE_storestmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(563);
            match(STORE);
            setState(564);
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
            setState(789);
            match(STR);
            setState(790);
            match(LPAREN);
            setState(791);
            expression();
            setState(792);
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
      enterRule(_localctx, 80, RULE_tabstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(514);
            match(TAB);
            setState(515);
            match(LPAREN);
            setState(516);
            expression();
            setState(517);
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
            setState(822);
            match(TAN);
            setState(823);
            match(LPAREN);
            setState(824);
            expression();
            setState(825);
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
            setState(770);
            match(USR);
            setState(771);
            match(LPAREN);
            setState(772);
            expression();
            setState(773);
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
            setState(800);
            match(VAL);
            setState(801);
            match(LPAREN);
            setState(802);
            expression();
            setState(803);
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
            setState(682);
            varname();
            setState(684);
            _la = _input.LA(1);
            if ((_la == DOLLAR) || (_la == PERCENT)) {
               {
                  setState(683);
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
            setState(282);
            var();
            setState(289);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(283);
                        match(LPAREN);
                        setState(284);
                        exprlist();
                        setState(285);
                        match(RPAREN);
                     }
                  }
               }
               setState(291);
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
            setState(314);
            vardecl();
            setState(315);
            match(EQ);
            setState(316);
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
            setState(695);
            vardecl();
            setState(700);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == COMMA) {
               {
                  {
                     setState(696);
                     match(COMMA);
                     setState(697);
                     vardecl();
                  }
               }
               setState(702);
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
            setState(686);
            match(LETTERS);
            setState(690);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 44, _ctx);
            while ((_alt != 2) && (_alt != -1)) {
               if (_alt == 1) {
                  {
                     {
                        setState(687);
                        _la = _input.LA(1);
                        if (!((_la == LETTERS) || (_la == NUMBER))) {
                           _errHandler.recoverInline(this);
                        }
                        consume();
                     }
                  }
               }
               setState(692);
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
      enterRule(_localctx, 138, RULE_varsuffix);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(693);
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
      enterRule(_localctx, 94, RULE_vlinstmt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(546);
            match(VLIN);
            setState(547);
            expression();
            setState(548);
            match(COMMA);
            setState(549);
            expression();
            setState(550);
            match(AT);
            setState(551);
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
      enterRule(_localctx, 52, RULE_vplotstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(408);
            match(VPLOT);
            setState(413);
            _la = _input.LA(1);
            if (((((_la) & ~0x3f) == 0) && (((1L << _la) & ((1L << CHR) | (1L << MID) | (1L << LEFT) | (1L << RIGHT) | (1L << STR) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << SQR)
                  | (1L << LEN) | (1L << ASC) | (1L << PDL) | (1L << PEEK) | (1L << INTF))) != 0))
                  || (((((_la - 68)) & ~0x3f) == 0) && (((1L << (_la - 68)) & ((1L << (SPC - 68)) | (1L << (FRE - 68)) | (1L << (POS - 68)) | (1L << (USR - 68)) | (1L << (FN - 68))
                        | (1L << (VAL - 68)) | (1L << (SCRN - 68)) | (1L << (SIN - 68)) | (1L << (COS - 68)) | (1L << (TAN - 68)) | (1L << (ATN - 68)) | (1L << (RND - 68)) | (1L << (SGN - 68))
                        | (1L << (EXP - 68)) | (1L << (LOG - 68)) | (1L << (ABS - 68)) | (1L << (NOT - 68)) | (1L << (STRINGLITERAL - 68)) | (1L << (LETTERS - 68)) | (1L << (NUMBER - 68)) | (1L << (FLOAT - 68)))) != 0))) {
               {
                  setState(409);
                  expression();
                  setState(410);
                  match(COMMA);
                  setState(411);
                  expression();
               }
            }
            setState(422);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == TO) {
               {
                  {
                     setState(415);
                     match(TO);
                     setState(416);
                     expression();
                     setState(417);
                     match(COMMA);
                     setState(418);
                     expression();
                  }
               }
               setState(424);
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
      enterRule(_localctx, 60, RULE_vtabstmnt);
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(452);
            match(VTAB);
            setState(453);
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
      enterRule(_localctx, 72, RULE_waitstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(479);
            match(WAIT);
            setState(480);
            expression();
            setState(481);
            match(COMMA);
            setState(482);
            expression();
            setState(485);
            _la = _input.LA(1);
            if (_la == COMMA) {
               {
                  setState(483);
                  match(COMMA);
                  setState(484);
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
      enterRule(_localctx, 74, RULE_xdrawstmt);
      int _la;
      try {
         enterOuterAlt(_localctx, 1);
         {
            setState(487);
            match(XDRAW);
            setState(488);
            expression();
            setState(494);
            _la = _input.LA(1);
            if (_la == AT) {
               {
                  setState(489);
                  match(AT);
                  setState(490);
                  expression();
                  setState(491);
                  match(COMMA);
                  setState(492);
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