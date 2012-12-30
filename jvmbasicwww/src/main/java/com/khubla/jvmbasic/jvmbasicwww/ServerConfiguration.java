package com.khubla.jvmbasic.jvmbasicwww;

import java.io.File;
import java.util.HashMap;

/**
 * @author tome
 */
public class ServerConfiguration {
   /**
    * where to find the BAS files
    */
   private final String sourceDir;
   /**
    * where to store the class files
    */
   private final String classdir;
   /**
    * the port
    */
   private final int port;
   /**
    * class files
    */
   private final HashMap<String, BASFile> basFiles = new HashMap<String, BASFile>();

   public ServerConfiguration(String sourceDir, String classdir, int port) throws Exception {
      this.sourceDir = sourceDir;
      this.classdir = classdir;
      this.port = port;
      findAllBASFiles();
   }

   /**
    * find all the BAS files
    */
   private void findAllBASFiles() throws Exception {
      try {
         final File inputDir = new File(sourceDir);
         if (inputDir.exists()) {
            final File[] files = inputDir.listFiles();
            if (null != files) {
               for (int i = 0; i < files.length; i++) {
                  /*
                   * check?
                   */
                  if (files[i].getName().toLowerCase().trim().endsWith(".bas")) {
                     /*
                      * the file
                      */
                     final BASFile basFile = new BASFile(files[i], classdir);
                     /*
                      * remember it
                      */
                     basFiles.put(basFile.getClassname() + ".bas", basFile);
                  }
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in generateClasses", e);
      }
   }

   public HashMap<String, BASFile> getBasFiles() {
      return basFiles;
   }

   public String getClassdir() {
      return classdir;
   }

   public int getPort() {
      return port;
   }

   public String getSourceDir() {
      return sourceDir;
   }
}
