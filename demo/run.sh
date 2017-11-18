#!/bin/sh

java -jar jvmbasicc.jar -file bottlesofbeer.bas -verbose false
jar cvfme bottlesofbeer.jar manifest.txt BOTTLESOFBEER BOTTLESOFBEER.class 
java -jar bottlesofbeer.jar
