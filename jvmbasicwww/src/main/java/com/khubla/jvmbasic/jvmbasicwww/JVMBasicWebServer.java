package com.khubla.jvmbasic.jvmbasicwww;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import org.apache.commons.io.IOUtils;

/**
 * @author tome
 */
public class JVMBasicWebServer {
   /**
    * where to find the BAS files
    */
   private final String sourceDir;
   /**
    * where to store the class files
    */
   private final String classdir;
   /**
    * class files
    */
   private final HashMap<String, BASFile> basFiles = new HashMap<String, BASFile>();
   /**
    * the index
    */
   private static final String INDEX = "INDEX.bas";
   /**
    * the port
    */
   private final int port;

   /**
    * ctor
    */
   public JVMBasicWebServer(String sourceDir, String classdir, int port) {
      this.sourceDir = sourceDir;
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
         if (null != requestline) {
            final String[] parts = requestline.split(" ");
            if ((null != parts) && (parts.length > 1)) {
               return parts[1];
            }
         }
         return null;
      } catch (final Exception e) {
         throw new Exception("Exception in getContextPath", e);
      }
   }

   public void listen() throws Exception {
      try {
         /*
          * index all the BAS files
          */
         findAllBASFiles();
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
          * is a .bas?
          */
         if (contextPath.trim().toLowerCase().endsWith(".bas")) {
            /*
             * get the file record
             */
            final BASFile basFile = basFiles.get(contextPath);
            if (null != basFile) {
               basFile.callBASClassInstance(new ByteArrayInputStream(parameters.getBytes()), clientSocket.getOutputStream());
            } else {
               throw new Exception("Unable to find BAS file for context path '" + contextPath + "'");
            }
         } else {
            returnStaticFile(contextPath, clientSocket.getOutputStream());
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processConnection", e);
      }
   }

   /**
    * return static content
    */
   private void returnStaticFile(String contextPath, OutputStream outputStream) throws Exception {
      final File file = new File(sourceDir + "/" + contextPath);
      if (file.exists()) {
         IOUtils.copy(new FileInputStream(file), outputStream);
      } else {
         new PrintStream(outputStream).println("404");
      }
   }
}
