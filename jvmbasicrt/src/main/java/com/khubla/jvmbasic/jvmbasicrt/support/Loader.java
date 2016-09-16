package com.khubla.jvmbasic.jvmbasicrt.support;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

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
 * A simple wrapper which loads a JVMBasic class
 *
 * @author tome
 */
public class Loader {
   public static void invokeMainMethod(Object instance) throws Exception {
      final Method programMethod = instance.getClass().getMethod("program");
      if (null != programMethod) {
         programMethod.invoke(instance);
      } else {
         throw new Exception("Unable to find program method");
      }
   }

   public static Object load(String className, String directory) throws Exception {
      try {
         ClassLoader classLoader = null;
         Class<?> clazz = null;
         if (null != directory) {
            final URL classURL = new URL("file://" + directory);
            classLoader = new URLClassLoader(new URL[] { classURL });
         } else {
            classLoader = ClassLoader.getSystemClassLoader();
         }
         try {
            clazz = classLoader.loadClass(className);
         } catch (final Exception e) {
            throw e;
         } finally {
            /*
             * URL classloaders need to be closed
             */
            if (classLoader instanceof URLClassLoader) {
               ((URLClassLoader) classLoader).close();
            }
         }
         /*
          * get an instance
          */
         final Object o = clazz.newInstance();
         /*
          * done
          */
         return o;
      } catch (final Exception e) {
         throw new Exception("Exception in load", e);
      }
   }

   public static void setInputStream(Object instance, InputStream inputStream) throws IllegalAccessException, Exception {
      final Field inputStreamField = instance.getClass().getField("inputStream");
      if (null != inputStreamField) {
         inputStreamField.set(instance, inputStream);
      } else {
         throw new Exception("Unable to find inputStream field");
      }
   }

   public static void setOutputStreamField(Object instance, OutputStream outputStream) throws IllegalAccessException, Exception {
      final Field outputStreamField = instance.getClass().getField("outputStream");
      if (null != outputStreamField) {
         outputStreamField.set(instance, new PrintStream(outputStream));
      } else {
         throw new Exception("Unable to find outputStream field");
      }
   }
}
