package com.khubla.jvmbasic.jvmbasicwww;

/*
 * jvmBasic Copyright 2012, khubla.com
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

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
          * find the field inputstream
          */
         final Field inputStreamField = clazz.getField("inputStream");
         if (null != inputStreamField) {
            inputStreamField.set(instance, inputStream);
         } else {
            throw new Exception("Unable to find inputStream field");
         }
         /*
          * find the field outputstream
          */
         final Field outputStreamField = clazz.getField("outputStream");
         if (null != outputStreamField) {
            outputStreamField.set(instance, new PrintStream(outputStream));
         } else {
            throw new Exception("Unable to find outputStream field");
         }
         /*
          * find the program method
          */
         final Method programMethod = clazz.getMethod("program");
         if (null != programMethod) {
            programMethod.invoke(instance);
         } else {
            throw new Exception("Unable to find program method");
         }
      } catch (final Exception e) {
         throw new Exception("Exception in callBASClassInstance", e);
      }
   }

   /**
    * compile
    */
   @SuppressWarnings("deprecation")
   private void compile(String classdir) throws Exception {
      try {
         /*
          * compile
          */
         final JVMBasicCompiler jvmBasicCompiler = new JVMBasicCompiler();
         System.out.println("Compiling '" + basFile.getName() + "'");
         final byte[] byteCode = jvmBasicCompiler.compile(new FileInputStream(basFile), getClassname(), false);
         JVMBasicCompiler.writeClassFile(byteCode, getClassname(), classdir);
         classFile = new File(classdir + "/" + getClassname() + ".class");
         /*
          * load with the class loader
          */
         final URL[] urls = new URL[] { new File(classdir).toURL() };
         final ClassLoader loader = new URLClassLoader(urls);
         clazz = loader.loadClass(getClassname());
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
      return JVMBasicCompiler.classNameFromFileName(basFile.getName());
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
