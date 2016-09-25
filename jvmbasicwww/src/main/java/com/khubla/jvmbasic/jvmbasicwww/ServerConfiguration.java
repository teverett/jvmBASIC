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
   private final HashMap<String, BSPFile> bspFiles = new HashMap<String, BSPFile>();

   public ServerConfiguration(String sourceDir, String classdir, int port) throws Exception {
      this.sourceDir = sourceDir;
      this.classdir = classdir;
      this.port = port;
      findAllBSPFiles();
   }

   /**
    * find all the BSP files
    */
   private void findAllBSPFiles() throws Exception {
      try {
         final File inputDir = new File(sourceDir);
         if (inputDir.exists()) {
            final File[] files = inputDir.listFiles();
            if (null != files) {
               for (int i = 0; i < files.length; i++) {
                  /*
                   * check?
                   */
                  if (files[i].getName().trim().endsWith(BSPFile.BSP)) {
                     /*
                      * the file
                      */
                     final BSPFile bspFile = new BSPFile(files[i], classdir);
                     /*
                      * remember it
                      */
                     bspFiles.put(files[i].getName().trim(), bspFile);
                  }
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in generateClasses", e);
      }
   }

   public HashMap<String, BSPFile> getBspFiles() {
      return bspFiles;
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
