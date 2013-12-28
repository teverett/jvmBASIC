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
import java.net.URL;
import java.net.URLClassLoader;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;
import com.khubla.jvmbasic.jvmbasicc.util.FilenameUtil;
import com.khubla.jvmbasic.jvmbasicrt.Loader;

/**
 * A simple index of all the BAS files
 * 
 * @author tome
 */
public class BASFile {
   /**
    * the BAS file
    */
   private final File basFile;
   /**
    * the .class file
    */
   private File classFile;
   /**
    * the class
    */
   private Class<?> clazz;
   /**
    * the class dir
    */
   private final String classdir;

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
          * compile
          */
         if (true == needsCompile()) {
            compile(classdir);
         }
         /*
          * get instance
          */
         final Object instance = clazz.newInstance();
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
    * compile
    */
   private void compile(String classdir) throws Exception {
      try {
         /*
          * compile
          */
         final JVMBasicCompiler jvmBasicCompiler = new JVMBasicCompiler();
         System.out.println("Compiling '" + basFile.getName() + "'");
         final String className = jvmBasicCompiler.compileToClassfile(basFile.getName(), classdir, true);
         classFile = new File(classdir + "/" + className + ".class");
         /*
          * load with the class loader
          */
         final URL[] urls = new URL[] { new URL(new File(classdir).getAbsolutePath()) };
         final URLClassLoader classLoader = new URLClassLoader(urls);
         try {
            clazz = classLoader.loadClass(getClassname());
         } catch (final Exception e) {
            throw e;
         } finally {
            classLoader.close();
         }
         if (null == clazz) {
            throw new Exception("Unable to load class '" + getClassname() + "'");
         }
      } catch (final Exception e) {
         throw new Exception("Exception in compileBASFile", e);
      }
   }

   /**
    * get the name of the generated JVM class
    */
   public String getClassname() {
      return FilenameUtil.classNameFromFileName(basFile.getName());
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
