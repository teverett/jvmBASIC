package com.khubla.jvmbasic.jvmbasicwww;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;
import com.khubla.jvmbasic.jvmbasicrt.support.Loader;

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
public class BSPFile {
   /**
    * logger
    */
   private static final Logger logger = LoggerFactory.getLogger(BSPFile.class);
   /**
    * the BSP file
    */
   private final File bspFile;
   /**
    * the .class file
    */
   private File classFile;
   /**
    * the class dir
    */
   private final String classdir;
   /**
    * classname
    */
   private String className;
   /**
    * file extension
    */
   public static final String BSP = ".bsp";
   public static final String BAS = ".bas";

   /**
    * ctor
    */
   public BSPFile(File bspFile, String classdir) {
      this.bspFile = bspFile;
      this.classdir = classdir;
   }

   private void compile() throws Exception {
      try {
         /*
          * generate BAS
          */
         File tempBasFile = File.createTempFile(bspFile.getName(), ".bas");
         logger.info("Generating '" + tempBasFile.getName() + "'");
         ScriptletParser scriptletParser = new ScriptletParser();
         FileInputStream fis = new FileInputStream(this.bspFile);
         FileOutputStream fos = new FileOutputStream(tempBasFile);
         try {
            scriptletParser.parse(fis, fos);
         } catch (Exception e) {
            throw e;
         } finally {
            if (null != fis) {
               fis.close();
            }
            if (null != fos) {
               fos.flush();
               fos.close();
            }
         }
         /*
          * compile
          */
         final JVMBasicCompiler jvmBasicCompiler = new JVMBasicCompiler();
         logger.info("Compiling '" + tempBasFile.getName() + "'");
         className = jvmBasicCompiler.compileToClassfile(tempBasFile.getAbsolutePath(), null, classdir, true, true, true);
      } catch (final Exception e) {
         throw new Exception("Exception in compile", e);
      }
   }

   public void invoke(InputStream inputStream, OutputStream outputStream) throws Exception {
      try {
         /*
          * compile
          */
         if (needsCompile()) {
            compile();
         }
         /*
          * load
          */
         final Object instance = Loader.load(className, new File(classdir).getAbsolutePath() + "/");
         /*
          * set streams
          */
         Loader.setInputStream(instance, inputStream);
         Loader.setOutputStreamField(instance, outputStream);
         /*
          * invoke
          */
         Loader.invokeMainMethod(instance);
      } catch (final Exception e) {
         throw new Exception("Exception in invoke", e);
      }
   }

   /**
    * need to compile the BSP file?
    */
   private boolean needsCompile() {
      if (null == classFile) {
         /*
          * there is no class file.
          */
         return true;
      } else {
         /*
          * bas file has changed since last compile
          */
         final long basFileDate = bspFile.lastModified();
         final long classFileDate = classFile.lastModified();
         if (basFileDate >= classFileDate) {
            return true;
         }
      }
      return false;
   }
}
