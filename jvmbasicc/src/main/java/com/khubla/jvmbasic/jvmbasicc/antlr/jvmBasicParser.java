// $ANTLR 3.4 com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g 2012-12-30 17:38:40

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AMPERSAND", "AND", "ASC", "AT", "ATN", "CALL", "CHR", "CLEAR", "COLON", "COLOR", "COMMA", "COS", "CR", "DATA", "DEF", "DIGIT", "DIM", "DIV", "DRAW", "END", "EQ", "EXP", "EXPONENT", "FLASH", "FLOAT", "FN", "FOR", "FRE", "GET", "GOSUB", "GOTO", "GR", "GT", "GTE", "HCOLOR", "HGR", "HGR2", "HIMEM", "HLIN", "HOME", "HPLOT", "HTAB", "IF", "INNUMBER", "INPUT", "INTF", "INVERSE", "LEFT", "LEN", "LET", "LETTERS", "LIST", "LOAD", "LOG", "LOMEM", "LPAREN", "LT", "LTE", "MID", "MINUS", "NEQ", "NEXT", "NORMAL", "NOT", "NOTRACE", "NUMBER", "ON", "ONERR", "OR", "PDL", "PEEK", "PLOT", "PLUS", "POKE", "POP", "POS", "PRINT", "PRNUMBER", "QUESTION", "READ", "RECALL", "REM", "RESTORE", "RETURN", "RIGHT", "RND", "ROT", "RPAREN", "RUN", "SAVE", "SCALE", "SCRN", "SEMICOLON", "SGN", "SHLOAD", "SIN", "SPC", "SPEED", "SQR", "STEP", "STOP", "STORE", "STR", "STRINGLITERAL", "TAB", "TAN", "TEXT", "THEN", "TIMES", "TO", "TRACE", "USR", "VAL", "VLIN", "VPLOT", "VTAB", "WAIT", "WS", "XDRAW", "'$'", "'%'"
    };

    public static final int EOF=-1;
    public static final int T__124=124;
    public static final int T__125=125;
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
    public static final int INNUMBER=48;
    public static final int INPUT=49;
    public static final int INTF=50;
    public static final int INVERSE=51;
    public static final int LEFT=52;
    public static final int LEN=53;
    public static final int LET=54;
    public static final int LETTERS=55;
    public static final int LIST=56;
    public static final int LOAD=57;
    public static final int LOG=58;
    public static final int LOMEM=59;
    public static final int LPAREN=60;
    public static final int LT=61;
    public static final int LTE=62;
    public static final int MID=63;
    public static final int MINUS=64;
    public static final int NEQ=65;
    public static final int NEXT=66;
    public static final int NORMAL=67;
    public static final int NOT=68;
    public static final int NOTRACE=69;
    public static final int NUMBER=70;
    public static final int ON=71;
    public static final int ONERR=72;
    public static final int OR=73;
    public static final int PDL=74;
    public static final int PEEK=75;
    public static final int PLOT=76;
    public static final int PLUS=77;
    public static final int POKE=78;
    public static final int POP=79;
    public static final int POS=80;
    public static final int PRINT=81;
    public static final int PRNUMBER=82;
    public static final int QUESTION=83;
    public static final int READ=84;
    public static final int RECALL=85;
    public static final int REM=86;
    public static final int RESTORE=87;
    public static final int RETURN=88;
    public static final int RIGHT=89;
    public static final int RND=90;
    public static final int ROT=91;
    public static final int RPAREN=92;
    public static final int RUN=93;
    public static final int SAVE=94;
    public static final int SCALE=95;
    public static final int SCRN=96;
    public static final int SEMICOLON=97;
    public static final int SGN=98;
    public static final int SHLOAD=99;
    public static final int SIN=100;
    public static final int SPC=101;
    public static final int SPEED=102;
    public static final int SQR=103;
    public static final int STEP=104;
    public static final int STOP=105;
    public static final int STORE=106;
    public static final int STR=107;
    public static final int STRINGLITERAL=108;
    public static final int TAB=109;
    public static final int TAN=110;
    public static final int TEXT=111;
    public static final int THEN=112;
    public static final int TIMES=113;
    public static final int TO=114;
    public static final int TRACE=115;
    public static final int USR=116;
    public static final int VAL=117;
    public static final int VLIN=118;
    public static final int VPLOT=119;
    public static final int VTAB=120;
    public static final int WAIT=121;
    public static final int WS=122;
    public static final int XDRAW=123;

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:1: prog : ( line )+ ;
    public final jvmBasicParser.prog_return prog() throws RecognitionException {
        jvmBasicParser.prog_return retval = new jvmBasicParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.line_return line1 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:6: ( ( line )+ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:8: ( line )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:8: ( line )+
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:155:8: line
            	    {
            	    pushFollow(FOLLOW_line_in_prog987);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:1: line : linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !;
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
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:6: ( linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !)
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:8: linenumber ^ amprstmt ( COLON ( amprstmt )? )* ( CR | EOF ) !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_linenumber_in_line999);
            linenumber2=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(linenumber2.getTree(), root_0);

            pushFollow(FOLLOW_amprstmt_in_line1003);
            amprstmt3=amprstmt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, amprstmt3.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:30: ( COLON ( amprstmt )? )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:31: COLON ( amprstmt )?
            	    {
            	    COLON4=(Token)match(input,COLON,FOLLOW_COLON_in_line1006); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COLON4_tree = 
            	    (CommonTree)adaptor.create(COLON4)
            	    ;
            	    adaptor.addChild(root_0, COLON4_tree);
            	    }

            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:37: ( amprstmt )?
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
            	            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:158:37: amprstmt
            	            {
            	            pushFollow(FOLLOW_amprstmt_in_line1008);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:1: amperoper : AMPERSAND ;
    public final jvmBasicParser.amperoper_return amperoper() throws RecognitionException {
        jvmBasicParser.amperoper_return retval = new jvmBasicParser.amperoper_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AMPERSAND7=null;

        CommonTree AMPERSAND7_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:10: ( AMPERSAND )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:159:12: AMPERSAND
            {
            root_0 = (CommonTree)adaptor.nil();


            AMPERSAND7=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_amperoper1026); if (state.failed) return retval;
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:1: linenumber : NUMBER ;
    public final jvmBasicParser.linenumber_return linenumber() throws RecognitionException {
        jvmBasicParser.linenumber_return retval = new jvmBasicParser.linenumber_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NUMBER8=null;

        CommonTree NUMBER8_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:11: ( NUMBER )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:160:13: NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();


            NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_linenumber1032); if (state.failed) return retval;
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:1: amprstmt : ( amperoper )? statement ^;
    public final jvmBasicParser.amprstmt_return amprstmt() throws RecognitionException {
        jvmBasicParser.amprstmt_return retval = new jvmBasicParser.amprstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.amperoper_return amperoper9 =null;

        jvmBasicParser.statement_return statement10 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:9: ( ( amperoper )? statement ^)
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:11: ( amperoper )? statement ^
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:11: ( amperoper )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:11: amperoper
                    {
                    pushFollow(FOLLOW_amperoper_in_amprstmt1038);
                    amperoper9=amperoper();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, amperoper9.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_statement_in_amprstmt1041);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:1: statement : ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt | hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt );
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
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:11: ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt | hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt )
            int alt5=63;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:13: LOAD
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LOAD11=(Token)match(input,LOAD,FOLLOW_LOAD_in_statement1049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOAD11_tree = 
                    (CommonTree)adaptor.create(LOAD11)
                    ;
                    adaptor.addChild(root_0, LOAD11_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:20: SAVE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SAVE12=(Token)match(input,SAVE,FOLLOW_SAVE_in_statement1053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SAVE12_tree = 
                    (CommonTree)adaptor.create(SAVE12)
                    ;
                    adaptor.addChild(root_0, SAVE12_tree);
                    }

                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:27: RESTORE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    RESTORE13=(Token)match(input,RESTORE,FOLLOW_RESTORE_in_statement1057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RESTORE13_tree = 
                    (CommonTree)adaptor.create(RESTORE13)
                    ;
                    adaptor.addChild(root_0, RESTORE13_tree);
                    }

                    }
                    break;
                case 4 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:37: TRACE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TRACE14=(Token)match(input,TRACE,FOLLOW_TRACE_in_statement1061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRACE14_tree = 
                    (CommonTree)adaptor.create(TRACE14)
                    ;
                    adaptor.addChild(root_0, TRACE14_tree);
                    }

                    }
                    break;
                case 5 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:44: NOTRACE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NOTRACE15=(Token)match(input,NOTRACE,FOLLOW_NOTRACE_in_statement1064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOTRACE15_tree = 
                    (CommonTree)adaptor.create(NOTRACE15)
                    ;
                    adaptor.addChild(root_0, NOTRACE15_tree);
                    }

                    }
                    break;
                case 6 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:54: FLASH
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLASH16=(Token)match(input,FLASH,FOLLOW_FLASH_in_statement1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLASH16_tree = 
                    (CommonTree)adaptor.create(FLASH16)
                    ;
                    adaptor.addChild(root_0, FLASH16_tree);
                    }

                    }
                    break;
                case 7 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:62: INVERSE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INVERSE17=(Token)match(input,INVERSE,FOLLOW_INVERSE_in_statement1072); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INVERSE17_tree = 
                    (CommonTree)adaptor.create(INVERSE17)
                    ;
                    adaptor.addChild(root_0, INVERSE17_tree);
                    }

                    }
                    break;
                case 8 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:71: GR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GR18=(Token)match(input,GR,FOLLOW_GR_in_statement1075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GR18_tree = 
                    (CommonTree)adaptor.create(GR18)
                    ;
                    adaptor.addChild(root_0, GR18_tree);
                    }

                    }
                    break;
                case 9 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:75: NORMAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NORMAL19=(Token)match(input,NORMAL,FOLLOW_NORMAL_in_statement1078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NORMAL19_tree = 
                    (CommonTree)adaptor.create(NORMAL19)
                    ;
                    adaptor.addChild(root_0, NORMAL19_tree);
                    }

                    }
                    break;
                case 10 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:84: SHLOAD
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SHLOAD20=(Token)match(input,SHLOAD,FOLLOW_SHLOAD_in_statement1082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHLOAD20_tree = 
                    (CommonTree)adaptor.create(SHLOAD20)
                    ;
                    adaptor.addChild(root_0, SHLOAD20_tree);
                    }

                    }
                    break;
                case 11 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:93: RETURN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    RETURN21=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN21_tree = 
                    (CommonTree)adaptor.create(RETURN21)
                    ;
                    adaptor.addChild(root_0, RETURN21_tree);
                    }

                    }
                    break;
                case 12 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:102: CLEAR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CLEAR22=(Token)match(input,CLEAR,FOLLOW_CLEAR_in_statement1090); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLEAR22_tree = 
                    (CommonTree)adaptor.create(CLEAR22)
                    ;
                    adaptor.addChild(root_0, CLEAR22_tree);
                    }

                    }
                    break;
                case 13 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:110: RUN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    RUN23=(Token)match(input,RUN,FOLLOW_RUN_in_statement1094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RUN23_tree = 
                    (CommonTree)adaptor.create(RUN23)
                    ;
                    adaptor.addChild(root_0, RUN23_tree);
                    }

                    }
                    break;
                case 14 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:116: END ^
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    END24=(Token)match(input,END,FOLLOW_END_in_statement1098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END24_tree = 
                    (CommonTree)adaptor.create(END24)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(END24_tree, root_0);
                    }

                    }
                    break;
                case 15 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:123: STOP
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    STOP25=(Token)match(input,STOP,FOLLOW_STOP_in_statement1103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STOP25_tree = 
                    (CommonTree)adaptor.create(STOP25)
                    ;
                    adaptor.addChild(root_0, STOP25_tree);
                    }

                    }
                    break;
                case 16 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:130: TEXT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    TEXT26=(Token)match(input,TEXT,FOLLOW_TEXT_in_statement1107); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TEXT26_tree = 
                    (CommonTree)adaptor.create(TEXT26)
                    ;
                    adaptor.addChild(root_0, TEXT26_tree);
                    }

                    }
                    break;
                case 17 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:137: HOME
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HOME27=(Token)match(input,HOME,FOLLOW_HOME_in_statement1111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HOME27_tree = 
                    (CommonTree)adaptor.create(HOME27)
                    ;
                    adaptor.addChild(root_0, HOME27_tree);
                    }

                    }
                    break;
                case 18 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:144: HGR
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HGR28=(Token)match(input,HGR,FOLLOW_HGR_in_statement1115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HGR28_tree = 
                    (CommonTree)adaptor.create(HGR28)
                    ;
                    adaptor.addChild(root_0, HGR28_tree);
                    }

                    }
                    break;
                case 19 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:150: HGR2
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    HGR229=(Token)match(input,HGR2,FOLLOW_HGR2_in_statement1119); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HGR229_tree = 
                    (CommonTree)adaptor.create(HGR229)
                    ;
                    adaptor.addChild(root_0, HGR229_tree);
                    }

                    }
                    break;
                case 20 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:156: amptstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_amptstmt_in_statement1122);
                    amptstmt30=amptstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, amptstmt30.getTree());

                    }
                    break;
                case 21 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:166: popstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_popstmt_in_statement1125);
                    popstmt31=popstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, popstmt31.getTree());

                    }
                    break;
                case 22 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:176: liststmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_liststmt_in_statement1129);
                    liststmt32=liststmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, liststmt32.getTree());

                    }
                    break;
                case 23 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:186: storestmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_storestmt_in_statement1132);
                    storestmt33=storestmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, storestmt33.getTree());

                    }
                    break;
                case 24 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:197: getstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_getstmt_in_statement1135);
                    getstmt34=getstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, getstmt34.getTree());

                    }
                    break;
                case 25 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:207: recallstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_recallstmt_in_statement1139);
                    recallstmt35=recallstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recallstmt35.getTree());

                    }
                    break;
                case 26 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:219: instmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_instmt_in_statement1142);
                    instmt36=instmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instmt36.getTree());

                    }
                    break;
                case 27 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:227: prstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_prstmt_in_statement1145);
                    prstmt37=prstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prstmt37.getTree());

                    }
                    break;
                case 28 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:235: onerrstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_onerrstmt_in_statement1148);
                    onerrstmt38=onerrstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, onerrstmt38.getTree());

                    }
                    break;
                case 29 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:246: hlinstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_hlinstmt_in_statement1151);
                    hlinstmt39=hlinstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hlinstmt39.getTree());

                    }
                    break;
                case 30 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:255: vlinstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vlinstmt_in_statement1153);
                    vlinstmt40=vlinstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vlinstmt40.getTree());

                    }
                    break;
                case 31 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:264: colorstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_colorstmt_in_statement1155);
                    colorstmt41=colorstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, colorstmt41.getTree());

                    }
                    break;
                case 32 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:275: speedstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_speedstmt_in_statement1158);
                    speedstmt42=speedstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, speedstmt42.getTree());

                    }
                    break;
                case 33 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:286: scalestmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_scalestmt_in_statement1161);
                    scalestmt43=scalestmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalestmt43.getTree());

                    }
                    break;
                case 34 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:296: rotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rotstmt_in_statement1163);
                    rotstmt44=rotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rotstmt44.getTree());

                    }
                    break;
                case 35 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:305: hcolorstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_hcolorstmt_in_statement1166);
                    hcolorstmt45=hcolorstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hcolorstmt45.getTree());

                    }
                    break;
                case 36 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:317: himemstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_himemstmt_in_statement1169);
                    himemstmt46=himemstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, himemstmt46.getTree());

                    }
                    break;
                case 37 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:328: lomemstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lomemstmt_in_statement1172);
                    lomemstmt47=lomemstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lomemstmt47.getTree());

                    }
                    break;
                case 38 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:340: printstmt1
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_printstmt1_in_statement1176);
                    printstmt148=printstmt1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printstmt148.getTree());

                    }
                    break;
                case 39 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:352: pokestmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_pokestmt_in_statement1179);
                    pokestmt49=pokestmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pokestmt49.getTree());

                    }
                    break;
                case 40 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:363: plotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_plotstmt_in_statement1183);
                    plotstmt50=plotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, plotstmt50.getTree());

                    }
                    break;
                case 41 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:373: ongotostmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ongotostmt_in_statement1186);
                    ongotostmt51=ongotostmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ongotostmt51.getTree());

                    }
                    break;
                case 42 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:385: ongosubstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ongosubstmt_in_statement1189);
                    ongosubstmt52=ongosubstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ongosubstmt52.getTree());

                    }
                    break;
                case 43 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:398: ifstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ifstmt_in_statement1192);
                    ifstmt53=ifstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifstmt53.getTree());

                    }
                    break;
                case 44 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:407: comment
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_comment_in_statement1196);
                    comment54=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, comment54.getTree());

                    }
                    break;
                case 45 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:416: nextstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_nextstmt_in_statement1199);
                    nextstmt55=nextstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nextstmt55.getTree());

                    }
                    break;
                case 46 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:426: forstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_forstmt_in_statement1202);
                    forstmt56=forstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forstmt56.getTree());

                    }
                    break;
                case 47 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:436: inputstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_inputstmt_in_statement1206);
                    inputstmt57=inputstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inputstmt57.getTree());

                    }
                    break;
                case 48 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:448: tabstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tabstmt_in_statement1210);
                    tabstmt58=tabstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tabstmt58.getTree());

                    }
                    break;
                case 49 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:458: dimstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dimstmt_in_statement1214);
                    dimstmt59=dimstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dimstmt59.getTree());

                    }
                    break;
                case 50 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:468: gotostmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_gotostmt_in_statement1218);
                    gotostmt60=gotostmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gotostmt60.getTree());

                    }
                    break;
                case 51 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:479: gosubstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_gosubstmt_in_statement1222);
                    gosubstmt61=gosubstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gosubstmt61.getTree());

                    }
                    break;
                case 52 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:491: callstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_callstmt_in_statement1226);
                    callstmt62=callstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callstmt62.getTree());

                    }
                    break;
                case 53 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:501: readstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_readstmt_in_statement1229);
                    readstmt63=readstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, readstmt63.getTree());

                    }
                    break;
                case 54 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:511: hplotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_hplotstmt_in_statement1232);
                    hplotstmt64=hplotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, hplotstmt64.getTree());

                    }
                    break;
                case 55 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:523: vplotstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vplotstmt_in_statement1236);
                    vplotstmt65=vplotstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vplotstmt65.getTree());

                    }
                    break;
                case 56 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:535: vtabstmnt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vtabstmnt_in_statement1240);
                    vtabstmnt66=vtabstmnt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vtabstmnt66.getTree());

                    }
                    break;
                case 57 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:546: htabstmnt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_htabstmnt_in_statement1243);
                    htabstmnt67=htabstmnt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, htabstmnt67.getTree());

                    }
                    break;
                case 58 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:556: waitstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_waitstmt_in_statement1245);
                    waitstmt68=waitstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, waitstmt68.getTree());

                    }
                    break;
                case 59 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:566: datastmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_datastmt_in_statement1248);
                    datastmt69=datastmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datastmt69.getTree());

                    }
                    break;
                case 60 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:576: xdrawstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_xdrawstmt_in_statement1251);
                    xdrawstmt70=xdrawstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, xdrawstmt70.getTree());

                    }
                    break;
                case 61 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:588: drawstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_drawstmt_in_statement1255);
                    drawstmt71=drawstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, drawstmt71.getTree());

                    }
                    break;
                case 62 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:598: defstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_defstmt_in_statement1258);
                    defstmt72=defstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, defstmt72.getTree());

                    }
                    break;
                case 63 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:607: letstmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_letstmt_in_statement1261);
                    letstmt73=letstmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, letstmt73.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:1: vardecl : var ( LPAREN exprlist RPAREN )* ;
    public final jvmBasicParser.vardecl_return vardecl() throws RecognitionException {
        jvmBasicParser.vardecl_return retval = new jvmBasicParser.vardecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN75=null;
        Token RPAREN77=null;
        jvmBasicParser.var_return var74 =null;

        jvmBasicParser.exprlist_return exprlist76 =null;


        CommonTree LPAREN75_tree=null;
        CommonTree RPAREN77_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:9: ( var ( LPAREN exprlist RPAREN )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:11: var ( LPAREN exprlist RPAREN )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_var_in_vardecl1268);
            var74=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var74.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:15: ( LPAREN exprlist RPAREN )*
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    int LA6_1 = input.LA(2);

                    if ( (synpred68_jvmBasic()) ) {
                        alt6=1;
                    }


                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:17: LPAREN exprlist RPAREN
            	    {
            	    LPAREN75=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_vardecl1272); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LPAREN75_tree = 
            	    (CommonTree)adaptor.create(LPAREN75)
            	    ;
            	    adaptor.addChild(root_0, LPAREN75_tree);
            	    }

            	    pushFollow(FOLLOW_exprlist_in_vardecl1274);
            	    exprlist76=exprlist();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist76.getTree());

            	    RPAREN77=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_vardecl1276); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    RPAREN77_tree = 
            	    (CommonTree)adaptor.create(RPAREN77)
            	    ;
            	    adaptor.addChild(root_0, RPAREN77_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:1: printstmt1 : ( PRINT | QUESTION ) ^ ( printlist )? ;
    public final jvmBasicParser.printstmt1_return printstmt1() throws RecognitionException {
        jvmBasicParser.printstmt1_return retval = new jvmBasicParser.printstmt1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set78=null;
        jvmBasicParser.printlist_return printlist79 =null;


        CommonTree set78_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:11: ( ( PRINT | QUESTION ) ^ ( printlist )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:13: ( PRINT | QUESTION ) ^ ( printlist )?
            {
            root_0 = (CommonTree)adaptor.nil();


            set78=(Token)input.LT(1);

            set78=(Token)input.LT(1);

            if ( input.LA(1)==PRINT||input.LA(1)==QUESTION ) {
                input.consume();
                if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(set78)
                , root_0);
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:33: ( printlist )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:164:33: printlist
                    {
                    pushFollow(FOLLOW_printlist_in_printstmt11293);
                    printlist79=printlist();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, printlist79.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:1: printlist : expression ( COMMA ^| SEMICOLON ^)? ( printlist )* ;
    public final jvmBasicParser.printlist_return printlist() throws RecognitionException {
        jvmBasicParser.printlist_return retval = new jvmBasicParser.printlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA81=null;
        Token SEMICOLON82=null;
        jvmBasicParser.expression_return expression80 =null;

        jvmBasicParser.printlist_return printlist83 =null;


        CommonTree COMMA81_tree=null;
        CommonTree SEMICOLON82_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:11: ( expression ( COMMA ^| SEMICOLON ^)? ( printlist )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:13: expression ( COMMA ^| SEMICOLON ^)? ( printlist )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_printlist1301);
            expression80=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression80.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:24: ( COMMA ^| SEMICOLON ^)?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:25: COMMA ^
                    {
                    COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_printlist1304); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA81_tree = 
                    (CommonTree)adaptor.create(COMMA81)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(COMMA81_tree, root_0);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:34: SEMICOLON ^
                    {
                    SEMICOLON82=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_printlist1309); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMICOLON82_tree = 
                    (CommonTree)adaptor.create(SEMICOLON82)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(SEMICOLON82_tree, root_0);
                    }

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:47: ( printlist )*
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

                    if ( (synpred73_jvmBasic()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:47: printlist
            	    {
            	    pushFollow(FOLLOW_printlist_in_printlist1314);
            	    printlist83=printlist();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, printlist83.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:1: getstmt : GET exprlist ;
    public final jvmBasicParser.getstmt_return getstmt() throws RecognitionException {
        jvmBasicParser.getstmt_return retval = new jvmBasicParser.getstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GET84=null;
        jvmBasicParser.exprlist_return exprlist85 =null;


        CommonTree GET84_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:9: ( GET exprlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:166:11: GET exprlist
            {
            root_0 = (CommonTree)adaptor.nil();


            GET84=(Token)match(input,GET,FOLLOW_GET_in_getstmt1324); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GET84_tree = 
            (CommonTree)adaptor.create(GET84)
            ;
            adaptor.addChild(root_0, GET84_tree);
            }

            pushFollow(FOLLOW_exprlist_in_getstmt1326);
            exprlist85=exprlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist85.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:1: letstmt : ( LET ^)? variableassignment ;
    public final jvmBasicParser.letstmt_return letstmt() throws RecognitionException {
        jvmBasicParser.letstmt_return retval = new jvmBasicParser.letstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LET86=null;
        jvmBasicParser.variableassignment_return variableassignment87 =null;


        CommonTree LET86_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:9: ( ( LET ^)? variableassignment )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:11: ( LET ^)? variableassignment
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:14: ( LET ^)?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:167:14: LET ^
                    {
                    LET86=(Token)match(input,LET,FOLLOW_LET_in_letstmt1333); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LET86_tree = 
                    (CommonTree)adaptor.create(LET86)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(LET86_tree, root_0);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_variableassignment_in_letstmt1337);
            variableassignment87=variableassignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variableassignment87.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:1: variableassignment : vardecl EQ ^ exprlist ;
    public final jvmBasicParser.variableassignment_return variableassignment() throws RecognitionException {
        jvmBasicParser.variableassignment_return retval = new jvmBasicParser.variableassignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ89=null;
        jvmBasicParser.vardecl_return vardecl88 =null;

        jvmBasicParser.exprlist_return exprlist90 =null;


        CommonTree EQ89_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:20: ( vardecl EQ ^ exprlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:168:22: vardecl EQ ^ exprlist
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_vardecl_in_variableassignment1344);
            vardecl88=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl88.getTree());

            EQ89=(Token)match(input,EQ,FOLLOW_EQ_in_variableassignment1346); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ89_tree = 
            (CommonTree)adaptor.create(EQ89)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(EQ89_tree, root_0);
            }

            pushFollow(FOLLOW_exprlist_in_variableassignment1349);
            exprlist90=exprlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist90.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:1: relop : ( lte | gte | neq | EQ | GT | LT );
    public final jvmBasicParser.relop_return relop() throws RecognitionException {
        jvmBasicParser.relop_return retval = new jvmBasicParser.relop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ94=null;
        Token GT95=null;
        Token LT96=null;
        jvmBasicParser.lte_return lte91 =null;

        jvmBasicParser.gte_return gte92 =null;

        jvmBasicParser.neq_return neq93 =null;


        CommonTree EQ94_tree=null;
        CommonTree GT95_tree=null;
        CommonTree LT96_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:7: ( lte | gte | neq | EQ | GT | LT )
            int alt11=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred75_jvmBasic()) ) {
                    alt11=1;
                }
                else if ( (synpred76_jvmBasic()) ) {
                    alt11=2;
                }
                else if ( (synpred78_jvmBasic()) ) {
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

                if ( (synpred75_jvmBasic()) ) {
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

                if ( (synpred76_jvmBasic()) ) {
                    alt11=2;
                }
                else if ( (synpred79_jvmBasic()) ) {
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:8: lte
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lte_in_relop1358);
                    lte91=lte();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lte91.getTree());

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:14: gte
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_gte_in_relop1362);
                    gte92=gte();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, gte92.getTree());

                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:20: neq
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_neq_in_relop1366);
                    neq93=neq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, neq93.getTree());

                    }
                    break;
                case 4 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:26: EQ
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    EQ94=(Token)match(input,EQ,FOLLOW_EQ_in_relop1370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ94_tree = 
                    (CommonTree)adaptor.create(EQ94)
                    ;
                    adaptor.addChild(root_0, EQ94_tree);
                    }

                    }
                    break;
                case 5 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:31: GT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GT95=(Token)match(input,GT,FOLLOW_GT_in_relop1374); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT95_tree = 
                    (CommonTree)adaptor.create(GT95)
                    ;
                    adaptor.addChild(root_0, GT95_tree);
                    }

                    }
                    break;
                case 6 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:36: LT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LT96=(Token)match(input,LT,FOLLOW_LT_in_relop1378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT96_tree = 
                    (CommonTree)adaptor.create(LT96)
                    ;
                    adaptor.addChild(root_0, LT96_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:1: gte : ( GTE | ( GT EQ ) | ( EQ GT ) );
    public final jvmBasicParser.gte_return gte() throws RecognitionException {
        jvmBasicParser.gte_return retval = new jvmBasicParser.gte_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GTE97=null;
        Token GT98=null;
        Token EQ99=null;
        Token EQ100=null;
        Token GT101=null;

        CommonTree GTE97_tree=null;
        CommonTree GT98_tree=null;
        CommonTree EQ99_tree=null;
        CommonTree EQ100_tree=null;
        CommonTree GT101_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:5: ( GTE | ( GT EQ ) | ( EQ GT ) )
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:7: GTE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    GTE97=(Token)match(input,GTE,FOLLOW_GTE_in_gte1386); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GTE97_tree = 
                    (CommonTree)adaptor.create(GTE97)
                    ;
                    adaptor.addChild(root_0, GTE97_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:13: ( GT EQ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:13: ( GT EQ )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:14: GT EQ
                    {
                    GT98=(Token)match(input,GT,FOLLOW_GT_in_gte1391); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT98_tree = 
                    (CommonTree)adaptor.create(GT98)
                    ;
                    adaptor.addChild(root_0, GT98_tree);
                    }

                    EQ99=(Token)match(input,EQ,FOLLOW_EQ_in_gte1393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ99_tree = 
                    (CommonTree)adaptor.create(EQ99)
                    ;
                    adaptor.addChild(root_0, EQ99_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:23: ( EQ GT )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:23: ( EQ GT )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:170:24: EQ GT
                    {
                    EQ100=(Token)match(input,EQ,FOLLOW_EQ_in_gte1399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ100_tree = 
                    (CommonTree)adaptor.create(EQ100)
                    ;
                    adaptor.addChild(root_0, EQ100_tree);
                    }

                    GT101=(Token)match(input,GT,FOLLOW_GT_in_gte1401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GT101_tree = 
                    (CommonTree)adaptor.create(GT101)
                    ;
                    adaptor.addChild(root_0, GT101_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:1: lte : ( LTE | ( LT EQ ) | ( EQ LT ) );
    public final jvmBasicParser.lte_return lte() throws RecognitionException {
        jvmBasicParser.lte_return retval = new jvmBasicParser.lte_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LTE102=null;
        Token LT103=null;
        Token EQ104=null;
        Token EQ105=null;
        Token LT106=null;

        CommonTree LTE102_tree=null;
        CommonTree LT103_tree=null;
        CommonTree EQ104_tree=null;
        CommonTree EQ105_tree=null;
        CommonTree LT106_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:5: ( LTE | ( LT EQ ) | ( EQ LT ) )
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:7: LTE
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LTE102=(Token)match(input,LTE,FOLLOW_LTE_in_lte1409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LTE102_tree = 
                    (CommonTree)adaptor.create(LTE102)
                    ;
                    adaptor.addChild(root_0, LTE102_tree);
                    }

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:13: ( LT EQ )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:13: ( LT EQ )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:14: LT EQ
                    {
                    LT103=(Token)match(input,LT,FOLLOW_LT_in_lte1414); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT103_tree = 
                    (CommonTree)adaptor.create(LT103)
                    ;
                    adaptor.addChild(root_0, LT103_tree);
                    }

                    EQ104=(Token)match(input,EQ,FOLLOW_EQ_in_lte1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ104_tree = 
                    (CommonTree)adaptor.create(EQ104)
                    ;
                    adaptor.addChild(root_0, EQ104_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:23: ( EQ LT )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:23: ( EQ LT )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:171:24: EQ LT
                    {
                    EQ105=(Token)match(input,EQ,FOLLOW_EQ_in_lte1422); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQ105_tree = 
                    (CommonTree)adaptor.create(EQ105)
                    ;
                    adaptor.addChild(root_0, EQ105_tree);
                    }

                    LT106=(Token)match(input,LT,FOLLOW_LT_in_lte1424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT106_tree = 
                    (CommonTree)adaptor.create(LT106)
                    ;
                    adaptor.addChild(root_0, LT106_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:1: neq : NEQ ;
    public final jvmBasicParser.neq_return neq() throws RecognitionException {
        jvmBasicParser.neq_return retval = new jvmBasicParser.neq_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEQ107=null;

        CommonTree NEQ107_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:5: ( NEQ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:172:7: NEQ
            {
            root_0 = (CommonTree)adaptor.nil();


            NEQ107=(Token)match(input,NEQ,FOLLOW_NEQ_in_neq1432); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEQ107_tree = 
            (CommonTree)adaptor.create(NEQ107)
            ;
            adaptor.addChild(root_0, NEQ107_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:1: ifstmt : IF ^ expression ( THEN )? statement ;
    public final jvmBasicParser.ifstmt_return ifstmt() throws RecognitionException {
        jvmBasicParser.ifstmt_return retval = new jvmBasicParser.ifstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IF108=null;
        Token THEN110=null;
        jvmBasicParser.expression_return expression109 =null;

        jvmBasicParser.statement_return statement111 =null;


        CommonTree IF108_tree=null;
        CommonTree THEN110_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:8: ( IF ^ expression ( THEN )? statement )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:10: IF ^ expression ( THEN )? statement
            {
            root_0 = (CommonTree)adaptor.nil();


            IF108=(Token)match(input,IF,FOLLOW_IF_in_ifstmt1439); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF108_tree = 
            (CommonTree)adaptor.create(IF108)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(IF108_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_ifstmt1442);
            expression109=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression109.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:25: ( THEN )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:173:25: THEN
                    {
                    THEN110=(Token)match(input,THEN,FOLLOW_THEN_in_ifstmt1444); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THEN110_tree = 
                    (CommonTree)adaptor.create(THEN110)
                    ;
                    adaptor.addChild(root_0, THEN110_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_statement_in_ifstmt1447);
            statement111=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement111.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:1: forstmt : FOR ^ vardecl EQ expression TO expression ( STEP expression )? ;
    public final jvmBasicParser.forstmt_return forstmt() throws RecognitionException {
        jvmBasicParser.forstmt_return retval = new jvmBasicParser.forstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FOR112=null;
        Token EQ114=null;
        Token TO116=null;
        Token STEP118=null;
        jvmBasicParser.vardecl_return vardecl113 =null;

        jvmBasicParser.expression_return expression115 =null;

        jvmBasicParser.expression_return expression117 =null;

        jvmBasicParser.expression_return expression119 =null;


        CommonTree FOR112_tree=null;
        CommonTree EQ114_tree=null;
        CommonTree TO116_tree=null;
        CommonTree STEP118_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:9: ( FOR ^ vardecl EQ expression TO expression ( STEP expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:11: FOR ^ vardecl EQ expression TO expression ( STEP expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            FOR112=(Token)match(input,FOR,FOLLOW_FOR_in_forstmt1454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR112_tree = 
            (CommonTree)adaptor.create(FOR112)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FOR112_tree, root_0);
            }

            pushFollow(FOLLOW_vardecl_in_forstmt1458);
            vardecl113=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl113.getTree());

            EQ114=(Token)match(input,EQ,FOLLOW_EQ_in_forstmt1460); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ114_tree = 
            (CommonTree)adaptor.create(EQ114)
            ;
            adaptor.addChild(root_0, EQ114_tree);
            }

            pushFollow(FOLLOW_expression_in_forstmt1462);
            expression115=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression115.getTree());

            TO116=(Token)match(input,TO,FOLLOW_TO_in_forstmt1464); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TO116_tree = 
            (CommonTree)adaptor.create(TO116)
            ;
            adaptor.addChild(root_0, TO116_tree);
            }

            pushFollow(FOLLOW_expression_in_forstmt1466);
            expression117=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression117.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:53: ( STEP expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:174:54: STEP expression
                    {
                    STEP118=(Token)match(input,STEP,FOLLOW_STEP_in_forstmt1469); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STEP118_tree = 
                    (CommonTree)adaptor.create(STEP118)
                    ;
                    adaptor.addChild(root_0, STEP118_tree);
                    }

                    pushFollow(FOLLOW_expression_in_forstmt1471);
                    expression119=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression119.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:1: nextstmt : NEXT ^ ( varlist )? ;
    public final jvmBasicParser.nextstmt_return nextstmt() throws RecognitionException {
        jvmBasicParser.nextstmt_return retval = new jvmBasicParser.nextstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NEXT120=null;
        jvmBasicParser.varlist_return varlist121 =null;


        CommonTree NEXT120_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:10: ( NEXT ^ ( varlist )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:12: NEXT ^ ( varlist )?
            {
            root_0 = (CommonTree)adaptor.nil();


            NEXT120=(Token)match(input,NEXT,FOLLOW_NEXT_in_nextstmt1481); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEXT120_tree = 
            (CommonTree)adaptor.create(NEXT120)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(NEXT120_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:18: ( varlist )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:175:18: varlist
                    {
                    pushFollow(FOLLOW_varlist_in_nextstmt1484);
                    varlist121=varlist();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist121.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:1: inputstmt : INPUT ^ ( stringliteral ( COMMA | SEMICOLON ) )? varlist ;
    public final jvmBasicParser.inputstmt_return inputstmt() throws RecognitionException {
        jvmBasicParser.inputstmt_return retval = new jvmBasicParser.inputstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INPUT122=null;
        Token set124=null;
        jvmBasicParser.stringliteral_return stringliteral123 =null;

        jvmBasicParser.varlist_return varlist125 =null;


        CommonTree INPUT122_tree=null;
        CommonTree set124_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:11: ( INPUT ^ ( stringliteral ( COMMA | SEMICOLON ) )? varlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:13: INPUT ^ ( stringliteral ( COMMA | SEMICOLON ) )? varlist
            {
            root_0 = (CommonTree)adaptor.nil();


            INPUT122=(Token)match(input,INPUT,FOLLOW_INPUT_in_inputstmt1492); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INPUT122_tree = 
            (CommonTree)adaptor.create(INPUT122)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(INPUT122_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:20: ( stringliteral ( COMMA | SEMICOLON ) )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:176:21: stringliteral ( COMMA | SEMICOLON )
                    {
                    pushFollow(FOLLOW_stringliteral_in_inputstmt1496);
                    stringliteral123=stringliteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringliteral123.getTree());

                    set124=(Token)input.LT(1);

                    if ( input.LA(1)==COMMA||input.LA(1)==SEMICOLON ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set124)
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


            pushFollow(FOLLOW_varlist_in_inputstmt1507);
            varlist125=varlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist125.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:1: readstmt : READ ^ varlist ;
    public final jvmBasicParser.readstmt_return readstmt() throws RecognitionException {
        jvmBasicParser.readstmt_return retval = new jvmBasicParser.readstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token READ126=null;
        jvmBasicParser.varlist_return varlist127 =null;


        CommonTree READ126_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:9: ( READ ^ varlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:177:11: READ ^ varlist
            {
            root_0 = (CommonTree)adaptor.nil();


            READ126=(Token)match(input,READ,FOLLOW_READ_in_readstmt1514); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            READ126_tree = 
            (CommonTree)adaptor.create(READ126)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(READ126_tree, root_0);
            }

            pushFollow(FOLLOW_varlist_in_readstmt1517);
            varlist127=varlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist127.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:1: dimstmt : DIM ^ varlist ;
    public final jvmBasicParser.dimstmt_return dimstmt() throws RecognitionException {
        jvmBasicParser.dimstmt_return retval = new jvmBasicParser.dimstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DIM128=null;
        jvmBasicParser.varlist_return varlist129 =null;


        CommonTree DIM128_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:9: ( DIM ^ varlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:178:11: DIM ^ varlist
            {
            root_0 = (CommonTree)adaptor.nil();


            DIM128=(Token)match(input,DIM,FOLLOW_DIM_in_dimstmt1527); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DIM128_tree = 
            (CommonTree)adaptor.create(DIM128)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(DIM128_tree, root_0);
            }

            pushFollow(FOLLOW_varlist_in_dimstmt1530);
            varlist129=varlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varlist129.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:1: gotostmt : GOTO ^ linenumber ;
    public final jvmBasicParser.gotostmt_return gotostmt() throws RecognitionException {
        jvmBasicParser.gotostmt_return retval = new jvmBasicParser.gotostmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GOTO130=null;
        jvmBasicParser.linenumber_return linenumber131 =null;


        CommonTree GOTO130_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:9: ( GOTO ^ linenumber )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:179:11: GOTO ^ linenumber
            {
            root_0 = (CommonTree)adaptor.nil();


            GOTO130=(Token)match(input,GOTO,FOLLOW_GOTO_in_gotostmt1536); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOTO130_tree = 
            (CommonTree)adaptor.create(GOTO130)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(GOTO130_tree, root_0);
            }

            pushFollow(FOLLOW_linenumber_in_gotostmt1539);
            linenumber131=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber131.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:1: gosubstmt : GOSUB ^ linenumber ;
    public final jvmBasicParser.gosubstmt_return gosubstmt() throws RecognitionException {
        jvmBasicParser.gosubstmt_return retval = new jvmBasicParser.gosubstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token GOSUB132=null;
        jvmBasicParser.linenumber_return linenumber133 =null;


        CommonTree GOSUB132_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:10: ( GOSUB ^ linenumber )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:180:12: GOSUB ^ linenumber
            {
            root_0 = (CommonTree)adaptor.nil();


            GOSUB132=(Token)match(input,GOSUB,FOLLOW_GOSUB_in_gosubstmt1545); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOSUB132_tree = 
            (CommonTree)adaptor.create(GOSUB132)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(GOSUB132_tree, root_0);
            }

            pushFollow(FOLLOW_linenumber_in_gosubstmt1548);
            linenumber133=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber133.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:1: pokestmt : POKE expression COMMA expression ;
    public final jvmBasicParser.pokestmt_return pokestmt() throws RecognitionException {
        jvmBasicParser.pokestmt_return retval = new jvmBasicParser.pokestmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POKE134=null;
        Token COMMA136=null;
        jvmBasicParser.expression_return expression135 =null;

        jvmBasicParser.expression_return expression137 =null;


        CommonTree POKE134_tree=null;
        CommonTree COMMA136_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:9: ( POKE expression COMMA expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:181:11: POKE expression COMMA expression
            {
            root_0 = (CommonTree)adaptor.nil();


            POKE134=(Token)match(input,POKE,FOLLOW_POKE_in_pokestmt1554); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POKE134_tree = 
            (CommonTree)adaptor.create(POKE134)
            ;
            adaptor.addChild(root_0, POKE134_tree);
            }

            pushFollow(FOLLOW_expression_in_pokestmt1556);
            expression135=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression135.getTree());

            COMMA136=(Token)match(input,COMMA,FOLLOW_COMMA_in_pokestmt1558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA136_tree = 
            (CommonTree)adaptor.create(COMMA136)
            ;
            adaptor.addChild(root_0, COMMA136_tree);
            }

            pushFollow(FOLLOW_expression_in_pokestmt1560);
            expression137=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression137.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:1: comment : REM ^ ( options {greedy=false; } : (~ ( CR ) ) )* ;
    public final jvmBasicParser.comment_return comment() throws RecognitionException {
        jvmBasicParser.comment_return retval = new jvmBasicParser.comment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token REM138=null;
        Token set139=null;

        CommonTree REM138_tree=null;
        CommonTree set139_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:8: ( REM ^ ( options {greedy=false; } : (~ ( CR ) ) )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:10: REM ^ ( options {greedy=false; } : (~ ( CR ) ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            REM138=(Token)match(input,REM,FOLLOW_REM_in_comment1566); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REM138_tree = 
            (CommonTree)adaptor.create(REM138)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(REM138_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:15: ( options {greedy=false; } : (~ ( CR ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case COLON:
                    {
                    int LA18_1 = input.LA(2);

                    if ( (synpred89_jvmBasic()) ) {
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
                case 124:
                case 125:
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:42: (~ ( CR ) )
            	    {
            	    set139=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ABS && input.LA(1) <= COS)||(input.LA(1) >= DATA && input.LA(1) <= 125) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set139)
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:1: callstmt : CALL ^ exprlist ;
    public final jvmBasicParser.callstmt_return callstmt() throws RecognitionException {
        jvmBasicParser.callstmt_return retval = new jvmBasicParser.callstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CALL140=null;
        jvmBasicParser.exprlist_return exprlist141 =null;


        CommonTree CALL140_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:9: ( CALL ^ exprlist )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:183:11: CALL ^ exprlist
            {
            root_0 = (CommonTree)adaptor.nil();


            CALL140=(Token)match(input,CALL,FOLLOW_CALL_in_callstmt1592); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CALL140_tree = 
            (CommonTree)adaptor.create(CALL140)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CALL140_tree, root_0);
            }

            pushFollow(FOLLOW_exprlist_in_callstmt1595);
            exprlist141=exprlist();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprlist141.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:1: hplotstmt : HPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* ;
    public final jvmBasicParser.hplotstmt_return hplotstmt() throws RecognitionException {
        jvmBasicParser.hplotstmt_return retval = new jvmBasicParser.hplotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HPLOT142=null;
        Token COMMA144=null;
        Token TO146=null;
        Token COMMA148=null;
        jvmBasicParser.expression_return expression143 =null;

        jvmBasicParser.expression_return expression145 =null;

        jvmBasicParser.expression_return expression147 =null;

        jvmBasicParser.expression_return expression149 =null;


        CommonTree HPLOT142_tree=null;
        CommonTree COMMA144_tree=null;
        CommonTree TO146_tree=null;
        CommonTree COMMA148_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:10: ( HPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:12: HPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            HPLOT142=(Token)match(input,HPLOT,FOLLOW_HPLOT_in_hplotstmt1601); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HPLOT142_tree = 
            (CommonTree)adaptor.create(HPLOT142)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HPLOT142_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:19: ( expression COMMA expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:20: expression COMMA expression
                    {
                    pushFollow(FOLLOW_expression_in_hplotstmt1605);
                    expression143=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression143.getTree());

                    COMMA144=(Token)match(input,COMMA,FOLLOW_COMMA_in_hplotstmt1607); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA144_tree = 
                    (CommonTree)adaptor.create(COMMA144)
                    ;
                    adaptor.addChild(root_0, COMMA144_tree);
                    }

                    pushFollow(FOLLOW_expression_in_hplotstmt1609);
                    expression145=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression145.getTree());

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:50: ( TO expression COMMA expression )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:184:51: TO expression COMMA expression
            	    {
            	    TO146=(Token)match(input,TO,FOLLOW_TO_in_hplotstmt1614); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TO146_tree = 
            	    (CommonTree)adaptor.create(TO146)
            	    ;
            	    adaptor.addChild(root_0, TO146_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_hplotstmt1616);
            	    expression147=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression147.getTree());

            	    COMMA148=(Token)match(input,COMMA,FOLLOW_COMMA_in_hplotstmt1618); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA148_tree = 
            	    (CommonTree)adaptor.create(COMMA148)
            	    ;
            	    adaptor.addChild(root_0, COMMA148_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_hplotstmt1620);
            	    expression149=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:1: vplotstmt : VPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* ;
    public final jvmBasicParser.vplotstmt_return vplotstmt() throws RecognitionException {
        jvmBasicParser.vplotstmt_return retval = new jvmBasicParser.vplotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VPLOT150=null;
        Token COMMA152=null;
        Token TO154=null;
        Token COMMA156=null;
        jvmBasicParser.expression_return expression151 =null;

        jvmBasicParser.expression_return expression153 =null;

        jvmBasicParser.expression_return expression155 =null;

        jvmBasicParser.expression_return expression157 =null;


        CommonTree VPLOT150_tree=null;
        CommonTree COMMA152_tree=null;
        CommonTree TO154_tree=null;
        CommonTree COMMA156_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:10: ( VPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:12: VPLOT ^ ( expression COMMA expression )? ( TO expression COMMA expression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            VPLOT150=(Token)match(input,VPLOT,FOLLOW_VPLOT_in_vplotstmt1628); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VPLOT150_tree = 
            (CommonTree)adaptor.create(VPLOT150)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VPLOT150_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:19: ( expression COMMA expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:20: expression COMMA expression
                    {
                    pushFollow(FOLLOW_expression_in_vplotstmt1632);
                    expression151=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression151.getTree());

                    COMMA152=(Token)match(input,COMMA,FOLLOW_COMMA_in_vplotstmt1634); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA152_tree = 
                    (CommonTree)adaptor.create(COMMA152)
                    ;
                    adaptor.addChild(root_0, COMMA152_tree);
                    }

                    pushFollow(FOLLOW_expression_in_vplotstmt1636);
                    expression153=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression153.getTree());

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:50: ( TO expression COMMA expression )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:185:51: TO expression COMMA expression
            	    {
            	    TO154=(Token)match(input,TO,FOLLOW_TO_in_vplotstmt1641); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TO154_tree = 
            	    (CommonTree)adaptor.create(TO154)
            	    ;
            	    adaptor.addChild(root_0, TO154_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_vplotstmt1643);
            	    expression155=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression155.getTree());

            	    COMMA156=(Token)match(input,COMMA,FOLLOW_COMMA_in_vplotstmt1645); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA156_tree = 
            	    (CommonTree)adaptor.create(COMMA156)
            	    ;
            	    adaptor.addChild(root_0, COMMA156_tree);
            	    }

            	    pushFollow(FOLLOW_expression_in_vplotstmt1647);
            	    expression157=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression157.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:1: plotstmt : PLOT expression COMMA expression ;
    public final jvmBasicParser.plotstmt_return plotstmt() throws RecognitionException {
        jvmBasicParser.plotstmt_return retval = new jvmBasicParser.plotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLOT158=null;
        Token COMMA160=null;
        jvmBasicParser.expression_return expression159 =null;

        jvmBasicParser.expression_return expression161 =null;


        CommonTree PLOT158_tree=null;
        CommonTree COMMA160_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:9: ( PLOT expression COMMA expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:186:11: PLOT expression COMMA expression
            {
            root_0 = (CommonTree)adaptor.nil();


            PLOT158=(Token)match(input,PLOT,FOLLOW_PLOT_in_plotstmt1655); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PLOT158_tree = 
            (CommonTree)adaptor.create(PLOT158)
            ;
            adaptor.addChild(root_0, PLOT158_tree);
            }

            pushFollow(FOLLOW_expression_in_plotstmt1657);
            expression159=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression159.getTree());

            COMMA160=(Token)match(input,COMMA,FOLLOW_COMMA_in_plotstmt1659); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA160_tree = 
            (CommonTree)adaptor.create(COMMA160)
            ;
            adaptor.addChild(root_0, COMMA160_tree);
            }

            pushFollow(FOLLOW_expression_in_plotstmt1661);
            expression161=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression161.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:1: ongotostmt : ON expression GOTO linenumber ( COMMA linenumber )* ;
    public final jvmBasicParser.ongotostmt_return ongotostmt() throws RecognitionException {
        jvmBasicParser.ongotostmt_return retval = new jvmBasicParser.ongotostmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ON162=null;
        Token GOTO164=null;
        Token COMMA166=null;
        jvmBasicParser.expression_return expression163 =null;

        jvmBasicParser.linenumber_return linenumber165 =null;

        jvmBasicParser.linenumber_return linenumber167 =null;


        CommonTree ON162_tree=null;
        CommonTree GOTO164_tree=null;
        CommonTree COMMA166_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:12: ( ON expression GOTO linenumber ( COMMA linenumber )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:14: ON expression GOTO linenumber ( COMMA linenumber )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ON162=(Token)match(input,ON,FOLLOW_ON_in_ongotostmt1668); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ON162_tree = 
            (CommonTree)adaptor.create(ON162)
            ;
            adaptor.addChild(root_0, ON162_tree);
            }

            pushFollow(FOLLOW_expression_in_ongotostmt1670);
            expression163=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression163.getTree());

            GOTO164=(Token)match(input,GOTO,FOLLOW_GOTO_in_ongotostmt1672); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOTO164_tree = 
            (CommonTree)adaptor.create(GOTO164)
            ;
            adaptor.addChild(root_0, GOTO164_tree);
            }

            pushFollow(FOLLOW_linenumber_in_ongotostmt1674);
            linenumber165=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber165.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:44: ( COMMA linenumber )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:187:45: COMMA linenumber
            	    {
            	    COMMA166=(Token)match(input,COMMA,FOLLOW_COMMA_in_ongotostmt1677); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA166_tree = 
            	    (CommonTree)adaptor.create(COMMA166)
            	    ;
            	    adaptor.addChild(root_0, COMMA166_tree);
            	    }

            	    pushFollow(FOLLOW_linenumber_in_ongotostmt1679);
            	    linenumber167=linenumber();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber167.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:1: ongosubstmt : ON expression GOSUB linenumber ( COMMA linenumber )* ;
    public final jvmBasicParser.ongosubstmt_return ongosubstmt() throws RecognitionException {
        jvmBasicParser.ongosubstmt_return retval = new jvmBasicParser.ongosubstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ON168=null;
        Token GOSUB170=null;
        Token COMMA172=null;
        jvmBasicParser.expression_return expression169 =null;

        jvmBasicParser.linenumber_return linenumber171 =null;

        jvmBasicParser.linenumber_return linenumber173 =null;


        CommonTree ON168_tree=null;
        CommonTree GOSUB170_tree=null;
        CommonTree COMMA172_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:13: ( ON expression GOSUB linenumber ( COMMA linenumber )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:15: ON expression GOSUB linenumber ( COMMA linenumber )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ON168=(Token)match(input,ON,FOLLOW_ON_in_ongosubstmt1688); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ON168_tree = 
            (CommonTree)adaptor.create(ON168)
            ;
            adaptor.addChild(root_0, ON168_tree);
            }

            pushFollow(FOLLOW_expression_in_ongosubstmt1690);
            expression169=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression169.getTree());

            GOSUB170=(Token)match(input,GOSUB,FOLLOW_GOSUB_in_ongosubstmt1692); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOSUB170_tree = 
            (CommonTree)adaptor.create(GOSUB170)
            ;
            adaptor.addChild(root_0, GOSUB170_tree);
            }

            pushFollow(FOLLOW_linenumber_in_ongosubstmt1694);
            linenumber171=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber171.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:46: ( COMMA linenumber )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:188:47: COMMA linenumber
            	    {
            	    COMMA172=(Token)match(input,COMMA,FOLLOW_COMMA_in_ongosubstmt1697); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA172_tree = 
            	    (CommonTree)adaptor.create(COMMA172)
            	    ;
            	    adaptor.addChild(root_0, COMMA172_tree);
            	    }

            	    pushFollow(FOLLOW_linenumber_in_ongosubstmt1699);
            	    linenumber173=linenumber();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber173.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:1: vtabstmnt : VTAB ^ expression ;
    public final jvmBasicParser.vtabstmnt_return vtabstmnt() throws RecognitionException {
        jvmBasicParser.vtabstmnt_return retval = new jvmBasicParser.vtabstmnt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VTAB174=null;
        jvmBasicParser.expression_return expression175 =null;


        CommonTree VTAB174_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:11: ( VTAB ^ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:189:13: VTAB ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            VTAB174=(Token)match(input,VTAB,FOLLOW_VTAB_in_vtabstmnt1708); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VTAB174_tree = 
            (CommonTree)adaptor.create(VTAB174)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VTAB174_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_vtabstmnt1711);
            expression175=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression175.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:1: htabstmnt : HTAB ^ expression ;
    public final jvmBasicParser.htabstmnt_return htabstmnt() throws RecognitionException {
        jvmBasicParser.htabstmnt_return retval = new jvmBasicParser.htabstmnt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HTAB176=null;
        jvmBasicParser.expression_return expression177 =null;


        CommonTree HTAB176_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:11: ( HTAB ^ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:190:13: HTAB ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HTAB176=(Token)match(input,HTAB,FOLLOW_HTAB_in_htabstmnt1718); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HTAB176_tree = 
            (CommonTree)adaptor.create(HTAB176)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HTAB176_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_htabstmnt1721);
            expression177=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression177.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:1: himemstmt : HIMEM ^ COLON expression ;
    public final jvmBasicParser.himemstmt_return himemstmt() throws RecognitionException {
        jvmBasicParser.himemstmt_return retval = new jvmBasicParser.himemstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HIMEM178=null;
        Token COLON179=null;
        jvmBasicParser.expression_return expression180 =null;


        CommonTree HIMEM178_tree=null;
        CommonTree COLON179_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:10: ( HIMEM ^ COLON expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:191:12: HIMEM ^ COLON expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HIMEM178=(Token)match(input,HIMEM,FOLLOW_HIMEM_in_himemstmt1727); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HIMEM178_tree = 
            (CommonTree)adaptor.create(HIMEM178)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HIMEM178_tree, root_0);
            }

            COLON179=(Token)match(input,COLON,FOLLOW_COLON_in_himemstmt1730); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON179_tree = 
            (CommonTree)adaptor.create(COLON179)
            ;
            adaptor.addChild(root_0, COLON179_tree);
            }

            pushFollow(FOLLOW_expression_in_himemstmt1732);
            expression180=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression180.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:1: lomemstmt : LOMEM ^ COLON expression ;
    public final jvmBasicParser.lomemstmt_return lomemstmt() throws RecognitionException {
        jvmBasicParser.lomemstmt_return retval = new jvmBasicParser.lomemstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOMEM181=null;
        Token COLON182=null;
        jvmBasicParser.expression_return expression183 =null;


        CommonTree LOMEM181_tree=null;
        CommonTree COLON182_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:10: ( LOMEM ^ COLON expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:192:12: LOMEM ^ COLON expression
            {
            root_0 = (CommonTree)adaptor.nil();


            LOMEM181=(Token)match(input,LOMEM,FOLLOW_LOMEM_in_lomemstmt1738); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOMEM181_tree = 
            (CommonTree)adaptor.create(LOMEM181)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LOMEM181_tree, root_0);
            }

            COLON182=(Token)match(input,COLON,FOLLOW_COLON_in_lomemstmt1741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLON182_tree = 
            (CommonTree)adaptor.create(COLON182)
            ;
            adaptor.addChild(root_0, COLON182_tree);
            }

            pushFollow(FOLLOW_expression_in_lomemstmt1743);
            expression183=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression183.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:1: datastmt : DATA ^ expression ( COMMA ( expression )? )* ;
    public final jvmBasicParser.datastmt_return datastmt() throws RecognitionException {
        jvmBasicParser.datastmt_return retval = new jvmBasicParser.datastmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DATA184=null;
        Token COMMA186=null;
        jvmBasicParser.expression_return expression185 =null;

        jvmBasicParser.expression_return expression187 =null;


        CommonTree DATA184_tree=null;
        CommonTree COMMA186_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:9: ( DATA ^ expression ( COMMA ( expression )? )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:11: DATA ^ expression ( COMMA ( expression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            DATA184=(Token)match(input,DATA,FOLLOW_DATA_in_datastmt1749); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DATA184_tree = 
            (CommonTree)adaptor.create(DATA184)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(DATA184_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_datastmt1752);
            expression185=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression185.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:28: ( COMMA ( expression )? )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:29: COMMA ( expression )?
            	    {
            	    COMMA186=(Token)match(input,COMMA,FOLLOW_COMMA_in_datastmt1755); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA186_tree = 
            	    (CommonTree)adaptor.create(COMMA186)
            	    ;
            	    adaptor.addChild(root_0, COMMA186_tree);
            	    }

            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:35: ( expression )?
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
            	            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:193:35: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_datastmt1757);
            	            expression187=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression187.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:1: waitstmt : WAIT ^ expression COMMA expression ( COMMA expression )? ;
    public final jvmBasicParser.waitstmt_return waitstmt() throws RecognitionException {
        jvmBasicParser.waitstmt_return retval = new jvmBasicParser.waitstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token WAIT188=null;
        Token COMMA190=null;
        Token COMMA192=null;
        jvmBasicParser.expression_return expression189 =null;

        jvmBasicParser.expression_return expression191 =null;

        jvmBasicParser.expression_return expression193 =null;


        CommonTree WAIT188_tree=null;
        CommonTree COMMA190_tree=null;
        CommonTree COMMA192_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:9: ( WAIT ^ expression COMMA expression ( COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:11: WAIT ^ expression COMMA expression ( COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            WAIT188=(Token)match(input,WAIT,FOLLOW_WAIT_in_waitstmt1766); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WAIT188_tree = 
            (CommonTree)adaptor.create(WAIT188)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(WAIT188_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_waitstmt1769);
            expression189=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression189.getTree());

            COMMA190=(Token)match(input,COMMA,FOLLOW_COMMA_in_waitstmt1771); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA190_tree = 
            (CommonTree)adaptor.create(COMMA190)
            ;
            adaptor.addChild(root_0, COMMA190_tree);
            }

            pushFollow(FOLLOW_expression_in_waitstmt1773);
            expression191=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression191.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:45: ( COMMA expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:194:46: COMMA expression
                    {
                    COMMA192=(Token)match(input,COMMA,FOLLOW_COMMA_in_waitstmt1776); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA192_tree = 
                    (CommonTree)adaptor.create(COMMA192)
                    ;
                    adaptor.addChild(root_0, COMMA192_tree);
                    }

                    pushFollow(FOLLOW_expression_in_waitstmt1778);
                    expression193=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression193.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:1: xdrawstmt : XDRAW ^ expression ( AT expression COMMA expression )? ;
    public final jvmBasicParser.xdrawstmt_return xdrawstmt() throws RecognitionException {
        jvmBasicParser.xdrawstmt_return retval = new jvmBasicParser.xdrawstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token XDRAW194=null;
        Token AT196=null;
        Token COMMA198=null;
        jvmBasicParser.expression_return expression195 =null;

        jvmBasicParser.expression_return expression197 =null;

        jvmBasicParser.expression_return expression199 =null;


        CommonTree XDRAW194_tree=null;
        CommonTree AT196_tree=null;
        CommonTree COMMA198_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:10: ( XDRAW ^ expression ( AT expression COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:12: XDRAW ^ expression ( AT expression COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            XDRAW194=(Token)match(input,XDRAW,FOLLOW_XDRAW_in_xdrawstmt1786); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            XDRAW194_tree = 
            (CommonTree)adaptor.create(XDRAW194)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(XDRAW194_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_xdrawstmt1789);
            expression195=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression195.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:30: ( AT expression COMMA expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:195:31: AT expression COMMA expression
                    {
                    AT196=(Token)match(input,AT,FOLLOW_AT_in_xdrawstmt1792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT196_tree = 
                    (CommonTree)adaptor.create(AT196)
                    ;
                    adaptor.addChild(root_0, AT196_tree);
                    }

                    pushFollow(FOLLOW_expression_in_xdrawstmt1794);
                    expression197=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression197.getTree());

                    COMMA198=(Token)match(input,COMMA,FOLLOW_COMMA_in_xdrawstmt1796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA198_tree = 
                    (CommonTree)adaptor.create(COMMA198)
                    ;
                    adaptor.addChild(root_0, COMMA198_tree);
                    }

                    pushFollow(FOLLOW_expression_in_xdrawstmt1798);
                    expression199=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression199.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:1: drawstmt : DRAW ^ expression ( AT expression COMMA expression )? ;
    public final jvmBasicParser.drawstmt_return drawstmt() throws RecognitionException {
        jvmBasicParser.drawstmt_return retval = new jvmBasicParser.drawstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DRAW200=null;
        Token AT202=null;
        Token COMMA204=null;
        jvmBasicParser.expression_return expression201 =null;

        jvmBasicParser.expression_return expression203 =null;

        jvmBasicParser.expression_return expression205 =null;


        CommonTree DRAW200_tree=null;
        CommonTree AT202_tree=null;
        CommonTree COMMA204_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:9: ( DRAW ^ expression ( AT expression COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:11: DRAW ^ expression ( AT expression COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            DRAW200=(Token)match(input,DRAW,FOLLOW_DRAW_in_drawstmt1806); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DRAW200_tree = 
            (CommonTree)adaptor.create(DRAW200)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(DRAW200_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_drawstmt1809);
            expression201=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression201.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:28: ( AT expression COMMA expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:196:29: AT expression COMMA expression
                    {
                    AT202=(Token)match(input,AT,FOLLOW_AT_in_drawstmt1812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT202_tree = 
                    (CommonTree)adaptor.create(AT202)
                    ;
                    adaptor.addChild(root_0, AT202_tree);
                    }

                    pushFollow(FOLLOW_expression_in_drawstmt1814);
                    expression203=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression203.getTree());

                    COMMA204=(Token)match(input,COMMA,FOLLOW_COMMA_in_drawstmt1816); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA204_tree = 
                    (CommonTree)adaptor.create(COMMA204)
                    ;
                    adaptor.addChild(root_0, COMMA204_tree);
                    }

                    pushFollow(FOLLOW_expression_in_drawstmt1818);
                    expression205=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression205.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:1: defstmt : DEF FN var LPAREN var RPAREN EQ expression ;
    public final jvmBasicParser.defstmt_return defstmt() throws RecognitionException {
        jvmBasicParser.defstmt_return retval = new jvmBasicParser.defstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DEF206=null;
        Token FN207=null;
        Token LPAREN209=null;
        Token RPAREN211=null;
        Token EQ212=null;
        jvmBasicParser.var_return var208 =null;

        jvmBasicParser.var_return var210 =null;

        jvmBasicParser.expression_return expression213 =null;


        CommonTree DEF206_tree=null;
        CommonTree FN207_tree=null;
        CommonTree LPAREN209_tree=null;
        CommonTree RPAREN211_tree=null;
        CommonTree EQ212_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:8: ( DEF FN var LPAREN var RPAREN EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:197:10: DEF FN var LPAREN var RPAREN EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            DEF206=(Token)match(input,DEF,FOLLOW_DEF_in_defstmt1826); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEF206_tree = 
            (CommonTree)adaptor.create(DEF206)
            ;
            adaptor.addChild(root_0, DEF206_tree);
            }

            FN207=(Token)match(input,FN,FOLLOW_FN_in_defstmt1828); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FN207_tree = 
            (CommonTree)adaptor.create(FN207)
            ;
            adaptor.addChild(root_0, FN207_tree);
            }

            pushFollow(FOLLOW_var_in_defstmt1830);
            var208=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var208.getTree());

            LPAREN209=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_defstmt1832); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN209_tree = 
            (CommonTree)adaptor.create(LPAREN209)
            ;
            adaptor.addChild(root_0, LPAREN209_tree);
            }

            pushFollow(FOLLOW_var_in_defstmt1834);
            var210=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var210.getTree());

            RPAREN211=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_defstmt1836); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN211_tree = 
            (CommonTree)adaptor.create(RPAREN211)
            ;
            adaptor.addChild(root_0, RPAREN211_tree);
            }

            EQ212=(Token)match(input,EQ,FOLLOW_EQ_in_defstmt1838); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ212_tree = 
            (CommonTree)adaptor.create(EQ212)
            ;
            adaptor.addChild(root_0, EQ212_tree);
            }

            pushFollow(FOLLOW_expression_in_defstmt1840);
            expression213=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression213.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:1: tabstmt : TAB ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.tabstmt_return tabstmt() throws RecognitionException {
        jvmBasicParser.tabstmt_return retval = new jvmBasicParser.tabstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TAB214=null;
        Token LPAREN215=null;
        Token RPAREN217=null;
        jvmBasicParser.expression_return expression216 =null;


        CommonTree TAB214_tree=null;
        CommonTree LPAREN215_tree=null;
        CommonTree RPAREN217_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:8: ( TAB ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:198:10: TAB ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            TAB214=(Token)match(input,TAB,FOLLOW_TAB_in_tabstmt1846); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TAB214_tree = 
            (CommonTree)adaptor.create(TAB214)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(TAB214_tree, root_0);
            }

            LPAREN215=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tabstmt1849); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN215_tree = 
            (CommonTree)adaptor.create(LPAREN215)
            ;
            adaptor.addChild(root_0, LPAREN215_tree);
            }

            pushFollow(FOLLOW_expression_in_tabstmt1851);
            expression216=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression216.getTree());

            RPAREN217=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tabstmt1853); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN217_tree = 
            (CommonTree)adaptor.create(RPAREN217)
            ;
            adaptor.addChild(root_0, RPAREN217_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:1: speedstmt : SPEED ^ EQ expression ;
    public final jvmBasicParser.speedstmt_return speedstmt() throws RecognitionException {
        jvmBasicParser.speedstmt_return retval = new jvmBasicParser.speedstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SPEED218=null;
        Token EQ219=null;
        jvmBasicParser.expression_return expression220 =null;


        CommonTree SPEED218_tree=null;
        CommonTree EQ219_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:10: ( SPEED ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:199:12: SPEED ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            SPEED218=(Token)match(input,SPEED,FOLLOW_SPEED_in_speedstmt1859); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SPEED218_tree = 
            (CommonTree)adaptor.create(SPEED218)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SPEED218_tree, root_0);
            }

            EQ219=(Token)match(input,EQ,FOLLOW_EQ_in_speedstmt1862); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ219_tree = 
            (CommonTree)adaptor.create(EQ219)
            ;
            adaptor.addChild(root_0, EQ219_tree);
            }

            pushFollow(FOLLOW_expression_in_speedstmt1864);
            expression220=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression220.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:1: rotstmt : ROT ^ EQ expression ;
    public final jvmBasicParser.rotstmt_return rotstmt() throws RecognitionException {
        jvmBasicParser.rotstmt_return retval = new jvmBasicParser.rotstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ROT221=null;
        Token EQ222=null;
        jvmBasicParser.expression_return expression223 =null;


        CommonTree ROT221_tree=null;
        CommonTree EQ222_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:8: ( ROT ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:200:10: ROT ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            ROT221=(Token)match(input,ROT,FOLLOW_ROT_in_rotstmt1870); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ROT221_tree = 
            (CommonTree)adaptor.create(ROT221)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ROT221_tree, root_0);
            }

            EQ222=(Token)match(input,EQ,FOLLOW_EQ_in_rotstmt1873); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ222_tree = 
            (CommonTree)adaptor.create(EQ222)
            ;
            adaptor.addChild(root_0, EQ222_tree);
            }

            pushFollow(FOLLOW_expression_in_rotstmt1875);
            expression223=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression223.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:1: scalestmt : SCALE ^ EQ expression ;
    public final jvmBasicParser.scalestmt_return scalestmt() throws RecognitionException {
        jvmBasicParser.scalestmt_return retval = new jvmBasicParser.scalestmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SCALE224=null;
        Token EQ225=null;
        jvmBasicParser.expression_return expression226 =null;


        CommonTree SCALE224_tree=null;
        CommonTree EQ225_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:10: ( SCALE ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:201:12: SCALE ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            SCALE224=(Token)match(input,SCALE,FOLLOW_SCALE_in_scalestmt1881); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SCALE224_tree = 
            (CommonTree)adaptor.create(SCALE224)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SCALE224_tree, root_0);
            }

            EQ225=(Token)match(input,EQ,FOLLOW_EQ_in_scalestmt1884); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ225_tree = 
            (CommonTree)adaptor.create(EQ225)
            ;
            adaptor.addChild(root_0, EQ225_tree);
            }

            pushFollow(FOLLOW_expression_in_scalestmt1886);
            expression226=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression226.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:1: colorstmt : COLOR ^ EQ expression ;
    public final jvmBasicParser.colorstmt_return colorstmt() throws RecognitionException {
        jvmBasicParser.colorstmt_return retval = new jvmBasicParser.colorstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COLOR227=null;
        Token EQ228=null;
        jvmBasicParser.expression_return expression229 =null;


        CommonTree COLOR227_tree=null;
        CommonTree EQ228_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:10: ( COLOR ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:202:12: COLOR ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            COLOR227=(Token)match(input,COLOR,FOLLOW_COLOR_in_colorstmt1892); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COLOR227_tree = 
            (CommonTree)adaptor.create(COLOR227)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(COLOR227_tree, root_0);
            }

            EQ228=(Token)match(input,EQ,FOLLOW_EQ_in_colorstmt1895); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ228_tree = 
            (CommonTree)adaptor.create(EQ228)
            ;
            adaptor.addChild(root_0, EQ228_tree);
            }

            pushFollow(FOLLOW_expression_in_colorstmt1897);
            expression229=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression229.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:203:1: hcolorstmt : HCOLOR ^ EQ expression ;
    public final jvmBasicParser.hcolorstmt_return hcolorstmt() throws RecognitionException {
        jvmBasicParser.hcolorstmt_return retval = new jvmBasicParser.hcolorstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HCOLOR230=null;
        Token EQ231=null;
        jvmBasicParser.expression_return expression232 =null;


        CommonTree HCOLOR230_tree=null;
        CommonTree EQ231_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:203:11: ( HCOLOR ^ EQ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:203:13: HCOLOR ^ EQ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HCOLOR230=(Token)match(input,HCOLOR,FOLLOW_HCOLOR_in_hcolorstmt1903); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HCOLOR230_tree = 
            (CommonTree)adaptor.create(HCOLOR230)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HCOLOR230_tree, root_0);
            }

            EQ231=(Token)match(input,EQ,FOLLOW_EQ_in_hcolorstmt1906); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ231_tree = 
            (CommonTree)adaptor.create(EQ231)
            ;
            adaptor.addChild(root_0, EQ231_tree);
            }

            pushFollow(FOLLOW_expression_in_hcolorstmt1908);
            expression232=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression232.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:204:1: hlinstmt : HLIN ^ expression COMMA expression AT expression ;
    public final jvmBasicParser.hlinstmt_return hlinstmt() throws RecognitionException {
        jvmBasicParser.hlinstmt_return retval = new jvmBasicParser.hlinstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token HLIN233=null;
        Token COMMA235=null;
        Token AT237=null;
        jvmBasicParser.expression_return expression234 =null;

        jvmBasicParser.expression_return expression236 =null;

        jvmBasicParser.expression_return expression238 =null;


        CommonTree HLIN233_tree=null;
        CommonTree COMMA235_tree=null;
        CommonTree AT237_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:204:9: ( HLIN ^ expression COMMA expression AT expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:204:11: HLIN ^ expression COMMA expression AT expression
            {
            root_0 = (CommonTree)adaptor.nil();


            HLIN233=(Token)match(input,HLIN,FOLLOW_HLIN_in_hlinstmt1914); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HLIN233_tree = 
            (CommonTree)adaptor.create(HLIN233)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(HLIN233_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_hlinstmt1917);
            expression234=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression234.getTree());

            COMMA235=(Token)match(input,COMMA,FOLLOW_COMMA_in_hlinstmt1919); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA235_tree = 
            (CommonTree)adaptor.create(COMMA235)
            ;
            adaptor.addChild(root_0, COMMA235_tree);
            }

            pushFollow(FOLLOW_expression_in_hlinstmt1921);
            expression236=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression236.getTree());

            AT237=(Token)match(input,AT,FOLLOW_AT_in_hlinstmt1923); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT237_tree = 
            (CommonTree)adaptor.create(AT237)
            ;
            adaptor.addChild(root_0, AT237_tree);
            }

            pushFollow(FOLLOW_expression_in_hlinstmt1925);
            expression238=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression238.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:1: vlinstmt : VLIN ^ expression COMMA expression AT expression ;
    public final jvmBasicParser.vlinstmt_return vlinstmt() throws RecognitionException {
        jvmBasicParser.vlinstmt_return retval = new jvmBasicParser.vlinstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VLIN239=null;
        Token COMMA241=null;
        Token AT243=null;
        jvmBasicParser.expression_return expression240 =null;

        jvmBasicParser.expression_return expression242 =null;

        jvmBasicParser.expression_return expression244 =null;


        CommonTree VLIN239_tree=null;
        CommonTree COMMA241_tree=null;
        CommonTree AT243_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:9: ( VLIN ^ expression COMMA expression AT expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:205:11: VLIN ^ expression COMMA expression AT expression
            {
            root_0 = (CommonTree)adaptor.nil();


            VLIN239=(Token)match(input,VLIN,FOLLOW_VLIN_in_vlinstmt1931); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VLIN239_tree = 
            (CommonTree)adaptor.create(VLIN239)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VLIN239_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_vlinstmt1934);
            expression240=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression240.getTree());

            COMMA241=(Token)match(input,COMMA,FOLLOW_COMMA_in_vlinstmt1936); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA241_tree = 
            (CommonTree)adaptor.create(COMMA241)
            ;
            adaptor.addChild(root_0, COMMA241_tree);
            }

            pushFollow(FOLLOW_expression_in_vlinstmt1938);
            expression242=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression242.getTree());

            AT243=(Token)match(input,AT,FOLLOW_AT_in_vlinstmt1940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT243_tree = 
            (CommonTree)adaptor.create(AT243)
            ;
            adaptor.addChild(root_0, AT243_tree);
            }

            pushFollow(FOLLOW_expression_in_vlinstmt1942);
            expression244=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression244.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:1: onerrstmt : ONERR GOTO linenumber ;
    public final jvmBasicParser.onerrstmt_return onerrstmt() throws RecognitionException {
        jvmBasicParser.onerrstmt_return retval = new jvmBasicParser.onerrstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ONERR245=null;
        Token GOTO246=null;
        jvmBasicParser.linenumber_return linenumber247 =null;


        CommonTree ONERR245_tree=null;
        CommonTree GOTO246_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:10: ( ONERR GOTO linenumber )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:206:12: ONERR GOTO linenumber
            {
            root_0 = (CommonTree)adaptor.nil();


            ONERR245=(Token)match(input,ONERR,FOLLOW_ONERR_in_onerrstmt1948); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ONERR245_tree = 
            (CommonTree)adaptor.create(ONERR245)
            ;
            adaptor.addChild(root_0, ONERR245_tree);
            }

            GOTO246=(Token)match(input,GOTO,FOLLOW_GOTO_in_onerrstmt1950); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GOTO246_tree = 
            (CommonTree)adaptor.create(GOTO246)
            ;
            adaptor.addChild(root_0, GOTO246_tree);
            }

            pushFollow(FOLLOW_linenumber_in_onerrstmt1952);
            linenumber247=linenumber();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, linenumber247.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:1: prstmt : PRNUMBER ^ NUMBER ;
    public final jvmBasicParser.prstmt_return prstmt() throws RecognitionException {
        jvmBasicParser.prstmt_return retval = new jvmBasicParser.prstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PRNUMBER248=null;
        Token NUMBER249=null;

        CommonTree PRNUMBER248_tree=null;
        CommonTree NUMBER249_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:7: ( PRNUMBER ^ NUMBER )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:207:9: PRNUMBER ^ NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();


            PRNUMBER248=(Token)match(input,PRNUMBER,FOLLOW_PRNUMBER_in_prstmt1958); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PRNUMBER248_tree = 
            (CommonTree)adaptor.create(PRNUMBER248)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PRNUMBER248_tree, root_0);
            }

            NUMBER249=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_prstmt1961); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER249_tree = 
            (CommonTree)adaptor.create(NUMBER249)
            ;
            adaptor.addChild(root_0, NUMBER249_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:1: instmt : INNUMBER ^ NUMBER ;
    public final jvmBasicParser.instmt_return instmt() throws RecognitionException {
        jvmBasicParser.instmt_return retval = new jvmBasicParser.instmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INNUMBER250=null;
        Token NUMBER251=null;

        CommonTree INNUMBER250_tree=null;
        CommonTree NUMBER251_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:7: ( INNUMBER ^ NUMBER )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:208:9: INNUMBER ^ NUMBER
            {
            root_0 = (CommonTree)adaptor.nil();


            INNUMBER250=(Token)match(input,INNUMBER,FOLLOW_INNUMBER_in_instmt1967); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INNUMBER250_tree = 
            (CommonTree)adaptor.create(INNUMBER250)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(INNUMBER250_tree, root_0);
            }

            NUMBER251=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_instmt1970); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NUMBER251_tree = 
            (CommonTree)adaptor.create(NUMBER251)
            ;
            adaptor.addChild(root_0, NUMBER251_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:1: storestmt : STORE vardecl ;
    public final jvmBasicParser.storestmt_return storestmt() throws RecognitionException {
        jvmBasicParser.storestmt_return retval = new jvmBasicParser.storestmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STORE252=null;
        jvmBasicParser.vardecl_return vardecl253 =null;


        CommonTree STORE252_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:10: ( STORE vardecl )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:209:12: STORE vardecl
            {
            root_0 = (CommonTree)adaptor.nil();


            STORE252=(Token)match(input,STORE,FOLLOW_STORE_in_storestmt1976); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STORE252_tree = 
            (CommonTree)adaptor.create(STORE252)
            ;
            adaptor.addChild(root_0, STORE252_tree);
            }

            pushFollow(FOLLOW_vardecl_in_storestmt1978);
            vardecl253=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl253.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:210:1: recallstmt : RECALL vardecl ;
    public final jvmBasicParser.recallstmt_return recallstmt() throws RecognitionException {
        jvmBasicParser.recallstmt_return retval = new jvmBasicParser.recallstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RECALL254=null;
        jvmBasicParser.vardecl_return vardecl255 =null;


        CommonTree RECALL254_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:210:11: ( RECALL vardecl )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:210:13: RECALL vardecl
            {
            root_0 = (CommonTree)adaptor.nil();


            RECALL254=(Token)match(input,RECALL,FOLLOW_RECALL_in_recallstmt1984); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RECALL254_tree = 
            (CommonTree)adaptor.create(RECALL254)
            ;
            adaptor.addChild(root_0, RECALL254_tree);
            }

            pushFollow(FOLLOW_vardecl_in_recallstmt1986);
            vardecl255=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl255.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:1: liststmt : LIST ^ ( expression )? ;
    public final jvmBasicParser.liststmt_return liststmt() throws RecognitionException {
        jvmBasicParser.liststmt_return retval = new jvmBasicParser.liststmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LIST256=null;
        jvmBasicParser.expression_return expression257 =null;


        CommonTree LIST256_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:9: ( LIST ^ ( expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:11: LIST ^ ( expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            LIST256=(Token)match(input,LIST,FOLLOW_LIST_in_liststmt1992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LIST256_tree = 
            (CommonTree)adaptor.create(LIST256)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LIST256_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:17: ( expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:211:17: expression
                    {
                    pushFollow(FOLLOW_expression_in_liststmt1995);
                    expression257=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression257.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:1: popstmt : POP ^ ( expression COMMA expression )? ;
    public final jvmBasicParser.popstmt_return popstmt() throws RecognitionException {
        jvmBasicParser.popstmt_return retval = new jvmBasicParser.popstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POP258=null;
        Token COMMA260=null;
        jvmBasicParser.expression_return expression259 =null;

        jvmBasicParser.expression_return expression261 =null;


        CommonTree POP258_tree=null;
        CommonTree COMMA260_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:9: ( POP ^ ( expression COMMA expression )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:11: POP ^ ( expression COMMA expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            POP258=(Token)match(input,POP,FOLLOW_POP_in_popstmt2003); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POP258_tree = 
            (CommonTree)adaptor.create(POP258)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(POP258_tree, root_0);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:16: ( expression COMMA expression )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:212:17: expression COMMA expression
                    {
                    pushFollow(FOLLOW_expression_in_popstmt2007);
                    expression259=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression259.getTree());

                    COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_popstmt2009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COMMA260_tree = 
                    (CommonTree)adaptor.create(COMMA260)
                    ;
                    adaptor.addChild(root_0, COMMA260_tree);
                    }

                    pushFollow(FOLLOW_expression_in_popstmt2011);
                    expression261=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression261.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:1: amptstmt : AMPERSAND ^ expression ;
    public final jvmBasicParser.amptstmt_return amptstmt() throws RecognitionException {
        jvmBasicParser.amptstmt_return retval = new jvmBasicParser.amptstmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token AMPERSAND262=null;
        jvmBasicParser.expression_return expression263 =null;


        CommonTree AMPERSAND262_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:9: ( AMPERSAND ^ expression )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:213:11: AMPERSAND ^ expression
            {
            root_0 = (CommonTree)adaptor.nil();


            AMPERSAND262=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_amptstmt2019); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AMPERSAND262_tree = 
            (CommonTree)adaptor.create(AMPERSAND262)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(AMPERSAND262_tree, root_0);
            }

            pushFollow(FOLLOW_expression_in_amptstmt2022);
            expression263=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression263.getTree());

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


    public static class func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:1: func : ( vardecl | stringliteral | NUMBER | FLOAT | chrfunc | sqrfunc | lenfunc | strfunc | ascfunc | scrnfunc | midfunc | pdlfunc | peekfunc | intfunc | spcfunc | frefunc | posfunc | usrfunc | leftfunc | valfunc | rightfunc | fnfunc | sinfunc | cosfunc | tanfunc | atnfunc | rndfunc | sgnfunc | expfunc | logfunc | absfunc | ( LPAREN expression RPAREN ) );
    public final jvmBasicParser.func_return func() throws RecognitionException {
        jvmBasicParser.func_return retval = new jvmBasicParser.func_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NUMBER266=null;
        Token FLOAT267=null;
        Token LPAREN295=null;
        Token RPAREN297=null;
        jvmBasicParser.vardecl_return vardecl264 =null;

        jvmBasicParser.stringliteral_return stringliteral265 =null;

        jvmBasicParser.chrfunc_return chrfunc268 =null;

        jvmBasicParser.sqrfunc_return sqrfunc269 =null;

        jvmBasicParser.lenfunc_return lenfunc270 =null;

        jvmBasicParser.strfunc_return strfunc271 =null;

        jvmBasicParser.ascfunc_return ascfunc272 =null;

        jvmBasicParser.scrnfunc_return scrnfunc273 =null;

        jvmBasicParser.midfunc_return midfunc274 =null;

        jvmBasicParser.pdlfunc_return pdlfunc275 =null;

        jvmBasicParser.peekfunc_return peekfunc276 =null;

        jvmBasicParser.intfunc_return intfunc277 =null;

        jvmBasicParser.spcfunc_return spcfunc278 =null;

        jvmBasicParser.frefunc_return frefunc279 =null;

        jvmBasicParser.posfunc_return posfunc280 =null;

        jvmBasicParser.usrfunc_return usrfunc281 =null;

        jvmBasicParser.leftfunc_return leftfunc282 =null;

        jvmBasicParser.valfunc_return valfunc283 =null;

        jvmBasicParser.rightfunc_return rightfunc284 =null;

        jvmBasicParser.fnfunc_return fnfunc285 =null;

        jvmBasicParser.sinfunc_return sinfunc286 =null;

        jvmBasicParser.cosfunc_return cosfunc287 =null;

        jvmBasicParser.tanfunc_return tanfunc288 =null;

        jvmBasicParser.atnfunc_return atnfunc289 =null;

        jvmBasicParser.rndfunc_return rndfunc290 =null;

        jvmBasicParser.sgnfunc_return sgnfunc291 =null;

        jvmBasicParser.expfunc_return expfunc292 =null;

        jvmBasicParser.logfunc_return logfunc293 =null;

        jvmBasicParser.absfunc_return absfunc294 =null;

        jvmBasicParser.expression_return expression296 =null;


        CommonTree NUMBER266_tree=null;
        CommonTree FLOAT267_tree=null;
        CommonTree LPAREN295_tree=null;
        CommonTree RPAREN297_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:6: ( vardecl | stringliteral | NUMBER | FLOAT | chrfunc | sqrfunc | lenfunc | strfunc | ascfunc | scrnfunc | midfunc | pdlfunc | peekfunc | intfunc | spcfunc | frefunc | posfunc | usrfunc | leftfunc | valfunc | rightfunc | fnfunc | sinfunc | cosfunc | tanfunc | atnfunc | rndfunc | sgnfunc | expfunc | logfunc | absfunc | ( LPAREN expression RPAREN ) )
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:8: vardecl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_vardecl_in_func2033);
                    vardecl264=vardecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl264.getTree());

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:18: stringliteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stringliteral_in_func2037);
                    stringliteral265=stringliteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, stringliteral265.getTree());

                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:34: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER266=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_func2041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER266_tree = 
                    (CommonTree)adaptor.create(NUMBER266)
                    ;
                    adaptor.addChild(root_0, NUMBER266_tree);
                    }

                    }
                    break;
                case 4 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:43: FLOAT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FLOAT267=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_func2045); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT267_tree = 
                    (CommonTree)adaptor.create(FLOAT267)
                    ;
                    adaptor.addChild(root_0, FLOAT267_tree);
                    }

                    }
                    break;
                case 5 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:51: chrfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_chrfunc_in_func2049);
                    chrfunc268=chrfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, chrfunc268.getTree());

                    }
                    break;
                case 6 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:61: sqrfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sqrfunc_in_func2053);
                    sqrfunc269=sqrfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sqrfunc269.getTree());

                    }
                    break;
                case 7 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:71: lenfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lenfunc_in_func2057);
                    lenfunc270=lenfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lenfunc270.getTree());

                    }
                    break;
                case 8 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:81: strfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_strfunc_in_func2061);
                    strfunc271=strfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, strfunc271.getTree());

                    }
                    break;
                case 9 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:91: ascfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ascfunc_in_func2065);
                    ascfunc272=ascfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ascfunc272.getTree());

                    }
                    break;
                case 10 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:100: scrnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_scrnfunc_in_func2068);
                    scrnfunc273=scrnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scrnfunc273.getTree());

                    }
                    break;
                case 11 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:112: midfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_midfunc_in_func2073);
                    midfunc274=midfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, midfunc274.getTree());

                    }
                    break;
                case 12 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:122: pdlfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_pdlfunc_in_func2077);
                    pdlfunc275=pdlfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pdlfunc275.getTree());

                    }
                    break;
                case 13 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:132: peekfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_peekfunc_in_func2081);
                    peekfunc276=peekfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, peekfunc276.getTree());

                    }
                    break;
                case 14 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:143: intfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_intfunc_in_func2085);
                    intfunc277=intfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, intfunc277.getTree());

                    }
                    break;
                case 15 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:153: spcfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_spcfunc_in_func2089);
                    spcfunc278=spcfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, spcfunc278.getTree());

                    }
                    break;
                case 16 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:163: frefunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_frefunc_in_func2093);
                    frefunc279=frefunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, frefunc279.getTree());

                    }
                    break;
                case 17 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:173: posfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_posfunc_in_func2097);
                    posfunc280=posfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, posfunc280.getTree());

                    }
                    break;
                case 18 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:183: usrfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_usrfunc_in_func2101);
                    usrfunc281=usrfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usrfunc281.getTree());

                    }
                    break;
                case 19 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:192: leftfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_leftfunc_in_func2104);
                    leftfunc282=leftfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, leftfunc282.getTree());

                    }
                    break;
                case 20 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:203: valfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_valfunc_in_func2108);
                    valfunc283=valfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, valfunc283.getTree());

                    }
                    break;
                case 21 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:213: rightfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rightfunc_in_func2112);
                    rightfunc284=rightfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rightfunc284.getTree());

                    }
                    break;
                case 22 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:223: fnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_fnfunc_in_func2114);
                    fnfunc285=fnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fnfunc285.getTree());

                    }
                    break;
                case 23 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:230: sinfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sinfunc_in_func2116);
                    sinfunc286=sinfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sinfunc286.getTree());

                    }
                    break;
                case 24 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:240: cosfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_cosfunc_in_func2120);
                    cosfunc287=cosfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cosfunc287.getTree());

                    }
                    break;
                case 25 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:249: tanfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_tanfunc_in_func2123);
                    tanfunc288=tanfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tanfunc288.getTree());

                    }
                    break;
                case 26 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:257: atnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atnfunc_in_func2125);
                    atnfunc289=atnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atnfunc289.getTree());

                    }
                    break;
                case 27 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:265: rndfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_rndfunc_in_func2127);
                    rndfunc290=rndfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rndfunc290.getTree());

                    }
                    break;
                case 28 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:273: sgnfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_sgnfunc_in_func2129);
                    sgnfunc291=sgnfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sgnfunc291.getTree());

                    }
                    break;
                case 29 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:281: expfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expfunc_in_func2131);
                    expfunc292=expfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expfunc292.getTree());

                    }
                    break;
                case 30 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:289: logfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_logfunc_in_func2133);
                    logfunc293=logfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, logfunc293.getTree());

                    }
                    break;
                case 31 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:297: absfunc
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_absfunc_in_func2135);
                    absfunc294=absfunc();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, absfunc294.getTree());

                    }
                    break;
                case 32 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:307: ( LPAREN expression RPAREN )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:307: ( LPAREN expression RPAREN )
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:216:308: LPAREN expression RPAREN
                    {
                    LPAREN295=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_func2140); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN295_tree = 
                    (CommonTree)adaptor.create(LPAREN295)
                    ;
                    adaptor.addChild(root_0, LPAREN295_tree);
                    }

                    pushFollow(FOLLOW_expression_in_func2142);
                    expression296=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression296.getTree());

                    RPAREN297=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_func2144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN297_tree = 
                    (CommonTree)adaptor.create(RPAREN297)
                    ;
                    adaptor.addChild(root_0, RPAREN297_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:1: signExpression : ( NOT )? ( ( PLUS | MINUS ) )* func ;
    public final jvmBasicParser.signExpression_return signExpression() throws RecognitionException {
        jvmBasicParser.signExpression_return retval = new jvmBasicParser.signExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NOT298=null;
        Token set299=null;
        jvmBasicParser.func_return func300 =null;


        CommonTree NOT298_tree=null;
        CommonTree set299_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:16: ( ( NOT )? ( ( PLUS | MINUS ) )* func )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:18: ( NOT )? ( ( PLUS | MINUS ) )* func
            {
            root_0 = (CommonTree)adaptor.nil();


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:18: ( NOT )?
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
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:18: NOT
                    {
                    NOT298=(Token)match(input,NOT,FOLLOW_NOT_in_signExpression2152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT298_tree = 
                    (CommonTree)adaptor.create(NOT298)
                    ;
                    adaptor.addChild(root_0, NOT298_tree);
                    }

                    }
                    break;

            }


            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:217:23: ( ( PLUS | MINUS ) )*
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
            	    set299=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set299)
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


            pushFollow(FOLLOW_func_in_signExpression2164);
            func300=func();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, func300.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:1: exponentExpression : signExpression ( EXPONENT signExpression )* ;
    public final jvmBasicParser.exponentExpression_return exponentExpression() throws RecognitionException {
        jvmBasicParser.exponentExpression_return retval = new jvmBasicParser.exponentExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EXPONENT302=null;
        jvmBasicParser.signExpression_return signExpression301 =null;

        jvmBasicParser.signExpression_return signExpression303 =null;


        CommonTree EXPONENT302_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:20: ( signExpression ( EXPONENT signExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:22: signExpression ( EXPONENT signExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_signExpression_in_exponentExpression2171);
            signExpression301=signExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, signExpression301.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:37: ( EXPONENT signExpression )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:218:38: EXPONENT signExpression
            	    {
            	    EXPONENT302=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_exponentExpression2174); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EXPONENT302_tree = 
            	    (CommonTree)adaptor.create(EXPONENT302)
            	    ;
            	    adaptor.addChild(root_0, EXPONENT302_tree);
            	    }

            	    pushFollow(FOLLOW_signExpression_in_exponentExpression2176);
            	    signExpression303=signExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, signExpression303.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:1: multiplyingExpression : exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )* ;
    public final jvmBasicParser.multiplyingExpression_return multiplyingExpression() throws RecognitionException {
        jvmBasicParser.multiplyingExpression_return retval = new jvmBasicParser.multiplyingExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set305=null;
        jvmBasicParser.exponentExpression_return exponentExpression304 =null;

        jvmBasicParser.exponentExpression_return exponentExpression306 =null;


        CommonTree set305_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:24: ( exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:26: exponentExpression ( ( TIMES | DIV ) ^ exponentExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_exponentExpression_in_multiplyingExpression2186);
            exponentExpression304=exponentExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentExpression304.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:45: ( ( TIMES | DIV ) ^ exponentExpression )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:219:46: ( TIMES | DIV ) ^ exponentExpression
            	    {
            	    set305=(Token)input.LT(1);

            	    set305=(Token)input.LT(1);

            	    if ( input.LA(1)==DIV||input.LA(1)==TIMES ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set305)
            	        , root_0);
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_exponentExpression_in_multiplyingExpression2196);
            	    exponentExpression306=exponentExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentExpression306.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:1: addingExpression : multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )* ;
    public final jvmBasicParser.addingExpression_return addingExpression() throws RecognitionException {
        jvmBasicParser.addingExpression_return retval = new jvmBasicParser.addingExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set308=null;
        jvmBasicParser.multiplyingExpression_return multiplyingExpression307 =null;

        jvmBasicParser.multiplyingExpression_return multiplyingExpression309 =null;


        CommonTree set308_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:18: ( multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:20: multiplyingExpression ( ( PLUS | MINUS ) ^ multiplyingExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplyingExpression_in_addingExpression2205);
            multiplyingExpression307=multiplyingExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyingExpression307.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:42: ( ( PLUS | MINUS ) ^ multiplyingExpression )*
            loop37:
            do {
                int alt37=2;
                switch ( input.LA(1) ) {
                case MINUS:
                case PLUS:
                    {
                    int LA37_1 = input.LA(2);

                    if ( (synpred141_jvmBasic()) ) {
                        alt37=1;
                    }


                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:43: ( PLUS | MINUS ) ^ multiplyingExpression
            	    {
            	    set308=(Token)input.LT(1);

            	    set308=(Token)input.LT(1);

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
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


            	    pushFollow(FOLLOW_multiplyingExpression_in_addingExpression2215);
            	    multiplyingExpression309=multiplyingExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplyingExpression309.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:1: relationalExpression : addingExpression ( ( relop ^) addingExpression )* ;
    public final jvmBasicParser.relationalExpression_return relationalExpression() throws RecognitionException {
        jvmBasicParser.relationalExpression_return retval = new jvmBasicParser.relationalExpression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.addingExpression_return addingExpression310 =null;

        jvmBasicParser.relop_return relop311 =null;

        jvmBasicParser.addingExpression_return addingExpression312 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:23: ( addingExpression ( ( relop ^) addingExpression )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:25: addingExpression ( ( relop ^) addingExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_addingExpression_in_relationalExpression2225);
            addingExpression310=addingExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addingExpression310.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:42: ( ( relop ^) addingExpression )*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:43: ( relop ^) addingExpression
            	    {
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:43: ( relop ^)
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:221:44: relop ^
            	    {
            	    pushFollow(FOLLOW_relop_in_relationalExpression2229);
            	    relop311=relop();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(relop311.getTree(), root_0);

            	    }


            	    pushFollow(FOLLOW_addingExpression_in_relationalExpression2233);
            	    addingExpression312=addingExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addingExpression312.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:1: expression : relationalExpression ( ( AND | OR ) relationalExpression ^)* ;
    public final jvmBasicParser.expression_return expression() throws RecognitionException {
        jvmBasicParser.expression_return retval = new jvmBasicParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set314=null;
        jvmBasicParser.relationalExpression_return relationalExpression313 =null;

        jvmBasicParser.relationalExpression_return relationalExpression315 =null;


        CommonTree set314_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:11: ( relationalExpression ( ( AND | OR ) relationalExpression ^)* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:13: relationalExpression ( ( AND | OR ) relationalExpression ^)*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_expression2241);
            relationalExpression313=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression313.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:34: ( ( AND | OR ) relationalExpression ^)*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:222:35: ( AND | OR ) relationalExpression ^
            	    {
            	    set314=(Token)input.LT(1);

            	    if ( input.LA(1)==AND||input.LA(1)==OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set314)
            	        );
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_expression2250);
            	    relationalExpression315=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(relationalExpression315.getTree(), root_0);

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:1: var : varname ^ ( varsuffix )? ;
    public final jvmBasicParser.var_return var() throws RecognitionException {
        jvmBasicParser.var_return retval = new jvmBasicParser.var_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        jvmBasicParser.varname_return varname316 =null;

        jvmBasicParser.varsuffix_return varsuffix317 =null;



        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:4: ( varname ^ ( varsuffix )? )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:6: varname ^ ( varsuffix )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_varname_in_var2261);
            varname316=varname();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(varname316.getTree(), root_0);

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:15: ( varsuffix )?
            int alt40=2;
            switch ( input.LA(1) ) {
                case 124:
                case 125:
                    {
                    alt40=1;
                    }
                    break;
            }

            switch (alt40) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:225:15: varsuffix
                    {
                    pushFollow(FOLLOW_varsuffix_in_var2264);
                    varsuffix317=varsuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varsuffix317.getTree());

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:226:1: varname : LETTERS ( LETTERS | DIGIT )* ;
    public final jvmBasicParser.varname_return varname() throws RecognitionException {
        jvmBasicParser.varname_return retval = new jvmBasicParser.varname_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LETTERS318=null;
        Token set319=null;

        CommonTree LETTERS318_tree=null;
        CommonTree set319_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:226:9: ( LETTERS ( LETTERS | DIGIT )* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:226:11: LETTERS ( LETTERS | DIGIT )*
            {
            root_0 = (CommonTree)adaptor.nil();


            LETTERS318=(Token)match(input,LETTERS,FOLLOW_LETTERS_in_varname2272); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LETTERS318_tree = 
            (CommonTree)adaptor.create(LETTERS318)
            ;
            adaptor.addChild(root_0, LETTERS318_tree);
            }

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:226:19: ( LETTERS | DIGIT )*
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
            	    set319=(Token)input.LT(1);

            	    if ( input.LA(1)==DIGIT||input.LA(1)==LETTERS ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (CommonTree)adaptor.create(set319)
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:1: varsuffix : ( '$' | '%' ) ;
    public final jvmBasicParser.varsuffix_return varsuffix() throws RecognitionException {
        jvmBasicParser.varsuffix_return retval = new jvmBasicParser.varsuffix_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set320=null;

        CommonTree set320_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:227:10: ( ( '$' | '%' ) )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set320=(Token)input.LT(1);

            if ( (input.LA(1) >= 124 && input.LA(1) <= 125) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set320)
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:1: varlist : vardecl ( COMMA ! vardecl ^)* ;
    public final jvmBasicParser.varlist_return varlist() throws RecognitionException {
        jvmBasicParser.varlist_return retval = new jvmBasicParser.varlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA322=null;
        jvmBasicParser.vardecl_return vardecl321 =null;

        jvmBasicParser.vardecl_return vardecl323 =null;


        CommonTree COMMA322_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:9: ( vardecl ( COMMA ! vardecl ^)* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:11: vardecl ( COMMA ! vardecl ^)*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_vardecl_in_varlist2300);
            vardecl321=vardecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, vardecl321.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:19: ( COMMA ! vardecl ^)*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:228:20: COMMA ! vardecl ^
            	    {
            	    COMMA322=(Token)match(input,COMMA,FOLLOW_COMMA_in_varlist2303); if (state.failed) return retval;

            	    pushFollow(FOLLOW_vardecl_in_varlist2306);
            	    vardecl323=vardecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(vardecl323.getTree(), root_0);

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:1: exprlist : expression ( COMMA ! expression ^)* ;
    public final jvmBasicParser.exprlist_return exprlist() throws RecognitionException {
        jvmBasicParser.exprlist_return retval = new jvmBasicParser.exprlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA325=null;
        jvmBasicParser.expression_return expression324 =null;

        jvmBasicParser.expression_return expression326 =null;


        CommonTree COMMA325_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:10: ( expression ( COMMA ! expression ^)* )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:12: expression ( COMMA ! expression ^)*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_exprlist2316);
            expression324=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression324.getTree());

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:23: ( COMMA ! expression ^)*
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
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:229:24: COMMA ! expression ^
            	    {
            	    COMMA325=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprlist2319); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_exprlist2322);
            	    expression326=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(expression326.getTree(), root_0);

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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:232:10: fragment stringliteral : STRINGLITERAL ;
    public final jvmBasicParser.stringliteral_return stringliteral() throws RecognitionException {
        jvmBasicParser.stringliteral_return retval = new jvmBasicParser.stringliteral_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRINGLITERAL327=null;

        CommonTree STRINGLITERAL327_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:232:23: ( STRINGLITERAL )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:232:25: STRINGLITERAL
            {
            root_0 = (CommonTree)adaptor.nil();


            STRINGLITERAL327=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_stringliteral2335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRINGLITERAL327_tree = 
            (CommonTree)adaptor.create(STRINGLITERAL327)
            ;
            adaptor.addChild(root_0, STRINGLITERAL327_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:236:1: sqrfunc : SQR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.sqrfunc_return sqrfunc() throws RecognitionException {
        jvmBasicParser.sqrfunc_return retval = new jvmBasicParser.sqrfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SQR328=null;
        Token LPAREN329=null;
        Token RPAREN331=null;
        jvmBasicParser.expression_return expression330 =null;


        CommonTree SQR328_tree=null;
        CommonTree LPAREN329_tree=null;
        CommonTree RPAREN331_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:236:9: ( SQR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:236:11: SQR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SQR328=(Token)match(input,SQR,FOLLOW_SQR_in_sqrfunc2345); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SQR328_tree = 
            (CommonTree)adaptor.create(SQR328)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SQR328_tree, root_0);
            }

            LPAREN329=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sqrfunc2348); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN329_tree = 
            (CommonTree)adaptor.create(LPAREN329)
            ;
            adaptor.addChild(root_0, LPAREN329_tree);
            }

            pushFollow(FOLLOW_expression_in_sqrfunc2350);
            expression330=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression330.getTree());

            RPAREN331=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sqrfunc2352); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN331_tree = 
            (CommonTree)adaptor.create(RPAREN331)
            ;
            adaptor.addChild(root_0, RPAREN331_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:237:1: chrfunc : CHR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.chrfunc_return chrfunc() throws RecognitionException {
        jvmBasicParser.chrfunc_return retval = new jvmBasicParser.chrfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token CHR332=null;
        Token LPAREN333=null;
        Token RPAREN335=null;
        jvmBasicParser.expression_return expression334 =null;


        CommonTree CHR332_tree=null;
        CommonTree LPAREN333_tree=null;
        CommonTree RPAREN335_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:237:9: ( CHR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:237:11: CHR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            CHR332=(Token)match(input,CHR,FOLLOW_CHR_in_chrfunc2359); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CHR332_tree = 
            (CommonTree)adaptor.create(CHR332)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(CHR332_tree, root_0);
            }

            LPAREN333=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_chrfunc2362); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN333_tree = 
            (CommonTree)adaptor.create(LPAREN333)
            ;
            adaptor.addChild(root_0, LPAREN333_tree);
            }

            pushFollow(FOLLOW_expression_in_chrfunc2364);
            expression334=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression334.getTree());

            RPAREN335=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_chrfunc2366); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN335_tree = 
            (CommonTree)adaptor.create(RPAREN335)
            ;
            adaptor.addChild(root_0, RPAREN335_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:1: lenfunc : LEN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.lenfunc_return lenfunc() throws RecognitionException {
        jvmBasicParser.lenfunc_return retval = new jvmBasicParser.lenfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LEN336=null;
        Token LPAREN337=null;
        Token RPAREN339=null;
        jvmBasicParser.expression_return expression338 =null;


        CommonTree LEN336_tree=null;
        CommonTree LPAREN337_tree=null;
        CommonTree RPAREN339_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:9: ( LEN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:238:11: LEN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            LEN336=(Token)match(input,LEN,FOLLOW_LEN_in_lenfunc2373); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEN336_tree = 
            (CommonTree)adaptor.create(LEN336)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LEN336_tree, root_0);
            }

            LPAREN337=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lenfunc2376); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN337_tree = 
            (CommonTree)adaptor.create(LPAREN337)
            ;
            adaptor.addChild(root_0, LPAREN337_tree);
            }

            pushFollow(FOLLOW_expression_in_lenfunc2378);
            expression338=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression338.getTree());

            RPAREN339=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lenfunc2380); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN339_tree = 
            (CommonTree)adaptor.create(RPAREN339)
            ;
            adaptor.addChild(root_0, RPAREN339_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:1: ascfunc : ASC ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.ascfunc_return ascfunc() throws RecognitionException {
        jvmBasicParser.ascfunc_return retval = new jvmBasicParser.ascfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASC340=null;
        Token LPAREN341=null;
        Token RPAREN343=null;
        jvmBasicParser.expression_return expression342 =null;


        CommonTree ASC340_tree=null;
        CommonTree LPAREN341_tree=null;
        CommonTree RPAREN343_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:9: ( ASC ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:239:11: ASC ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            ASC340=(Token)match(input,ASC,FOLLOW_ASC_in_ascfunc2387); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ASC340_tree = 
            (CommonTree)adaptor.create(ASC340)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ASC340_tree, root_0);
            }

            LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ascfunc2390); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN341_tree = 
            (CommonTree)adaptor.create(LPAREN341)
            ;
            adaptor.addChild(root_0, LPAREN341_tree);
            }

            pushFollow(FOLLOW_expression_in_ascfunc2392);
            expression342=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression342.getTree());

            RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ascfunc2394); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN343_tree = 
            (CommonTree)adaptor.create(RPAREN343)
            ;
            adaptor.addChild(root_0, RPAREN343_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:1: midfunc : MID ^ LPAREN expression COMMA expression COMMA expression RPAREN ;
    public final jvmBasicParser.midfunc_return midfunc() throws RecognitionException {
        jvmBasicParser.midfunc_return retval = new jvmBasicParser.midfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MID344=null;
        Token LPAREN345=null;
        Token COMMA347=null;
        Token COMMA349=null;
        Token RPAREN351=null;
        jvmBasicParser.expression_return expression346 =null;

        jvmBasicParser.expression_return expression348 =null;

        jvmBasicParser.expression_return expression350 =null;


        CommonTree MID344_tree=null;
        CommonTree LPAREN345_tree=null;
        CommonTree COMMA347_tree=null;
        CommonTree COMMA349_tree=null;
        CommonTree RPAREN351_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:9: ( MID ^ LPAREN expression COMMA expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:240:11: MID ^ LPAREN expression COMMA expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            MID344=(Token)match(input,MID,FOLLOW_MID_in_midfunc2402); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MID344_tree = 
            (CommonTree)adaptor.create(MID344)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(MID344_tree, root_0);
            }

            LPAREN345=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_midfunc2405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN345_tree = 
            (CommonTree)adaptor.create(LPAREN345)
            ;
            adaptor.addChild(root_0, LPAREN345_tree);
            }

            pushFollow(FOLLOW_expression_in_midfunc2407);
            expression346=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression346.getTree());

            COMMA347=(Token)match(input,COMMA,FOLLOW_COMMA_in_midfunc2409); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA347_tree = 
            (CommonTree)adaptor.create(COMMA347)
            ;
            adaptor.addChild(root_0, COMMA347_tree);
            }

            pushFollow(FOLLOW_expression_in_midfunc2411);
            expression348=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression348.getTree());

            COMMA349=(Token)match(input,COMMA,FOLLOW_COMMA_in_midfunc2413); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA349_tree = 
            (CommonTree)adaptor.create(COMMA349)
            ;
            adaptor.addChild(root_0, COMMA349_tree);
            }

            pushFollow(FOLLOW_expression_in_midfunc2415);
            expression350=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression350.getTree());

            RPAREN351=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_midfunc2417); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN351_tree = 
            (CommonTree)adaptor.create(RPAREN351)
            ;
            adaptor.addChild(root_0, RPAREN351_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:1: pdlfunc : PDL ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.pdlfunc_return pdlfunc() throws RecognitionException {
        jvmBasicParser.pdlfunc_return retval = new jvmBasicParser.pdlfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PDL352=null;
        Token LPAREN353=null;
        Token RPAREN355=null;
        jvmBasicParser.expression_return expression354 =null;


        CommonTree PDL352_tree=null;
        CommonTree LPAREN353_tree=null;
        CommonTree RPAREN355_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:9: ( PDL ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:241:11: PDL ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            PDL352=(Token)match(input,PDL,FOLLOW_PDL_in_pdlfunc2424); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PDL352_tree = 
            (CommonTree)adaptor.create(PDL352)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PDL352_tree, root_0);
            }

            LPAREN353=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_pdlfunc2427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN353_tree = 
            (CommonTree)adaptor.create(LPAREN353)
            ;
            adaptor.addChild(root_0, LPAREN353_tree);
            }

            pushFollow(FOLLOW_expression_in_pdlfunc2429);
            expression354=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression354.getTree());

            RPAREN355=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_pdlfunc2431); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN355_tree = 
            (CommonTree)adaptor.create(RPAREN355)
            ;
            adaptor.addChild(root_0, RPAREN355_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:1: peekfunc : PEEK ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.peekfunc_return peekfunc() throws RecognitionException {
        jvmBasicParser.peekfunc_return retval = new jvmBasicParser.peekfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PEEK356=null;
        Token LPAREN357=null;
        Token RPAREN359=null;
        jvmBasicParser.expression_return expression358 =null;


        CommonTree PEEK356_tree=null;
        CommonTree LPAREN357_tree=null;
        CommonTree RPAREN359_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:9: ( PEEK ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:242:11: PEEK ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            PEEK356=(Token)match(input,PEEK,FOLLOW_PEEK_in_peekfunc2437); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PEEK356_tree = 
            (CommonTree)adaptor.create(PEEK356)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(PEEK356_tree, root_0);
            }

            LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_peekfunc2440); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN357_tree = 
            (CommonTree)adaptor.create(LPAREN357)
            ;
            adaptor.addChild(root_0, LPAREN357_tree);
            }

            pushFollow(FOLLOW_expression_in_peekfunc2442);
            expression358=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression358.getTree());

            RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_peekfunc2444); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN359_tree = 
            (CommonTree)adaptor.create(RPAREN359)
            ;
            adaptor.addChild(root_0, RPAREN359_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:243:1: intfunc : INTF ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.intfunc_return intfunc() throws RecognitionException {
        jvmBasicParser.intfunc_return retval = new jvmBasicParser.intfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INTF360=null;
        Token LPAREN361=null;
        Token RPAREN363=null;
        jvmBasicParser.expression_return expression362 =null;


        CommonTree INTF360_tree=null;
        CommonTree LPAREN361_tree=null;
        CommonTree RPAREN363_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:243:9: ( INTF ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:243:11: INTF ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            INTF360=(Token)match(input,INTF,FOLLOW_INTF_in_intfunc2451); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTF360_tree = 
            (CommonTree)adaptor.create(INTF360)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(INTF360_tree, root_0);
            }

            LPAREN361=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_intfunc2454); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN361_tree = 
            (CommonTree)adaptor.create(LPAREN361)
            ;
            adaptor.addChild(root_0, LPAREN361_tree);
            }

            pushFollow(FOLLOW_expression_in_intfunc2456);
            expression362=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression362.getTree());

            RPAREN363=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_intfunc2458); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN363_tree = 
            (CommonTree)adaptor.create(RPAREN363)
            ;
            adaptor.addChild(root_0, RPAREN363_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:244:1: spcfunc : SPC ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.spcfunc_return spcfunc() throws RecognitionException {
        jvmBasicParser.spcfunc_return retval = new jvmBasicParser.spcfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SPC364=null;
        Token LPAREN365=null;
        Token RPAREN367=null;
        jvmBasicParser.expression_return expression366 =null;


        CommonTree SPC364_tree=null;
        CommonTree LPAREN365_tree=null;
        CommonTree RPAREN367_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:244:8: ( SPC ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:244:11: SPC ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SPC364=(Token)match(input,SPC,FOLLOW_SPC_in_spcfunc2465); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SPC364_tree = 
            (CommonTree)adaptor.create(SPC364)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SPC364_tree, root_0);
            }

            LPAREN365=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_spcfunc2468); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN365_tree = 
            (CommonTree)adaptor.create(LPAREN365)
            ;
            adaptor.addChild(root_0, LPAREN365_tree);
            }

            pushFollow(FOLLOW_expression_in_spcfunc2470);
            expression366=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression366.getTree());

            RPAREN367=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_spcfunc2472); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN367_tree = 
            (CommonTree)adaptor.create(RPAREN367)
            ;
            adaptor.addChild(root_0, RPAREN367_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:245:1: frefunc : FRE ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.frefunc_return frefunc() throws RecognitionException {
        jvmBasicParser.frefunc_return retval = new jvmBasicParser.frefunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FRE368=null;
        Token LPAREN369=null;
        Token RPAREN371=null;
        jvmBasicParser.expression_return expression370 =null;


        CommonTree FRE368_tree=null;
        CommonTree LPAREN369_tree=null;
        CommonTree RPAREN371_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:245:9: ( FRE ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:245:11: FRE ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            FRE368=(Token)match(input,FRE,FOLLOW_FRE_in_frefunc2479); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FRE368_tree = 
            (CommonTree)adaptor.create(FRE368)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FRE368_tree, root_0);
            }

            LPAREN369=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_frefunc2482); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN369_tree = 
            (CommonTree)adaptor.create(LPAREN369)
            ;
            adaptor.addChild(root_0, LPAREN369_tree);
            }

            pushFollow(FOLLOW_expression_in_frefunc2484);
            expression370=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression370.getTree());

            RPAREN371=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_frefunc2486); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN371_tree = 
            (CommonTree)adaptor.create(RPAREN371)
            ;
            adaptor.addChild(root_0, RPAREN371_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:246:1: posfunc : POS ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.posfunc_return posfunc() throws RecognitionException {
        jvmBasicParser.posfunc_return retval = new jvmBasicParser.posfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token POS372=null;
        Token LPAREN373=null;
        Token RPAREN375=null;
        jvmBasicParser.expression_return expression374 =null;


        CommonTree POS372_tree=null;
        CommonTree LPAREN373_tree=null;
        CommonTree RPAREN375_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:246:8: ( POS ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:246:11: POS ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            POS372=(Token)match(input,POS,FOLLOW_POS_in_posfunc2493); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POS372_tree = 
            (CommonTree)adaptor.create(POS372)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(POS372_tree, root_0);
            }

            LPAREN373=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_posfunc2496); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN373_tree = 
            (CommonTree)adaptor.create(LPAREN373)
            ;
            adaptor.addChild(root_0, LPAREN373_tree);
            }

            pushFollow(FOLLOW_expression_in_posfunc2498);
            expression374=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression374.getTree());

            RPAREN375=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_posfunc2500); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN375_tree = 
            (CommonTree)adaptor.create(RPAREN375)
            ;
            adaptor.addChild(root_0, RPAREN375_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:247:1: usrfunc : USR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.usrfunc_return usrfunc() throws RecognitionException {
        jvmBasicParser.usrfunc_return retval = new jvmBasicParser.usrfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token USR376=null;
        Token LPAREN377=null;
        Token RPAREN379=null;
        jvmBasicParser.expression_return expression378 =null;


        CommonTree USR376_tree=null;
        CommonTree LPAREN377_tree=null;
        CommonTree RPAREN379_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:247:8: ( USR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:247:11: USR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            USR376=(Token)match(input,USR,FOLLOW_USR_in_usrfunc2507); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            USR376_tree = 
            (CommonTree)adaptor.create(USR376)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(USR376_tree, root_0);
            }

            LPAREN377=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_usrfunc2510); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN377_tree = 
            (CommonTree)adaptor.create(LPAREN377)
            ;
            adaptor.addChild(root_0, LPAREN377_tree);
            }

            pushFollow(FOLLOW_expression_in_usrfunc2512);
            expression378=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression378.getTree());

            RPAREN379=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_usrfunc2514); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN379_tree = 
            (CommonTree)adaptor.create(RPAREN379)
            ;
            adaptor.addChild(root_0, RPAREN379_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:248:1: leftfunc : LEFT ^ LPAREN expression COMMA expression RPAREN ;
    public final jvmBasicParser.leftfunc_return leftfunc() throws RecognitionException {
        jvmBasicParser.leftfunc_return retval = new jvmBasicParser.leftfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LEFT380=null;
        Token LPAREN381=null;
        Token COMMA383=null;
        Token RPAREN385=null;
        jvmBasicParser.expression_return expression382 =null;

        jvmBasicParser.expression_return expression384 =null;


        CommonTree LEFT380_tree=null;
        CommonTree LPAREN381_tree=null;
        CommonTree COMMA383_tree=null;
        CommonTree RPAREN385_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:248:9: ( LEFT ^ LPAREN expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:248:11: LEFT ^ LPAREN expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            LEFT380=(Token)match(input,LEFT,FOLLOW_LEFT_in_leftfunc2520); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LEFT380_tree = 
            (CommonTree)adaptor.create(LEFT380)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LEFT380_tree, root_0);
            }

            LPAREN381=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_leftfunc2523); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN381_tree = 
            (CommonTree)adaptor.create(LPAREN381)
            ;
            adaptor.addChild(root_0, LPAREN381_tree);
            }

            pushFollow(FOLLOW_expression_in_leftfunc2525);
            expression382=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression382.getTree());

            COMMA383=(Token)match(input,COMMA,FOLLOW_COMMA_in_leftfunc2527); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA383_tree = 
            (CommonTree)adaptor.create(COMMA383)
            ;
            adaptor.addChild(root_0, COMMA383_tree);
            }

            pushFollow(FOLLOW_expression_in_leftfunc2529);
            expression384=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression384.getTree());

            RPAREN385=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_leftfunc2531); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN385_tree = 
            (CommonTree)adaptor.create(RPAREN385)
            ;
            adaptor.addChild(root_0, RPAREN385_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:249:1: rightfunc : RIGHT ^ LPAREN expression COMMA expression RPAREN ;
    public final jvmBasicParser.rightfunc_return rightfunc() throws RecognitionException {
        jvmBasicParser.rightfunc_return retval = new jvmBasicParser.rightfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RIGHT386=null;
        Token LPAREN387=null;
        Token COMMA389=null;
        Token RPAREN391=null;
        jvmBasicParser.expression_return expression388 =null;

        jvmBasicParser.expression_return expression390 =null;


        CommonTree RIGHT386_tree=null;
        CommonTree LPAREN387_tree=null;
        CommonTree COMMA389_tree=null;
        CommonTree RPAREN391_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:249:10: ( RIGHT ^ LPAREN expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:249:12: RIGHT ^ LPAREN expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            RIGHT386=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_rightfunc2537); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RIGHT386_tree = 
            (CommonTree)adaptor.create(RIGHT386)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(RIGHT386_tree, root_0);
            }

            LPAREN387=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rightfunc2540); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN387_tree = 
            (CommonTree)adaptor.create(LPAREN387)
            ;
            adaptor.addChild(root_0, LPAREN387_tree);
            }

            pushFollow(FOLLOW_expression_in_rightfunc2542);
            expression388=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression388.getTree());

            COMMA389=(Token)match(input,COMMA,FOLLOW_COMMA_in_rightfunc2544); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA389_tree = 
            (CommonTree)adaptor.create(COMMA389)
            ;
            adaptor.addChild(root_0, COMMA389_tree);
            }

            pushFollow(FOLLOW_expression_in_rightfunc2546);
            expression390=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression390.getTree());

            RPAREN391=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rightfunc2548); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN391_tree = 
            (CommonTree)adaptor.create(RPAREN391)
            ;
            adaptor.addChild(root_0, RPAREN391_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:250:1: strfunc : STR ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.strfunc_return strfunc() throws RecognitionException {
        jvmBasicParser.strfunc_return retval = new jvmBasicParser.strfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STR392=null;
        Token LPAREN393=null;
        Token RPAREN395=null;
        jvmBasicParser.expression_return expression394 =null;


        CommonTree STR392_tree=null;
        CommonTree LPAREN393_tree=null;
        CommonTree RPAREN395_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:250:9: ( STR ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:250:11: STR ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            STR392=(Token)match(input,STR,FOLLOW_STR_in_strfunc2555); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STR392_tree = 
            (CommonTree)adaptor.create(STR392)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(STR392_tree, root_0);
            }

            LPAREN393=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_strfunc2558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN393_tree = 
            (CommonTree)adaptor.create(LPAREN393)
            ;
            adaptor.addChild(root_0, LPAREN393_tree);
            }

            pushFollow(FOLLOW_expression_in_strfunc2560);
            expression394=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression394.getTree());

            RPAREN395=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_strfunc2562); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN395_tree = 
            (CommonTree)adaptor.create(RPAREN395)
            ;
            adaptor.addChild(root_0, RPAREN395_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:251:1: fnfunc : FN ^ var LPAREN expression RPAREN ;
    public final jvmBasicParser.fnfunc_return fnfunc() throws RecognitionException {
        jvmBasicParser.fnfunc_return retval = new jvmBasicParser.fnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token FN396=null;
        Token LPAREN398=null;
        Token RPAREN400=null;
        jvmBasicParser.var_return var397 =null;

        jvmBasicParser.expression_return expression399 =null;


        CommonTree FN396_tree=null;
        CommonTree LPAREN398_tree=null;
        CommonTree RPAREN400_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:251:7: ( FN ^ var LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:251:9: FN ^ var LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            FN396=(Token)match(input,FN,FOLLOW_FN_in_fnfunc2569); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FN396_tree = 
            (CommonTree)adaptor.create(FN396)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(FN396_tree, root_0);
            }

            pushFollow(FOLLOW_var_in_fnfunc2572);
            var397=var();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, var397.getTree());

            LPAREN398=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_fnfunc2574); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN398_tree = 
            (CommonTree)adaptor.create(LPAREN398)
            ;
            adaptor.addChild(root_0, LPAREN398_tree);
            }

            pushFollow(FOLLOW_expression_in_fnfunc2576);
            expression399=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression399.getTree());

            RPAREN400=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_fnfunc2578); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN400_tree = 
            (CommonTree)adaptor.create(RPAREN400)
            ;
            adaptor.addChild(root_0, RPAREN400_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:252:1: valfunc : VAL ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.valfunc_return valfunc() throws RecognitionException {
        jvmBasicParser.valfunc_return retval = new jvmBasicParser.valfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token VAL401=null;
        Token LPAREN402=null;
        Token RPAREN404=null;
        jvmBasicParser.expression_return expression403 =null;


        CommonTree VAL401_tree=null;
        CommonTree LPAREN402_tree=null;
        CommonTree RPAREN404_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:252:8: ( VAL ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:252:10: VAL ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            VAL401=(Token)match(input,VAL,FOLLOW_VAL_in_valfunc2584); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAL401_tree = 
            (CommonTree)adaptor.create(VAL401)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(VAL401_tree, root_0);
            }

            LPAREN402=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valfunc2587); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN402_tree = 
            (CommonTree)adaptor.create(LPAREN402)
            ;
            adaptor.addChild(root_0, LPAREN402_tree);
            }

            pushFollow(FOLLOW_expression_in_valfunc2589);
            expression403=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression403.getTree());

            RPAREN404=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valfunc2591); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN404_tree = 
            (CommonTree)adaptor.create(RPAREN404)
            ;
            adaptor.addChild(root_0, RPAREN404_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:253:1: scrnfunc : SCRN ^ LPAREN expression COMMA expression RPAREN ;
    public final jvmBasicParser.scrnfunc_return scrnfunc() throws RecognitionException {
        jvmBasicParser.scrnfunc_return retval = new jvmBasicParser.scrnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SCRN405=null;
        Token LPAREN406=null;
        Token COMMA408=null;
        Token RPAREN410=null;
        jvmBasicParser.expression_return expression407 =null;

        jvmBasicParser.expression_return expression409 =null;


        CommonTree SCRN405_tree=null;
        CommonTree LPAREN406_tree=null;
        CommonTree COMMA408_tree=null;
        CommonTree RPAREN410_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:253:9: ( SCRN ^ LPAREN expression COMMA expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:253:11: SCRN ^ LPAREN expression COMMA expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SCRN405=(Token)match(input,SCRN,FOLLOW_SCRN_in_scrnfunc2597); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SCRN405_tree = 
            (CommonTree)adaptor.create(SCRN405)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SCRN405_tree, root_0);
            }

            LPAREN406=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_scrnfunc2600); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN406_tree = 
            (CommonTree)adaptor.create(LPAREN406)
            ;
            adaptor.addChild(root_0, LPAREN406_tree);
            }

            pushFollow(FOLLOW_expression_in_scrnfunc2602);
            expression407=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression407.getTree());

            COMMA408=(Token)match(input,COMMA,FOLLOW_COMMA_in_scrnfunc2604); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COMMA408_tree = 
            (CommonTree)adaptor.create(COMMA408)
            ;
            adaptor.addChild(root_0, COMMA408_tree);
            }

            pushFollow(FOLLOW_expression_in_scrnfunc2606);
            expression409=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression409.getTree());

            RPAREN410=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_scrnfunc2608); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN410_tree = 
            (CommonTree)adaptor.create(RPAREN410)
            ;
            adaptor.addChild(root_0, RPAREN410_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:254:1: sinfunc : SIN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.sinfunc_return sinfunc() throws RecognitionException {
        jvmBasicParser.sinfunc_return retval = new jvmBasicParser.sinfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SIN411=null;
        Token LPAREN412=null;
        Token RPAREN414=null;
        jvmBasicParser.expression_return expression413 =null;


        CommonTree SIN411_tree=null;
        CommonTree LPAREN412_tree=null;
        CommonTree RPAREN414_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:254:9: ( SIN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:254:11: SIN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SIN411=(Token)match(input,SIN,FOLLOW_SIN_in_sinfunc2615); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SIN411_tree = 
            (CommonTree)adaptor.create(SIN411)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SIN411_tree, root_0);
            }

            LPAREN412=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sinfunc2618); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN412_tree = 
            (CommonTree)adaptor.create(LPAREN412)
            ;
            adaptor.addChild(root_0, LPAREN412_tree);
            }

            pushFollow(FOLLOW_expression_in_sinfunc2620);
            expression413=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression413.getTree());

            RPAREN414=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sinfunc2622); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN414_tree = 
            (CommonTree)adaptor.create(RPAREN414)
            ;
            adaptor.addChild(root_0, RPAREN414_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:255:1: cosfunc : COS ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.cosfunc_return cosfunc() throws RecognitionException {
        jvmBasicParser.cosfunc_return retval = new jvmBasicParser.cosfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COS415=null;
        Token LPAREN416=null;
        Token RPAREN418=null;
        jvmBasicParser.expression_return expression417 =null;


        CommonTree COS415_tree=null;
        CommonTree LPAREN416_tree=null;
        CommonTree RPAREN418_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:255:9: ( COS ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:255:11: COS ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            COS415=(Token)match(input,COS,FOLLOW_COS_in_cosfunc2629); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COS415_tree = 
            (CommonTree)adaptor.create(COS415)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(COS415_tree, root_0);
            }

            LPAREN416=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cosfunc2632); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN416_tree = 
            (CommonTree)adaptor.create(LPAREN416)
            ;
            adaptor.addChild(root_0, LPAREN416_tree);
            }

            pushFollow(FOLLOW_expression_in_cosfunc2634);
            expression417=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression417.getTree());

            RPAREN418=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cosfunc2636); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN418_tree = 
            (CommonTree)adaptor.create(RPAREN418)
            ;
            adaptor.addChild(root_0, RPAREN418_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:256:1: tanfunc : TAN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.tanfunc_return tanfunc() throws RecognitionException {
        jvmBasicParser.tanfunc_return retval = new jvmBasicParser.tanfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token TAN419=null;
        Token LPAREN420=null;
        Token RPAREN422=null;
        jvmBasicParser.expression_return expression421 =null;


        CommonTree TAN419_tree=null;
        CommonTree LPAREN420_tree=null;
        CommonTree RPAREN422_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:256:9: ( TAN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:256:11: TAN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            TAN419=(Token)match(input,TAN,FOLLOW_TAN_in_tanfunc2643); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TAN419_tree = 
            (CommonTree)adaptor.create(TAN419)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(TAN419_tree, root_0);
            }

            LPAREN420=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tanfunc2646); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN420_tree = 
            (CommonTree)adaptor.create(LPAREN420)
            ;
            adaptor.addChild(root_0, LPAREN420_tree);
            }

            pushFollow(FOLLOW_expression_in_tanfunc2648);
            expression421=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression421.getTree());

            RPAREN422=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tanfunc2650); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN422_tree = 
            (CommonTree)adaptor.create(RPAREN422)
            ;
            adaptor.addChild(root_0, RPAREN422_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:257:1: atnfunc : ATN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.atnfunc_return atnfunc() throws RecognitionException {
        jvmBasicParser.atnfunc_return retval = new jvmBasicParser.atnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ATN423=null;
        Token LPAREN424=null;
        Token RPAREN426=null;
        jvmBasicParser.expression_return expression425 =null;


        CommonTree ATN423_tree=null;
        CommonTree LPAREN424_tree=null;
        CommonTree RPAREN426_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:257:9: ( ATN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:257:11: ATN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            ATN423=(Token)match(input,ATN,FOLLOW_ATN_in_atnfunc2657); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ATN423_tree = 
            (CommonTree)adaptor.create(ATN423)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ATN423_tree, root_0);
            }

            LPAREN424=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atnfunc2660); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN424_tree = 
            (CommonTree)adaptor.create(LPAREN424)
            ;
            adaptor.addChild(root_0, LPAREN424_tree);
            }

            pushFollow(FOLLOW_expression_in_atnfunc2662);
            expression425=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression425.getTree());

            RPAREN426=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atnfunc2664); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN426_tree = 
            (CommonTree)adaptor.create(RPAREN426)
            ;
            adaptor.addChild(root_0, RPAREN426_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:258:1: rndfunc : RND ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.rndfunc_return rndfunc() throws RecognitionException {
        jvmBasicParser.rndfunc_return retval = new jvmBasicParser.rndfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token RND427=null;
        Token LPAREN428=null;
        Token RPAREN430=null;
        jvmBasicParser.expression_return expression429 =null;


        CommonTree RND427_tree=null;
        CommonTree LPAREN428_tree=null;
        CommonTree RPAREN430_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:258:9: ( RND ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:258:11: RND ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            RND427=(Token)match(input,RND,FOLLOW_RND_in_rndfunc2671); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RND427_tree = 
            (CommonTree)adaptor.create(RND427)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(RND427_tree, root_0);
            }

            LPAREN428=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_rndfunc2674); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN428_tree = 
            (CommonTree)adaptor.create(LPAREN428)
            ;
            adaptor.addChild(root_0, LPAREN428_tree);
            }

            pushFollow(FOLLOW_expression_in_rndfunc2676);
            expression429=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression429.getTree());

            RPAREN430=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_rndfunc2678); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN430_tree = 
            (CommonTree)adaptor.create(RPAREN430)
            ;
            adaptor.addChild(root_0, RPAREN430_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:259:1: sgnfunc : SGN ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.sgnfunc_return sgnfunc() throws RecognitionException {
        jvmBasicParser.sgnfunc_return retval = new jvmBasicParser.sgnfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SGN431=null;
        Token LPAREN432=null;
        Token RPAREN434=null;
        jvmBasicParser.expression_return expression433 =null;


        CommonTree SGN431_tree=null;
        CommonTree LPAREN432_tree=null;
        CommonTree RPAREN434_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:259:9: ( SGN ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:259:11: SGN ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            SGN431=(Token)match(input,SGN,FOLLOW_SGN_in_sgnfunc2685); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SGN431_tree = 
            (CommonTree)adaptor.create(SGN431)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(SGN431_tree, root_0);
            }

            LPAREN432=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_sgnfunc2688); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN432_tree = 
            (CommonTree)adaptor.create(LPAREN432)
            ;
            adaptor.addChild(root_0, LPAREN432_tree);
            }

            pushFollow(FOLLOW_expression_in_sgnfunc2690);
            expression433=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression433.getTree());

            RPAREN434=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_sgnfunc2692); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN434_tree = 
            (CommonTree)adaptor.create(RPAREN434)
            ;
            adaptor.addChild(root_0, RPAREN434_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:260:1: expfunc : EXP ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.expfunc_return expfunc() throws RecognitionException {
        jvmBasicParser.expfunc_return retval = new jvmBasicParser.expfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EXP435=null;
        Token LPAREN436=null;
        Token RPAREN438=null;
        jvmBasicParser.expression_return expression437 =null;


        CommonTree EXP435_tree=null;
        CommonTree LPAREN436_tree=null;
        CommonTree RPAREN438_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:260:9: ( EXP ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:260:11: EXP ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            EXP435=(Token)match(input,EXP,FOLLOW_EXP_in_expfunc2699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXP435_tree = 
            (CommonTree)adaptor.create(EXP435)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(EXP435_tree, root_0);
            }

            LPAREN436=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expfunc2702); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN436_tree = 
            (CommonTree)adaptor.create(LPAREN436)
            ;
            adaptor.addChild(root_0, LPAREN436_tree);
            }

            pushFollow(FOLLOW_expression_in_expfunc2704);
            expression437=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression437.getTree());

            RPAREN438=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expfunc2706); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN438_tree = 
            (CommonTree)adaptor.create(RPAREN438)
            ;
            adaptor.addChild(root_0, RPAREN438_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:261:1: logfunc : LOG ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.logfunc_return logfunc() throws RecognitionException {
        jvmBasicParser.logfunc_return retval = new jvmBasicParser.logfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LOG439=null;
        Token LPAREN440=null;
        Token RPAREN442=null;
        jvmBasicParser.expression_return expression441 =null;


        CommonTree LOG439_tree=null;
        CommonTree LPAREN440_tree=null;
        CommonTree RPAREN442_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:261:9: ( LOG ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:261:11: LOG ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            LOG439=(Token)match(input,LOG,FOLLOW_LOG_in_logfunc2713); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOG439_tree = 
            (CommonTree)adaptor.create(LOG439)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(LOG439_tree, root_0);
            }

            LPAREN440=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_logfunc2716); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN440_tree = 
            (CommonTree)adaptor.create(LPAREN440)
            ;
            adaptor.addChild(root_0, LPAREN440_tree);
            }

            pushFollow(FOLLOW_expression_in_logfunc2718);
            expression441=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression441.getTree());

            RPAREN442=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_logfunc2720); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN442_tree = 
            (CommonTree)adaptor.create(RPAREN442)
            ;
            adaptor.addChild(root_0, RPAREN442_tree);
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
    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:262:1: absfunc : ABS ^ LPAREN expression RPAREN ;
    public final jvmBasicParser.absfunc_return absfunc() throws RecognitionException {
        jvmBasicParser.absfunc_return retval = new jvmBasicParser.absfunc_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ABS443=null;
        Token LPAREN444=null;
        Token RPAREN446=null;
        jvmBasicParser.expression_return expression445 =null;


        CommonTree ABS443_tree=null;
        CommonTree LPAREN444_tree=null;
        CommonTree RPAREN446_tree=null;

        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:262:9: ( ABS ^ LPAREN expression RPAREN )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:262:11: ABS ^ LPAREN expression RPAREN
            {
            root_0 = (CommonTree)adaptor.nil();


            ABS443=(Token)match(input,ABS,FOLLOW_ABS_in_absfunc2727); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ABS443_tree = 
            (CommonTree)adaptor.create(ABS443)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(ABS443_tree, root_0);
            }

            LPAREN444=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_absfunc2730); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LPAREN444_tree = 
            (CommonTree)adaptor.create(LPAREN444)
            ;
            adaptor.addChild(root_0, LPAREN444_tree);
            }

            pushFollow(FOLLOW_expression_in_absfunc2732);
            expression445=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression445.getTree());

            RPAREN446=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_absfunc2734); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RPAREN446_tree = 
            (CommonTree)adaptor.create(RPAREN446)
            ;
            adaptor.addChild(root_0, RPAREN446_tree);
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
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:11: ( amperoper )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:161:11: amperoper
        {
        pushFollow(FOLLOW_amperoper_in_synpred5_jvmBasic1038);
        amperoper();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_jvmBasic

    // $ANTLR start synpred46_jvmBasic
    public final void synpred46_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:373: ( ongotostmt )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:373: ongotostmt
        {
        pushFollow(FOLLOW_ongotostmt_in_synpred46_jvmBasic1186);
        ongotostmt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred46_jvmBasic

    // $ANTLR start synpred47_jvmBasic
    public final void synpred47_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:385: ( ongosubstmt )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:162:385: ongosubstmt
        {
        pushFollow(FOLLOW_ongosubstmt_in_synpred47_jvmBasic1189);
        ongosubstmt();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred47_jvmBasic

    // $ANTLR start synpred68_jvmBasic
    public final void synpred68_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:17: ( LPAREN exprlist RPAREN )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:163:17: LPAREN exprlist RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred68_jvmBasic1272); if (state.failed) return ;

        pushFollow(FOLLOW_exprlist_in_synpred68_jvmBasic1274);
        exprlist();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred68_jvmBasic1276); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred68_jvmBasic

    // $ANTLR start synpred73_jvmBasic
    public final void synpred73_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:47: ( printlist )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:165:47: printlist
        {
        pushFollow(FOLLOW_printlist_in_synpred73_jvmBasic1314);
        printlist();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred73_jvmBasic

    // $ANTLR start synpred75_jvmBasic
    public final void synpred75_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:8: ( lte )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:8: lte
        {
        pushFollow(FOLLOW_lte_in_synpred75_jvmBasic1358);
        lte();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred75_jvmBasic

    // $ANTLR start synpred76_jvmBasic
    public final void synpred76_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:14: ( gte )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:14: gte
        {
        pushFollow(FOLLOW_gte_in_synpred76_jvmBasic1362);
        gte();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred76_jvmBasic

    // $ANTLR start synpred78_jvmBasic
    public final void synpred78_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:26: ( EQ )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:26: EQ
        {
        match(input,EQ,FOLLOW_EQ_in_synpred78_jvmBasic1370); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred78_jvmBasic

    // $ANTLR start synpred79_jvmBasic
    public final void synpred79_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:31: ( GT )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:169:31: GT
        {
        match(input,GT,FOLLOW_GT_in_synpred79_jvmBasic1374); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_jvmBasic

    // $ANTLR start synpred89_jvmBasic
    public final void synpred89_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:182:42: ( (~ ( CR ) ) )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
        {
        if ( (input.LA(1) >= ABS && input.LA(1) <= COS)||(input.LA(1) >= DATA && input.LA(1) <= 125) ) {
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
    // $ANTLR end synpred89_jvmBasic

    // $ANTLR start synpred141_jvmBasic
    public final void synpred141_jvmBasic_fragment() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:43: ( ( PLUS | MINUS ) multiplyingExpression )
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:220:43: ( PLUS | MINUS ) multiplyingExpression
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


        pushFollow(FOLLOW_multiplyingExpression_in_synpred141_jvmBasic2215);
        multiplyingExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred141_jvmBasic

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
    public final boolean synpred89_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_jvmBasic_fragment(); // can never throw exception
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
    public final boolean synpred68_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_jvmBasic_fragment(); // can never throw exception
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
    public final boolean synpred75_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_jvmBasic_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_jvmBasic() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_jvmBasic_fragment(); // can never throw exception
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
        "\101\uffff";
    static final String DFA5_eofS =
        "\101\uffff";
    static final String DFA5_minS =
        "\1\5\50\uffff\1\0\27\uffff";
    static final String DFA5_maxS =
        "\1\173\50\uffff\1\0\27\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\uffff\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61"+
        "\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76"+
        "\1\77";
    static final String DFA5_specialS =
        "\51\uffff\1\0\27\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\24\4\uffff\1\65\1\uffff\1\14\1\uffff\1\37\3\uffff\1\74\1"+
            "\77\1\uffff\1\62\1\uffff\1\76\1\16\3\uffff\1\6\2\uffff\1\57"+
            "\1\uffff\1\30\1\64\1\63\1\10\2\uffff\1\43\1\22\1\23\1\44\1\35"+
            "\1\21\1\67\1\72\1\54\1\32\1\60\1\uffff\1\7\2\uffff\2\100\1\26"+
            "\1\1\1\uffff\1\45\6\uffff\1\56\1\11\1\uffff\1\5\1\uffff\1\51"+
            "\1\34\3\uffff\1\50\1\uffff\1\47\1\25\1\uffff\1\46\1\33\1\46"+
            "\1\66\1\31\1\55\1\3\1\13\2\uffff\1\42\1\uffff\1\15\1\2\1\41"+
            "\3\uffff\1\12\2\uffff\1\40\2\uffff\1\17\1\27\2\uffff\1\61\1"+
            "\uffff\1\20\3\uffff\1\4\2\uffff\1\36\1\70\1\71\1\73\1\uffff"+
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
            return "162:1: statement : ( LOAD | SAVE | RESTORE | TRACE | NOTRACE | FLASH | INVERSE | GR | NORMAL | SHLOAD | RETURN | CLEAR | RUN | END ^| STOP | TEXT | HOME | HGR | HGR2 | amptstmt | popstmt | liststmt | storestmt | getstmt | recallstmt | instmt | prstmt | onerrstmt | hlinstmt | vlinstmt | colorstmt | speedstmt | scalestmt | rotstmt | hcolorstmt | himemstmt | lomemstmt | printstmt1 | pokestmt | plotstmt | ongotostmt | ongosubstmt | ifstmt | comment | nextstmt | forstmt | inputstmt | tabstmt | dimstmt | gotostmt | gosubstmt | callstmt | readstmt | hplotstmt | vplotstmt | vtabstmnt | htabstmnt | waitstmt | datastmt | xdrawstmt | drawstmt | defstmt | letstmt );";
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
 

    public static final BitSet FOLLOW_line_in_prog987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_line999 = new BitSet(new long[]{0x0BCBFF9E91AC5420L,0x0BC8A648E9FED1ACL});
    public static final BitSet FOLLOW_amprstmt_in_line1003 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_COLON_in_line1006 = new BitSet(new long[]{0x0BCBFF9E91AE7420L,0x0BC8A648E9FED1ACL});
    public static final BitSet FOLLOW_amprstmt_in_line1008 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_set_in_line1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_amperoper1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_linenumber1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amperoper_in_amprstmt1038 = new BitSet(new long[]{0x0BCBFF9E91AC5420L,0x0BC8A648E9FED1ACL});
    public static final BitSet FOLLOW_statement_in_amprstmt1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOAD_in_statement1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAVE_in_statement1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTORE_in_statement1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRACE_in_statement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTRACE_in_statement1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLASH_in_statement1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INVERSE_in_statement1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GR_in_statement1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NORMAL_in_statement1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHLOAD_in_statement1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLEAR_in_statement1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RUN_in_statement1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_statement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_in_statement1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_statement1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HOME_in_statement1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HGR_in_statement1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HGR2_in_statement1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amptstmt_in_statement1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_popstmt_in_statement1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_liststmt_in_statement1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storestmt_in_statement1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getstmt_in_statement1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recallstmt_in_statement1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instmt_in_statement1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prstmt_in_statement1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_onerrstmt_in_statement1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hlinstmt_in_statement1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vlinstmt_in_statement1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_colorstmt_in_statement1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speedstmt_in_statement1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalestmt_in_statement1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rotstmt_in_statement1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hcolorstmt_in_statement1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_himemstmt_in_statement1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lomemstmt_in_statement1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printstmt1_in_statement1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pokestmt_in_statement1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plotstmt_in_statement1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongotostmt_in_statement1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongosubstmt_in_statement1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_statement1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_statement1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nextstmt_in_statement1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forstmt_in_statement1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inputstmt_in_statement1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tabstmt_in_statement1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dimstmt_in_statement1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gotostmt_in_statement1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gosubstmt_in_statement1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callstmt_in_statement1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_readstmt_in_statement1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hplotstmt_in_statement1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vplotstmt_in_statement1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vtabstmnt_in_statement1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_htabstmnt_in_statement1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_waitstmt_in_statement1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datastmt_in_statement1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xdrawstmt_in_statement1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_drawstmt_in_statement1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defstmt_in_statement1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letstmt_in_statement1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_vardecl1268 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_vardecl1272 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_exprlist_in_vardecl1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_vardecl1276 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_set_in_printstmt11284 = new BitSet(new long[]{0x94B4000164010A92L,0x003058B506012C51L});
    public static final BitSet FOLLOW_printlist_in_printstmt11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_printlist1301 = new BitSet(new long[]{0x94B4000164018A92L,0x003058B706012C51L});
    public static final BitSet FOLLOW_COMMA_in_printlist1304 = new BitSet(new long[]{0x94B4000164010A92L,0x003058B506012C51L});
    public static final BitSet FOLLOW_SEMICOLON_in_printlist1309 = new BitSet(new long[]{0x94B4000164010A92L,0x003058B506012C51L});
    public static final BitSet FOLLOW_printlist_in_printlist1314 = new BitSet(new long[]{0x94B4000164010A92L,0x003058B506012C51L});
    public static final BitSet FOLLOW_GET_in_getstmt1324 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_exprlist_in_getstmt1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letstmt1333 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_variableassignment_in_letstmt1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardecl_in_variableassignment1344 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_variableassignment1346 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_exprlist_in_variableassignment1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lte_in_relop1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gte_in_relop1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_neq_in_relop1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_relop1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relop1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_relop1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_gte1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_gte1391 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_gte1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_gte1399 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_GT_in_gte1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_lte1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_lte1414 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_lte1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_lte1422 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_LT_in_lte1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEQ_in_neq1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifstmt1439 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_ifstmt1442 = new BitSet(new long[]{0x0BCBFF9E91AC5420L,0x0BC9A648E9FED1ACL});
    public static final BitSet FOLLOW_THEN_in_ifstmt1444 = new BitSet(new long[]{0x0BCBFF9E91AC5420L,0x0BC8A648E9FED1ACL});
    public static final BitSet FOLLOW_statement_in_ifstmt1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forstmt1454 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_vardecl_in_forstmt1458 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_forstmt1460 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_forstmt1462 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_TO_in_forstmt1464 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_forstmt1466 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_STEP_in_forstmt1469 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_forstmt1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_nextstmt1481 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_varlist_in_nextstmt1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_in_inputstmt1492 = new BitSet(new long[]{0x0080000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_stringliteral_in_inputstmt1496 = new BitSet(new long[]{0x0000000000008000L,0x0000000200000000L});
    public static final BitSet FOLLOW_set_in_inputstmt1498 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_varlist_in_inputstmt1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_readstmt1514 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_varlist_in_readstmt1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIM_in_dimstmt1527 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_varlist_in_dimstmt1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOTO_in_gotostmt1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_gotostmt1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GOSUB_in_gosubstmt1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_gosubstmt1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POKE_in_pokestmt1554 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_pokestmt1556 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_pokestmt1558 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_pokestmt1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_comment1566 = new BitSet(new long[]{0xFFFFFFFFFFFDFFF2L,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_set_in_comment1579 = new BitSet(new long[]{0xFFFFFFFFFFFDFFF2L,0x3FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_CALL_in_callstmt1592 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_exprlist_in_callstmt1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HPLOT_in_hplotstmt1601 = new BitSet(new long[]{0x94B4000164010A92L,0x003458B506012C51L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1605 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_hplotstmt1607 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1609 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_TO_in_hplotstmt1614 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1616 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_hplotstmt1618 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_hplotstmt1620 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_VPLOT_in_vplotstmt1628 = new BitSet(new long[]{0x94B4000164010A92L,0x003458B506012C51L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1632 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_vplotstmt1634 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1636 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_TO_in_vplotstmt1641 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1643 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_vplotstmt1645 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_vplotstmt1647 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_PLOT_in_plotstmt1655 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_plotstmt1657 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_plotstmt1659 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_plotstmt1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_ongotostmt1668 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_ongotostmt1670 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_GOTO_in_ongotostmt1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_ongotostmt1674 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_ongotostmt1677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_ongotostmt1679 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ON_in_ongosubstmt1688 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_ongosubstmt1690 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_GOSUB_in_ongosubstmt1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_ongosubstmt1694 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_ongosubstmt1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_ongosubstmt1699 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_VTAB_in_vtabstmnt1708 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_vtabstmnt1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HTAB_in_htabstmnt1718 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_htabstmnt1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIMEM_in_himemstmt1727 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_himemstmt1730 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_himemstmt1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOMEM_in_lomemstmt1738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLON_in_lomemstmt1741 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_lomemstmt1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_datastmt1749 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_datastmt1752 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_datastmt1755 = new BitSet(new long[]{0x94B4000164018A92L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_datastmt1757 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WAIT_in_waitstmt1766 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_waitstmt1769 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_waitstmt1771 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_waitstmt1773 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_waitstmt1776 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_waitstmt1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XDRAW_in_xdrawstmt1786 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_xdrawstmt1789 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AT_in_xdrawstmt1792 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_xdrawstmt1794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_xdrawstmt1796 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_xdrawstmt1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DRAW_in_drawstmt1806 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_drawstmt1809 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AT_in_drawstmt1812 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_drawstmt1814 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_drawstmt1816 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_drawstmt1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_defstmt1826 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FN_in_defstmt1828 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_var_in_defstmt1830 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_defstmt1832 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_var_in_defstmt1834 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_defstmt1836 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_defstmt1838 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_defstmt1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAB_in_tabstmt1846 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_tabstmt1849 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_tabstmt1851 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_tabstmt1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPEED_in_speedstmt1859 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_speedstmt1862 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_speedstmt1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROT_in_rotstmt1870 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_rotstmt1873 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_rotstmt1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_in_scalestmt1881 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_scalestmt1884 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_scalestmt1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_in_colorstmt1892 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_colorstmt1895 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_colorstmt1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HCOLOR_in_hcolorstmt1903 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQ_in_hcolorstmt1906 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_hcolorstmt1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HLIN_in_hlinstmt1914 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_hlinstmt1917 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_hlinstmt1919 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_hlinstmt1921 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AT_in_hlinstmt1923 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_hlinstmt1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VLIN_in_vlinstmt1931 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_vlinstmt1934 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_vlinstmt1936 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_vlinstmt1938 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_AT_in_vlinstmt1940 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_vlinstmt1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONERR_in_onerrstmt1948 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_GOTO_in_onerrstmt1950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_linenumber_in_onerrstmt1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRNUMBER_in_prstmt1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_prstmt1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INNUMBER_in_instmt1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NUMBER_in_instmt1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STORE_in_storestmt1976 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_vardecl_in_storestmt1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECALL_in_recallstmt1984 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_vardecl_in_recallstmt1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_in_liststmt1992 = new BitSet(new long[]{0x94B4000164010A92L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_liststmt1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POP_in_popstmt2003 = new BitSet(new long[]{0x94B4000164010A92L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_popstmt2007 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_popstmt2009 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_popstmt2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPERSAND_in_amptstmt2019 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_amptstmt2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vardecl_in_func2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringliteral_in_func2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_func2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_func2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chrfunc_in_func2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sqrfunc_in_func2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lenfunc_in_func2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_strfunc_in_func2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ascfunc_in_func2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scrnfunc_in_func2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_midfunc_in_func2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pdlfunc_in_func2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_peekfunc_in_func2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intfunc_in_func2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_spcfunc_in_func2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_frefunc_in_func2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_posfunc_in_func2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usrfunc_in_func2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftfunc_in_func2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valfunc_in_func2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rightfunc_in_func2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fnfunc_in_func2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sinfunc_in_func2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cosfunc_in_func2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tanfunc_in_func2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atnfunc_in_func2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rndfunc_in_func2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sgnfunc_in_func2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expfunc_in_func2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logfunc_in_func2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absfunc_in_func2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_func2140 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_func2142 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_func2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_signExpression2152 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C41L});
    public static final BitSet FOLLOW_func_in_signExpression2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signExpression_in_exponentExpression2171 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_EXPONENT_in_exponentExpression2174 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_signExpression_in_exponentExpression2176 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_exponentExpression_in_multiplyingExpression2186 = new BitSet(new long[]{0x0000000000400002L,0x0002000000000000L});
    public static final BitSet FOLLOW_set_in_multiplyingExpression2189 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_exponentExpression_in_multiplyingExpression2196 = new BitSet(new long[]{0x0000000000400002L,0x0002000000000000L});
    public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression2205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002001L});
    public static final BitSet FOLLOW_set_in_addingExpression2208 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_multiplyingExpression_in_addingExpression2215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002001L});
    public static final BitSet FOLLOW_addingExpression_in_relationalExpression2225 = new BitSet(new long[]{0x6000006002000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_relop_in_relationalExpression2229 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_addingExpression_in_relationalExpression2233 = new BitSet(new long[]{0x6000006002000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_expression2241 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_expression2244 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_relationalExpression_in_expression2250 = new BitSet(new long[]{0x0000000000000042L,0x0000000000000200L});
    public static final BitSet FOLLOW_varname_in_var2261 = new BitSet(new long[]{0x0000000000000002L,0x3000000000000000L});
    public static final BitSet FOLLOW_varsuffix_in_var2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETTERS_in_varname2272 = new BitSet(new long[]{0x0080000000100002L});
    public static final BitSet FOLLOW_vardecl_in_varlist2300 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_varlist2303 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_vardecl_in_varlist2306 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_expression_in_exprlist2316 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_exprlist2319 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_exprlist2322 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_stringliteral2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQR_in_sqrfunc2345 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sqrfunc2348 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_sqrfunc2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_sqrfunc2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHR_in_chrfunc2359 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_chrfunc2362 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_chrfunc2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_chrfunc2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEN_in_lenfunc2373 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_lenfunc2376 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_lenfunc2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_lenfunc2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASC_in_ascfunc2387 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_ascfunc2390 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_ascfunc2392 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_ascfunc2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MID_in_midfunc2402 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_midfunc2405 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_midfunc2407 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_midfunc2409 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_midfunc2411 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_midfunc2413 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_midfunc2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_midfunc2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PDL_in_pdlfunc2424 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_pdlfunc2427 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_pdlfunc2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_pdlfunc2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PEEK_in_peekfunc2437 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_peekfunc2440 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_peekfunc2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_peekfunc2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTF_in_intfunc2451 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_intfunc2454 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_intfunc2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_intfunc2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPC_in_spcfunc2465 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_spcfunc2468 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_spcfunc2470 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_spcfunc2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRE_in_frefunc2479 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_frefunc2482 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_frefunc2484 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_frefunc2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POS_in_posfunc2493 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_posfunc2496 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_posfunc2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_posfunc2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USR_in_usrfunc2507 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_usrfunc2510 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_usrfunc2512 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_usrfunc2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_leftfunc2520 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_leftfunc2523 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_leftfunc2525 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_leftfunc2527 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_leftfunc2529 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_leftfunc2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_rightfunc2537 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rightfunc2540 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_rightfunc2542 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_rightfunc2544 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_rightfunc2546 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_rightfunc2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STR_in_strfunc2555 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_strfunc2558 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_strfunc2560 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_strfunc2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FN_in_fnfunc2569 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_var_in_fnfunc2572 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_fnfunc2574 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_fnfunc2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_fnfunc2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAL_in_valfunc2584 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_valfunc2587 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_valfunc2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_valfunc2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCRN_in_scrnfunc2597 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_scrnfunc2600 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_scrnfunc2602 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMMA_in_scrnfunc2604 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_scrnfunc2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_scrnfunc2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIN_in_sinfunc2615 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sinfunc2618 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_sinfunc2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_sinfunc2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COS_in_cosfunc2629 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_cosfunc2632 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_cosfunc2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_cosfunc2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAN_in_tanfunc2643 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_tanfunc2646 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_tanfunc2648 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_tanfunc2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATN_in_atnfunc2657 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_atnfunc2660 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_atnfunc2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_atnfunc2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RND_in_rndfunc2671 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_rndfunc2674 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_rndfunc2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_rndfunc2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SGN_in_sgnfunc2685 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_sgnfunc2688 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_sgnfunc2690 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_sgnfunc2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXP_in_expfunc2699 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_expfunc2702 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_expfunc2704 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_expfunc2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOG_in_logfunc2713 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_logfunc2716 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_logfunc2718 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_logfunc2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_absfunc2727 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_absfunc2730 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_expression_in_absfunc2732 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_absfunc2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amperoper_in_synpred5_jvmBasic1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongotostmt_in_synpred46_jvmBasic1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ongosubstmt_in_synpred47_jvmBasic1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred68_jvmBasic1272 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_exprlist_in_synpred68_jvmBasic1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred68_jvmBasic1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printlist_in_synpred73_jvmBasic1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lte_in_synpred75_jvmBasic1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_gte_in_synpred76_jvmBasic1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_synpred78_jvmBasic1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_synpred79_jvmBasic1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred141_jvmBasic2208 = new BitSet(new long[]{0x94B4000164010A90L,0x003058B506012C51L});
    public static final BitSet FOLLOW_multiplyingExpression_in_synpred141_jvmBasic2215 = new BitSet(new long[]{0x0000000000000002L});

}