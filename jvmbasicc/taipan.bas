 10  CLEAR :WK$ = "*":CH$ = "*":C
     H% = 0:WU% = 0:R1% = 0:I = 0
     :J = 0:K = 0:II = 0:IJ = 0:I
     K = 0:T = 300:LT =  LOG (10)
     :T$ = "Taipan": GOTO 10000
 90  REM 
 92  FOR II = 1 TO T:II = II + ( PEEK 
     ( - 16384) > 127) * 9999: NEXT 
     II
 94  FOR II = 1 TO T / 2:II = II + 
     ( PEEK ( - 16384) > 127) * 9999: NEXT II
 96  FOR II = 1 TO T / 2:II = II + 
     ( PEEK ( - 16384) > 127) * 9999: NEXT II
 98  POKE  - 16368,0: RETURN 
 100  CALL 2560: RETURN 
 150 WK$ = "" + "         ": CALL 
     2680:W =  VAL (WK$):R1% =  LEFT$ 
     (WK$,1) = "A": RETURN 
 200  REM  
 210  PRINT FS$;HM$;CS$; SPC( 12 - 
      LEN (H$) / 2): PRINT "Firm:
      ";CA$;H$;CS$;", ";:X =  USR 
     (1): PRINT 
 220  VTAB 2: PRINT CG$;"[";: & 4
     5,26: PRINT "]": FOR II = 1 TO 
     5: PRINT "!"; TAB( 28);"!": NEXT 
     II: PRINT "(";: & 61,26: PRINT 
     ")": FOR II = 1 TO 5: PRINT 
     "!"; TAB( 28);"!": NEXT II: PRINT 
     "<";: & 58,26: PRINT ">";CS$
     
 230  VTAB 3: HTAB 2:X =  USR (1)
      +  USR (2): VTAB 4: HTAB 21
     : PRINT "In use:": VTAB 6: HTAB 
     21: PRINT "Vacant:": VTAB 9:
      HTAB 2: PRINT "Hold        
        Guns";
 240  FOR II = 3 TO 9 STEP 6: FOR 
     IJ = 1 TO 4: VTAB II + IJ: HTAB 
     5: PRINT  LEFT$ (CO$(IJ),7);
     : NEXT IJ,II
 250  VTAB 3: HTAB 33: PRINT "Dat
     e": VTAB 6: HTAB 31:X =  USR 
     (3): VTAB 9: HTAB 33: PRINT 
     "Debt": VTAB 12: HTAB 29: PRINT 
     " Ship status":
 260  VTAB 16: HTAB 1: PRINT CG$;
     : & 45,40: PRINT CS$
 270  RETURN 
 300  REM 
 310  VTAB 4: HTAB 30: PRINT "15 
         ";YE: VTAB 4: HTAB 33: PRINT 
     IV$; MID$ ("JanFebMarAprMayJ
     unJulAugSepOctNovDec",(MO - 
     1) * 3 + 1,3);NV$
 311  VTAB 7: HTAB 31: PRINT "   
           ": VTAB 7: HTAB 35 -  LEN 
     (LO$(LO)) / 2 + .5: PRINT IV
     $;LO$(LO);NV$
 312  VTAB 10: HTAB 29: PRINT "  
               ": VTAB 10:WW = DW
     : GOSUB 600: HTAB 35 -  LEN 
     (WW$) / 2: PRINT IV$;WW$;NV$
     
 313 WW = 100 -  INT (DM / SC * 1
     00 + .5):WW = WW * (WW > 0):
     W =  INT (WW / 20): VTAB 13:
      HTAB 30: IF W < 2 THEN  PRINT 
     IV$;
 314  PRINT ST$(W);":";WW;: IF  PEEK 
     (36) > 30 THEN  PRINT  TAB( 
     40);" ";
 315  PRINT NV$;
 316  VTAB 5: HTAB 22: PRINT "   
       ";: HTAB 22: PRINT WS: VTAB 
     7: HTAB 22: PRINT "     ";: HTAB 
     22: PRINT WC - WS
 320  POKE 32,12: FOR II = 1 TO 2
     : POKE 33,(II - 1) * 9 + 6:I
     K = II * 6 - 3: POKE 34,IK: POKE 
     35,IK + 4: PRINT HM$: FOR IJ
      = 1 TO 4: VTAB IK + IJ: HTAB 
     1: PRINT ST(II,IJ);: NEXT IJ
     ,II
 330  PRINT FS$: VTAB 15: HTAB 1:
     WW = CA: GOSUB 600: PRINT "C
     ash:";WW$; TAB( 21);:WW = BA
     : GOSUB 600: PRINT "Bank:";W
     W$; TAB( 40);" ": VTAB 9: HTAB 
     22: PRINT GN;: HTAB 7: PRINT 
     "        ";: HTAB 7
 340  IF MW < 0 THEN  PRINT IV$;"
     Overload";NV$
 350  IF MW >  = 0 THEN  PRINT MW
     ;
 360  RETURN 
 400  REM 
 410  POKE 32,0: POKE 33,40: POKE 
     34,18: POKE 35,24: PRINT HM$
     ;: RETURN 
 480  VTAB 17: HTAB 1:X =  USR (4
     ): RETURN 
 490  VTAB 17: HTAB 1:X =  USR (5
     ): RETURN 
 500  REM 
 510  GOSUB 400:X =  USR (6): GOSUB 
     150: IF R1% THEN W = CA
 530  IF CA >  = W THEN CA = CA - 
     W:BA = BA + W: GOSUB 300: GOTO 
     550
 540  PRINT : PRINT : PRINT T$;:X
      =  USR (8): PRINT CA: PRINT 
     "in cash.": CALL 2518: GOSUB 
     94: GOTO 510
 550  GOSUB 400:X =  USR (7): GOSUB 
     150: IF R1% THEN W = BA
 570  IF BA >  = W THEN BA = BA - 
     W:CA = CA + W: GOSUB 300: GOTO 
     590
 580  PRINT : PRINT : PRINT T$;:X
      =  USR (8): PRINT BA: PRINT 
     "in the bank.": CALL 2518: GOSUB 
     94: GOTO 550
 590  RETURN 
 600  IF WW < 1E6 THEN WW$ =  STR$ 
     ( INT (WW)): RETURN 
 610 II =  INT ( LOG (WW) / LT):I
     J =  INT (II / 3) * 3:IK = 1
     0 ^ (II - 2):WW$ =  LEFT$ ( STR$ 
     ( INT (WW / IK + .5) * IK / 
     10 ^ IJ),4) + " "
 620  IF IJ = 3 THEN W$ = "Thousa
     nd"
 630  IF IJ = 6 THEN W$ = "Millio
     n"
 640  IF IJ = 9 THEN W$ = "Billio
     n"
 650  IF IJ = 12 THEN W$ = "Trill
     ion"
 680 WW$ = WW$ + W$
 690  RETURN 
 1000  REM 
 1010  IF D <  > 0 THEN  GOSUB 49
     0: GOSUB 400:X =  USR (9): PRINT 
     LO$(D): GOSUB 96:BA =  INT (
     BA + BA * .005):DW =  INT (D
     W + DW * .1):TI = TI + 1:MO = 
     MO + 1:LO = D
 1020  IF MO > 12 THEN YE = YE + 
     1:MO = 1:EC = EC + 10:ED = E
     D + .5: FOR I = 1 TO 7: FOR 
     J = 1 TO 4:BP%(I,J) = BP%(I,
     J) +  FN R(2): NEXT J,I
 1030  GOSUB 400: GOSUB 480: GOSUB 
     300: IF LO <  > 1 THEN 1500
 1040  IF LI <  > 0 OR CA = 0 THEN 
     1120
 1050 WW = 0:W = 1.8: IF TI > 12 THEN 
     WW =  FN R(1000 * TI) + 1000
      * TI:W = 1
 1060 I =  FN R(CA / W) + WW:WW = 
     I: GOSUB 600: GOSUB 400:X = 
      USR (10): PRINT WW$;" ";:X = 
      USR (11):CH$ = "NY": GOSUB 
     100: IF CH% <  > 2 THEN 1120
     
 1065 LI = 1:CA = CA - I: IF CA > 
     0 THEN 1100
 1070  GOSUB 400: PRINT T$;:X =  USR 
     (12): CALL 2512: PRINT : PRINT 
     :X =  USR (13):CH$ = "YN": GOSUB 
     100
 1080  IF CH% = 1 THEN DW = DW - 
     CA:CA = 0: GOSUB 400:X =  USR 
     (14): CALL 2521: GOSUB 94
 1090  IF CH% = 2 THEN CA = 0:LI = 
     0: GOSUB 400:X =  USR (15): PRINT 
     T$;".": CALL 2518: GOSUB 94
 1100  GOSUB 300
 1120  IF DM = 0 THEN 1210
 1130  GOSUB 400: PRINT T$;:X =  USR 
     (16):CH$ = "YN": GOSUB 100: IF 
     CH% = 2 THEN 1210
 1140 BR =  INT (( FN R(60 * (TI + 
     3) / 4) + 25 * (TI + 3) / 4)
      * SC / 50)
 1142 WW =  INT (DM / SC * 100 + 
     .5)
 1145  GOSUB 400:X =  USR (17): PRINT 
     WW;"% damaged.": PRINT :WW = 
     BR * DM + 1: GOSUB 600:X =  USR 
     (18): PRINT WW$;","
 1150 X =  USR (19): GOSUB 150: IF 
     R1% = 1 THEN W = BR * DM + 1
     : IF CA < W THEN W = CA
 1155  IF CA < W THEN  GOSUB 400:
      PRINT T$;:X =  USR (12): GOSUB 
     96: GOTO 1142
 1160 WW =  INT (W / BR + .5):DM = 
     DM - WW:CA = CA - W:DM =  INT 
     (DM * (DM > 0)): GOSUB 300: GOSUB 
     400
 1210  IF DW < 10000 OR WN OR D = 
     0 THEN 1300
 1220  GOSUB 400: PRINT "Elder Br
     other Wu has sent "; FN R(10
     0) + 50;" braves": PRINT "to
      escort you to the Wu mansio
     n, ";T$;".":WN = 1: GOSUB 94
     
 1230  GOSUB 400:X =  USR (20): GOSUB 
     92
 1240  GOSUB 400:X =  USR (21): PRINT 
     T$;".";: GOSUB 92
 1300  REM 
 1310  GOSUB 400:X =  USR (22):CH
     $ = "NY":WU% = 1: GOSUB 100:
     WU% = 0: IF CH% <  > 2 THEN 
     1500
 1320 W = 0: FOR I = 1 TO 2: FOR 
     J = 1 TO 4:W = W + ST(I,J): NEXT 
     J,I: IF CA OR BA OR W OR GN THEN 
     1360
 1330 BL% = BL% + 1:I =  INT ( FN 
     R(1500) + 500):J =  FN R(200
     0) * BL% + 1500: GOSUB 400: PRINT 
     "Elder Brother is aware of y
     our plight,  ";T$;".  He is 
     willing to loan you an   add
     itional ";I;" if you will pa
     y back"
 1340  PRINT J;". Are you willing
     , ";T$;"? ";:CH$ = "YN": GOSUB 
     100: IF CH% = 2 THEN  GOSUB 
     400: PRINT : PRINT "Very wel
     l, Taipan, the game is over!
     ": CALL 2512: GOTO 2698
 1350 CA = CA + I:DW = DW + J: GOSUB 
     400: PRINT "Very well, ";T$;
     ".  Good joss!!": CALL 2521:
      GOSUB 300: GOSUB 96: GOTO 1
     500
 1360  IF DW = 0 OR CA = 0 THEN 1
     400
 1370  GOSUB 400:X =  USR (23): GOSUB 
     150: IF R1% THEN W = CA: IF 
     CA > DW THEN W = DW
 1380  IF CA >  = W THEN CA = CA - 
     W:DW = DW - W: GOSUB 300: GOTO 
     1400
 1390  PRINT : PRINT : PRINT T$;"
     , you have only ";CA: PRINT 
     "in cash.": CALL 2518: GOSUB 
     94: GOTO 1370
 1400  GOSUB 400:X =  USR (24): GOSUB 
     150: IF R1% THEN W = 2 * CA
 1420  IF CA * 2 >  = W THEN CA = 
     CA + W:DW = DW + W: GOSUB 30
     0: GOTO 1450
 1430  PRINT : PRINT : PRINT "He 
     won't loan you so much, ";T$
     ;"!": CALL 2518: GOSUB 94: GOTO 
     1400
 1450  REM 
 1460  IF DW > 20000 AND  NOT ( FN 
     R(5)) THEN  GOSUB 400: PRINT 
     "Bad joss!!": PRINT  FN R(3)
      + 1;" of your bodyguards ha
     ve been killed": PRINT "by c
     utthroats and you have been 
     robbed  of all your cash, ";
     T$;"!!": CALL 2512:CA = 0: GOSUB 
     300: GOSUB 94
 1500  REM 
 1610 I =  INT (1000 +  FN R(1000
      * (TI + 5) / 6)) * ( INT (S
     C / 50) * (DM > 0) + 1): IF 
     CA < I OR  FN R(4) THEN 1700
     
 1615 W$ =  CHR$ (15) +  CHR$ (15
     ) + "damaged       _______" +  CHR$ (15) + 
      CHR$ (16) + "fine":WW = I: GOSUB 
     600
 1620  GOSUB 400: PRINT "Do you w
     ish to trade in your "; MID$ 
     (W$,(DM = 0) * 25 + 1,25): PRINT 
     "ship for one with 50 more c
     apacity by   paying an addit
     ional ";WW$;", ";T$;"? ";
 1630 CH$ = "YN": GOSUB 100: IF C
     H% = 1 THEN CA = CA - I:MW = 
     MW + 50:SC = SC + 50:DM = 0:
      GOSUB 300
 1700  REM 
 1710 I =  INT ( FN R(1000 * (TI + 
     5) / 6) + 500): IF CA < I OR 
      FN R(3) THEN 1900
 1720 WW = I: GOSUB 600: GOSUB 400: PRINT "Do you wish to buy
      a ship's gun": PRINT "for "
     ;WW$;", ";T$;"? ";:CH$ = "NY
     ": GOSUB 100: IF CH% = 1 THEN 
     1900
 1730  IF MW >  = 10 THEN CA = CA
      - I:GN = GN + 1:MW = MW - 1
     0: GOSUB 300: GOTO 1900
 1740  PRINT : PRINT : PRINT "You
     r ship would be overburdened
     , ";T$;"!": CALL 2518: GOSUB 
     94
 1900  IF ST(2,1) = 0 OR LO = 1 OR 
      FN R(18) THEN 2000
 1910 I =  FN R(CA / 1.8):WW = I:
      GOSUB 600: GOSUB 400: CALL 
     2512:X =  USR (25) +  USR (2
     6): PRINT WW$;", ";T$;"!":MW
      = MW + ST(2,1):ST(2,1) = 0:
     CA = CA - I: GOSUB 300: GOSUB 
     94
 2000 W = 0: FOR J = 1 TO 4:W = W
      + ST(1,J): NEXT J: IF W = 0
      OR  FN R(50) THEN 2100
 2030  GOSUB 400: CALL 2512:X =  USR 
     (25) +  USR (27): PRINT T$;"
     !": FOR J = 1 TO 4:W = ST(1,
     J):WW =  FN R(W / 1.8):WS = 
     WS - W + WW:ST(1,J) = WW: NEXT 
     J: GOSUB 300: GOSUB 96
 2100  FOR I = 1 TO 4:CP(I) = BP%
     (LO,I) / 2 * ( FN R(3) + 1) * 
     10 ^ (4 - I): NEXT I
 2310 LI = LI AND  FN R(20): IF L
     I = 0 AND LI% > 0 THEN LI% = 
     LI% + 1: IF LI% > 4 THEN LI%
      = 0
 2330  IF LI = 0 AND LO <  > 1 AND 
      FN R(4) THEN  GOSUB 400:X = 
      USR (28): CALL 2521: GOSUB 
     94
 2410  IF  FN R(9) THEN 2500
 2420  GOSUB 400:I =  FN R(4) + 1
     :J =  FN R(2):K =  FN R(2) * 
     5: PRINT T$;"!!  The price o
     f ";CO$(I)
 2430  IF J = 0 THEN CP(I) =  INT 
     (CP(I) / 5): PRINT "has drop
     ped to ";CP(I);"!!": CALL 25
     18
 2440  IF J = 1 THEN CP(I) = CP(I
     ) * ( FN R(5) + 5):WW = CP(I
     ): GOSUB 600: PRINT "has ris
     en to ";WW$;"!!": CALL 2518
 2450  GOSUB 94
 2500  REM 
 2501  GOSUB 400: IF CA > 25000 AND 
      NOT ( FN R(20)) THEN I =  FN 
     R(CA / 1.4):WW = I: GOSUB 60
     0:X =  USR (25): PRINT "You'
     ve been beaten up and robbed
      of": PRINT WW$;" in cash, "
     ;T$;"!!": CALL 2512:CA = CA - 
     I: GOSUB 300: GOSUB 94: VTAB 
     22: HTAB 1: PRINT CE$
 2510  GOSUB 400: PRINT T$;:X =  USR 
     (29)
 2515  FOR I = 1 TO 3 STEP 2: PRINT 
      TAB( 4); LEFT$ (CO$(I),7);"
     : ";CP(I); TAB( 18); LEFT$ (
     CO$(I + 1),7);": ";CP(I + 1)
     : NEXT I
 2520 I = CA + BA - DW: VTAB 22: HTAB 
     1: PRINT CE$
 2522  IF LO <  > 1 THEN X =  USR 
     (30):CH$ = "BSQ"
 2524  IF LO = 1 AND I < 1E6 THEN 
     X =  USR (31) +  USR (32):CH
     $ = "BSQTV"
 2526  IF LO = 1 AND I >  = 1E6 THEN 
     X =  USR (31) +  USR (33):CH
     $ = "BSQTVR"
 2528  GOSUB 100: ON CH% GOTO 253
     0,2570,2700,2620,2680,2695
 2530  VTAB 23: HTAB 1: PRINT CE$
     ;"What do you wish me to buy
     , ";T$;"? ";:CH$ = "OSAG": GOSUB 
     100:CO$ = CO$(CH%):CP = CP(C
     H%)
 2540  VTAB 22: HTAB 1: PRINT CE$
     ,IV$;: HTAB 31: PRINT " You 
     can ";: VTAB 23: HTAB 31: PRINT 
     "  afford ";: VTAB 24: HTAB 
     31: PRINT "         ";:W =  INT 
     (CA / CP): IF W > 1E9 THEN W
      = 1E9 - 1
 2542  HTAB 36 -  LEN ( STR$ (W))
      / 2: PRINT W;NV$;: VTAB 23:
      HTAB 1: PRINT "How much ";C
     O$;" shall": PRINT "I buy, "
     ;T$;"? ";: GOSUB 150: IF R1%
      THEN W =  INT (CA / CP): IF 
     W > 1E9 THEN W = 1E9 - 1
 2550  IF W < 0 OR CA < W * CP THEN 
      CALL 2524: GOTO 2540
 2560 MW = MW - W:CA = CA - W * C
     P:ST(2,CH%) = ST(2,CH%) + W:
      GOSUB 300: VTAB 22: HTAB 1:
      CALL  - 958: GOTO 2520
 2570  VTAB 23: HTAB 1: PRINT CE$
     ;"What do you wish me to sel
     l, ";T$;"? ";:CH$ = "OSAG": GOSUB 
     100:CO$ = CO$(CH%):CP = CP(C
     H%)
 2580  VTAB 22: HTAB 1: PRINT CE$
     : PRINT "How much ";CO$;" sh
     all": PRINT "I sell, ";T$;"?
      ";: GOSUB 150: IF R1% THEN 
     W = ST(2,CH%)
 2590  IF W < 0 OR ST(2,CH%) < W THEN 
      CALL 2524: GOTO 2580
 2600 MW = MW + W:CA = CA + W * C
     P:ST(2,CH%) = ST(2,CH%) - W:
      GOSUB 300: VTAB 22: HTAB 1:
      PRINT CE$;: GOTO 2520
 2620  REM 
 2622 W = 0: FOR I = 1 TO 2: FOR 
     J = 1 TO 4:W = W + ST(I,J): NEXT 
     J,I: IF W = 0 THEN  VTAB 22:
      HTAB 1: PRINT CE$;"You have
      no cargo, ";T$;".": CALL 25
     18: GOSUB 94: GOTO 2520
 2624  FOR J = 1 TO 4: FOR K = 1 TO 
     2:I = 3 - K: IF ST(I,J) = 0 THEN 
     2634
 2626  GOSUB 400: PRINT "How much
      ";CO$(J);" shall I move": PRINT 
      MID$ ("to the warehouseaboa
     rd ship",K * 16 - 15,16);", 
     ";T$;"? ";: GOSUB 150: IF R1
     % THEN W = ST(I,J): IF W > (
     WC - WS) AND K = 1 THEN W = 
     (WC - WS)
 2627  IF K = 2 THEN 2630
 2628  IF W > 0 AND WS = WC THEN 
      PRINT : PRINT : PRINT "Your
      warehouse is full, ";T$;"!"
     : CALL 2518: GOSUB 94: GOTO 
     2626
 2629  IF W > (WC - WS) THEN  PRINT 
     : PRINT : PRINT "Your wareho
     use will only hold an": PRINT 
     "additional ";WC - WS;", ";T
     $;"!";: CALL 2518: GOSUB 94:
      GOTO 2626
 2630  IF W > ST(I,J) THEN  PRINT 
     : PRINT : PRINT "You have on
     ly ";ST(I,J);", ";T$;".": CALL 
     2518: GOSUB 94: GOTO 2626
 2632 ST(I,J) = ST(I,J) - W:ST(K,
     J) = ST(K,J) + W:MW = MW +  SGN 
     (I - K) * W:WS = WS +  SGN (
     I - K) * W: GOSUB 300
 2634  NEXT K,J: GOTO 2500
 2680  REM 
 2690  GOSUB 500: GOTO 2500
 2695 OK = 16
 2696  GOSUB 400: PRINT IV$; TAB( 
     26): PRINT : PRINT " Y o u '
      r e    a"; TAB( 26): PRINT 
     : PRINT  TAB( 26): PRINT : PRINT 
     " M I L L I O N A I R E ! ":
      PRINT  TAB( 26): PRINT NV$:
      GOSUB 96
 2698 : GOSUB 20000
 2699  PRINT "Play again? ";:CH$ = 
     "NY": GOSUB 100: ON CH% GOTO 
     63999: RUN 
 2700  REM 
 2810  IF MW < 0 THEN  GOSUB 400:
      PRINT "You're ship is overl
     oaded, ";T$;"!!": CALL 2518:
      GOSUB 94: GOTO 2500
 3010  GOSUB 400: PRINT T$;", do 
     you wish to go to:": PRINT "
     1) Hong Kong, 2) Shanghai, 3
     ) Nagasaki, 4) Saigon, 5) Ma
     nila, 6) Singapore, or  7) B
     atavia ? ";
 3020 CH$ = "1234567": GOSUB 100:
     D = CH%: IF D = LO THEN  PRINT 
     : PRINT : PRINT "You're alre
     ady here, ";T$;".";: CALL 25
     18: GOSUB 94: GOTO 3010
 3030 LO = 0: GOSUB 300: GOSUB 40
     0: GOSUB 490
 3100  REM 
 3110  IF  FN R(BP) THEN 3200
 3120 SN =  FN R(SC / 10 + GN) + 
     1: GOSUB 400: CALL 2512: PRINT 
     SN;" hostile ship"; MID$ ("s
     ",(SN = 1) + 1,1);" approach
     ing, ";T$;"!!": GOSUB 96:F1 = 
     1: GOTO 5000
 3200  REM 
 3210  IF  FN R(4 + 8 * LI) THEN 
     3300
 3220  GOSUB 400: PRINT "Li Yuen'
     s pirates, ";T$;"!!": CALL 2
     521: GOSUB 94: IF LI THEN  PRINT 
     : PRINT "Good joss!! They le
     t us be!!": CALL 2521: GOSUB 
     94: GOTO 3300
 3230 SN =  FN R(SC / 5 + GN) + 5
     : GOSUB 400: PRINT SN;" ship
     s of Li Yuen's pirate": PRINT 
     "fleet, ";T$;"!!": CALL 2512
     : GOSUB 94:F1 = 2: GOTO 5000
     
 3300  REM 
 3310  IF  FN R(10) THEN 3350
 3320  GOSUB 400: PRINT "Storm, "
     ;T$;"!!": CALL 2521: GOSUB 9
     4: IF  NOT ( FN R(30)) THEN 
      PRINT : PRINT "   I think w
     e're going down!!": CALL 252
     1: GOSUB 94: IF  FN R(DM / S
     C * 3) THEN  PRINT : PRINT "
     We're going down, Taipan!!":
      CALL 2512:OK = 1: GOTO 2698
     
 3330  PRINT : PRINT "    We made
      it!!": CALL 2521: GOSUB 94:
      IF  FN R(3) THEN 3350
 3340 LO =  FN R(7) + 1: ON (LO = 
     D) GOTO 3340: GOSUB 400: PRINT 
     "We've been blown off course
     ": PRINT "to ";LO$(LO):D = L
     O: GOSUB 94
 3350 LO = D: GOTO 1000
 5000  REM 
 5030 LC = 0:CMD = 0: PRINT FS$;H
     M$
 5050  VTAB 1: HTAB 1: PRINT "   
       ships attacking, ";T$;"!":
      VTAB 1: HTAB 32: PRINT CG$;
     "!": VTAB 2: HTAB 32: PRINT 
     "!": VTAB 3: HTAB 32: PRINT 
     "<::::::::";CS$: VTAB 2: HTAB 
     37: PRINT "guns": VTAB 1: HTAB 
     34: PRINT "We have";
 5060  PRINT "Your orders are to:
     "
 5080  FOR I = 0 TO 9:AM%(I,0) = 
     0:AM%(I,1) = 0: NEXT I:SA = 
     SN:S0 = SN:BT =  FN R(TI / 4
      * 1000 * SN ^ 1.05) +  FN R
     (1000) + 250:SS = 0
 5090  REM 
 5100  GOSUB 5760: GOSUB 5700:LC = 
     CMD: VTAB 12: HTAB 40: PRINT 
      MID$ ("+ ", NOT (SA) + 1,1)
     
 5160 DM =  INT (DM):WW = 100 -  INT 
     (DM / SC * 100): IF WW < 0 THEN 
     WW = 0
 5162  VTAB 4: PRINT "Current sea
     worthiness: ";ST$( INT (WW / 
     20));" (";WW;"%)": GOSUB 560
     0: VTAB 4: PRINT CL$
 5165  IF WW = 0 THEN OK = 0: GOTO 
     5900
 5175  GOSUB 5600
 5180  ON CMD GOTO 5200,5300,5400
     
 5190  VTAB 4: PRINT T$;", what s
     hall we do??": CALL 2512: GOSUB 
     5600: ON (CMD = 0) + 1 GOTO 
     5500,5180
 5200  REM 
 5205  VTAB 4: HTAB 1: PRINT CL$:
      VTAB 4: PRINT "Aye, we'll r
     un, ";T$;"!": GOSUB 96: VTAB 
     4: PRINT CL$
 5207  IF LC = 1 OR LC = 3 THEN O
     K = OK + IK:IK = IK + 1
 5208  IF LC = 0 OR LC = 2 THEN O
     K = 3:IK = 1
 5210  IF  FN R(OK) >  FN R(SN) THEN 
      VTAB 4: PRINT "We got away 
     from 'em, ";T$;"!!": CALL 25
     18: GOSUB 96: VTAB 4: PRINT 
     CL$:OK = 3: GOTO 5900
 5220  VTAB 4: PRINT "Can't lose 
     'em!!": GOSUB 5600: VTAB 4: PRINT 
     CL$
 5230  IF SN > 2 AND  FN R(5) = 0
      THEN W =  FN R(SN / 2) + 1:
     SN = SN - W:SA = SA - W: GOSUB 
     5680: GOSUB 5750: VTAB 4: PRINT 
     "But we escaped from ";W;" o
     f 'em, ";T$;"!": GOSUB 5600:
      VTAB 4: PRINT CL$
 5240  GOTO 5500
 5300  REM 
 5302  IF GN = 0 THEN  VTAB 4: HTAB 
     1: PRINT "We have no guns, "
     ;T$;"!!": GOSUB 5600: VTAB 4
     : PRINT CL$: GOTO 5500
 5305  VTAB 4: HTAB 1: PRINT CL$:
      VTAB 4: PRINT "Aye, we'll f
     ight 'em, ";T$;"!": GOSUB 56
     00: VTAB 4: PRINT CL$
 5310 SK = 0: VTAB 4: PRINT "We'r
     e firing on 'em, ";T$;"!": FOR 
     K = 1 TO GN: IF SN = 0 THEN 
     5340
 5320 I =  FN R(10): IF AM%(I,0) = 
     0 THEN 5320
 5330  GOSUB 5840:AM%(I,1) = AM%(
     I,1) +  FN R(30) + 10: IF AM
     %(I,1) > AM%(I,0) THEN AM%(I
     ,0) = 0:AM%(I,1) = 0: GOSUB 
     5860: GOSUB 5820:SK = SK + 1
     :SN = SN - 1:SS = SS - 1: GOSUB 
     5750: IF SS = 0 THEN  GOSUB 
     5700
 5340  NEXT K: IF SK > 0 THEN  VTAB 
     4: HTAB 1: PRINT "Sunk ";SK;
     " of the buggers, ";T$;"!": CALL 
     2521: GOSUB 5600: VTAB 4: PRINT 
     CL$
 5350  IF SK = 0 THEN  VTAB 4: HTAB 
     1: PRINT "Hit 'em, but didn'
     t sink 'em, ";T$;"!": GOSUB 
     5600: VTAB 4: PRINT CL$
 5360  IF  FN R(S0) < SN * .6 / F
     1 OR SN = 0 OR SN = S0 OR SN
      < 3 THEN 5500
 5362 W =  FN R(SN / 3 / F1) + 1:
     SN = SN - W:SA = SA - W: GOSUB 
     5680
 5390  VTAB 4: PRINT W;" ran away
     , ";T$;"!": GOSUB 5750: CALL 
     2521: GOSUB 5600: VTAB 4: PRINT 
     CL$: GOTO 5500
 5400  REM 
 5410  GOSUB 400: PRINT "You have
      the following on board, ";T
     $;":";: FOR J = 1 TO 4: VTAB 
     20 + (J = 3 OR J = 4): HTAB 
     1 + 19 * (J = 2 OR J = 4): PRINT 
      RIGHT$ ("         " +  LEFT$ 
     (CO$(J),7),9);": ";ST(2,J): NEXT 
     J
 5420  VTAB 4: PRINT "What shall 
     I throw overboard, ";T$;"? "
     ;:CH$ = "OSAG*": GOSUB 100: VTAB 
     4: HTAB 1: PRINT CL$
 5430  IF CH% = 5 THEN II = 1:IJ = 
     4:IK = 1E9: GOTO 5450
 5440  VTAB 4: PRINT "How much, "
     ;T$;"? ";: GOSUB 150:II = CH
     %:IJ = CH%: IF R1% THEN W = 
     ST(2,II)
 5450 WW = 0: FOR J = II TO IJ:IK
      = ST(2,J): IF W > IK THEN W
      = IK
 5460 ST(2,J) = ST(2,J) - W:WW = 
     WW + W:MW = MW + W: NEXT J: VTAB 
     4: HTAB 1: PRINT CL$
 5470  IF WW = 0 THEN  VTAB 4: PRINT 
     "There's nothing there, ";T$
     ;"!": CALL 2518: GOSUB 5600:
      VTAB 4: PRINT CL$
 5480  GOSUB 400: IF WW > 0 THEN 
     RF = RF + WW / 3:OK = OK + W
     W / 10: VTAB 4: PRINT "Let's
      hope we lose 'em, ";T$;"!":
      CALL 2521: GOSUB 5600: VTAB 
     4: PRINT CL$: GOTO 5210
 5500  REM 
 5505  IF SN = 0 THEN  VTAB 4: PRINT 
     "We got 'em all, ";T$;"!!": CALL 
     2521: GOSUB 5600:OK = 1: GOTO 
     5900
 5510  VTAB 4: PRINT "They're fir
     ing on us, ";T$;"!": GOSUB 5
     600: VTAB 4: PRINT CL$
 5540  FOR I = 1 TO 10: POKE  - 1
     6298,0: POKE  - 16299,0: POKE 
      - 16297,0: POKE  - 16300,0:
      FOR J = 1 TO 10: NEXT J,I
 5542  VTAB 4: PRINT "We've been 
     hit, ";T$;"!!": CALL 2512
 5545 I = SN: IF I > 15 THEN I = 
     15
 5550  IF GN THEN  IF  FN R(100) < 
     (DM / SC) * 100 OR (DM / SC)
      * 100 > 80 THEN I = 1: GOSUB 
     5600: VTAB 4: PRINT CL$: VTAB 
     4: PRINT "The buggers hit a 
     gun, ";T$;"!!": CALL 2512:GN
      = GN - 1:MW = MW + 10: GOSUB 
     5600: VTAB 4: PRINT CL$
 5555 DM = DM +  FN R(ED * I * F1
     ) + I / 2
 5560  IF  NOT ( FN R(20)) AND F1
      = 1 THEN OK = 2: GOTO 5900
 5590  GOTO 5090
 5600  VTAB 2: HTAB 21: FOR II = 
     1 TO T / 3
 5610 W =  PEEK ( - 16384): IF W < 
     128 THEN  NEXT II: PRINT : RETURN 
     
 5620  IF W = 210 THEN CMD = 1: PRINT 
     "Run        "
 5630  IF W = 198 THEN CMD = 2: PRINT 
     "Fight      "
 5640  IF W = 212 THEN CMD = 3: PRINT 
     "Throw cargo"
 5650  POKE  - 16368,0: PRINT 
 5670  RETURN 
 5680  IF SA >  = 0 THEN  RETURN 
     
 5681 I = 9: FOR IJ = SA TO  - 1
 5682  IF AM%(I,0) = 0 THEN I = I
      - 1: GOTO 5682
 5683 AM%(I,0) = 0:AM%(I,1) = 0: GOSUB 
     5880: GOSUB 5820:I = I - 1:S
     S = SS - 1: NEXT IJ: RETURN 
     
 5700  REM 
 5710  FOR I = 0 TO 9: IF AM%(I,0
     ) THEN 5740
 5720 SA = SA - 1: IF SA < 0 THEN 
     SA = 0: RETURN 
 5730 AM%(I,0) =  FN R(EC) + 20:A
     M%(I,1) = 0: GOSUB 5800:SS = 
     SS + 1
 5740  NEXT I: RETURN 
 5750  REM 
 5760  VTAB 1: HTAB 1: PRINT  RIGHT$ 
     ("    " +  STR$ (SN),4)
 5770  VTAB 2: HTAB 33: PRINT  RIGHT$ 
     ("   " +  STR$ (GN),3): RETURN 
     
 5800  GOSUB 5880: HTAB X: VTAB Y
     : PRINT SH$: RETURN 
 5820  GOSUB 5880: HTAB X: VTAB Y
     : PRINT SB$: RETURN 
 5840  GOSUB 5880: POKE 2493,(Y + 
     4) * 8 - 1: POKE 2494,X - 1:
      FOR J = 0 TO 1:IJ =  FN R(6
     ):II = DL%(IJ,J): HTAB X +  INT 
     (II / 10): VTAB Y + II -  INT 
     (II / 10) * 10: PRINT DM$(IJ
     ,J): NEXT J: CALL 2368: RETURN 
     
 5860  GOSUB 5880: POKE 2361,(Y + 
     4) * 8 - 1: POKE 2362,X - 1:
      POKE 2300, FN R( FN R(192))
     : CALL 2224: RETURN 
 5880 X = (I -  INT (I / 5) * 5) * 
     8 + 1:Y =  INT (I / 5) * 6 + 
     7: RETURN 
 5900  GOSUB 200: GOSUB 300: GOSUB 
     400
 5910  IF OK = 0 THEN  PRINT "The
      buggers got us, ";T$;"!!!":
      PRINT "It's all over, now!!
     !":OK = 1: GOTO 2698
 5920  IF OK = 1 THEN  GOSUB 400:
      PRINT "We've captured some 
     booty":WW = BT: GOSUB 600: PRINT 
     "It's worth ";WW$;"!": CALL 
     2518:CA = CA + BT: GOSUB 96:
      GOTO 3300
 5930  IF OK = 2 THEN  PRINT "Li 
     Yuen's fleet drove them off!
     ": GOSUB 96: GOTO 3220
 5940  IF OK = 3 THEN  PRINT "We 
     made it, ";T$;"!": CALL 2518
     : GOSUB 96: GOTO 3300
 10000  REM  
 10010  CALL 6147: POKE 1013,76: POKE 
     1014,224: POKE 1015,9: POKE 
     10,76: POKE 11,16: POKE 12,1
     1: POKE 1010,102: POKE 1011,
     213: POKE 1012,112: DIM LO$(
     7),CO$(4),CP(4),BP%(7,4),ST(
     2,4),AM%(9,1),DM$(5,1),DL%(5
     ,1),ST$(5)
 10020  DEF  FN R(X) =  INT ( USR 
     (0) * X)
 10040 HM$ =  CHR$ (16):CS$ =  CHR$ 
     (1) + "0":CA$ =  CHR$ (1) + 
     "1":CG$ =  CHR$ (1) + "2":BD
     $ =  CHR$ (2):CD$ =  CHR$ (3
     ):DD$ =  CHR$ (4):IV$ =  CHR$ 
     (9):NV$ =  CHR$ (14):FS$ =  CHR$ 
     (25):CE$ =  CHR$ (6):CL$ =  CHR$ 
     (5)
 10045  IF  PEEK (2367) = 236 THEN 
     10070
 10050  POKE  - 16368,0
 10060  FOR I = 1 TO 400:CH% =  PEEK 
     ( - 16384):X =  USR (0): IF 
     CH% < 128 THEN  NEXT 
 10062  VTAB 20: HTAB 31: PRINT I
     V$;CA$;"'ESC'";: FOR I = 1 TO 
     20:X =  USR (0): IF  PEEK ( - 
     16384) <  > 155 THEN  NEXT :
      VTAB 20: HTAB 31: PRINT NV$
     ;CA$ + "'ESC'";: FOR I = 1 TO 
     20:X =  USR (0): IF  PEEK ( - 
     16384) <  > 155 THEN  NEXT :
      GOTO 10062
 10070  POKE 2367,236: POKE  - 16
     368,0: PRINT NV$;FS$;HM$
 10110  VTAB 8: HTAB 1: PRINT CG$
     ;"[";: & 45,38: PRINT "]";: FOR 
     I = 1 TO 8: PRINT "!"; TAB( 
     40);"!";: NEXT I: PRINT "<";
     : & 58,38: PRINT ">";CS$
 10120  VTAB 10: HTAB 7: PRINT CS
     $;T$;",": VTAB 12: HTAB 3: PRINT 
     "What will you name your": VTAB 
     15: HTAB 13: & 45,22: VTAB 1
     4: HTAB 7: PRINT "Firm: ";CA
     $;: & 32,27: VTAB 14: HTAB 1
     3: POKE 33,39: CALL 2200: POKE 
     33,40:WK$ =  MID$ (WK$,1): IF 
     WK$ = "" THEN  CALL 2521: GOTO 
     10120
 10130  IF  LEN (WK$) > 22 THEN  PRINT 
     : VTAB 18: PRINT IV$;: & 32,
     42: PRINT "Please limit your
      Firm's name to 22     chara
     cters or less.";: & 32,59: PRINT 
     NV$: CALL 2518: GOSUB 92: VTAB 
     18: PRINT CE$: GOTO 10120
 10140 H$ = WK$: PRINT HM$;CS$: VTAB 
     6: PRINT "Do you want to sta
     rt . . .": PRINT : PRINT : PRINT 
     "  1) With cash (and a debt)
     ": PRINT : PRINT : PRINT ,">
     > or <<": PRINT : PRINT : PRINT 
     "  2) With five guns and no 
     cash": PRINT ,"(But no debt!
     )"
 10150  PRINT : PRINT : PRINT  TAB( 
     10);" ?";:CH$ = "12": GOSUB 
     100:MO = 1:YE = 1860:SC = 60
     :BA = 0:LO = 1:TI = 1:WC = 1
     0000:WS = 0
 10160  IF CH% = 1 THEN DW = 5000
     :CA = 400:MW = 60:GN = 0:BP = 
     10
 10170  IF CH% = 2 THEN DW = 0:CA
      = 0:MW = 10:GN = 5:BP = 7
 10180  FOR I = 0 TO 7: READ LO$(
     I): NEXT I: DATA At sea,Hong
      Kong,Shanghai,Nagasaki,Saig
     on,Manila,Singapore,Batavia
 10190  FOR I = 1 TO 4: READ CO$(
     I): FOR J = 1 TO 7: READ BP%
     (J,I): NEXT J,I
 10200  DATA  Opium,11,16,15,14,1
     2,10,13,Silk,11,14,15,16,10,
     13,12,Arms,12,16,10,11,13,14
     ,15,General Cargo,10,11,12,1
     3,14,15,16
 10210  FOR I = 0 TO 5: READ ST$(
     I): NEXT I: DATA "Critical",
     "  Poor","  Fair","  Good","
      Prime","Perfect" 
 10250 SH$ = BD$ + CG$ + "ABCDEFG
     " + CD$ + "HIJKLMN" + CD$ + 
     "OIJKLPQ" + CD$ + "RSTUVWX" + 
     CD$ + "YJJJJJZ" + DD$
 10260 SB$ = BD$: FOR II = 1 TO 5
     :SB$ = SB$ + "       " + CD$
     : NEXT II:SB$ = SB$ + DD$
 10270  FOR I = 0 TO 5: FOR J = 0
      TO 1:CH$ = BD$ + CG$
 10280  READ WK$:CH$ = CH$ + WK$:
      IF  RIGHT$ (CH$,1) = "*" THEN 
     CH$ =  MID$ (CH$,1, LEN (CH$
     ) - 1) + CD$: GOTO 10280
 10290 DM$(I,J) = CH$ + DD$: READ 
     DL%(I,J): NEXT J,I
 10300  DATA cde,20,r,3,fg*,mn,50
     ,tu,23,ij,11,vw,43,0,22,x*,z
     ,63,kl,32,12,14,pq,52,345,34
     
 10310 EC = 20:ED = .5
 10990  GOSUB 200: GOTO 1000
 20000  REM 
 20010 WW = CA + BA - DW: GOSUB 6
     00:WW =  INT ((CA + BA - DW)
      / 100 / TI ^ 1.1)
 20020  PRINT FS$;HM$;CS$;: PRINT 
     "Your final status:": PRINT 
     : PRINT "Net Cash: ";WW$: PRINT 
     : PRINT "Ship size: ";SC;" u
     nits with ";GN;" guns": PRINT 
     
 20030  PRINT "You traded for "; INT 
     (TI / 12);" year"; MID$ ("s"
     ,(TI > 11 AND TI < 24) + 1,1
     );" and ";TI -  INT (TI / 12
     ) * 12;" month"; MID$ ("s",(
     (TI -  INT (TI / 12) * 12) = 
     1) + 1,1): PRINT : PRINT IV$
     ;"Your score is ";WW;".";NV$
     
 20040  VTAB 14: PRINT "Your Rati
     ng:": PRINT CG$;"[";: & 45,3
     1: PRINT "]": FOR I = 1 TO 5
     : PRINT "!";: HTAB 33: PRINT 
     "!": NEXT I: PRINT "<";: & 5
     8,31: PRINT ">";CS$: VTAB 16
     
 20050  HTAB 2: IF WW > 49999 THEN 
      PRINT IV$;
 20060  PRINT "Ma Tsu";NV$;"     
         50,000 and over "
 20070  HTAB 2: IF WW < 50000 AND 
     WW > 7999 THEN  PRINT IV$;
 20080  PRINT "Master ";T$;NV$;" 
       8,000 to 49,999"
 20090  HTAB 2: IF WW < 8000 AND 
     WW > 999 THEN  PRINT IV$;
 20100  PRINT T$;NV$;"          1
     ,000 to  7,999"
 20110  HTAB 2: IF WW < 1000 AND 
     WW > 499 THEN  PRINT IV$;
 20120  PRINT "Compradore";NV$;" 
            500 to    999"
 20130  HTAB 2: IF WW < 500 THEN 
      PRINT IV$;
 20140  PRINT "Galley Hand";NV$;"
            less than 500"
 20170  VTAB 11
 20180  IF WW < 99 AND WW >  = 0 THEN 
      PRINT "Have you considered 
     a land based job?": PRINT 
 20190  IF WW < 0 THEN  PRINT "Th
     e crew has requested that yo
     u stay on shore for their sa
     fety!!": PRINT 
 20900  VTAB 23: RETURN 
 63999  PRINT FS$;HM$: TEXT : HOME 
     : POKE 103,1: POKE 104,8: END