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
import java.io.InputStream;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;
import com.khubla.jvmbasic.jvmbasicrt.support.Loader;

/**
 * A simple index of all the BAS files
 * 
 * @author tome
 */
public class BASFile {
   /**
    * logger
    */
   private static final Logger logger = LoggerFactory.getLogger(BASFile.class);
   /**
    * the BAS file
    */
   private final File basFile;
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
    * ctor
    */
   public BASFile(File basFile, String classdir) {
      this.basFile = basFile;
      this.classdir = classdir;
   }

   /**
    * call an instance of this class
    */
   public void callBASClassInstance(InputStream inputStream, OutputStream outputStream) throws Exception {
      try {
         /*
          * check if needs compile compile
          */
         if (true == needsCompile()) {
            /*
             * compile
             */
            final JVMBasicCompiler jvmBasicCompiler = new JVMBasicCompiler();
            logger.info("Compiling '" + basFile.getName() + "'");
            className = jvmBasicCompiler.compileToClassfile(basFile.getAbsolutePath(), classdir, true);
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
         throw new Exception("Exception in callBASClassInstance", e);
      }
   }

   /**
    * need to compile the BAS file?
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
         final long basFileDate = basFile.lastModified();
         final long classFileDate = classFile.lastModified();
         if (basFileDate >= classFileDate) {
            return true;
         }
      }
      return false;
   }
}
