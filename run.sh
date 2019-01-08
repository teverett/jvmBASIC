#!/bin/sh

mkdir eggsample

cp jvmbasicrt/target/jvmbasicrt.jar eggsample/
cp jvmbasicc/target/jvmbasicc.jar eggsample/

cd eggsample
java -jar jvmbasicc.jar -file ../jvmbasicc/src/main/resources/examples/print.bas
jar cvfme print.jar ../jvmbasicc/src/main/resources/manifest.txt print print.class 

jar tf print.jar
javap -p print

java -jar print.jar

cd ..

