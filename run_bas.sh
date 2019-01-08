#!/bin/sh

BASFILE=$1
WORKDIR=$BASFILE.work

CLASSNAME=`echo $BASFILE | cut -d. -f1`

RUNTIME_JAR=jvmbasicrt/target/jvmbasicrt.jar
COMPILER_JAR=jvmbasicc/target/jvmbasicc.jar
MANIFEST=jvmbasicc/src/main/resources/manifest.txt

echo Running BASIC file $BASFILE

rm -rf $WORKDIR
mkdir $WORKDIR

cp $RUNTIME_JAR $WORKDIR/
cp $COMPILER_JAR $WORKDIR/

cd $WORKDIR

# compile the .bas to a class
java -jar jvmbasicc.jar -file ../$BASFILE

# make a jar
jar cvfme $CLASSNAME.jar ../$MANIFEST $CLASSNAME $CLASSNAME.class 

#jar tf print.jar
#javap -p print

# run the jar
java -jar $CLASSNAME.jar

cd ..

