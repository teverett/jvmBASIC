jvmBASIC
========

A BASIC to JVM bytecode compiler

jvmBASIC is a bytecode compiler which is capable of consuming a BASIC file (.bas) and producing a JVM .class file. The JVM class file exposes a public class named after the input file and a public method "program()" which contains the generated bytecode.  The generated .class file also exposes a "void main()" method which enables the BASIC program to be run from the command line.

In order to use the generated .class file from Java code, the public class members "inputStream" and "outputStream" must be set, in order for the BASIC program to consume input and produce output.

Modules
---------

The modules are:

* jvmBasicc - The jvmBASIC compiler
* jvmBasicrt - the jvmBASIC runtime library
* jvmBasicwww - A simple web server that uses BASIC programs to generate HTML over HTTP
* jvmBasicmojo - A maven mojo that compiles all .bas files found at /src/main/basic to .class files
* examples - a simple directory of examples
* demo - a simple .BAS program which can be compiled to produce a .jar and run to produce output

The Implementation
---------

Notes on the implementation

* The Parser and Lexer are created by [ANTLR](http://www.antlr.org) via an ANTLR grammar. 
* The generated bytecode is created by ObjectWeb [ASM](http://asm.ow2.org/)
* Currently screen functions such as "CLEAR" are not implemented
* Math functions and string functions are implemented in the jvmBasic runtime jar "jvmbasicrt.jar"
* BASIC types are implemented by the class "Value" in jvmbasicrt.jar

Getting Started
---------

Getting started

* cd to the "demo" directory
* Optionally edit the BASIC file "bottlesofbeer.bas"
* run "update.sh" to copy the jvmBasicc.jar and jvmBasicrt.jar files into the demo directory
* run "run.sh" to compile the BAS file, produce a jar and run the jar

Using jvmBASICC
---------

jvmbasicc.jar is the jvmBASIC compiler. The only required parameter is -file, which is used to specify an input file.  For example to compile "myprogram.bas" to bytecode:

`java -jar jvmbasicc.jar -file myprogram.bas`

This will produce "jvmbasicc.class"

Once jvmbasicc.class has been combined into a jar file, the file "jvmbasicrt.jar" must be on the class path order order to run the generated code.

Running `java -jar jvmbasicc.jar` will produce help output, which will show all the commandline options.

The generated bytecode
---------

Looking at the generated btecode

To view the generated class at the command line, use javap.  For example to view the generated output for "bottlesofbeer.bas" type

`javap botttlesofbeer`

to produce more verbose output from javap use

`javap -c bottlesofbeer`

The grammar
---------

The ANTLR grammar is at 

`jvmbasicc/src/main/antlr3/com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g`

There is an excellent ANTLR grammar editor here:

[ANTLRWorks](http://www.antlr.org/works/)

Once you have created the grammar you need, recompile jvmBasicc:

`mvn clean package`

If you wish to use jvmBasicMojo, you will have to install the generated jvmBasic compiler:

`mvn clean package install`

Running the Examples
---------

The examples are standard maven builds, and require the jvmBASIC maven mojo "jvmBasicmojo".  In order for the examples to work propertly jvmbasicc.jar, jvmbasicrt.jar and jvmbasicmojo.jar must all have been compiled and installed.  The easiest way to do this is to run this command from the root jvmBasic directory

`mvn clean package install`

To use the jvmBasic maven moojo from the command line:

'mvn clean jvmbasic:jvmbasic jar:jar`

This will build the BASIC files, and produce a jar that can be run from the command line










 


