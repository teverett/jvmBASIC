10 REM bottles of beer demo
20 PRINT "bottles of beer demo"
30 INPUT "Enter bottles of beer ",num
40 PRINT num;" bottles of beer on the wall"
41 PRINT num;" bottles of beer"
42 PRINT "take one down pass it around"
43 PRINT num-1;" bottles of beer on the wall"
44 PRINT ""
50 LET num = num-1
60 IF num >= 1 THEN GOTO 40
70 PRINT "no more beer"
