10 REM bottles of beer demo
20 PRINT "bottles of beer demo"
30 INPUT "Enter bottles of beer ",num
40 GOSUB 1000
50 LET num = num-1
60 IF num >= 1 THEN GOTO 40
70 PRINT "no more beer"
80 END
1000 REM this prints the bottles of beer
1010 PRINT num;" bottles of beer on the wall"
1020 PRINT num;" bottles of beer"
1030 PRINT "take one down pass it around"
1040 IF num >1 THEN PRINT num-1;" bottles of beer on the wall"
1050 PRINT ""
1060 RETURN
