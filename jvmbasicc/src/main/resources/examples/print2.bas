10 REM this is a comment
20 PRINT "13"
30 PRINT "hi"
40 PRINT 10
50 PRINT 15.55
60 LET x = 12
70 PRINT "hihi"
80 PRINT x
90 LET y = 1+2
100 LET z = 3*6
110 LET d= y+z
120 PRINT d
130 LET rr = RND(100)
140 PRINT rr
150 REM INPUT "WHAT'S YOUR GUESS",G
160 IF 10 < 12 THEN PRINT "10 is less than 12"
161 IF 10 > 12 THEN PRINT "uh oh"
170 IF 12 > 10 THEN PRINT "12 is greater than 10"
171 IF 12 < 10 THEN PRINT "uh oh"
200 LET xx = 10
210 LET yy = 20
220 IF xx < yy THEN PRINT "xx < yy"
230 DIM Y$(1)
240 IF ABS(2-1) < 3 THEN PRINT "CLOSE!"
250 PRINT "SORRY, THE NUMBER I WAS THINKING OF IS ";xx;"."
260 PRINT "HI":PRINT "THERE"
300 REM INPUT "Enter a number ",num
310 REM LET sq = num*num
320 REM PRINT "the square of ";num;" is ";sq
400 GOTO 420
410 PRINT "this should not be printed"
420 PRINT "target of the goto"
500 IF 10<20 THEN GOTO 550
510 PRINT "BUG"
550 PRINT "goto target"
560 GOSUB 1000
570 PRINT "after the gosub"
600 END
610 PRINT "oops"
1000 PRINT "this is the gosub"
1010 RETURN











