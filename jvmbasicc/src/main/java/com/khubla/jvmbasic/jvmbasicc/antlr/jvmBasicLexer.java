// $ANTLR 3.4 com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g 2012-12-30 17:38:41

    package com.khubla.jvmbasic.jvmbasicc.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class jvmBasicLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public jvmBasicLexer() {} 
    public jvmBasicLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public jvmBasicLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g"; }

    // $ANTLR start "ABS"
    public final void mABS() throws RecognitionException {
        try {
            int _type = ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:6:5: ( 'ABS' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:6:7: 'ABS'
            {
            match("ABS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABS"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:7:11: ( '&' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:7:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:8:5: ( 'AND' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:8:7: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:9:5: ( 'ASC' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:9:7: 'ASC'
            {
            match("ASC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:10:4: ( 'AT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:10:6: 'AT'
            {
            match("AT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "ATN"
    public final void mATN() throws RecognitionException {
        try {
            int _type = ATN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:11:5: ( 'ATN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:11:7: 'ATN'
            {
            match("ATN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ATN"

    // $ANTLR start "CALL"
    public final void mCALL() throws RecognitionException {
        try {
            int _type = CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:12:6: ( 'CALL' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:12:8: 'CALL'
            {
            match("CALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CALL"

    // $ANTLR start "CHR"
    public final void mCHR() throws RecognitionException {
        try {
            int _type = CHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:13:5: ( 'CHR$' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:13:7: 'CHR$'
            {
            match("CHR$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHR"

    // $ANTLR start "CLEAR"
    public final void mCLEAR() throws RecognitionException {
        try {
            int _type = CLEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:14:7: ( 'CLEAR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:14:9: 'CLEAR'
            {
            match("CLEAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLEAR"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:15:7: ( ':' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COLOR"
    public final void mCOLOR() throws RecognitionException {
        try {
            int _type = COLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:16:7: ( 'COLOR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:16:9: 'COLOR'
            {
            match("COLOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLOR"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:17:7: ( ',' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COS"
    public final void mCOS() throws RecognitionException {
        try {
            int _type = COS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:18:5: ( 'COS' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:18:7: 'COS'
            {
            match("COS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COS"

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:19:6: ( 'DATA' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:19:8: 'DATA'
            {
            match("DATA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:20:5: ( 'DEF' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:20:7: 'DEF'
            {
            match("DEF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "DIM"
    public final void mDIM() throws RecognitionException {
        try {
            int _type = DIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:21:5: ( 'DIM' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:21:7: 'DIM'
            {
            match("DIM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIM"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:22:5: ( '/' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:22:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DRAW"
    public final void mDRAW() throws RecognitionException {
        try {
            int _type = DRAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:23:6: ( 'DRAW' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:23:8: 'DRAW'
            {
            match("DRAW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DRAW"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:24:5: ( 'END' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:24:7: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:25:4: ( '=' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:25:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "EXP"
    public final void mEXP() throws RecognitionException {
        try {
            int _type = EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:26:5: ( 'EXP' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:26:7: 'EXP'
            {
            match("EXP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXP"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:27:10: ( '^' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:27:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "FLASH"
    public final void mFLASH() throws RecognitionException {
        try {
            int _type = FLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:28:7: ( 'FLASH' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:28:9: 'FLASH'
            {
            match("FLASH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLASH"

    // $ANTLR start "FN"
    public final void mFN() throws RecognitionException {
        try {
            int _type = FN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:29:4: ( 'FN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:29:6: 'FN'
            {
            match("FN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FN"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:30:5: ( 'FOR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:30:7: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FRE"
    public final void mFRE() throws RecognitionException {
        try {
            int _type = FRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:31:5: ( 'FRE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:31:7: 'FRE'
            {
            match("FRE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FRE"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:32:5: ( 'GET' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:32:7: 'GET'
            {
            match("GET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "GOSUB"
    public final void mGOSUB() throws RecognitionException {
        try {
            int _type = GOSUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:33:7: ( 'GOSUB' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:33:9: 'GOSUB'
            {
            match("GOSUB"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GOSUB"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:34:6: ( 'GOTO' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:34:8: 'GOTO'
            {
            match("GOTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "GR"
    public final void mGR() throws RecognitionException {
        try {
            int _type = GR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:35:4: ( 'GR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:35:6: 'GR'
            {
            match("GR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GR"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:36:4: ( '>' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:36:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:37:5: ( '>=' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:37:7: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "HCOLOR"
    public final void mHCOLOR() throws RecognitionException {
        try {
            int _type = HCOLOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:38:8: ( 'HCOLOR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:38:10: 'HCOLOR'
            {
            match("HCOLOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HCOLOR"

    // $ANTLR start "HGR"
    public final void mHGR() throws RecognitionException {
        try {
            int _type = HGR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:39:5: ( 'HGR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:39:7: 'HGR'
            {
            match("HGR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HGR"

    // $ANTLR start "HGR2"
    public final void mHGR2() throws RecognitionException {
        try {
            int _type = HGR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:40:6: ( 'HGR2' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:40:8: 'HGR2'
            {
            match("HGR2"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HGR2"

    // $ANTLR start "HIMEM"
    public final void mHIMEM() throws RecognitionException {
        try {
            int _type = HIMEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:41:7: ( 'HIMEM' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:41:9: 'HIMEM'
            {
            match("HIMEM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HIMEM"

    // $ANTLR start "HLIN"
    public final void mHLIN() throws RecognitionException {
        try {
            int _type = HLIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:42:6: ( 'HLIN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:42:8: 'HLIN'
            {
            match("HLIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HLIN"

    // $ANTLR start "HOME"
    public final void mHOME() throws RecognitionException {
        try {
            int _type = HOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:43:6: ( 'HOME' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:43:8: 'HOME'
            {
            match("HOME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HOME"

    // $ANTLR start "HPLOT"
    public final void mHPLOT() throws RecognitionException {
        try {
            int _type = HPLOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:44:7: ( 'HPLOT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:44:9: 'HPLOT'
            {
            match("HPLOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HPLOT"

    // $ANTLR start "HTAB"
    public final void mHTAB() throws RecognitionException {
        try {
            int _type = HTAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:45:6: ( 'HTAB' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:45:8: 'HTAB'
            {
            match("HTAB"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HTAB"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:46:4: ( 'IF' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:46:6: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "INNUMBER"
    public final void mINNUMBER() throws RecognitionException {
        try {
            int _type = INNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:47:10: ( 'IN#' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:47:12: 'IN#'
            {
            match("IN#"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INNUMBER"

    // $ANTLR start "INPUT"
    public final void mINPUT() throws RecognitionException {
        try {
            int _type = INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:48:7: ( 'INPUT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:48:9: 'INPUT'
            {
            match("INPUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INPUT"

    // $ANTLR start "INTF"
    public final void mINTF() throws RecognitionException {
        try {
            int _type = INTF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:49:6: ( 'INT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:49:8: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTF"

    // $ANTLR start "INVERSE"
    public final void mINVERSE() throws RecognitionException {
        try {
            int _type = INVERSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:50:9: ( 'INVERSE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:50:11: 'INVERSE'
            {
            match("INVERSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INVERSE"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:51:6: ( 'LEFT$' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:51:8: 'LEFT$'
            {
            match("LEFT$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "LEN"
    public final void mLEN() throws RecognitionException {
        try {
            int _type = LEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:52:5: ( 'LEN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:52:7: 'LEN'
            {
            match("LEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEN"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:53:5: ( 'LET' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:53:7: 'LET'
            {
            match("LET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:54:6: ( 'LIST' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:54:8: 'LIST'
            {
            match("LIST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:55:6: ( 'LOAD' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:55:8: 'LOAD'
            {
            match("LOAD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "LOG"
    public final void mLOG() throws RecognitionException {
        try {
            int _type = LOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:56:5: ( 'LOG' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:56:7: 'LOG'
            {
            match("LOG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOG"

    // $ANTLR start "LOMEM"
    public final void mLOMEM() throws RecognitionException {
        try {
            int _type = LOMEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:57:7: ( 'LOMEM' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:57:9: 'LOMEM'
            {
            match("LOMEM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOMEM"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:58:8: ( '(' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:58:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:59:4: ( '<' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:59:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:60:5: ( '<=' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:60:7: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "MID"
    public final void mMID() throws RecognitionException {
        try {
            int _type = MID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:61:5: ( 'MID$' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:61:7: 'MID$'
            {
            match("MID$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MID"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:62:7: ( '-' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:62:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:63:5: ( '< >' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:63:7: '< >'
            {
            match("< >"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "NEXT"
    public final void mNEXT() throws RecognitionException {
        try {
            int _type = NEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:64:6: ( 'NEXT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:64:8: 'NEXT'
            {
            match("NEXT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEXT"

    // $ANTLR start "NORMAL"
    public final void mNORMAL() throws RecognitionException {
        try {
            int _type = NORMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:65:8: ( 'NORMAL' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:65:10: 'NORMAL'
            {
            match("NORMAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NORMAL"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:66:5: ( 'NOT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:66:7: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NOTRACE"
    public final void mNOTRACE() throws RecognitionException {
        try {
            int _type = NOTRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:67:9: ( 'NOTRACE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:67:11: 'NOTRACE'
            {
            match("NOTRACE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTRACE"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:68:4: ( 'ON' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:68:6: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "ONERR"
    public final void mONERR() throws RecognitionException {
        try {
            int _type = ONERR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:69:7: ( 'ONERR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:69:9: 'ONERR'
            {
            match("ONERR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ONERR"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:70:4: ( 'OR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:70:6: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PDL"
    public final void mPDL() throws RecognitionException {
        try {
            int _type = PDL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:71:5: ( 'PDL' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:71:7: 'PDL'
            {
            match("PDL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PDL"

    // $ANTLR start "PEEK"
    public final void mPEEK() throws RecognitionException {
        try {
            int _type = PEEK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:72:6: ( 'PEEK' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:72:8: 'PEEK'
            {
            match("PEEK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PEEK"

    // $ANTLR start "PLOT"
    public final void mPLOT() throws RecognitionException {
        try {
            int _type = PLOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:73:6: ( 'PLOT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:73:8: 'PLOT'
            {
            match("PLOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:74:6: ( '+' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:74:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "POKE"
    public final void mPOKE() throws RecognitionException {
        try {
            int _type = POKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:75:6: ( 'POKE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:75:8: 'POKE'
            {
            match("POKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POKE"

    // $ANTLR start "POP"
    public final void mPOP() throws RecognitionException {
        try {
            int _type = POP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:76:5: ( 'POP' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:76:7: 'POP'
            {
            match("POP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POP"

    // $ANTLR start "POS"
    public final void mPOS() throws RecognitionException {
        try {
            int _type = POS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:77:5: ( 'POS' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:77:7: 'POS'
            {
            match("POS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POS"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:78:7: ( 'PRINT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:78:9: 'PRINT'
            {
            match("PRINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "PRNUMBER"
    public final void mPRNUMBER() throws RecognitionException {
        try {
            int _type = PRNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:79:10: ( 'PR#' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:79:12: 'PR#'
            {
            match("PR#"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRNUMBER"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:80:10: ( '?' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:80:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:81:6: ( 'READ' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:81:8: 'READ'
            {
            match("READ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "RECALL"
    public final void mRECALL() throws RecognitionException {
        try {
            int _type = RECALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:82:8: ( 'RECALL' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:82:10: 'RECALL'
            {
            match("RECALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RECALL"

    // $ANTLR start "REM"
    public final void mREM() throws RecognitionException {
        try {
            int _type = REM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:83:5: ( 'REM' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:83:7: 'REM'
            {
            match("REM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REM"

    // $ANTLR start "RESTORE"
    public final void mRESTORE() throws RecognitionException {
        try {
            int _type = RESTORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:84:9: ( 'RESTORE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:84:11: 'RESTORE'
            {
            match("RESTORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESTORE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:85:8: ( 'RETURN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:85:10: 'RETURN'
            {
            match("RETURN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:86:7: ( 'RIGHT$' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:86:9: 'RIGHT$'
            {
            match("RIGHT$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "RND"
    public final void mRND() throws RecognitionException {
        try {
            int _type = RND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:87:5: ( 'RND' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:87:7: 'RND'
            {
            match("RND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RND"

    // $ANTLR start "ROT"
    public final void mROT() throws RecognitionException {
        try {
            int _type = ROT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:88:5: ( 'ROT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:88:7: 'ROT'
            {
            match("ROT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ROT"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:89:8: ( ')' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:89:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "RUN"
    public final void mRUN() throws RecognitionException {
        try {
            int _type = RUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:90:5: ( 'RUN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:90:7: 'RUN'
            {
            match("RUN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RUN"

    // $ANTLR start "SAVE"
    public final void mSAVE() throws RecognitionException {
        try {
            int _type = SAVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:91:6: ( 'SAVE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:91:8: 'SAVE'
            {
            match("SAVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SAVE"

    // $ANTLR start "SCALE"
    public final void mSCALE() throws RecognitionException {
        try {
            int _type = SCALE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:92:7: ( 'SCALE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:92:9: 'SCALE'
            {
            match("SCALE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCALE"

    // $ANTLR start "SCRN"
    public final void mSCRN() throws RecognitionException {
        try {
            int _type = SCRN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:93:6: ( 'SCRN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:93:8: 'SCRN'
            {
            match("SCRN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCRN"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:94:11: ( ';' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:94:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "SGN"
    public final void mSGN() throws RecognitionException {
        try {
            int _type = SGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:95:5: ( 'SGN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:95:7: 'SGN'
            {
            match("SGN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SGN"

    // $ANTLR start "SHLOAD"
    public final void mSHLOAD() throws RecognitionException {
        try {
            int _type = SHLOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:96:8: ( 'SHLOAD' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:96:10: 'SHLOAD'
            {
            match("SHLOAD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHLOAD"

    // $ANTLR start "SIN"
    public final void mSIN() throws RecognitionException {
        try {
            int _type = SIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:97:5: ( 'SIN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:97:7: 'SIN'
            {
            match("SIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SIN"

    // $ANTLR start "SPC"
    public final void mSPC() throws RecognitionException {
        try {
            int _type = SPC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:98:5: ( 'SPC' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:98:7: 'SPC'
            {
            match("SPC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPC"

    // $ANTLR start "SPEED"
    public final void mSPEED() throws RecognitionException {
        try {
            int _type = SPEED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:99:7: ( 'SPEED' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:99:9: 'SPEED'
            {
            match("SPEED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPEED"

    // $ANTLR start "SQR"
    public final void mSQR() throws RecognitionException {
        try {
            int _type = SQR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:100:5: ( 'SQR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:100:7: 'SQR'
            {
            match("SQR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SQR"

    // $ANTLR start "STEP"
    public final void mSTEP() throws RecognitionException {
        try {
            int _type = STEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:101:6: ( 'STEP' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:101:8: 'STEP'
            {
            match("STEP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STEP"

    // $ANTLR start "STOP"
    public final void mSTOP() throws RecognitionException {
        try {
            int _type = STOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:102:6: ( 'STOP' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:102:8: 'STOP'
            {
            match("STOP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STOP"

    // $ANTLR start "STORE"
    public final void mSTORE() throws RecognitionException {
        try {
            int _type = STORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:103:7: ( 'STORE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:103:9: 'STORE'
            {
            match("STORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STORE"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:104:5: ( 'STR$' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:104:7: 'STR$'
            {
            match("STR$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "TAB"
    public final void mTAB() throws RecognitionException {
        try {
            int _type = TAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:105:5: ( 'TAB' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:105:7: 'TAB'
            {
            match("TAB"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TAB"

    // $ANTLR start "TAN"
    public final void mTAN() throws RecognitionException {
        try {
            int _type = TAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:106:5: ( 'TAN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:106:7: 'TAN'
            {
            match("TAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TAN"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:107:6: ( 'TEXT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:107:8: 'TEXT'
            {
            match("TEXT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:108:6: ( 'THEN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:108:8: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:109:7: ( '*' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:109:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:110:4: ( 'TO' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:110:6: 'TO'
            {
            match("TO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TRACE"
    public final void mTRACE() throws RecognitionException {
        try {
            int _type = TRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:111:7: ( 'TRACE' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:111:9: 'TRACE'
            {
            match("TRACE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRACE"

    // $ANTLR start "USR"
    public final void mUSR() throws RecognitionException {
        try {
            int _type = USR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:112:5: ( 'USR' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:112:7: 'USR'
            {
            match("USR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USR"

    // $ANTLR start "VAL"
    public final void mVAL() throws RecognitionException {
        try {
            int _type = VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:113:5: ( 'VAL' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:113:7: 'VAL'
            {
            match("VAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAL"

    // $ANTLR start "VLIN"
    public final void mVLIN() throws RecognitionException {
        try {
            int _type = VLIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:114:6: ( 'VLIN' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:114:8: 'VLIN'
            {
            match("VLIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VLIN"

    // $ANTLR start "VPLOT"
    public final void mVPLOT() throws RecognitionException {
        try {
            int _type = VPLOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:115:7: ( 'VPLOT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:115:9: 'VPLOT'
            {
            match("VPLOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VPLOT"

    // $ANTLR start "VTAB"
    public final void mVTAB() throws RecognitionException {
        try {
            int _type = VTAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:116:6: ( 'VTAB' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:116:8: 'VTAB'
            {
            match("VTAB"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VTAB"

    // $ANTLR start "WAIT"
    public final void mWAIT() throws RecognitionException {
        try {
            int _type = WAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:117:6: ( 'WAIT' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:117:8: 'WAIT'
            {
            match("WAIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WAIT"

    // $ANTLR start "XDRAW"
    public final void mXDRAW() throws RecognitionException {
        try {
            int _type = XDRAW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:118:7: ( 'XDRAW' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:118:9: 'XDRAW'
            {
            match("XDRAW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "XDRAW"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:119:8: ( '$' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:119:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:120:8: ( '%' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:120:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:264:14: ( '\"' (~ ( '\"' | '\\\\' ) )* '\"' )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:264:16: '\"' (~ ( '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:264:20: (~ ( '\"' | '\\\\' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGLITERAL"

    // $ANTLR start "LETTERS"
    public final void mLETTERS() throws RecognitionException {
        try {
            int _type = LETTERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:265:9: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:265:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:265:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTERS"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:266:17: ( ( '0' .. '9' ) )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:267:8: ( ( DIGIT )+ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:267:10: ( DIGIT )+
            {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:267:10: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:268:7: ( ( DIGIT )* '.' ( DIGIT )+ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:268:9: ( DIGIT )* '.' ( DIGIT )+
            {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:268:9: ( DIGIT )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('.'); 

            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:268:20: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "CR"
    public final void mCR() throws RecognitionException {
        try {
            int _type = CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:269:7: ( ( '\\r' | '\\n' | '\\r\\n' | '\\n\\r' ) )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:269:13: ( '\\r' | '\\n' | '\\r\\n' | '\\n\\r' )
            {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:269:13: ( '\\r' | '\\n' | '\\r\\n' | '\\n\\r' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case '\r':
                {
                switch ( input.LA(2) ) {
                case '\n':
                    {
                    alt6=3;
                    }
                    break;
                default:
                    alt6=1;
                }

                }
                break;
            case '\n':
                {
                switch ( input.LA(2) ) {
                case '\r':
                    {
                    alt6=4;
                    }
                    break;
                default:
                    alt6=2;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:269:14: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 2 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:269:20: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:269:27: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 4 :
                    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:269:35: '\\n\\r'
                    {
                    match("\n\r"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CR"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:270:9: ( ( ' ' )+ )
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:270:15: ( ' ' )+
            {
            // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:270:15: ( ' ' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:270:16: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:8: ( ABS | AMPERSAND | AND | ASC | AT | ATN | CALL | CHR | CLEAR | COLON | COLOR | COMMA | COS | DATA | DEF | DIM | DIV | DRAW | END | EQ | EXP | EXPONENT | FLASH | FN | FOR | FRE | GET | GOSUB | GOTO | GR | GT | GTE | HCOLOR | HGR | HGR2 | HIMEM | HLIN | HOME | HPLOT | HTAB | IF | INNUMBER | INPUT | INTF | INVERSE | LEFT | LEN | LET | LIST | LOAD | LOG | LOMEM | LPAREN | LT | LTE | MID | MINUS | NEQ | NEXT | NORMAL | NOT | NOTRACE | ON | ONERR | OR | PDL | PEEK | PLOT | PLUS | POKE | POP | POS | PRINT | PRNUMBER | QUESTION | READ | RECALL | REM | RESTORE | RETURN | RIGHT | RND | ROT | RPAREN | RUN | SAVE | SCALE | SCRN | SEMICOLON | SGN | SHLOAD | SIN | SPC | SPEED | SQR | STEP | STOP | STORE | STR | TAB | TAN | TEXT | THEN | TIMES | TO | TRACE | USR | VAL | VLIN | VPLOT | VTAB | WAIT | XDRAW | T__124 | T__125 | STRINGLITERAL | LETTERS | NUMBER | FLOAT | CR | WS )
        int alt8=121;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:10: ABS
                {
                mABS(); 


                }
                break;
            case 2 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:14: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 3 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:24: AND
                {
                mAND(); 


                }
                break;
            case 4 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:28: ASC
                {
                mASC(); 


                }
                break;
            case 5 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:32: AT
                {
                mAT(); 


                }
                break;
            case 6 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:35: ATN
                {
                mATN(); 


                }
                break;
            case 7 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:39: CALL
                {
                mCALL(); 


                }
                break;
            case 8 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:44: CHR
                {
                mCHR(); 


                }
                break;
            case 9 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:48: CLEAR
                {
                mCLEAR(); 


                }
                break;
            case 10 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:54: COLON
                {
                mCOLON(); 


                }
                break;
            case 11 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:60: COLOR
                {
                mCOLOR(); 


                }
                break;
            case 12 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:66: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 13 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:72: COS
                {
                mCOS(); 


                }
                break;
            case 14 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:76: DATA
                {
                mDATA(); 


                }
                break;
            case 15 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:81: DEF
                {
                mDEF(); 


                }
                break;
            case 16 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:85: DIM
                {
                mDIM(); 


                }
                break;
            case 17 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:89: DIV
                {
                mDIV(); 


                }
                break;
            case 18 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:93: DRAW
                {
                mDRAW(); 


                }
                break;
            case 19 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:98: END
                {
                mEND(); 


                }
                break;
            case 20 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:102: EQ
                {
                mEQ(); 


                }
                break;
            case 21 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:105: EXP
                {
                mEXP(); 


                }
                break;
            case 22 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:109: EXPONENT
                {
                mEXPONENT(); 


                }
                break;
            case 23 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:118: FLASH
                {
                mFLASH(); 


                }
                break;
            case 24 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:124: FN
                {
                mFN(); 


                }
                break;
            case 25 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:127: FOR
                {
                mFOR(); 


                }
                break;
            case 26 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:131: FRE
                {
                mFRE(); 


                }
                break;
            case 27 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:135: GET
                {
                mGET(); 


                }
                break;
            case 28 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:139: GOSUB
                {
                mGOSUB(); 


                }
                break;
            case 29 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:145: GOTO
                {
                mGOTO(); 


                }
                break;
            case 30 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:150: GR
                {
                mGR(); 


                }
                break;
            case 31 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:153: GT
                {
                mGT(); 


                }
                break;
            case 32 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:156: GTE
                {
                mGTE(); 


                }
                break;
            case 33 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:160: HCOLOR
                {
                mHCOLOR(); 


                }
                break;
            case 34 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:167: HGR
                {
                mHGR(); 


                }
                break;
            case 35 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:171: HGR2
                {
                mHGR2(); 


                }
                break;
            case 36 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:176: HIMEM
                {
                mHIMEM(); 


                }
                break;
            case 37 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:182: HLIN
                {
                mHLIN(); 


                }
                break;
            case 38 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:187: HOME
                {
                mHOME(); 


                }
                break;
            case 39 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:192: HPLOT
                {
                mHPLOT(); 


                }
                break;
            case 40 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:198: HTAB
                {
                mHTAB(); 


                }
                break;
            case 41 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:203: IF
                {
                mIF(); 


                }
                break;
            case 42 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:206: INNUMBER
                {
                mINNUMBER(); 


                }
                break;
            case 43 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:215: INPUT
                {
                mINPUT(); 


                }
                break;
            case 44 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:221: INTF
                {
                mINTF(); 


                }
                break;
            case 45 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:226: INVERSE
                {
                mINVERSE(); 


                }
                break;
            case 46 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:234: LEFT
                {
                mLEFT(); 


                }
                break;
            case 47 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:239: LEN
                {
                mLEN(); 


                }
                break;
            case 48 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:243: LET
                {
                mLET(); 


                }
                break;
            case 49 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:247: LIST
                {
                mLIST(); 


                }
                break;
            case 50 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:252: LOAD
                {
                mLOAD(); 


                }
                break;
            case 51 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:257: LOG
                {
                mLOG(); 


                }
                break;
            case 52 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:261: LOMEM
                {
                mLOMEM(); 


                }
                break;
            case 53 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:267: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 54 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:274: LT
                {
                mLT(); 


                }
                break;
            case 55 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:277: LTE
                {
                mLTE(); 


                }
                break;
            case 56 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:281: MID
                {
                mMID(); 


                }
                break;
            case 57 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:285: MINUS
                {
                mMINUS(); 


                }
                break;
            case 58 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:291: NEQ
                {
                mNEQ(); 


                }
                break;
            case 59 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:295: NEXT
                {
                mNEXT(); 


                }
                break;
            case 60 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:300: NORMAL
                {
                mNORMAL(); 


                }
                break;
            case 61 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:307: NOT
                {
                mNOT(); 


                }
                break;
            case 62 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:311: NOTRACE
                {
                mNOTRACE(); 


                }
                break;
            case 63 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:319: ON
                {
                mON(); 


                }
                break;
            case 64 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:322: ONERR
                {
                mONERR(); 


                }
                break;
            case 65 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:328: OR
                {
                mOR(); 


                }
                break;
            case 66 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:331: PDL
                {
                mPDL(); 


                }
                break;
            case 67 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:335: PEEK
                {
                mPEEK(); 


                }
                break;
            case 68 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:340: PLOT
                {
                mPLOT(); 


                }
                break;
            case 69 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:345: PLUS
                {
                mPLUS(); 


                }
                break;
            case 70 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:350: POKE
                {
                mPOKE(); 


                }
                break;
            case 71 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:355: POP
                {
                mPOP(); 


                }
                break;
            case 72 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:359: POS
                {
                mPOS(); 


                }
                break;
            case 73 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:363: PRINT
                {
                mPRINT(); 


                }
                break;
            case 74 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:369: PRNUMBER
                {
                mPRNUMBER(); 


                }
                break;
            case 75 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:378: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 76 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:387: READ
                {
                mREAD(); 


                }
                break;
            case 77 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:392: RECALL
                {
                mRECALL(); 


                }
                break;
            case 78 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:399: REM
                {
                mREM(); 


                }
                break;
            case 79 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:403: RESTORE
                {
                mRESTORE(); 


                }
                break;
            case 80 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:411: RETURN
                {
                mRETURN(); 


                }
                break;
            case 81 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:418: RIGHT
                {
                mRIGHT(); 


                }
                break;
            case 82 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:424: RND
                {
                mRND(); 


                }
                break;
            case 83 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:428: ROT
                {
                mROT(); 


                }
                break;
            case 84 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:432: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 85 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:439: RUN
                {
                mRUN(); 


                }
                break;
            case 86 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:443: SAVE
                {
                mSAVE(); 


                }
                break;
            case 87 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:448: SCALE
                {
                mSCALE(); 


                }
                break;
            case 88 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:454: SCRN
                {
                mSCRN(); 


                }
                break;
            case 89 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:459: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 90 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:469: SGN
                {
                mSGN(); 


                }
                break;
            case 91 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:473: SHLOAD
                {
                mSHLOAD(); 


                }
                break;
            case 92 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:480: SIN
                {
                mSIN(); 


                }
                break;
            case 93 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:484: SPC
                {
                mSPC(); 


                }
                break;
            case 94 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:488: SPEED
                {
                mSPEED(); 


                }
                break;
            case 95 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:494: SQR
                {
                mSQR(); 


                }
                break;
            case 96 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:498: STEP
                {
                mSTEP(); 


                }
                break;
            case 97 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:503: STOP
                {
                mSTOP(); 


                }
                break;
            case 98 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:508: STORE
                {
                mSTORE(); 


                }
                break;
            case 99 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:514: STR
                {
                mSTR(); 


                }
                break;
            case 100 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:518: TAB
                {
                mTAB(); 


                }
                break;
            case 101 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:522: TAN
                {
                mTAN(); 


                }
                break;
            case 102 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:526: TEXT
                {
                mTEXT(); 


                }
                break;
            case 103 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:531: THEN
                {
                mTHEN(); 


                }
                break;
            case 104 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:536: TIMES
                {
                mTIMES(); 


                }
                break;
            case 105 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:542: TO
                {
                mTO(); 


                }
                break;
            case 106 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:545: TRACE
                {
                mTRACE(); 


                }
                break;
            case 107 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:551: USR
                {
                mUSR(); 


                }
                break;
            case 108 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:555: VAL
                {
                mVAL(); 


                }
                break;
            case 109 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:559: VLIN
                {
                mVLIN(); 


                }
                break;
            case 110 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:564: VPLOT
                {
                mVPLOT(); 


                }
                break;
            case 111 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:570: VTAB
                {
                mVTAB(); 


                }
                break;
            case 112 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:575: WAIT
                {
                mWAIT(); 


                }
                break;
            case 113 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:580: XDRAW
                {
                mXDRAW(); 


                }
                break;
            case 114 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:586: T__124
                {
                mT__124(); 


                }
                break;
            case 115 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:593: T__125
                {
                mT__125(); 


                }
                break;
            case 116 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:600: STRINGLITERAL
                {
                mSTRINGLITERAL(); 


                }
                break;
            case 117 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:614: LETTERS
                {
                mLETTERS(); 


                }
                break;
            case 118 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:622: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 119 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:629: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 120 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:635: CR
                {
                mCR(); 


                }
                break;
            case 121 :
                // com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g:1:638: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\47\1\uffff\1\47\2\uffff\1\47\1\uffff\1\47\2\uffff\2\47"+
        "\1\102\3\47\1\uffff\1\121\1\47\1\uffff\3\47\2\uffff\1\47\1\uffff"+
        "\1\47\1\uffff\1\47\1\uffff\4\47\4\uffff\1\165\3\uffff\3\47\1\172"+
        "\13\47\1\u0087\4\47\1\u008d\2\uffff\7\47\1\u0095\4\47\3\uffff\3"+
        "\47\1\u00a6\1\u00a7\25\47\1\u00c9\10\47\1\uffff\1\u00d2\1\u00d3"+
        "\1\u00d4\1\u00d5\1\uffff\4\47\1\u00da\1\47\1\u00dc\1\u00dd\1\47"+
        "\1\u00df\1\u00e0\1\47\1\uffff\1\u00e2\1\u00e3\1\u00e4\2\47\1\uffff"+
        "\1\47\1\u00e9\5\47\2\uffff\1\47\1\u00f0\2\47\1\u00f3\1\u00f4\2\47"+
        "\1\u00f7\4\47\1\u00fd\1\47\2\uffff\1\u00ff\3\47\1\u0103\1\u0104"+
        "\1\47\1\uffff\2\47\1\u0108\3\47\1\u010c\1\u010d\1\u010e\3\47\1\u0112"+
        "\1\47\1\u0114\1\u0115\1\47\1\u0117\3\47\1\u011c\1\u011d\2\47\1\uffff"+
        "\1\47\1\u0121\1\u0122\5\47\4\uffff\1\u0128\1\uffff\2\47\1\uffff"+
        "\1\u012b\2\uffff\1\u012c\2\uffff\1\47\3\uffff\1\47\1\u012f\1\47"+
        "\2\uffff\1\47\1\u0132\1\u0133\1\47\1\u0135\1\47\1\uffff\2\47\2\uffff"+
        "\1\u0139\1\u013a\1\uffff\1\47\1\uffff\1\u013c\2\47\1\uffff\1\47"+
        "\1\uffff\1\u0140\1\u0141\1\u0142\2\uffff\1\47\1\u0144\1\47\1\uffff"+
        "\3\47\3\uffff\1\u0149\1\47\1\u014b\1\uffff\1\47\2\uffff\1\47\1\uffff"+
        "\1\u014e\1\u014f\1\47\3\uffff\1\u0151\1\u0152\1\47\2\uffff\1\u0154"+
        "\1\47\1\u0156\1\u0157\1\47\1\uffff\1\u0159\1\u015a\2\uffff\1\u015b"+
        "\1\u015c\1\uffff\1\47\1\u015e\2\uffff\1\u015f\1\uffff\1\u0160\1"+
        "\47\3\uffff\1\u0162\1\uffff\2\47\1\u0165\3\uffff\1\u0166\1\uffff"+
        "\4\47\1\uffff\1\u016b\1\uffff\1\47\1\u016d\2\uffff\1\u016e\2\uffff"+
        "\1\u016f\1\uffff\1\u0170\2\uffff\1\u0171\4\uffff\1\u0172\3\uffff"+
        "\1\47\1\uffff\1\u0174\1\47\2\uffff\1\u0176\1\47\1\u0178\2\uffff"+
        "\1\u0179\6\uffff\1\u017a\1\uffff\1\u017b\1\uffff\1\u017c\5\uffff";
    static final String DFA8_eofS =
        "\u017d\uffff";
    static final String DFA8_minS =
        "\1\12\1\102\1\uffff\1\101\2\uffff\1\101\1\uffff\1\116\2\uffff\1"+
        "\114\1\105\1\75\1\103\1\106\1\105\1\uffff\1\40\1\111\1\uffff\1\105"+
        "\1\116\1\104\2\uffff\1\105\1\uffff\1\101\1\uffff\1\101\1\uffff\1"+
        "\123\2\101\1\104\4\uffff\1\56\3\uffff\1\123\1\104\1\103\1\101\1"+
        "\114\1\122\1\105\1\114\1\124\1\106\1\115\1\101\1\104\1\120\2\101"+
        "\1\122\1\105\1\124\1\123\1\101\2\uffff\1\117\1\122\1\115\1\111\1"+
        "\115\1\114\2\101\1\43\1\106\1\123\1\101\3\uffff\1\104\1\130\1\122"+
        "\2\101\1\114\1\105\1\117\1\113\1\43\1\101\1\107\1\104\1\124\1\116"+
        "\1\126\1\101\1\116\1\114\1\116\1\103\1\122\1\105\1\102\1\130\1\105"+
        "\2\101\1\122\1\114\1\111\1\114\1\101\1\111\1\122\1\uffff\4\101\1"+
        "\uffff\1\114\1\44\1\101\1\117\4\101\1\127\2\101\1\123\1\uffff\3"+
        "\101\1\125\1\117\1\uffff\1\114\1\62\1\105\1\116\1\105\1\117\1\102"+
        "\2\uffff\1\125\1\101\1\105\1\124\2\101\1\124\1\104\1\101\1\105\1"+
        "\44\1\124\1\115\1\101\1\122\2\uffff\1\101\1\113\1\124\1\105\2\101"+
        "\1\116\1\uffff\1\104\2\101\1\124\1\125\1\110\3\101\1\105\1\114\1"+
        "\116\1\101\1\117\2\101\1\105\1\101\2\120\1\44\2\101\1\124\1\116"+
        "\1\uffff\1\103\2\101\1\116\1\117\1\102\1\124\1\101\4\uffff\1\101"+
        "\1\uffff\2\122\1\uffff\1\101\2\uffff\1\101\2\uffff\1\110\3\uffff"+
        "\1\102\1\101\1\117\2\uffff\1\115\2\101\1\124\1\101\1\124\1\uffff"+
        "\1\122\1\44\2\uffff\2\101\1\uffff\1\115\1\uffff\3\101\1\uffff\1"+
        "\122\1\uffff\3\101\2\uffff\1\124\1\101\1\114\1\uffff\1\117\1\122"+
        "\1\124\3\uffff\1\101\1\105\1\101\1\uffff\1\101\2\uffff\1\104\1\uffff"+
        "\2\101\1\105\3\uffff\2\101\1\105\2\uffff\1\101\1\124\2\101\1\127"+
        "\1\uffff\2\101\2\uffff\2\101\1\uffff\1\122\1\101\2\uffff\1\101\1"+
        "\uffff\1\101\1\123\3\uffff\1\101\1\uffff\1\114\1\103\1\101\3\uffff"+
        "\1\101\1\uffff\1\114\1\122\1\116\1\44\1\uffff\1\101\1\uffff\1\104"+
        "\1\101\2\uffff\1\101\2\uffff\1\101\1\uffff\1\101\2\uffff\1\101\4"+
        "\uffff\1\101\3\uffff\1\105\1\uffff\1\101\1\105\2\uffff\1\101\1\105"+
        "\1\101\2\uffff\1\101\6\uffff\1\101\1\uffff\1\101\1\uffff\1\101\5"+
        "\uffff";
    static final String DFA8_maxS =
        "\1\172\1\124\1\uffff\1\117\2\uffff\1\122\1\uffff\1\130\2\uffff\2"+
        "\122\1\75\1\124\1\116\1\117\1\uffff\1\75\1\111\1\uffff\1\117\2\122"+
        "\2\uffff\1\125\1\uffff\1\124\1\uffff\1\122\1\uffff\1\123\1\124\1"+
        "\101\1\104\4\uffff\1\71\3\uffff\1\123\1\104\1\103\1\172\1\114\1"+
        "\122\1\105\1\123\1\124\1\106\1\115\1\101\1\104\1\120\1\101\1\172"+
        "\1\122\1\105\2\124\1\172\2\uffff\1\117\1\122\1\115\1\111\1\115\1"+
        "\114\1\101\1\172\1\126\1\124\1\123\1\115\3\uffff\1\104\1\130\1\124"+
        "\2\172\1\114\1\105\1\117\1\123\1\111\1\124\1\107\1\104\1\124\1\116"+
        "\1\126\1\122\1\116\1\114\1\116\1\105\2\122\1\116\1\130\1\105\1\172"+
        "\1\101\1\122\1\114\1\111\1\114\1\101\1\111\1\122\1\uffff\4\172\1"+
        "\uffff\1\114\1\44\1\101\1\117\1\172\1\101\2\172\1\127\2\172\1\123"+
        "\1\uffff\3\172\1\125\1\117\1\uffff\1\114\1\172\1\105\1\116\1\105"+
        "\1\117\1\102\2\uffff\1\125\1\172\1\105\1\124\2\172\1\124\1\104\1"+
        "\172\1\105\1\44\1\124\1\115\1\172\1\122\2\uffff\1\172\1\113\1\124"+
        "\1\105\2\172\1\116\1\uffff\1\104\1\101\1\172\1\124\1\125\1\110\3"+
        "\172\1\105\1\114\1\116\1\172\1\117\2\172\1\105\1\172\1\120\1\122"+
        "\1\44\2\172\1\124\1\116\1\uffff\1\103\2\172\1\116\1\117\1\102\1"+
        "\124\1\101\4\uffff\1\172\1\uffff\2\122\1\uffff\1\172\2\uffff\1\172"+
        "\2\uffff\1\110\3\uffff\1\102\1\172\1\117\2\uffff\1\115\2\172\1\124"+
        "\1\172\1\124\1\uffff\1\122\1\44\2\uffff\2\172\1\uffff\1\115\1\uffff"+
        "\1\172\2\101\1\uffff\1\122\1\uffff\3\172\2\uffff\1\124\1\172\1\114"+
        "\1\uffff\1\117\1\122\1\124\3\uffff\1\172\1\105\1\172\1\uffff\1\101"+
        "\2\uffff\1\104\1\uffff\2\172\1\105\3\uffff\2\172\1\105\2\uffff\1"+
        "\172\1\124\2\172\1\127\1\uffff\2\172\2\uffff\2\172\1\uffff\1\122"+
        "\1\172\2\uffff\1\172\1\uffff\1\172\1\123\3\uffff\1\172\1\uffff\1"+
        "\114\1\103\1\172\3\uffff\1\172\1\uffff\1\114\1\122\1\116\1\44\1"+
        "\uffff\1\172\1\uffff\1\104\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff"+
        "\1\172\2\uffff\1\172\4\uffff\1\172\3\uffff\1\105\1\uffff\1\172\1"+
        "\105\2\uffff\1\172\1\105\1\172\2\uffff\1\172\6\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\5\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\uffff\1\12\1\14\1\uffff\1\21\1\uffff\1\24\1\26\6"+
        "\uffff\1\65\2\uffff\1\71\3\uffff\1\105\1\113\1\uffff\1\124\1\uffff"+
        "\1\131\1\uffff\1\150\4\uffff\1\162\1\163\1\164\1\165\1\uffff\1\167"+
        "\1\170\1\171\25\uffff\1\40\1\37\14\uffff\1\67\1\72\1\66\43\uffff"+
        "\1\166\4\uffff\1\5\14\uffff\1\30\5\uffff\1\36\7\uffff\1\51\1\52"+
        "\17\uffff\1\77\1\101\7\uffff\1\112\31\uffff\1\151\10\uffff\1\1\1"+
        "\3\1\4\1\6\1\uffff\1\10\2\uffff\1\15\1\uffff\1\17\1\20\1\uffff\1"+
        "\23\1\25\1\uffff\1\31\1\32\1\33\3\uffff\1\43\1\42\6\uffff\1\54\2"+
        "\uffff\1\57\1\60\2\uffff\1\63\1\uffff\1\70\3\uffff\1\75\1\uffff"+
        "\1\102\3\uffff\1\107\1\110\3\uffff\1\116\3\uffff\1\122\1\123\1\125"+
        "\3\uffff\1\132\1\uffff\1\134\1\135\1\uffff\1\137\3\uffff\1\143\1"+
        "\144\1\145\3\uffff\1\153\1\154\5\uffff\1\7\2\uffff\1\16\1\22\2\uffff"+
        "\1\35\2\uffff\1\45\1\46\1\uffff\1\50\2\uffff\1\56\1\61\1\62\1\uffff"+
        "\1\73\3\uffff\1\103\1\104\1\106\1\uffff\1\114\4\uffff\1\126\1\uffff"+
        "\1\130\2\uffff\1\140\1\141\1\uffff\1\146\1\147\1\uffff\1\155\1\uffff"+
        "\1\157\1\160\1\uffff\1\11\1\13\1\27\1\34\1\uffff\1\44\1\47\1\53"+
        "\1\uffff\1\64\2\uffff\1\100\1\111\3\uffff\1\121\1\127\1\uffff\1"+
        "\136\1\142\1\152\1\156\1\161\1\41\1\uffff\1\74\1\uffff\1\115\1\uffff"+
        "\1\120\1\133\1\55\1\76\1\117";
    static final String DFA8_specialS =
        "\u017d\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\52\2\uffff\1\52\22\uffff\1\53\1\uffff\1\46\1\uffff\1\44\1"+
            "\45\1\2\1\uffff\1\21\1\33\1\37\1\30\1\5\1\24\1\51\1\7\12\50"+
            "\1\4\1\35\1\22\1\11\1\15\1\31\1\uffff\1\1\1\47\1\3\1\6\1\10"+
            "\1\13\1\14\1\16\1\17\2\47\1\20\1\23\1\25\1\26\1\27\1\47\1\32"+
            "\1\34\1\36\1\40\1\41\1\42\1\43\2\47\3\uffff\1\12\2\uffff\32"+
            "\47",
            "\1\54\13\uffff\1\55\4\uffff\1\56\1\57",
            "",
            "\1\60\6\uffff\1\61\3\uffff\1\62\2\uffff\1\63",
            "",
            "",
            "\1\64\3\uffff\1\65\3\uffff\1\66\10\uffff\1\67",
            "",
            "\1\70\11\uffff\1\71",
            "",
            "",
            "\1\72\1\uffff\1\73\1\74\2\uffff\1\75",
            "\1\76\11\uffff\1\77\2\uffff\1\100",
            "\1\101",
            "\1\103\3\uffff\1\104\1\uffff\1\105\2\uffff\1\106\2\uffff\1"+
            "\107\1\110\3\uffff\1\111",
            "\1\112\7\uffff\1\113",
            "\1\114\3\uffff\1\115\5\uffff\1\116",
            "",
            "\1\120\34\uffff\1\117",
            "\1\122",
            "",
            "\1\123\11\uffff\1\124",
            "\1\125\3\uffff\1\126",
            "\1\127\1\130\6\uffff\1\131\2\uffff\1\132\2\uffff\1\133",
            "",
            "",
            "\1\134\3\uffff\1\135\4\uffff\1\136\1\137\5\uffff\1\140",
            "",
            "\1\141\1\uffff\1\142\3\uffff\1\143\1\144\1\145\6\uffff\1\146"+
            "\1\147\2\uffff\1\150",
            "",
            "\1\151\3\uffff\1\152\2\uffff\1\153\6\uffff\1\154\2\uffff\1"+
            "\155",
            "",
            "\1\156",
            "\1\157\12\uffff\1\160\3\uffff\1\161\3\uffff\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "",
            "\1\51\1\uffff\12\50",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\15\47\1\171\14\47\6\uffff\32\47",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176\6\uffff\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\32\47\6\uffff\32\47",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b\1\u008c",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\32\47\6\uffff\32\47",
            "\1\u0096\54\uffff\1\u0097\3\uffff\1\u0098\1\uffff\1\u0099",
            "\1\u009a\7\uffff\1\u009b\5\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e\5\uffff\1\u009f\5\uffff\1\u00a0",
            "",
            "",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3\1\uffff\1\u00a4",
            "\4\47\1\u00a5\25\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\4\uffff\1\u00ac\2\uffff\1\u00ad",
            "\1\u00af\45\uffff\1\u00ae",
            "\1\u00b0\1\uffff\1\u00b1\11\uffff\1\u00b2\5\uffff\1\u00b3\1"+
            "\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\20\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf\1\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2\11\uffff\1\u00c3\2\uffff\1\u00c4",
            "\1\u00c5\13\uffff\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\32\47\6\uffff\32\47",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\32\47\6\uffff\32\47",
            "\1\u00db",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u00de",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u00e1",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7",
            "\1\u00e8\16\uffff\32\47\6\uffff\32\47",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "",
            "\1\u00ef",
            "\32\47\6\uffff\32\47",
            "\1\u00f1",
            "\1\u00f2",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u00f5",
            "\1\u00f6",
            "\32\47\6\uffff\32\47",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\21\47\1\u00fc\10\47\6\uffff\32\47",
            "\1\u00fe",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\32\47\6\uffff\32\47",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\32\47\6\uffff\32\47",
            "\1\u0113",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u0116",
            "\32\47\6\uffff\32\47",
            "\1\u0118",
            "\1\u0119\1\uffff\1\u011a",
            "\1\u011b",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "",
            "",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u0129",
            "\1\u012a",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\1\u012d",
            "",
            "",
            "",
            "\1\u012e",
            "\32\47\6\uffff\32\47",
            "\1\u0130",
            "",
            "",
            "\1\u0131",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u0134",
            "\32\47\6\uffff\32\47",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u013b",
            "",
            "\32\47\6\uffff\32\47",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\1\u0143",
            "\32\47\6\uffff\32\47",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "\1\u014a",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u014c",
            "",
            "",
            "\1\u014d",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u0150",
            "",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u0153",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "\1\u0155",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "\1\u0158",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u015d",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\32\47\6\uffff\32\47",
            "\1\u0161",
            "",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u0163",
            "\1\u0164",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\1\u016c",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "",
            "\1\u0173",
            "",
            "\32\47\6\uffff\32\47",
            "\1\u0175",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "\1\u0177",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "\32\47\6\uffff\32\47",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ABS | AMPERSAND | AND | ASC | AT | ATN | CALL | CHR | CLEAR | COLON | COLOR | COMMA | COS | DATA | DEF | DIM | DIV | DRAW | END | EQ | EXP | EXPONENT | FLASH | FN | FOR | FRE | GET | GOSUB | GOTO | GR | GT | GTE | HCOLOR | HGR | HGR2 | HIMEM | HLIN | HOME | HPLOT | HTAB | IF | INNUMBER | INPUT | INTF | INVERSE | LEFT | LEN | LET | LIST | LOAD | LOG | LOMEM | LPAREN | LT | LTE | MID | MINUS | NEQ | NEXT | NORMAL | NOT | NOTRACE | ON | ONERR | OR | PDL | PEEK | PLOT | PLUS | POKE | POP | POS | PRINT | PRNUMBER | QUESTION | READ | RECALL | REM | RESTORE | RETURN | RIGHT | RND | ROT | RPAREN | RUN | SAVE | SCALE | SCRN | SEMICOLON | SGN | SHLOAD | SIN | SPC | SPEED | SQR | STEP | STOP | STORE | STR | TAB | TAN | TEXT | THEN | TIMES | TO | TRACE | USR | VAL | VLIN | VPLOT | VTAB | WAIT | XDRAW | T__124 | T__125 | STRINGLITERAL | LETTERS | NUMBER | FLOAT | CR | WS );";
        }
    }
 

}