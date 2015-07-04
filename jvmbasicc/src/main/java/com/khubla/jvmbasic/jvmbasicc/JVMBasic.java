package com.khubla.jvmbasic.jvmbasicc;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import com.khubla.jvmbasic.jvmbasicc.util.FilenameUtil;

/**
 * @author tom
 */
public class JVMBasic {
   /**
    * file option
    */
   private static final String FILE_OPTION = "file";
   /**
    * target option
    */
   private static final String OUTPUT_OPTION = "output";
   /**
    * verbose option
    */
   private static final String VERBOSE_OPTION = "verbose";

   /**
    * start here
    * <p>
    * -file src\test\resources\bas\easy\print.bas -verbose true
    * </p>
    */
   public static void main(String[] args) {
      try {
         System.out.println("khubla.com jvmBASIC Compiler");
         /*
          * options
          */
         final Options options = new Options();
         Option oo = Option.builder().argName(OUTPUT_OPTION).longOpt(OUTPUT_OPTION).type(String.class).hasArg().required(false).desc("target directory to output to").build();
         options.addOption(oo);
         oo = Option.builder().argName(FILE_OPTION).longOpt(FILE_OPTION).type(String.class).hasArg().required(true).desc("file to compile").build();
         options.addOption(oo);
         oo = Option.builder().argName(VERBOSE_OPTION).longOpt(VERBOSE_OPTION).type(String.class).hasArg().required(false).desc("verbose output").build();
         options.addOption(oo);
         /*
          * parse
          */
         final CommandLineParser parser = new DefaultParser();
         CommandLine cmd = null;
         try {
            cmd = parser.parse(options, args);
         } catch (final Exception e) {
            e.printStackTrace();
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("posix", options);
            System.exit(0);
         }
         /*
          * verbose output?
          */
         final Boolean verbose = Boolean.parseBoolean(cmd.getOptionValue(VERBOSE_OPTION));
         /*
          * get the file
          */
         String filename = cmd.getOptionValue(FILE_OPTION);
         final String outputDirectory = cmd.getOptionValue(OUTPUT_OPTION);
         if (null != filename) {
            /*
             * filename
             */
            filename = System.getProperty("user.dir") + "/" + filename;
            final File fl = new File(filename);
            filename = fl.getCanonicalPath();
            if (true == fl.exists()) {
               /*
                * compiler
                */
               final JVMBasicCompiler jvmBasicCompiler = new JVMBasicCompiler();
               /*
                * get input stream
                */
               final InputStream inputStream = new FileInputStream(filename);
               /*
                * output filename
                */
               final String fn = FilenameUtil.classNameFromFileName(filename);
               /*
                * compile
                */
               final String className = fn;
               final byte[] byteCode = jvmBasicCompiler.compile(inputStream, className, verbose);
               /*
                * write
                */
               JVMBasicCompiler.writeClassFile(byteCode, className, outputDirectory);
            } else {
               throw new Exception("Unable to find: '" + filename + "'");
            }
         } else {
            throw new Exception("File was not supplied");
         }
      } catch (final Exception e) {
         e.printStackTrace();
      }
   }
}