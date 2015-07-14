cp jvmbasicrt/target/jvmbasicrt.jar .
cp jvmbasicc/target/jvmbasicc.jar .
java -jar jvmbasicc.jar -file jvmbasicc/src/main/resources/examples/print.bas
jar cvfme print.jar jvmbasicc/src/main/resources/manifest.txt PRINT PRINT.class 
java -jar print.jar -verbose:false
