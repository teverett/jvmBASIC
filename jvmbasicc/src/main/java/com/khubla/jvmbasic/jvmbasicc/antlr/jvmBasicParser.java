// $ANTLR 3.4 com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g 2012-12-27 22:49:03
package com.khubla.jvmbasic.jvmbasicc.antlr;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class jvmBasicParser extends Parser {
   public static class absfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class addingExpression_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class amperoper_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class amprstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class amptstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class ascfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class atnfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class callstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class chrfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class colorstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class comment_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class cosfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class datastmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class defstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   class DFA5 extends DFA {
      public DFA5(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         decisionNumber = 5;
         eot = DFA5_eot;
         eof = DFA5_eof;
         min = DFA5_min;
         max = DFA5_max;
         accept = DFA5_accept;
         special = DFA5_special;
         transition = DFA5_transition;
      }

      public String getDescription() {
         return "142:1: statement : ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt | hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt );";
      }

      public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
         final TokenStream input = (TokenStream) _input;
         final int _s = s;
         switch (s) {
            case 0:
               final int LA5_41 = input.LA(1);
               final int index5_41 = input.index();
               input.rewind();
               s = -1;
               if ((synpred46_jvmBasic())) {
                  s = 42;
               } else if ((synpred47_jvmBasic())) {
                  s = 43;
               }
               input.seek(index5_41);
               if (s >= 0) {
                  return s;
               }
               break;
         }
         if (state.backtracking > 0) {
            state.failed = true;
            return -1;
         }
         final NoViableAltException nvae = new NoViableAltException(getDescription(), 5, _s, input);
         error(nvae);
         throw nvae;
      }
   }

   public static class dimstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class drawstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class expfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class exponentExpression_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class expression_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class exprlist_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class fnfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class forstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class frefunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class func_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class getstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class gosubstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class gotostmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class gte_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class hcolorstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class himemstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class hlinstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class hplotstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class htabstmnt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class ifstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class inputstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class instmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class intfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class leftfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class lenfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class letstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class line_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class linenumber_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class liststmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class logfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class lomemstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class lte_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class midfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class multiplyingExpression_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class neq_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class nextstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class onerrstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class ongosubstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class ongotostmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class pdlfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class peekfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class plotstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class pokestmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class popstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class posfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class printlist_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class printstmt1_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class prog_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class prstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class readstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class recallstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class relationalExpression_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class relop_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class rightfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class rndfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class rotstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class scalestmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class scrnfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class sgnfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class signExpression_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class sinfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class spcfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class speedstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class sqrfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class statement_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class storestmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class strfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class stringliteral_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class tabstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class tanfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class usrfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class valfunc_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class var_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class vardecl_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class variableassignment_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class varlist_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class varname_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class varsuffix_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class vlinstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class vplotstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class vtabstmnt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class waitstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static class xdrawstmt_return extends ParserRuleReturnScope {
      CommonTree tree;

      public Object getTree() {
         return tree;
      }
   }

   public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AMPERSAND", "AND", "ASC", "AT", "ATN", "CALL", "CHR", "CLEAR", "COLON", "COLOR", "COMMA",
         "COS", "CR", "DATA", "DEF", "DIM", "DIV", "DRAW", "END", "EQ", "EXP", "EXPONENT", "FLASH", "FN", "FOR", "FRE", "GET", "GOSUB", "GOTO", "GR", "GT", "GTE", "HCOLOR", "HGR", "HGR2", "HIMEM",
         "HLIN", "HOME", "HPLOT", "HTAB", "IF", "INNUMBER", "INPUT", "INTF", "INVERSE", "LEFT", "LEN", "LET", "LETTERS", "LIST", "LOAD", "LOG", "LOMEM", "LPAREN", "LT", "LTE", "MID", "MINUS", "NEXT",
         "NORMAL", "NOT", "NOTRACE", "NUMBER", "ON", "ONERR", "OR", "PDL", "PEEK", "PLOT", "PLUS", "POKE", "POP", "POS", "PRINT", "PRNUMBER", "QUESTION", "READ", "RECALL", "REM", "RESTORE", "RETURN",
         "RIGHT", "RND", "ROT", "RPAREN", "RUN", "SAVE", "SCALE", "SCRN", "SEMICOLON", "SGN", "SHLOAD", "SIN", "SPC", "SPEED", "SQR", "STEP", "STOP", "STORE", "STR", "STRINGLITERAL", "TAB", "TAN",
         "TEXT", "THEN", "TIMES", "TO", "TRACE", "USR", "VAL", "VLIN", "VPLOT", "VTAB", "WAIT", "WS", "XDRAW", "'$'", "'%'", "'0'", "'9'" };
   public static final int EOF = -1;
   public static final int T__121 = 121;
   public static final int T__122 = 122;
   public static final int T__123 = 123;
   public static final int T__124 = 124;
   public static final int ABS = 4;
   public static final int AMPERSAND = 5;
   public static final int AND = 6;
   public static final int ASC = 7;
   public static final int AT = 8;
   public static final int ATN = 9;
   public static final int CALL = 10;
   public static final int CHR = 11;
   public static final int CLEAR = 12;
   public static final int COLON = 13;
   public static final int COLOR = 14;
   public static final int COMMA = 15;
   public static final int COS = 16;
   public static final int CR = 17;
   public static final int DATA = 18;
   public static final int DEF = 19;
   public static final int DIM = 20;
   public static final int DIV = 21;
   public static final int DRAW = 22;
   public static final int END = 23;
   // delegators
   public static final int EQ = 24;
   public static final int EXP = 25;
   public static final int EXPONENT = 26;
   public static final int FLASH = 27;
   public static final int FN = 28;
   public static final int FOR = 29;
   public static final int FRE = 30;
   public static final int GET = 31;;
   public static final int GOSUB = 32;
   public static final int GOTO = 33;;
   public static final int GR = 34;
   public static final int GT = 35;;
   public static final int GTE = 36;
   public static final int HCOLOR = 37;;
   public static final int HGR = 38;
   public static final int HGR2 = 39;;
   public static final int HIMEM = 40;
   public static final int HLIN = 41;;
   public static final int HOME = 42;
   public static final int HPLOT = 43;;
   public static final int HTAB = 44;
   public static final int IF = 45;;
   public static final int INNUMBER = 46;
   public static final int INPUT = 47;;
   public static final int INTF = 48;
   public static final int INVERSE = 49;;
   public static final int LEFT = 50;
   public static final int LEN = 51;;
   public static final int LET = 52;
   public static final int LETTERS = 53;;
   public static final int LIST = 54;
   public static final int LOAD = 55;;
   public static final int LOG = 56;
   public static final int LOMEM = 57;;
   public static final int LPAREN = 58;
   public static final int LT = 59;;
   public static final int LTE = 60;
   public static final int MID = 61;;
   public static final int MINUS = 62;
   public static final int NEXT = 63;;
   public static final int NORMAL = 64;
   public static final int NOT = 65;;
   public static final int NOTRACE = 66;
   public static final int NUMBER = 67;;
   public static final int ON = 68;
   public static final int ONERR = 69;;
   public static final int OR = 70;
   public static final int PDL = 71;;
   public static final int PEEK = 72;
   public static final int PLOT = 73;;
   public static final int PLUS = 74;
   public static final int POKE = 75;;
   public static final int POP = 76;
   public static final int POS = 77;;
   public static final int PRINT = 78;
   public static final int PRNUMBER = 79;;
   public static final int QUESTION = 80;
   public static final int READ = 81;;
   public static final int RECALL = 82;
   public static final int REM = 83;;
   public static final int RESTORE = 84;
   public static final int RETURN = 85;;
   public static final int RIGHT = 86;
   public static final int RND = 87;;
   public static final int ROT = 88;
   public static final int RPAREN = 89;;
   public static final int RUN = 90;
   public static final int SAVE = 91;;
   public static final int SCALE = 92;
   public static final int SCRN = 93;;
   public static final int SEMICOLON = 94;
   public static final int SGN = 95;;
   public static final int SHLOAD = 96;
   public static final int SIN = 97;;
   public static final int SPC = 98;
   public static final int SPEED = 99;;
   public static final int SQR = 100;
   public static final int STEP = 101;;
   public static final int STOP = 102;
   public static final int STORE = 103;;
   public static final int STR = 104;
   public static final int STRINGLITERAL = 105;;
   public static final int TAB = 106;
   public static final int TAN = 107;;
   public static final int TEXT = 108;
   public static final int THEN = 109;;
   public static final int TIMES = 110;
   public static final int TO = 111;;
   public static final int TRACE = 112;
   public static final int USR = 113;;
   public static final int VAL = 114;
   public static final int VLIN = 115;;
   public static final int VPLOT = 116;
   public static final int VTAB = 117;;
   public static final int WAIT = 118;
   public static final int WS = 119;;
   public static final int XDRAW = 120;
   protected TreeAdaptor adaptor = new CommonTreeAdaptor();;
   protected DFA5 dfa5 = new DFA5(this);
   static final String DFA5_eotS = "\101\uffff";;
   static final String DFA5_eofS = "\101\uffff";
   static final String DFA5_minS = "\1\5\50\uffff\1\0\27\uffff";;
   static final String DFA5_maxS = "\1\170\50\uffff\1\0\27\uffff";
   static final String DFA5_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1" + "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"
         + "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46" + "\1\47\1\50\1\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"
         + "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76" + "\1\77";;
   static final String DFA5_specialS = "\51\uffff\1\0\27\uffff}>";
   static final String[] DFA5_transitionS = {
         "\1\24\4\uffff\1\65\1\uffff\1\14\1\uffff\1\37\3\uffff\1\74\1" + "\77\1\62\1\uffff\1\76\1\16\3\uffff\1\6\1\uffff\1\57\1\uffff" + "\1\30\1\64\1\63\1\10\2\uffff\1\43\1\22\1\23\1\44\1\35\1\21\1"
               + "\67\1\72\1\54\1\32\1\60\1\uffff\1\7\2\uffff\2\100\1\26\1\1\1" + "\uffff\1\45\5\uffff\1\56\1\11\1\uffff\1\5\1\uffff\1\51\1\34"
               + "\3\uffff\1\50\1\uffff\1\47\1\25\1\uffff\1\46\1\33\1\46\1\66" + "\1\31\1\55\1\3\1\13\2\uffff\1\42\1\uffff\1\15\1\2\1\41\3\uffff"
               + "\1\12\2\uffff\1\40\2\uffff\1\17\1\27\2\uffff\1\61\1\uffff\1" + "\20\3\uffff\1\4\2\uffff\1\36\1\70\1\71\1\73\1\uffff\1\75", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
         "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "\1\uffff", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
         "", "", "", "", "" };;
   static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
   static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);;
   static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
   static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);;
   static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
   static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);;
   static final short[][] DFA5_transition;
   static {
      final int numStates = DFA5_transitionS.length;
      DFA5_transition = new short[numStates][];
      for (int i = 0; i < numStates; i++) {
         DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
      }
   };
   public static final BitSet FOLLOW_line_in_prog972 = new BitSet(new long[] { 0x0000000000000002L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_line984 = new BitSet(new long[] { 0x82F2FFE7A8DC5420L, 0x017914C91D3FDA35L });;
   public static final BitSet FOLLOW_amprstmt_in_line988 = new BitSet(new long[] { 0x0000000000022000L });
   public static final BitSet FOLLOW_COLON_in_line991 = new BitSet(new long[] { 0x82F2FFE7A8DE7420L, 0x017914C91D3FDA35L });;
   public static final BitSet FOLLOW_amprstmt_in_line993 = new BitSet(new long[] { 0x0000000000022000L });
   public static final BitSet FOLLOW_set_in_line998 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_AMPERSAND_in_amperoper1011 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_NUMBER_in_linenumber1017 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_amperoper_in_amprstmt1023 = new BitSet(new long[] { 0x82F2FFE7A8DC5420L, 0x017914C91D3FDA35L });
   public static final BitSet FOLLOW_statement_in_amprstmt1026 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_LOAD_in_statement1034 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SAVE_in_statement1038 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_RESTORE_in_statement1042 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_TRACE_in_statement1046 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_NOTRACE_in_statement1049 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_FLASH_in_statement1053 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_INVERSE_in_statement1057 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_GR_in_statement1060 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_NORMAL_in_statement1063 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SHLOAD_in_statement1067 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_RETURN_in_statement1071 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_CLEAR_in_statement1075 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_RUN_in_statement1079 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_END_in_statement1083 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_STOP_in_statement1088 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_TEXT_in_statement1092 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_HOME_in_statement1096 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_HGR_in_statement1100 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_HGR2_in_statement1104 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_amptstmt_in_statement1107 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_popstmt_in_statement1110 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_liststmt_in_statement1114 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_storestmt_in_statement1117 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_getstmt_in_statement1120 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_recallstmt_in_statement1124 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_instmt_in_statement1127 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_prstmt_in_statement1130 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_onerrstmt_in_statement1133 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_hlinstmt_in_statement1136 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_vlinstmt_in_statement1138 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_colorstmt_in_statement1140 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_speedstmt_in_statement1143 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_scalestmt_in_statement1146 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rotstmt_in_statement1148 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_hcolorstmt_in_statement1151 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_himemstmt_in_statement1154 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_lomemstmt_in_statement1157 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_printstmt1_in_statement1161 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_pokestmt_in_statement1164 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_plotstmt_in_statement1168 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_ongotostmt_in_statement1171 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ongosubstmt_in_statement1174 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_ifstmt_in_statement1177 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_comment_in_statement1181 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_nextstmt_in_statement1184 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_forstmt_in_statement1187 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_inputstmt_in_statement1191 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_tabstmt_in_statement1195 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_dimstmt_in_statement1199 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_gotostmt_in_statement1203 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_gosubstmt_in_statement1207 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_callstmt_in_statement1211 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_readstmt_in_statement1214 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_hplotstmt_in_statement1217 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_vplotstmt_in_statement1221 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_vtabstmnt_in_statement1225 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_htabstmnt_in_statement1228 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_waitstmt_in_statement1230 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_datastmt_in_statement1233 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_xdrawstmt_in_statement1236 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_drawstmt_in_statement1240 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_defstmt_in_statement1243 = new BitSet(new long[] { 0x0000000000000002L });;
   public static final BitSet FOLLOW_letstmt_in_statement1246 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_var_in_vardecl1253 = new BitSet(new long[] { 0x0400000000000002L });;
   public static final BitSet FOLLOW_LPAREN_in_vardecl1257 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_exprlist_in_vardecl1259 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });;
   public static final BitSet FOLLOW_RPAREN_in_vardecl1261 = new BitSet(new long[] { 0x0400000000000002L });
   public static final BitSet FOLLOW_set_in_printstmt11269 = new BitSet(new long[] { 0x652D000052010A92L, 0x00060B16A0C0258AL });;
   public static final BitSet FOLLOW_printlist_in_printstmt11278 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_expression_in_printlist1286 = new BitSet(new long[] { 0x652D000052018A92L, 0x00060B16E0C0258AL });;
   public static final BitSet FOLLOW_COMMA_in_printlist1289 = new BitSet(new long[] { 0x652D000052010A92L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_SEMICOLON_in_printlist1294 = new BitSet(new long[] { 0x652D000052010A92L, 0x00060B16A0C0258AL });;
   public static final BitSet FOLLOW_printlist_in_printlist1299 = new BitSet(new long[] { 0x652D000052010A92L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_GET_in_getstmt1309 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });;
   public static final BitSet FOLLOW_exprlist_in_getstmt1311 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LET_in_letstmt1318 = new BitSet(new long[] { 0x0020000000000000L });;
   public static final BitSet FOLLOW_variableassignment_in_letstmt1322 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_vardecl_in_variableassignment1329 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_variableassignment1331 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_exprlist_in_variableassignment1334 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_lte_in_relop1343 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_gte_in_relop1347 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_neq_in_relop1351 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_EQ_in_relop1355 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_GT_in_relop1359 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LT_in_relop1363 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_GTE_in_gte1371 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_GT_in_gte1376 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_gte1378 = new BitSet(new long[] { 0x0000000000000002L });
   // Delegated rules
   public static final BitSet FOLLOW_EQ_in_gte1384 = new BitSet(new long[] { 0x0000000800000000L });
   public static final BitSet FOLLOW_GT_in_gte1386 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LTE_in_lte1394 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LT_in_lte1399 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_lte1401 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_EQ_in_lte1407 = new BitSet(new long[] { 0x0800000000000000L });
   public static final BitSet FOLLOW_LT_in_lte1409 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LT_in_neq1417 = new BitSet(new long[] { 0x0000000800000000L });
   public static final BitSet FOLLOW_GT_in_neq1419 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_IF_in_ifstmt1426 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_ifstmt1429 = new BitSet(new long[] { 0x82F2FFE7A8DC5420L, 0x017934C91D3FDA35L });
   public static final BitSet FOLLOW_THEN_in_ifstmt1431 = new BitSet(new long[] { 0x82F2FFE7A8DC5420L, 0x017914C91D3FDA35L });
   public static final BitSet FOLLOW_statement_in_ifstmt1434 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_FOR_in_forstmt1441 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_vardecl_in_forstmt1445 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_forstmt1447 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_forstmt1449 = new BitSet(new long[] { 0x0000000000000000L, 0x0000800000000000L });
   public static final BitSet FOLLOW_TO_in_forstmt1451 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_forstmt1453 = new BitSet(new long[] { 0x0000000000000002L, 0x0000002000000000L });
   public static final BitSet FOLLOW_STEP_in_forstmt1456 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_forstmt1458 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_NEXT_in_nextstmt1468 = new BitSet(new long[] { 0x0020000000000002L });
   public static final BitSet FOLLOW_varlist_in_nextstmt1471 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_INPUT_in_inputstmt1479 = new BitSet(new long[] { 0x0020000000000000L, 0x0000020000000000L });
   public static final BitSet FOLLOW_stringliteral_in_inputstmt1483 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_inputstmt1485 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_varlist_in_inputstmt1489 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_READ_in_readstmt1496 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_varlist_in_readstmt1499 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_DIM_in_dimstmt1509 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_varlist_in_dimstmt1512 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_GOTO_in_gotostmt1518 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_gotostmt1521 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_GOSUB_in_gosubstmt1527 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_gosubstmt1530 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_POKE_in_pokestmt1536 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_pokestmt1538 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_pokestmt1540 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_pokestmt1542 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_REM_in_comment1548 = new BitSet(new long[] { 0xFFFFFFFFFFFDFFF2L, 0x1FFFFFFFFFFFFFFFL });
   public static final BitSet FOLLOW_set_in_comment1561 = new BitSet(new long[] { 0xFFFFFFFFFFFDFFF2L, 0x1FFFFFFFFFFFFFFFL });
   public static final BitSet FOLLOW_CALL_in_callstmt1574 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_exprlist_in_callstmt1576 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_HPLOT_in_hplotstmt1582 = new BitSet(new long[] { 0x652D000052010A92L, 0x00068B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hplotstmt1585 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_hplotstmt1587 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hplotstmt1589 = new BitSet(new long[] { 0x0000000000000002L, 0x0000800000000000L });
   public static final BitSet FOLLOW_TO_in_hplotstmt1594 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hplotstmt1596 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_hplotstmt1598 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hplotstmt1600 = new BitSet(new long[] { 0x0000000000000002L, 0x0000800000000000L });
   public static final BitSet FOLLOW_VPLOT_in_vplotstmt1608 = new BitSet(new long[] { 0x652D000052010A92L, 0x00068B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vplotstmt1611 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_vplotstmt1613 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vplotstmt1615 = new BitSet(new long[] { 0x0000000000000002L, 0x0000800000000000L });
   public static final BitSet FOLLOW_TO_in_vplotstmt1620 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vplotstmt1622 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_vplotstmt1624 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vplotstmt1626 = new BitSet(new long[] { 0x0000000000000002L, 0x0000800000000000L });
   public static final BitSet FOLLOW_PLOT_in_plotstmt1634 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_plotstmt1636 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_plotstmt1638 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_plotstmt1640 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ON_in_ongotostmt1647 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_ongotostmt1649 = new BitSet(new long[] { 0x0000000200000000L });
   public static final BitSet FOLLOW_GOTO_in_ongotostmt1651 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_ongotostmt1653 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_COMMA_in_ongotostmt1656 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_ongotostmt1658 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_ON_in_ongosubstmt1667 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_ongosubstmt1669 = new BitSet(new long[] { 0x0000000100000000L });
   public static final BitSet FOLLOW_GOSUB_in_ongosubstmt1671 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_ongosubstmt1673 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_COMMA_in_ongosubstmt1676 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_ongosubstmt1678 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_VTAB_in_vtabstmnt1687 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vtabstmnt1689 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_HTAB_in_htabstmnt1696 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_htabstmnt1698 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_HIMEM_in_himemstmt1704 = new BitSet(new long[] { 0x0000000000002000L });
   public static final BitSet FOLLOW_COLON_in_himemstmt1706 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_himemstmt1708 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LOMEM_in_lomemstmt1714 = new BitSet(new long[] { 0x0000000000002000L });
   public static final BitSet FOLLOW_COLON_in_lomemstmt1716 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_lomemstmt1718 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_DATA_in_datastmt1724 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_datastmt1727 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_COMMA_in_datastmt1730 = new BitSet(new long[] { 0x652D000052018A92L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_datastmt1732 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_WAIT_in_waitstmt1741 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_waitstmt1743 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_waitstmt1745 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_waitstmt1747 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_COMMA_in_waitstmt1750 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_waitstmt1752 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_XDRAW_in_xdrawstmt1760 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_xdrawstmt1762 = new BitSet(new long[] { 0x0000000000000102L });
   public static final BitSet FOLLOW_AT_in_xdrawstmt1765 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_xdrawstmt1767 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_xdrawstmt1769 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_xdrawstmt1771 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_DRAW_in_drawstmt1779 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_drawstmt1781 = new BitSet(new long[] { 0x0000000000000102L });
   public static final BitSet FOLLOW_AT_in_drawstmt1784 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_drawstmt1786 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_drawstmt1788 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_drawstmt1790 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_DEF_in_defstmt1798 = new BitSet(new long[] { 0x0000000010000000L });
   public static final BitSet FOLLOW_FN_in_defstmt1800 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_var_in_defstmt1802 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_defstmt1804 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_var_in_defstmt1806 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_defstmt1808 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_defstmt1810 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_defstmt1812 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_TAB_in_tabstmt1818 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_tabstmt1820 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_tabstmt1822 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_tabstmt1824 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SPEED_in_speedstmt1830 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_speedstmt1832 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_speedstmt1834 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ROT_in_rotstmt1840 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_rotstmt1842 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_rotstmt1844 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SCALE_in_scalestmt1850 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_scalestmt1852 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_scalestmt1854 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_COLOR_in_colorstmt1860 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_colorstmt1862 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_colorstmt1864 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_HCOLOR_in_hcolorstmt1870 = new BitSet(new long[] { 0x0000000001000000L });
   public static final BitSet FOLLOW_EQ_in_hcolorstmt1872 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hcolorstmt1874 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_HLIN_in_hlinstmt1880 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hlinstmt1882 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_hlinstmt1884 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hlinstmt1886 = new BitSet(new long[] { 0x0000000000000100L });
   public static final BitSet FOLLOW_AT_in_hlinstmt1888 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_hlinstmt1890 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_VLIN_in_vlinstmt1896 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vlinstmt1898 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_vlinstmt1900 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vlinstmt1902 = new BitSet(new long[] { 0x0000000000000100L });
   public static final BitSet FOLLOW_AT_in_vlinstmt1904 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_vlinstmt1906 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ONERR_in_onerrstmt1912 = new BitSet(new long[] { 0x0000000200000000L });
   public static final BitSet FOLLOW_GOTO_in_onerrstmt1914 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_linenumber_in_onerrstmt1916 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_PRNUMBER_in_prstmt1922 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_NUMBER_in_prstmt1924 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_INNUMBER_in_instmt1930 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000000000008L });
   public static final BitSet FOLLOW_NUMBER_in_instmt1932 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_STORE_in_storestmt1938 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_vardecl_in_storestmt1940 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RECALL_in_recallstmt1946 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_vardecl_in_recallstmt1948 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LIST_in_liststmt1954 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_liststmt1956 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_POP_in_popstmt1963 = new BitSet(new long[] { 0x652D000052010A92L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_popstmt1966 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_popstmt1968 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_popstmt1970 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_AMPERSAND_in_amptstmt1978 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_amptstmt1980 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_vardecl_in_func1991 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_stringliteral_in_func1995 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_NUMBER_in_func1999 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_chrfunc_in_func2004 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_sqrfunc_in_func2008 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_lenfunc_in_func2012 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_strfunc_in_func2016 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ascfunc_in_func2020 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_scrnfunc_in_func2023 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_midfunc_in_func2028 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_pdlfunc_in_func2032 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_peekfunc_in_func2036 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_intfunc_in_func2040 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_spcfunc_in_func2044 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_frefunc_in_func2048 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_posfunc_in_func2052 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_usrfunc_in_func2056 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_leftfunc_in_func2059 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_valfunc_in_func2063 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rightfunc_in_func2067 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_fnfunc_in_func2069 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_sinfunc_in_func2071 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_cosfunc_in_func2075 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_tanfunc_in_func2078 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_atnfunc_in_func2080 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_rndfunc_in_func2082 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_sgnfunc_in_func2084 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_expfunc_in_func2086 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_logfunc_in_func2088 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_absfunc_in_func2090 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LPAREN_in_func2095 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_func2097 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_func2099 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_NOT_in_signExpression2107 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C02588L });
   public static final BitSet FOLLOW_func_in_signExpression2119 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_signExpression_in_exponentExpression2126 = new BitSet(new long[] { 0x0000000004000002L });
   public static final BitSet FOLLOW_EXPONENT_in_exponentExpression2129 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_signExpression_in_exponentExpression2131 = new BitSet(new long[] { 0x0000000004000002L });
   public static final BitSet FOLLOW_exponentExpression_in_multiplyingExpression2141 = new BitSet(new long[] { 0x0000000000200002L, 0x0000400000000000L });
   public static final BitSet FOLLOW_set_in_multiplyingExpression2144 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_exponentExpression_in_multiplyingExpression2151 = new BitSet(new long[] { 0x0000000000200002L, 0x0000400000000000L });
   public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression2160 = new BitSet(new long[] { 0x4000000000000002L, 0x0000000000000400L });
   public static final BitSet FOLLOW_set_in_addingExpression2163 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression2170 = new BitSet(new long[] { 0x4000000000000002L, 0x0000000000000400L });
   public static final BitSet FOLLOW_addingExpression_in_relationalExpression2180 = new BitSet(new long[] { 0x1800001801000002L });
   public static final BitSet FOLLOW_relop_in_relationalExpression2184 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_addingExpression_in_relationalExpression2188 = new BitSet(new long[] { 0x1800001801000002L });
   public static final BitSet FOLLOW_relationalExpression_in_expression2196 = new BitSet(new long[] { 0x0000000000000042L, 0x0000000000000040L });
   public static final BitSet FOLLOW_set_in_expression2199 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_relationalExpression_in_expression2205 = new BitSet(new long[] { 0x0000000000000042L, 0x0000000000000040L });
   public static final BitSet FOLLOW_varname_in_var2216 = new BitSet(new long[] { 0x0000000000000002L, 0x0600000000000000L });
   public static final BitSet FOLLOW_varsuffix_in_var2219 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LETTERS_in_varname2227 = new BitSet(new long[] { 0x0020000000000002L });
   public static final BitSet FOLLOW_vardecl_in_varlist2257 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_COMMA_in_varlist2260 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_vardecl_in_varlist2263 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_expression_in_exprlist2273 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_COMMA_in_exprlist2276 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_exprlist2279 = new BitSet(new long[] { 0x0000000000008002L });
   public static final BitSet FOLLOW_STRINGLITERAL_in_stringliteral2292 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SQR_in_sqrfunc2302 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_sqrfunc2305 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_sqrfunc2307 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_sqrfunc2309 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_CHR_in_chrfunc2316 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_chrfunc2319 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_chrfunc2321 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_chrfunc2323 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LEN_in_lenfunc2330 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_lenfunc2333 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_lenfunc2335 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_lenfunc2337 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ASC_in_ascfunc2344 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_ascfunc2347 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_ascfunc2349 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_ascfunc2351 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_MID_in_midfunc2359 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_midfunc2362 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_midfunc2364 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_midfunc2366 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_midfunc2368 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_midfunc2370 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_midfunc2372 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_midfunc2374 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_PDL_in_pdlfunc2381 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_pdlfunc2384 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_pdlfunc2386 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_pdlfunc2388 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_PEEK_in_peekfunc2394 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_peekfunc2397 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_peekfunc2399 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_peekfunc2401 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_INTF_in_intfunc2408 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_intfunc2411 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_intfunc2413 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_intfunc2415 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SPC_in_spcfunc2422 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_spcfunc2425 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_spcfunc2427 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_spcfunc2429 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_FRE_in_frefunc2436 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_frefunc2439 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_frefunc2441 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_frefunc2443 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_POS_in_posfunc2450 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_posfunc2453 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_posfunc2455 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_posfunc2457 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_USR_in_usrfunc2464 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_usrfunc2467 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_usrfunc2469 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_usrfunc2471 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LEFT_in_leftfunc2477 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_leftfunc2480 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_leftfunc2482 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_leftfunc2484 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_leftfunc2486 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_leftfunc2488 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RIGHT_in_rightfunc2494 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_rightfunc2497 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_rightfunc2499 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_rightfunc2501 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_rightfunc2503 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_rightfunc2505 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_STR_in_strfunc2512 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_strfunc2515 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_strfunc2517 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_strfunc2519 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_FN_in_fnfunc2526 = new BitSet(new long[] { 0x0020000000000000L });
   public static final BitSet FOLLOW_var_in_fnfunc2529 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_fnfunc2531 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_fnfunc2533 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_fnfunc2535 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_VAL_in_valfunc2541 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_valfunc2544 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_valfunc2546 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_valfunc2548 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SCRN_in_scrnfunc2554 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_scrnfunc2557 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_scrnfunc2559 = new BitSet(new long[] { 0x0000000000008000L });
   public static final BitSet FOLLOW_COMMA_in_scrnfunc2561 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_scrnfunc2563 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_scrnfunc2565 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SIN_in_sinfunc2572 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_sinfunc2575 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_sinfunc2577 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_sinfunc2579 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_COS_in_cosfunc2586 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_cosfunc2589 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_cosfunc2591 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_cosfunc2593 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_TAN_in_tanfunc2600 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_tanfunc2603 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_tanfunc2605 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_tanfunc2607 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ATN_in_atnfunc2614 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_atnfunc2617 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_atnfunc2619 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_atnfunc2621 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_RND_in_rndfunc2628 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_rndfunc2631 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_rndfunc2633 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_rndfunc2635 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_SGN_in_sgnfunc2642 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_sgnfunc2645 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_sgnfunc2647 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_sgnfunc2649 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_EXP_in_expfunc2656 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_expfunc2659 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_expfunc2661 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_expfunc2663 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LOG_in_logfunc2670 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_logfunc2673 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_logfunc2675 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_logfunc2677 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ABS_in_absfunc2684 = new BitSet(new long[] { 0x0400000000000000L });
   public static final BitSet FOLLOW_LPAREN_in_absfunc2687 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_expression_in_absfunc2689 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_absfunc2691 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_amperoper_in_synpred5_jvmBasic1023 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ongotostmt_in_synpred46_jvmBasic1171 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_ongosubstmt_in_synpred47_jvmBasic1174 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_LPAREN_in_synpred68_jvmBasic1257 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_exprlist_in_synpred68_jvmBasic1259 = new BitSet(new long[] { 0x0000000000000000L, 0x0000000002000000L });
   public static final BitSet FOLLOW_RPAREN_in_synpred68_jvmBasic1261 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_printlist_in_synpred73_jvmBasic1299 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_lte_in_synpred75_jvmBasic1343 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_gte_in_synpred76_jvmBasic1347 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_neq_in_synpred77_jvmBasic1351 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_EQ_in_synpred78_jvmBasic1355 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_GT_in_synpred79_jvmBasic1359 = new BitSet(new long[] { 0x0000000000000002L });
   public static final BitSet FOLLOW_set_in_synpred138_jvmBasic2163 = new BitSet(new long[] { 0x652D000052010A90L, 0x00060B16A0C0258AL });
   public static final BitSet FOLLOW_multiplyingExpression_in_synpred138_jvmBasic2170 = new BitSet(new long[] { 0x0000000000000002L });

   public jvmBasicParser(TokenStream input) {
      this(input, new RecognizerSharedState());
   }

   public jvmBasicParser(TokenStream input, RecognizerSharedState state) {
      super(input, state);
   }

   // $ANTLR start "absfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:1: absfunc : ABS ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.absfunc_return absfunc() throws RecognitionException {
      final jvmBasicParser.absfunc_return retval = new jvmBasicParser.absfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token ABS443 = null;
      Token LPAREN444 = null;
      Token RPAREN446 = null;
      jvmBasicParser.expression_return expression445 = null;
      CommonTree ABS443_tree = null;
      CommonTree LPAREN444_tree = null;
      CommonTree RPAREN446_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:9: ( ABS ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:11: ABS ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            ABS443 = (Token) match(input, ABS, FOLLOW_ABS_in_absfunc2684);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               ABS443_tree = (CommonTree) adaptor.create(ABS443);
               root_0 = (CommonTree) adaptor.becomeRoot(ABS443_tree, root_0);
            }
            LPAREN444 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_absfunc2687);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN444_tree = (CommonTree) adaptor.create(LPAREN444);
               adaptor.addChild(root_0, LPAREN444_tree);
            }
            pushFollow(FOLLOW_expression_in_absfunc2689);
            expression445 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression445.getTree());
            }
            RPAREN446 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_absfunc2691);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN446_tree = (CommonTree) adaptor.create(RPAREN446);
               adaptor.addChild(root_0, RPAREN446_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "absfunc"
   // $ANTLR start "addingExpression"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:1: addingExpression : multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )* ;
   public final jvmBasicParser.addingExpression_return addingExpression() throws RecognitionException {
      final jvmBasicParser.addingExpression_return retval = new jvmBasicParser.addingExpression_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token set308 = null;
      jvmBasicParser.multiplyingExpression_return multiplyingExpression307 = null;
      jvmBasicParser.multiplyingExpression_return multiplyingExpression309 = null;
      final CommonTree set308_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:18: ( multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:20: multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_multiplyingExpression_in_addingExpression2160);
            multiplyingExpression307 = multiplyingExpression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, multiplyingExpression307.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:42: ( ( PLUS | MINUS ) ^ multiplyingExpression )*
            loop36: do {
               int alt36 = 2;
               switch (input.LA(1)) {
                  case MINUS:
                  case PLUS: {
                     final int LA36_1 = input.LA(2);
                     if ((synpred138_jvmBasic())) {
                        alt36 = 1;
                     }
                  }
                     break;
               }
               switch (alt36) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:43: ( PLUS | MINUS ) ^ multiplyingExpression
                  {
                     set308 = (Token) input.LT(1);
                     set308 = (Token) input.LT(1);
                     if ((input.LA(1) == MINUS) || (input.LA(1) == PLUS)) {
                        input.consume();
                        if (state.backtracking == 0) {
                           root_0 = (CommonTree) adaptor.becomeRoot((CommonTree) adaptor.create(set308), root_0);
                        }
                        state.errorRecovery = false;
                        state.failed = false;
                     } else {
                        if (state.backtracking > 0) {
                           state.failed = true;
                           return retval;
                        }
                        final MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                     }
                     pushFollow(FOLLOW_multiplyingExpression_in_addingExpression2170);
                     multiplyingExpression309 = multiplyingExpression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, multiplyingExpression309.getTree());
                     }
                  }
                     break;
                  default:
                     break loop36;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "addingExpression"
   // $ANTLR start "amperoper"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:139:1: amperoper : AMPERSAND ;
   public final jvmBasicParser.amperoper_return amperoper() throws RecognitionException {
      final jvmBasicParser.amperoper_return retval = new jvmBasicParser.amperoper_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token AMPERSAND7 = null;
      CommonTree AMPERSAND7_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:139:10: ( AMPERSAND )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:139:12: AMPERSAND
         {
            root_0 = (CommonTree) adaptor.nil();
            AMPERSAND7 = (Token) match(input, AMPERSAND, FOLLOW_AMPERSAND_in_amperoper1011);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               AMPERSAND7_tree = (CommonTree) adaptor.create(AMPERSAND7);
               adaptor.addChild(root_0, AMPERSAND7_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "amperoper"
   // $ANTLR start "amprstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:141:1: amprstmt : ( amperoper )? statement ^;
   public final jvmBasicParser.amprstmt_return amprstmt() throws RecognitionException {
      final jvmBasicParser.amprstmt_return retval = new jvmBasicParser.amprstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      jvmBasicParser.amperoper_return amperoper9 = null;
      jvmBasicParser.statement_return statement10 = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:141:9: ( ( amperoper )? statement ^)
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:141:11: ( amperoper )? statement ^
         {
            root_0 = (CommonTree) adaptor.nil();
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:141:11: ( amperoper )?
            int alt4 = 2;
            switch (input.LA(1)) {
               case AMPERSAND: {
                  final int LA4_1 = input.LA(2);
                  if ((synpred5_jvmBasic())) {
                     alt4 = 1;
                  }
               }
                  break;
            }
            switch (alt4) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:141:11: amperoper
               {
                  pushFollow(FOLLOW_amperoper_in_amprstmt1023);
                  amperoper9 = amperoper();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, amperoper9.getTree());
                  }
               }
                  break;
            }
            pushFollow(FOLLOW_statement_in_amprstmt1026);
            statement10 = statement();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               root_0 = (CommonTree) adaptor.becomeRoot(statement10.getTree(), root_0);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "amprstmt"
   // $ANTLR start "amptstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:1: amptstmt : AMPERSAND expression ;
   public final jvmBasicParser.amptstmt_return amptstmt() throws RecognitionException {
      final jvmBasicParser.amptstmt_return retval = new jvmBasicParser.amptstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token AMPERSAND263 = null;
      jvmBasicParser.expression_return expression264 = null;
      CommonTree AMPERSAND263_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:9: ( AMPERSAND expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:11: AMPERSAND expression
         {
            root_0 = (CommonTree) adaptor.nil();
            AMPERSAND263 = (Token) match(input, AMPERSAND, FOLLOW_AMPERSAND_in_amptstmt1978);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               AMPERSAND263_tree = (CommonTree) adaptor.create(AMPERSAND263);
               adaptor.addChild(root_0, AMPERSAND263_tree);
            }
            pushFollow(FOLLOW_expression_in_amptstmt1980);
            expression264 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression264.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "amptstmt"
   // $ANTLR start "ascfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:1: ascfunc : ASC ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.ascfunc_return ascfunc() throws RecognitionException {
      final jvmBasicParser.ascfunc_return retval = new jvmBasicParser.ascfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token ASC340 = null;
      Token LPAREN341 = null;
      Token RPAREN343 = null;
      jvmBasicParser.expression_return expression342 = null;
      CommonTree ASC340_tree = null;
      CommonTree LPAREN341_tree = null;
      CommonTree RPAREN343_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:9: ( ASC ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:11: ASC ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            ASC340 = (Token) match(input, ASC, FOLLOW_ASC_in_ascfunc2344);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               ASC340_tree = (CommonTree) adaptor.create(ASC340);
               root_0 = (CommonTree) adaptor.becomeRoot(ASC340_tree, root_0);
            }
            LPAREN341 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_ascfunc2347);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN341_tree = (CommonTree) adaptor.create(LPAREN341);
               adaptor.addChild(root_0, LPAREN341_tree);
            }
            pushFollow(FOLLOW_expression_in_ascfunc2349);
            expression342 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression342.getTree());
            }
            RPAREN343 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_ascfunc2351);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN343_tree = (CommonTree) adaptor.create(RPAREN343);
               adaptor.addChild(root_0, RPAREN343_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "ascfunc"
   // $ANTLR start "atnfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:237:1: atnfunc : ATN ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.atnfunc_return atnfunc() throws RecognitionException {
      final jvmBasicParser.atnfunc_return retval = new jvmBasicParser.atnfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token ATN423 = null;
      Token LPAREN424 = null;
      Token RPAREN426 = null;
      jvmBasicParser.expression_return expression425 = null;
      CommonTree ATN423_tree = null;
      CommonTree LPAREN424_tree = null;
      CommonTree RPAREN426_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:237:9: ( ATN ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:237:11: ATN ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            ATN423 = (Token) match(input, ATN, FOLLOW_ATN_in_atnfunc2614);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               ATN423_tree = (CommonTree) adaptor.create(ATN423);
               root_0 = (CommonTree) adaptor.becomeRoot(ATN423_tree, root_0);
            }
            LPAREN424 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_atnfunc2617);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN424_tree = (CommonTree) adaptor.create(LPAREN424);
               adaptor.addChild(root_0, LPAREN424_tree);
            }
            pushFollow(FOLLOW_expression_in_atnfunc2619);
            expression425 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression425.getTree());
            }
            RPAREN426 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_atnfunc2621);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN426_tree = (CommonTree) adaptor.create(RPAREN426);
               adaptor.addChild(root_0, RPAREN426_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "atnfunc"
   // $ANTLR start "callstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:1: callstmt : CALL exprlist ;
   public final jvmBasicParser.callstmt_return callstmt() throws RecognitionException {
      final jvmBasicParser.callstmt_return retval = new jvmBasicParser.callstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token CALL141 = null;
      jvmBasicParser.exprlist_return exprlist142 = null;
      CommonTree CALL141_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:9: ( CALL exprlist )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:11: CALL exprlist
         {
            root_0 = (CommonTree) adaptor.nil();
            CALL141 = (Token) match(input, CALL, FOLLOW_CALL_in_callstmt1574);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               CALL141_tree = (CommonTree) adaptor.create(CALL141);
               adaptor.addChild(root_0, CALL141_tree);
            }
            pushFollow(FOLLOW_exprlist_in_callstmt1576);
            exprlist142 = exprlist();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, exprlist142.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "callstmt"
   // $ANTLR start "chrfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:1: chrfunc : CHR ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.chrfunc_return chrfunc() throws RecognitionException {
      final jvmBasicParser.chrfunc_return retval = new jvmBasicParser.chrfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token CHR332 = null;
      Token LPAREN333 = null;
      Token RPAREN335 = null;
      jvmBasicParser.expression_return expression334 = null;
      CommonTree CHR332_tree = null;
      CommonTree LPAREN333_tree = null;
      CommonTree RPAREN335_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:9: ( CHR ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:11: CHR ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            CHR332 = (Token) match(input, CHR, FOLLOW_CHR_in_chrfunc2316);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               CHR332_tree = (CommonTree) adaptor.create(CHR332);
               root_0 = (CommonTree) adaptor.becomeRoot(CHR332_tree, root_0);
            }
            LPAREN333 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_chrfunc2319);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN333_tree = (CommonTree) adaptor.create(LPAREN333);
               adaptor.addChild(root_0, LPAREN333_tree);
            }
            pushFollow(FOLLOW_expression_in_chrfunc2321);
            expression334 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression334.getTree());
            }
            RPAREN335 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_chrfunc2323);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN335_tree = (CommonTree) adaptor.create(RPAREN335);
               adaptor.addChild(root_0, RPAREN335_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "chrfunc"
   // $ANTLR start "colorstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:1: colorstmt : COLOR EQ expression ;
   public final jvmBasicParser.colorstmt_return colorstmt() throws RecognitionException {
      final jvmBasicParser.colorstmt_return retval = new jvmBasicParser.colorstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token COLOR228 = null;
      Token EQ229 = null;
      jvmBasicParser.expression_return expression230 = null;
      CommonTree COLOR228_tree = null;
      CommonTree EQ229_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:10: ( COLOR EQ expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:12: COLOR EQ expression
         {
            root_0 = (CommonTree) adaptor.nil();
            COLOR228 = (Token) match(input, COLOR, FOLLOW_COLOR_in_colorstmt1860);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COLOR228_tree = (CommonTree) adaptor.create(COLOR228);
               adaptor.addChild(root_0, COLOR228_tree);
            }
            EQ229 = (Token) match(input, EQ, FOLLOW_EQ_in_colorstmt1862);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ229_tree = (CommonTree) adaptor.create(EQ229);
               adaptor.addChild(root_0, EQ229_tree);
            }
            pushFollow(FOLLOW_expression_in_colorstmt1864);
            expression230 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression230.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "colorstmt"
   // $ANTLR start "comment"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:1: comment : REM ^ ( options {greedy=false; } : (~ ( CR ) ) )* ;
   public final jvmBasicParser.comment_return comment() throws RecognitionException {
      final jvmBasicParser.comment_return retval = new jvmBasicParser.comment_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token REM139 = null;
      Token set140 = null;
      CommonTree REM139_tree = null;
      final CommonTree set140_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:8: ( REM ^ ( options {greedy=false; } : (~ ( CR ) ) )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:10: REM ^ ( options {greedy=false; } : (~ ( CR ) ) )*
         {
            root_0 = (CommonTree) adaptor.nil();
            REM139 = (Token) match(input, REM, FOLLOW_REM_in_comment1548);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               REM139_tree = (CommonTree) adaptor.create(REM139);
               root_0 = (CommonTree) adaptor.becomeRoot(REM139_tree, root_0);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:15: ( options {greedy=false; } : (~ ( CR ) ) )*
            loop18: do {
               int alt18 = 2;
               switch (input.LA(1)) {
                  case COLON: {
                     final int LA18_1 = input.LA(2);
                     if ((synpred88_jvmBasic())) {
                        alt18 = 1;
                     } else if ((true)) {
                        alt18 = 2;
                     }
                  }
                     break;
                  case ABS:
                  case AMPERSAND:
                  case AND:
                  case ASC:
                  case AT:
                  case ATN:
                  case CALL:
                  case CHR:
                  case CLEAR:
                  case COLOR:
                  case COMMA:
                  case COS:
                  case DATA:
                  case DEF:
                  case DIM:
                  case DIV:
                  case DRAW:
                  case END:
                  case EQ:
                  case EXP:
                  case EXPONENT:
                  case FLASH:
                  case FN:
                  case FOR:
                  case FRE:
                  case GET:
                  case GOSUB:
                  case GOTO:
                  case GR:
                  case GT:
                  case GTE:
                  case HCOLOR:
                  case HGR:
                  case HGR2:
                  case HIMEM:
                  case HLIN:
                  case HOME:
                  case HPLOT:
                  case HTAB:
                  case IF:
                  case INNUMBER:
                  case INPUT:
                  case INTF:
                  case INVERSE:
                  case LEFT:
                  case LEN:
                  case LET:
                  case LETTERS:
                  case LIST:
                  case LOAD:
                  case LOG:
                  case LOMEM:
                  case LPAREN:
                  case LT:
                  case LTE:
                  case MID:
                  case MINUS:
                  case NEXT:
                  case NORMAL:
                  case NOT:
                  case NOTRACE:
                  case NUMBER:
                  case ON:
                  case ONERR:
                  case OR:
                  case PDL:
                  case PEEK:
                  case PLOT:
                  case PLUS:
                  case POKE:
                  case POP:
                  case POS:
                  case PRINT:
                  case PRNUMBER:
                  case QUESTION:
                  case READ:
                  case RECALL:
                  case REM:
                  case RESTORE:
                  case RETURN:
                  case RIGHT:
                  case RND:
                  case ROT:
                  case RPAREN:
                  case RUN:
                  case SAVE:
                  case SCALE:
                  case SCRN:
                  case SEMICOLON:
                  case SGN:
                  case SHLOAD:
                  case SIN:
                  case SPC:
                  case SPEED:
                  case SQR:
                  case STEP:
                  case STOP:
                  case STORE:
                  case STR:
                  case STRINGLITERAL:
                  case TAB:
                  case TAN:
                  case TEXT:
                  case THEN:
                  case TIMES:
                  case TO:
                  case TRACE:
                  case USR:
                  case VAL:
                  case VLIN:
                  case VPLOT:
                  case VTAB:
                  case WAIT:
                  case WS:
                  case XDRAW:
                  case 121:
                  case 122:
                  case 123:
                  case 124: {
                     alt18 = 1;
                  }
                     break;
                  case CR: {
                     alt18 = 2;
                  }
                     break;
               }
               switch (alt18) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:42: (~ ( CR ) )
                  {
                     set140 = (Token) input.LT(1);
                     if (((input.LA(1) >= ABS) && (input.LA(1) <= COS)) || ((input.LA(1) >= DATA) && (input.LA(1) <= 124))) {
                        input.consume();
                        if (state.backtracking == 0) {
                           adaptor.addChild(root_0, (CommonTree) adaptor.create(set140));
                        }
                        state.errorRecovery = false;
                        state.failed = false;
                     } else {
                        if (state.backtracking > 0) {
                           state.failed = true;
                           return retval;
                        }
                        final MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                     }
                  }
                     break;
                  default:
                     break loop18;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "comment"
   // $ANTLR start "cosfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:235:1: cosfunc : COS ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.cosfunc_return cosfunc() throws RecognitionException {
      final jvmBasicParser.cosfunc_return retval = new jvmBasicParser.cosfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token COS415 = null;
      Token LPAREN416 = null;
      Token RPAREN418 = null;
      jvmBasicParser.expression_return expression417 = null;
      CommonTree COS415_tree = null;
      CommonTree LPAREN416_tree = null;
      CommonTree RPAREN418_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:235:9: ( COS ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:235:11: COS ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            COS415 = (Token) match(input, COS, FOLLOW_COS_in_cosfunc2586);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COS415_tree = (CommonTree) adaptor.create(COS415);
               root_0 = (CommonTree) adaptor.becomeRoot(COS415_tree, root_0);
            }
            LPAREN416 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_cosfunc2589);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN416_tree = (CommonTree) adaptor.create(LPAREN416);
               adaptor.addChild(root_0, LPAREN416_tree);
            }
            pushFollow(FOLLOW_expression_in_cosfunc2591);
            expression417 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression417.getTree());
            }
            RPAREN418 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_cosfunc2593);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN418_tree = (CommonTree) adaptor.create(RPAREN418);
               adaptor.addChild(root_0, RPAREN418_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "cosfunc"
   // $ANTLR start "datastmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:1: datastmt : DATA ^ expression ( COMMA ( expression )? )* ;
   public final jvmBasicParser.datastmt_return datastmt() throws RecognitionException {
      final jvmBasicParser.datastmt_return retval = new jvmBasicParser.datastmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token DATA185 = null;
      Token COMMA187 = null;
      jvmBasicParser.expression_return expression186 = null;
      jvmBasicParser.expression_return expression188 = null;
      CommonTree DATA185_tree = null;
      CommonTree COMMA187_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:9: ( DATA ^ expression ( COMMA ( expression )? )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:11: DATA ^ expression ( COMMA ( expression )? )*
         {
            root_0 = (CommonTree) adaptor.nil();
            DATA185 = (Token) match(input, DATA, FOLLOW_DATA_in_datastmt1724);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               DATA185_tree = (CommonTree) adaptor.create(DATA185);
               root_0 = (CommonTree) adaptor.becomeRoot(DATA185_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_datastmt1727);
            expression186 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression186.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:28: ( COMMA ( expression )? )*
            loop26: do {
               int alt26 = 2;
               switch (input.LA(1)) {
                  case COMMA: {
                     alt26 = 1;
                  }
                     break;
               }
               switch (alt26) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:29: COMMA ( expression )?
                  {
                     COMMA187 = (Token) match(input, COMMA, FOLLOW_COMMA_in_datastmt1730);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        COMMA187_tree = (CommonTree) adaptor.create(COMMA187);
                        adaptor.addChild(root_0, COMMA187_tree);
                     }
                     // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:35: ( expression )?
                     int alt25 = 2;
                     switch (input.LA(1)) {
                        case ABS:
                        case ASC:
                        case ATN:
                        case CHR:
                        case COS:
                        case EXP:
                        case FN:
                        case FRE:
                        case INTF:
                        case LEFT:
                        case LEN:
                        case LETTERS:
                        case LOG:
                        case LPAREN:
                        case MID:
                        case MINUS:
                        case NOT:
                        case NUMBER:
                        case PDL:
                        case PEEK:
                        case PLUS:
                        case POS:
                        case RIGHT:
                        case RND:
                        case SCRN:
                        case SGN:
                        case SIN:
                        case SPC:
                        case SQR:
                        case STR:
                        case STRINGLITERAL:
                        case TAN:
                        case USR:
                        case VAL: {
                           alt25 = 1;
                        }
                           break;
                     }
                     switch (alt25) {
                        case 1:
                        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:35: expression
                        {
                           pushFollow(FOLLOW_expression_in_datastmt1732);
                           expression188 = expression();
                           state._fsp--;
                           if (state.failed) {
                              return retval;
                           }
                           if (state.backtracking == 0) {
                              adaptor.addChild(root_0, expression188.getTree());
                           }
                        }
                           break;
                     }
                  }
                     break;
                  default:
                     break loop26;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "datastmt"
   // $ANTLR start "defstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:1: defstmt : DEF FN var LPAREN var RPAREN EQ expression ;
   public final jvmBasicParser.defstmt_return defstmt() throws RecognitionException {
      final jvmBasicParser.defstmt_return retval = new jvmBasicParser.defstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token DEF207 = null;
      Token FN208 = null;
      Token LPAREN210 = null;
      Token RPAREN212 = null;
      Token EQ213 = null;
      jvmBasicParser.var_return var209 = null;
      jvmBasicParser.var_return var211 = null;
      jvmBasicParser.expression_return expression214 = null;
      CommonTree DEF207_tree = null;
      CommonTree FN208_tree = null;
      CommonTree LPAREN210_tree = null;
      CommonTree RPAREN212_tree = null;
      CommonTree EQ213_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:8: ( DEF FN var LPAREN var RPAREN EQ expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:10: DEF FN var LPAREN var RPAREN EQ expression
         {
            root_0 = (CommonTree) adaptor.nil();
            DEF207 = (Token) match(input, DEF, FOLLOW_DEF_in_defstmt1798);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               DEF207_tree = (CommonTree) adaptor.create(DEF207);
               adaptor.addChild(root_0, DEF207_tree);
            }
            FN208 = (Token) match(input, FN, FOLLOW_FN_in_defstmt1800);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               FN208_tree = (CommonTree) adaptor.create(FN208);
               adaptor.addChild(root_0, FN208_tree);
            }
            pushFollow(FOLLOW_var_in_defstmt1802);
            var209 = var();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, var209.getTree());
            }
            LPAREN210 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_defstmt1804);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN210_tree = (CommonTree) adaptor.create(LPAREN210);
               adaptor.addChild(root_0, LPAREN210_tree);
            }
            pushFollow(FOLLOW_var_in_defstmt1806);
            var211 = var();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, var211.getTree());
            }
            RPAREN212 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_defstmt1808);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN212_tree = (CommonTree) adaptor.create(RPAREN212);
               adaptor.addChild(root_0, RPAREN212_tree);
            }
            EQ213 = (Token) match(input, EQ, FOLLOW_EQ_in_defstmt1810);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ213_tree = (CommonTree) adaptor.create(EQ213);
               adaptor.addChild(root_0, EQ213_tree);
            }
            pushFollow(FOLLOW_expression_in_defstmt1812);
            expression214 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression214.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "defstmt"
   // $ANTLR start "dimstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:1: dimstmt : DIM ^ varlist ;
   public final jvmBasicParser.dimstmt_return dimstmt() throws RecognitionException {
      final jvmBasicParser.dimstmt_return retval = new jvmBasicParser.dimstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token DIM129 = null;
      jvmBasicParser.varlist_return varlist130 = null;
      CommonTree DIM129_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:9: ( DIM ^ varlist )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:11: DIM ^ varlist
         {
            root_0 = (CommonTree) adaptor.nil();
            DIM129 = (Token) match(input, DIM, FOLLOW_DIM_in_dimstmt1509);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               DIM129_tree = (CommonTree) adaptor.create(DIM129);
               root_0 = (CommonTree) adaptor.becomeRoot(DIM129_tree, root_0);
            }
            pushFollow(FOLLOW_varlist_in_dimstmt1512);
            varlist130 = varlist();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, varlist130.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "dimstmt"
   // $ANTLR start "drawstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:1: drawstmt : DRAW expression ( AT expression COMMA expression )? ;
   public final jvmBasicParser.drawstmt_return drawstmt() throws RecognitionException {
      final jvmBasicParser.drawstmt_return retval = new jvmBasicParser.drawstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token DRAW201 = null;
      Token AT203 = null;
      Token COMMA205 = null;
      jvmBasicParser.expression_return expression202 = null;
      jvmBasicParser.expression_return expression204 = null;
      jvmBasicParser.expression_return expression206 = null;
      CommonTree DRAW201_tree = null;
      CommonTree AT203_tree = null;
      CommonTree COMMA205_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:9: ( DRAW expression ( AT expression COMMA expression )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:11: DRAW expression ( AT expression COMMA expression )?
         {
            root_0 = (CommonTree) adaptor.nil();
            DRAW201 = (Token) match(input, DRAW, FOLLOW_DRAW_in_drawstmt1779);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               DRAW201_tree = (CommonTree) adaptor.create(DRAW201);
               adaptor.addChild(root_0, DRAW201_tree);
            }
            pushFollow(FOLLOW_expression_in_drawstmt1781);
            expression202 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression202.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:27: ( AT expression COMMA expression )?
            int alt29 = 2;
            switch (input.LA(1)) {
               case AT: {
                  alt29 = 1;
               }
                  break;
            }
            switch (alt29) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:28: AT expression COMMA expression
               {
                  AT203 = (Token) match(input, AT, FOLLOW_AT_in_drawstmt1784);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     AT203_tree = (CommonTree) adaptor.create(AT203);
                     adaptor.addChild(root_0, AT203_tree);
                  }
                  pushFollow(FOLLOW_expression_in_drawstmt1786);
                  expression204 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression204.getTree());
                  }
                  COMMA205 = (Token) match(input, COMMA, FOLLOW_COMMA_in_drawstmt1788);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA205_tree = (CommonTree) adaptor.create(COMMA205);
                     adaptor.addChild(root_0, COMMA205_tree);
                  }
                  pushFollow(FOLLOW_expression_in_drawstmt1790);
                  expression206 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression206.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "drawstmt"
   // $ANTLR start "expfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:1: expfunc : EXP ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.expfunc_return expfunc() throws RecognitionException {
      final jvmBasicParser.expfunc_return retval = new jvmBasicParser.expfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token EXP435 = null;
      Token LPAREN436 = null;
      Token RPAREN438 = null;
      jvmBasicParser.expression_return expression437 = null;
      CommonTree EXP435_tree = null;
      CommonTree LPAREN436_tree = null;
      CommonTree RPAREN438_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:9: ( EXP ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:11: EXP ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            EXP435 = (Token) match(input, EXP, FOLLOW_EXP_in_expfunc2656);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EXP435_tree = (CommonTree) adaptor.create(EXP435);
               root_0 = (CommonTree) adaptor.becomeRoot(EXP435_tree, root_0);
            }
            LPAREN436 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_expfunc2659);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN436_tree = (CommonTree) adaptor.create(LPAREN436);
               adaptor.addChild(root_0, LPAREN436_tree);
            }
            pushFollow(FOLLOW_expression_in_expfunc2661);
            expression437 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression437.getTree());
            }
            RPAREN438 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_expfunc2663);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN438_tree = (CommonTree) adaptor.create(RPAREN438);
               adaptor.addChild(root_0, RPAREN438_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "expfunc"
   // $ANTLR start "exponentExpression"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:1: exponentExpression : signExpression ( EXPONENT signExpression )* ;
   public final jvmBasicParser.exponentExpression_return exponentExpression() throws RecognitionException {
      final jvmBasicParser.exponentExpression_return retval = new jvmBasicParser.exponentExpression_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token EXPONENT302 = null;
      jvmBasicParser.signExpression_return signExpression301 = null;
      jvmBasicParser.signExpression_return signExpression303 = null;
      CommonTree EXPONENT302_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:20: ( signExpression ( EXPONENT signExpression )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:22: signExpression ( EXPONENT signExpression )*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_signExpression_in_exponentExpression2126);
            signExpression301 = signExpression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, signExpression301.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:37: ( EXPONENT signExpression )*
            loop34: do {
               int alt34 = 2;
               switch (input.LA(1)) {
                  case EXPONENT: {
                     alt34 = 1;
                  }
                     break;
               }
               switch (alt34) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:38: EXPONENT signExpression
                  {
                     EXPONENT302 = (Token) match(input, EXPONENT, FOLLOW_EXPONENT_in_exponentExpression2129);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        EXPONENT302_tree = (CommonTree) adaptor.create(EXPONENT302);
                        adaptor.addChild(root_0, EXPONENT302_tree);
                     }
                     pushFollow(FOLLOW_signExpression_in_exponentExpression2131);
                     signExpression303 = signExpression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, signExpression303.getTree());
                     }
                  }
                     break;
                  default:
                     break loop34;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "exponentExpression"
   // $ANTLR start "expression"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:1: expression : relationalExpression ( ( AND | OR ) relationalExpression ^)* ;
   public final jvmBasicParser.expression_return expression() throws RecognitionException {
      final jvmBasicParser.expression_return retval = new jvmBasicParser.expression_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token set314 = null;
      jvmBasicParser.relationalExpression_return relationalExpression313 = null;
      jvmBasicParser.relationalExpression_return relationalExpression315 = null;
      final CommonTree set314_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:11: ( relationalExpression ( ( AND | OR ) relationalExpression ^)* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:13: relationalExpression ( ( AND | OR ) relationalExpression ^)*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_relationalExpression_in_expression2196);
            relationalExpression313 = relationalExpression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, relationalExpression313.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:34: ( ( AND | OR ) relationalExpression ^)*
            loop38: do {
               int alt38 = 2;
               switch (input.LA(1)) {
                  case AND:
                  case OR: {
                     alt38 = 1;
                  }
                     break;
               }
               switch (alt38) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:35: ( AND | OR ) relationalExpression ^
                  {
                     set314 = (Token) input.LT(1);
                     if ((input.LA(1) == AND) || (input.LA(1) == OR)) {
                        input.consume();
                        if (state.backtracking == 0) {
                           adaptor.addChild(root_0, (CommonTree) adaptor.create(set314));
                        }
                        state.errorRecovery = false;
                        state.failed = false;
                     } else {
                        if (state.backtracking > 0) {
                           state.failed = true;
                           return retval;
                        }
                        final MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                     }
                     pushFollow(FOLLOW_relationalExpression_in_expression2205);
                     relationalExpression315 = relationalExpression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        root_0 = (CommonTree) adaptor.becomeRoot(relationalExpression315.getTree(), root_0);
                     }
                  }
                     break;
                  default:
                     break loop38;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "expression"
   // $ANTLR start "exprlist"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:1: exprlist : expression ( COMMA ! expression ^)* ;
   public final jvmBasicParser.exprlist_return exprlist() throws RecognitionException {
      final jvmBasicParser.exprlist_return retval = new jvmBasicParser.exprlist_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token COMMA325 = null;
      jvmBasicParser.expression_return expression324 = null;
      jvmBasicParser.expression_return expression326 = null;
      final CommonTree COMMA325_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:10: ( expression ( COMMA ! expression ^)* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:12: expression ( COMMA ! expression ^)*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_expression_in_exprlist2273);
            expression324 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression324.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:23: ( COMMA ! expression ^)*
            loop42: do {
               int alt42 = 2;
               switch (input.LA(1)) {
                  case COMMA: {
                     alt42 = 1;
                  }
                     break;
               }
               switch (alt42) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:24: COMMA ! expression ^
                  {
                     COMMA325 = (Token) match(input, COMMA, FOLLOW_COMMA_in_exprlist2276);
                     if (state.failed) {
                        return retval;
                     }
                     pushFollow(FOLLOW_expression_in_exprlist2279);
                     expression326 = expression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        root_0 = (CommonTree) adaptor.becomeRoot(expression326.getTree(), root_0);
                     }
                  }
                     break;
                  default:
                     break loop42;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "exprlist"
   // $ANTLR start "fnfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:1: fnfunc : FN ^ var LPAREN expression RPAREN ;
   public final jvmBasicParser.fnfunc_return fnfunc() throws RecognitionException {
      final jvmBasicParser.fnfunc_return retval = new jvmBasicParser.fnfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token FN396 = null;
      Token LPAREN398 = null;
      Token RPAREN400 = null;
      jvmBasicParser.var_return var397 = null;
      jvmBasicParser.expression_return expression399 = null;
      CommonTree FN396_tree = null;
      CommonTree LPAREN398_tree = null;
      CommonTree RPAREN400_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:7: ( FN ^ var LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:9: FN ^ var LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            FN396 = (Token) match(input, FN, FOLLOW_FN_in_fnfunc2526);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               FN396_tree = (CommonTree) adaptor.create(FN396);
               root_0 = (CommonTree) adaptor.becomeRoot(FN396_tree, root_0);
            }
            pushFollow(FOLLOW_var_in_fnfunc2529);
            var397 = var();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, var397.getTree());
            }
            LPAREN398 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_fnfunc2531);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN398_tree = (CommonTree) adaptor.create(LPAREN398);
               adaptor.addChild(root_0, LPAREN398_tree);
            }
            pushFollow(FOLLOW_expression_in_fnfunc2533);
            expression399 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression399.getTree());
            }
            RPAREN400 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_fnfunc2535);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN400_tree = (CommonTree) adaptor.create(RPAREN400);
               adaptor.addChild(root_0, RPAREN400_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "fnfunc"
   // $ANTLR start "forstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:154:1: forstmt : FOR ^ vardecl EQ expression TO expression ( STEP expression )? ;
   public final jvmBasicParser.forstmt_return forstmt() throws RecognitionException {
      final jvmBasicParser.forstmt_return retval = new jvmBasicParser.forstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token FOR113 = null;
      Token EQ115 = null;
      Token TO117 = null;
      Token STEP119 = null;
      jvmBasicParser.vardecl_return vardecl114 = null;
      jvmBasicParser.expression_return expression116 = null;
      jvmBasicParser.expression_return expression118 = null;
      jvmBasicParser.expression_return expression120 = null;
      CommonTree FOR113_tree = null;
      CommonTree EQ115_tree = null;
      CommonTree TO117_tree = null;
      CommonTree STEP119_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:154:9: ( FOR ^ vardecl EQ expression TO expression ( STEP expression )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:154:11: FOR ^ vardecl EQ expression TO expression ( STEP expression )?
         {
            root_0 = (CommonTree) adaptor.nil();
            FOR113 = (Token) match(input, FOR, FOLLOW_FOR_in_forstmt1441);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               FOR113_tree = (CommonTree) adaptor.create(FOR113);
               root_0 = (CommonTree) adaptor.becomeRoot(FOR113_tree, root_0);
            }
            pushFollow(FOLLOW_vardecl_in_forstmt1445);
            vardecl114 = vardecl();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, vardecl114.getTree());
            }
            EQ115 = (Token) match(input, EQ, FOLLOW_EQ_in_forstmt1447);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ115_tree = (CommonTree) adaptor.create(EQ115);
               adaptor.addChild(root_0, EQ115_tree);
            }
            pushFollow(FOLLOW_expression_in_forstmt1449);
            expression116 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression116.getTree());
            }
            TO117 = (Token) match(input, TO, FOLLOW_TO_in_forstmt1451);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               TO117_tree = (CommonTree) adaptor.create(TO117);
               adaptor.addChild(root_0, TO117_tree);
            }
            pushFollow(FOLLOW_expression_in_forstmt1453);
            expression118 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression118.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:154:53: ( STEP expression )?
            int alt15 = 2;
            switch (input.LA(1)) {
               case STEP: {
                  alt15 = 1;
               }
                  break;
            }
            switch (alt15) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:154:54: STEP expression
               {
                  STEP119 = (Token) match(input, STEP, FOLLOW_STEP_in_forstmt1456);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     STEP119_tree = (CommonTree) adaptor.create(STEP119);
                     adaptor.addChild(root_0, STEP119_tree);
                  }
                  pushFollow(FOLLOW_expression_in_forstmt1458);
                  expression120 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression120.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "forstmt"
   // $ANTLR start "frefunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:1: frefunc : FRE ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.frefunc_return frefunc() throws RecognitionException {
      final jvmBasicParser.frefunc_return retval = new jvmBasicParser.frefunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token FRE368 = null;
      Token LPAREN369 = null;
      Token RPAREN371 = null;
      jvmBasicParser.expression_return expression370 = null;
      CommonTree FRE368_tree = null;
      CommonTree LPAREN369_tree = null;
      CommonTree RPAREN371_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:9: ( FRE ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:11: FRE ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            FRE368 = (Token) match(input, FRE, FOLLOW_FRE_in_frefunc2436);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               FRE368_tree = (CommonTree) adaptor.create(FRE368);
               root_0 = (CommonTree) adaptor.becomeRoot(FRE368_tree, root_0);
            }
            LPAREN369 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_frefunc2439);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN369_tree = (CommonTree) adaptor.create(LPAREN369);
               adaptor.addChild(root_0, LPAREN369_tree);
            }
            pushFollow(FOLLOW_expression_in_frefunc2441);
            expression370 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression370.getTree());
            }
            RPAREN371 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_frefunc2443);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN371_tree = (CommonTree) adaptor.create(RPAREN371);
               adaptor.addChild(root_0, RPAREN371_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "frefunc"
   // $ANTLR start "func"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:1: func : ( vardecl | stringliteral | NUMBER | chrfunc | sqrfunc | lenfunc | strfunc | ascfunc | scrnfunc | midfunc | pdlfunc | peekfunc |
   // intfunc | spcfunc | frefunc | posfunc | usrfunc | leftfunc | valfunc | rightfunc | fnfunc | sinfunc | cosfunc | tanfunc | atnfunc | rndfunc | sgnfunc | expfunc | logfunc | absfunc | ( LPAREN
   // expression RPAREN ) );
   public final jvmBasicParser.func_return func() throws RecognitionException {
      final jvmBasicParser.func_return retval = new jvmBasicParser.func_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token NUMBER267 = null;
      Token LPAREN295 = null;
      Token RPAREN297 = null;
      jvmBasicParser.vardecl_return vardecl265 = null;
      jvmBasicParser.stringliteral_return stringliteral266 = null;
      jvmBasicParser.chrfunc_return chrfunc268 = null;
      jvmBasicParser.sqrfunc_return sqrfunc269 = null;
      jvmBasicParser.lenfunc_return lenfunc270 = null;
      jvmBasicParser.strfunc_return strfunc271 = null;
      jvmBasicParser.ascfunc_return ascfunc272 = null;
      jvmBasicParser.scrnfunc_return scrnfunc273 = null;
      jvmBasicParser.midfunc_return midfunc274 = null;
      jvmBasicParser.pdlfunc_return pdlfunc275 = null;
      jvmBasicParser.peekfunc_return peekfunc276 = null;
      jvmBasicParser.intfunc_return intfunc277 = null;
      jvmBasicParser.spcfunc_return spcfunc278 = null;
      jvmBasicParser.frefunc_return frefunc279 = null;
      jvmBasicParser.posfunc_return posfunc280 = null;
      jvmBasicParser.usrfunc_return usrfunc281 = null;
      jvmBasicParser.leftfunc_return leftfunc282 = null;
      jvmBasicParser.valfunc_return valfunc283 = null;
      jvmBasicParser.rightfunc_return rightfunc284 = null;
      jvmBasicParser.fnfunc_return fnfunc285 = null;
      jvmBasicParser.sinfunc_return sinfunc286 = null;
      jvmBasicParser.cosfunc_return cosfunc287 = null;
      jvmBasicParser.tanfunc_return tanfunc288 = null;
      jvmBasicParser.atnfunc_return atnfunc289 = null;
      jvmBasicParser.rndfunc_return rndfunc290 = null;
      jvmBasicParser.sgnfunc_return sgnfunc291 = null;
      jvmBasicParser.expfunc_return expfunc292 = null;
      jvmBasicParser.logfunc_return logfunc293 = null;
      jvmBasicParser.absfunc_return absfunc294 = null;
      jvmBasicParser.expression_return expression296 = null;
      CommonTree NUMBER267_tree = null;
      CommonTree LPAREN295_tree = null;
      CommonTree RPAREN297_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:6: ( vardecl | stringliteral | NUMBER | chrfunc | sqrfunc | lenfunc | strfunc | ascfunc | scrnfunc | midfunc | pdlfunc | peekfunc |
         // intfunc | spcfunc | frefunc | posfunc | usrfunc | leftfunc | valfunc | rightfunc | fnfunc | sinfunc | cosfunc | tanfunc | atnfunc | rndfunc | sgnfunc | expfunc | logfunc | absfunc | (
         // LPAREN expression RPAREN ) )
         int alt31 = 31;
         switch (input.LA(1)) {
            case LETTERS: {
               alt31 = 1;
            }
               break;
            case STRINGLITERAL: {
               alt31 = 2;
            }
               break;
            case NUMBER: {
               alt31 = 3;
            }
               break;
            case CHR: {
               alt31 = 4;
            }
               break;
            case SQR: {
               alt31 = 5;
            }
               break;
            case LEN: {
               alt31 = 6;
            }
               break;
            case STR: {
               alt31 = 7;
            }
               break;
            case ASC: {
               alt31 = 8;
            }
               break;
            case SCRN: {
               alt31 = 9;
            }
               break;
            case MID: {
               alt31 = 10;
            }
               break;
            case PDL: {
               alt31 = 11;
            }
               break;
            case PEEK: {
               alt31 = 12;
            }
               break;
            case INTF: {
               alt31 = 13;
            }
               break;
            case SPC: {
               alt31 = 14;
            }
               break;
            case FRE: {
               alt31 = 15;
            }
               break;
            case POS: {
               alt31 = 16;
            }
               break;
            case USR: {
               alt31 = 17;
            }
               break;
            case LEFT: {
               alt31 = 18;
            }
               break;
            case VAL: {
               alt31 = 19;
            }
               break;
            case RIGHT: {
               alt31 = 20;
            }
               break;
            case FN: {
               alt31 = 21;
            }
               break;
            case SIN: {
               alt31 = 22;
            }
               break;
            case COS: {
               alt31 = 23;
            }
               break;
            case TAN: {
               alt31 = 24;
            }
               break;
            case ATN: {
               alt31 = 25;
            }
               break;
            case RND: {
               alt31 = 26;
            }
               break;
            case SGN: {
               alt31 = 27;
            }
               break;
            case EXP: {
               alt31 = 28;
            }
               break;
            case LOG: {
               alt31 = 29;
            }
               break;
            case ABS: {
               alt31 = 30;
            }
               break;
            case LPAREN: {
               alt31 = 31;
            }
               break;
            default:
               if (state.backtracking > 0) {
                  state.failed = true;
                  return retval;
               }
               final NoViableAltException nvae = new NoViableAltException("", 31, 0, input);
               throw nvae;
         }
         switch (alt31) {
            case 1:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:8: vardecl
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_vardecl_in_func1991);
               vardecl265 = vardecl();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, vardecl265.getTree());
               }
            }
               break;
            case 2:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:18: stringliteral
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_stringliteral_in_func1995);
               stringliteral266 = stringliteral();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, stringliteral266.getTree());
               }
            }
               break;
            case 3:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:34: NUMBER
            {
               root_0 = (CommonTree) adaptor.nil();
               NUMBER267 = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_func1999);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  NUMBER267_tree = (CommonTree) adaptor.create(NUMBER267);
                  adaptor.addChild(root_0, NUMBER267_tree);
               }
            }
               break;
            case 4:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:44: chrfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_chrfunc_in_func2004);
               chrfunc268 = chrfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, chrfunc268.getTree());
               }
            }
               break;
            case 5:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:54: sqrfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_sqrfunc_in_func2008);
               sqrfunc269 = sqrfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, sqrfunc269.getTree());
               }
            }
               break;
            case 6:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:64: lenfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_lenfunc_in_func2012);
               lenfunc270 = lenfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, lenfunc270.getTree());
               }
            }
               break;
            case 7:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:74: strfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_strfunc_in_func2016);
               strfunc271 = strfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, strfunc271.getTree());
               }
            }
               break;
            case 8:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:84: ascfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_ascfunc_in_func2020);
               ascfunc272 = ascfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, ascfunc272.getTree());
               }
            }
               break;
            case 9:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:93: scrnfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_scrnfunc_in_func2023);
               scrnfunc273 = scrnfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, scrnfunc273.getTree());
               }
            }
               break;
            case 10:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:105: midfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_midfunc_in_func2028);
               midfunc274 = midfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, midfunc274.getTree());
               }
            }
               break;
            case 11:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:115: pdlfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_pdlfunc_in_func2032);
               pdlfunc275 = pdlfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, pdlfunc275.getTree());
               }
            }
               break;
            case 12:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:125: peekfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_peekfunc_in_func2036);
               peekfunc276 = peekfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, peekfunc276.getTree());
               }
            }
               break;
            case 13:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:136: intfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_intfunc_in_func2040);
               intfunc277 = intfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, intfunc277.getTree());
               }
            }
               break;
            case 14:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:146: spcfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_spcfunc_in_func2044);
               spcfunc278 = spcfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, spcfunc278.getTree());
               }
            }
               break;
            case 15:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:156: frefunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_frefunc_in_func2048);
               frefunc279 = frefunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, frefunc279.getTree());
               }
            }
               break;
            case 16:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:166: posfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_posfunc_in_func2052);
               posfunc280 = posfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, posfunc280.getTree());
               }
            }
               break;
            case 17:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:176: usrfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_usrfunc_in_func2056);
               usrfunc281 = usrfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, usrfunc281.getTree());
               }
            }
               break;
            case 18:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:185: leftfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_leftfunc_in_func2059);
               leftfunc282 = leftfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, leftfunc282.getTree());
               }
            }
               break;
            case 19:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:196: valfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_valfunc_in_func2063);
               valfunc283 = valfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, valfunc283.getTree());
               }
            }
               break;
            case 20:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:206: rightfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_rightfunc_in_func2067);
               rightfunc284 = rightfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, rightfunc284.getTree());
               }
            }
               break;
            case 21:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:216: fnfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_fnfunc_in_func2069);
               fnfunc285 = fnfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, fnfunc285.getTree());
               }
            }
               break;
            case 22:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:223: sinfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_sinfunc_in_func2071);
               sinfunc286 = sinfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, sinfunc286.getTree());
               }
            }
               break;
            case 23:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:233: cosfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_cosfunc_in_func2075);
               cosfunc287 = cosfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, cosfunc287.getTree());
               }
            }
               break;
            case 24:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:242: tanfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_tanfunc_in_func2078);
               tanfunc288 = tanfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, tanfunc288.getTree());
               }
            }
               break;
            case 25:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:250: atnfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_atnfunc_in_func2080);
               atnfunc289 = atnfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, atnfunc289.getTree());
               }
            }
               break;
            case 26:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:258: rndfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_rndfunc_in_func2082);
               rndfunc290 = rndfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, rndfunc290.getTree());
               }
            }
               break;
            case 27:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:266: sgnfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_sgnfunc_in_func2084);
               sgnfunc291 = sgnfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, sgnfunc291.getTree());
               }
            }
               break;
            case 28:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:274: expfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_expfunc_in_func2086);
               expfunc292 = expfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, expfunc292.getTree());
               }
            }
               break;
            case 29:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:282: logfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_logfunc_in_func2088);
               logfunc293 = logfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, logfunc293.getTree());
               }
            }
               break;
            case 30:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:290: absfunc
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_absfunc_in_func2090);
               absfunc294 = absfunc();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, absfunc294.getTree());
               }
            }
               break;
            case 31:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:300: ( LPAREN expression RPAREN )
            {
               root_0 = (CommonTree) adaptor.nil();
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:300: ( LPAREN expression RPAREN )
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:301: LPAREN expression RPAREN
               {
                  LPAREN295 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_func2095);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     LPAREN295_tree = (CommonTree) adaptor.create(LPAREN295);
                     adaptor.addChild(root_0, LPAREN295_tree);
                  }
                  pushFollow(FOLLOW_expression_in_func2097);
                  expression296 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression296.getTree());
                  }
                  RPAREN297 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_func2099);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     RPAREN297_tree = (CommonTree) adaptor.create(RPAREN297);
                     adaptor.addChild(root_0, RPAREN297_tree);
                  }
               }
            }
               break;
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "func"
   // delegates
   public Parser[] getDelegates() {
      return new Parser[] {};
   }

   public String getGrammarFileName() {
      return "com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g";
   }

   // $ANTLR start "getstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:146:1: getstmt : GET exprlist ;
   public final jvmBasicParser.getstmt_return getstmt() throws RecognitionException {
      final jvmBasicParser.getstmt_return retval = new jvmBasicParser.getstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token GET84 = null;
      jvmBasicParser.exprlist_return exprlist85 = null;
      CommonTree GET84_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:146:9: ( GET exprlist )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:146:11: GET exprlist
         {
            root_0 = (CommonTree) adaptor.nil();
            GET84 = (Token) match(input, GET, FOLLOW_GET_in_getstmt1309);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               GET84_tree = (CommonTree) adaptor.create(GET84);
               adaptor.addChild(root_0, GET84_tree);
            }
            pushFollow(FOLLOW_exprlist_in_getstmt1311);
            exprlist85 = exprlist();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, exprlist85.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "getstmt"
   public String[] getTokenNames() {
      return jvmBasicParser.tokenNames;
   }

   public TreeAdaptor getTreeAdaptor() {
      return adaptor;
   }

   // $ANTLR start "gosubstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:1: gosubstmt : GOSUB ^ linenumber ;
   public final jvmBasicParser.gosubstmt_return gosubstmt() throws RecognitionException {
      final jvmBasicParser.gosubstmt_return retval = new jvmBasicParser.gosubstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token GOSUB133 = null;
      jvmBasicParser.linenumber_return linenumber134 = null;
      CommonTree GOSUB133_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:10: ( GOSUB ^ linenumber )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:12: GOSUB ^ linenumber
         {
            root_0 = (CommonTree) adaptor.nil();
            GOSUB133 = (Token) match(input, GOSUB, FOLLOW_GOSUB_in_gosubstmt1527);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               GOSUB133_tree = (CommonTree) adaptor.create(GOSUB133);
               root_0 = (CommonTree) adaptor.becomeRoot(GOSUB133_tree, root_0);
            }
            pushFollow(FOLLOW_linenumber_in_gosubstmt1530);
            linenumber134 = linenumber();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, linenumber134.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "gosubstmt"
   // $ANTLR start "gotostmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:1: gotostmt : GOTO ^ linenumber ;
   public final jvmBasicParser.gotostmt_return gotostmt() throws RecognitionException {
      final jvmBasicParser.gotostmt_return retval = new jvmBasicParser.gotostmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token GOTO131 = null;
      jvmBasicParser.linenumber_return linenumber132 = null;
      CommonTree GOTO131_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:9: ( GOTO ^ linenumber )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:11: GOTO ^ linenumber
         {
            root_0 = (CommonTree) adaptor.nil();
            GOTO131 = (Token) match(input, GOTO, FOLLOW_GOTO_in_gotostmt1518);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               GOTO131_tree = (CommonTree) adaptor.create(GOTO131);
               root_0 = (CommonTree) adaptor.becomeRoot(GOTO131_tree, root_0);
            }
            pushFollow(FOLLOW_linenumber_in_gotostmt1521);
            linenumber132 = linenumber();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, linenumber132.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "gotostmt"
   // $ANTLR start "gte"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:1: gte : ( GTE | ( GT EQ ) | ( EQ GT ) );
   public final jvmBasicParser.gte_return gte() throws RecognitionException {
      final jvmBasicParser.gte_return retval = new jvmBasicParser.gte_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token GTE97 = null;
      Token GT98 = null;
      Token EQ99 = null;
      Token EQ100 = null;
      Token GT101 = null;
      CommonTree GTE97_tree = null;
      CommonTree GT98_tree = null;
      CommonTree EQ99_tree = null;
      CommonTree EQ100_tree = null;
      CommonTree GT101_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:5: ( GTE | ( GT EQ ) | ( EQ GT ) )
         int alt12 = 3;
         switch (input.LA(1)) {
            case GTE: {
               alt12 = 1;
            }
               break;
            case GT: {
               alt12 = 2;
            }
               break;
            case EQ: {
               alt12 = 3;
            }
               break;
            default:
               if (state.backtracking > 0) {
                  state.failed = true;
                  return retval;
               }
               final NoViableAltException nvae = new NoViableAltException("", 12, 0, input);
               throw nvae;
         }
         switch (alt12) {
            case 1:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:7: GTE
            {
               root_0 = (CommonTree) adaptor.nil();
               GTE97 = (Token) match(input, GTE, FOLLOW_GTE_in_gte1371);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  GTE97_tree = (CommonTree) adaptor.create(GTE97);
                  adaptor.addChild(root_0, GTE97_tree);
               }
            }
               break;
            case 2:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:13: ( GT EQ )
            {
               root_0 = (CommonTree) adaptor.nil();
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:13: ( GT EQ )
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:14: GT EQ
               {
                  GT98 = (Token) match(input, GT, FOLLOW_GT_in_gte1376);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     GT98_tree = (CommonTree) adaptor.create(GT98);
                     adaptor.addChild(root_0, GT98_tree);
                  }
                  EQ99 = (Token) match(input, EQ, FOLLOW_EQ_in_gte1378);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     EQ99_tree = (CommonTree) adaptor.create(EQ99);
                     adaptor.addChild(root_0, EQ99_tree);
                  }
               }
            }
               break;
            case 3:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:23: ( EQ GT )
            {
               root_0 = (CommonTree) adaptor.nil();
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:23: ( EQ GT )
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:150:24: EQ GT
               {
                  EQ100 = (Token) match(input, EQ, FOLLOW_EQ_in_gte1384);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     EQ100_tree = (CommonTree) adaptor.create(EQ100);
                     adaptor.addChild(root_0, EQ100_tree);
                  }
                  GT101 = (Token) match(input, GT, FOLLOW_GT_in_gte1386);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     GT101_tree = (CommonTree) adaptor.create(GT101);
                     adaptor.addChild(root_0, GT101_tree);
                  }
               }
            }
               break;
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "gte"
   // $ANTLR start "hcolorstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:1: hcolorstmt : HCOLOR EQ expression ;
   public final jvmBasicParser.hcolorstmt_return hcolorstmt() throws RecognitionException {
      final jvmBasicParser.hcolorstmt_return retval = new jvmBasicParser.hcolorstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token HCOLOR231 = null;
      Token EQ232 = null;
      jvmBasicParser.expression_return expression233 = null;
      CommonTree HCOLOR231_tree = null;
      CommonTree EQ232_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:11: ( HCOLOR EQ expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:13: HCOLOR EQ expression
         {
            root_0 = (CommonTree) adaptor.nil();
            HCOLOR231 = (Token) match(input, HCOLOR, FOLLOW_HCOLOR_in_hcolorstmt1870);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               HCOLOR231_tree = (CommonTree) adaptor.create(HCOLOR231);
               adaptor.addChild(root_0, HCOLOR231_tree);
            }
            EQ232 = (Token) match(input, EQ, FOLLOW_EQ_in_hcolorstmt1872);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ232_tree = (CommonTree) adaptor.create(EQ232);
               adaptor.addChild(root_0, EQ232_tree);
            }
            pushFollow(FOLLOW_expression_in_hcolorstmt1874);
            expression233 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression233.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "hcolorstmt"
   // $ANTLR start "himemstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:1: himemstmt : HIMEM COLON expression ;
   public final jvmBasicParser.himemstmt_return himemstmt() throws RecognitionException {
      final jvmBasicParser.himemstmt_return retval = new jvmBasicParser.himemstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token HIMEM179 = null;
      Token COLON180 = null;
      jvmBasicParser.expression_return expression181 = null;
      CommonTree HIMEM179_tree = null;
      CommonTree COLON180_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:10: ( HIMEM COLON expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:12: HIMEM COLON expression
         {
            root_0 = (CommonTree) adaptor.nil();
            HIMEM179 = (Token) match(input, HIMEM, FOLLOW_HIMEM_in_himemstmt1704);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               HIMEM179_tree = (CommonTree) adaptor.create(HIMEM179);
               adaptor.addChild(root_0, HIMEM179_tree);
            }
            COLON180 = (Token) match(input, COLON, FOLLOW_COLON_in_himemstmt1706);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COLON180_tree = (CommonTree) adaptor.create(COLON180);
               adaptor.addChild(root_0, COLON180_tree);
            }
            pushFollow(FOLLOW_expression_in_himemstmt1708);
            expression181 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression181.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "himemstmt"
   // $ANTLR start "hlinstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:1: hlinstmt : HLIN expression COMMA expression AT expression ;
   public final jvmBasicParser.hlinstmt_return hlinstmt() throws RecognitionException {
      final jvmBasicParser.hlinstmt_return retval = new jvmBasicParser.hlinstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token HLIN234 = null;
      Token COMMA236 = null;
      Token AT238 = null;
      jvmBasicParser.expression_return expression235 = null;
      jvmBasicParser.expression_return expression237 = null;
      jvmBasicParser.expression_return expression239 = null;
      CommonTree HLIN234_tree = null;
      CommonTree COMMA236_tree = null;
      CommonTree AT238_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:9: ( HLIN expression COMMA expression AT expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:11: HLIN expression COMMA expression AT expression
         {
            root_0 = (CommonTree) adaptor.nil();
            HLIN234 = (Token) match(input, HLIN, FOLLOW_HLIN_in_hlinstmt1880);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               HLIN234_tree = (CommonTree) adaptor.create(HLIN234);
               adaptor.addChild(root_0, HLIN234_tree);
            }
            pushFollow(FOLLOW_expression_in_hlinstmt1882);
            expression235 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression235.getTree());
            }
            COMMA236 = (Token) match(input, COMMA, FOLLOW_COMMA_in_hlinstmt1884);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA236_tree = (CommonTree) adaptor.create(COMMA236);
               adaptor.addChild(root_0, COMMA236_tree);
            }
            pushFollow(FOLLOW_expression_in_hlinstmt1886);
            expression237 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression237.getTree());
            }
            AT238 = (Token) match(input, AT, FOLLOW_AT_in_hlinstmt1888);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               AT238_tree = (CommonTree) adaptor.create(AT238);
               adaptor.addChild(root_0, AT238_tree);
            }
            pushFollow(FOLLOW_expression_in_hlinstmt1890);
            expression239 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression239.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "hlinstmt"
   // $ANTLR start "hplotstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:1: hplotstmt : HPLOT ( expression COMMA expression )? ( TO expression COMMA expression )* ;
   public final jvmBasicParser.hplotstmt_return hplotstmt() throws RecognitionException {
      final jvmBasicParser.hplotstmt_return retval = new jvmBasicParser.hplotstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token HPLOT143 = null;
      Token COMMA145 = null;
      Token TO147 = null;
      Token COMMA149 = null;
      jvmBasicParser.expression_return expression144 = null;
      jvmBasicParser.expression_return expression146 = null;
      jvmBasicParser.expression_return expression148 = null;
      jvmBasicParser.expression_return expression150 = null;
      CommonTree HPLOT143_tree = null;
      CommonTree COMMA145_tree = null;
      CommonTree TO147_tree = null;
      CommonTree COMMA149_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:10: ( HPLOT ( expression COMMA expression )? ( TO expression COMMA expression )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:12: HPLOT ( expression COMMA expression )? ( TO expression COMMA expression )*
         {
            root_0 = (CommonTree) adaptor.nil();
            HPLOT143 = (Token) match(input, HPLOT, FOLLOW_HPLOT_in_hplotstmt1582);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               HPLOT143_tree = (CommonTree) adaptor.create(HPLOT143);
               adaptor.addChild(root_0, HPLOT143_tree);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:18: ( expression COMMA expression )?
            int alt19 = 2;
            switch (input.LA(1)) {
               case ABS:
               case ASC:
               case ATN:
               case CHR:
               case COS:
               case EXP:
               case FN:
               case FRE:
               case INTF:
               case LEFT:
               case LEN:
               case LETTERS:
               case LOG:
               case LPAREN:
               case MID:
               case MINUS:
               case NOT:
               case NUMBER:
               case PDL:
               case PEEK:
               case PLUS:
               case POS:
               case RIGHT:
               case RND:
               case SCRN:
               case SGN:
               case SIN:
               case SPC:
               case SQR:
               case STR:
               case STRINGLITERAL:
               case TAN:
               case USR:
               case VAL: {
                  alt19 = 1;
               }
                  break;
            }
            switch (alt19) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:19: expression COMMA expression
               {
                  pushFollow(FOLLOW_expression_in_hplotstmt1585);
                  expression144 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression144.getTree());
                  }
                  COMMA145 = (Token) match(input, COMMA, FOLLOW_COMMA_in_hplotstmt1587);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA145_tree = (CommonTree) adaptor.create(COMMA145);
                     adaptor.addChild(root_0, COMMA145_tree);
                  }
                  pushFollow(FOLLOW_expression_in_hplotstmt1589);
                  expression146 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression146.getTree());
                  }
               }
                  break;
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:49: ( TO expression COMMA expression )*
            loop20: do {
               int alt20 = 2;
               switch (input.LA(1)) {
                  case TO: {
                     alt20 = 1;
                  }
                     break;
               }
               switch (alt20) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:50: TO expression COMMA expression
                  {
                     TO147 = (Token) match(input, TO, FOLLOW_TO_in_hplotstmt1594);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        TO147_tree = (CommonTree) adaptor.create(TO147);
                        adaptor.addChild(root_0, TO147_tree);
                     }
                     pushFollow(FOLLOW_expression_in_hplotstmt1596);
                     expression148 = expression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, expression148.getTree());
                     }
                     COMMA149 = (Token) match(input, COMMA, FOLLOW_COMMA_in_hplotstmt1598);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        COMMA149_tree = (CommonTree) adaptor.create(COMMA149);
                        adaptor.addChild(root_0, COMMA149_tree);
                     }
                     pushFollow(FOLLOW_expression_in_hplotstmt1600);
                     expression150 = expression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, expression150.getTree());
                     }
                  }
                     break;
                  default:
                     break loop20;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "hplotstmt"
   // $ANTLR start "htabstmnt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:1: htabstmnt : HTAB expression ;
   public final jvmBasicParser.htabstmnt_return htabstmnt() throws RecognitionException {
      final jvmBasicParser.htabstmnt_return retval = new jvmBasicParser.htabstmnt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token HTAB177 = null;
      jvmBasicParser.expression_return expression178 = null;
      CommonTree HTAB177_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:11: ( HTAB expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:13: HTAB expression
         {
            root_0 = (CommonTree) adaptor.nil();
            HTAB177 = (Token) match(input, HTAB, FOLLOW_HTAB_in_htabstmnt1696);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               HTAB177_tree = (CommonTree) adaptor.create(HTAB177);
               adaptor.addChild(root_0, HTAB177_tree);
            }
            pushFollow(FOLLOW_expression_in_htabstmnt1698);
            expression178 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression178.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "htabstmnt"
   // $ANTLR start "ifstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:153:1: ifstmt : IF ^ expression ( THEN )? statement ;
   public final jvmBasicParser.ifstmt_return ifstmt() throws RecognitionException {
      final jvmBasicParser.ifstmt_return retval = new jvmBasicParser.ifstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token IF109 = null;
      Token THEN111 = null;
      jvmBasicParser.expression_return expression110 = null;
      jvmBasicParser.statement_return statement112 = null;
      CommonTree IF109_tree = null;
      CommonTree THEN111_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:153:8: ( IF ^ expression ( THEN )? statement )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:153:10: IF ^ expression ( THEN )? statement
         {
            root_0 = (CommonTree) adaptor.nil();
            IF109 = (Token) match(input, IF, FOLLOW_IF_in_ifstmt1426);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               IF109_tree = (CommonTree) adaptor.create(IF109);
               root_0 = (CommonTree) adaptor.becomeRoot(IF109_tree, root_0);
            }
            pushFollow(FOLLOW_expression_in_ifstmt1429);
            expression110 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression110.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:153:25: ( THEN )?
            int alt14 = 2;
            switch (input.LA(1)) {
               case THEN: {
                  alt14 = 1;
               }
                  break;
            }
            switch (alt14) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:153:25: THEN
               {
                  THEN111 = (Token) match(input, THEN, FOLLOW_THEN_in_ifstmt1431);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     THEN111_tree = (CommonTree) adaptor.create(THEN111);
                     adaptor.addChild(root_0, THEN111_tree);
                  }
               }
                  break;
            }
            pushFollow(FOLLOW_statement_in_ifstmt1434);
            statement112 = statement();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, statement112.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "ifstmt"
   // $ANTLR start "inputstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:1: inputstmt : INPUT ^ ( stringliteral COMMA )? varlist ;
   public final jvmBasicParser.inputstmt_return inputstmt() throws RecognitionException {
      final jvmBasicParser.inputstmt_return retval = new jvmBasicParser.inputstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token INPUT123 = null;
      Token COMMA125 = null;
      jvmBasicParser.stringliteral_return stringliteral124 = null;
      jvmBasicParser.varlist_return varlist126 = null;
      CommonTree INPUT123_tree = null;
      CommonTree COMMA125_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:11: ( INPUT ^ ( stringliteral COMMA )? varlist )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:13: INPUT ^ ( stringliteral COMMA )? varlist
         {
            root_0 = (CommonTree) adaptor.nil();
            INPUT123 = (Token) match(input, INPUT, FOLLOW_INPUT_in_inputstmt1479);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               INPUT123_tree = (CommonTree) adaptor.create(INPUT123);
               root_0 = (CommonTree) adaptor.becomeRoot(INPUT123_tree, root_0);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:20: ( stringliteral COMMA )?
            int alt17 = 2;
            switch (input.LA(1)) {
               case STRINGLITERAL: {
                  alt17 = 1;
               }
                  break;
            }
            switch (alt17) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:21: stringliteral COMMA
               {
                  pushFollow(FOLLOW_stringliteral_in_inputstmt1483);
                  stringliteral124 = stringliteral();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, stringliteral124.getTree());
                  }
                  COMMA125 = (Token) match(input, COMMA, FOLLOW_COMMA_in_inputstmt1485);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA125_tree = (CommonTree) adaptor.create(COMMA125);
                     adaptor.addChild(root_0, COMMA125_tree);
                  }
               }
                  break;
            }
            pushFollow(FOLLOW_varlist_in_inputstmt1489);
            varlist126 = varlist();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, varlist126.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "inputstmt"
   // $ANTLR start "instmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:1: instmt : INNUMBER NUMBER ;
   public final jvmBasicParser.instmt_return instmt() throws RecognitionException {
      final jvmBasicParser.instmt_return retval = new jvmBasicParser.instmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token INNUMBER251 = null;
      Token NUMBER252 = null;
      CommonTree INNUMBER251_tree = null;
      CommonTree NUMBER252_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:7: ( INNUMBER NUMBER )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:9: INNUMBER NUMBER
         {
            root_0 = (CommonTree) adaptor.nil();
            INNUMBER251 = (Token) match(input, INNUMBER, FOLLOW_INNUMBER_in_instmt1930);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               INNUMBER251_tree = (CommonTree) adaptor.create(INNUMBER251);
               adaptor.addChild(root_0, INNUMBER251_tree);
            }
            NUMBER252 = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_instmt1932);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               NUMBER252_tree = (CommonTree) adaptor.create(NUMBER252);
               adaptor.addChild(root_0, NUMBER252_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "instmt"
   // $ANTLR start "intfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:1: intfunc : INTF ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.intfunc_return intfunc() throws RecognitionException {
      final jvmBasicParser.intfunc_return retval = new jvmBasicParser.intfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token INTF360 = null;
      Token LPAREN361 = null;
      Token RPAREN363 = null;
      jvmBasicParser.expression_return expression362 = null;
      CommonTree INTF360_tree = null;
      CommonTree LPAREN361_tree = null;
      CommonTree RPAREN363_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:9: ( INTF ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:11: INTF ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            INTF360 = (Token) match(input, INTF, FOLLOW_INTF_in_intfunc2408);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               INTF360_tree = (CommonTree) adaptor.create(INTF360);
               root_0 = (CommonTree) adaptor.becomeRoot(INTF360_tree, root_0);
            }
            LPAREN361 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_intfunc2411);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN361_tree = (CommonTree) adaptor.create(LPAREN361);
               adaptor.addChild(root_0, LPAREN361_tree);
            }
            pushFollow(FOLLOW_expression_in_intfunc2413);
            expression362 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression362.getTree());
            }
            RPAREN363 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_intfunc2415);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN363_tree = (CommonTree) adaptor.create(RPAREN363);
               adaptor.addChild(root_0, RPAREN363_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "intfunc"
   // $ANTLR start "leftfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:1: leftfunc : LEFT ^ LPAREN expression COMMA expression RPAREN ;
   public final jvmBasicParser.leftfunc_return leftfunc() throws RecognitionException {
      final jvmBasicParser.leftfunc_return retval = new jvmBasicParser.leftfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LEFT380 = null;
      Token LPAREN381 = null;
      Token COMMA383 = null;
      Token RPAREN385 = null;
      jvmBasicParser.expression_return expression382 = null;
      jvmBasicParser.expression_return expression384 = null;
      CommonTree LEFT380_tree = null;
      CommonTree LPAREN381_tree = null;
      CommonTree COMMA383_tree = null;
      CommonTree RPAREN385_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:9: ( LEFT ^ LPAREN expression COMMA expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:11: LEFT ^ LPAREN expression COMMA expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            LEFT380 = (Token) match(input, LEFT, FOLLOW_LEFT_in_leftfunc2477);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LEFT380_tree = (CommonTree) adaptor.create(LEFT380);
               root_0 = (CommonTree) adaptor.becomeRoot(LEFT380_tree, root_0);
            }
            LPAREN381 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_leftfunc2480);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN381_tree = (CommonTree) adaptor.create(LPAREN381);
               adaptor.addChild(root_0, LPAREN381_tree);
            }
            pushFollow(FOLLOW_expression_in_leftfunc2482);
            expression382 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression382.getTree());
            }
            COMMA383 = (Token) match(input, COMMA, FOLLOW_COMMA_in_leftfunc2484);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA383_tree = (CommonTree) adaptor.create(COMMA383);
               adaptor.addChild(root_0, COMMA383_tree);
            }
            pushFollow(FOLLOW_expression_in_leftfunc2486);
            expression384 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression384.getTree());
            }
            RPAREN385 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_leftfunc2488);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN385_tree = (CommonTree) adaptor.create(RPAREN385);
               adaptor.addChild(root_0, RPAREN385_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "leftfunc"
   // $ANTLR start "lenfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:1: lenfunc : LEN ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.lenfunc_return lenfunc() throws RecognitionException {
      final jvmBasicParser.lenfunc_return retval = new jvmBasicParser.lenfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LEN336 = null;
      Token LPAREN337 = null;
      Token RPAREN339 = null;
      jvmBasicParser.expression_return expression338 = null;
      CommonTree LEN336_tree = null;
      CommonTree LPAREN337_tree = null;
      CommonTree RPAREN339_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:9: ( LEN ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:11: LEN ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            LEN336 = (Token) match(input, LEN, FOLLOW_LEN_in_lenfunc2330);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LEN336_tree = (CommonTree) adaptor.create(LEN336);
               root_0 = (CommonTree) adaptor.becomeRoot(LEN336_tree, root_0);
            }
            LPAREN337 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_lenfunc2333);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN337_tree = (CommonTree) adaptor.create(LPAREN337);
               adaptor.addChild(root_0, LPAREN337_tree);
            }
            pushFollow(FOLLOW_expression_in_lenfunc2335);
            expression338 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression338.getTree());
            }
            RPAREN339 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_lenfunc2337);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN339_tree = (CommonTree) adaptor.create(RPAREN339);
               adaptor.addChild(root_0, RPAREN339_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "lenfunc"
   // $ANTLR start "letstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:147:1: letstmt : ( LET ^)? variableassignment ;
   public final jvmBasicParser.letstmt_return letstmt() throws RecognitionException {
      final jvmBasicParser.letstmt_return retval = new jvmBasicParser.letstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LET86 = null;
      jvmBasicParser.variableassignment_return variableassignment87 = null;
      CommonTree LET86_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:147:9: ( ( LET ^)? variableassignment )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:147:11: ( LET ^)? variableassignment
         {
            root_0 = (CommonTree) adaptor.nil();
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:147:14: ( LET ^)?
            int alt10 = 2;
            switch (input.LA(1)) {
               case LET: {
                  alt10 = 1;
               }
                  break;
            }
            switch (alt10) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:147:14: LET ^
               {
                  LET86 = (Token) match(input, LET, FOLLOW_LET_in_letstmt1318);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     LET86_tree = (CommonTree) adaptor.create(LET86);
                     root_0 = (CommonTree) adaptor.becomeRoot(LET86_tree, root_0);
                  }
               }
                  break;
            }
            pushFollow(FOLLOW_variableassignment_in_letstmt1322);
            variableassignment87 = variableassignment();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, variableassignment87.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "letstmt"
   // $ANTLR start "line"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:138:1: line : linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !;
   public final jvmBasicParser.line_return line() throws RecognitionException {
      final jvmBasicParser.line_return retval = new jvmBasicParser.line_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token COLON4 = null;
      Token set6 = null;
      jvmBasicParser.linenumber_return linenumber2 = null;
      jvmBasicParser.amprstmt_return amprstmt3 = null;
      jvmBasicParser.amprstmt_return amprstmt5 = null;
      CommonTree COLON4_tree = null;
      final CommonTree set6_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:138:6: ( linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !)
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:138:8: linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_linenumber_in_line984);
            linenumber2 = linenumber();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               root_0 = (CommonTree) adaptor.becomeRoot(linenumber2.getTree(), root_0);
            }
            pushFollow(FOLLOW_amprstmt_in_line988);
            amprstmt3 = amprstmt();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, amprstmt3.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:138:30: ( COLON ( amprstmt )? )*
            loop3: do {
               int alt3 = 2;
               switch (input.LA(1)) {
                  case COLON: {
                     alt3 = 1;
                  }
                     break;
               }
               switch (alt3) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:138:31: COLON ( amprstmt )?
                  {
                     COLON4 = (Token) match(input, COLON, FOLLOW_COLON_in_line991);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        COLON4_tree = (CommonTree) adaptor.create(COLON4);
                        adaptor.addChild(root_0, COLON4_tree);
                     }
                     // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:138:37: ( amprstmt )?
                     int alt2 = 2;
                     switch (input.LA(1)) {
                        case AMPERSAND:
                        case CALL:
                        case CLEAR:
                        case COLOR:
                        case DATA:
                        case DEF:
                        case DIM:
                        case DRAW:
                        case END:
                        case FLASH:
                        case FOR:
                        case GET:
                        case GOSUB:
                        case GOTO:
                        case GR:
                        case HCOLOR:
                        case HGR:
                        case HGR2:
                        case HIMEM:
                        case HLIN:
                        case HOME:
                        case HPLOT:
                        case HTAB:
                        case IF:
                        case INNUMBER:
                        case INPUT:
                        case INVERSE:
                        case LET:
                        case LETTERS:
                        case LIST:
                        case LOAD:
                        case LOMEM:
                        case NEXT:
                        case NORMAL:
                        case NOTRACE:
                        case ON:
                        case ONERR:
                        case PLOT:
                        case POKE:
                        case POP:
                        case PRINT:
                        case PRNUMBER:
                        case QUESTION:
                        case READ:
                        case RECALL:
                        case REM:
                        case RESTORE:
                        case RETURN:
                        case ROT:
                        case RUN:
                        case SAVE:
                        case SCALE:
                        case SHLOAD:
                        case SPEED:
                        case STOP:
                        case STORE:
                        case TAB:
                        case TEXT:
                        case TRACE:
                        case VLIN:
                        case VPLOT:
                        case VTAB:
                        case WAIT:
                        case XDRAW: {
                           alt2 = 1;
                        }
                           break;
                     }
                     switch (alt2) {
                        case 1:
                        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:138:37: amprstmt
                        {
                           pushFollow(FOLLOW_amprstmt_in_line993);
                           amprstmt5 = amprstmt();
                           state._fsp--;
                           if (state.failed) {
                              return retval;
                           }
                           if (state.backtracking == 0) {
                              adaptor.addChild(root_0, amprstmt5.getTree());
                           }
                        }
                           break;
                     }
                  }
                     break;
                  default:
                     break loop3;
               }
            } while (true);
            set6 = (Token) input.LT(1);
            if ((input.LA(1) == EOF) || (input.LA(1) == CR)) {
               input.consume();
               state.errorRecovery = false;
               state.failed = false;
            } else {
               if (state.backtracking > 0) {
                  state.failed = true;
                  return retval;
               }
               final MismatchedSetException mse = new MismatchedSetException(null, input);
               throw mse;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "line"
   // $ANTLR start "linenumber"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:140:1: linenumber : NUMBER ;
   public final jvmBasicParser.linenumber_return linenumber() throws RecognitionException {
      final jvmBasicParser.linenumber_return retval = new jvmBasicParser.linenumber_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token NUMBER8 = null;
      CommonTree NUMBER8_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:140:11: ( NUMBER )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:140:13: NUMBER
         {
            root_0 = (CommonTree) adaptor.nil();
            NUMBER8 = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_linenumber1017);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               NUMBER8_tree = (CommonTree) adaptor.create(NUMBER8);
               adaptor.addChild(root_0, NUMBER8_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "linenumber"
   // $ANTLR start "liststmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:1: liststmt : LIST expression ;
   public final jvmBasicParser.liststmt_return liststmt() throws RecognitionException {
      final jvmBasicParser.liststmt_return retval = new jvmBasicParser.liststmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LIST257 = null;
      jvmBasicParser.expression_return expression258 = null;
      CommonTree LIST257_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:9: ( LIST expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:11: LIST expression
         {
            root_0 = (CommonTree) adaptor.nil();
            LIST257 = (Token) match(input, LIST, FOLLOW_LIST_in_liststmt1954);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LIST257_tree = (CommonTree) adaptor.create(LIST257);
               adaptor.addChild(root_0, LIST257_tree);
            }
            pushFollow(FOLLOW_expression_in_liststmt1956);
            expression258 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression258.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "liststmt"
   // $ANTLR start "logfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:1: logfunc : LOG ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.logfunc_return logfunc() throws RecognitionException {
      final jvmBasicParser.logfunc_return retval = new jvmBasicParser.logfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LOG439 = null;
      Token LPAREN440 = null;
      Token RPAREN442 = null;
      jvmBasicParser.expression_return expression441 = null;
      CommonTree LOG439_tree = null;
      CommonTree LPAREN440_tree = null;
      CommonTree RPAREN442_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:9: ( LOG ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:11: LOG ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            LOG439 = (Token) match(input, LOG, FOLLOW_LOG_in_logfunc2670);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LOG439_tree = (CommonTree) adaptor.create(LOG439);
               root_0 = (CommonTree) adaptor.becomeRoot(LOG439_tree, root_0);
            }
            LPAREN440 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_logfunc2673);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN440_tree = (CommonTree) adaptor.create(LPAREN440);
               adaptor.addChild(root_0, LPAREN440_tree);
            }
            pushFollow(FOLLOW_expression_in_logfunc2675);
            expression441 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression441.getTree());
            }
            RPAREN442 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_logfunc2677);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN442_tree = (CommonTree) adaptor.create(RPAREN442);
               adaptor.addChild(root_0, RPAREN442_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "logfunc"
   // $ANTLR start "lomemstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:1: lomemstmt : LOMEM COLON expression ;
   public final jvmBasicParser.lomemstmt_return lomemstmt() throws RecognitionException {
      final jvmBasicParser.lomemstmt_return retval = new jvmBasicParser.lomemstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LOMEM182 = null;
      Token COLON183 = null;
      jvmBasicParser.expression_return expression184 = null;
      CommonTree LOMEM182_tree = null;
      CommonTree COLON183_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:10: ( LOMEM COLON expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:12: LOMEM COLON expression
         {
            root_0 = (CommonTree) adaptor.nil();
            LOMEM182 = (Token) match(input, LOMEM, FOLLOW_LOMEM_in_lomemstmt1714);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LOMEM182_tree = (CommonTree) adaptor.create(LOMEM182);
               adaptor.addChild(root_0, LOMEM182_tree);
            }
            COLON183 = (Token) match(input, COLON, FOLLOW_COLON_in_lomemstmt1716);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COLON183_tree = (CommonTree) adaptor.create(COLON183);
               adaptor.addChild(root_0, COLON183_tree);
            }
            pushFollow(FOLLOW_expression_in_lomemstmt1718);
            expression184 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression184.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "lomemstmt"
   // $ANTLR start "lte"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:1: lte : ( LTE | ( LT EQ ) | ( EQ LT ) );
   public final jvmBasicParser.lte_return lte() throws RecognitionException {
      final jvmBasicParser.lte_return retval = new jvmBasicParser.lte_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LTE102 = null;
      Token LT103 = null;
      Token EQ104 = null;
      Token EQ105 = null;
      Token LT106 = null;
      CommonTree LTE102_tree = null;
      CommonTree LT103_tree = null;
      CommonTree EQ104_tree = null;
      CommonTree EQ105_tree = null;
      CommonTree LT106_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:5: ( LTE | ( LT EQ ) | ( EQ LT ) )
         int alt13 = 3;
         switch (input.LA(1)) {
            case LTE: {
               alt13 = 1;
            }
               break;
            case LT: {
               alt13 = 2;
            }
               break;
            case EQ: {
               alt13 = 3;
            }
               break;
            default:
               if (state.backtracking > 0) {
                  state.failed = true;
                  return retval;
               }
               final NoViableAltException nvae = new NoViableAltException("", 13, 0, input);
               throw nvae;
         }
         switch (alt13) {
            case 1:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:7: LTE
            {
               root_0 = (CommonTree) adaptor.nil();
               LTE102 = (Token) match(input, LTE, FOLLOW_LTE_in_lte1394);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  LTE102_tree = (CommonTree) adaptor.create(LTE102);
                  adaptor.addChild(root_0, LTE102_tree);
               }
            }
               break;
            case 2:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:13: ( LT EQ )
            {
               root_0 = (CommonTree) adaptor.nil();
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:13: ( LT EQ )
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:14: LT EQ
               {
                  LT103 = (Token) match(input, LT, FOLLOW_LT_in_lte1399);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     LT103_tree = (CommonTree) adaptor.create(LT103);
                     adaptor.addChild(root_0, LT103_tree);
                  }
                  EQ104 = (Token) match(input, EQ, FOLLOW_EQ_in_lte1401);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     EQ104_tree = (CommonTree) adaptor.create(EQ104);
                     adaptor.addChild(root_0, EQ104_tree);
                  }
               }
            }
               break;
            case 3:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:23: ( EQ LT )
            {
               root_0 = (CommonTree) adaptor.nil();
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:23: ( EQ LT )
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:151:24: EQ LT
               {
                  EQ105 = (Token) match(input, EQ, FOLLOW_EQ_in_lte1407);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     EQ105_tree = (CommonTree) adaptor.create(EQ105);
                     adaptor.addChild(root_0, EQ105_tree);
                  }
                  LT106 = (Token) match(input, LT, FOLLOW_LT_in_lte1409);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     LT106_tree = (CommonTree) adaptor.create(LT106);
                     adaptor.addChild(root_0, LT106_tree);
                  }
               }
            }
               break;
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "lte"
   // $ANTLR start "midfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:1: midfunc : MID ^ LPAREN expression COMMA expression COMMA expression RPAREN ;
   public final jvmBasicParser.midfunc_return midfunc() throws RecognitionException {
      final jvmBasicParser.midfunc_return retval = new jvmBasicParser.midfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token MID344 = null;
      Token LPAREN345 = null;
      Token COMMA347 = null;
      Token COMMA349 = null;
      Token RPAREN351 = null;
      jvmBasicParser.expression_return expression346 = null;
      jvmBasicParser.expression_return expression348 = null;
      jvmBasicParser.expression_return expression350 = null;
      CommonTree MID344_tree = null;
      CommonTree LPAREN345_tree = null;
      CommonTree COMMA347_tree = null;
      CommonTree COMMA349_tree = null;
      CommonTree RPAREN351_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:9: ( MID ^ LPAREN expression COMMA expression COMMA expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:11: MID ^ LPAREN expression COMMA expression COMMA expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            MID344 = (Token) match(input, MID, FOLLOW_MID_in_midfunc2359);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               MID344_tree = (CommonTree) adaptor.create(MID344);
               root_0 = (CommonTree) adaptor.becomeRoot(MID344_tree, root_0);
            }
            LPAREN345 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_midfunc2362);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN345_tree = (CommonTree) adaptor.create(LPAREN345);
               adaptor.addChild(root_0, LPAREN345_tree);
            }
            pushFollow(FOLLOW_expression_in_midfunc2364);
            expression346 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression346.getTree());
            }
            COMMA347 = (Token) match(input, COMMA, FOLLOW_COMMA_in_midfunc2366);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA347_tree = (CommonTree) adaptor.create(COMMA347);
               adaptor.addChild(root_0, COMMA347_tree);
            }
            pushFollow(FOLLOW_expression_in_midfunc2368);
            expression348 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression348.getTree());
            }
            COMMA349 = (Token) match(input, COMMA, FOLLOW_COMMA_in_midfunc2370);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA349_tree = (CommonTree) adaptor.create(COMMA349);
               adaptor.addChild(root_0, COMMA349_tree);
            }
            pushFollow(FOLLOW_expression_in_midfunc2372);
            expression350 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression350.getTree());
            }
            RPAREN351 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_midfunc2374);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN351_tree = (CommonTree) adaptor.create(RPAREN351);
               adaptor.addChild(root_0, RPAREN351_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "midfunc"
   // $ANTLR start "multiplyingExpression"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:1: multiplyingExpression : exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )* ;
   public final jvmBasicParser.multiplyingExpression_return multiplyingExpression() throws RecognitionException {
      final jvmBasicParser.multiplyingExpression_return retval = new jvmBasicParser.multiplyingExpression_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token set305 = null;
      jvmBasicParser.exponentExpression_return exponentExpression304 = null;
      jvmBasicParser.exponentExpression_return exponentExpression306 = null;
      final CommonTree set305_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:24: ( exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:26: exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_exponentExpression_in_multiplyingExpression2141);
            exponentExpression304 = exponentExpression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, exponentExpression304.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:45: ( ( TIMES | DIV ) ^ exponentExpression )*
            loop35: do {
               int alt35 = 2;
               switch (input.LA(1)) {
                  case DIV:
                  case TIMES: {
                     alt35 = 1;
                  }
                     break;
               }
               switch (alt35) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:46: ( TIMES | DIV ) ^ exponentExpression
                  {
                     set305 = (Token) input.LT(1);
                     set305 = (Token) input.LT(1);
                     if ((input.LA(1) == DIV) || (input.LA(1) == TIMES)) {
                        input.consume();
                        if (state.backtracking == 0) {
                           root_0 = (CommonTree) adaptor.becomeRoot((CommonTree) adaptor.create(set305), root_0);
                        }
                        state.errorRecovery = false;
                        state.failed = false;
                     } else {
                        if (state.backtracking > 0) {
                           state.failed = true;
                           return retval;
                        }
                        final MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                     }
                     pushFollow(FOLLOW_exponentExpression_in_multiplyingExpression2151);
                     exponentExpression306 = exponentExpression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, exponentExpression306.getTree());
                     }
                  }
                     break;
                  default:
                     break loop35;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "multiplyingExpression"
   // $ANTLR start "neq"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:152:1: neq : LT GT ;
   public final jvmBasicParser.neq_return neq() throws RecognitionException {
      final jvmBasicParser.neq_return retval = new jvmBasicParser.neq_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LT107 = null;
      Token GT108 = null;
      CommonTree LT107_tree = null;
      CommonTree GT108_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:152:5: ( LT GT )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:152:7: LT GT
         {
            root_0 = (CommonTree) adaptor.nil();
            LT107 = (Token) match(input, LT, FOLLOW_LT_in_neq1417);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LT107_tree = (CommonTree) adaptor.create(LT107);
               adaptor.addChild(root_0, LT107_tree);
            }
            GT108 = (Token) match(input, GT, FOLLOW_GT_in_neq1419);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               GT108_tree = (CommonTree) adaptor.create(GT108);
               adaptor.addChild(root_0, GT108_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "neq"
   // $ANTLR start "nextstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:1: nextstmt : NEXT ^ ( varlist )? ;
   public final jvmBasicParser.nextstmt_return nextstmt() throws RecognitionException {
      final jvmBasicParser.nextstmt_return retval = new jvmBasicParser.nextstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token NEXT121 = null;
      jvmBasicParser.varlist_return varlist122 = null;
      CommonTree NEXT121_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:10: ( NEXT ^ ( varlist )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:12: NEXT ^ ( varlist )?
         {
            root_0 = (CommonTree) adaptor.nil();
            NEXT121 = (Token) match(input, NEXT, FOLLOW_NEXT_in_nextstmt1468);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               NEXT121_tree = (CommonTree) adaptor.create(NEXT121);
               root_0 = (CommonTree) adaptor.becomeRoot(NEXT121_tree, root_0);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:18: ( varlist )?
            int alt16 = 2;
            switch (input.LA(1)) {
               case LETTERS: {
                  alt16 = 1;
               }
                  break;
            }
            switch (alt16) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:18: varlist
               {
                  pushFollow(FOLLOW_varlist_in_nextstmt1471);
                  varlist122 = varlist();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, varlist122.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "nextstmt"
   // $ANTLR start "onerrstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:1: onerrstmt : ONERR GOTO linenumber ;
   public final jvmBasicParser.onerrstmt_return onerrstmt() throws RecognitionException {
      final jvmBasicParser.onerrstmt_return retval = new jvmBasicParser.onerrstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token ONERR246 = null;
      Token GOTO247 = null;
      jvmBasicParser.linenumber_return linenumber248 = null;
      CommonTree ONERR246_tree = null;
      CommonTree GOTO247_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:10: ( ONERR GOTO linenumber )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:12: ONERR GOTO linenumber
         {
            root_0 = (CommonTree) adaptor.nil();
            ONERR246 = (Token) match(input, ONERR, FOLLOW_ONERR_in_onerrstmt1912);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               ONERR246_tree = (CommonTree) adaptor.create(ONERR246);
               adaptor.addChild(root_0, ONERR246_tree);
            }
            GOTO247 = (Token) match(input, GOTO, FOLLOW_GOTO_in_onerrstmt1914);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               GOTO247_tree = (CommonTree) adaptor.create(GOTO247);
               adaptor.addChild(root_0, GOTO247_tree);
            }
            pushFollow(FOLLOW_linenumber_in_onerrstmt1916);
            linenumber248 = linenumber();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, linenumber248.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "onerrstmt"
   // $ANTLR start "ongosubstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:1: ongosubstmt : ON expression GOSUB linenumber ( COMMA linenumber )* ;
   public final jvmBasicParser.ongosubstmt_return ongosubstmt() throws RecognitionException {
      final jvmBasicParser.ongosubstmt_return retval = new jvmBasicParser.ongosubstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token ON169 = null;
      Token GOSUB171 = null;
      Token COMMA173 = null;
      jvmBasicParser.expression_return expression170 = null;
      jvmBasicParser.linenumber_return linenumber172 = null;
      jvmBasicParser.linenumber_return linenumber174 = null;
      CommonTree ON169_tree = null;
      CommonTree GOSUB171_tree = null;
      CommonTree COMMA173_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:13: ( ON expression GOSUB linenumber ( COMMA linenumber )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:15: ON expression GOSUB linenumber ( COMMA linenumber )*
         {
            root_0 = (CommonTree) adaptor.nil();
            ON169 = (Token) match(input, ON, FOLLOW_ON_in_ongosubstmt1667);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               ON169_tree = (CommonTree) adaptor.create(ON169);
               adaptor.addChild(root_0, ON169_tree);
            }
            pushFollow(FOLLOW_expression_in_ongosubstmt1669);
            expression170 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression170.getTree());
            }
            GOSUB171 = (Token) match(input, GOSUB, FOLLOW_GOSUB_in_ongosubstmt1671);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               GOSUB171_tree = (CommonTree) adaptor.create(GOSUB171);
               adaptor.addChild(root_0, GOSUB171_tree);
            }
            pushFollow(FOLLOW_linenumber_in_ongosubstmt1673);
            linenumber172 = linenumber();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, linenumber172.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:46: ( COMMA linenumber )*
            loop24: do {
               int alt24 = 2;
               switch (input.LA(1)) {
                  case COMMA: {
                     alt24 = 1;
                  }
                     break;
               }
               switch (alt24) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:47: COMMA linenumber
                  {
                     COMMA173 = (Token) match(input, COMMA, FOLLOW_COMMA_in_ongosubstmt1676);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        COMMA173_tree = (CommonTree) adaptor.create(COMMA173);
                        adaptor.addChild(root_0, COMMA173_tree);
                     }
                     pushFollow(FOLLOW_linenumber_in_ongosubstmt1678);
                     linenumber174 = linenumber();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, linenumber174.getTree());
                     }
                  }
                     break;
                  default:
                     break loop24;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "ongosubstmt"
   // $ANTLR start "ongotostmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:1: ongotostmt : ON expression GOTO linenumber ( COMMA linenumber )* ;
   public final jvmBasicParser.ongotostmt_return ongotostmt() throws RecognitionException {
      final jvmBasicParser.ongotostmt_return retval = new jvmBasicParser.ongotostmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token ON163 = null;
      Token GOTO165 = null;
      Token COMMA167 = null;
      jvmBasicParser.expression_return expression164 = null;
      jvmBasicParser.linenumber_return linenumber166 = null;
      jvmBasicParser.linenumber_return linenumber168 = null;
      CommonTree ON163_tree = null;
      CommonTree GOTO165_tree = null;
      CommonTree COMMA167_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:12: ( ON expression GOTO linenumber ( COMMA linenumber )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:14: ON expression GOTO linenumber ( COMMA linenumber )*
         {
            root_0 = (CommonTree) adaptor.nil();
            ON163 = (Token) match(input, ON, FOLLOW_ON_in_ongotostmt1647);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               ON163_tree = (CommonTree) adaptor.create(ON163);
               adaptor.addChild(root_0, ON163_tree);
            }
            pushFollow(FOLLOW_expression_in_ongotostmt1649);
            expression164 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression164.getTree());
            }
            GOTO165 = (Token) match(input, GOTO, FOLLOW_GOTO_in_ongotostmt1651);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               GOTO165_tree = (CommonTree) adaptor.create(GOTO165);
               adaptor.addChild(root_0, GOTO165_tree);
            }
            pushFollow(FOLLOW_linenumber_in_ongotostmt1653);
            linenumber166 = linenumber();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, linenumber166.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:44: ( COMMA linenumber )*
            loop23: do {
               int alt23 = 2;
               switch (input.LA(1)) {
                  case COMMA: {
                     alt23 = 1;
                  }
                     break;
               }
               switch (alt23) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:45: COMMA linenumber
                  {
                     COMMA167 = (Token) match(input, COMMA, FOLLOW_COMMA_in_ongotostmt1656);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        COMMA167_tree = (CommonTree) adaptor.create(COMMA167);
                        adaptor.addChild(root_0, COMMA167_tree);
                     }
                     pushFollow(FOLLOW_linenumber_in_ongotostmt1658);
                     linenumber168 = linenumber();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, linenumber168.getTree());
                     }
                  }
                     break;
                  default:
                     break loop23;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "ongotostmt"
   // $ANTLR start "pdlfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:1: pdlfunc : PDL ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.pdlfunc_return pdlfunc() throws RecognitionException {
      final jvmBasicParser.pdlfunc_return retval = new jvmBasicParser.pdlfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token PDL352 = null;
      Token LPAREN353 = null;
      Token RPAREN355 = null;
      jvmBasicParser.expression_return expression354 = null;
      CommonTree PDL352_tree = null;
      CommonTree LPAREN353_tree = null;
      CommonTree RPAREN355_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:9: ( PDL ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:11: PDL ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            PDL352 = (Token) match(input, PDL, FOLLOW_PDL_in_pdlfunc2381);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               PDL352_tree = (CommonTree) adaptor.create(PDL352);
               root_0 = (CommonTree) adaptor.becomeRoot(PDL352_tree, root_0);
            }
            LPAREN353 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_pdlfunc2384);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN353_tree = (CommonTree) adaptor.create(LPAREN353);
               adaptor.addChild(root_0, LPAREN353_tree);
            }
            pushFollow(FOLLOW_expression_in_pdlfunc2386);
            expression354 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression354.getTree());
            }
            RPAREN355 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_pdlfunc2388);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN355_tree = (CommonTree) adaptor.create(RPAREN355);
               adaptor.addChild(root_0, RPAREN355_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "pdlfunc"
   // $ANTLR start "peekfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:1: peekfunc : PEEK ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.peekfunc_return peekfunc() throws RecognitionException {
      final jvmBasicParser.peekfunc_return retval = new jvmBasicParser.peekfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token PEEK356 = null;
      Token LPAREN357 = null;
      Token RPAREN359 = null;
      jvmBasicParser.expression_return expression358 = null;
      CommonTree PEEK356_tree = null;
      CommonTree LPAREN357_tree = null;
      CommonTree RPAREN359_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:9: ( PEEK ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:11: PEEK ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            PEEK356 = (Token) match(input, PEEK, FOLLOW_PEEK_in_peekfunc2394);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               PEEK356_tree = (CommonTree) adaptor.create(PEEK356);
               root_0 = (CommonTree) adaptor.becomeRoot(PEEK356_tree, root_0);
            }
            LPAREN357 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_peekfunc2397);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN357_tree = (CommonTree) adaptor.create(LPAREN357);
               adaptor.addChild(root_0, LPAREN357_tree);
            }
            pushFollow(FOLLOW_expression_in_peekfunc2399);
            expression358 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression358.getTree());
            }
            RPAREN359 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_peekfunc2401);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN359_tree = (CommonTree) adaptor.create(RPAREN359);
               adaptor.addChild(root_0, RPAREN359_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "peekfunc"
   // $ANTLR start "plotstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:1: plotstmt : PLOT expression COMMA expression ;
   public final jvmBasicParser.plotstmt_return plotstmt() throws RecognitionException {
      final jvmBasicParser.plotstmt_return retval = new jvmBasicParser.plotstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token PLOT159 = null;
      Token COMMA161 = null;
      jvmBasicParser.expression_return expression160 = null;
      jvmBasicParser.expression_return expression162 = null;
      CommonTree PLOT159_tree = null;
      CommonTree COMMA161_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:9: ( PLOT expression COMMA expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:11: PLOT expression COMMA expression
         {
            root_0 = (CommonTree) adaptor.nil();
            PLOT159 = (Token) match(input, PLOT, FOLLOW_PLOT_in_plotstmt1634);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               PLOT159_tree = (CommonTree) adaptor.create(PLOT159);
               adaptor.addChild(root_0, PLOT159_tree);
            }
            pushFollow(FOLLOW_expression_in_plotstmt1636);
            expression160 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression160.getTree());
            }
            COMMA161 = (Token) match(input, COMMA, FOLLOW_COMMA_in_plotstmt1638);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA161_tree = (CommonTree) adaptor.create(COMMA161);
               adaptor.addChild(root_0, COMMA161_tree);
            }
            pushFollow(FOLLOW_expression_in_plotstmt1640);
            expression162 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression162.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "plotstmt"
   // $ANTLR start "pokestmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:1: pokestmt : POKE expression COMMA expression ;
   public final jvmBasicParser.pokestmt_return pokestmt() throws RecognitionException {
      final jvmBasicParser.pokestmt_return retval = new jvmBasicParser.pokestmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token POKE135 = null;
      Token COMMA137 = null;
      jvmBasicParser.expression_return expression136 = null;
      jvmBasicParser.expression_return expression138 = null;
      CommonTree POKE135_tree = null;
      CommonTree COMMA137_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:9: ( POKE expression COMMA expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:11: POKE expression COMMA expression
         {
            root_0 = (CommonTree) adaptor.nil();
            POKE135 = (Token) match(input, POKE, FOLLOW_POKE_in_pokestmt1536);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               POKE135_tree = (CommonTree) adaptor.create(POKE135);
               adaptor.addChild(root_0, POKE135_tree);
            }
            pushFollow(FOLLOW_expression_in_pokestmt1538);
            expression136 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression136.getTree());
            }
            COMMA137 = (Token) match(input, COMMA, FOLLOW_COMMA_in_pokestmt1540);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA137_tree = (CommonTree) adaptor.create(COMMA137);
               adaptor.addChild(root_0, COMMA137_tree);
            }
            pushFollow(FOLLOW_expression_in_pokestmt1542);
            expression138 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression138.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "pokestmt"
   // $ANTLR start "popstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:1: popstmt : POP ( expression COMMA expression )? ;
   public final jvmBasicParser.popstmt_return popstmt() throws RecognitionException {
      final jvmBasicParser.popstmt_return retval = new jvmBasicParser.popstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token POP259 = null;
      Token COMMA261 = null;
      jvmBasicParser.expression_return expression260 = null;
      jvmBasicParser.expression_return expression262 = null;
      CommonTree POP259_tree = null;
      CommonTree COMMA261_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:9: ( POP ( expression COMMA expression )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:11: POP ( expression COMMA expression )?
         {
            root_0 = (CommonTree) adaptor.nil();
            POP259 = (Token) match(input, POP, FOLLOW_POP_in_popstmt1963);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               POP259_tree = (CommonTree) adaptor.create(POP259);
               adaptor.addChild(root_0, POP259_tree);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:15: ( expression COMMA expression )?
            int alt30 = 2;
            switch (input.LA(1)) {
               case ABS:
               case ASC:
               case ATN:
               case CHR:
               case COS:
               case EXP:
               case FN:
               case FRE:
               case INTF:
               case LEFT:
               case LEN:
               case LETTERS:
               case LOG:
               case LPAREN:
               case MID:
               case MINUS:
               case NOT:
               case NUMBER:
               case PDL:
               case PEEK:
               case PLUS:
               case POS:
               case RIGHT:
               case RND:
               case SCRN:
               case SGN:
               case SIN:
               case SPC:
               case SQR:
               case STR:
               case STRINGLITERAL:
               case TAN:
               case USR:
               case VAL: {
                  alt30 = 1;
               }
                  break;
            }
            switch (alt30) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:16: expression COMMA expression
               {
                  pushFollow(FOLLOW_expression_in_popstmt1966);
                  expression260 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression260.getTree());
                  }
                  COMMA261 = (Token) match(input, COMMA, FOLLOW_COMMA_in_popstmt1968);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA261_tree = (CommonTree) adaptor.create(COMMA261);
                     adaptor.addChild(root_0, COMMA261_tree);
                  }
                  pushFollow(FOLLOW_expression_in_popstmt1970);
                  expression262 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression262.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "popstmt"
   // $ANTLR start "posfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:226:1: posfunc : POS ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.posfunc_return posfunc() throws RecognitionException {
      final jvmBasicParser.posfunc_return retval = new jvmBasicParser.posfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token POS372 = null;
      Token LPAREN373 = null;
      Token RPAREN375 = null;
      jvmBasicParser.expression_return expression374 = null;
      CommonTree POS372_tree = null;
      CommonTree LPAREN373_tree = null;
      CommonTree RPAREN375_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:226:8: ( POS ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:226:11: POS ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            POS372 = (Token) match(input, POS, FOLLOW_POS_in_posfunc2450);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               POS372_tree = (CommonTree) adaptor.create(POS372);
               root_0 = (CommonTree) adaptor.becomeRoot(POS372_tree, root_0);
            }
            LPAREN373 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_posfunc2453);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN373_tree = (CommonTree) adaptor.create(LPAREN373);
               adaptor.addChild(root_0, LPAREN373_tree);
            }
            pushFollow(FOLLOW_expression_in_posfunc2455);
            expression374 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression374.getTree());
            }
            RPAREN375 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_posfunc2457);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN375_tree = (CommonTree) adaptor.create(RPAREN375);
               adaptor.addChild(root_0, RPAREN375_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "posfunc"
   // $ANTLR start "printlist"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:1: printlist : expression ( COMMA ^| SEMICOLON ^)? ( printlist )* ;
   public final jvmBasicParser.printlist_return printlist() throws RecognitionException {
      final jvmBasicParser.printlist_return retval = new jvmBasicParser.printlist_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token COMMA81 = null;
      Token SEMICOLON82 = null;
      jvmBasicParser.expression_return expression80 = null;
      jvmBasicParser.printlist_return printlist83 = null;
      CommonTree COMMA81_tree = null;
      CommonTree SEMICOLON82_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:11: ( expression ( COMMA ^| SEMICOLON ^)? ( printlist )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:13: expression ( COMMA ^| SEMICOLON ^)? ( printlist )*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_expression_in_printlist1286);
            expression80 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression80.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:24: ( COMMA ^| SEMICOLON ^)?
            int alt8 = 3;
            switch (input.LA(1)) {
               case COMMA: {
                  alt8 = 1;
               }
                  break;
               case SEMICOLON: {
                  alt8 = 2;
               }
                  break;
            }
            switch (alt8) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:25: COMMA ^
               {
                  COMMA81 = (Token) match(input, COMMA, FOLLOW_COMMA_in_printlist1289);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA81_tree = (CommonTree) adaptor.create(COMMA81);
                     root_0 = (CommonTree) adaptor.becomeRoot(COMMA81_tree, root_0);
                  }
               }
                  break;
               case 2:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:34: SEMICOLON ^
               {
                  SEMICOLON82 = (Token) match(input, SEMICOLON, FOLLOW_SEMICOLON_in_printlist1294);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     SEMICOLON82_tree = (CommonTree) adaptor.create(SEMICOLON82);
                     root_0 = (CommonTree) adaptor.becomeRoot(SEMICOLON82_tree, root_0);
                  }
               }
                  break;
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:47: ( printlist )*
            loop9: do {
               int alt9 = 2;
               switch (input.LA(1)) {
                  case ABS:
                  case ASC:
                  case ATN:
                  case CHR:
                  case COS:
                  case EXP:
                  case FN:
                  case FRE:
                  case INTF:
                  case LEFT:
                  case LEN:
                  case LETTERS:
                  case LOG:
                  case LPAREN:
                  case MID:
                  case MINUS:
                  case NOT:
                  case NUMBER:
                  case PDL:
                  case PEEK:
                  case PLUS:
                  case POS:
                  case RIGHT:
                  case RND:
                  case SCRN:
                  case SGN:
                  case SIN:
                  case SPC:
                  case SQR:
                  case STR:
                  case STRINGLITERAL:
                  case TAN:
                  case USR:
                  case VAL: {
                     final int LA9_1 = input.LA(2);
                     if ((synpred73_jvmBasic())) {
                        alt9 = 1;
                     }
                  }
                     break;
               }
               switch (alt9) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:47: printlist
                  {
                     pushFollow(FOLLOW_printlist_in_printlist1299);
                     printlist83 = printlist();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, printlist83.getTree());
                     }
                  }
                     break;
                  default:
                     break loop9;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "printlist"
   // $ANTLR start "printstmt1"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:144:1: printstmt1 : ( PRINT | QUESTION ) ^ ( printlist )? ;
   public final jvmBasicParser.printstmt1_return printstmt1() throws RecognitionException {
      final jvmBasicParser.printstmt1_return retval = new jvmBasicParser.printstmt1_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token set78 = null;
      jvmBasicParser.printlist_return printlist79 = null;
      final CommonTree set78_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:144:11: ( ( PRINT | QUESTION ) ^ ( printlist )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:144:13: ( PRINT | QUESTION ) ^ ( printlist )?
         {
            root_0 = (CommonTree) adaptor.nil();
            set78 = (Token) input.LT(1);
            set78 = (Token) input.LT(1);
            if ((input.LA(1) == PRINT) || (input.LA(1) == QUESTION)) {
               input.consume();
               if (state.backtracking == 0) {
                  root_0 = (CommonTree) adaptor.becomeRoot((CommonTree) adaptor.create(set78), root_0);
               }
               state.errorRecovery = false;
               state.failed = false;
            } else {
               if (state.backtracking > 0) {
                  state.failed = true;
                  return retval;
               }
               final MismatchedSetException mse = new MismatchedSetException(null, input);
               throw mse;
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:144:33: ( printlist )?
            int alt7 = 2;
            switch (input.LA(1)) {
               case ABS:
               case ASC:
               case ATN:
               case CHR:
               case COS:
               case EXP:
               case FN:
               case FRE:
               case INTF:
               case LEFT:
               case LEN:
               case LETTERS:
               case LOG:
               case LPAREN:
               case MID:
               case MINUS:
               case NOT:
               case NUMBER:
               case PDL:
               case PEEK:
               case PLUS:
               case POS:
               case RIGHT:
               case RND:
               case SCRN:
               case SGN:
               case SIN:
               case SPC:
               case SQR:
               case STR:
               case STRINGLITERAL:
               case TAN:
               case USR:
               case VAL: {
                  alt7 = 1;
               }
                  break;
            }
            switch (alt7) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:144:33: printlist
               {
                  pushFollow(FOLLOW_printlist_in_printstmt11278);
                  printlist79 = printlist();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, printlist79.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "printstmt1"
   // $ANTLR start "prog"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:135:1: prog : ( line )+ ;
   public final jvmBasicParser.prog_return prog() throws RecognitionException {
      final jvmBasicParser.prog_return retval = new jvmBasicParser.prog_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      jvmBasicParser.line_return line1 = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:135:6: ( ( line )+ )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:135:8: ( line )+
         {
            root_0 = (CommonTree) adaptor.nil();
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:135:8: ( line )+
            int cnt1 = 0;
            loop1: do {
               int alt1 = 2;
               switch (input.LA(1)) {
                  case NUMBER: {
                     alt1 = 1;
                  }
                     break;
               }
               switch (alt1) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:135:8: line
                  {
                     pushFollow(FOLLOW_line_in_prog972);
                     line1 = line();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, line1.getTree());
                     }
                  }
                     break;
                  default:
                     if (cnt1 >= 1) {
                        break loop1;
                     }
                     if (state.backtracking > 0) {
                        state.failed = true;
                        return retval;
                     }
                     final EarlyExitException eee = new EarlyExitException(1, input);
                     throw eee;
               }
               cnt1++;
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "prog"
   // $ANTLR start "prstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:1: prstmt : PRNUMBER NUMBER ;
   public final jvmBasicParser.prstmt_return prstmt() throws RecognitionException {
      final jvmBasicParser.prstmt_return retval = new jvmBasicParser.prstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token PRNUMBER249 = null;
      Token NUMBER250 = null;
      CommonTree PRNUMBER249_tree = null;
      CommonTree NUMBER250_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:7: ( PRNUMBER NUMBER )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:9: PRNUMBER NUMBER
         {
            root_0 = (CommonTree) adaptor.nil();
            PRNUMBER249 = (Token) match(input, PRNUMBER, FOLLOW_PRNUMBER_in_prstmt1922);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               PRNUMBER249_tree = (CommonTree) adaptor.create(PRNUMBER249);
               adaptor.addChild(root_0, PRNUMBER249_tree);
            }
            NUMBER250 = (Token) match(input, NUMBER, FOLLOW_NUMBER_in_prstmt1924);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               NUMBER250_tree = (CommonTree) adaptor.create(NUMBER250);
               adaptor.addChild(root_0, NUMBER250_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "prstmt"
   // $ANTLR start "readstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:157:1: readstmt : READ ^ varlist ;
   public final jvmBasicParser.readstmt_return readstmt() throws RecognitionException {
      final jvmBasicParser.readstmt_return retval = new jvmBasicParser.readstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token READ127 = null;
      jvmBasicParser.varlist_return varlist128 = null;
      CommonTree READ127_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:157:9: ( READ ^ varlist )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:157:11: READ ^ varlist
         {
            root_0 = (CommonTree) adaptor.nil();
            READ127 = (Token) match(input, READ, FOLLOW_READ_in_readstmt1496);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               READ127_tree = (CommonTree) adaptor.create(READ127);
               root_0 = (CommonTree) adaptor.becomeRoot(READ127_tree, root_0);
            }
            pushFollow(FOLLOW_varlist_in_readstmt1499);
            varlist128 = varlist();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, varlist128.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "readstmt"
   // $ANTLR start "recallstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:1: recallstmt : RECALL vardecl ;
   public final jvmBasicParser.recallstmt_return recallstmt() throws RecognitionException {
      final jvmBasicParser.recallstmt_return retval = new jvmBasicParser.recallstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token RECALL255 = null;
      jvmBasicParser.vardecl_return vardecl256 = null;
      CommonTree RECALL255_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:11: ( RECALL vardecl )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:13: RECALL vardecl
         {
            root_0 = (CommonTree) adaptor.nil();
            RECALL255 = (Token) match(input, RECALL, FOLLOW_RECALL_in_recallstmt1946);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RECALL255_tree = (CommonTree) adaptor.create(RECALL255);
               adaptor.addChild(root_0, RECALL255_tree);
            }
            pushFollow(FOLLOW_vardecl_in_recallstmt1948);
            vardecl256 = vardecl();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, vardecl256.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "recallstmt"
   // $ANTLR start "relationalExpression"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:1: relationalExpression : addingExpression ( ( relop ^) addingExpression )* ;
   public final jvmBasicParser.relationalExpression_return relationalExpression() throws RecognitionException {
      final jvmBasicParser.relationalExpression_return retval = new jvmBasicParser.relationalExpression_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      jvmBasicParser.addingExpression_return addingExpression310 = null;
      jvmBasicParser.relop_return relop311 = null;
      jvmBasicParser.addingExpression_return addingExpression312 = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:23: ( addingExpression ( ( relop ^) addingExpression )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:25: addingExpression ( ( relop ^) addingExpression )*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_addingExpression_in_relationalExpression2180);
            addingExpression310 = addingExpression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, addingExpression310.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:42: ( ( relop ^) addingExpression )*
            loop37: do {
               int alt37 = 2;
               switch (input.LA(1)) {
                  case EQ:
                  case GT:
                  case GTE:
                  case LT:
                  case LTE: {
                     alt37 = 1;
                  }
                     break;
               }
               switch (alt37) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:43: ( relop ^) addingExpression
                  {
                     // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:43: ( relop ^)
                     // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:44: relop ^
                     {
                        pushFollow(FOLLOW_relop_in_relationalExpression2184);
                        relop311 = relop();
                        state._fsp--;
                        if (state.failed) {
                           return retval;
                        }
                        if (state.backtracking == 0) {
                           root_0 = (CommonTree) adaptor.becomeRoot(relop311.getTree(), root_0);
                        }
                     }
                     pushFollow(FOLLOW_addingExpression_in_relationalExpression2188);
                     addingExpression312 = addingExpression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, addingExpression312.getTree());
                     }
                  }
                     break;
                  default:
                     break loop37;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "relationalExpression"
   // $ANTLR start "relop"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:1: relop : ( lte | gte | neq | EQ | GT | LT );
   public final jvmBasicParser.relop_return relop() throws RecognitionException {
      final jvmBasicParser.relop_return retval = new jvmBasicParser.relop_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token EQ94 = null;
      Token GT95 = null;
      Token LT96 = null;
      jvmBasicParser.lte_return lte91 = null;
      jvmBasicParser.gte_return gte92 = null;
      jvmBasicParser.neq_return neq93 = null;
      CommonTree EQ94_tree = null;
      CommonTree GT95_tree = null;
      CommonTree LT96_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:7: ( lte | gte | neq | EQ | GT | LT )
         int alt11 = 6;
         switch (input.LA(1)) {
            case EQ: {
               final int LA11_1 = input.LA(2);
               if ((synpred75_jvmBasic())) {
                  alt11 = 1;
               } else if ((synpred76_jvmBasic())) {
                  alt11 = 2;
               } else if ((synpred78_jvmBasic())) {
                  alt11 = 4;
               } else {
                  if (state.backtracking > 0) {
                     state.failed = true;
                     return retval;
                  }
                  final NoViableAltException nvae = new NoViableAltException("", 11, 1, input);
                  throw nvae;
               }
            }
               break;
            case LT: {
               final int LA11_5 = input.LA(2);
               if ((synpred75_jvmBasic())) {
                  alt11 = 1;
               } else if ((synpred77_jvmBasic())) {
                  alt11 = 3;
               } else if ((true)) {
                  alt11 = 6;
               } else {
                  if (state.backtracking > 0) {
                     state.failed = true;
                     return retval;
                  }
                  final NoViableAltException nvae = new NoViableAltException("", 11, 5, input);
                  throw nvae;
               }
            }
               break;
            case GT: {
               final int LA11_8 = input.LA(2);
               if ((synpred76_jvmBasic())) {
                  alt11 = 2;
               } else if ((synpred79_jvmBasic())) {
                  alt11 = 5;
               } else {
                  if (state.backtracking > 0) {
                     state.failed = true;
                     return retval;
                  }
                  final NoViableAltException nvae = new NoViableAltException("", 11, 8, input);
                  throw nvae;
               }
            }
               break;
            case LTE: {
               alt11 = 1;
            }
               break;
            case GTE: {
               alt11 = 2;
            }
               break;
            default:
               if (state.backtracking > 0) {
                  state.failed = true;
                  return retval;
               }
               final NoViableAltException nvae = new NoViableAltException("", 11, 0, input);
               throw nvae;
         }
         switch (alt11) {
            case 1:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:8: lte
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_lte_in_relop1343);
               lte91 = lte();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, lte91.getTree());
               }
            }
               break;
            case 2:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:14: gte
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_gte_in_relop1347);
               gte92 = gte();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, gte92.getTree());
               }
            }
               break;
            case 3:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:20: neq
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_neq_in_relop1351);
               neq93 = neq();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, neq93.getTree());
               }
            }
               break;
            case 4:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:26: EQ
            {
               root_0 = (CommonTree) adaptor.nil();
               EQ94 = (Token) match(input, EQ, FOLLOW_EQ_in_relop1355);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  EQ94_tree = (CommonTree) adaptor.create(EQ94);
                  adaptor.addChild(root_0, EQ94_tree);
               }
            }
               break;
            case 5:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:31: GT
            {
               root_0 = (CommonTree) adaptor.nil();
               GT95 = (Token) match(input, GT, FOLLOW_GT_in_relop1359);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  GT95_tree = (CommonTree) adaptor.create(GT95);
                  adaptor.addChild(root_0, GT95_tree);
               }
            }
               break;
            case 6:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:36: LT
            {
               root_0 = (CommonTree) adaptor.nil();
               LT96 = (Token) match(input, LT, FOLLOW_LT_in_relop1363);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  LT96_tree = (CommonTree) adaptor.create(LT96);
                  adaptor.addChild(root_0, LT96_tree);
               }
            }
               break;
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "relop"
   // $ANTLR start "rightfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:1: rightfunc : RIGHT ^ LPAREN expression COMMA expression RPAREN ;
   public final jvmBasicParser.rightfunc_return rightfunc() throws RecognitionException {
      final jvmBasicParser.rightfunc_return retval = new jvmBasicParser.rightfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token RIGHT386 = null;
      Token LPAREN387 = null;
      Token COMMA389 = null;
      Token RPAREN391 = null;
      jvmBasicParser.expression_return expression388 = null;
      jvmBasicParser.expression_return expression390 = null;
      CommonTree RIGHT386_tree = null;
      CommonTree LPAREN387_tree = null;
      CommonTree COMMA389_tree = null;
      CommonTree RPAREN391_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:10: ( RIGHT ^ LPAREN expression COMMA expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:12: RIGHT ^ LPAREN expression COMMA expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            RIGHT386 = (Token) match(input, RIGHT, FOLLOW_RIGHT_in_rightfunc2494);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RIGHT386_tree = (CommonTree) adaptor.create(RIGHT386);
               root_0 = (CommonTree) adaptor.becomeRoot(RIGHT386_tree, root_0);
            }
            LPAREN387 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_rightfunc2497);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN387_tree = (CommonTree) adaptor.create(LPAREN387);
               adaptor.addChild(root_0, LPAREN387_tree);
            }
            pushFollow(FOLLOW_expression_in_rightfunc2499);
            expression388 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression388.getTree());
            }
            COMMA389 = (Token) match(input, COMMA, FOLLOW_COMMA_in_rightfunc2501);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA389_tree = (CommonTree) adaptor.create(COMMA389);
               adaptor.addChild(root_0, COMMA389_tree);
            }
            pushFollow(FOLLOW_expression_in_rightfunc2503);
            expression390 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression390.getTree());
            }
            RPAREN391 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_rightfunc2505);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN391_tree = (CommonTree) adaptor.create(RPAREN391);
               adaptor.addChild(root_0, RPAREN391_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "rightfunc"
   // $ANTLR start "rndfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:1: rndfunc : RND ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.rndfunc_return rndfunc() throws RecognitionException {
      final jvmBasicParser.rndfunc_return retval = new jvmBasicParser.rndfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token RND427 = null;
      Token LPAREN428 = null;
      Token RPAREN430 = null;
      jvmBasicParser.expression_return expression429 = null;
      CommonTree RND427_tree = null;
      CommonTree LPAREN428_tree = null;
      CommonTree RPAREN430_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:9: ( RND ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:11: RND ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            RND427 = (Token) match(input, RND, FOLLOW_RND_in_rndfunc2628);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RND427_tree = (CommonTree) adaptor.create(RND427);
               root_0 = (CommonTree) adaptor.becomeRoot(RND427_tree, root_0);
            }
            LPAREN428 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_rndfunc2631);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN428_tree = (CommonTree) adaptor.create(LPAREN428);
               adaptor.addChild(root_0, LPAREN428_tree);
            }
            pushFollow(FOLLOW_expression_in_rndfunc2633);
            expression429 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression429.getTree());
            }
            RPAREN430 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_rndfunc2635);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN430_tree = (CommonTree) adaptor.create(RPAREN430);
               adaptor.addChild(root_0, RPAREN430_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "rndfunc"
   // $ANTLR start "rotstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:1: rotstmt : ROT EQ expression ;
   public final jvmBasicParser.rotstmt_return rotstmt() throws RecognitionException {
      final jvmBasicParser.rotstmt_return retval = new jvmBasicParser.rotstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token ROT222 = null;
      Token EQ223 = null;
      jvmBasicParser.expression_return expression224 = null;
      CommonTree ROT222_tree = null;
      CommonTree EQ223_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:8: ( ROT EQ expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:10: ROT EQ expression
         {
            root_0 = (CommonTree) adaptor.nil();
            ROT222 = (Token) match(input, ROT, FOLLOW_ROT_in_rotstmt1840);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               ROT222_tree = (CommonTree) adaptor.create(ROT222);
               adaptor.addChild(root_0, ROT222_tree);
            }
            EQ223 = (Token) match(input, EQ, FOLLOW_EQ_in_rotstmt1842);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ223_tree = (CommonTree) adaptor.create(EQ223);
               adaptor.addChild(root_0, EQ223_tree);
            }
            pushFollow(FOLLOW_expression_in_rotstmt1844);
            expression224 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression224.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "rotstmt"
   // $ANTLR start "scalestmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:1: scalestmt : SCALE EQ expression ;
   public final jvmBasicParser.scalestmt_return scalestmt() throws RecognitionException {
      final jvmBasicParser.scalestmt_return retval = new jvmBasicParser.scalestmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token SCALE225 = null;
      Token EQ226 = null;
      jvmBasicParser.expression_return expression227 = null;
      CommonTree SCALE225_tree = null;
      CommonTree EQ226_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:10: ( SCALE EQ expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:12: SCALE EQ expression
         {
            root_0 = (CommonTree) adaptor.nil();
            SCALE225 = (Token) match(input, SCALE, FOLLOW_SCALE_in_scalestmt1850);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               SCALE225_tree = (CommonTree) adaptor.create(SCALE225);
               adaptor.addChild(root_0, SCALE225_tree);
            }
            EQ226 = (Token) match(input, EQ, FOLLOW_EQ_in_scalestmt1852);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ226_tree = (CommonTree) adaptor.create(EQ226);
               adaptor.addChild(root_0, EQ226_tree);
            }
            pushFollow(FOLLOW_expression_in_scalestmt1854);
            expression227 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression227.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "scalestmt"
   // $ANTLR start "scrnfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:233:1: scrnfunc : SCRN ^ LPAREN expression COMMA expression RPAREN ;
   public final jvmBasicParser.scrnfunc_return scrnfunc() throws RecognitionException {
      final jvmBasicParser.scrnfunc_return retval = new jvmBasicParser.scrnfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token SCRN405 = null;
      Token LPAREN406 = null;
      Token COMMA408 = null;
      Token RPAREN410 = null;
      jvmBasicParser.expression_return expression407 = null;
      jvmBasicParser.expression_return expression409 = null;
      CommonTree SCRN405_tree = null;
      CommonTree LPAREN406_tree = null;
      CommonTree COMMA408_tree = null;
      CommonTree RPAREN410_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:233:9: ( SCRN ^ LPAREN expression COMMA expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:233:11: SCRN ^ LPAREN expression COMMA expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            SCRN405 = (Token) match(input, SCRN, FOLLOW_SCRN_in_scrnfunc2554);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               SCRN405_tree = (CommonTree) adaptor.create(SCRN405);
               root_0 = (CommonTree) adaptor.becomeRoot(SCRN405_tree, root_0);
            }
            LPAREN406 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_scrnfunc2557);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN406_tree = (CommonTree) adaptor.create(LPAREN406);
               adaptor.addChild(root_0, LPAREN406_tree);
            }
            pushFollow(FOLLOW_expression_in_scrnfunc2559);
            expression407 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression407.getTree());
            }
            COMMA408 = (Token) match(input, COMMA, FOLLOW_COMMA_in_scrnfunc2561);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA408_tree = (CommonTree) adaptor.create(COMMA408);
               adaptor.addChild(root_0, COMMA408_tree);
            }
            pushFollow(FOLLOW_expression_in_scrnfunc2563);
            expression409 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression409.getTree());
            }
            RPAREN410 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_scrnfunc2565);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN410_tree = (CommonTree) adaptor.create(RPAREN410);
               adaptor.addChild(root_0, RPAREN410_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "scrnfunc"
   public void setTreeAdaptor(TreeAdaptor adaptor) {
      this.adaptor = adaptor;
   }

   // $ANTLR start "sgnfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:1: sgnfunc : SGN ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.sgnfunc_return sgnfunc() throws RecognitionException {
      final jvmBasicParser.sgnfunc_return retval = new jvmBasicParser.sgnfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token SGN431 = null;
      Token LPAREN432 = null;
      Token RPAREN434 = null;
      jvmBasicParser.expression_return expression433 = null;
      CommonTree SGN431_tree = null;
      CommonTree LPAREN432_tree = null;
      CommonTree RPAREN434_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:9: ( SGN ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:11: SGN ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            SGN431 = (Token) match(input, SGN, FOLLOW_SGN_in_sgnfunc2642);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               SGN431_tree = (CommonTree) adaptor.create(SGN431);
               root_0 = (CommonTree) adaptor.becomeRoot(SGN431_tree, root_0);
            }
            LPAREN432 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_sgnfunc2645);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN432_tree = (CommonTree) adaptor.create(LPAREN432);
               adaptor.addChild(root_0, LPAREN432_tree);
            }
            pushFollow(FOLLOW_expression_in_sgnfunc2647);
            expression433 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression433.getTree());
            }
            RPAREN434 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_sgnfunc2649);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN434_tree = (CommonTree) adaptor.create(RPAREN434);
               adaptor.addChild(root_0, RPAREN434_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "sgnfunc"
   // $ANTLR start "signExpression"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:1: signExpression : ( NOT )? ( ( PLUS | MINUS ) )* func ;
   public final jvmBasicParser.signExpression_return signExpression() throws RecognitionException {
      final jvmBasicParser.signExpression_return retval = new jvmBasicParser.signExpression_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token NOT298 = null;
      Token set299 = null;
      jvmBasicParser.func_return func300 = null;
      CommonTree NOT298_tree = null;
      final CommonTree set299_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:16: ( ( NOT )? ( ( PLUS | MINUS ) )* func )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:18: ( NOT )? ( ( PLUS | MINUS ) )* func
         {
            root_0 = (CommonTree) adaptor.nil();
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:18: ( NOT )?
            int alt32 = 2;
            switch (input.LA(1)) {
               case NOT: {
                  alt32 = 1;
               }
                  break;
            }
            switch (alt32) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:18: NOT
               {
                  NOT298 = (Token) match(input, NOT, FOLLOW_NOT_in_signExpression2107);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     NOT298_tree = (CommonTree) adaptor.create(NOT298);
                     adaptor.addChild(root_0, NOT298_tree);
                  }
               }
                  break;
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:23: ( ( PLUS | MINUS ) )*
            loop33: do {
               int alt33 = 2;
               switch (input.LA(1)) {
                  case MINUS:
                  case PLUS: {
                     alt33 = 1;
                  }
                     break;
               }
               switch (alt33) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
                  {
                     set299 = (Token) input.LT(1);
                     if ((input.LA(1) == MINUS) || (input.LA(1) == PLUS)) {
                        input.consume();
                        if (state.backtracking == 0) {
                           adaptor.addChild(root_0, (CommonTree) adaptor.create(set299));
                        }
                        state.errorRecovery = false;
                        state.failed = false;
                     } else {
                        if (state.backtracking > 0) {
                           state.failed = true;
                           return retval;
                        }
                        final MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                     }
                  }
                     break;
                  default:
                     break loop33;
               }
            } while (true);
            pushFollow(FOLLOW_func_in_signExpression2119);
            func300 = func();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, func300.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "signExpression"
   // $ANTLR start "sinfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:234:1: sinfunc : SIN ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.sinfunc_return sinfunc() throws RecognitionException {
      final jvmBasicParser.sinfunc_return retval = new jvmBasicParser.sinfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token SIN411 = null;
      Token LPAREN412 = null;
      Token RPAREN414 = null;
      jvmBasicParser.expression_return expression413 = null;
      CommonTree SIN411_tree = null;
      CommonTree LPAREN412_tree = null;
      CommonTree RPAREN414_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:234:9: ( SIN ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:234:11: SIN ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            SIN411 = (Token) match(input, SIN, FOLLOW_SIN_in_sinfunc2572);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               SIN411_tree = (CommonTree) adaptor.create(SIN411);
               root_0 = (CommonTree) adaptor.becomeRoot(SIN411_tree, root_0);
            }
            LPAREN412 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_sinfunc2575);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN412_tree = (CommonTree) adaptor.create(LPAREN412);
               adaptor.addChild(root_0, LPAREN412_tree);
            }
            pushFollow(FOLLOW_expression_in_sinfunc2577);
            expression413 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression413.getTree());
            }
            RPAREN414 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_sinfunc2579);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN414_tree = (CommonTree) adaptor.create(RPAREN414);
               adaptor.addChild(root_0, RPAREN414_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "sinfunc"
   // $ANTLR start "spcfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:1: spcfunc : SPC ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.spcfunc_return spcfunc() throws RecognitionException {
      final jvmBasicParser.spcfunc_return retval = new jvmBasicParser.spcfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token SPC364 = null;
      Token LPAREN365 = null;
      Token RPAREN367 = null;
      jvmBasicParser.expression_return expression366 = null;
      CommonTree SPC364_tree = null;
      CommonTree LPAREN365_tree = null;
      CommonTree RPAREN367_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:8: ( SPC ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:11: SPC ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            SPC364 = (Token) match(input, SPC, FOLLOW_SPC_in_spcfunc2422);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               SPC364_tree = (CommonTree) adaptor.create(SPC364);
               root_0 = (CommonTree) adaptor.becomeRoot(SPC364_tree, root_0);
            }
            LPAREN365 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_spcfunc2425);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN365_tree = (CommonTree) adaptor.create(LPAREN365);
               adaptor.addChild(root_0, LPAREN365_tree);
            }
            pushFollow(FOLLOW_expression_in_spcfunc2427);
            expression366 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression366.getTree());
            }
            RPAREN367 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_spcfunc2429);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN367_tree = (CommonTree) adaptor.create(RPAREN367);
               adaptor.addChild(root_0, RPAREN367_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "spcfunc"
   // $ANTLR start "speedstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:1: speedstmt : SPEED EQ expression ;
   public final jvmBasicParser.speedstmt_return speedstmt() throws RecognitionException {
      final jvmBasicParser.speedstmt_return retval = new jvmBasicParser.speedstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token SPEED219 = null;
      Token EQ220 = null;
      jvmBasicParser.expression_return expression221 = null;
      CommonTree SPEED219_tree = null;
      CommonTree EQ220_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:10: ( SPEED EQ expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:12: SPEED EQ expression
         {
            root_0 = (CommonTree) adaptor.nil();
            SPEED219 = (Token) match(input, SPEED, FOLLOW_SPEED_in_speedstmt1830);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               SPEED219_tree = (CommonTree) adaptor.create(SPEED219);
               adaptor.addChild(root_0, SPEED219_tree);
            }
            EQ220 = (Token) match(input, EQ, FOLLOW_EQ_in_speedstmt1832);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ220_tree = (CommonTree) adaptor.create(EQ220);
               adaptor.addChild(root_0, EQ220_tree);
            }
            pushFollow(FOLLOW_expression_in_speedstmt1834);
            expression221 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression221.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "speedstmt"
   // $ANTLR start "sqrfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:1: sqrfunc : SQR ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.sqrfunc_return sqrfunc() throws RecognitionException {
      final jvmBasicParser.sqrfunc_return retval = new jvmBasicParser.sqrfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token SQR328 = null;
      Token LPAREN329 = null;
      Token RPAREN331 = null;
      jvmBasicParser.expression_return expression330 = null;
      CommonTree SQR328_tree = null;
      CommonTree LPAREN329_tree = null;
      CommonTree RPAREN331_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:9: ( SQR ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:11: SQR ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            SQR328 = (Token) match(input, SQR, FOLLOW_SQR_in_sqrfunc2302);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               SQR328_tree = (CommonTree) adaptor.create(SQR328);
               root_0 = (CommonTree) adaptor.becomeRoot(SQR328_tree, root_0);
            }
            LPAREN329 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_sqrfunc2305);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN329_tree = (CommonTree) adaptor.create(LPAREN329);
               adaptor.addChild(root_0, LPAREN329_tree);
            }
            pushFollow(FOLLOW_expression_in_sqrfunc2307);
            expression330 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression330.getTree());
            }
            RPAREN331 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_sqrfunc2309);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN331_tree = (CommonTree) adaptor.create(RPAREN331);
               adaptor.addChild(root_0, RPAREN331_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "sqrfunc"
   // $ANTLR start "statement"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:1: statement : ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT |
   // HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt |
   // hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt |
   // callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt );
   public final jvmBasicParser.statement_return statement() throws RecognitionException {
      final jvmBasicParser.statement_return retval = new jvmBasicParser.statement_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LOAD11 = null;
      Token SAVE12 = null;
      Token RESTORE13 = null;
      Token TRACE14 = null;
      Token NOTRACE15 = null;
      Token FLASH16 = null;
      Token INVERSE17 = null;
      Token GR18 = null;
      Token NORMAL19 = null;
      Token SHLOAD20 = null;
      Token RETURN21 = null;
      Token CLEAR22 = null;
      Token RUN23 = null;
      Token END24 = null;
      Token STOP25 = null;
      Token TEXT26 = null;
      Token HOME27 = null;
      Token HGR28 = null;
      Token HGR229 = null;
      jvmBasicParser.amptstmt_return amptstmt30 = null;
      jvmBasicParser.popstmt_return popstmt31 = null;
      jvmBasicParser.liststmt_return liststmt32 = null;
      jvmBasicParser.storestmt_return storestmt33 = null;
      jvmBasicParser.getstmt_return getstmt34 = null;
      jvmBasicParser.recallstmt_return recallstmt35 = null;
      jvmBasicParser.instmt_return instmt36 = null;
      jvmBasicParser.prstmt_return prstmt37 = null;
      jvmBasicParser.onerrstmt_return onerrstmt38 = null;
      jvmBasicParser.hlinstmt_return hlinstmt39 = null;
      jvmBasicParser.vlinstmt_return vlinstmt40 = null;
      jvmBasicParser.colorstmt_return colorstmt41 = null;
      jvmBasicParser.speedstmt_return speedstmt42 = null;
      jvmBasicParser.scalestmt_return scalestmt43 = null;
      jvmBasicParser.rotstmt_return rotstmt44 = null;
      jvmBasicParser.hcolorstmt_return hcolorstmt45 = null;
      jvmBasicParser.himemstmt_return himemstmt46 = null;
      jvmBasicParser.lomemstmt_return lomemstmt47 = null;
      jvmBasicParser.printstmt1_return printstmt148 = null;
      jvmBasicParser.pokestmt_return pokestmt49 = null;
      jvmBasicParser.plotstmt_return plotstmt50 = null;
      jvmBasicParser.ongotostmt_return ongotostmt51 = null;
      jvmBasicParser.ongosubstmt_return ongosubstmt52 = null;
      jvmBasicParser.ifstmt_return ifstmt53 = null;
      jvmBasicParser.comment_return comment54 = null;
      jvmBasicParser.nextstmt_return nextstmt55 = null;
      jvmBasicParser.forstmt_return forstmt56 = null;
      jvmBasicParser.inputstmt_return inputstmt57 = null;
      jvmBasicParser.tabstmt_return tabstmt58 = null;
      jvmBasicParser.dimstmt_return dimstmt59 = null;
      jvmBasicParser.gotostmt_return gotostmt60 = null;
      jvmBasicParser.gosubstmt_return gosubstmt61 = null;
      jvmBasicParser.callstmt_return callstmt62 = null;
      jvmBasicParser.readstmt_return readstmt63 = null;
      jvmBasicParser.hplotstmt_return hplotstmt64 = null;
      jvmBasicParser.vplotstmt_return vplotstmt65 = null;
      jvmBasicParser.vtabstmnt_return vtabstmnt66 = null;
      jvmBasicParser.htabstmnt_return htabstmnt67 = null;
      jvmBasicParser.waitstmt_return waitstmt68 = null;
      jvmBasicParser.datastmt_return datastmt69 = null;
      jvmBasicParser.xdrawstmt_return xdrawstmt70 = null;
      jvmBasicParser.drawstmt_return drawstmt71 = null;
      jvmBasicParser.defstmt_return defstmt72 = null;
      jvmBasicParser.letstmt_return letstmt73 = null;
      CommonTree LOAD11_tree = null;
      CommonTree SAVE12_tree = null;
      CommonTree RESTORE13_tree = null;
      CommonTree TRACE14_tree = null;
      CommonTree NOTRACE15_tree = null;
      CommonTree FLASH16_tree = null;
      CommonTree INVERSE17_tree = null;
      CommonTree GR18_tree = null;
      CommonTree NORMAL19_tree = null;
      CommonTree SHLOAD20_tree = null;
      CommonTree RETURN21_tree = null;
      CommonTree CLEAR22_tree = null;
      CommonTree RUN23_tree = null;
      CommonTree END24_tree = null;
      CommonTree STOP25_tree = null;
      CommonTree TEXT26_tree = null;
      CommonTree HOME27_tree = null;
      CommonTree HGR28_tree = null;
      CommonTree HGR229_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:11: ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME
         // | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt |
         // hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt |
         // gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt )
         int alt5 = 63;
         alt5 = dfa5.predict(input);
         switch (alt5) {
            case 1:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:13: LOAD
            {
               root_0 = (CommonTree) adaptor.nil();
               LOAD11 = (Token) match(input, LOAD, FOLLOW_LOAD_in_statement1034);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  LOAD11_tree = (CommonTree) adaptor.create(LOAD11);
                  adaptor.addChild(root_0, LOAD11_tree);
               }
            }
               break;
            case 2:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:20: SAVE
            {
               root_0 = (CommonTree) adaptor.nil();
               SAVE12 = (Token) match(input, SAVE, FOLLOW_SAVE_in_statement1038);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  SAVE12_tree = (CommonTree) adaptor.create(SAVE12);
                  adaptor.addChild(root_0, SAVE12_tree);
               }
            }
               break;
            case 3:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:27: RESTORE
            {
               root_0 = (CommonTree) adaptor.nil();
               RESTORE13 = (Token) match(input, RESTORE, FOLLOW_RESTORE_in_statement1042);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  RESTORE13_tree = (CommonTree) adaptor.create(RESTORE13);
                  adaptor.addChild(root_0, RESTORE13_tree);
               }
            }
               break;
            case 4:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:37: TRACE
            {
               root_0 = (CommonTree) adaptor.nil();
               TRACE14 = (Token) match(input, TRACE, FOLLOW_TRACE_in_statement1046);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  TRACE14_tree = (CommonTree) adaptor.create(TRACE14);
                  adaptor.addChild(root_0, TRACE14_tree);
               }
            }
               break;
            case 5:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:44: NOTRACE
            {
               root_0 = (CommonTree) adaptor.nil();
               NOTRACE15 = (Token) match(input, NOTRACE, FOLLOW_NOTRACE_in_statement1049);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  NOTRACE15_tree = (CommonTree) adaptor.create(NOTRACE15);
                  adaptor.addChild(root_0, NOTRACE15_tree);
               }
            }
               break;
            case 6:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:54: FLASH
            {
               root_0 = (CommonTree) adaptor.nil();
               FLASH16 = (Token) match(input, FLASH, FOLLOW_FLASH_in_statement1053);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  FLASH16_tree = (CommonTree) adaptor.create(FLASH16);
                  adaptor.addChild(root_0, FLASH16_tree);
               }
            }
               break;
            case 7:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:62: INVERSE
            {
               root_0 = (CommonTree) adaptor.nil();
               INVERSE17 = (Token) match(input, INVERSE, FOLLOW_INVERSE_in_statement1057);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  INVERSE17_tree = (CommonTree) adaptor.create(INVERSE17);
                  adaptor.addChild(root_0, INVERSE17_tree);
               }
            }
               break;
            case 8:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:71: GR
            {
               root_0 = (CommonTree) adaptor.nil();
               GR18 = (Token) match(input, GR, FOLLOW_GR_in_statement1060);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  GR18_tree = (CommonTree) adaptor.create(GR18);
                  adaptor.addChild(root_0, GR18_tree);
               }
            }
               break;
            case 9:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:75: NORMAL
            {
               root_0 = (CommonTree) adaptor.nil();
               NORMAL19 = (Token) match(input, NORMAL, FOLLOW_NORMAL_in_statement1063);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  NORMAL19_tree = (CommonTree) adaptor.create(NORMAL19);
                  adaptor.addChild(root_0, NORMAL19_tree);
               }
            }
               break;
            case 10:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:84: SHLOAD
            {
               root_0 = (CommonTree) adaptor.nil();
               SHLOAD20 = (Token) match(input, SHLOAD, FOLLOW_SHLOAD_in_statement1067);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  SHLOAD20_tree = (CommonTree) adaptor.create(SHLOAD20);
                  adaptor.addChild(root_0, SHLOAD20_tree);
               }
            }
               break;
            case 11:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:93: RETURN
            {
               root_0 = (CommonTree) adaptor.nil();
               RETURN21 = (Token) match(input, RETURN, FOLLOW_RETURN_in_statement1071);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  RETURN21_tree = (CommonTree) adaptor.create(RETURN21);
                  adaptor.addChild(root_0, RETURN21_tree);
               }
            }
               break;
            case 12:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:102: CLEAR
            {
               root_0 = (CommonTree) adaptor.nil();
               CLEAR22 = (Token) match(input, CLEAR, FOLLOW_CLEAR_in_statement1075);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  CLEAR22_tree = (CommonTree) adaptor.create(CLEAR22);
                  adaptor.addChild(root_0, CLEAR22_tree);
               }
            }
               break;
            case 13:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:110: RUN
            {
               root_0 = (CommonTree) adaptor.nil();
               RUN23 = (Token) match(input, RUN, FOLLOW_RUN_in_statement1079);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  RUN23_tree = (CommonTree) adaptor.create(RUN23);
                  adaptor.addChild(root_0, RUN23_tree);
               }
            }
               break;
            case 14:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:116: END ^
            {
               root_0 = (CommonTree) adaptor.nil();
               END24 = (Token) match(input, END, FOLLOW_END_in_statement1083);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  END24_tree = (CommonTree) adaptor.create(END24);
                  root_0 = (CommonTree) adaptor.becomeRoot(END24_tree, root_0);
               }
            }
               break;
            case 15:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:123: STOP
            {
               root_0 = (CommonTree) adaptor.nil();
               STOP25 = (Token) match(input, STOP, FOLLOW_STOP_in_statement1088);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  STOP25_tree = (CommonTree) adaptor.create(STOP25);
                  adaptor.addChild(root_0, STOP25_tree);
               }
            }
               break;
            case 16:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:130: TEXT
            {
               root_0 = (CommonTree) adaptor.nil();
               TEXT26 = (Token) match(input, TEXT, FOLLOW_TEXT_in_statement1092);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  TEXT26_tree = (CommonTree) adaptor.create(TEXT26);
                  adaptor.addChild(root_0, TEXT26_tree);
               }
            }
               break;
            case 17:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:137: HOME
            {
               root_0 = (CommonTree) adaptor.nil();
               HOME27 = (Token) match(input, HOME, FOLLOW_HOME_in_statement1096);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  HOME27_tree = (CommonTree) adaptor.create(HOME27);
                  adaptor.addChild(root_0, HOME27_tree);
               }
            }
               break;
            case 18:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:144: HGR
            {
               root_0 = (CommonTree) adaptor.nil();
               HGR28 = (Token) match(input, HGR, FOLLOW_HGR_in_statement1100);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  HGR28_tree = (CommonTree) adaptor.create(HGR28);
                  adaptor.addChild(root_0, HGR28_tree);
               }
            }
               break;
            case 19:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:150: HGR2
            {
               root_0 = (CommonTree) adaptor.nil();
               HGR229 = (Token) match(input, HGR2, FOLLOW_HGR2_in_statement1104);
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  HGR229_tree = (CommonTree) adaptor.create(HGR229);
                  adaptor.addChild(root_0, HGR229_tree);
               }
            }
               break;
            case 20:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:156: amptstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_amptstmt_in_statement1107);
               amptstmt30 = amptstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, amptstmt30.getTree());
               }
            }
               break;
            case 21:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:166: popstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_popstmt_in_statement1110);
               popstmt31 = popstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, popstmt31.getTree());
               }
            }
               break;
            case 22:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:176: liststmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_liststmt_in_statement1114);
               liststmt32 = liststmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, liststmt32.getTree());
               }
            }
               break;
            case 23:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:186: storestmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_storestmt_in_statement1117);
               storestmt33 = storestmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, storestmt33.getTree());
               }
            }
               break;
            case 24:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:197: getstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_getstmt_in_statement1120);
               getstmt34 = getstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, getstmt34.getTree());
               }
            }
               break;
            case 25:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:207: recallstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_recallstmt_in_statement1124);
               recallstmt35 = recallstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, recallstmt35.getTree());
               }
            }
               break;
            case 26:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:219: instmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_instmt_in_statement1127);
               instmt36 = instmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, instmt36.getTree());
               }
            }
               break;
            case 27:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:227: prstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_prstmt_in_statement1130);
               prstmt37 = prstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, prstmt37.getTree());
               }
            }
               break;
            case 28:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:235: onerrstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_onerrstmt_in_statement1133);
               onerrstmt38 = onerrstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, onerrstmt38.getTree());
               }
            }
               break;
            case 29:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:246: hlinstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_hlinstmt_in_statement1136);
               hlinstmt39 = hlinstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, hlinstmt39.getTree());
               }
            }
               break;
            case 30:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:255: vlinstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_vlinstmt_in_statement1138);
               vlinstmt40 = vlinstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, vlinstmt40.getTree());
               }
            }
               break;
            case 31:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:264: colorstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_colorstmt_in_statement1140);
               colorstmt41 = colorstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, colorstmt41.getTree());
               }
            }
               break;
            case 32:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:275: speedstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_speedstmt_in_statement1143);
               speedstmt42 = speedstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, speedstmt42.getTree());
               }
            }
               break;
            case 33:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:286: scalestmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_scalestmt_in_statement1146);
               scalestmt43 = scalestmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, scalestmt43.getTree());
               }
            }
               break;
            case 34:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:296: rotstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_rotstmt_in_statement1148);
               rotstmt44 = rotstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, rotstmt44.getTree());
               }
            }
               break;
            case 35:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:305: hcolorstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_hcolorstmt_in_statement1151);
               hcolorstmt45 = hcolorstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, hcolorstmt45.getTree());
               }
            }
               break;
            case 36:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:317: himemstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_himemstmt_in_statement1154);
               himemstmt46 = himemstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, himemstmt46.getTree());
               }
            }
               break;
            case 37:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:328: lomemstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_lomemstmt_in_statement1157);
               lomemstmt47 = lomemstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, lomemstmt47.getTree());
               }
            }
               break;
            case 38:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:340: printstmt1
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_printstmt1_in_statement1161);
               printstmt148 = printstmt1();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, printstmt148.getTree());
               }
            }
               break;
            case 39:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:352: pokestmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_pokestmt_in_statement1164);
               pokestmt49 = pokestmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, pokestmt49.getTree());
               }
            }
               break;
            case 40:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:363: plotstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_plotstmt_in_statement1168);
               plotstmt50 = plotstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, plotstmt50.getTree());
               }
            }
               break;
            case 41:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:373: ongotostmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_ongotostmt_in_statement1171);
               ongotostmt51 = ongotostmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, ongotostmt51.getTree());
               }
            }
               break;
            case 42:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:385: ongosubstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_ongosubstmt_in_statement1174);
               ongosubstmt52 = ongosubstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, ongosubstmt52.getTree());
               }
            }
               break;
            case 43:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:398: ifstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_ifstmt_in_statement1177);
               ifstmt53 = ifstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, ifstmt53.getTree());
               }
            }
               break;
            case 44:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:407: comment
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_comment_in_statement1181);
               comment54 = comment();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, comment54.getTree());
               }
            }
               break;
            case 45:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:416: nextstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_nextstmt_in_statement1184);
               nextstmt55 = nextstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, nextstmt55.getTree());
               }
            }
               break;
            case 46:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:426: forstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_forstmt_in_statement1187);
               forstmt56 = forstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, forstmt56.getTree());
               }
            }
               break;
            case 47:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:436: inputstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_inputstmt_in_statement1191);
               inputstmt57 = inputstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, inputstmt57.getTree());
               }
            }
               break;
            case 48:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:448: tabstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_tabstmt_in_statement1195);
               tabstmt58 = tabstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, tabstmt58.getTree());
               }
            }
               break;
            case 49:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:458: dimstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_dimstmt_in_statement1199);
               dimstmt59 = dimstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, dimstmt59.getTree());
               }
            }
               break;
            case 50:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:468: gotostmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_gotostmt_in_statement1203);
               gotostmt60 = gotostmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, gotostmt60.getTree());
               }
            }
               break;
            case 51:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:479: gosubstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_gosubstmt_in_statement1207);
               gosubstmt61 = gosubstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, gosubstmt61.getTree());
               }
            }
               break;
            case 52:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:491: callstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_callstmt_in_statement1211);
               callstmt62 = callstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, callstmt62.getTree());
               }
            }
               break;
            case 53:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:501: readstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_readstmt_in_statement1214);
               readstmt63 = readstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, readstmt63.getTree());
               }
            }
               break;
            case 54:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:511: hplotstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_hplotstmt_in_statement1217);
               hplotstmt64 = hplotstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, hplotstmt64.getTree());
               }
            }
               break;
            case 55:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:523: vplotstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_vplotstmt_in_statement1221);
               vplotstmt65 = vplotstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, vplotstmt65.getTree());
               }
            }
               break;
            case 56:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:535: vtabstmnt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_vtabstmnt_in_statement1225);
               vtabstmnt66 = vtabstmnt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, vtabstmnt66.getTree());
               }
            }
               break;
            case 57:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:546: htabstmnt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_htabstmnt_in_statement1228);
               htabstmnt67 = htabstmnt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, htabstmnt67.getTree());
               }
            }
               break;
            case 58:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:556: waitstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_waitstmt_in_statement1230);
               waitstmt68 = waitstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, waitstmt68.getTree());
               }
            }
               break;
            case 59:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:566: datastmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_datastmt_in_statement1233);
               datastmt69 = datastmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, datastmt69.getTree());
               }
            }
               break;
            case 60:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:576: xdrawstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_xdrawstmt_in_statement1236);
               xdrawstmt70 = xdrawstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, xdrawstmt70.getTree());
               }
            }
               break;
            case 61:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:588: drawstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_drawstmt_in_statement1240);
               drawstmt71 = drawstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, drawstmt71.getTree());
               }
            }
               break;
            case 62:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:598: defstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_defstmt_in_statement1243);
               defstmt72 = defstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, defstmt72.getTree());
               }
            }
               break;
            case 63:
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:607: letstmt
            {
               root_0 = (CommonTree) adaptor.nil();
               pushFollow(FOLLOW_letstmt_in_statement1246);
               letstmt73 = letstmt();
               state._fsp--;
               if (state.failed) {
                  return retval;
               }
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, letstmt73.getTree());
               }
            }
               break;
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "statement"
   // $ANTLR start "storestmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:1: storestmt : STORE vardecl ;
   public final jvmBasicParser.storestmt_return storestmt() throws RecognitionException {
      final jvmBasicParser.storestmt_return retval = new jvmBasicParser.storestmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token STORE253 = null;
      jvmBasicParser.vardecl_return vardecl254 = null;
      CommonTree STORE253_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:10: ( STORE vardecl )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:12: STORE vardecl
         {
            root_0 = (CommonTree) adaptor.nil();
            STORE253 = (Token) match(input, STORE, FOLLOW_STORE_in_storestmt1938);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               STORE253_tree = (CommonTree) adaptor.create(STORE253);
               adaptor.addChild(root_0, STORE253_tree);
            }
            pushFollow(FOLLOW_vardecl_in_storestmt1940);
            vardecl254 = vardecl();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, vardecl254.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "storestmt"
   // $ANTLR start "strfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:1: strfunc : STR ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.strfunc_return strfunc() throws RecognitionException {
      final jvmBasicParser.strfunc_return retval = new jvmBasicParser.strfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token STR392 = null;
      Token LPAREN393 = null;
      Token RPAREN395 = null;
      jvmBasicParser.expression_return expression394 = null;
      CommonTree STR392_tree = null;
      CommonTree LPAREN393_tree = null;
      CommonTree RPAREN395_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:9: ( STR ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:11: STR ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            STR392 = (Token) match(input, STR, FOLLOW_STR_in_strfunc2512);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               STR392_tree = (CommonTree) adaptor.create(STR392);
               root_0 = (CommonTree) adaptor.becomeRoot(STR392_tree, root_0);
            }
            LPAREN393 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_strfunc2515);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN393_tree = (CommonTree) adaptor.create(LPAREN393);
               adaptor.addChild(root_0, LPAREN393_tree);
            }
            pushFollow(FOLLOW_expression_in_strfunc2517);
            expression394 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression394.getTree());
            }
            RPAREN395 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_strfunc2519);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN395_tree = (CommonTree) adaptor.create(RPAREN395);
               adaptor.addChild(root_0, RPAREN395_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "strfunc"
   // $ANTLR start "stringliteral"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:10: fragment stringliteral : STRINGLITERAL ;
   public final jvmBasicParser.stringliteral_return stringliteral() throws RecognitionException {
      final jvmBasicParser.stringliteral_return retval = new jvmBasicParser.stringliteral_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token STRINGLITERAL327 = null;
      CommonTree STRINGLITERAL327_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:23: ( STRINGLITERAL )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:25: STRINGLITERAL
         {
            root_0 = (CommonTree) adaptor.nil();
            STRINGLITERAL327 = (Token) match(input, STRINGLITERAL, FOLLOW_STRINGLITERAL_in_stringliteral2292);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               STRINGLITERAL327_tree = (CommonTree) adaptor.create(STRINGLITERAL327);
               adaptor.addChild(root_0, STRINGLITERAL327_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "stringliteral"
   public final boolean synpred138_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred138_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred138_jvmBasic
   public final void synpred138_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:43: ( ( PLUS | MINUS ) multiplyingExpression )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:43: ( PLUS | MINUS ) multiplyingExpression
      {
         if ((input.LA(1) == MINUS) || (input.LA(1) == PLUS)) {
            input.consume();
            state.errorRecovery = false;
            state.failed = false;
         } else {
            if (state.backtracking > 0) {
               state.failed = true;
               return;
            }
            final MismatchedSetException mse = new MismatchedSetException(null, input);
            throw mse;
         }
         pushFollow(FOLLOW_multiplyingExpression_in_synpred138_jvmBasic2170);
         multiplyingExpression();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred138_jvmBasic
   public final boolean synpred46_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred46_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred46_jvmBasic
   public final void synpred46_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:373: ( ongotostmt )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:373: ongotostmt
      {
         pushFollow(FOLLOW_ongotostmt_in_synpred46_jvmBasic1171);
         ongotostmt();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred46_jvmBasic
   public final boolean synpred47_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred47_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred47_jvmBasic
   public final void synpred47_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:385: ( ongosubstmt )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:142:385: ongosubstmt
      {
         pushFollow(FOLLOW_ongosubstmt_in_synpred47_jvmBasic1174);
         ongosubstmt();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred47_jvmBasic
   public final boolean synpred5_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred5_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred5_jvmBasic
   public final void synpred5_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:141:11: ( amperoper )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:141:11: amperoper
      {
         pushFollow(FOLLOW_amperoper_in_synpred5_jvmBasic1023);
         amperoper();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred5_jvmBasic
   public final boolean synpred68_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred68_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred68_jvmBasic
   public final void synpred68_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:143:17: ( LPAREN exprlist RPAREN )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:143:17: LPAREN exprlist RPAREN
      {
         match(input, LPAREN, FOLLOW_LPAREN_in_synpred68_jvmBasic1257);
         if (state.failed) {
            return;
         }
         pushFollow(FOLLOW_exprlist_in_synpred68_jvmBasic1259);
         exprlist();
         state._fsp--;
         if (state.failed) {
            return;
         }
         match(input, RPAREN, FOLLOW_RPAREN_in_synpred68_jvmBasic1261);
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred68_jvmBasic
   public final boolean synpred73_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred73_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred73_jvmBasic
   public final void synpred73_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:47: ( printlist )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:145:47: printlist
      {
         pushFollow(FOLLOW_printlist_in_synpred73_jvmBasic1299);
         printlist();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred73_jvmBasic
   public final boolean synpred75_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred75_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred75_jvmBasic
   public final void synpred75_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:8: ( lte )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:8: lte
      {
         pushFollow(FOLLOW_lte_in_synpred75_jvmBasic1343);
         lte();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred75_jvmBasic
   public final boolean synpred76_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred76_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred76_jvmBasic
   public final void synpred76_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:14: ( gte )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:14: gte
      {
         pushFollow(FOLLOW_gte_in_synpred76_jvmBasic1347);
         gte();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred76_jvmBasic
   public final boolean synpred77_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred77_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred77_jvmBasic
   public final void synpred77_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:20: ( neq )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:20: neq
      {
         pushFollow(FOLLOW_neq_in_synpred77_jvmBasic1351);
         neq();
         state._fsp--;
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred77_jvmBasic
   public final boolean synpred78_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred78_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred78_jvmBasic
   public final void synpred78_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:26: ( EQ )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:26: EQ
      {
         match(input, EQ, FOLLOW_EQ_in_synpred78_jvmBasic1355);
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred78_jvmBasic
   public final boolean synpred79_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred79_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred79_jvmBasic
   public final void synpred79_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:31: ( GT )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:149:31: GT
      {
         match(input, GT, FOLLOW_GT_in_synpred79_jvmBasic1359);
         if (state.failed) {
            return;
         }
      }
   }

   // $ANTLR end synpred79_jvmBasic
   public final boolean synpred88_jvmBasic() {
      state.backtracking++;
      final int start = input.mark();
      try {
         synpred88_jvmBasic_fragment(); // can never throw exception
      } catch (final RecognitionException re) {
         System.err.println("impossible: " + re);
      }
      final boolean success = !state.failed;
      input.rewind(start);
      state.backtracking--;
      state.failed = false;
      return success;
   }

   // $ANTLR start synpred88_jvmBasic
   public final void synpred88_jvmBasic_fragment() throws RecognitionException {
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:42: ( (~ ( CR ) ) )
      // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
      {
         if (((input.LA(1) >= ABS) && (input.LA(1) <= COS)) || ((input.LA(1) >= DATA) && (input.LA(1) <= 124))) {
            input.consume();
            state.errorRecovery = false;
            state.failed = false;
         } else {
            if (state.backtracking > 0) {
               state.failed = true;
               return;
            }
            final MismatchedSetException mse = new MismatchedSetException(null, input);
            throw mse;
         }
      }
   }

   // $ANTLR end synpred88_jvmBasic
   // $ANTLR start "tabstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:1: tabstmt : TAB LPAREN expression RPAREN ;
   public final jvmBasicParser.tabstmt_return tabstmt() throws RecognitionException {
      final jvmBasicParser.tabstmt_return retval = new jvmBasicParser.tabstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token TAB215 = null;
      Token LPAREN216 = null;
      Token RPAREN218 = null;
      jvmBasicParser.expression_return expression217 = null;
      CommonTree TAB215_tree = null;
      CommonTree LPAREN216_tree = null;
      CommonTree RPAREN218_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:8: ( TAB LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:10: TAB LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            TAB215 = (Token) match(input, TAB, FOLLOW_TAB_in_tabstmt1818);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               TAB215_tree = (CommonTree) adaptor.create(TAB215);
               adaptor.addChild(root_0, TAB215_tree);
            }
            LPAREN216 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_tabstmt1820);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN216_tree = (CommonTree) adaptor.create(LPAREN216);
               adaptor.addChild(root_0, LPAREN216_tree);
            }
            pushFollow(FOLLOW_expression_in_tabstmt1822);
            expression217 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression217.getTree());
            }
            RPAREN218 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_tabstmt1824);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN218_tree = (CommonTree) adaptor.create(RPAREN218);
               adaptor.addChild(root_0, RPAREN218_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "tabstmt"
   // $ANTLR start "tanfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:236:1: tanfunc : TAN ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.tanfunc_return tanfunc() throws RecognitionException {
      final jvmBasicParser.tanfunc_return retval = new jvmBasicParser.tanfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token TAN419 = null;
      Token LPAREN420 = null;
      Token RPAREN422 = null;
      jvmBasicParser.expression_return expression421 = null;
      CommonTree TAN419_tree = null;
      CommonTree LPAREN420_tree = null;
      CommonTree RPAREN422_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:236:9: ( TAN ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:236:11: TAN ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            TAN419 = (Token) match(input, TAN, FOLLOW_TAN_in_tanfunc2600);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               TAN419_tree = (CommonTree) adaptor.create(TAN419);
               root_0 = (CommonTree) adaptor.becomeRoot(TAN419_tree, root_0);
            }
            LPAREN420 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_tanfunc2603);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN420_tree = (CommonTree) adaptor.create(LPAREN420);
               adaptor.addChild(root_0, LPAREN420_tree);
            }
            pushFollow(FOLLOW_expression_in_tanfunc2605);
            expression421 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression421.getTree());
            }
            RPAREN422 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_tanfunc2607);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN422_tree = (CommonTree) adaptor.create(RPAREN422);
               adaptor.addChild(root_0, RPAREN422_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "tanfunc"
   // $ANTLR start "usrfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:1: usrfunc : USR ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.usrfunc_return usrfunc() throws RecognitionException {
      final jvmBasicParser.usrfunc_return retval = new jvmBasicParser.usrfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token USR376 = null;
      Token LPAREN377 = null;
      Token RPAREN379 = null;
      jvmBasicParser.expression_return expression378 = null;
      CommonTree USR376_tree = null;
      CommonTree LPAREN377_tree = null;
      CommonTree RPAREN379_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:8: ( USR ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:11: USR ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            USR376 = (Token) match(input, USR, FOLLOW_USR_in_usrfunc2464);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               USR376_tree = (CommonTree) adaptor.create(USR376);
               root_0 = (CommonTree) adaptor.becomeRoot(USR376_tree, root_0);
            }
            LPAREN377 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_usrfunc2467);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN377_tree = (CommonTree) adaptor.create(LPAREN377);
               adaptor.addChild(root_0, LPAREN377_tree);
            }
            pushFollow(FOLLOW_expression_in_usrfunc2469);
            expression378 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression378.getTree());
            }
            RPAREN379 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_usrfunc2471);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN379_tree = (CommonTree) adaptor.create(RPAREN379);
               adaptor.addChild(root_0, RPAREN379_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "usrfunc"
   // $ANTLR start "valfunc"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:232:1: valfunc : VAL ^ LPAREN expression RPAREN ;
   public final jvmBasicParser.valfunc_return valfunc() throws RecognitionException {
      final jvmBasicParser.valfunc_return retval = new jvmBasicParser.valfunc_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token VAL401 = null;
      Token LPAREN402 = null;
      Token RPAREN404 = null;
      jvmBasicParser.expression_return expression403 = null;
      CommonTree VAL401_tree = null;
      CommonTree LPAREN402_tree = null;
      CommonTree RPAREN404_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:232:8: ( VAL ^ LPAREN expression RPAREN )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:232:10: VAL ^ LPAREN expression RPAREN
         {
            root_0 = (CommonTree) adaptor.nil();
            VAL401 = (Token) match(input, VAL, FOLLOW_VAL_in_valfunc2541);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               VAL401_tree = (CommonTree) adaptor.create(VAL401);
               root_0 = (CommonTree) adaptor.becomeRoot(VAL401_tree, root_0);
            }
            LPAREN402 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_valfunc2544);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LPAREN402_tree = (CommonTree) adaptor.create(LPAREN402);
               adaptor.addChild(root_0, LPAREN402_tree);
            }
            pushFollow(FOLLOW_expression_in_valfunc2546);
            expression403 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression403.getTree());
            }
            RPAREN404 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_valfunc2548);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               RPAREN404_tree = (CommonTree) adaptor.create(RPAREN404);
               adaptor.addChild(root_0, RPAREN404_tree);
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "valfunc"
   // $ANTLR start "var"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:1: var : varname ^ ( varsuffix )? ;
   public final jvmBasicParser.var_return var() throws RecognitionException {
      final jvmBasicParser.var_return retval = new jvmBasicParser.var_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      jvmBasicParser.varname_return varname316 = null;
      jvmBasicParser.varsuffix_return varsuffix317 = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:4: ( varname ^ ( varsuffix )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:6: varname ^ ( varsuffix )?
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_varname_in_var2216);
            varname316 = varname();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               root_0 = (CommonTree) adaptor.becomeRoot(varname316.getTree(), root_0);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:15: ( varsuffix )?
            int alt39 = 2;
            switch (input.LA(1)) {
               case 121:
               case 122: {
                  alt39 = 1;
               }
                  break;
            }
            switch (alt39) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:15: varsuffix
               {
                  pushFollow(FOLLOW_varsuffix_in_var2219);
                  varsuffix317 = varsuffix();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, varsuffix317.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "var"
   // $ANTLR start "vardecl"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:143:1: vardecl : var ( LPAREN exprlist RPAREN )* ;
   public final jvmBasicParser.vardecl_return vardecl() throws RecognitionException {
      final jvmBasicParser.vardecl_return retval = new jvmBasicParser.vardecl_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LPAREN75 = null;
      Token RPAREN77 = null;
      jvmBasicParser.var_return var74 = null;
      jvmBasicParser.exprlist_return exprlist76 = null;
      CommonTree LPAREN75_tree = null;
      CommonTree RPAREN77_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:143:9: ( var ( LPAREN exprlist RPAREN )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:143:11: var ( LPAREN exprlist RPAREN )*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_var_in_vardecl1253);
            var74 = var();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, var74.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:143:15: ( LPAREN exprlist RPAREN )*
            loop6: do {
               int alt6 = 2;
               switch (input.LA(1)) {
                  case LPAREN: {
                     final int LA6_1 = input.LA(2);
                     if ((synpred68_jvmBasic())) {
                        alt6 = 1;
                     }
                  }
                     break;
               }
               switch (alt6) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:143:17: LPAREN exprlist RPAREN
                  {
                     LPAREN75 = (Token) match(input, LPAREN, FOLLOW_LPAREN_in_vardecl1257);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        LPAREN75_tree = (CommonTree) adaptor.create(LPAREN75);
                        adaptor.addChild(root_0, LPAREN75_tree);
                     }
                     pushFollow(FOLLOW_exprlist_in_vardecl1259);
                     exprlist76 = exprlist();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, exprlist76.getTree());
                     }
                     RPAREN77 = (Token) match(input, RPAREN, FOLLOW_RPAREN_in_vardecl1261);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        RPAREN77_tree = (CommonTree) adaptor.create(RPAREN77);
                        adaptor.addChild(root_0, RPAREN77_tree);
                     }
                  }
                     break;
                  default:
                     break loop6;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "vardecl"
   // $ANTLR start "variableassignment"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:148:1: variableassignment : vardecl EQ ^ exprlist ;
   public final jvmBasicParser.variableassignment_return variableassignment() throws RecognitionException {
      final jvmBasicParser.variableassignment_return retval = new jvmBasicParser.variableassignment_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token EQ89 = null;
      jvmBasicParser.vardecl_return vardecl88 = null;
      jvmBasicParser.exprlist_return exprlist90 = null;
      CommonTree EQ89_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:148:20: ( vardecl EQ ^ exprlist )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:148:22: vardecl EQ ^ exprlist
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_vardecl_in_variableassignment1329);
            vardecl88 = vardecl();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, vardecl88.getTree());
            }
            EQ89 = (Token) match(input, EQ, FOLLOW_EQ_in_variableassignment1331);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               EQ89_tree = (CommonTree) adaptor.create(EQ89);
               root_0 = (CommonTree) adaptor.becomeRoot(EQ89_tree, root_0);
            }
            pushFollow(FOLLOW_exprlist_in_variableassignment1334);
            exprlist90 = exprlist();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, exprlist90.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "variableassignment"
   // $ANTLR start "varlist"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:1: varlist : vardecl ( COMMA ! vardecl ^)* ;
   public final jvmBasicParser.varlist_return varlist() throws RecognitionException {
      final jvmBasicParser.varlist_return retval = new jvmBasicParser.varlist_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token COMMA322 = null;
      jvmBasicParser.vardecl_return vardecl321 = null;
      jvmBasicParser.vardecl_return vardecl323 = null;
      final CommonTree COMMA322_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:9: ( vardecl ( COMMA ! vardecl ^)* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:11: vardecl ( COMMA ! vardecl ^)*
         {
            root_0 = (CommonTree) adaptor.nil();
            pushFollow(FOLLOW_vardecl_in_varlist2257);
            vardecl321 = vardecl();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, vardecl321.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:19: ( COMMA ! vardecl ^)*
            loop41: do {
               int alt41 = 2;
               switch (input.LA(1)) {
                  case COMMA: {
                     alt41 = 1;
                  }
                     break;
               }
               switch (alt41) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:20: COMMA ! vardecl ^
                  {
                     COMMA322 = (Token) match(input, COMMA, FOLLOW_COMMA_in_varlist2260);
                     if (state.failed) {
                        return retval;
                     }
                     pushFollow(FOLLOW_vardecl_in_varlist2263);
                     vardecl323 = vardecl();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        root_0 = (CommonTree) adaptor.becomeRoot(vardecl323.getTree(), root_0);
                     }
                  }
                     break;
                  default:
                     break loop41;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "varlist"
   // $ANTLR start "varname"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:1: varname : LETTERS ( LETTERS | '0' .. '9' )* ;
   public final jvmBasicParser.varname_return varname() throws RecognitionException {
      final jvmBasicParser.varname_return retval = new jvmBasicParser.varname_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token LETTERS318 = null;
      Token set319 = null;
      CommonTree LETTERS318_tree = null;
      final CommonTree set319_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:9: ( LETTERS ( LETTERS | '0' .. '9' )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:11: LETTERS ( LETTERS | '0' .. '9' )*
         {
            root_0 = (CommonTree) adaptor.nil();
            LETTERS318 = (Token) match(input, LETTERS, FOLLOW_LETTERS_in_varname2227);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               LETTERS318_tree = (CommonTree) adaptor.create(LETTERS318);
               adaptor.addChild(root_0, LETTERS318_tree);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:19: ( LETTERS | '0' .. '9' )*
            loop40: do {
               int alt40 = 2;
               switch (input.LA(1)) {
                  case LETTERS: {
                     final int LA40_1 = input.LA(2);
                     if ((true)) {
                        alt40 = 1;
                     }
                  }
                     break;
               }
               switch (alt40) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
                  {
                     set319 = (Token) input.LT(1);
                     if (input.LA(1) == LETTERS) {
                        input.consume();
                        if (state.backtracking == 0) {
                           adaptor.addChild(root_0, (CommonTree) adaptor.create(set319));
                        }
                        state.errorRecovery = false;
                        state.failed = false;
                     } else {
                        if (state.backtracking > 0) {
                           state.failed = true;
                           return retval;
                        }
                        final MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                     }
                  }
                     break;
                  default:
                     break loop40;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "varname"
   // $ANTLR start "varsuffix"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:1: varsuffix : ( '$' | '%' ) ;
   public final jvmBasicParser.varsuffix_return varsuffix() throws RecognitionException {
      final jvmBasicParser.varsuffix_return retval = new jvmBasicParser.varsuffix_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token set320 = null;
      final CommonTree set320_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:10: ( ( '$' | '%' ) )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
         {
            root_0 = (CommonTree) adaptor.nil();
            set320 = (Token) input.LT(1);
            if (((input.LA(1) >= 121) && (input.LA(1) <= 122))) {
               input.consume();
               if (state.backtracking == 0) {
                  adaptor.addChild(root_0, (CommonTree) adaptor.create(set320));
               }
               state.errorRecovery = false;
               state.failed = false;
            } else {
               if (state.backtracking > 0) {
                  state.failed = true;
                  return retval;
               }
               final MismatchedSetException mse = new MismatchedSetException(null, input);
               throw mse;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "varsuffix"
   // $ANTLR start "vlinstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:1: vlinstmt : VLIN expression COMMA expression AT expression ;
   public final jvmBasicParser.vlinstmt_return vlinstmt() throws RecognitionException {
      final jvmBasicParser.vlinstmt_return retval = new jvmBasicParser.vlinstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token VLIN240 = null;
      Token COMMA242 = null;
      Token AT244 = null;
      jvmBasicParser.expression_return expression241 = null;
      jvmBasicParser.expression_return expression243 = null;
      jvmBasicParser.expression_return expression245 = null;
      CommonTree VLIN240_tree = null;
      CommonTree COMMA242_tree = null;
      CommonTree AT244_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:9: ( VLIN expression COMMA expression AT expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:11: VLIN expression COMMA expression AT expression
         {
            root_0 = (CommonTree) adaptor.nil();
            VLIN240 = (Token) match(input, VLIN, FOLLOW_VLIN_in_vlinstmt1896);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               VLIN240_tree = (CommonTree) adaptor.create(VLIN240);
               adaptor.addChild(root_0, VLIN240_tree);
            }
            pushFollow(FOLLOW_expression_in_vlinstmt1898);
            expression241 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression241.getTree());
            }
            COMMA242 = (Token) match(input, COMMA, FOLLOW_COMMA_in_vlinstmt1900);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA242_tree = (CommonTree) adaptor.create(COMMA242);
               adaptor.addChild(root_0, COMMA242_tree);
            }
            pushFollow(FOLLOW_expression_in_vlinstmt1902);
            expression243 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression243.getTree());
            }
            AT244 = (Token) match(input, AT, FOLLOW_AT_in_vlinstmt1904);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               AT244_tree = (CommonTree) adaptor.create(AT244);
               adaptor.addChild(root_0, AT244_tree);
            }
            pushFollow(FOLLOW_expression_in_vlinstmt1906);
            expression245 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression245.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "vlinstmt"
   // $ANTLR start "vplotstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:1: vplotstmt : VPLOT ( expression COMMA expression )? ( TO expression COMMA expression )* ;
   public final jvmBasicParser.vplotstmt_return vplotstmt() throws RecognitionException {
      final jvmBasicParser.vplotstmt_return retval = new jvmBasicParser.vplotstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token VPLOT151 = null;
      Token COMMA153 = null;
      Token TO155 = null;
      Token COMMA157 = null;
      jvmBasicParser.expression_return expression152 = null;
      jvmBasicParser.expression_return expression154 = null;
      jvmBasicParser.expression_return expression156 = null;
      jvmBasicParser.expression_return expression158 = null;
      CommonTree VPLOT151_tree = null;
      CommonTree COMMA153_tree = null;
      CommonTree TO155_tree = null;
      CommonTree COMMA157_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:10: ( VPLOT ( expression COMMA expression )? ( TO expression COMMA expression )* )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:12: VPLOT ( expression COMMA expression )? ( TO expression COMMA expression )*
         {
            root_0 = (CommonTree) adaptor.nil();
            VPLOT151 = (Token) match(input, VPLOT, FOLLOW_VPLOT_in_vplotstmt1608);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               VPLOT151_tree = (CommonTree) adaptor.create(VPLOT151);
               adaptor.addChild(root_0, VPLOT151_tree);
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:18: ( expression COMMA expression )?
            int alt21 = 2;
            switch (input.LA(1)) {
               case ABS:
               case ASC:
               case ATN:
               case CHR:
               case COS:
               case EXP:
               case FN:
               case FRE:
               case INTF:
               case LEFT:
               case LEN:
               case LETTERS:
               case LOG:
               case LPAREN:
               case MID:
               case MINUS:
               case NOT:
               case NUMBER:
               case PDL:
               case PEEK:
               case PLUS:
               case POS:
               case RIGHT:
               case RND:
               case SCRN:
               case SGN:
               case SIN:
               case SPC:
               case SQR:
               case STR:
               case STRINGLITERAL:
               case TAN:
               case USR:
               case VAL: {
                  alt21 = 1;
               }
                  break;
            }
            switch (alt21) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:19: expression COMMA expression
               {
                  pushFollow(FOLLOW_expression_in_vplotstmt1611);
                  expression152 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression152.getTree());
                  }
                  COMMA153 = (Token) match(input, COMMA, FOLLOW_COMMA_in_vplotstmt1613);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA153_tree = (CommonTree) adaptor.create(COMMA153);
                     adaptor.addChild(root_0, COMMA153_tree);
                  }
                  pushFollow(FOLLOW_expression_in_vplotstmt1615);
                  expression154 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression154.getTree());
                  }
               }
                  break;
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:49: ( TO expression COMMA expression )*
            loop22: do {
               int alt22 = 2;
               switch (input.LA(1)) {
                  case TO: {
                     alt22 = 1;
                  }
                     break;
               }
               switch (alt22) {
                  case 1:
                  // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:50: TO expression COMMA expression
                  {
                     TO155 = (Token) match(input, TO, FOLLOW_TO_in_vplotstmt1620);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        TO155_tree = (CommonTree) adaptor.create(TO155);
                        adaptor.addChild(root_0, TO155_tree);
                     }
                     pushFollow(FOLLOW_expression_in_vplotstmt1622);
                     expression156 = expression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, expression156.getTree());
                     }
                     COMMA157 = (Token) match(input, COMMA, FOLLOW_COMMA_in_vplotstmt1624);
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        COMMA157_tree = (CommonTree) adaptor.create(COMMA157);
                        adaptor.addChild(root_0, COMMA157_tree);
                     }
                     pushFollow(FOLLOW_expression_in_vplotstmt1626);
                     expression158 = expression();
                     state._fsp--;
                     if (state.failed) {
                        return retval;
                     }
                     if (state.backtracking == 0) {
                        adaptor.addChild(root_0, expression158.getTree());
                     }
                  }
                     break;
                  default:
                     break loop22;
               }
            } while (true);
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "vplotstmt"
   // $ANTLR start "vtabstmnt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:1: vtabstmnt : VTAB expression ;
   public final jvmBasicParser.vtabstmnt_return vtabstmnt() throws RecognitionException {
      final jvmBasicParser.vtabstmnt_return retval = new jvmBasicParser.vtabstmnt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token VTAB175 = null;
      jvmBasicParser.expression_return expression176 = null;
      CommonTree VTAB175_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:11: ( VTAB expression )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:13: VTAB expression
         {
            root_0 = (CommonTree) adaptor.nil();
            VTAB175 = (Token) match(input, VTAB, FOLLOW_VTAB_in_vtabstmnt1687);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               VTAB175_tree = (CommonTree) adaptor.create(VTAB175);
               adaptor.addChild(root_0, VTAB175_tree);
            }
            pushFollow(FOLLOW_expression_in_vtabstmnt1689);
            expression176 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression176.getTree());
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "vtabstmnt"
   // $ANTLR start "waitstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:1: waitstmt : WAIT expression COMMA expression ( COMMA expression )? ;
   public final jvmBasicParser.waitstmt_return waitstmt() throws RecognitionException {
      final jvmBasicParser.waitstmt_return retval = new jvmBasicParser.waitstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token WAIT189 = null;
      Token COMMA191 = null;
      Token COMMA193 = null;
      jvmBasicParser.expression_return expression190 = null;
      jvmBasicParser.expression_return expression192 = null;
      jvmBasicParser.expression_return expression194 = null;
      CommonTree WAIT189_tree = null;
      CommonTree COMMA191_tree = null;
      CommonTree COMMA193_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:9: ( WAIT expression COMMA expression ( COMMA expression )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:11: WAIT expression COMMA expression ( COMMA expression )?
         {
            root_0 = (CommonTree) adaptor.nil();
            WAIT189 = (Token) match(input, WAIT, FOLLOW_WAIT_in_waitstmt1741);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               WAIT189_tree = (CommonTree) adaptor.create(WAIT189);
               adaptor.addChild(root_0, WAIT189_tree);
            }
            pushFollow(FOLLOW_expression_in_waitstmt1743);
            expression190 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression190.getTree());
            }
            COMMA191 = (Token) match(input, COMMA, FOLLOW_COMMA_in_waitstmt1745);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               COMMA191_tree = (CommonTree) adaptor.create(COMMA191);
               adaptor.addChild(root_0, COMMA191_tree);
            }
            pushFollow(FOLLOW_expression_in_waitstmt1747);
            expression192 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression192.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:44: ( COMMA expression )?
            int alt27 = 2;
            switch (input.LA(1)) {
               case COMMA: {
                  alt27 = 1;
               }
                  break;
            }
            switch (alt27) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:45: COMMA expression
               {
                  COMMA193 = (Token) match(input, COMMA, FOLLOW_COMMA_in_waitstmt1750);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA193_tree = (CommonTree) adaptor.create(COMMA193);
                     adaptor.addChild(root_0, COMMA193_tree);
                  }
                  pushFollow(FOLLOW_expression_in_waitstmt1752);
                  expression194 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression194.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }

   // $ANTLR end "waitstmt"
   // $ANTLR start "xdrawstmt"
   // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:1: xdrawstmt : XDRAW expression ( AT expression COMMA expression )? ;
   public final jvmBasicParser.xdrawstmt_return xdrawstmt() throws RecognitionException {
      final jvmBasicParser.xdrawstmt_return retval = new jvmBasicParser.xdrawstmt_return();
      retval.start = input.LT(1);
      CommonTree root_0 = null;
      Token XDRAW195 = null;
      Token AT197 = null;
      Token COMMA199 = null;
      jvmBasicParser.expression_return expression196 = null;
      jvmBasicParser.expression_return expression198 = null;
      jvmBasicParser.expression_return expression200 = null;
      CommonTree XDRAW195_tree = null;
      CommonTree AT197_tree = null;
      CommonTree COMMA199_tree = null;
      try {
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:10: ( XDRAW expression ( AT expression COMMA expression )? )
         // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:12: XDRAW expression ( AT expression COMMA expression )?
         {
            root_0 = (CommonTree) adaptor.nil();
            XDRAW195 = (Token) match(input, XDRAW, FOLLOW_XDRAW_in_xdrawstmt1760);
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               XDRAW195_tree = (CommonTree) adaptor.create(XDRAW195);
               adaptor.addChild(root_0, XDRAW195_tree);
            }
            pushFollow(FOLLOW_expression_in_xdrawstmt1762);
            expression196 = expression();
            state._fsp--;
            if (state.failed) {
               return retval;
            }
            if (state.backtracking == 0) {
               adaptor.addChild(root_0, expression196.getTree());
            }
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:29: ( AT expression COMMA expression )?
            int alt28 = 2;
            switch (input.LA(1)) {
               case AT: {
                  alt28 = 1;
               }
                  break;
            }
            switch (alt28) {
               case 1:
               // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:30: AT expression COMMA expression
               {
                  AT197 = (Token) match(input, AT, FOLLOW_AT_in_xdrawstmt1765);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     AT197_tree = (CommonTree) adaptor.create(AT197);
                     adaptor.addChild(root_0, AT197_tree);
                  }
                  pushFollow(FOLLOW_expression_in_xdrawstmt1767);
                  expression198 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression198.getTree());
                  }
                  COMMA199 = (Token) match(input, COMMA, FOLLOW_COMMA_in_xdrawstmt1769);
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     COMMA199_tree = (CommonTree) adaptor.create(COMMA199);
                     adaptor.addChild(root_0, COMMA199_tree);
                  }
                  pushFollow(FOLLOW_expression_in_xdrawstmt1771);
                  expression200 = expression();
                  state._fsp--;
                  if (state.failed) {
                     return retval;
                  }
                  if (state.backtracking == 0) {
                     adaptor.addChild(root_0, expression200.getTree());
                  }
               }
                  break;
            }
         }
         retval.stop = input.LT(-1);
         if (state.backtracking == 0) {
            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
         }
      } catch (final RecognitionException re) {
         reportError(re);
         recover(input, re);
         retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      } finally {
         // do for sure before leaving
      }
      return retval;
   }
   // $ANTLR end "xdrawstmt"
}