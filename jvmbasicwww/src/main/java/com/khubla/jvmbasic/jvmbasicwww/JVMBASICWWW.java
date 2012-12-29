package com.khubla.jvmbasic.jvmbasicwww;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;

/**
 * @author tome
 */
public class JVMBASICWWW {
   /**
    * dir option
    */
   private static final String BSPDIR_OPTION = "bspdir";
   /**
    * classdir option
    */
   private static final String CLASSDIR_OPTION = "classdir";
   /**
    * port option
    */
   private static final String PORT_OPTION = "port";

   @SuppressWarnings("static-access")
   public static void main(String[] args) {
      try {
         System.out.println("khubla.com jvmBasic bsp server");
         /*
          * options
          */
         final Options options = new Options();
         final Option bspo = OptionBuilder.withArgName(BSPDIR_OPTION).isRequired().hasArg().withDescription("bsp dir").create(BSPDIR_OPTION);
         options.addOption(bspo);
         final Option clso = OptionBuilder.withArgName(CLASSDIR_OPTION).isRequired().hasArg().withDescription("class dir").create(CLASSDIR_OPTION);
         options.addOption(clso);
         final Option po = OptionBuilder.isRequired(false).withArgName(PORT_OPTION).hasArg().withDescription("TCP port").create(PORT_OPTION);
         options.addOption(po);
         /*
          * parse
          */
         final CommandLineParser parser = new PosixParser();
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
         final String bspdir = cmd.getOptionValue(BSPDIR_OPTION);
         /*
          * class dir
          */
         final String classdir = cmd.getOptionValue(CLASSDIR_OPTION);
         /*
          * port
          */
         int port = 80;
         if (cmd.hasOption(PORT_OPTION)) {
            port = Integer.parseInt(cmd.getOptionValue(PORT_OPTION));
         }
         /*
          * server
          */
         final JVMBasicWebServer jvmBasicWebServer = new JVMBasicWebServer(bspdir, classdir, port);
         jvmBasicWebServer.listen();
      } catch (final Exception e) {
         e.printStackTrace();
      }
   }
}