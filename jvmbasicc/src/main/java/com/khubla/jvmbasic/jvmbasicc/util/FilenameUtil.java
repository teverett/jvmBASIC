package com.khubla.jvmbasic.jvmbasicc.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

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
/**
 * @author tom
 */
public class FilenameUtil {
   /**
    * get AST filename from ClassName
    */
   public static String astFileNameFromClassName(String classname) {
      return classname + ".ast.txt";
   }

   /**
    * get Class filename from ClassName
    */
   public static String classFileNameFromClassName(String classname) {
      return classname + ".class";
   }

   /**
    * generate the class name from the supplied BASIC filename
    */
   public static String classNameFromFileName(String filename) {
      return new File(filename).getName().replaceAll(".bas", "").toUpperCase();
   }

   /**
    * get an output stream for a file
    */
   public static FileOutputStream getOutputStream(String filename, String dir) throws IOException {
      String fullFN = null;
      if (null != dir) {
         fullFN = dir + "/" + filename;
         new File(dir).mkdirs();
      } else {
         fullFN = filename;
      }
      return new FileOutputStream(fullFN);
   }

   /**
    * get Static Analysis filename from ClassName
    */
   public static String staticAnalyisFileNameFromClassName(String classname) {
      return classname + ".analysis.txt";
   }
}
