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
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

import org.apache.commons.io.IOUtils;

/**
 * @author tome
 */
public class RequestProcessor implements Runnable {
   /**
    * the index
    */
   private static final String INDEX = "INDEX.bas";
   /**
    * config
    */
   private final ServerConfiguration serverConfiguration;
   /**
    * the socket
    */
   private final Socket socket;

   /**
    * ctor
    */
   public RequestProcessor(Socket socket, ServerConfiguration serverConfiguration) {
      this.serverConfiguration = serverConfiguration;
      this.socket = socket;
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
         if (null != servlet) {
            final int idx = servlet.indexOf("?");
            if (-1 != idx) {
               servlet = servlet.substring(0, idx);
            }
         }
         /*
          * is root?
          */
         if ((null == servlet) || (servlet.toLowerCase().trim().compareTo("/") == 0)) {
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

   /**
    * process connection
    */
   private void processConnection() throws Exception {
      try {
         /*
          * read the request line
          */
         final String requestline = new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine();
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
            final BASFile basFile = serverConfiguration.getBasFiles().get(contextPath);
            if (null != basFile) {
               basFile.callBASClassInstance(new ByteArrayInputStream(parameters.getBytes()), socket.getOutputStream());
            } else {
               throw new Exception("Unable to find BAS file for context path '" + contextPath + "'");
            }
         } else {
            returnStaticFile(contextPath, socket.getOutputStream());
         }
      } catch (final Exception e) {
         throw new Exception("Exception in processConnection", e);
      } finally {
         socket.close();
      }
   }

   /**
    * return static content
    */
   private void returnStaticFile(String contextPath, OutputStream outputStream) throws Exception {
      final File file = new File(serverConfiguration.getSourceDir() + "/" + contextPath);
      if (file.exists()) {
         IOUtils.copy(new FileInputStream(file), outputStream);
      } else {
         new PrintStream(outputStream).println("404");
      }
   }

   @Override
   public void run() {
      try {
         processConnection();
      } catch (final Exception e) {
         e.printStackTrace();
      }
   }
}
