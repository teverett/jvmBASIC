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
    * get the full output dir for a package
    */
   public static String packageOutputDir(String packageName, String targetDir) {
      if (null != packageName) {
         return targetDir + packageName.replace('.', File.separatorChar);
      } else {
         return targetDir;
      }
   }

   /**
    * generate the class name from the supplied BASIC filename
    */
   public static String classNameFromFileName(String filename, String packageName) {
      if (null == packageName) {
         return new File(filename).getName().replaceAll(".bas", "");
      } else {
         return packageName + "." + new File(filename).getName().replaceAll(".bas", "");
      }
   }

   public static String classNameWithoutPackage(String classname) {
      String ret = classname;
      final int i = classname.lastIndexOf('.');
      if (i != -1) {
         ret = classname.substring(i + 1);
      }
      return ret;
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
