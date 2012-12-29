package com.khubla.jvmbasic.jvmbasicwww;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;

import com.khubla.jvmbasic.jvmbasicc.JVMBasicCompiler;

/**
 * @author tome
 */
public class JVMBasicWebServer {
   /**
    * where to find the BAS files
    */
   private final String bspdir;
   /**
    * where to store the class files
    */
   private final String classdir;
   /**
    * class files
    */
   private final HashMap<String, Class<?>> bspClasses = new HashMap<String, Class<?>>();
   /**
    * the index
    */
   private static final String INDEX = "INDEX";
   /**
    * the port
    */
   private final int port;

   /**
    * ctor
    */
   public JVMBasicWebServer(String bspdir, String classdir, int port) {
      this.bspdir = bspdir;
      this.classdir = classdir;
      this.port = port;
   }

   /**
    * accept incoming connections
    */
   private void accept() throws Exception {
      try {
         final ServerSocket serverSocket = new ServerSocket(port);
         Socket clientSocket = null;
         while (true) {
            try {
               clientSocket = serverSocket.accept();
               processConnection(clientSocket);
            } catch (final Exception e) {
               e.printStackTrace();
            } finally {
               clientSocket.close();
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in accept", e);
      }
   }

   private void callBASClassInstance(Class<?> cls, Object instance, InputStream inputStream, OutputStream outputStream) throws Exception {
      try {
         /*
          * find the field inputstream
          */
         final Field inputStreamField = cls.getField("inputStream");
         if (null != inputStreamField) {
            inputStreamField.set(instance, inputStream);
         } else {
            throw new Exception("Unable to find inputStream field");
         }
         /*
          * find the field outputstream
          */
         final Field outputStreamField = cls.getField("outputStream");
         if (null != outputStreamField) {
            outputStreamField.set(instance, new PrintStream(outputStream));
         } else {
            throw new Exception("Unable to find outputStream field");
         }
         /*
          * find the program method
          */
         final Method programMethod = cls.getMethod("program");
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
    * compile bas file
    */
   @SuppressWarnings("deprecation")
   private void compileBASFile(File file) throws Exception {
      try {
         /*
          * compile
          */
         final JVMBasicCompiler jvmBasicCompiler = new JVMBasicCompiler();
         final String classname = JVMBasicCompiler.classNameFromFileName(file.getName());
         System.out.println("Compiling '" + file.getName() + "'");
         final byte[] byteCode = jvmBasicCompiler.compile(new FileInputStream(file), classname, false);
         JVMBasicCompiler.writeClassFile(byteCode, classname, classdir);
         /*
          * load with the class loader
          */
         final URL[] urls = new URL[] { new File(classdir).toURL() };
         final ClassLoader loader = new URLClassLoader(urls);
         final Class<?> cls = loader.loadClass(classname);
         if (null == cls) {
            throw new Exception("Unable to load class '" + classname + "'");
         }
         /*
          * remember this guy
          */
         bspClasses.put(classname, cls);
      } catch (final Exception e) {
         throw new Exception("Exception in compileBASFile", e);
      }
   }

   /**
    * generate classes from .bas files
    */
   private void generateClasses() throws Exception {
      try {
         final File inputDir = new File(bspdir);
         if (inputDir.exists()) {
            final File[] files = inputDir.listFiles();
            if (null != files) {
               for (int i = 0; i < files.length; i++) {
                  compileBASFile(files[i]);
               }
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in generateClasses", e);
      }
   }

   /**
    * get the context path from the request line
    */
   private String getContextPath(String requestline) throws Exception {
      try {
         /*
          * get the servlet
          */
         String servlet = getRequest(requestline);
         final int idx = servlet.indexOf("?");
         if (-1 != idx) {
            servlet = servlet.substring(0, idx);
         }
         /*
          * is root?
          */
         if (servlet.toLowerCase().trim().compareTo("/") == 0) {
            return INDEX;
         } else {
            return servlet;
         }
      } catch (final Exception e) {
         throw new Exception("Exception in getContextPath", e);
      }
   }

   /**
    * get the request URL path from the request line
    */
   private String getRequest(String requestline) throws Exception {
      try {
         final String[] parts = requestline.split(" ");
         return parts[1];
      } catch (final Exception e) {
         throw new Exception("Exception in getContextPath", e);
      }
   }

   public void listen() throws Exception {
      try {
         /*
          * generate the classes
          */
         generateClasses();
         /*
          * accept
          */
         accept();
      } catch (final Exception e) {
         throw new Exception("Exception in listen", e);
      }
   }

   /**
    * process connection
    */
   private void processConnection(Socket clientSocket) throws Exception {
      try {
         /*
          * read the request line
          */
         final String requestline = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())).readLine();
         /*
          * context path
          */
         final String contextPath = getContextPath(requestline);
         /*
          * context path
          */
         final String parameters = getRequest(requestline);
         /*
          * get the class file
          */
         final Class<?> cls = bspClasses.get(contextPath);
         if (null != cls) {
            /*
             * get instance
             */
            final Object o = cls.newInstance();
            /*
             * call
             */
            callBASClassInstance(cls, o, new ByteArrayInputStream(parameters.getBytes()), clientSocket.getOutputStream());
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processConnection", e);
      }
   }
}
