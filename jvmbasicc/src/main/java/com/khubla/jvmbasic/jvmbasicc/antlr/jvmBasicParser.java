// $ANTLR 3.4 com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g 2013-01-01 19:36:35

    package com.khubla.jvmbasic.jvmbasicc.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class jvmBasicParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AMPERSAND", "AND", "ASC", "AT", "ATN", "CALL", "CHR", "CLEAR", "COLON", "COLOR", "COMMA", "COS", "CR", "DATA", "DEF", "DIGIT", "DIM", "DIV", "DRAW", "END", "EQ", "EXP", "EXPONENT", "FLASH", "FLOAT", "FN", "FOR", "FRE", "GET", "GOSUB", "GOTO", "GR", "GT", "GTE", "HCOLOR", "HGR", "HGR2", "HIMEM", "HLIN", "HOME", "HPLOT", "HTAB", "IF", "INCLUDE", "INNUMBER", "INPUT", "INTF", "INVERSE", "LEFT", "LEN", "LET", "LETTERS", "LIST", "LOAD", "LOG", "LOMEM", "LPAREN", "LT", "LTE", "MID", "MINUS", "NEQ", "NEXT", "NORMAL", "NOT", "NOTRACE", "NUMBER", "ON", "ONERR", "OR", "PDL", "PEEK", "PLOT", "PLUS", "POKE", "POP", "POS", "PRINT", "PRNUMBER", "QUESTION", "READ", "RECALL", "REM", "RESTORE", "RETURN", "RIGHT", "RND", "ROT", "RPAREN", "RUN", "SAVE", "SCALE", "SCRN", "SEMICOLON", "SGN", "SHLOAD", "SIN", "SPC", "SPEED", "SQR", "STEP", "STOP", "STORE", "STR", "STRINGLITERAL", "TAB", "TAN", "TEXT", "THEN", "TIMES", "TO", "TRACE", "USR", "VAL", "VLIN", "VPLOT", "VTAB", "WAIT", "WS", "XDRAW", "'$'", "'%'"
    };

    public static final int EOF=-1;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int ABS=4;
    public static final int AMPERSAND=5;
    public static final int AND=6;
    public static final int ASC=7;
    public static final int AT=8;
    public static final int ATN=9;
    public static final int CALL=10;
    public static final int CHR=11;
    public static final int CLEAR=12;
    public static final int COLON=13;
    public static final int COLOR=14;
    public static final int COMMA=15;
    public static final int COS=16;
    public static final int CR=17;
    public static final int DATA=18;
    public static final int DEF=19;
    public static final int DIGIT=20;
    public static final int DIM=21;
    public static final int DIV=22;
    public static final int DRAW=23;
    public static final int END=24;
    public static final int EQ=25;
    public static final int EXP=26;
    public static final int EXPONENT=27;
    public static final int FLASH=28;
    public static final int FLOAT=29;
    public static final int FN=30;
    public static final int FOR=31;
    public static final int FRE=32;
    public static final int GET=33;
    public static final int GOSUB=34;
    public static final int GOTO=35;
    public static final int GR=36;
    public static final int GT=37;
    public static final int GTE=38;
    public static final int HCOLOR=39;
    public static final int HGR=40;
    public static final int HGR2=41;
    public static final int HIMEM=42;
    public static final int HLIN=43;
    public static final int HOME=44;
    public static final int HPLOT=45;
    public static final int HTAB=46;
    public static final int IF=47;
    public static final int INCLUDE=48;
    public static final int INNUMBER=49;
    public static final int INPUT=50;
    public static final int INTF=51;
    public static final int INVERSE=52;
    public static final int LEFT=53;
    public static final int LEN=54;
    public static final int LET=55;
    public static final int LETTERS=56;
    public static final int LIST=57;
    public static final int LOAD=58;
    public static final int LOG=59;
    public static final int LOMEM=60;
    public static final int LPAREN=61;
    public static final int LT=62;
    public static final int LTE=63;
    public static final int MID=64;
    public static final int MINUS=65;
    public static final int NEQ=66;
    public static final int NEXT=67;
    public static final int NORMAL=68;
    public static final int NOT=69;
    public static final int NOTRACE=70;
    public static final int NUMBER=71;
    public static final int ON=72;
    public static final int ONERR=73;
    public static final int OR=74;
    public static final int PDL=75;
    public static final int PEEK=76;
    public static final int PLOT=77;
    public static final int PLUS=78;
    public static final int POKE=79;
    public static final int POP=80;
    public static final int POS=81;
    public static final int PRINT=82;
    public static final int PRNUMBER=83;
    public static final int QUESTION=84;
    public static final int READ=85;
    public static final int RECALL=86;
    public static final int REM=87;
    public static final int RESTORE=88;
    public static final int RETURN=89;
    public static final int RIGHT=90;
    public static final int RND=91;
    public static final int ROT=92;
    public static final int RPAREN=93;
    public static final int RUN=94;
    public static final int SAVE=95;
    public static final int SCALE=96;
    public static final int SCRN=97;
    public static final int SEMICOLON=98;
    public static final int SGN=99;
    public static final int SHLOAD=100;
    public static final int SIN=101;
    public static final int SPC=102;
    public static final int SPEED=103;
    public static final int SQR=104;
    public static final int STEP=105;
    public static final int STOP=106;
    public static final int STORE=107;
    public static final int STR=108;
    public static final int STRINGLITERAL=109;
    public static final int TAB=110;
    public static final int TAN=111;
    public static final int TEXT=112;
    public static final int THEN=113;
    public static final int TIMES=114;
    public static final int TO=115;
    public static final int TRACE=116;
    public static final int USR=117;
    public static final int VAL=118;
    public static final int VLIN=119;
    public static final int VPLOT=120;
    public static final int VTAB=121;
    public static final int WAIT=122;
    public static final int WS=123;
    public static final int XDRAW=124;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public jvmBasicParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public jvmBasicParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return jvmBasicParser.tokenNames; }
    public String getGrammarFileName() { return "com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:1: prog : ( line )+ ;
    public final jvmBasicParser.prog_return prog() throws RecognitionException {
        jvmBasicParser.prog_return retval = new jvmBasicParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.line_return line1 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:6: ( ( line )+ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:8: ( line )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:8: ( line )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case NUMBER:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:156:8: line
            	    {
            	    pushFollow(FOLLOW_line_in_prog995);
            	    line1=line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:1: line : linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !;
    public final jvmBasicParser.line_return line() throws RecognitionException {
        jvmBasicParser.line_return retval = new jvmBasicParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COLON4=null;
        Token set6=null;
        jvmBasicParser.linenumber_return linenumber2 =null;

        jvmBasicParser.amprstmt_return amprstmt3 =null;

        jvmBasicParser.amprstmt_return amprstmt5 =null;


        CommonTree COLON4_tree=null;
        CommonTree set6_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:6: ( linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !)
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:8: linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_linenumber_in_line1007);
            linenumber2=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(linenumber2.getTree(), root_0);

            pushFollow(FOLLOW_amprstmt_in_line1011);
            amprstmt3=amprstmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, amprstmt3.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:30: ( COLON ( amprstmt )? )*
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case COLON:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:31: COLON ( amprstmt )?
            	    {
            	    COLON4=(Token)match(input,COLON,FOLLOW_COLON_in_line1014); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COLON4_tree = 
            	    (CommonTree)adaptor.create(COLON4)
            	    ;
            	    adaptor.addChild(root_0, COLON4_tree);
            	    }

            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:37: ( amprstmt )?
            	    int alt2=2;
            	    switch ( input.LA(1) ) {
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
            	        case INCLUDE:
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
            	        case XDRAW:
            	            {
            	            alt2=1;
            	            }
            	            break;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:37: amprstmt
            	            {
            	            pushFollow(FOLLOW_amprstmt_in_line1016);
            	            amprstmt5=amprstmt();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, amprstmt5.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            set6=(Token)input.LT(1);

            if ( input.LA(1)==EOF||input.LA(1)==CR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "line"


    public static class amperoper_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "amperoper"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:1: amperoper : AMPERSAND ;
    public final jvmBasicParser.amperoper_return amperoper() throws RecognitionException {
        jvmBasicParser.amperoper_return retval = new jvmBasicParser.amperoper_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AMPERSAND7=null;

        CommonTree AMPERSAND7_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:10: ( AMPERSAND )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:12: AMPERSAND
            {
            root_0 = (CommonTree)adaptor.nil();


            AMPERSAND7=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_amperoper1034); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AMPERSAND7_tree = 
            (CommonTree)adaptor.create(AMPERSAND7)
            ;
            adaptor.addChild(root_0, AMPERSAND7_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "amperoper"


    public static class linenumber_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "linenumber"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:1: linenumber : NUMBER ;
    public final jvmBasicParser.linenumber_return linenumber() throws RecognitionException {
        jvmBasicParser.linenumber_return retval = new jvmBasicParser.linenumber_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NUMBER8=null;

        CommonTree NUMBER8_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:11: ( NUMBER )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:13: NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();


            NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_linenumber1040); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER8_tree = 
            (CommonTree)adaptor.create(NUMBER8)
            ;
            adaptor.addChild(root_0, NUMBER8_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "linenumber"


    public static class amprstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "amprstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:1: amprstmt : ( amperoper )? statement ^;
    public final jvmBasicParser.amprstmt_return amprstmt() throws RecognitionException {
        jvmBasicParser.amprstmt_return retval = new jvmBasicParser.amprstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.amperoper_return amperoper9 =null;

        jvmBasicParser.statement_return statement10 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:9: ( ( amperoper )? statement ^)
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:11: ( amperoper )? statement ^
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:11: ( amperoper )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case AMPERSAND:
                    {
                    int LA4_1 = input.LA(2);

                    if ( (synpred5_jvmBasic()) ) {
                        alt4=1;
                    }
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:11: amperoper
                    {
                    pushFollow(FOLLOW_amperoper_in_amprstmt1046);
                    amperoper9=amperoper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, amperoper9.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_statement_in_amprstmt1049);
            statement10=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(statement10.getTree(), root_0);

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "amprstmt"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:1: statement : ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt | hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt | includestmt );
    public final jvmBasicParser.statement_return statement() throws RecognitionException {
        jvmBasicParser.statement_return retval = new jvmBasicParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOAD11=null;
        Token SAVE12=null;
        Token RESTORE13=null;
        Token TRACE14=null;
        Token NOTRACE15=null;
        Token FLASH16=null;
        Token INVERSE17=null;
        Token GR18=null;
        Token NORMAL19=null;
        Token SHLOAD20=null;
        Token RETURN21=null;
        Token CLEAR22=null;
        Token RUN23=null;
        Token END24=null;
        Token STOP25=null;
        Token TEXT26=null;
        Token HOME27=null;
        Token HGR28=null;
        Token HGR229=null;
        jvmBasicParser.amptstmt_return amptstmt30 =null;

        jvmBasicParser.popstmt_return popstmt31 =null;

        jvmBasicParser.liststmt_return liststmt32 =null;

        jvmBasicParser.storestmt_return storestmt33 =null;

        jvmBasicParser.getstmt_return getstmt34 =null;

        jvmBasicParser.recallstmt_return recallstmt35 =null;

        jvmBasicParser.instmt_return instmt36 =null;

        jvmBasicParser.prstmt_return prstmt37 =null;

        jvmBasicParser.onerrstmt_return onerrstmt38 =null;

        jvmBasicParser.hlinstmt_return hlinstmt39 =null;

        jvmBasicParser.vlinstmt_return vlinstmt40 =null;

        jvmBasicParser.colorstmt_return colorstmt41 =null;

        jvmBasicParser.speedstmt_return speedstmt42 =null;

        jvmBasicParser.scalestmt_return scalestmt43 =null;

        jvmBasicParser.rotstmt_return rotstmt44 =null;

        jvmBasicParser.hcolorstmt_return hcolorstmt45 =null;

        jvmBasicParser.himemstmt_return himemstmt46 =null;

        jvmBasicParser.lomemstmt_return lomemstmt47 =null;

        jvmBasicParser.printstmt1_return printstmt148 =null;

        jvmBasicParser.pokestmt_return pokestmt49 =null;

        jvmBasicParser.plotstmt_return plotstmt50 =null;

        jvmBasicParser.ongotostmt_return ongotostmt51 =null;

        jvmBasicParser.ongosubstmt_return ongosubstmt52 =null;

        jvmBasicParser.ifstmt_return ifstmt53 =null;

        jvmBasicParser.comment_return comment54 =null;

        jvmBasicParser.nextstmt_return nextstmt55 =null;

        jvmBasicParser.forstmt_return forstmt56 =null;

        jvmBasicParser.inputstmt_return inputstmt57 =null;

        jvmBasicParser.tabstmt_return tabstmt58 =null;

        jvmBasicParser.dimstmt_return dimstmt59 =null;

        jvmBasicParser.gotostmt_return gotostmt60 =null;

        jvmBasicParser.gosubstmt_return gosubstmt61 =null;

        jvmBasicParser.callstmt_return callstmt62 =null;

        jvmBasicParser.readstmt_return readstmt63 =null;

        jvmBasicParser.hplotstmt_return hplotstmt64 =null;

        jvmBasicParser.vplotstmt_return vplotstmt65 =null;

        jvmBasicParser.vtabstmnt_return vtabstmnt66 =null;

        jvmBasicParser.htabstmnt_return htabstmnt67 =null;

        jvmBasicParser.waitstmt_return waitstmt68 =null;

        jvmBasicParser.datastmt_return datastmt69 =null;

        jvmBasicParser.xdrawstmt_return xdrawstmt70 =null;

        jvmBasicParser.drawstmt_return drawstmt71 =null;

        jvmBasicParser.defstmt_return defstmt72 =null;

        jvmBasicParser.letstmt_return letstmt73 =null;

        jvmBasicParser.includestmt_return includestmt74 =null;


        CommonTree LOAD11_tree=null;
        CommonTree SAVE12_tree=null;
        CommonTree RESTORE13_tree=null;
        CommonTree TRACE14_tree=null;
        CommonTree NOTRACE15_tree=null;
        CommonTree FLASH16_tree=null;
        CommonTree INVERSE17_tree=null;
        CommonTree GR18_tree=null;
        CommonTree NORMAL19_tree=null;
        CommonTree SHLOAD20_tree=null;
        CommonTree RETURN21_tree=null;
        CommonTree CLEAR22_tree=null;
        CommonTree RUN23_tree=null;
        CommonTree END24_tree=null;
        CommonTree STOP25_tree=null;
        CommonTree TEXT26_tree=null;
        CommonTree HOME27_tree=null;
        CommonTree HGR28_tree=null;
        CommonTree HGR229_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:11: ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt | hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt | includestmt )
            int alt5=64;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:13: LOAD
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LOAD11=(Token)match(input,LOAD,FOLLOW_LOAD_in_statement1057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOAD11_tree = 
                    (CommonTree)adaptor.create(LOAD11)
                    ;
                    adaptor.addChild(root_0, LOAD11_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:20: SAVE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SAVE12=(Token)match(input,SAVE,FOLLOW_SAVE_in_statement1061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAVE12_tree = 
                    (CommonTree)adaptor.create(SAVE12)
                    ;
                    adaptor.addChild(root_0, SAVE12_tree);
                    }

                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:27: RESTORE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    RESTORE13=(Token)match(input,RESTORE,FOLLOW_RESTORE_in_statement1065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RESTORE13_tree = 
                    (CommonTree)adaptor.create(RESTORE13)
                    ;
                    adaptor.addChild(root_0, RESTORE13_tree);
                    }

                    }
                    break;
                case 4 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:37: TRACE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TRACE14=(Token)match(input,TRACE,FOLLOW_TRACE_in_statement1069); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRACE14_tree = 
                    (CommonTree)adaptor.create(TRACE14)
                    ;
                    adaptor.addChild(root_0, TRACE14_tree);
                    }

                    }
                    break;
                case 5 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:44: NOTRACE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOTRACE15=(Token)match(input,NOTRACE,FOLLOW_NOTRACE_in_statement1072); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOTRACE15_tree = 
                    (CommonTree)adaptor.create(NOTRACE15)
                    ;
                    adaptor.addChild(root_0, NOTRACE15_tree);
                    }

                    }
                    break;
                case 6 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:54: FLASH
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLASH16=(Token)match(input,FLASH,FOLLOW_FLASH_in_statement1076); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLASH16_tree = 
                    (CommonTree)adaptor.create(FLASH16)
                    ;
                    adaptor.addChild(root_0, FLASH16_tree);
                    }

                    }
                    break;
                case 7 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:62: INVERSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INVERSE17=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_statement1080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INVERSE17_tree = 
                    (CommonTree)adaptor.create(INVERSE17)
                    ;
                    adaptor.addChild(root_0, INVERSE17_tree);
                    }

                    }
                    break;
                case 8 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:71: GR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GR18=(Token)match(input,GR,FOLLOW_GR_in_statement1083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GR18_tree = 
                    (CommonTree)adaptor.create(GR18)
                    ;
                    adaptor.addChild(root_0, GR18_tree);
                    }

                    }
                    break;
                case 9 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:75: NORMAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NORMAL19=(Token)match(input,NORMAL,FOLLOW_NORMAL_in_statement1086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NORMAL19_tree = 
                    (CommonTree)adaptor.create(NORMAL19)
                    ;
                    adaptor.addChild(root_0, NORMAL19_tree);
                    }

                    }
                    break;
                case 10 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:84: SHLOAD
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SHLOAD20=(Token)match(input,SHLOAD,FOLLOW_SHLOAD_in_statement1090); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHLOAD20_tree = 
                    (CommonTree)adaptor.create(SHLOAD20)
                    ;
                    adaptor.addChild(root_0, SHLOAD20_tree);
                    }

                    }
                    break;
                case 11 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:93: RETURN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    RETURN21=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN21_tree = 
                    (CommonTree)adaptor.create(RETURN21)
                    ;
                    adaptor.addChild(root_0, RETURN21_tree);
                    }

                    }
                    break;
                case 12 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:102: CLEAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CLEAR22=(Token)match(input,CLEAR,FOLLOW_CLEAR_in_statement1098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLEAR22_tree = 
                    (CommonTree)adaptor.create(CLEAR22)
                    ;
                    adaptor.addChild(root_0, CLEAR22_tree);
                    }

                    }
                    break;
                case 13 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:110: RUN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    RUN23=(Token)match(input,RUN,FOLLOW_RUN_in_statement1102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RUN23_tree = 
                    (CommonTree)adaptor.create(RUN23)
                    ;
                    adaptor.addChild(root_0, RUN23_tree);
                    }

                    }
                    break;
                case 14 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:116: END ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END24=(Token)match(input,END,FOLLOW_END_in_statement1106); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END24_tree = 
                    (CommonTree)adaptor.create(END24)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(END24_tree, root_0);
                    }

                    }
                    break;
                case 15 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:123: STOP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STOP25=(Token)match(input,STOP,FOLLOW_STOP_in_statement1111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STOP25_tree = 
                    (CommonTree)adaptor.create(STOP25)
                    ;
                    adaptor.addChild(root_0, STOP25_tree);
                    }

                    }
                    break;
                case 16 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:130: TEXT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TEXT26=(Token)match(input,TEXT,FOLLOW_TEXT_in_statement1115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TEXT26_tree = 
                    (CommonTree)adaptor.create(TEXT26)
                    ;
                    adaptor.addChild(root_0, TEXT26_tree);
                    }

                    }
                    break;
                case 17 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:137: HOME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HOME27=(Token)match(input,HOME,FOLLOW_HOME_in_statement1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HOME27_tree = 
                    (CommonTree)adaptor.create(HOME27)
                    ;
                    adaptor.addChild(root_0, HOME27_tree);
                    }

                    }
                    break;
                case 18 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:144: HGR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HGR28=(Token)match(input,HGR,FOLLOW_HGR_in_statement1123); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HGR28_tree = 
                    (CommonTree)adaptor.create(HGR28)
                    ;
                    adaptor.addChild(root_0, HGR28_tree);
                    }

                    }
                    break;
                case 19 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:150: HGR2
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HGR229=(Token)match(input,HGR2,FOLLOW_HGR2_in_statement1127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HGR229_tree = 
                    (CommonTree)adaptor.create(HGR229)
                    ;
                    adaptor.addChild(root_0, HGR229_tree);
                    }

                    }
                    break;
                case 20 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:156: amptstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_amptstmt_in_statement1130);
                    amptstmt30=amptstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, amptstmt30.getTree());

                    }
                    break;
                case 21 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:166: popstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_popstmt_in_statement1133);
                    popstmt31=popstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, popstmt31.getTree());

                    }
                    break;
                case 22 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:176: liststmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_liststmt_in_statement1137);
                    liststmt32=liststmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, liststmt32.getTree());

                    }
                    break;
                case 23 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:186: storestmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_storestmt_in_statement1140);
                    storestmt33=storestmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, storestmt33.getTree());

                    }
                    break;
                case 24 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:197: getstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_getstmt_in_statement1143);
                    getstmt34=getstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getstmt34.getTree());

                    }
                    break;
                case 25 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:207: recallstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recallstmt_in_statement1147);
                    recallstmt35=recallstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recallstmt35.getTree());

                    }
                    break;
                case 26 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:219: instmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_instmt_in_statement1150);
                    instmt36=instmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instmt36.getTree());

                    }
                    break;
                case 27 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:227: prstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_prstmt_in_statement1153);
                    prstmt37=prstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prstmt37.getTree());

                    }
                    break;
                case 28 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:235: onerrstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_onerrstmt_in_statement1156);
                    onerrstmt38=onerrstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, onerrstmt38.getTree());

                    }
                    break;
                case 29 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:246: hlinstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_hlinstmt_in_statement1159);
                    hlinstmt39=hlinstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hlinstmt39.getTree());

                    }
                    break;
                case 30 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:255: vlinstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vlinstmt_in_statement1161);
                    vlinstmt40=vlinstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vlinstmt40.getTree());

                    }
                    break;
                case 31 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:264: colorstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_colorstmt_in_statement1163);
                    colorstmt41=colorstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, colorstmt41.getTree());

                    }
                    break;
                case 32 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:275: speedstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_speedstmt_in_statement1166);
                    speedstmt42=speedstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, speedstmt42.getTree());

                    }
                    break;
                case 33 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:286: scalestmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_scalestmt_in_statement1169);
                    scalestmt43=scalestmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalestmt43.getTree());

                    }
                    break;
                case 34 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:296: rotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rotstmt_in_statement1171);
                    rotstmt44=rotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rotstmt44.getTree());

                    }
                    break;
                case 35 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:305: hcolorstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_hcolorstmt_in_statement1174);
                    hcolorstmt45=hcolorstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hcolorstmt45.getTree());

                    }
                    break;
                case 36 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:317: himemstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_himemstmt_in_statement1177);
                    himemstmt46=himemstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, himemstmt46.getTree());

                    }
                    break;
                case 37 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:328: lomemstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lomemstmt_in_statement1180);
                    lomemstmt47=lomemstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lomemstmt47.getTree());

                    }
                    break;
                case 38 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:340: printstmt1
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_printstmt1_in_statement1184);
                    printstmt148=printstmt1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printstmt148.getTree());

                    }
                    break;
                case 39 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:352: pokestmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_pokestmt_in_statement1187);
                    pokestmt49=pokestmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pokestmt49.getTree());

                    }
                    break;
                case 40 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:363: plotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_plotstmt_in_statement1191);
                    plotstmt50=plotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, plotstmt50.getTree());

                    }
                    break;
                case 41 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:373: ongotostmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ongotostmt_in_statement1194);
                    ongotostmt51=ongotostmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ongotostmt51.getTree());

                    }
                    break;
                case 42 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:385: ongosubstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ongosubstmt_in_statement1197);
                    ongosubstmt52=ongosubstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ongosubstmt52.getTree());

                    }
                    break;
                case 43 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:398: ifstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ifstmt_in_statement1200);
                    ifstmt53=ifstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifstmt53.getTree());

                    }
                    break;
                case 44 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:407: comment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_comment_in_statement1204);
                    comment54=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment54.getTree());

                    }
                    break;
                case 45 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:416: nextstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_nextstmt_in_statement1207);
                    nextstmt55=nextstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nextstmt55.getTree());

                    }
                    break;
                case 46 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:426: forstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_forstmt_in_statement1210);
                    forstmt56=forstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forstmt56.getTree());

                    }
                    break;
                case 47 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:436: inputstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_inputstmt_in_statement1214);
                    inputstmt57=inputstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inputstmt57.getTree());

                    }
                    break;
                case 48 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:448: tabstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tabstmt_in_statement1218);
                    tabstmt58=tabstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tabstmt58.getTree());

                    }
                    break;
                case 49 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:458: dimstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dimstmt_in_statement1222);
                    dimstmt59=dimstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dimstmt59.getTree());

                    }
                    break;
                case 50 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:468: gotostmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_gotostmt_in_statement1226);
                    gotostmt60=gotostmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gotostmt60.getTree());

                    }
                    break;
                case 51 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:479: gosubstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_gosubstmt_in_statement1230);
                    gosubstmt61=gosubstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gosubstmt61.getTree());

                    }
                    break;
                case 52 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:491: callstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_callstmt_in_statement1234);
                    callstmt62=callstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callstmt62.getTree());

                    }
                    break;
                case 53 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:501: readstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_readstmt_in_statement1237);
                    readstmt63=readstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, readstmt63.getTree());

                    }
                    break;
                case 54 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:511: hplotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_hplotstmt_in_statement1240);
                    hplotstmt64=hplotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hplotstmt64.getTree());

                    }
                    break;
                case 55 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:523: vplotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vplotstmt_in_statement1244);
                    vplotstmt65=vplotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vplotstmt65.getTree());

                    }
                    break;
                case 56 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:535: vtabstmnt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vtabstmnt_in_statement1248);
                    vtabstmnt66=vtabstmnt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vtabstmnt66.getTree());

                    }
                    break;
                case 57 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:546: htabstmnt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_htabstmnt_in_statement1251);
                    htabstmnt67=htabstmnt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, htabstmnt67.getTree());

                    }
                    break;
                case 58 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:556: waitstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_waitstmt_in_statement1253);
                    waitstmt68=waitstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, waitstmt68.getTree());

                    }
                    break;
                case 59 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:566: datastmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datastmt_in_statement1256);
                    datastmt69=datastmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datastmt69.getTree());

                    }
                    break;
                case 60 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:576: xdrawstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_xdrawstmt_in_statement1259);
                    xdrawstmt70=xdrawstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, xdrawstmt70.getTree());

                    }
                    break;
                case 61 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:588: drawstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_drawstmt_in_statement1263);
                    drawstmt71=drawstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, drawstmt71.getTree());

                    }
                    break;
                case 62 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:598: defstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_defstmt_in_statement1266);
                    defstmt72=defstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defstmt72.getTree());

                    }
                    break;
                case 63 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:607: letstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_letstmt_in_statement1269);
                    letstmt73=letstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, letstmt73.getTree());

                    }
                    break;
                case 64 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:617: includestmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_includestmt_in_statement1273);
                    includestmt74=includestmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, includestmt74.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class vardecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vardecl"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:1: vardecl : var ( LPAREN exprlist RPAREN )* ;
    public final jvmBasicParser.vardecl_return vardecl() throws RecognitionException {
        jvmBasicParser.vardecl_return retval = new jvmBasicParser.vardecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN76=null;
        Token RPAREN78=null;
        jvmBasicParser.var_return var75 =null;

        jvmBasicParser.exprlist_return exprlist77 =null;


        CommonTree LPAREN76_tree=null;
        CommonTree RPAREN78_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:9: ( var ( LPAREN exprlist RPAREN )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:11: var ( LPAREN exprlist RPAREN )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_in_vardecl1280);
            var75=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var75.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:15: ( LPAREN exprlist RPAREN )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    int LA6_1 = input.LA(2);

                    if ( (synpred69_jvmBasic()) ) {
                        alt6=1;
                    }


                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:17: LPAREN exprlist RPAREN
            	    {
            	    LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_vardecl1284); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LPAREN76_tree = 
            	    (CommonTree)adaptor.create(LPAREN76)
            	    ;
            	    adaptor.addChild(root_0, LPAREN76_tree);
            	    }

            	    pushFollow(FOLLOW_exprlist_in_vardecl1286);
            	    exprlist77=exprlist();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist77.getTree());

            	    RPAREN78=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_vardecl1288); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RPAREN78_tree = 
            	    (CommonTree)adaptor.create(RPAREN78)
            	    ;
            	    adaptor.addChild(root_0, RPAREN78_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vardecl"


    public static class printstmt1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printstmt1"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:1: printstmt1 : ( PRINT | QUESTION ) ^ ( printlist )? ;
    public final jvmBasicParser.printstmt1_return printstmt1() throws RecognitionException {
        jvmBasicParser.printstmt1_return retval = new jvmBasicParser.printstmt1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set79=null;
        jvmBasicParser.printlist_return printlist80 =null;


        CommonTree set79_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:11: ( ( PRINT | QUESTION ) ^ ( printlist )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:13: ( PRINT | QUESTION ) ^ ( printlist )?
            {
            root_0 = (CommonTree)adaptor.nil();


            set79=(Token)input.LT(1);

            set79=(Token)input.LT(1);

            if ( input.LA(1)==PRINT||input.LA(1)==QUESTION ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(set79)
                , root_0);
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:33: ( printlist )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case ABS:
                case ASC:
                case ATN:
                case CHR:
                case COS:
                case EXP:
                case FLOAT:
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
                case VAL:
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:33: printlist
                    {
                    pushFollow(FOLLOW_printlist_in_printstmt11305);
                    printlist80=printlist();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printlist80.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printstmt1"


    public static class printlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printlist"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:1: printlist : expression ( COMMA ^| SEMICOLON ^)? ( printlist )* ;
    public final jvmBasicParser.printlist_return printlist() throws RecognitionException {
        jvmBasicParser.printlist_return retval = new jvmBasicParser.printlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA82=null;
        Token SEMICOLON83=null;
        jvmBasicParser.expression_return expression81 =null;

        jvmBasicParser.printlist_return printlist84 =null;


        CommonTree COMMA82_tree=null;
        CommonTree SEMICOLON83_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:11: ( expression ( COMMA ^| SEMICOLON ^)? ( printlist )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:13: expression ( COMMA ^| SEMICOLON ^)? ( printlist )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_printlist1313);
            expression81=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression81.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:24: ( COMMA ^| SEMICOLON ^)?
            int alt8=3;
            switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt8=1;
                    }
                    break;
                case SEMICOLON:
                    {
                    alt8=2;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:25: COMMA ^
                    {
                    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_printlist1316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA82_tree = 
                    (CommonTree)adaptor.create(COMMA82)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(COMMA82_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:34: SEMICOLON ^
                    {
                    SEMICOLON83=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_printlist1321); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON83_tree = 
                    (CommonTree)adaptor.create(SEMICOLON83)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(SEMICOLON83_tree, root_0);
                    }

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:47: ( printlist )*
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case ABS:
                case ASC:
                case ATN:
                case CHR:
                case COS:
                case EXP:
                case FLOAT:
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
                case VAL:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (synpred74_jvmBasic()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:47: printlist
            	    {
            	    pushFollow(FOLLOW_printlist_in_printlist1326);
            	    printlist84=printlist();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, printlist84.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printlist"


    public static class getstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "getstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:1: getstmt : GET exprlist ;
    public final jvmBasicParser.getstmt_return getstmt() throws RecognitionException {
        jvmBasicParser.getstmt_return retval = new jvmBasicParser.getstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GET85=null;
        jvmBasicParser.exprlist_return exprlist86 =null;


        CommonTree GET85_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:9: ( GET exprlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:11: GET exprlist
            {
            root_0 = (CommonTree)adaptor.nil();


            GET85=(Token)match(input,GET,FOLLOW_GET_in_getstmt1336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GET85_tree = 
            (CommonTree)adaptor.create(GET85)
            ;
            adaptor.addChild(root_0, GET85_tree);
            }

            pushFollow(FOLLOW_exprlist_in_getstmt1338);
            exprlist86=exprlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist86.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "getstmt"


    public static class letstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "letstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:1: letstmt : ( LET ^)? variableassignment ;
    public final jvmBasicParser.letstmt_return letstmt() throws RecognitionException {
        jvmBasicParser.letstmt_return retval = new jvmBasicParser.letstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LET87=null;
        jvmBasicParser.variableassignment_return variableassignment88 =null;


        CommonTree LET87_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:9: ( ( LET ^)? variableassignment )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:11: ( LET ^)? variableassignment
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:14: ( LET ^)?
            int alt10=2;
            switch ( input.LA(1) ) {
                case LET:
                    {
                    alt10=1;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:14: LET ^
                    {
                    LET87=(Token)match(input,LET,FOLLOW_LET_in_letstmt1345); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LET87_tree = 
                    (CommonTree)adaptor.create(LET87)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LET87_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_variableassignment_in_letstmt1349);
            variableassignment88=variableassignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableassignment88.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "letstmt"


    public static class variableassignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableassignment"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:1: variableassignment : vardecl EQ ^ exprlist ;
    public final jvmBasicParser.variableassignment_return variableassignment() throws RecognitionException {
        jvmBasicParser.variableassignment_return retval = new jvmBasicParser.variableassignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ90=null;
        jvmBasicParser.vardecl_return vardecl89 =null;

        jvmBasicParser.exprlist_return exprlist91 =null;


        CommonTree EQ90_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:20: ( vardecl EQ ^ exprlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:22: vardecl EQ ^ exprlist
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_vardecl_in_variableassignment1356);
            vardecl89=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl89.getTree());

            EQ90=(Token)match(input,EQ,FOLLOW_EQ_in_variableassignment1358); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ90_tree = 
            (CommonTree)adaptor.create(EQ90)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(EQ90_tree, root_0);
            }

            pushFollow(FOLLOW_exprlist_in_variableassignment1361);
            exprlist91=exprlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist91.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableassignment"


    public static class relop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relop"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:1: relop : ( lte | gte | neq | EQ | GT | LT );
    public final jvmBasicParser.relop_return relop() throws RecognitionException {
        jvmBasicParser.relop_return retval = new jvmBasicParser.relop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ95=null;
        Token GT96=null;
        Token LT97=null;
        jvmBasicParser.lte_return lte92 =null;

        jvmBasicParser.gte_return gte93 =null;

        jvmBasicParser.neq_return neq94 =null;


        CommonTree EQ95_tree=null;
        CommonTree GT96_tree=null;
        CommonTree LT97_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:7: ( lte | gte | neq | EQ | GT | LT )
            int alt11=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred76_jvmBasic()) ) {
                    alt11=1;
                }
                else if ( (synpred77_jvmBasic()) ) {
                    alt11=2;
                }
                else if ( (synpred79_jvmBasic()) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
                }
                break;
            case LT:
                {
                int LA11_5 = input.LA(2);

                if ( (synpred76_jvmBasic()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;

                }
                }
                break;
            case GT:
                {
                int LA11_7 = input.LA(2);

                if ( (synpred77_jvmBasic()) ) {
                    alt11=2;
                }
                else if ( (synpred80_jvmBasic()) ) {
                    alt11=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 7, input);

                    throw nvae;

                }
                }
                break;
            case NEQ:
                {
                alt11=3;
                }
                break;
            case GTE:
                {
                alt11=2;
                }
                break;
            case LTE:
                {
                alt11=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:8: lte
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lte_in_relop1370);
                    lte92=lte();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lte92.getTree());

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:14: gte
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_gte_in_relop1374);
                    gte93=gte();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gte93.getTree());

                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:20: neq
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_neq_in_relop1378);
                    neq94=neq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, neq94.getTree());

                    }
                    break;
                case 4 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:26: EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQ95=(Token)match(input,EQ,FOLLOW_EQ_in_relop1382); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ95_tree = 
                    (CommonTree)adaptor.create(EQ95)
                    ;
                    adaptor.addChild(root_0, EQ95_tree);
                    }

                    }
                    break;
                case 5 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:31: GT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GT96=(Token)match(input,GT,FOLLOW_GT_in_relop1386); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT96_tree = 
                    (CommonTree)adaptor.create(GT96)
                    ;
                    adaptor.addChild(root_0, GT96_tree);
                    }

                    }
                    break;
                case 6 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:36: LT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LT97=(Token)match(input,LT,FOLLOW_LT_in_relop1390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT97_tree = 
                    (CommonTree)adaptor.create(LT97)
                    ;
                    adaptor.addChild(root_0, LT97_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relop"


    public static class gte_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gte"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:1: gte : ( GTE | ( GT EQ ) | ( EQ GT ) );
    public final jvmBasicParser.gte_return gte() throws RecognitionException {
        jvmBasicParser.gte_return retval = new jvmBasicParser.gte_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GTE98=null;
        Token GT99=null;
        Token EQ100=null;
        Token EQ101=null;
        Token GT102=null;

        CommonTree GTE98_tree=null;
        CommonTree GT99_tree=null;
        CommonTree EQ100_tree=null;
        CommonTree EQ101_tree=null;
        CommonTree GT102_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:5: ( GTE | ( GT EQ ) | ( EQ GT ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case GTE:
                {
                alt12=1;
                }
                break;
            case GT:
                {
                alt12=2;
                }
                break;
            case EQ:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:7: GTE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GTE98=(Token)match(input,GTE,FOLLOW_GTE_in_gte1398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GTE98_tree = 
                    (CommonTree)adaptor.create(GTE98)
                    ;
                    adaptor.addChild(root_0, GTE98_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:13: ( GT EQ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:13: ( GT EQ )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:14: GT EQ
                    {
                    GT99=(Token)match(input,GT,FOLLOW_GT_in_gte1403); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT99_tree = 
                    (CommonTree)adaptor.create(GT99)
                    ;
                    adaptor.addChild(root_0, GT99_tree);
                    }

                    EQ100=(Token)match(input,EQ,FOLLOW_EQ_in_gte1405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ100_tree = 
                    (CommonTree)adaptor.create(EQ100)
                    ;
                    adaptor.addChild(root_0, EQ100_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:23: ( EQ GT )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:23: ( EQ GT )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:24: EQ GT
                    {
                    EQ101=(Token)match(input,EQ,FOLLOW_EQ_in_gte1411); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ101_tree = 
                    (CommonTree)adaptor.create(EQ101)
                    ;
                    adaptor.addChild(root_0, EQ101_tree);
                    }

                    GT102=(Token)match(input,GT,FOLLOW_GT_in_gte1413); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT102_tree = 
                    (CommonTree)adaptor.create(GT102)
                    ;
                    adaptor.addChild(root_0, GT102_tree);
                    }

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gte"


    public static class lte_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lte"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:1: lte : ( LTE | ( LT EQ ) | ( EQ LT ) );
    public final jvmBasicParser.lte_return lte() throws RecognitionException {
        jvmBasicParser.lte_return retval = new jvmBasicParser.lte_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LTE103=null;
        Token LT104=null;
        Token EQ105=null;
        Token EQ106=null;
        Token LT107=null;

        CommonTree LTE103_tree=null;
        CommonTree LT104_tree=null;
        CommonTree EQ105_tree=null;
        CommonTree EQ106_tree=null;
        CommonTree LT107_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:5: ( LTE | ( LT EQ ) | ( EQ LT ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case LTE:
                {
                alt13=1;
                }
                break;
            case LT:
                {
                alt13=2;
                }
                break;
            case EQ:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:7: LTE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LTE103=(Token)match(input,LTE,FOLLOW_LTE_in_lte1421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LTE103_tree = 
                    (CommonTree)adaptor.create(LTE103)
                    ;
                    adaptor.addChild(root_0, LTE103_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:13: ( LT EQ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:13: ( LT EQ )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:14: LT EQ
                    {
                    LT104=(Token)match(input,LT,FOLLOW_LT_in_lte1426); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT104_tree = 
                    (CommonTree)adaptor.create(LT104)
                    ;
                    adaptor.addChild(root_0, LT104_tree);
                    }

                    EQ105=(Token)match(input,EQ,FOLLOW_EQ_in_lte1428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ105_tree = 
                    (CommonTree)adaptor.create(EQ105)
                    ;
                    adaptor.addChild(root_0, EQ105_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:23: ( EQ LT )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:23: ( EQ LT )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:24: EQ LT
                    {
                    EQ106=(Token)match(input,EQ,FOLLOW_EQ_in_lte1434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ106_tree = 
                    (CommonTree)adaptor.create(EQ106)
                    ;
                    adaptor.addChild(root_0, EQ106_tree);
                    }

                    LT107=(Token)match(input,LT,FOLLOW_LT_in_lte1436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT107_tree = 
                    (CommonTree)adaptor.create(LT107)
                    ;
                    adaptor.addChild(root_0, LT107_tree);
                    }

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lte"


    public static class neq_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "neq"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:1: neq : NEQ ;
    public final jvmBasicParser.neq_return neq() throws RecognitionException {
        jvmBasicParser.neq_return retval = new jvmBasicParser.neq_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEQ108=null;

        CommonTree NEQ108_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:5: ( NEQ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:7: NEQ
            {
            root_0 = (CommonTree)adaptor.nil();


            NEQ108=(Token)match(input,NEQ,FOLLOW_NEQ_in_neq1444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEQ108_tree = 
            (CommonTree)adaptor.create(NEQ108)
            ;
            adaptor.addChild(root_0, NEQ108_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "neq"


    public static class ifstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:1: ifstmt : IF ^ expression ( THEN )? statement ;
    public final jvmBasicParser.ifstmt_return ifstmt() throws RecognitionException {
        jvmBasicParser.ifstmt_return retval = new jvmBasicParser.ifstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF109=null;
        Token THEN111=null;
        jvmBasicParser.expression_return expression110 =null;

        jvmBasicParser.statement_return statement112 =null;


        CommonTree IF109_tree=null;
        CommonTree THEN111_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:8: ( IF ^ expression ( THEN )? statement )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:10: IF ^ expression ( THEN )? statement
            {
            root_0 = (CommonTree)adaptor.nil();


            IF109=(Token)match(input,IF,FOLLOW_IF_in_ifstmt1451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF109_tree = 
            (CommonTree)adaptor.create(IF109)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF109_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_ifstmt1454);
            expression110=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression110.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:25: ( THEN )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case THEN:
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:25: THEN
                    {
                    THEN111=(Token)match(input,THEN,FOLLOW_THEN_in_ifstmt1456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THEN111_tree = 
                    (CommonTree)adaptor.create(THEN111)
                    ;
                    adaptor.addChild(root_0, THEN111_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_statement_in_ifstmt1459);
            statement112=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement112.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifstmt"


    public static class forstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:1: forstmt : FOR ^ vardecl EQ expression TO expression ( STEP expression )? ;
    public final jvmBasicParser.forstmt_return forstmt() throws RecognitionException {
        jvmBasicParser.forstmt_return retval = new jvmBasicParser.forstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FOR113=null;
        Token EQ115=null;
        Token TO117=null;
        Token STEP119=null;
        jvmBasicParser.vardecl_return vardecl114 =null;

        jvmBasicParser.expression_return expression116 =null;

        jvmBasicParser.expression_return expression118 =null;

        jvmBasicParser.expression_return expression120 =null;


        CommonTree FOR113_tree=null;
        CommonTree EQ115_tree=null;
        CommonTree TO117_tree=null;
        CommonTree STEP119_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:9: ( FOR ^ vardecl EQ expression TO expression ( STEP expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:11: FOR ^ vardecl EQ expression TO expression ( STEP expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR113=(Token)match(input,FOR,FOLLOW_FOR_in_forstmt1466); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR113_tree = 
            (CommonTree)adaptor.create(FOR113)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR113_tree, root_0);
            }

            pushFollow(FOLLOW_vardecl_in_forstmt1470);
            vardecl114=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl114.getTree());

            EQ115=(Token)match(input,EQ,FOLLOW_EQ_in_forstmt1472); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ115_tree = 
            (CommonTree)adaptor.create(EQ115)
            ;
            adaptor.addChild(root_0, EQ115_tree);
            }

            pushFollow(FOLLOW_expression_in_forstmt1474);
            expression116=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression116.getTree());

            TO117=(Token)match(input,TO,FOLLOW_TO_in_forstmt1476); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TO117_tree = 
            (CommonTree)adaptor.create(TO117)
            ;
            adaptor.addChild(root_0, TO117_tree);
            }

            pushFollow(FOLLOW_expression_in_forstmt1478);
            expression118=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression118.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:53: ( STEP expression )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case STEP:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:54: STEP expression
                    {
                    STEP119=(Token)match(input,STEP,FOLLOW_STEP_in_forstmt1481); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STEP119_tree = 
                    (CommonTree)adaptor.create(STEP119)
                    ;
                    adaptor.addChild(root_0, STEP119_tree);
                    }

                    pushFollow(FOLLOW_expression_in_forstmt1483);
                    expression120=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression120.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forstmt"


    public static class nextstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nextstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:1: nextstmt : NEXT ^ ( varlist )? ;
    public final jvmBasicParser.nextstmt_return nextstmt() throws RecognitionException {
        jvmBasicParser.nextstmt_return retval = new jvmBasicParser.nextstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEXT121=null;
        jvmBasicParser.varlist_return varlist122 =null;


        CommonTree NEXT121_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:10: ( NEXT ^ ( varlist )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:12: NEXT ^ ( varlist )?
            {
            root_0 = (CommonTree)adaptor.nil();


            NEXT121=(Token)match(input,NEXT,FOLLOW_NEXT_in_nextstmt1493); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEXT121_tree = 
            (CommonTree)adaptor.create(NEXT121)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(NEXT121_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:18: ( varlist )?
            int alt16=2;
            switch ( input.LA(1) ) {
                case LETTERS:
                    {
                    alt16=1;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:18: varlist
                    {
                    pushFollow(FOLLOW_varlist_in_nextstmt1496);
                    varlist122=varlist();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist122.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nextstmt"


    public static class inputstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inputstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:1: inputstmt : INPUT ^ ( stringliteral ( COMMA | SEMICOLON ) )? varlist ;
    public final jvmBasicParser.inputstmt_return inputstmt() throws RecognitionException {
        jvmBasicParser.inputstmt_return retval = new jvmBasicParser.inputstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INPUT123=null;
        Token set125=null;
        jvmBasicParser.stringliteral_return stringliteral124 =null;

        jvmBasicParser.varlist_return varlist126 =null;


        CommonTree INPUT123_tree=null;
        CommonTree set125_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:11: ( INPUT ^ ( stringliteral ( COMMA | SEMICOLON ) )? varlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:13: INPUT ^ ( stringliteral ( COMMA | SEMICOLON ) )? varlist
            {
            root_0 = (CommonTree)adaptor.nil();


            INPUT123=(Token)match(input,INPUT,FOLLOW_INPUT_in_inputstmt1504); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INPUT123_tree = 
            (CommonTree)adaptor.create(INPUT123)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(INPUT123_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:20: ( stringliteral ( COMMA | SEMICOLON ) )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case STRINGLITERAL:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:21: stringliteral ( COMMA | SEMICOLON )
                    {
                    pushFollow(FOLLOW_stringliteral_in_inputstmt1508);
                    stringliteral124=stringliteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringliteral124.getTree());

                    set125=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==SEMICOLON ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set125)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_varlist_in_inputstmt1519);
            varlist126=varlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist126.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inputstmt"


    public static class readstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "readstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:1: readstmt : READ ^ varlist ;
    public final jvmBasicParser.readstmt_return readstmt() throws RecognitionException {
        jvmBasicParser.readstmt_return retval = new jvmBasicParser.readstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token READ127=null;
        jvmBasicParser.varlist_return varlist128 =null;


        CommonTree READ127_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:9: ( READ ^ varlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:11: READ ^ varlist
            {
            root_0 = (CommonTree)adaptor.nil();


            READ127=(Token)match(input,READ,FOLLOW_READ_in_readstmt1526); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            READ127_tree = 
            (CommonTree)adaptor.create(READ127)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(READ127_tree, root_0);
            }

            pushFollow(FOLLOW_varlist_in_readstmt1529);
            varlist128=varlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist128.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "readstmt"


    public static class dimstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dimstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:1: dimstmt : DIM ^ varlist ;
    public final jvmBasicParser.dimstmt_return dimstmt() throws RecognitionException {
        jvmBasicParser.dimstmt_return retval = new jvmBasicParser.dimstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DIM129=null;
        jvmBasicParser.varlist_return varlist130 =null;


        CommonTree DIM129_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:9: ( DIM ^ varlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:11: DIM ^ varlist
            {
            root_0 = (CommonTree)adaptor.nil();


            DIM129=(Token)match(input,DIM,FOLLOW_DIM_in_dimstmt1539); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DIM129_tree = 
            (CommonTree)adaptor.create(DIM129)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(DIM129_tree, root_0);
            }

            pushFollow(FOLLOW_varlist_in_dimstmt1542);
            varlist130=varlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist130.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dimstmt"


    public static class gotostmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gotostmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:1: gotostmt : GOTO ^ linenumber ;
    public final jvmBasicParser.gotostmt_return gotostmt() throws RecognitionException {
        jvmBasicParser.gotostmt_return retval = new jvmBasicParser.gotostmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GOTO131=null;
        jvmBasicParser.linenumber_return linenumber132 =null;


        CommonTree GOTO131_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:9: ( GOTO ^ linenumber )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:11: GOTO ^ linenumber
            {
            root_0 = (CommonTree)adaptor.nil();


            GOTO131=(Token)match(input,GOTO,FOLLOW_GOTO_in_gotostmt1548); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOTO131_tree = 
            (CommonTree)adaptor.create(GOTO131)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(GOTO131_tree, root_0);
            }

            pushFollow(FOLLOW_linenumber_in_gotostmt1551);
            linenumber132=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber132.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gotostmt"


    public static class gosubstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "gosubstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:1: gosubstmt : GOSUB ^ linenumber ;
    public final jvmBasicParser.gosubstmt_return gosubstmt() throws RecognitionException {
        jvmBasicParser.gosubstmt_return retval = new jvmBasicParser.gosubstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GOSUB133=null;
        jvmBasicParser.linenumber_return linenumber134 =null;


        CommonTree GOSUB133_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:10: ( GOSUB ^ linenumber )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:12: GOSUB ^ linenumber
            {
            root_0 = (CommonTree)adaptor.nil();


            GOSUB133=(Token)match(input,GOSUB,FOLLOW_GOSUB_in_gosubstmt1557); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOSUB133_tree = 
            (CommonTree)adaptor.create(GOSUB133)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(GOSUB133_tree, root_0);
            }

            pushFollow(FOLLOW_linenumber_in_gosubstmt1560);
            linenumber134=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber134.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "gosubstmt"


    public static class pokestmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pokestmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:1: pokestmt : POKE expression COMMA expression ;
    public final jvmBasicParser.pokestmt_return pokestmt() throws RecognitionException {
        jvmBasicParser.pokestmt_return retval = new jvmBasicParser.pokestmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POKE135=null;
        Token COMMA137=null;
        jvmBasicParser.expression_return expression136 =null;

        jvmBasicParser.expression_return expression138 =null;


        CommonTree POKE135_tree=null;
        CommonTree COMMA137_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:9: ( POKE expression COMMA expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:11: POKE expression COMMA expression
            {
            root_0 = (CommonTree)adaptor.nil();


            POKE135=(Token)match(input,POKE,FOLLOW_POKE_in_pokestmt1566); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POKE135_tree = 
            (CommonTree)adaptor.create(POKE135)
            ;
            adaptor.addChild(root_0, POKE135_tree);
            }

            pushFollow(FOLLOW_expression_in_pokestmt1568);
            expression136=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression136.getTree());

            COMMA137=(Token)match(input,COMMA,FOLLOW_COMMA_in_pokestmt1570); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA137_tree = 
            (CommonTree)adaptor.create(COMMA137)
            ;
            adaptor.addChild(root_0, COMMA137_tree);
            }

            pushFollow(FOLLOW_expression_in_pokestmt1572);
            expression138=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression138.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pokestmt"


    public static class comment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comment"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:1: comment : REM ^ ( options {greedy=false; } : (~ ( CR ) ) )* ;
    public final jvmBasicParser.comment_return comment() throws RecognitionException {
        jvmBasicParser.comment_return retval = new jvmBasicParser.comment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REM139=null;
        Token set140=null;

        CommonTree REM139_tree=null;
        CommonTree set140_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:8: ( REM ^ ( options {greedy=false; } : (~ ( CR ) ) )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:10: REM ^ ( options {greedy=false; } : (~ ( CR ) ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            REM139=(Token)match(input,REM,FOLLOW_REM_in_comment1578); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REM139_tree = 
            (CommonTree)adaptor.create(REM139)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(REM139_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:15: ( options {greedy=false; } : (~ ( CR ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case COLON:
                    {
                    int LA18_1 = input.LA(2);

                    if ( (synpred90_jvmBasic()) ) {
                        alt18=1;
                    }
                    else if ( (true) ) {
                        alt18=2;
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
                case DIGIT:
                case DIM:
                case DIV:
                case DRAW:
                case END:
                case EQ:
                case EXP:
                case EXPONENT:
                case FLASH:
                case FLOAT:
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
                case INCLUDE:
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
                case NEQ:
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
                case 125:
                case 126:
                    {
                    alt18=1;
                    }
                    break;
                case CR:
                    {
                    alt18=2;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:42: (~ ( CR ) )
            	    {
            	    set140=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ABS && input.LA(1) <= COS)||(input.LA(1) >= DATA && input.LA(1) <= 126) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set140)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comment"


    public static class callstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:1: callstmt : CALL ^ exprlist ;
    public final jvmBasicParser.callstmt_return callstmt() throws RecognitionException {
        jvmBasicParser.callstmt_return retval = new jvmBasicParser.callstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CALL141=null;
        jvmBasicParser.exprlist_return exprlist142 =null;


        CommonTree CALL141_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:9: ( CALL ^ exprlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:11: CALL ^ exprlist
            {
            root_0 = (CommonTree)adaptor.nil();


            CALL141=(Token)match(input,CALL,FOLLOW_CALL_in_callstmt1604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CALL141_tree = 
            (CommonTree)adaptor.create(CALL141)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CALL141_tree, root_0);
            }

            pushFollow(FOLLOW_exprlist_in_callstmt1607);
            exprlist142=exprlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist142.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callstmt"


    public static class hplotstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hplotstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:1: hplotstmt : HPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* ;
    public final jvmBasicParser.hplotstmt_return hplotstmt() throws RecognitionException {
        jvmBasicParser.hplotstmt_return retval = new jvmBasicParser.hplotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HPLOT143=null;
        Token COMMA145=null;
        Token TO147=null;
        Token COMMA149=null;
        jvmBasicParser.expression_return expression144 =null;

        jvmBasicParser.expression_return expression146 =null;

        jvmBasicParser.expression_return expression148 =null;

        jvmBasicParser.expression_return expression150 =null;


        CommonTree HPLOT143_tree=null;
        CommonTree COMMA145_tree=null;
        CommonTree TO147_tree=null;
        CommonTree COMMA149_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:10: ( HPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:12: HPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            HPLOT143=(Token)match(input,HPLOT,FOLLOW_HPLOT_in_hplotstmt1613); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HPLOT143_tree = 
            (CommonTree)adaptor.create(HPLOT143)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HPLOT143_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:19: ( expression COMMA expression )?
            int alt19=2;
            switch ( input.LA(1) ) {
                case ABS:
                case ASC:
                case ATN:
                case CHR:
                case COS:
                case EXP:
                case FLOAT:
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
                case VAL:
                    {
                    alt19=1;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:20: expression COMMA expression
                    {
                    pushFollow(FOLLOW_expression_in_hplotstmt1617);
                    expression144=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression144.getTree());

                    COMMA145=(Token)match(input,COMMA,FOLLOW_COMMA_in_hplotstmt1619); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA145_tree = 
                    (CommonTree)adaptor.create(COMMA145)
                    ;
                    adaptor.addChild(root_0, COMMA145_tree);
                    }

                    pushFollow(FOLLOW_expression_in_hplotstmt1621);
                    expression146=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:50: ( TO expression COMMA expression )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case TO:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:51: TO expression COMMA expression
            	    {
            	    TO147=(Token)match(input,TO,FOLLOW_TO_in_hplotstmt1626); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TO147_tree = 
            	    (CommonTree)adaptor.create(TO147)
            	    ;
            	    adaptor.addChild(root_0, TO147_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_hplotstmt1628);
            	    expression148=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression148.getTree());

            	    COMMA149=(Token)match(input,COMMA,FOLLOW_COMMA_in_hplotstmt1630); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA149_tree = 
            	    (CommonTree)adaptor.create(COMMA149)
            	    ;
            	    adaptor.addChild(root_0, COMMA149_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_hplotstmt1632);
            	    expression150=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression150.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hplotstmt"


    public static class vplotstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vplotstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:1: vplotstmt : VPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* ;
    public final jvmBasicParser.vplotstmt_return vplotstmt() throws RecognitionException {
        jvmBasicParser.vplotstmt_return retval = new jvmBasicParser.vplotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VPLOT151=null;
        Token COMMA153=null;
        Token TO155=null;
        Token COMMA157=null;
        jvmBasicParser.expression_return expression152 =null;

        jvmBasicParser.expression_return expression154 =null;

        jvmBasicParser.expression_return expression156 =null;

        jvmBasicParser.expression_return expression158 =null;


        CommonTree VPLOT151_tree=null;
        CommonTree COMMA153_tree=null;
        CommonTree TO155_tree=null;
        CommonTree COMMA157_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:10: ( VPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:12: VPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            VPLOT151=(Token)match(input,VPLOT,FOLLOW_VPLOT_in_vplotstmt1640); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VPLOT151_tree = 
            (CommonTree)adaptor.create(VPLOT151)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VPLOT151_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:19: ( expression COMMA expression )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case ABS:
                case ASC:
                case ATN:
                case CHR:
                case COS:
                case EXP:
                case FLOAT:
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
                case VAL:
                    {
                    alt21=1;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:20: expression COMMA expression
                    {
                    pushFollow(FOLLOW_expression_in_vplotstmt1644);
                    expression152=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression152.getTree());

                    COMMA153=(Token)match(input,COMMA,FOLLOW_COMMA_in_vplotstmt1646); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA153_tree = 
                    (CommonTree)adaptor.create(COMMA153)
                    ;
                    adaptor.addChild(root_0, COMMA153_tree);
                    }

                    pushFollow(FOLLOW_expression_in_vplotstmt1648);
                    expression154=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression154.getTree());

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:50: ( TO expression COMMA expression )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case TO:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:51: TO expression COMMA expression
            	    {
            	    TO155=(Token)match(input,TO,FOLLOW_TO_in_vplotstmt1653); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TO155_tree = 
            	    (CommonTree)adaptor.create(TO155)
            	    ;
            	    adaptor.addChild(root_0, TO155_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_vplotstmt1655);
            	    expression156=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression156.getTree());

            	    COMMA157=(Token)match(input,COMMA,FOLLOW_COMMA_in_vplotstmt1657); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA157_tree = 
            	    (CommonTree)adaptor.create(COMMA157)
            	    ;
            	    adaptor.addChild(root_0, COMMA157_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_vplotstmt1659);
            	    expression158=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression158.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vplotstmt"


    public static class plotstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "plotstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:1: plotstmt : PLOT expression COMMA expression ;
    public final jvmBasicParser.plotstmt_return plotstmt() throws RecognitionException {
        jvmBasicParser.plotstmt_return retval = new jvmBasicParser.plotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLOT159=null;
        Token COMMA161=null;
        jvmBasicParser.expression_return expression160 =null;

        jvmBasicParser.expression_return expression162 =null;


        CommonTree PLOT159_tree=null;
        CommonTree COMMA161_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:9: ( PLOT expression COMMA expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:11: PLOT expression COMMA expression
            {
            root_0 = (CommonTree)adaptor.nil();


            PLOT159=(Token)match(input,PLOT,FOLLOW_PLOT_in_plotstmt1667); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PLOT159_tree = 
            (CommonTree)adaptor.create(PLOT159)
            ;
            adaptor.addChild(root_0, PLOT159_tree);
            }

            pushFollow(FOLLOW_expression_in_plotstmt1669);
            expression160=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression160.getTree());

            COMMA161=(Token)match(input,COMMA,FOLLOW_COMMA_in_plotstmt1671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA161_tree = 
            (CommonTree)adaptor.create(COMMA161)
            ;
            adaptor.addChild(root_0, COMMA161_tree);
            }

            pushFollow(FOLLOW_expression_in_plotstmt1673);
            expression162=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression162.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "plotstmt"


    public static class ongotostmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ongotostmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:1: ongotostmt : ON expression GOTO linenumber ( COMMA linenumber )* ;
    public final jvmBasicParser.ongotostmt_return ongotostmt() throws RecognitionException {
        jvmBasicParser.ongotostmt_return retval = new jvmBasicParser.ongotostmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ON163=null;
        Token GOTO165=null;
        Token COMMA167=null;
        jvmBasicParser.expression_return expression164 =null;

        jvmBasicParser.linenumber_return linenumber166 =null;

        jvmBasicParser.linenumber_return linenumber168 =null;


        CommonTree ON163_tree=null;
        CommonTree GOTO165_tree=null;
        CommonTree COMMA167_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:12: ( ON expression GOTO linenumber ( COMMA linenumber )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:14: ON expression GOTO linenumber ( COMMA linenumber )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ON163=(Token)match(input,ON,FOLLOW_ON_in_ongotostmt1680); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ON163_tree = 
            (CommonTree)adaptor.create(ON163)
            ;
            adaptor.addChild(root_0, ON163_tree);
            }

            pushFollow(FOLLOW_expression_in_ongotostmt1682);
            expression164=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression164.getTree());

            GOTO165=(Token)match(input,GOTO,FOLLOW_GOTO_in_ongotostmt1684); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOTO165_tree = 
            (CommonTree)adaptor.create(GOTO165)
            ;
            adaptor.addChild(root_0, GOTO165_tree);
            }

            pushFollow(FOLLOW_linenumber_in_ongotostmt1686);
            linenumber166=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber166.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:44: ( COMMA linenumber )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:45: COMMA linenumber
            	    {
            	    COMMA167=(Token)match(input,COMMA,FOLLOW_COMMA_in_ongotostmt1689); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA167_tree = 
            	    (CommonTree)adaptor.create(COMMA167)
            	    ;
            	    adaptor.addChild(root_0, COMMA167_tree);
            	    }

            	    pushFollow(FOLLOW_linenumber_in_ongotostmt1691);
            	    linenumber168=linenumber();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber168.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ongotostmt"


    public static class ongosubstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ongosubstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:1: ongosubstmt : ON expression GOSUB linenumber ( COMMA linenumber )* ;
    public final jvmBasicParser.ongosubstmt_return ongosubstmt() throws RecognitionException {
        jvmBasicParser.ongosubstmt_return retval = new jvmBasicParser.ongosubstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ON169=null;
        Token GOSUB171=null;
        Token COMMA173=null;
        jvmBasicParser.expression_return expression170 =null;

        jvmBasicParser.linenumber_return linenumber172 =null;

        jvmBasicParser.linenumber_return linenumber174 =null;


        CommonTree ON169_tree=null;
        CommonTree GOSUB171_tree=null;
        CommonTree COMMA173_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:13: ( ON expression GOSUB linenumber ( COMMA linenumber )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:15: ON expression GOSUB linenumber ( COMMA linenumber )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ON169=(Token)match(input,ON,FOLLOW_ON_in_ongosubstmt1700); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ON169_tree = 
            (CommonTree)adaptor.create(ON169)
            ;
            adaptor.addChild(root_0, ON169_tree);
            }

            pushFollow(FOLLOW_expression_in_ongosubstmt1702);
            expression170=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression170.getTree());

            GOSUB171=(Token)match(input,GOSUB,FOLLOW_GOSUB_in_ongosubstmt1704); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOSUB171_tree = 
            (CommonTree)adaptor.create(GOSUB171)
            ;
            adaptor.addChild(root_0, GOSUB171_tree);
            }

            pushFollow(FOLLOW_linenumber_in_ongosubstmt1706);
            linenumber172=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber172.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:46: ( COMMA linenumber )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:47: COMMA linenumber
            	    {
            	    COMMA173=(Token)match(input,COMMA,FOLLOW_COMMA_in_ongosubstmt1709); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA173_tree = 
            	    (CommonTree)adaptor.create(COMMA173)
            	    ;
            	    adaptor.addChild(root_0, COMMA173_tree);
            	    }

            	    pushFollow(FOLLOW_linenumber_in_ongosubstmt1711);
            	    linenumber174=linenumber();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber174.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ongosubstmt"


    public static class vtabstmnt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vtabstmnt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:1: vtabstmnt : VTAB ^ expression ;
    public final jvmBasicParser.vtabstmnt_return vtabstmnt() throws RecognitionException {
        jvmBasicParser.vtabstmnt_return retval = new jvmBasicParser.vtabstmnt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VTAB175=null;
        jvmBasicParser.expression_return expression176 =null;


        CommonTree VTAB175_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:11: ( VTAB ^ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:13: VTAB ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            VTAB175=(Token)match(input,VTAB,FOLLOW_VTAB_in_vtabstmnt1720); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VTAB175_tree = 
            (CommonTree)adaptor.create(VTAB175)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VTAB175_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_vtabstmnt1723);
            expression176=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression176.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vtabstmnt"


    public static class htabstmnt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "htabstmnt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:1: htabstmnt : HTAB ^ expression ;
    public final jvmBasicParser.htabstmnt_return htabstmnt() throws RecognitionException {
        jvmBasicParser.htabstmnt_return retval = new jvmBasicParser.htabstmnt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HTAB177=null;
        jvmBasicParser.expression_return expression178 =null;


        CommonTree HTAB177_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:11: ( HTAB ^ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:13: HTAB ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HTAB177=(Token)match(input,HTAB,FOLLOW_HTAB_in_htabstmnt1730); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HTAB177_tree = 
            (CommonTree)adaptor.create(HTAB177)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HTAB177_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_htabstmnt1733);
            expression178=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "htabstmnt"


    public static class himemstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "himemstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:1: himemstmt : HIMEM ^ COLON expression ;
    public final jvmBasicParser.himemstmt_return himemstmt() throws RecognitionException {
        jvmBasicParser.himemstmt_return retval = new jvmBasicParser.himemstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HIMEM179=null;
        Token COLON180=null;
        jvmBasicParser.expression_return expression181 =null;


        CommonTree HIMEM179_tree=null;
        CommonTree COLON180_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:10: ( HIMEM ^ COLON expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:12: HIMEM ^ COLON expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HIMEM179=(Token)match(input,HIMEM,FOLLOW_HIMEM_in_himemstmt1739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HIMEM179_tree = 
            (CommonTree)adaptor.create(HIMEM179)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HIMEM179_tree, root_0);
            }

            COLON180=(Token)match(input,COLON,FOLLOW_COLON_in_himemstmt1742); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON180_tree = 
            (CommonTree)adaptor.create(COLON180)
            ;
            adaptor.addChild(root_0, COLON180_tree);
            }

            pushFollow(FOLLOW_expression_in_himemstmt1744);
            expression181=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression181.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "himemstmt"


    public static class lomemstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lomemstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:1: lomemstmt : LOMEM ^ COLON expression ;
    public final jvmBasicParser.lomemstmt_return lomemstmt() throws RecognitionException {
        jvmBasicParser.lomemstmt_return retval = new jvmBasicParser.lomemstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOMEM182=null;
        Token COLON183=null;
        jvmBasicParser.expression_return expression184 =null;


        CommonTree LOMEM182_tree=null;
        CommonTree COLON183_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:10: ( LOMEM ^ COLON expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:12: LOMEM ^ COLON expression
            {
            root_0 = (CommonTree)adaptor.nil();


            LOMEM182=(Token)match(input,LOMEM,FOLLOW_LOMEM_in_lomemstmt1750); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOMEM182_tree = 
            (CommonTree)adaptor.create(LOMEM182)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LOMEM182_tree, root_0);
            }

            COLON183=(Token)match(input,COLON,FOLLOW_COLON_in_lomemstmt1753); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON183_tree = 
            (CommonTree)adaptor.create(COLON183)
            ;
            adaptor.addChild(root_0, COLON183_tree);
            }

            pushFollow(FOLLOW_expression_in_lomemstmt1755);
            expression184=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression184.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lomemstmt"


    public static class datastmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datastmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:1: datastmt : DATA ^ expression ( COMMA ( expression )? )* ;
    public final jvmBasicParser.datastmt_return datastmt() throws RecognitionException {
        jvmBasicParser.datastmt_return retval = new jvmBasicParser.datastmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATA185=null;
        Token COMMA187=null;
        jvmBasicParser.expression_return expression186 =null;

        jvmBasicParser.expression_return expression188 =null;


        CommonTree DATA185_tree=null;
        CommonTree COMMA187_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:9: ( DATA ^ expression ( COMMA ( expression )? )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:11: DATA ^ expression ( COMMA ( expression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            DATA185=(Token)match(input,DATA,FOLLOW_DATA_in_datastmt1761); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATA185_tree = 
            (CommonTree)adaptor.create(DATA185)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(DATA185_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_datastmt1764);
            expression186=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression186.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:28: ( COMMA ( expression )? )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:29: COMMA ( expression )?
            	    {
            	    COMMA187=(Token)match(input,COMMA,FOLLOW_COMMA_in_datastmt1767); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA187_tree = 
            	    (CommonTree)adaptor.create(COMMA187)
            	    ;
            	    adaptor.addChild(root_0, COMMA187_tree);
            	    }

            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:35: ( expression )?
            	    int alt25=2;
            	    switch ( input.LA(1) ) {
            	        case ABS:
            	        case ASC:
            	        case ATN:
            	        case CHR:
            	        case COS:
            	        case EXP:
            	        case FLOAT:
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
            	        case VAL:
            	            {
            	            alt25=1;
            	            }
            	            break;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:35: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_datastmt1769);
            	            expression188=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression188.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "datastmt"


    public static class waitstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "waitstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:1: waitstmt : WAIT ^ expression COMMA expression ( COMMA expression )? ;
    public final jvmBasicParser.waitstmt_return waitstmt() throws RecognitionException {
        jvmBasicParser.waitstmt_return retval = new jvmBasicParser.waitstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WAIT189=null;
        Token COMMA191=null;
        Token COMMA193=null;
        jvmBasicParser.expression_return expression190 =null;

        jvmBasicParser.expression_return expression192 =null;

        jvmBasicParser.expression_return expression194 =null;


        CommonTree WAIT189_tree=null;
        CommonTree COMMA191_tree=null;
        CommonTree COMMA193_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:9: ( WAIT ^ expression COMMA expression ( COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:11: WAIT ^ expression COMMA expression ( COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            WAIT189=(Token)match(input,WAIT,FOLLOW_WAIT_in_waitstmt1778); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WAIT189_tree = 
            (CommonTree)adaptor.create(WAIT189)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WAIT189_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_waitstmt1781);
            expression190=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression190.getTree());

            COMMA191=(Token)match(input,COMMA,FOLLOW_COMMA_in_waitstmt1783); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA191_tree = 
            (CommonTree)adaptor.create(COMMA191)
            ;
            adaptor.addChild(root_0, COMMA191_tree);
            }

            pushFollow(FOLLOW_expression_in_waitstmt1785);
            expression192=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression192.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:45: ( COMMA expression )?
            int alt27=2;
            switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt27=1;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:46: COMMA expression
                    {
                    COMMA193=(Token)match(input,COMMA,FOLLOW_COMMA_in_waitstmt1788); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA193_tree = 
                    (CommonTree)adaptor.create(COMMA193)
                    ;
                    adaptor.addChild(root_0, COMMA193_tree);
                    }

                    pushFollow(FOLLOW_expression_in_waitstmt1790);
                    expression194=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression194.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "waitstmt"


    public static class xdrawstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xdrawstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:1: xdrawstmt : XDRAW ^ expression ( AT expression COMMA expression )? ;
    public final jvmBasicParser.xdrawstmt_return xdrawstmt() throws RecognitionException {
        jvmBasicParser.xdrawstmt_return retval = new jvmBasicParser.xdrawstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token XDRAW195=null;
        Token AT197=null;
        Token COMMA199=null;
        jvmBasicParser.expression_return expression196 =null;

        jvmBasicParser.expression_return expression198 =null;

        jvmBasicParser.expression_return expression200 =null;


        CommonTree XDRAW195_tree=null;
        CommonTree AT197_tree=null;
        CommonTree COMMA199_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:10: ( XDRAW ^ expression ( AT expression COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:12: XDRAW ^ expression ( AT expression COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            XDRAW195=(Token)match(input,XDRAW,FOLLOW_XDRAW_in_xdrawstmt1798); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            XDRAW195_tree = 
            (CommonTree)adaptor.create(XDRAW195)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(XDRAW195_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_xdrawstmt1801);
            expression196=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression196.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:30: ( AT expression COMMA expression )?
            int alt28=2;
            switch ( input.LA(1) ) {
                case AT:
                    {
                    alt28=1;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:31: AT expression COMMA expression
                    {
                    AT197=(Token)match(input,AT,FOLLOW_AT_in_xdrawstmt1804); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT197_tree = 
                    (CommonTree)adaptor.create(AT197)
                    ;
                    adaptor.addChild(root_0, AT197_tree);
                    }

                    pushFollow(FOLLOW_expression_in_xdrawstmt1806);
                    expression198=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression198.getTree());

                    COMMA199=(Token)match(input,COMMA,FOLLOW_COMMA_in_xdrawstmt1808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA199_tree = 
                    (CommonTree)adaptor.create(COMMA199)
                    ;
                    adaptor.addChild(root_0, COMMA199_tree);
                    }

                    pushFollow(FOLLOW_expression_in_xdrawstmt1810);
                    expression200=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression200.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xdrawstmt"


    public static class drawstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drawstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:1: drawstmt : DRAW ^ expression ( AT expression COMMA expression )? ;
    public final jvmBasicParser.drawstmt_return drawstmt() throws RecognitionException {
        jvmBasicParser.drawstmt_return retval = new jvmBasicParser.drawstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DRAW201=null;
        Token AT203=null;
        Token COMMA205=null;
        jvmBasicParser.expression_return expression202 =null;

        jvmBasicParser.expression_return expression204 =null;

        jvmBasicParser.expression_return expression206 =null;


        CommonTree DRAW201_tree=null;
        CommonTree AT203_tree=null;
        CommonTree COMMA205_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:9: ( DRAW ^ expression ( AT expression COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:11: DRAW ^ expression ( AT expression COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            DRAW201=(Token)match(input,DRAW,FOLLOW_DRAW_in_drawstmt1818); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DRAW201_tree = 
            (CommonTree)adaptor.create(DRAW201)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(DRAW201_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_drawstmt1821);
            expression202=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression202.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:28: ( AT expression COMMA expression )?
            int alt29=2;
            switch ( input.LA(1) ) {
                case AT:
                    {
                    alt29=1;
                    }
                    break;
            }

            switch (alt29) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:29: AT expression COMMA expression
                    {
                    AT203=(Token)match(input,AT,FOLLOW_AT_in_drawstmt1824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT203_tree = 
                    (CommonTree)adaptor.create(AT203)
                    ;
                    adaptor.addChild(root_0, AT203_tree);
                    }

                    pushFollow(FOLLOW_expression_in_drawstmt1826);
                    expression204=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression204.getTree());

                    COMMA205=(Token)match(input,COMMA,FOLLOW_COMMA_in_drawstmt1828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA205_tree = 
                    (CommonTree)adaptor.create(COMMA205)
                    ;
                    adaptor.addChild(root_0, COMMA205_tree);
                    }

                    pushFollow(FOLLOW_expression_in_drawstmt1830);
                    expression206=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression206.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drawstmt"


    public static class defstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:1: defstmt : DEF FN var LPAREN var RPAREN EQ expression ;
    public final jvmBasicParser.defstmt_return defstmt() throws RecognitionException {
        jvmBasicParser.defstmt_return retval = new jvmBasicParser.defstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DEF207=null;
        Token FN208=null;
        Token LPAREN210=null;
        Token RPAREN212=null;
        Token EQ213=null;
        jvmBasicParser.var_return var209 =null;

        jvmBasicParser.var_return var211 =null;

        jvmBasicParser.expression_return expression214 =null;


        CommonTree DEF207_tree=null;
        CommonTree FN208_tree=null;
        CommonTree LPAREN210_tree=null;
        CommonTree RPAREN212_tree=null;
        CommonTree EQ213_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:8: ( DEF FN var LPAREN var RPAREN EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:10: DEF FN var LPAREN var RPAREN EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            DEF207=(Token)match(input,DEF,FOLLOW_DEF_in_defstmt1838); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEF207_tree = 
            (CommonTree)adaptor.create(DEF207)
            ;
            adaptor.addChild(root_0, DEF207_tree);
            }

            FN208=(Token)match(input,FN,FOLLOW_FN_in_defstmt1840); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FN208_tree = 
            (CommonTree)adaptor.create(FN208)
            ;
            adaptor.addChild(root_0, FN208_tree);
            }

            pushFollow(FOLLOW_var_in_defstmt1842);
            var209=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var209.getTree());

            LPAREN210=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_defstmt1844); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN210_tree = 
            (CommonTree)adaptor.create(LPAREN210)
            ;
            adaptor.addChild(root_0, LPAREN210_tree);
            }

            pushFollow(FOLLOW_var_in_defstmt1846);
            var211=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var211.getTree());

            RPAREN212=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_defstmt1848); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN212_tree = 
            (CommonTree)adaptor.create(RPAREN212)
            ;
            adaptor.addChild(root_0, RPAREN212_tree);
            }

            EQ213=(Token)match(input,EQ,FOLLOW_EQ_in_defstmt1850); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ213_tree = 
            (CommonTree)adaptor.create(EQ213)
            ;
            adaptor.addChild(root_0, EQ213_tree);
            }

            pushFollow(FOLLOW_expression_in_defstmt1852);
            expression214=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression214.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "defstmt"


    public static class tabstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tabstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:1: tabstmt : TAB ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.tabstmt_return tabstmt() throws RecognitionException {
        jvmBasicParser.tabstmt_return retval = new jvmBasicParser.tabstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TAB215=null;
        Token LPAREN216=null;
        Token RPAREN218=null;
        jvmBasicParser.expression_return expression217 =null;


        CommonTree TAB215_tree=null;
        CommonTree LPAREN216_tree=null;
        CommonTree RPAREN218_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:8: ( TAB ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:10: TAB ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            TAB215=(Token)match(input,TAB,FOLLOW_TAB_in_tabstmt1858); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TAB215_tree = 
            (CommonTree)adaptor.create(TAB215)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(TAB215_tree, root_0);
            }

            LPAREN216=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tabstmt1861); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN216_tree = 
            (CommonTree)adaptor.create(LPAREN216)
            ;
            adaptor.addChild(root_0, LPAREN216_tree);
            }

            pushFollow(FOLLOW_expression_in_tabstmt1863);
            expression217=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression217.getTree());

            RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tabstmt1865); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN218_tree = 
            (CommonTree)adaptor.create(RPAREN218)
            ;
            adaptor.addChild(root_0, RPAREN218_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tabstmt"


    public static class speedstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speedstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:1: speedstmt : SPEED ^ EQ expression ;
    public final jvmBasicParser.speedstmt_return speedstmt() throws RecognitionException {
        jvmBasicParser.speedstmt_return retval = new jvmBasicParser.speedstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SPEED219=null;
        Token EQ220=null;
        jvmBasicParser.expression_return expression221 =null;


        CommonTree SPEED219_tree=null;
        CommonTree EQ220_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:10: ( SPEED ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:12: SPEED ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            SPEED219=(Token)match(input,SPEED,FOLLOW_SPEED_in_speedstmt1871); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SPEED219_tree = 
            (CommonTree)adaptor.create(SPEED219)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SPEED219_tree, root_0);
            }

            EQ220=(Token)match(input,EQ,FOLLOW_EQ_in_speedstmt1874); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ220_tree = 
            (CommonTree)adaptor.create(EQ220)
            ;
            adaptor.addChild(root_0, EQ220_tree);
            }

            pushFollow(FOLLOW_expression_in_speedstmt1876);
            expression221=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression221.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "speedstmt"


    public static class rotstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rotstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:1: rotstmt : ROT ^ EQ expression ;
    public final jvmBasicParser.rotstmt_return rotstmt() throws RecognitionException {
        jvmBasicParser.rotstmt_return retval = new jvmBasicParser.rotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ROT222=null;
        Token EQ223=null;
        jvmBasicParser.expression_return expression224 =null;


        CommonTree ROT222_tree=null;
        CommonTree EQ223_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:8: ( ROT ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:10: ROT ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            ROT222=(Token)match(input,ROT,FOLLOW_ROT_in_rotstmt1882); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ROT222_tree = 
            (CommonTree)adaptor.create(ROT222)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ROT222_tree, root_0);
            }

            EQ223=(Token)match(input,EQ,FOLLOW_EQ_in_rotstmt1885); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ223_tree = 
            (CommonTree)adaptor.create(EQ223)
            ;
            adaptor.addChild(root_0, EQ223_tree);
            }

            pushFollow(FOLLOW_expression_in_rotstmt1887);
            expression224=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression224.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rotstmt"


    public static class scalestmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scalestmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:1: scalestmt : SCALE ^ EQ expression ;
    public final jvmBasicParser.scalestmt_return scalestmt() throws RecognitionException {
        jvmBasicParser.scalestmt_return retval = new jvmBasicParser.scalestmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SCALE225=null;
        Token EQ226=null;
        jvmBasicParser.expression_return expression227 =null;


        CommonTree SCALE225_tree=null;
        CommonTree EQ226_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:10: ( SCALE ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:12: SCALE ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            SCALE225=(Token)match(input,SCALE,FOLLOW_SCALE_in_scalestmt1893); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SCALE225_tree = 
            (CommonTree)adaptor.create(SCALE225)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SCALE225_tree, root_0);
            }

            EQ226=(Token)match(input,EQ,FOLLOW_EQ_in_scalestmt1896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ226_tree = 
            (CommonTree)adaptor.create(EQ226)
            ;
            adaptor.addChild(root_0, EQ226_tree);
            }

            pushFollow(FOLLOW_expression_in_scalestmt1898);
            expression227=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression227.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scalestmt"


    public static class colorstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "colorstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:203:1: colorstmt : COLOR ^ EQ expression ;
    public final jvmBasicParser.colorstmt_return colorstmt() throws RecognitionException {
        jvmBasicParser.colorstmt_return retval = new jvmBasicParser.colorstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COLOR228=null;
        Token EQ229=null;
        jvmBasicParser.expression_return expression230 =null;


        CommonTree COLOR228_tree=null;
        CommonTree EQ229_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:203:10: ( COLOR ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:203:12: COLOR ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            COLOR228=(Token)match(input,COLOR,FOLLOW_COLOR_in_colorstmt1904); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLOR228_tree = 
            (CommonTree)adaptor.create(COLOR228)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(COLOR228_tree, root_0);
            }

            EQ229=(Token)match(input,EQ,FOLLOW_EQ_in_colorstmt1907); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ229_tree = 
            (CommonTree)adaptor.create(EQ229)
            ;
            adaptor.addChild(root_0, EQ229_tree);
            }

            pushFollow(FOLLOW_expression_in_colorstmt1909);
            expression230=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression230.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "colorstmt"


    public static class hcolorstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hcolorstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:204:1: hcolorstmt : HCOLOR ^ EQ expression ;
    public final jvmBasicParser.hcolorstmt_return hcolorstmt() throws RecognitionException {
        jvmBasicParser.hcolorstmt_return retval = new jvmBasicParser.hcolorstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HCOLOR231=null;
        Token EQ232=null;
        jvmBasicParser.expression_return expression233 =null;


        CommonTree HCOLOR231_tree=null;
        CommonTree EQ232_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:204:11: ( HCOLOR ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:204:13: HCOLOR ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HCOLOR231=(Token)match(input,HCOLOR,FOLLOW_HCOLOR_in_hcolorstmt1915); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HCOLOR231_tree = 
            (CommonTree)adaptor.create(HCOLOR231)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HCOLOR231_tree, root_0);
            }

            EQ232=(Token)match(input,EQ,FOLLOW_EQ_in_hcolorstmt1918); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ232_tree = 
            (CommonTree)adaptor.create(EQ232)
            ;
            adaptor.addChild(root_0, EQ232_tree);
            }

            pushFollow(FOLLOW_expression_in_hcolorstmt1920);
            expression233=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression233.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hcolorstmt"


    public static class hlinstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hlinstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:1: hlinstmt : HLIN ^ expression COMMA expression AT expression ;
    public final jvmBasicParser.hlinstmt_return hlinstmt() throws RecognitionException {
        jvmBasicParser.hlinstmt_return retval = new jvmBasicParser.hlinstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HLIN234=null;
        Token COMMA236=null;
        Token AT238=null;
        jvmBasicParser.expression_return expression235 =null;

        jvmBasicParser.expression_return expression237 =null;

        jvmBasicParser.expression_return expression239 =null;


        CommonTree HLIN234_tree=null;
        CommonTree COMMA236_tree=null;
        CommonTree AT238_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:9: ( HLIN ^ expression COMMA expression AT expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:11: HLIN ^ expression COMMA expression AT expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HLIN234=(Token)match(input,HLIN,FOLLOW_HLIN_in_hlinstmt1926); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HLIN234_tree = 
            (CommonTree)adaptor.create(HLIN234)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HLIN234_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_hlinstmt1929);
            expression235=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression235.getTree());

            COMMA236=(Token)match(input,COMMA,FOLLOW_COMMA_in_hlinstmt1931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA236_tree = 
            (CommonTree)adaptor.create(COMMA236)
            ;
            adaptor.addChild(root_0, COMMA236_tree);
            }

            pushFollow(FOLLOW_expression_in_hlinstmt1933);
            expression237=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression237.getTree());

            AT238=(Token)match(input,AT,FOLLOW_AT_in_hlinstmt1935); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT238_tree = 
            (CommonTree)adaptor.create(AT238)
            ;
            adaptor.addChild(root_0, AT238_tree);
            }

            pushFollow(FOLLOW_expression_in_hlinstmt1937);
            expression239=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression239.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hlinstmt"


    public static class vlinstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vlinstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:1: vlinstmt : VLIN ^ expression COMMA expression AT expression ;
    public final jvmBasicParser.vlinstmt_return vlinstmt() throws RecognitionException {
        jvmBasicParser.vlinstmt_return retval = new jvmBasicParser.vlinstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VLIN240=null;
        Token COMMA242=null;
        Token AT244=null;
        jvmBasicParser.expression_return expression241 =null;

        jvmBasicParser.expression_return expression243 =null;

        jvmBasicParser.expression_return expression245 =null;


        CommonTree VLIN240_tree=null;
        CommonTree COMMA242_tree=null;
        CommonTree AT244_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:9: ( VLIN ^ expression COMMA expression AT expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:11: VLIN ^ expression COMMA expression AT expression
            {
            root_0 = (CommonTree)adaptor.nil();


            VLIN240=(Token)match(input,VLIN,FOLLOW_VLIN_in_vlinstmt1943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VLIN240_tree = 
            (CommonTree)adaptor.create(VLIN240)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VLIN240_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_vlinstmt1946);
            expression241=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression241.getTree());

            COMMA242=(Token)match(input,COMMA,FOLLOW_COMMA_in_vlinstmt1948); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA242_tree = 
            (CommonTree)adaptor.create(COMMA242)
            ;
            adaptor.addChild(root_0, COMMA242_tree);
            }

            pushFollow(FOLLOW_expression_in_vlinstmt1950);
            expression243=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression243.getTree());

            AT244=(Token)match(input,AT,FOLLOW_AT_in_vlinstmt1952); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT244_tree = 
            (CommonTree)adaptor.create(AT244)
            ;
            adaptor.addChild(root_0, AT244_tree);
            }

            pushFollow(FOLLOW_expression_in_vlinstmt1954);
            expression245=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression245.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "vlinstmt"


    public static class onerrstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "onerrstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:1: onerrstmt : ONERR GOTO linenumber ;
    public final jvmBasicParser.onerrstmt_return onerrstmt() throws RecognitionException {
        jvmBasicParser.onerrstmt_return retval = new jvmBasicParser.onerrstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ONERR246=null;
        Token GOTO247=null;
        jvmBasicParser.linenumber_return linenumber248 =null;


        CommonTree ONERR246_tree=null;
        CommonTree GOTO247_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:10: ( ONERR GOTO linenumber )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:12: ONERR GOTO linenumber
            {
            root_0 = (CommonTree)adaptor.nil();


            ONERR246=(Token)match(input,ONERR,FOLLOW_ONERR_in_onerrstmt1960); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ONERR246_tree = 
            (CommonTree)adaptor.create(ONERR246)
            ;
            adaptor.addChild(root_0, ONERR246_tree);
            }

            GOTO247=(Token)match(input,GOTO,FOLLOW_GOTO_in_onerrstmt1962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOTO247_tree = 
            (CommonTree)adaptor.create(GOTO247)
            ;
            adaptor.addChild(root_0, GOTO247_tree);
            }

            pushFollow(FOLLOW_linenumber_in_onerrstmt1964);
            linenumber248=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber248.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "onerrstmt"


    public static class prstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:1: prstmt : PRNUMBER ^ NUMBER ;
    public final jvmBasicParser.prstmt_return prstmt() throws RecognitionException {
        jvmBasicParser.prstmt_return retval = new jvmBasicParser.prstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRNUMBER249=null;
        Token NUMBER250=null;

        CommonTree PRNUMBER249_tree=null;
        CommonTree NUMBER250_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:7: ( PRNUMBER ^ NUMBER )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:9: PRNUMBER ^ NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();


            PRNUMBER249=(Token)match(input,PRNUMBER,FOLLOW_PRNUMBER_in_prstmt1970); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRNUMBER249_tree = 
            (CommonTree)adaptor.create(PRNUMBER249)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PRNUMBER249_tree, root_0);
            }

            NUMBER250=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_prstmt1973); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER250_tree = 
            (CommonTree)adaptor.create(NUMBER250)
            ;
            adaptor.addChild(root_0, NUMBER250_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prstmt"


    public static class instmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:1: instmt : INNUMBER ^ NUMBER ;
    public final jvmBasicParser.instmt_return instmt() throws RecognitionException {
        jvmBasicParser.instmt_return retval = new jvmBasicParser.instmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INNUMBER251=null;
        Token NUMBER252=null;

        CommonTree INNUMBER251_tree=null;
        CommonTree NUMBER252_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:7: ( INNUMBER ^ NUMBER )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:9: INNUMBER ^ NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();


            INNUMBER251=(Token)match(input,INNUMBER,FOLLOW_INNUMBER_in_instmt1979); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INNUMBER251_tree = 
            (CommonTree)adaptor.create(INNUMBER251)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(INNUMBER251_tree, root_0);
            }

            NUMBER252=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_instmt1982); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER252_tree = 
            (CommonTree)adaptor.create(NUMBER252)
            ;
            adaptor.addChild(root_0, NUMBER252_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instmt"


    public static class storestmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storestmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:210:1: storestmt : STORE vardecl ;
    public final jvmBasicParser.storestmt_return storestmt() throws RecognitionException {
        jvmBasicParser.storestmt_return retval = new jvmBasicParser.storestmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STORE253=null;
        jvmBasicParser.vardecl_return vardecl254 =null;


        CommonTree STORE253_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:210:10: ( STORE vardecl )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:210:12: STORE vardecl
            {
            root_0 = (CommonTree)adaptor.nil();


            STORE253=(Token)match(input,STORE,FOLLOW_STORE_in_storestmt1988); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STORE253_tree = 
            (CommonTree)adaptor.create(STORE253)
            ;
            adaptor.addChild(root_0, STORE253_tree);
            }

            pushFollow(FOLLOW_vardecl_in_storestmt1990);
            vardecl254=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl254.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "storestmt"


    public static class recallstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "recallstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:1: recallstmt : RECALL vardecl ;
    public final jvmBasicParser.recallstmt_return recallstmt() throws RecognitionException {
        jvmBasicParser.recallstmt_return retval = new jvmBasicParser.recallstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RECALL255=null;
        jvmBasicParser.vardecl_return vardecl256 =null;


        CommonTree RECALL255_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:11: ( RECALL vardecl )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:13: RECALL vardecl
            {
            root_0 = (CommonTree)adaptor.nil();


            RECALL255=(Token)match(input,RECALL,FOLLOW_RECALL_in_recallstmt1996); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RECALL255_tree = 
            (CommonTree)adaptor.create(RECALL255)
            ;
            adaptor.addChild(root_0, RECALL255_tree);
            }

            pushFollow(FOLLOW_vardecl_in_recallstmt1998);
            vardecl256=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl256.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "recallstmt"


    public static class liststmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "liststmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:1: liststmt : LIST ^ ( expression )? ;
    public final jvmBasicParser.liststmt_return liststmt() throws RecognitionException {
        jvmBasicParser.liststmt_return retval = new jvmBasicParser.liststmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LIST257=null;
        jvmBasicParser.expression_return expression258 =null;


        CommonTree LIST257_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:9: ( LIST ^ ( expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:11: LIST ^ ( expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            LIST257=(Token)match(input,LIST,FOLLOW_LIST_in_liststmt2004); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LIST257_tree = 
            (CommonTree)adaptor.create(LIST257)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LIST257_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:17: ( expression )?
            int alt30=2;
            switch ( input.LA(1) ) {
                case ABS:
                case ASC:
                case ATN:
                case CHR:
                case COS:
                case EXP:
                case FLOAT:
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
                case VAL:
                    {
                    alt30=1;
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:17: expression
                    {
                    pushFollow(FOLLOW_expression_in_liststmt2007);
                    expression258=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression258.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "liststmt"


    public static class popstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "popstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:1: popstmt : POP ^ ( expression COMMA expression )? ;
    public final jvmBasicParser.popstmt_return popstmt() throws RecognitionException {
        jvmBasicParser.popstmt_return retval = new jvmBasicParser.popstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POP259=null;
        Token COMMA261=null;
        jvmBasicParser.expression_return expression260 =null;

        jvmBasicParser.expression_return expression262 =null;


        CommonTree POP259_tree=null;
        CommonTree COMMA261_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:9: ( POP ^ ( expression COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:11: POP ^ ( expression COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            POP259=(Token)match(input,POP,FOLLOW_POP_in_popstmt2015); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POP259_tree = 
            (CommonTree)adaptor.create(POP259)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(POP259_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:16: ( expression COMMA expression )?
            int alt31=2;
            switch ( input.LA(1) ) {
                case ABS:
                case ASC:
                case ATN:
                case CHR:
                case COS:
                case EXP:
                case FLOAT:
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
                case VAL:
                    {
                    alt31=1;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:17: expression COMMA expression
                    {
                    pushFollow(FOLLOW_expression_in_popstmt2019);
                    expression260=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression260.getTree());

                    COMMA261=(Token)match(input,COMMA,FOLLOW_COMMA_in_popstmt2021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA261_tree = 
                    (CommonTree)adaptor.create(COMMA261)
                    ;
                    adaptor.addChild(root_0, COMMA261_tree);
                    }

                    pushFollow(FOLLOW_expression_in_popstmt2023);
                    expression262=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression262.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "popstmt"


    public static class amptstmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "amptstmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:214:1: amptstmt : AMPERSAND ^ expression ;
    public final jvmBasicParser.amptstmt_return amptstmt() throws RecognitionException {
        jvmBasicParser.amptstmt_return retval = new jvmBasicParser.amptstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AMPERSAND263=null;
        jvmBasicParser.expression_return expression264 =null;


        CommonTree AMPERSAND263_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:214:9: ( AMPERSAND ^ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:214:11: AMPERSAND ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            AMPERSAND263=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_amptstmt2031); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AMPERSAND263_tree = 
            (CommonTree)adaptor.create(AMPERSAND263)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(AMPERSAND263_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_amptstmt2034);
            expression264=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression264.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "amptstmt"


    public static class includestmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includestmt"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:215:1: includestmt : INCLUDE ^ expression ;
    public final jvmBasicParser.includestmt_return includestmt() throws RecognitionException {
        jvmBasicParser.includestmt_return retval = new jvmBasicParser.includestmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INCLUDE265=null;
        jvmBasicParser.expression_return expression266 =null;


        CommonTree INCLUDE265_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:215:13: ( INCLUDE ^ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:215:15: INCLUDE ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            INCLUDE265=(Token)match(input,INCLUDE,FOLLOW_INCLUDE_in_includestmt2041); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INCLUDE265_tree = 
            (CommonTree)adaptor.create(INCLUDE265)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(INCLUDE265_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_includestmt2044);
            expression266=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression266.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "includestmt"


    public static class func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:1: func : ( vardecl | stringliteral | NUMBER | FLOAT | chrfunc | sqrfunc | lenfunc | strfunc | ascfunc | scrnfunc | midfunc | pdlfunc | peekfunc | intfunc | spcfunc | frefunc | posfunc | usrfunc | leftfunc | valfunc | rightfunc | fnfunc | sinfunc | cosfunc | tanfunc | atnfunc | rndfunc | sgnfunc | expfunc | logfunc | absfunc | ( LPAREN expression RPAREN ) );
    public final jvmBasicParser.func_return func() throws RecognitionException {
        jvmBasicParser.func_return retval = new jvmBasicParser.func_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NUMBER269=null;
        Token FLOAT270=null;
        Token LPAREN298=null;
        Token RPAREN300=null;
        jvmBasicParser.vardecl_return vardecl267 =null;

        jvmBasicParser.stringliteral_return stringliteral268 =null;

        jvmBasicParser.chrfunc_return chrfunc271 =null;

        jvmBasicParser.sqrfunc_return sqrfunc272 =null;

        jvmBasicParser.lenfunc_return lenfunc273 =null;

        jvmBasicParser.strfunc_return strfunc274 =null;

        jvmBasicParser.ascfunc_return ascfunc275 =null;

        jvmBasicParser.scrnfunc_return scrnfunc276 =null;

        jvmBasicParser.midfunc_return midfunc277 =null;

        jvmBasicParser.pdlfunc_return pdlfunc278 =null;

        jvmBasicParser.peekfunc_return peekfunc279 =null;

        jvmBasicParser.intfunc_return intfunc280 =null;

        jvmBasicParser.spcfunc_return spcfunc281 =null;

        jvmBasicParser.frefunc_return frefunc282 =null;

        jvmBasicParser.posfunc_return posfunc283 =null;

        jvmBasicParser.usrfunc_return usrfunc284 =null;

        jvmBasicParser.leftfunc_return leftfunc285 =null;

        jvmBasicParser.valfunc_return valfunc286 =null;

        jvmBasicParser.rightfunc_return rightfunc287 =null;

        jvmBasicParser.fnfunc_return fnfunc288 =null;

        jvmBasicParser.sinfunc_return sinfunc289 =null;

        jvmBasicParser.cosfunc_return cosfunc290 =null;

        jvmBasicParser.tanfunc_return tanfunc291 =null;

        jvmBasicParser.atnfunc_return atnfunc292 =null;

        jvmBasicParser.rndfunc_return rndfunc293 =null;

        jvmBasicParser.sgnfunc_return sgnfunc294 =null;

        jvmBasicParser.expfunc_return expfunc295 =null;

        jvmBasicParser.logfunc_return logfunc296 =null;

        jvmBasicParser.absfunc_return absfunc297 =null;

        jvmBasicParser.expression_return expression299 =null;


        CommonTree NUMBER269_tree=null;
        CommonTree FLOAT270_tree=null;
        CommonTree LPAREN298_tree=null;
        CommonTree RPAREN300_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:6: ( vardecl | stringliteral | NUMBER | FLOAT | chrfunc | sqrfunc | lenfunc | strfunc | ascfunc | scrnfunc | midfunc | pdlfunc | peekfunc | intfunc | spcfunc | frefunc | posfunc | usrfunc | leftfunc | valfunc | rightfunc | fnfunc | sinfunc | cosfunc | tanfunc | atnfunc | rndfunc | sgnfunc | expfunc | logfunc | absfunc | ( LPAREN expression RPAREN ) )
            int alt32=32;
            switch ( input.LA(1) ) {
            case LETTERS:
                {
                alt32=1;
                }
                break;
            case STRINGLITERAL:
                {
                alt32=2;
                }
                break;
            case NUMBER:
                {
                alt32=3;
                }
                break;
            case FLOAT:
                {
                alt32=4;
                }
                break;
            case CHR:
                {
                alt32=5;
                }
                break;
            case SQR:
                {
                alt32=6;
                }
                break;
            case LEN:
                {
                alt32=7;
                }
                break;
            case STR:
                {
                alt32=8;
                }
                break;
            case ASC:
                {
                alt32=9;
                }
                break;
            case SCRN:
                {
                alt32=10;
                }
                break;
            case MID:
                {
                alt32=11;
                }
                break;
            case PDL:
                {
                alt32=12;
                }
                break;
            case PEEK:
                {
                alt32=13;
                }
                break;
            case INTF:
                {
                alt32=14;
                }
                break;
            case SPC:
                {
                alt32=15;
                }
                break;
            case FRE:
                {
                alt32=16;
                }
                break;
            case POS:
                {
                alt32=17;
                }
                break;
            case USR:
                {
                alt32=18;
                }
                break;
            case LEFT:
                {
                alt32=19;
                }
                break;
            case VAL:
                {
                alt32=20;
                }
                break;
            case RIGHT:
                {
                alt32=21;
                }
                break;
            case FN:
                {
                alt32=22;
                }
                break;
            case SIN:
                {
                alt32=23;
                }
                break;
            case COS:
                {
                alt32=24;
                }
                break;
            case TAN:
                {
                alt32=25;
                }
                break;
            case ATN:
                {
                alt32=26;
                }
                break;
            case RND:
                {
                alt32=27;
                }
                break;
            case SGN:
                {
                alt32=28;
                }
                break;
            case EXP:
                {
                alt32=29;
                }
                break;
            case LOG:
                {
                alt32=30;
                }
                break;
            case ABS:
                {
                alt32=31;
                }
                break;
            case LPAREN:
                {
                alt32=32;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:8: vardecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vardecl_in_func2056);
                    vardecl267=vardecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl267.getTree());

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:18: stringliteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringliteral_in_func2060);
                    stringliteral268=stringliteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringliteral268.getTree());

                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:34: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER269=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_func2064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER269_tree = 
                    (CommonTree)adaptor.create(NUMBER269)
                    ;
                    adaptor.addChild(root_0, NUMBER269_tree);
                    }

                    }
                    break;
                case 4 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:43: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT270=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_func2068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT270_tree = 
                    (CommonTree)adaptor.create(FLOAT270)
                    ;
                    adaptor.addChild(root_0, FLOAT270_tree);
                    }

                    }
                    break;
                case 5 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:51: chrfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_chrfunc_in_func2072);
                    chrfunc271=chrfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, chrfunc271.getTree());

                    }
                    break;
                case 6 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:61: sqrfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sqrfunc_in_func2076);
                    sqrfunc272=sqrfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqrfunc272.getTree());

                    }
                    break;
                case 7 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:71: lenfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lenfunc_in_func2080);
                    lenfunc273=lenfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lenfunc273.getTree());

                    }
                    break;
                case 8 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:81: strfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_strfunc_in_func2084);
                    strfunc274=strfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strfunc274.getTree());

                    }
                    break;
                case 9 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:91: ascfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ascfunc_in_func2088);
                    ascfunc275=ascfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ascfunc275.getTree());

                    }
                    break;
                case 10 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:100: scrnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_scrnfunc_in_func2091);
                    scrnfunc276=scrnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scrnfunc276.getTree());

                    }
                    break;
                case 11 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:112: midfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_midfunc_in_func2096);
                    midfunc277=midfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, midfunc277.getTree());

                    }
                    break;
                case 12 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:122: pdlfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_pdlfunc_in_func2100);
                    pdlfunc278=pdlfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pdlfunc278.getTree());

                    }
                    break;
                case 13 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:132: peekfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_peekfunc_in_func2104);
                    peekfunc279=peekfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, peekfunc279.getTree());

                    }
                    break;
                case 14 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:143: intfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_intfunc_in_func2108);
                    intfunc280=intfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, intfunc280.getTree());

                    }
                    break;
                case 15 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:153: spcfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spcfunc_in_func2112);
                    spcfunc281=spcfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spcfunc281.getTree());

                    }
                    break;
                case 16 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:163: frefunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_frefunc_in_func2116);
                    frefunc282=frefunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, frefunc282.getTree());

                    }
                    break;
                case 17 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:173: posfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_posfunc_in_func2120);
                    posfunc283=posfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, posfunc283.getTree());

                    }
                    break;
                case 18 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:183: usrfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_usrfunc_in_func2124);
                    usrfunc284=usrfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usrfunc284.getTree());

                    }
                    break;
                case 19 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:192: leftfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_leftfunc_in_func2127);
                    leftfunc285=leftfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftfunc285.getTree());

                    }
                    break;
                case 20 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:203: valfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_valfunc_in_func2131);
                    valfunc286=valfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, valfunc286.getTree());

                    }
                    break;
                case 21 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:213: rightfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rightfunc_in_func2135);
                    rightfunc287=rightfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rightfunc287.getTree());

                    }
                    break;
                case 22 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:223: fnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_fnfunc_in_func2137);
                    fnfunc288=fnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fnfunc288.getTree());

                    }
                    break;
                case 23 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:230: sinfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sinfunc_in_func2139);
                    sinfunc289=sinfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sinfunc289.getTree());

                    }
                    break;
                case 24 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:240: cosfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_cosfunc_in_func2143);
                    cosfunc290=cosfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cosfunc290.getTree());

                    }
                    break;
                case 25 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:249: tanfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tanfunc_in_func2146);
                    tanfunc291=tanfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tanfunc291.getTree());

                    }
                    break;
                case 26 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:257: atnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atnfunc_in_func2148);
                    atnfunc292=atnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atnfunc292.getTree());

                    }
                    break;
                case 27 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:265: rndfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rndfunc_in_func2150);
                    rndfunc293=rndfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rndfunc293.getTree());

                    }
                    break;
                case 28 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:273: sgnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sgnfunc_in_func2152);
                    sgnfunc294=sgnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sgnfunc294.getTree());

                    }
                    break;
                case 29 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:281: expfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expfunc_in_func2154);
                    expfunc295=expfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expfunc295.getTree());

                    }
                    break;
                case 30 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:289: logfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_logfunc_in_func2156);
                    logfunc296=logfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logfunc296.getTree());

                    }
                    break;
                case 31 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:297: absfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_absfunc_in_func2158);
                    absfunc297=absfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, absfunc297.getTree());

                    }
                    break;
                case 32 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:307: ( LPAREN expression RPAREN )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:307: ( LPAREN expression RPAREN )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:308: LPAREN expression RPAREN
                    {
                    LPAREN298=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func2163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN298_tree = 
                    (CommonTree)adaptor.create(LPAREN298)
                    ;
                    adaptor.addChild(root_0, LPAREN298_tree);
                    }

                    pushFollow(FOLLOW_expression_in_func2165);
                    expression299=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression299.getTree());

                    RPAREN300=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func2167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN300_tree = 
                    (CommonTree)adaptor.create(RPAREN300)
                    ;
                    adaptor.addChild(root_0, RPAREN300_tree);
                    }

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class signExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "signExpression"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:1: signExpression : ( NOT )? ( ( PLUS | MINUS ) )* func ;
    public final jvmBasicParser.signExpression_return signExpression() throws RecognitionException {
        jvmBasicParser.signExpression_return retval = new jvmBasicParser.signExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NOT301=null;
        Token set302=null;
        jvmBasicParser.func_return func303 =null;


        CommonTree NOT301_tree=null;
        CommonTree set302_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:16: ( ( NOT )? ( ( PLUS | MINUS ) )* func )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:18: ( NOT )? ( ( PLUS | MINUS ) )* func
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:18: ( NOT )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:18: NOT
                    {
                    NOT301=(Token)match(input,NOT,FOLLOW_NOT_in_signExpression2175); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT301_tree = 
                    (CommonTree)adaptor.create(NOT301)
                    ;
                    adaptor.addChild(root_0, NOT301_tree);
                    }

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:23: ( ( PLUS | MINUS ) )*
            loop34:
            do {
                int alt34=2;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                    {
                    alt34=1;
                    }
                    break;

                }

                switch (alt34) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            	    {
            	    set302=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set302)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            pushFollow(FOLLOW_func_in_signExpression2187);
            func303=func();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, func303.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "signExpression"


    public static class exponentExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exponentExpression"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:1: exponentExpression : signExpression ( EXPONENT signExpression )* ;
    public final jvmBasicParser.exponentExpression_return exponentExpression() throws RecognitionException {
        jvmBasicParser.exponentExpression_return retval = new jvmBasicParser.exponentExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EXPONENT305=null;
        jvmBasicParser.signExpression_return signExpression304 =null;

        jvmBasicParser.signExpression_return signExpression306 =null;


        CommonTree EXPONENT305_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:20: ( signExpression ( EXPONENT signExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:22: signExpression ( EXPONENT signExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_signExpression_in_exponentExpression2194);
            signExpression304=signExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, signExpression304.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:37: ( EXPONENT signExpression )*
            loop35:
            do {
                int alt35=2;
                switch ( input.LA(1) ) {
                case EXPONENT:
                    {
                    alt35=1;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:38: EXPONENT signExpression
            	    {
            	    EXPONENT305=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponentExpression2197); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EXPONENT305_tree = 
            	    (CommonTree)adaptor.create(EXPONENT305)
            	    ;
            	    adaptor.addChild(root_0, EXPONENT305_tree);
            	    }

            	    pushFollow(FOLLOW_signExpression_in_exponentExpression2199);
            	    signExpression306=signExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, signExpression306.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exponentExpression"


    public static class multiplyingExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplyingExpression"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:1: multiplyingExpression : exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )* ;
    public final jvmBasicParser.multiplyingExpression_return multiplyingExpression() throws RecognitionException {
        jvmBasicParser.multiplyingExpression_return retval = new jvmBasicParser.multiplyingExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set308=null;
        jvmBasicParser.exponentExpression_return exponentExpression307 =null;

        jvmBasicParser.exponentExpression_return exponentExpression309 =null;


        CommonTree set308_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:24: ( exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:26: exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_exponentExpression_in_multiplyingExpression2209);
            exponentExpression307=exponentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentExpression307.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:45: ( ( TIMES | DIV ) ^ exponentExpression )*
            loop36:
            do {
                int alt36=2;
                switch ( input.LA(1) ) {
                case DIV:
                case TIMES:
                    {
                    alt36=1;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:46: ( TIMES | DIV ) ^ exponentExpression
            	    {
            	    set308=(Token)input.LT(1);

            	    set308=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==TIMES ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set308)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_exponentExpression_in_multiplyingExpression2219);
            	    exponentExpression309=exponentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentExpression309.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplyingExpression"


    public static class addingExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "addingExpression"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:1: addingExpression : multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )* ;
    public final jvmBasicParser.addingExpression_return addingExpression() throws RecognitionException {
        jvmBasicParser.addingExpression_return retval = new jvmBasicParser.addingExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set311=null;
        jvmBasicParser.multiplyingExpression_return multiplyingExpression310 =null;

        jvmBasicParser.multiplyingExpression_return multiplyingExpression312 =null;


        CommonTree set311_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:18: ( multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:20: multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplyingExpression_in_addingExpression2228);
            multiplyingExpression310=multiplyingExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyingExpression310.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:42: ( ( PLUS | MINUS ) ^ multiplyingExpression )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                    {
                    int LA37_1 = input.LA(2);

                    if ( (synpred142_jvmBasic()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:43: ( PLUS | MINUS ) ^ multiplyingExpression
            	    {
            	    set311=(Token)input.LT(1);

            	    set311=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set311)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplyingExpression_in_addingExpression2238);
            	    multiplyingExpression312=multiplyingExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyingExpression312.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "addingExpression"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpression"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:1: relationalExpression : addingExpression ( ( relop ^) addingExpression )* ;
    public final jvmBasicParser.relationalExpression_return relationalExpression() throws RecognitionException {
        jvmBasicParser.relationalExpression_return retval = new jvmBasicParser.relationalExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.addingExpression_return addingExpression313 =null;

        jvmBasicParser.relop_return relop314 =null;

        jvmBasicParser.addingExpression_return addingExpression315 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:23: ( addingExpression ( ( relop ^) addingExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:25: addingExpression ( ( relop ^) addingExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_addingExpression_in_relationalExpression2248);
            addingExpression313=addingExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addingExpression313.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:42: ( ( relop ^) addingExpression )*
            loop38:
            do {
                int alt38=2;
                switch ( input.LA(1) ) {
                case EQ:
                case GT:
                case GTE:
                case LT:
                case LTE:
                case NEQ:
                    {
                    alt38=1;
                    }
                    break;

                }

                switch (alt38) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:43: ( relop ^) addingExpression
            	    {
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:43: ( relop ^)
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:223:44: relop ^
            	    {
            	    pushFollow(FOLLOW_relop_in_relationalExpression2252);
            	    relop314=relop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(relop314.getTree(), root_0);

            	    }


            	    pushFollow(FOLLOW_addingExpression_in_relationalExpression2256);
            	    addingExpression315=addingExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addingExpression315.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:1: expression : relationalExpression ( ( AND | OR ) relationalExpression ^)* ;
    public final jvmBasicParser.expression_return expression() throws RecognitionException {
        jvmBasicParser.expression_return retval = new jvmBasicParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set317=null;
        jvmBasicParser.relationalExpression_return relationalExpression316 =null;

        jvmBasicParser.relationalExpression_return relationalExpression318 =null;


        CommonTree set317_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:11: ( relationalExpression ( ( AND | OR ) relationalExpression ^)* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:13: relationalExpression ( ( AND | OR ) relationalExpression ^)*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_expression2264);
            relationalExpression316=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression316.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:34: ( ( AND | OR ) relationalExpression ^)*
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case AND:
                case OR:
                    {
                    alt39=1;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:224:35: ( AND | OR ) relationalExpression ^
            	    {
            	    set317=(Token)input.LT(1);

            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set317)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_expression2273);
            	    relationalExpression318=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(relationalExpression318.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class var_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:1: var : varname ^ ( varsuffix )? ;
    public final jvmBasicParser.var_return var() throws RecognitionException {
        jvmBasicParser.var_return retval = new jvmBasicParser.var_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.varname_return varname319 =null;

        jvmBasicParser.varsuffix_return varsuffix320 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:4: ( varname ^ ( varsuffix )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:6: varname ^ ( varsuffix )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_varname_in_var2284);
            varname319=varname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(varname319.getTree(), root_0);

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:15: ( varsuffix )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case 125:
                case 126:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:15: varsuffix
                    {
                    pushFollow(FOLLOW_varsuffix_in_var2287);
                    varsuffix320=varsuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varsuffix320.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var"


    public static class varname_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varname"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:1: varname : LETTERS ( LETTERS | DIGIT )* ;
    public final jvmBasicParser.varname_return varname() throws RecognitionException {
        jvmBasicParser.varname_return retval = new jvmBasicParser.varname_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTERS321=null;
        Token set322=null;

        CommonTree LETTERS321_tree=null;
        CommonTree set322_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:9: ( LETTERS ( LETTERS | DIGIT )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:11: LETTERS ( LETTERS | DIGIT )*
            {
            root_0 = (CommonTree)adaptor.nil();


            LETTERS321=(Token)match(input,LETTERS,FOLLOW_LETTERS_in_varname2295); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LETTERS321_tree = 
            (CommonTree)adaptor.create(LETTERS321)
            ;
            adaptor.addChild(root_0, LETTERS321_tree);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:19: ( LETTERS | DIGIT )*
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case LETTERS:
                    {
                    int LA41_1 = input.LA(2);

                    if ( (true) ) {
                        alt41=1;
                    }


                    }
                    break;
                case DIGIT:
                    {
                    alt41=1;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            	    {
            	    set322=(Token)input.LT(1);

            	    if ( input.LA(1)==DIGIT||input.LA(1)==LETTERS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set322)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varname"


    public static class varsuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varsuffix"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:1: varsuffix : ( '$' | '%' ) ;
    public final jvmBasicParser.varsuffix_return varsuffix() throws RecognitionException {
        jvmBasicParser.varsuffix_return retval = new jvmBasicParser.varsuffix_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set323=null;

        CommonTree set323_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:10: ( ( '$' | '%' ) )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set323=(Token)input.LT(1);

            if ( (input.LA(1) >= 125 && input.LA(1) <= 126) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set323)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varsuffix"


    public static class varlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varlist"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:1: varlist : vardecl ( COMMA ! vardecl ^)* ;
    public final jvmBasicParser.varlist_return varlist() throws RecognitionException {
        jvmBasicParser.varlist_return retval = new jvmBasicParser.varlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA325=null;
        jvmBasicParser.vardecl_return vardecl324 =null;

        jvmBasicParser.vardecl_return vardecl326 =null;


        CommonTree COMMA325_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:9: ( vardecl ( COMMA ! vardecl ^)* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:11: vardecl ( COMMA ! vardecl ^)*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_vardecl_in_varlist2323);
            vardecl324=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl324.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:19: ( COMMA ! vardecl ^)*
            loop42:
            do {
                int alt42=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt42=1;
                    }
                    break;

                }

                switch (alt42) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:230:20: COMMA ! vardecl ^
            	    {
            	    COMMA325=(Token)match(input,COMMA,FOLLOW_COMMA_in_varlist2326); if (state.failed) return retval;

            	    pushFollow(FOLLOW_vardecl_in_varlist2329);
            	    vardecl326=vardecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(vardecl326.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "varlist"


    public static class exprlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprlist"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:1: exprlist : expression ( COMMA ! expression ^)* ;
    public final jvmBasicParser.exprlist_return exprlist() throws RecognitionException {
        jvmBasicParser.exprlist_return retval = new jvmBasicParser.exprlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA328=null;
        jvmBasicParser.expression_return expression327 =null;

        jvmBasicParser.expression_return expression329 =null;


        CommonTree COMMA328_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:10: ( expression ( COMMA ! expression ^)* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:12: expression ( COMMA ! expression ^)*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_exprlist2339);
            expression327=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression327.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:23: ( COMMA ! expression ^)*
            loop43:
            do {
                int alt43=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt43=1;
                    }
                    break;

                }

                switch (alt43) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:231:24: COMMA ! expression ^
            	    {
            	    COMMA328=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist2342); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_exprlist2345);
            	    expression329=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(expression329.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprlist"


    public static class stringliteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringliteral"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:234:10: fragment stringliteral : STRINGLITERAL ;
    public final jvmBasicParser.stringliteral_return stringliteral() throws RecognitionException {
        jvmBasicParser.stringliteral_return retval = new jvmBasicParser.stringliteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRINGLITERAL330=null;

        CommonTree STRINGLITERAL330_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:234:23: ( STRINGLITERAL )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:234:25: STRINGLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            STRINGLITERAL330=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stringliteral2358); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL330_tree = 
            (CommonTree)adaptor.create(STRINGLITERAL330)
            ;
            adaptor.addChild(root_0, STRINGLITERAL330_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringliteral"


    public static class sqrfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sqrfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:1: sqrfunc : SQR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.sqrfunc_return sqrfunc() throws RecognitionException {
        jvmBasicParser.sqrfunc_return retval = new jvmBasicParser.sqrfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SQR331=null;
        Token LPAREN332=null;
        Token RPAREN334=null;
        jvmBasicParser.expression_return expression333 =null;


        CommonTree SQR331_tree=null;
        CommonTree LPAREN332_tree=null;
        CommonTree RPAREN334_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:9: ( SQR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:11: SQR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SQR331=(Token)match(input,SQR,FOLLOW_SQR_in_sqrfunc2368); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQR331_tree = 
            (CommonTree)adaptor.create(SQR331)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SQR331_tree, root_0);
            }

            LPAREN332=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqrfunc2371); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN332_tree = 
            (CommonTree)adaptor.create(LPAREN332)
            ;
            adaptor.addChild(root_0, LPAREN332_tree);
            }

            pushFollow(FOLLOW_expression_in_sqrfunc2373);
            expression333=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression333.getTree());

            RPAREN334=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqrfunc2375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN334_tree = 
            (CommonTree)adaptor.create(RPAREN334)
            ;
            adaptor.addChild(root_0, RPAREN334_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sqrfunc"


    public static class chrfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chrfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:1: chrfunc : CHR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.chrfunc_return chrfunc() throws RecognitionException {
        jvmBasicParser.chrfunc_return retval = new jvmBasicParser.chrfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHR335=null;
        Token LPAREN336=null;
        Token RPAREN338=null;
        jvmBasicParser.expression_return expression337 =null;


        CommonTree CHR335_tree=null;
        CommonTree LPAREN336_tree=null;
        CommonTree RPAREN338_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:9: ( CHR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:11: CHR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            CHR335=(Token)match(input,CHR,FOLLOW_CHR_in_chrfunc2382); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CHR335_tree = 
            (CommonTree)adaptor.create(CHR335)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CHR335_tree, root_0);
            }

            LPAREN336=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_chrfunc2385); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN336_tree = 
            (CommonTree)adaptor.create(LPAREN336)
            ;
            adaptor.addChild(root_0, LPAREN336_tree);
            }

            pushFollow(FOLLOW_expression_in_chrfunc2387);
            expression337=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression337.getTree());

            RPAREN338=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_chrfunc2389); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN338_tree = 
            (CommonTree)adaptor.create(RPAREN338)
            ;
            adaptor.addChild(root_0, RPAREN338_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chrfunc"


    public static class lenfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lenfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:1: lenfunc : LEN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.lenfunc_return lenfunc() throws RecognitionException {
        jvmBasicParser.lenfunc_return retval = new jvmBasicParser.lenfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LEN339=null;
        Token LPAREN340=null;
        Token RPAREN342=null;
        jvmBasicParser.expression_return expression341 =null;


        CommonTree LEN339_tree=null;
        CommonTree LPAREN340_tree=null;
        CommonTree RPAREN342_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:9: ( LEN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:11: LEN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            LEN339=(Token)match(input,LEN,FOLLOW_LEN_in_lenfunc2396); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEN339_tree = 
            (CommonTree)adaptor.create(LEN339)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LEN339_tree, root_0);
            }

            LPAREN340=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lenfunc2399); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN340_tree = 
            (CommonTree)adaptor.create(LPAREN340)
            ;
            adaptor.addChild(root_0, LPAREN340_tree);
            }

            pushFollow(FOLLOW_expression_in_lenfunc2401);
            expression341=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression341.getTree());

            RPAREN342=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lenfunc2403); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN342_tree = 
            (CommonTree)adaptor.create(RPAREN342)
            ;
            adaptor.addChild(root_0, RPAREN342_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lenfunc"


    public static class ascfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ascfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:1: ascfunc : ASC ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.ascfunc_return ascfunc() throws RecognitionException {
        jvmBasicParser.ascfunc_return retval = new jvmBasicParser.ascfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASC343=null;
        Token LPAREN344=null;
        Token RPAREN346=null;
        jvmBasicParser.expression_return expression345 =null;


        CommonTree ASC343_tree=null;
        CommonTree LPAREN344_tree=null;
        CommonTree RPAREN346_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:9: ( ASC ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:11: ASC ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            ASC343=(Token)match(input,ASC,FOLLOW_ASC_in_ascfunc2410); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASC343_tree = 
            (CommonTree)adaptor.create(ASC343)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ASC343_tree, root_0);
            }

            LPAREN344=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ascfunc2413); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN344_tree = 
            (CommonTree)adaptor.create(LPAREN344)
            ;
            adaptor.addChild(root_0, LPAREN344_tree);
            }

            pushFollow(FOLLOW_expression_in_ascfunc2415);
            expression345=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression345.getTree());

            RPAREN346=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ascfunc2417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN346_tree = 
            (CommonTree)adaptor.create(RPAREN346)
            ;
            adaptor.addChild(root_0, RPAREN346_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ascfunc"


    public static class midfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "midfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:1: midfunc : MID ^ LPAREN expression COMMA expression COMMA expression RPAREN ;
    public final jvmBasicParser.midfunc_return midfunc() throws RecognitionException {
        jvmBasicParser.midfunc_return retval = new jvmBasicParser.midfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MID347=null;
        Token LPAREN348=null;
        Token COMMA350=null;
        Token COMMA352=null;
        Token RPAREN354=null;
        jvmBasicParser.expression_return expression349 =null;

        jvmBasicParser.expression_return expression351 =null;

        jvmBasicParser.expression_return expression353 =null;


        CommonTree MID347_tree=null;
        CommonTree LPAREN348_tree=null;
        CommonTree COMMA350_tree=null;
        CommonTree COMMA352_tree=null;
        CommonTree RPAREN354_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:9: ( MID ^ LPAREN expression COMMA expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:11: MID ^ LPAREN expression COMMA expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            MID347=(Token)match(input,MID,FOLLOW_MID_in_midfunc2425); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MID347_tree = 
            (CommonTree)adaptor.create(MID347)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(MID347_tree, root_0);
            }

            LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_midfunc2428); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN348_tree = 
            (CommonTree)adaptor.create(LPAREN348)
            ;
            adaptor.addChild(root_0, LPAREN348_tree);
            }

            pushFollow(FOLLOW_expression_in_midfunc2430);
            expression349=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression349.getTree());

            COMMA350=(Token)match(input,COMMA,FOLLOW_COMMA_in_midfunc2432); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA350_tree = 
            (CommonTree)adaptor.create(COMMA350)
            ;
            adaptor.addChild(root_0, COMMA350_tree);
            }

            pushFollow(FOLLOW_expression_in_midfunc2434);
            expression351=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression351.getTree());

            COMMA352=(Token)match(input,COMMA,FOLLOW_COMMA_in_midfunc2436); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA352_tree = 
            (CommonTree)adaptor.create(COMMA352)
            ;
            adaptor.addChild(root_0, COMMA352_tree);
            }

            pushFollow(FOLLOW_expression_in_midfunc2438);
            expression353=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression353.getTree());

            RPAREN354=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_midfunc2440); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN354_tree = 
            (CommonTree)adaptor.create(RPAREN354)
            ;
            adaptor.addChild(root_0, RPAREN354_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "midfunc"


    public static class pdlfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pdlfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:243:1: pdlfunc : PDL ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.pdlfunc_return pdlfunc() throws RecognitionException {
        jvmBasicParser.pdlfunc_return retval = new jvmBasicParser.pdlfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PDL355=null;
        Token LPAREN356=null;
        Token RPAREN358=null;
        jvmBasicParser.expression_return expression357 =null;


        CommonTree PDL355_tree=null;
        CommonTree LPAREN356_tree=null;
        CommonTree RPAREN358_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:243:9: ( PDL ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:243:11: PDL ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            PDL355=(Token)match(input,PDL,FOLLOW_PDL_in_pdlfunc2447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PDL355_tree = 
            (CommonTree)adaptor.create(PDL355)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PDL355_tree, root_0);
            }

            LPAREN356=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pdlfunc2450); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN356_tree = 
            (CommonTree)adaptor.create(LPAREN356)
            ;
            adaptor.addChild(root_0, LPAREN356_tree);
            }

            pushFollow(FOLLOW_expression_in_pdlfunc2452);
            expression357=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression357.getTree());

            RPAREN358=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pdlfunc2454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN358_tree = 
            (CommonTree)adaptor.create(RPAREN358)
            ;
            adaptor.addChild(root_0, RPAREN358_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pdlfunc"


    public static class peekfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "peekfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:244:1: peekfunc : PEEK ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.peekfunc_return peekfunc() throws RecognitionException {
        jvmBasicParser.peekfunc_return retval = new jvmBasicParser.peekfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PEEK359=null;
        Token LPAREN360=null;
        Token RPAREN362=null;
        jvmBasicParser.expression_return expression361 =null;


        CommonTree PEEK359_tree=null;
        CommonTree LPAREN360_tree=null;
        CommonTree RPAREN362_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:244:9: ( PEEK ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:244:11: PEEK ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            PEEK359=(Token)match(input,PEEK,FOLLOW_PEEK_in_peekfunc2460); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PEEK359_tree = 
            (CommonTree)adaptor.create(PEEK359)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PEEK359_tree, root_0);
            }

            LPAREN360=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_peekfunc2463); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN360_tree = 
            (CommonTree)adaptor.create(LPAREN360)
            ;
            adaptor.addChild(root_0, LPAREN360_tree);
            }

            pushFollow(FOLLOW_expression_in_peekfunc2465);
            expression361=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression361.getTree());

            RPAREN362=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_peekfunc2467); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN362_tree = 
            (CommonTree)adaptor.create(RPAREN362)
            ;
            adaptor.addChild(root_0, RPAREN362_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "peekfunc"


    public static class intfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:245:1: intfunc : INTF ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.intfunc_return intfunc() throws RecognitionException {
        jvmBasicParser.intfunc_return retval = new jvmBasicParser.intfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INTF363=null;
        Token LPAREN364=null;
        Token RPAREN366=null;
        jvmBasicParser.expression_return expression365 =null;


        CommonTree INTF363_tree=null;
        CommonTree LPAREN364_tree=null;
        CommonTree RPAREN366_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:245:9: ( INTF ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:245:11: INTF ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            INTF363=(Token)match(input,INTF,FOLLOW_INTF_in_intfunc2474); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTF363_tree = 
            (CommonTree)adaptor.create(INTF363)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(INTF363_tree, root_0);
            }

            LPAREN364=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_intfunc2477); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN364_tree = 
            (CommonTree)adaptor.create(LPAREN364)
            ;
            adaptor.addChild(root_0, LPAREN364_tree);
            }

            pushFollow(FOLLOW_expression_in_intfunc2479);
            expression365=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression365.getTree());

            RPAREN366=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_intfunc2481); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN366_tree = 
            (CommonTree)adaptor.create(RPAREN366)
            ;
            adaptor.addChild(root_0, RPAREN366_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intfunc"


    public static class spcfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spcfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:246:1: spcfunc : SPC ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.spcfunc_return spcfunc() throws RecognitionException {
        jvmBasicParser.spcfunc_return retval = new jvmBasicParser.spcfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SPC367=null;
        Token LPAREN368=null;
        Token RPAREN370=null;
        jvmBasicParser.expression_return expression369 =null;


        CommonTree SPC367_tree=null;
        CommonTree LPAREN368_tree=null;
        CommonTree RPAREN370_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:246:8: ( SPC ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:246:11: SPC ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SPC367=(Token)match(input,SPC,FOLLOW_SPC_in_spcfunc2488); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SPC367_tree = 
            (CommonTree)adaptor.create(SPC367)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SPC367_tree, root_0);
            }

            LPAREN368=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_spcfunc2491); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN368_tree = 
            (CommonTree)adaptor.create(LPAREN368)
            ;
            adaptor.addChild(root_0, LPAREN368_tree);
            }

            pushFollow(FOLLOW_expression_in_spcfunc2493);
            expression369=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression369.getTree());

            RPAREN370=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_spcfunc2495); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN370_tree = 
            (CommonTree)adaptor.create(RPAREN370)
            ;
            adaptor.addChild(root_0, RPAREN370_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spcfunc"


    public static class frefunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "frefunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:247:1: frefunc : FRE ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.frefunc_return frefunc() throws RecognitionException {
        jvmBasicParser.frefunc_return retval = new jvmBasicParser.frefunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FRE371=null;
        Token LPAREN372=null;
        Token RPAREN374=null;
        jvmBasicParser.expression_return expression373 =null;


        CommonTree FRE371_tree=null;
        CommonTree LPAREN372_tree=null;
        CommonTree RPAREN374_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:247:9: ( FRE ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:247:11: FRE ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            FRE371=(Token)match(input,FRE,FOLLOW_FRE_in_frefunc2502); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FRE371_tree = 
            (CommonTree)adaptor.create(FRE371)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FRE371_tree, root_0);
            }

            LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_frefunc2505); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN372_tree = 
            (CommonTree)adaptor.create(LPAREN372)
            ;
            adaptor.addChild(root_0, LPAREN372_tree);
            }

            pushFollow(FOLLOW_expression_in_frefunc2507);
            expression373=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression373.getTree());

            RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_frefunc2509); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN374_tree = 
            (CommonTree)adaptor.create(RPAREN374)
            ;
            adaptor.addChild(root_0, RPAREN374_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "frefunc"


    public static class posfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "posfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:248:1: posfunc : POS ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.posfunc_return posfunc() throws RecognitionException {
        jvmBasicParser.posfunc_return retval = new jvmBasicParser.posfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POS375=null;
        Token LPAREN376=null;
        Token RPAREN378=null;
        jvmBasicParser.expression_return expression377 =null;


        CommonTree POS375_tree=null;
        CommonTree LPAREN376_tree=null;
        CommonTree RPAREN378_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:248:8: ( POS ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:248:11: POS ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            POS375=(Token)match(input,POS,FOLLOW_POS_in_posfunc2516); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POS375_tree = 
            (CommonTree)adaptor.create(POS375)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(POS375_tree, root_0);
            }

            LPAREN376=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_posfunc2519); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN376_tree = 
            (CommonTree)adaptor.create(LPAREN376)
            ;
            adaptor.addChild(root_0, LPAREN376_tree);
            }

            pushFollow(FOLLOW_expression_in_posfunc2521);
            expression377=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression377.getTree());

            RPAREN378=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_posfunc2523); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN378_tree = 
            (CommonTree)adaptor.create(RPAREN378)
            ;
            adaptor.addChild(root_0, RPAREN378_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "posfunc"


    public static class usrfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "usrfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:249:1: usrfunc : USR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.usrfunc_return usrfunc() throws RecognitionException {
        jvmBasicParser.usrfunc_return retval = new jvmBasicParser.usrfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token USR379=null;
        Token LPAREN380=null;
        Token RPAREN382=null;
        jvmBasicParser.expression_return expression381 =null;


        CommonTree USR379_tree=null;
        CommonTree LPAREN380_tree=null;
        CommonTree RPAREN382_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:249:8: ( USR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:249:11: USR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            USR379=(Token)match(input,USR,FOLLOW_USR_in_usrfunc2530); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            USR379_tree = 
            (CommonTree)adaptor.create(USR379)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(USR379_tree, root_0);
            }

            LPAREN380=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_usrfunc2533); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN380_tree = 
            (CommonTree)adaptor.create(LPAREN380)
            ;
            adaptor.addChild(root_0, LPAREN380_tree);
            }

            pushFollow(FOLLOW_expression_in_usrfunc2535);
            expression381=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression381.getTree());

            RPAREN382=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_usrfunc2537); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN382_tree = 
            (CommonTree)adaptor.create(RPAREN382)
            ;
            adaptor.addChild(root_0, RPAREN382_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "usrfunc"


    public static class leftfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "leftfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:250:1: leftfunc : LEFT ^ LPAREN expression COMMA expression RPAREN ;
    public final jvmBasicParser.leftfunc_return leftfunc() throws RecognitionException {
        jvmBasicParser.leftfunc_return retval = new jvmBasicParser.leftfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LEFT383=null;
        Token LPAREN384=null;
        Token COMMA386=null;
        Token RPAREN388=null;
        jvmBasicParser.expression_return expression385 =null;

        jvmBasicParser.expression_return expression387 =null;


        CommonTree LEFT383_tree=null;
        CommonTree LPAREN384_tree=null;
        CommonTree COMMA386_tree=null;
        CommonTree RPAREN388_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:250:9: ( LEFT ^ LPAREN expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:250:11: LEFT ^ LPAREN expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            LEFT383=(Token)match(input,LEFT,FOLLOW_LEFT_in_leftfunc2543); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFT383_tree = 
            (CommonTree)adaptor.create(LEFT383)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LEFT383_tree, root_0);
            }

            LPAREN384=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_leftfunc2546); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN384_tree = 
            (CommonTree)adaptor.create(LPAREN384)
            ;
            adaptor.addChild(root_0, LPAREN384_tree);
            }

            pushFollow(FOLLOW_expression_in_leftfunc2548);
            expression385=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression385.getTree());

            COMMA386=(Token)match(input,COMMA,FOLLOW_COMMA_in_leftfunc2550); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA386_tree = 
            (CommonTree)adaptor.create(COMMA386)
            ;
            adaptor.addChild(root_0, COMMA386_tree);
            }

            pushFollow(FOLLOW_expression_in_leftfunc2552);
            expression387=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression387.getTree());

            RPAREN388=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_leftfunc2554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN388_tree = 
            (CommonTree)adaptor.create(RPAREN388)
            ;
            adaptor.addChild(root_0, RPAREN388_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "leftfunc"


    public static class rightfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rightfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:251:1: rightfunc : RIGHT ^ LPAREN expression COMMA expression RPAREN ;
    public final jvmBasicParser.rightfunc_return rightfunc() throws RecognitionException {
        jvmBasicParser.rightfunc_return retval = new jvmBasicParser.rightfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RIGHT389=null;
        Token LPAREN390=null;
        Token COMMA392=null;
        Token RPAREN394=null;
        jvmBasicParser.expression_return expression391 =null;

        jvmBasicParser.expression_return expression393 =null;


        CommonTree RIGHT389_tree=null;
        CommonTree LPAREN390_tree=null;
        CommonTree COMMA392_tree=null;
        CommonTree RPAREN394_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:251:10: ( RIGHT ^ LPAREN expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:251:12: RIGHT ^ LPAREN expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            RIGHT389=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_rightfunc2560); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHT389_tree = 
            (CommonTree)adaptor.create(RIGHT389)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(RIGHT389_tree, root_0);
            }

            LPAREN390=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rightfunc2563); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN390_tree = 
            (CommonTree)adaptor.create(LPAREN390)
            ;
            adaptor.addChild(root_0, LPAREN390_tree);
            }

            pushFollow(FOLLOW_expression_in_rightfunc2565);
            expression391=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression391.getTree());

            COMMA392=(Token)match(input,COMMA,FOLLOW_COMMA_in_rightfunc2567); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA392_tree = 
            (CommonTree)adaptor.create(COMMA392)
            ;
            adaptor.addChild(root_0, COMMA392_tree);
            }

            pushFollow(FOLLOW_expression_in_rightfunc2569);
            expression393=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression393.getTree());

            RPAREN394=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rightfunc2571); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN394_tree = 
            (CommonTree)adaptor.create(RPAREN394)
            ;
            adaptor.addChild(root_0, RPAREN394_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rightfunc"


    public static class strfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "strfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:252:1: strfunc : STR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.strfunc_return strfunc() throws RecognitionException {
        jvmBasicParser.strfunc_return retval = new jvmBasicParser.strfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STR395=null;
        Token LPAREN396=null;
        Token RPAREN398=null;
        jvmBasicParser.expression_return expression397 =null;


        CommonTree STR395_tree=null;
        CommonTree LPAREN396_tree=null;
        CommonTree RPAREN398_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:252:9: ( STR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:252:11: STR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            STR395=(Token)match(input,STR,FOLLOW_STR_in_strfunc2578); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STR395_tree = 
            (CommonTree)adaptor.create(STR395)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(STR395_tree, root_0);
            }

            LPAREN396=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_strfunc2581); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN396_tree = 
            (CommonTree)adaptor.create(LPAREN396)
            ;
            adaptor.addChild(root_0, LPAREN396_tree);
            }

            pushFollow(FOLLOW_expression_in_strfunc2583);
            expression397=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression397.getTree());

            RPAREN398=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_strfunc2585); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN398_tree = 
            (CommonTree)adaptor.create(RPAREN398)
            ;
            adaptor.addChild(root_0, RPAREN398_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "strfunc"


    public static class fnfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fnfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:253:1: fnfunc : FN ^ var LPAREN expression RPAREN ;
    public final jvmBasicParser.fnfunc_return fnfunc() throws RecognitionException {
        jvmBasicParser.fnfunc_return retval = new jvmBasicParser.fnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FN399=null;
        Token LPAREN401=null;
        Token RPAREN403=null;
        jvmBasicParser.var_return var400 =null;

        jvmBasicParser.expression_return expression402 =null;


        CommonTree FN399_tree=null;
        CommonTree LPAREN401_tree=null;
        CommonTree RPAREN403_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:253:7: ( FN ^ var LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:253:9: FN ^ var LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            FN399=(Token)match(input,FN,FOLLOW_FN_in_fnfunc2592); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FN399_tree = 
            (CommonTree)adaptor.create(FN399)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FN399_tree, root_0);
            }

            pushFollow(FOLLOW_var_in_fnfunc2595);
            var400=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var400.getTree());

            LPAREN401=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fnfunc2597); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN401_tree = 
            (CommonTree)adaptor.create(LPAREN401)
            ;
            adaptor.addChild(root_0, LPAREN401_tree);
            }

            pushFollow(FOLLOW_expression_in_fnfunc2599);
            expression402=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression402.getTree());

            RPAREN403=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fnfunc2601); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN403_tree = 
            (CommonTree)adaptor.create(RPAREN403)
            ;
            adaptor.addChild(root_0, RPAREN403_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fnfunc"


    public static class valfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:254:1: valfunc : VAL ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.valfunc_return valfunc() throws RecognitionException {
        jvmBasicParser.valfunc_return retval = new jvmBasicParser.valfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VAL404=null;
        Token LPAREN405=null;
        Token RPAREN407=null;
        jvmBasicParser.expression_return expression406 =null;


        CommonTree VAL404_tree=null;
        CommonTree LPAREN405_tree=null;
        CommonTree RPAREN407_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:254:8: ( VAL ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:254:10: VAL ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            VAL404=(Token)match(input,VAL,FOLLOW_VAL_in_valfunc2607); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAL404_tree = 
            (CommonTree)adaptor.create(VAL404)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VAL404_tree, root_0);
            }

            LPAREN405=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valfunc2610); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN405_tree = 
            (CommonTree)adaptor.create(LPAREN405)
            ;
            adaptor.addChild(root_0, LPAREN405_tree);
            }

            pushFollow(FOLLOW_expression_in_valfunc2612);
            expression406=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression406.getTree());

            RPAREN407=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valfunc2614); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN407_tree = 
            (CommonTree)adaptor.create(RPAREN407)
            ;
            adaptor.addChild(root_0, RPAREN407_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "valfunc"


    public static class scrnfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "scrnfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:255:1: scrnfunc : SCRN ^ LPAREN expression COMMA expression RPAREN ;
    public final jvmBasicParser.scrnfunc_return scrnfunc() throws RecognitionException {
        jvmBasicParser.scrnfunc_return retval = new jvmBasicParser.scrnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SCRN408=null;
        Token LPAREN409=null;
        Token COMMA411=null;
        Token RPAREN413=null;
        jvmBasicParser.expression_return expression410 =null;

        jvmBasicParser.expression_return expression412 =null;


        CommonTree SCRN408_tree=null;
        CommonTree LPAREN409_tree=null;
        CommonTree COMMA411_tree=null;
        CommonTree RPAREN413_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:255:9: ( SCRN ^ LPAREN expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:255:11: SCRN ^ LPAREN expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SCRN408=(Token)match(input,SCRN,FOLLOW_SCRN_in_scrnfunc2620); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SCRN408_tree = 
            (CommonTree)adaptor.create(SCRN408)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SCRN408_tree, root_0);
            }

            LPAREN409=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scrnfunc2623); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN409_tree = 
            (CommonTree)adaptor.create(LPAREN409)
            ;
            adaptor.addChild(root_0, LPAREN409_tree);
            }

            pushFollow(FOLLOW_expression_in_scrnfunc2625);
            expression410=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression410.getTree());

            COMMA411=(Token)match(input,COMMA,FOLLOW_COMMA_in_scrnfunc2627); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA411_tree = 
            (CommonTree)adaptor.create(COMMA411)
            ;
            adaptor.addChild(root_0, COMMA411_tree);
            }

            pushFollow(FOLLOW_expression_in_scrnfunc2629);
            expression412=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression412.getTree());

            RPAREN413=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scrnfunc2631); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN413_tree = 
            (CommonTree)adaptor.create(RPAREN413)
            ;
            adaptor.addChild(root_0, RPAREN413_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "scrnfunc"


    public static class sinfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sinfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:256:1: sinfunc : SIN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.sinfunc_return sinfunc() throws RecognitionException {
        jvmBasicParser.sinfunc_return retval = new jvmBasicParser.sinfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SIN414=null;
        Token LPAREN415=null;
        Token RPAREN417=null;
        jvmBasicParser.expression_return expression416 =null;


        CommonTree SIN414_tree=null;
        CommonTree LPAREN415_tree=null;
        CommonTree RPAREN417_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:256:9: ( SIN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:256:11: SIN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SIN414=(Token)match(input,SIN,FOLLOW_SIN_in_sinfunc2638); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SIN414_tree = 
            (CommonTree)adaptor.create(SIN414)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SIN414_tree, root_0);
            }

            LPAREN415=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sinfunc2641); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN415_tree = 
            (CommonTree)adaptor.create(LPAREN415)
            ;
            adaptor.addChild(root_0, LPAREN415_tree);
            }

            pushFollow(FOLLOW_expression_in_sinfunc2643);
            expression416=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression416.getTree());

            RPAREN417=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sinfunc2645); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN417_tree = 
            (CommonTree)adaptor.create(RPAREN417)
            ;
            adaptor.addChild(root_0, RPAREN417_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sinfunc"


    public static class cosfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cosfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:257:1: cosfunc : COS ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.cosfunc_return cosfunc() throws RecognitionException {
        jvmBasicParser.cosfunc_return retval = new jvmBasicParser.cosfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COS418=null;
        Token LPAREN419=null;
        Token RPAREN421=null;
        jvmBasicParser.expression_return expression420 =null;


        CommonTree COS418_tree=null;
        CommonTree LPAREN419_tree=null;
        CommonTree RPAREN421_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:257:9: ( COS ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:257:11: COS ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            COS418=(Token)match(input,COS,FOLLOW_COS_in_cosfunc2652); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COS418_tree = 
            (CommonTree)adaptor.create(COS418)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(COS418_tree, root_0);
            }

            LPAREN419=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cosfunc2655); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN419_tree = 
            (CommonTree)adaptor.create(LPAREN419)
            ;
            adaptor.addChild(root_0, LPAREN419_tree);
            }

            pushFollow(FOLLOW_expression_in_cosfunc2657);
            expression420=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression420.getTree());

            RPAREN421=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cosfunc2659); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN421_tree = 
            (CommonTree)adaptor.create(RPAREN421)
            ;
            adaptor.addChild(root_0, RPAREN421_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cosfunc"


    public static class tanfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tanfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:258:1: tanfunc : TAN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.tanfunc_return tanfunc() throws RecognitionException {
        jvmBasicParser.tanfunc_return retval = new jvmBasicParser.tanfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TAN422=null;
        Token LPAREN423=null;
        Token RPAREN425=null;
        jvmBasicParser.expression_return expression424 =null;


        CommonTree TAN422_tree=null;
        CommonTree LPAREN423_tree=null;
        CommonTree RPAREN425_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:258:9: ( TAN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:258:11: TAN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            TAN422=(Token)match(input,TAN,FOLLOW_TAN_in_tanfunc2666); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TAN422_tree = 
            (CommonTree)adaptor.create(TAN422)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(TAN422_tree, root_0);
            }

            LPAREN423=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tanfunc2669); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN423_tree = 
            (CommonTree)adaptor.create(LPAREN423)
            ;
            adaptor.addChild(root_0, LPAREN423_tree);
            }

            pushFollow(FOLLOW_expression_in_tanfunc2671);
            expression424=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression424.getTree());

            RPAREN425=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tanfunc2673); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN425_tree = 
            (CommonTree)adaptor.create(RPAREN425)
            ;
            adaptor.addChild(root_0, RPAREN425_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tanfunc"


    public static class atnfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atnfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:259:1: atnfunc : ATN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.atnfunc_return atnfunc() throws RecognitionException {
        jvmBasicParser.atnfunc_return retval = new jvmBasicParser.atnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ATN426=null;
        Token LPAREN427=null;
        Token RPAREN429=null;
        jvmBasicParser.expression_return expression428 =null;


        CommonTree ATN426_tree=null;
        CommonTree LPAREN427_tree=null;
        CommonTree RPAREN429_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:259:9: ( ATN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:259:11: ATN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            ATN426=(Token)match(input,ATN,FOLLOW_ATN_in_atnfunc2680); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ATN426_tree = 
            (CommonTree)adaptor.create(ATN426)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ATN426_tree, root_0);
            }

            LPAREN427=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atnfunc2683); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN427_tree = 
            (CommonTree)adaptor.create(LPAREN427)
            ;
            adaptor.addChild(root_0, LPAREN427_tree);
            }

            pushFollow(FOLLOW_expression_in_atnfunc2685);
            expression428=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression428.getTree());

            RPAREN429=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atnfunc2687); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN429_tree = 
            (CommonTree)adaptor.create(RPAREN429)
            ;
            adaptor.addChild(root_0, RPAREN429_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atnfunc"


    public static class rndfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rndfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:260:1: rndfunc : RND ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.rndfunc_return rndfunc() throws RecognitionException {
        jvmBasicParser.rndfunc_return retval = new jvmBasicParser.rndfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RND430=null;
        Token LPAREN431=null;
        Token RPAREN433=null;
        jvmBasicParser.expression_return expression432 =null;


        CommonTree RND430_tree=null;
        CommonTree LPAREN431_tree=null;
        CommonTree RPAREN433_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:260:9: ( RND ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:260:11: RND ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            RND430=(Token)match(input,RND,FOLLOW_RND_in_rndfunc2694); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RND430_tree = 
            (CommonTree)adaptor.create(RND430)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(RND430_tree, root_0);
            }

            LPAREN431=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rndfunc2697); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN431_tree = 
            (CommonTree)adaptor.create(LPAREN431)
            ;
            adaptor.addChild(root_0, LPAREN431_tree);
            }

            pushFollow(FOLLOW_expression_in_rndfunc2699);
            expression432=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression432.getTree());

            RPAREN433=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rndfunc2701); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN433_tree = 
            (CommonTree)adaptor.create(RPAREN433)
            ;
            adaptor.addChild(root_0, RPAREN433_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rndfunc"


    public static class sgnfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sgnfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:261:1: sgnfunc : SGN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.sgnfunc_return sgnfunc() throws RecognitionException {
        jvmBasicParser.sgnfunc_return retval = new jvmBasicParser.sgnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SGN434=null;
        Token LPAREN435=null;
        Token RPAREN437=null;
        jvmBasicParser.expression_return expression436 =null;


        CommonTree SGN434_tree=null;
        CommonTree LPAREN435_tree=null;
        CommonTree RPAREN437_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:261:9: ( SGN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:261:11: SGN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SGN434=(Token)match(input,SGN,FOLLOW_SGN_in_sgnfunc2708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SGN434_tree = 
            (CommonTree)adaptor.create(SGN434)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SGN434_tree, root_0);
            }

            LPAREN435=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sgnfunc2711); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN435_tree = 
            (CommonTree)adaptor.create(LPAREN435)
            ;
            adaptor.addChild(root_0, LPAREN435_tree);
            }

            pushFollow(FOLLOW_expression_in_sgnfunc2713);
            expression436=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression436.getTree());

            RPAREN437=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sgnfunc2715); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN437_tree = 
            (CommonTree)adaptor.create(RPAREN437)
            ;
            adaptor.addChild(root_0, RPAREN437_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sgnfunc"


    public static class expfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:262:1: expfunc : EXP ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.expfunc_return expfunc() throws RecognitionException {
        jvmBasicParser.expfunc_return retval = new jvmBasicParser.expfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EXP438=null;
        Token LPAREN439=null;
        Token RPAREN441=null;
        jvmBasicParser.expression_return expression440 =null;


        CommonTree EXP438_tree=null;
        CommonTree LPAREN439_tree=null;
        CommonTree RPAREN441_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:262:9: ( EXP ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:262:11: EXP ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            EXP438=(Token)match(input,EXP,FOLLOW_EXP_in_expfunc2722); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXP438_tree = 
            (CommonTree)adaptor.create(EXP438)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(EXP438_tree, root_0);
            }

            LPAREN439=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expfunc2725); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN439_tree = 
            (CommonTree)adaptor.create(LPAREN439)
            ;
            adaptor.addChild(root_0, LPAREN439_tree);
            }

            pushFollow(FOLLOW_expression_in_expfunc2727);
            expression440=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression440.getTree());

            RPAREN441=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expfunc2729); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN441_tree = 
            (CommonTree)adaptor.create(RPAREN441)
            ;
            adaptor.addChild(root_0, RPAREN441_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expfunc"


    public static class logfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:263:1: logfunc : LOG ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.logfunc_return logfunc() throws RecognitionException {
        jvmBasicParser.logfunc_return retval = new jvmBasicParser.logfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOG442=null;
        Token LPAREN443=null;
        Token RPAREN445=null;
        jvmBasicParser.expression_return expression444 =null;


        CommonTree LOG442_tree=null;
        CommonTree LPAREN443_tree=null;
        CommonTree RPAREN445_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:263:9: ( LOG ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:263:11: LOG ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            LOG442=(Token)match(input,LOG,FOLLOW_LOG_in_logfunc2736); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOG442_tree = 
            (CommonTree)adaptor.create(LOG442)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LOG442_tree, root_0);
            }

            LPAREN443=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_logfunc2739); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN443_tree = 
            (CommonTree)adaptor.create(LPAREN443)
            ;
            adaptor.addChild(root_0, LPAREN443_tree);
            }

            pushFollow(FOLLOW_expression_in_logfunc2741);
            expression444=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression444.getTree());

            RPAREN445=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_logfunc2743); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN445_tree = 
            (CommonTree)adaptor.create(RPAREN445)
            ;
            adaptor.addChild(root_0, RPAREN445_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logfunc"


    public static class absfunc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "absfunc"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:264:1: absfunc : ABS ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.absfunc_return absfunc() throws RecognitionException {
        jvmBasicParser.absfunc_return retval = new jvmBasicParser.absfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ABS446=null;
        Token LPAREN447=null;
        Token RPAREN449=null;
        jvmBasicParser.expression_return expression448 =null;


        CommonTree ABS446_tree=null;
        CommonTree LPAREN447_tree=null;
        CommonTree RPAREN449_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:264:9: ( ABS ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:264:11: ABS ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            ABS446=(Token)match(input,ABS,FOLLOW_ABS_in_absfunc2750); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ABS446_tree = 
            (CommonTree)adaptor.create(ABS446)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ABS446_tree, root_0);
            }

            LPAREN447=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_absfunc2753); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN447_tree = 
            (CommonTree)adaptor.create(LPAREN447)
            ;
            adaptor.addChild(root_0, LPAREN447_tree);
            }

            pushFollow(FOLLOW_expression_in_absfunc2755);
            expression448=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression448.getTree());

            RPAREN449=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_absfunc2757); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN449_tree = 
            (CommonTree)adaptor.create(RPAREN449)
            ;
            adaptor.addChild(root_0, RPAREN449_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "absfunc"

    // $ANTLR start synpred5_jvmBasic
    public final void synpred5_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:11: ( amperoper )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:11: amperoper
        {
        pushFollow(FOLLOW_amperoper_in_synpred5_jvmBasic1046);
        amperoper();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_jvmBasic

    // $ANTLR start synpred46_jvmBasic
    public final void synpred46_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:373: ( ongotostmt )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:373: ongotostmt
        {
        pushFollow(FOLLOW_ongotostmt_in_synpred46_jvmBasic1194);
        ongotostmt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred46_jvmBasic

    // $ANTLR start synpred47_jvmBasic
    public final void synpred47_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:385: ( ongosubstmt )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:385: ongosubstmt
        {
        pushFollow(FOLLOW_ongosubstmt_in_synpred47_jvmBasic1197);
        ongosubstmt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_jvmBasic

    // $ANTLR start synpred69_jvmBasic
    public final void synpred69_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:17: ( LPAREN exprlist RPAREN )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:17: LPAREN exprlist RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred69_jvmBasic1284); if (state.failed) return ;

        pushFollow(FOLLOW_exprlist_in_synpred69_jvmBasic1286);
        exprlist();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred69_jvmBasic1288); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred69_jvmBasic

    // $ANTLR start synpred74_jvmBasic
    public final void synpred74_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:47: ( printlist )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:47: printlist
        {
        pushFollow(FOLLOW_printlist_in_synpred74_jvmBasic1326);
        printlist();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred74_jvmBasic

    // $ANTLR start synpred76_jvmBasic
    public final void synpred76_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:8: ( lte )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:8: lte
        {
        pushFollow(FOLLOW_lte_in_synpred76_jvmBasic1370);
        lte();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred76_jvmBasic

    // $ANTLR start synpred77_jvmBasic
    public final void synpred77_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:14: ( gte )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:14: gte
        {
        pushFollow(FOLLOW_gte_in_synpred77_jvmBasic1374);
        gte();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred77_jvmBasic

    // $ANTLR start synpred79_jvmBasic
    public final void synpred79_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:26: ( EQ )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:26: EQ
        {
        match(input,EQ,FOLLOW_EQ_in_synpred79_jvmBasic1382); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_jvmBasic

    // $ANTLR start synpred80_jvmBasic
    public final void synpred80_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:31: ( GT )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:31: GT
        {
        match(input,GT,FOLLOW_GT_in_synpred80_jvmBasic1386); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_jvmBasic

    // $ANTLR start synpred90_jvmBasic
    public final void synpred90_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:42: ( (~ ( CR ) ) )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
        {
        if ( (input.LA(1) >= ABS && input.LA(1) <= COS)||(input.LA(1) >= DATA && input.LA(1) <= 126) ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred90_jvmBasic

    // $ANTLR start synpred142_jvmBasic
    public final void synpred142_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:43: ( ( PLUS | MINUS ) multiplyingExpression )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:43: ( PLUS | MINUS ) multiplyingExpression
        {
        if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_multiplyingExpression_in_synpred142_jvmBasic2238);
        multiplyingExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred142_jvmBasic

    // Delegated rules

    public final boolean synpred76_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred142_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred142_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\102\uffff";
    static final String DFA5_eofS =
        "\102\uffff";
    static final String DFA5_minS =
        "\1\5\50\uffff\1\0\30\uffff";
    static final String DFA5_maxS =
        "\1\174\50\uffff\1\0\30\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
        "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
        "\1\77\1\100";
    static final String DFA5_specialS =
        "\51\uffff\1\0\30\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\24\4\uffff\1\65\1\uffff\1\14\1\uffff\1\37\3\uffff\1\74\1"+
            "\77\1\uffff\1\62\1\uffff\1\76\1\16\3\uffff\1\6\2\uffff\1\57"+
            "\1\uffff\1\30\1\64\1\63\1\10\2\uffff\1\43\1\22\1\23\1\44\1\35"+
            "\1\21\1\67\1\72\1\54\1\101\1\32\1\60\1\uffff\1\7\2\uffff\2\100"+
            "\1\26\1\1\1\uffff\1\45\6\uffff\1\56\1\11\1\uffff\1\5\1\uffff"+
            "\1\51\1\34\3\uffff\1\50\1\uffff\1\47\1\25\1\uffff\1\46\1\33"+
            "\1\46\1\66\1\31\1\55\1\3\1\13\2\uffff\1\42\1\uffff\1\15\1\2"+
            "\1\41\3\uffff\1\12\2\uffff\1\40\2\uffff\1\17\1\27\2\uffff\1"+
            "\61\1\uffff\1\20\3\uffff\1\4\2\uffff\1\36\1\70\1\71\1\73\1\uffff"+
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "163:1: statement : ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt | hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt | includestmt );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_41 = input.LA(1);

                         
                        int index5_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred46_jvmBasic()) ) {s = 42;}

                        else if ( (synpred47_jvmBasic()) ) {s = 43;}

                         
                        input.seek(index5_41);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_line_in_prog995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_line1007 = new BitSet(new long[]{0x1797FF9E91AC5420L,0x17914C91D3FDA358L});
    public static final BitSet FOLLOW_amprstmt_in_line1011 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_COLON_in_line1014 = new BitSet(new long[]{0x1797FF9E91AE7420L,0x17914C91D3FDA358L});
    public static final BitSet FOLLOW_amprstmt_in_line1016 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_set_in_line1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_amperoper1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_linenumber1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amperoper_in_amprstmt1046 = new BitSet(new long[]{0x1797FF9E91AC5420L,0x17914C91D3FDA358L});
    public static final BitSet FOLLOW_statement_in_amprstmt1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOAD_in_statement1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_in_statement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTORE_in_statement1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACE_in_statement1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTRACE_in_statement1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLASH_in_statement1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERSE_in_statement1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GR_in_statement1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMAL_in_statement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHLOAD_in_statement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLEAR_in_statement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RUN_in_statement1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_statement1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_in_statement1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_statement1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOME_in_statement1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HGR_in_statement1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HGR2_in_statement1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amptstmt_in_statement1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_popstmt_in_statement1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_liststmt_in_statement1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storestmt_in_statement1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getstmt_in_statement1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recallstmt_in_statement1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instmt_in_statement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prstmt_in_statement1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_onerrstmt_in_statement1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hlinstmt_in_statement1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vlinstmt_in_statement1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colorstmt_in_statement1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedstmt_in_statement1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalestmt_in_statement1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotstmt_in_statement1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hcolorstmt_in_statement1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_himemstmt_in_statement1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lomemstmt_in_statement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstmt1_in_statement1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pokestmt_in_statement1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plotstmt_in_statement1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongotostmt_in_statement1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongosubstmt_in_statement1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_statement1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextstmt_in_statement1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputstmt_in_statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tabstmt_in_statement1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dimstmt_in_statement1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gotostmt_in_statement1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gosubstmt_in_statement1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callstmt_in_statement1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_readstmt_in_statement1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hplotstmt_in_statement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vplotstmt_in_statement1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vtabstmnt_in_statement1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_htabstmnt_in_statement1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waitstmt_in_statement1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datastmt_in_statement1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xdrawstmt_in_statement1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drawstmt_in_statement1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defstmt_in_statement1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letstmt_in_statement1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_includestmt_in_statement1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_vardecl1280 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_vardecl1284 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_exprlist_in_vardecl1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_vardecl1288 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_set_in_printstmt11296 = new BitSet(new long[]{0x2968000164010A92L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_printlist_in_printstmt11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_printlist1313 = new BitSet(new long[]{0x2968000164018A92L,0x0060B16E0C0258A3L});
    public static final BitSet FOLLOW_COMMA_in_printlist1316 = new BitSet(new long[]{0x2968000164010A92L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_SEMICOLON_in_printlist1321 = new BitSet(new long[]{0x2968000164010A92L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_printlist_in_printlist1326 = new BitSet(new long[]{0x2968000164010A92L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_GET_in_getstmt1336 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_exprlist_in_getstmt1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letstmt1345 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_variableassignment_in_letstmt1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardecl_in_variableassignment1356 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_variableassignment1358 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_exprlist_in_variableassignment1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lte_in_relop1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gte_in_relop1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_in_relop1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_relop1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relop1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_relop1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_gte1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_gte1403 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_gte1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_gte1411 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_GT_in_gte1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_lte1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_lte1426 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_lte1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_lte1434 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LT_in_lte1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEQ_in_neq1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmt1451 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_ifstmt1454 = new BitSet(new long[]{0x1797FF9E91AC5420L,0x17934C91D3FDA358L});
    public static final BitSet FOLLOW_THEN_in_ifstmt1456 = new BitSet(new long[]{0x1797FF9E91AC5420L,0x17914C91D3FDA358L});
    public static final BitSet FOLLOW_statement_in_ifstmt1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstmt1466 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_vardecl_in_forstmt1470 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_forstmt1472 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_forstmt1474 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TO_in_forstmt1476 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_forstmt1478 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_STEP_in_forstmt1481 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_forstmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_nextstmt1493 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_varlist_in_nextstmt1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_in_inputstmt1504 = new BitSet(new long[]{0x0100000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_stringliteral_in_inputstmt1508 = new BitSet(new long[]{0x0000000000008000L,0x0000000400000000L});
    public static final BitSet FOLLOW_set_in_inputstmt1510 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_varlist_in_inputstmt1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_readstmt1526 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_varlist_in_readstmt1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIM_in_dimstmt1539 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_varlist_in_dimstmt1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_gotostmt1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_gotostmt1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOSUB_in_gosubstmt1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_gosubstmt1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POKE_in_pokestmt1566 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_pokestmt1568 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_pokestmt1570 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_pokestmt1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_comment1578 = new BitSet(new long[]{0xFFFFFFFFFFFDFFF2L,0x7FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_set_in_comment1591 = new BitSet(new long[]{0xFFFFFFFFFFFDFFF2L,0x7FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_CALL_in_callstmt1604 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_exprlist_in_callstmt1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HPLOT_in_hplotstmt1613 = new BitSet(new long[]{0x2968000164010A92L,0x0068B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1617 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_hplotstmt1619 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1621 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_TO_in_hplotstmt1626 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_hplotstmt1630 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1632 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_VPLOT_in_vplotstmt1640 = new BitSet(new long[]{0x2968000164010A92L,0x0068B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1644 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_vplotstmt1646 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1648 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_TO_in_vplotstmt1653 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1655 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_vplotstmt1657 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1659 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_PLOT_in_plotstmt1667 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_plotstmt1669 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_plotstmt1671 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_plotstmt1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_ongotostmt1680 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_ongotostmt1682 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_GOTO_in_ongotostmt1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_ongotostmt1686 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_ongotostmt1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_ongotostmt1691 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ON_in_ongosubstmt1700 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_ongosubstmt1702 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_GOSUB_in_ongosubstmt1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_ongosubstmt1706 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_ongosubstmt1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_ongosubstmt1711 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_VTAB_in_vtabstmnt1720 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vtabstmnt1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HTAB_in_htabstmnt1730 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_htabstmnt1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIMEM_in_himemstmt1739 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_himemstmt1742 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_himemstmt1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOMEM_in_lomemstmt1750 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_lomemstmt1753 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_lomemstmt1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_datastmt1761 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_datastmt1764 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_datastmt1767 = new BitSet(new long[]{0x2968000164018A92L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_datastmt1769 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WAIT_in_waitstmt1778 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_waitstmt1781 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_waitstmt1783 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_waitstmt1785 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_waitstmt1788 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_waitstmt1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XDRAW_in_xdrawstmt1798 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_xdrawstmt1801 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AT_in_xdrawstmt1804 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_xdrawstmt1806 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_xdrawstmt1808 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_xdrawstmt1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_in_drawstmt1818 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_drawstmt1821 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AT_in_drawstmt1824 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_drawstmt1826 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_drawstmt1828 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_drawstmt1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_defstmt1838 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FN_in_defstmt1840 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_var_in_defstmt1842 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_defstmt1844 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_var_in_defstmt1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_defstmt1848 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_defstmt1850 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_defstmt1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_tabstmt1858 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_tabstmt1861 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_tabstmt1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_tabstmt1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speedstmt1871 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_speedstmt1874 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_speedstmt1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROT_in_rotstmt1882 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_rotstmt1885 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_rotstmt1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_scalestmt1893 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_scalestmt1896 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_scalestmt1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_colorstmt1904 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_colorstmt1907 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_colorstmt1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HCOLOR_in_hcolorstmt1915 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_hcolorstmt1918 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hcolorstmt1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HLIN_in_hlinstmt1926 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hlinstmt1929 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_hlinstmt1931 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hlinstmt1933 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AT_in_hlinstmt1935 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_hlinstmt1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VLIN_in_vlinstmt1943 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vlinstmt1946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_vlinstmt1948 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vlinstmt1950 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AT_in_vlinstmt1952 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_vlinstmt1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONERR_in_onerrstmt1960 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_GOTO_in_onerrstmt1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_linenumber_in_onerrstmt1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRNUMBER_in_prstmt1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_prstmt1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INNUMBER_in_instmt1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_NUMBER_in_instmt1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STORE_in_storestmt1988 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_vardecl_in_storestmt1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECALL_in_recallstmt1996 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_vardecl_in_recallstmt1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_liststmt2004 = new BitSet(new long[]{0x2968000164010A92L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_liststmt2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POP_in_popstmt2015 = new BitSet(new long[]{0x2968000164010A92L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_popstmt2019 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_popstmt2021 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_popstmt2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_amptstmt2031 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_amptstmt2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_in_includestmt2041 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_includestmt2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardecl_in_func2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringliteral_in_func2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_func2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_func2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chrfunc_in_func2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqrfunc_in_func2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lenfunc_in_func2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strfunc_in_func2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ascfunc_in_func2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scrnfunc_in_func2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_midfunc_in_func2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pdlfunc_in_func2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_peekfunc_in_func2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intfunc_in_func2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spcfunc_in_func2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frefunc_in_func2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_posfunc_in_func2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usrfunc_in_func2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftfunc_in_func2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valfunc_in_func2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rightfunc_in_func2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fnfunc_in_func2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sinfunc_in_func2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cosfunc_in_func2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tanfunc_in_func2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atnfunc_in_func2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rndfunc_in_func2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sgnfunc_in_func2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expfunc_in_func2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logfunc_in_func2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absfunc_in_func2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_func2163 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_func2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_func2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_signExpression2175 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C025883L});
    public static final BitSet FOLLOW_func_in_signExpression2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signExpression_in_exponentExpression2194 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_EXPONENT_in_exponentExpression2197 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_signExpression_in_exponentExpression2199 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_exponentExpression_in_multiplyingExpression2209 = new BitSet(new long[]{0x0000000000400002L,0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_multiplyingExpression2212 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_exponentExpression_in_multiplyingExpression2219 = new BitSet(new long[]{0x0000000000400002L,0x0004000000000000L});
    public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression2228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004002L});
    public static final BitSet FOLLOW_set_in_addingExpression2231 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression2238 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004002L});
    public static final BitSet FOLLOW_addingExpression_in_relationalExpression2248 = new BitSet(new long[]{0xC000006002000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_relop_in_relationalExpression2252 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_addingExpression_in_relationalExpression2256 = new BitSet(new long[]{0xC000006002000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_relationalExpression_in_expression2264 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_expression2267 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_relationalExpression_in_expression2273 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000400L});
    public static final BitSet FOLLOW_varname_in_var2284 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L});
    public static final BitSet FOLLOW_varsuffix_in_var2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTERS_in_varname2295 = new BitSet(new long[]{0x0100000000100002L});
    public static final BitSet FOLLOW_vardecl_in_varlist2323 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_varlist2326 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_vardecl_in_varlist2329 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_expression_in_exprlist2339 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_exprlist2342 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_exprlist2345 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stringliteral2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQR_in_sqrfunc2368 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sqrfunc2371 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_sqrfunc2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_sqrfunc2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHR_in_chrfunc2382 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_chrfunc2385 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_chrfunc2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_chrfunc2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEN_in_lenfunc2396 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_lenfunc2399 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_lenfunc2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_lenfunc2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_ascfunc2410 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_ascfunc2413 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_ascfunc2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_ascfunc2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MID_in_midfunc2425 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_midfunc2428 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_midfunc2430 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_midfunc2432 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_midfunc2434 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_midfunc2436 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_midfunc2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_midfunc2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PDL_in_pdlfunc2447 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_pdlfunc2450 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_pdlfunc2452 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_pdlfunc2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PEEK_in_peekfunc2460 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_peekfunc2463 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_peekfunc2465 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_peekfunc2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTF_in_intfunc2474 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_intfunc2477 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_intfunc2479 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_intfunc2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPC_in_spcfunc2488 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_spcfunc2491 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_spcfunc2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_spcfunc2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRE_in_frefunc2502 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_frefunc2505 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_frefunc2507 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_frefunc2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_posfunc2516 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_posfunc2519 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_posfunc2521 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_posfunc2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USR_in_usrfunc2530 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_usrfunc2533 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_usrfunc2535 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_usrfunc2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_leftfunc2543 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_leftfunc2546 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_leftfunc2548 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_leftfunc2550 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_leftfunc2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_leftfunc2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_rightfunc2560 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rightfunc2563 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_rightfunc2565 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_rightfunc2567 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_rightfunc2569 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_rightfunc2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strfunc2578 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_strfunc2581 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_strfunc2583 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_strfunc2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FN_in_fnfunc2592 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_var_in_fnfunc2595 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_fnfunc2597 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_fnfunc2599 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_fnfunc2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAL_in_valfunc2607 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_valfunc2610 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_valfunc2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_valfunc2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCRN_in_scrnfunc2620 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_scrnfunc2623 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_scrnfunc2625 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_scrnfunc2627 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_scrnfunc2629 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_scrnfunc2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIN_in_sinfunc2638 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sinfunc2641 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_sinfunc2643 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_sinfunc2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COS_in_cosfunc2652 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cosfunc2655 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_cosfunc2657 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_cosfunc2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAN_in_tanfunc2666 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_tanfunc2669 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_tanfunc2671 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_tanfunc2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATN_in_atnfunc2680 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_atnfunc2683 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_atnfunc2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_atnfunc2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RND_in_rndfunc2694 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rndfunc2697 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_rndfunc2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_rndfunc2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SGN_in_sgnfunc2708 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sgnfunc2711 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_sgnfunc2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_sgnfunc2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXP_in_expfunc2722 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_expfunc2725 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_expfunc2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_expfunc2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_logfunc2736 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_logfunc2739 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_logfunc2741 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_logfunc2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_absfunc2750 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_absfunc2753 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_expression_in_absfunc2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_absfunc2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amperoper_in_synpred5_jvmBasic1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongotostmt_in_synpred46_jvmBasic1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongosubstmt_in_synpred47_jvmBasic1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred69_jvmBasic1284 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_exprlist_in_synpred69_jvmBasic1286 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred69_jvmBasic1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printlist_in_synpred74_jvmBasic1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lte_in_synpred76_jvmBasic1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gte_in_synpred77_jvmBasic1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_synpred79_jvmBasic1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred80_jvmBasic1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred142_jvmBasic2231 = new BitSet(new long[]{0x2968000164010A90L,0x0060B16A0C0258A3L});
    public static final BitSet FOLLOW_multiplyingExpression_in_synpred142_jvmBasic2238 = new BitSet(new long[]{0x0000000000000002L});

}