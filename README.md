![CI](https://github.com/teverett/jvmBASIC/workflows/CI/badge.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/dae9bbea869d4757a7d3a2578bd79348)](https://www.codacy.com/app/teverett/jvmBASIC?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=teverett/jvmBASIC&amp;utm_campaign=Badge_Grade)

jvmBASIC
========

A BASIC to JVM bytecode compiler

jvmBASIC is a bytecode compiler which is capable of consuming a BASIC file (.bas) and producing a JVM .class file. The JVM class file exposes a public class named after the input file and a public method "program()" which contains the generated bytecode.  The generated .class file also exposes a "void main()" method which enables the BASIC program to be run from the command line.

In order to use the generated .class file from Java code, the public class members "inputStream" and "outputStream" must be set, in order for the BASIC program to consume input and produce output.


Maven Coordinates
-------------------

jvmBasicCC

```
<groupId>com.khubla.jvmbasic</groupId>
<artifactId>jvmbasicc</artifactId>
<version>2.4.0</version>
<packaging>jar</packaging>
```

jvmBasicRT

```
<groupId>com.khubla.jvmbasic</groupId>
<artifactId>jvmbasicrt</artifactId>
<version>2.4.0</version>
<packaging>jar</packaging>
```



License
---------

jvmBASIC is distributed until the GPL v3. For more information please see the [GPL](http://www.gnu.org/licenses/gpl.txt).

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

Running an example
---------

* build jvmBASIC: `mvn clean package install`
* use the script `run_bas.sh` to run an example:

<pre>
sh run_bas.sh hellojvmBASIC.bas
</pre>

The output should look very much like:
<pre>
shrek:jvmBASIC tom$ sh run_bas.sh hellojvmBASIC.bas 
Running BASIC file hellojvmBASIC.bas
khubla.com jvmBASIC Compiler
Compiling: /Users/tom/projects/jvmBASIC/hellojvmBASIC.bas
added manifest
adding: hellojvmBASIC.class(in = 1402) (out= 740)(deflated 47%)
19:17:44.698 [main] INFO com.khubla.jvmbasic.jvmbasicrt.ExecutionContext - pushing String: '"hello from jvmBASIC"'
19:17:44.701 [main] INFO com.khubla.jvmbasic.jvmbasicrt.ExecutionContext - popping hello from jvmBASIC
hello from jvmBASIC
shrek:jvmBASIC tom$ 
</pre>


Using jvmBASICC
---------

jvmbasicc.jar is the jvmBASIC compiler. The only required parameter is -file, which is used to specify an input file.  For example to compile "myprogram.bas" to bytecode:

`java -jar jvmbasicc.jar -file myprogram.bas`

This will produce "jvmbasicc.class"

Once jvmbasicc.class has been combined into a jar file, the file "jvmbasicrt.jar" must be on the class path order order to run the generated code.

Running `java -jar jvmbasicc.jar` will produce help output, which will show all the commandline options.

The generated bytecode
---------

Inspecting the generated bytecode

To view the generated class at the command line, use javap.  For example to view the generated output for "bottlesofbeer.bas" type

`javap botttlesofbeer`

to produce more verbose output from javap use

`javap -c bottlesofbeer`

The grammar
---------

The ANTLR grammar is at 

[https://github.com/teverett/jvmBASIC/blob/master/jvmbasicc/src/main/antlr4/com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g4](https://github.com/teverett/jvmBASIC/blob/master/jvmbasicc/src/main/antlr4/com/khubla/jvmbasic/jvmbasicc/antlr/jvmBasic.g4)

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

`mvn clean jvmbasic:jvmbasic jar:jar`

This will build the BASIC files, and produce a jar that can be run from the command line.  jvmbasicrt.jar must be on the command line.

jvmBASIC WWW
---------

jvmBASIC WWW is a very simple web server that produces HTML output from BASIC files.  To run it use a command line similar to this:

`java -jar target/jvmbasicwww.jar -sourcedir www -classdir www/classfiles/ -port 8080`

The basic files to compile are the directory specified by -sourcedir and the generated classes are in the directory specified by -classdir.  The HTTP port to bind is specified by -port.  The default page is served by INDEX.bas.

to run the example use:

`sh run.sh` and point your browser to `http://localhost:8080/`



