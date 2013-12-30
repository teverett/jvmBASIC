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
   private static final String INDEX = "index.bas";
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
