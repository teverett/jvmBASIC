package com.khubla.jvmbasic.jvmbasicwww;

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
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

/**
 * @author tome
 */
public class JVMBASICWWW {
   /**
    * sourcedir option
    */
   private static final String SOURCEDIR_OPTION = "sourcedir";
   /**
    * sourcedir default
    */
   private static final String SOURCEDIR_DEFAULT = "www";
   /**
    * classdir option
    */
   private static final String CLASSDIR_OPTION = "classdir";
   /**
    * classdir default
    */
   private static final String CLASSDIR_DEFAULT = "www/classes";
   /**
    * port option
    */
   private static final String PORT_OPTION = "port";
   /**
    * port default
    */
   private static final String PORT_DEFAULT = "8080";

   public static void main(String[] args) {
      try {
         System.out.println("khubla.com jvmBasic www server");
         /*
          * options
          */
         final Options options = new Options();
         Option oo = Option.builder().argName(SOURCEDIR_OPTION).longOpt(SOURCEDIR_OPTION).type(String.class).hasArg().required(false).desc("source dir").build();
         options.addOption(oo);
         oo = Option.builder().argName(CLASSDIR_OPTION).longOpt(CLASSDIR_OPTION).type(String.class).hasArg().required(false).desc("class dir").build();
         options.addOption(oo);
         oo = Option.builder().argName(PORT_OPTION).longOpt(PORT_OPTION).type(String.class).hasArg().required(false).desc("TCP port").build();
         options.addOption(oo);
         /*
          * parse
          */
         final CommandLineParser parser = new DefaultParser();
         CommandLine cmd = null;
         try {
            cmd = parser.parse(options, args);
         } catch (final Exception e) {
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("posix", options);
            System.exit(0);
         }
         /*
          * input dir
          */
         final String sourceDir = cmd.getOptionValue(SOURCEDIR_OPTION, SOURCEDIR_DEFAULT);
         /*
          * class dir
          */
         final String classdir = cmd.getOptionValue(CLASSDIR_OPTION, CLASSDIR_DEFAULT);
         /*
          * port
          */
         int port = Integer.parseInt(cmd.getOptionValue(PORT_OPTION, PORT_DEFAULT));
         /*
          * output the config
          */
         System.out.println("Source directory: " + sourceDir);
         System.out.println("Class directory: " + classdir);
         System.out.println("HTTP port: " + port);
         /*
          * configuration
          */
         final ServerConfiguration serverConfiguration = new ServerConfiguration(sourceDir, classdir, port);
         /*
          * server
          */
         final JVMBasicWebServer jvmBasicWebServer = new JVMBasicWebServer(serverConfiguration);
         jvmBasicWebServer.listen();
      } catch (final Exception e) {
         e.printStackTrace();
      }
   }
}