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
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;

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
   @SuppressWarnings("static-access")
   public static void main(String[] args) {
      try {
         System.out.println("khubla.com jvmBASIC Compiler");
         /*
          * options
          */
         final Options options = new Options();
         final Option oo = OptionBuilder.withArgName(OUTPUT_OPTION).isRequired(false).withType(String.class).hasArg().withDescription("target directory to output to").create(OUTPUT_OPTION);
         options.addOption(oo);
         final Option fo = OptionBuilder.withArgName(FILE_OPTION).isRequired().withType(String.class).hasArg().withDescription("file to compile").create(FILE_OPTION);
         options.addOption(fo);
         final Option vo = OptionBuilder.withArgName(VERBOSE_OPTION).hasArg().withDescription("verbose output").isRequired(false).withType(Boolean.class).create(VERBOSE_OPTION);
         options.addOption(vo);
         /*
          * parse
          */
         final CommandLineParser parser = new PosixParser();
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
             * compiler
             */
            final JVMBasicCompiler asbCompiler = new JVMBasicCompiler();
            /*
             * filename
             */
            filename = System.getProperty("user.dir") + "/" + filename;
            final File fl = new File(filename);
            filename = fl.getCanonicalPath();
            if (true == fl.exists()) {
               /*
                * get input stream
                */
               final InputStream inputStream = new FileInputStream(filename);
               /*
                * output filename
                */
               final String fn = JVMBasicCompiler.classNameFromFileName(filename);
               /*
                * compile
                */
               final String className = fn;
               final byte[] byteCode = asbCompiler.compile(inputStream, className, verbose);
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