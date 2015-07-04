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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author tome
 */
public class JVMBasicWebServer {
   /**
    * the server config
    */
   private final ServerConfiguration serverConfiguration;
   /**
    * thread pool size
    */
   private final int maxThreads = 10;

   /**
    * ctor
    */
   public JVMBasicWebServer(ServerConfiguration serverConfiguration) {
      this.serverConfiguration = serverConfiguration;
   }

   /**
    * accept incoming connections
    */
   public void listen() throws Exception {
      ServerSocket serverSocket = null;
      try {
         /*
          * thread pool
          */
         final ExecutorService executorService = new ThreadPoolExecutor(maxThreads, maxThreads, 1, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(maxThreads, true), new ThreadPoolExecutor.CallerRunsPolicy());
         /*
          * listener
          */
         serverSocket = new ServerSocket(serverConfiguration.getPort());
         Socket clientSocket = null;
         while (true) {
            try {
               /*
                * accept connection
                */
               clientSocket = serverSocket.accept();
               /*
                * submit to pool
                */
               executorService.submit(new RequestProcessor(clientSocket, serverConfiguration));
            } catch (final Exception e) {
               clientSocket.close();
               e.printStackTrace();
            }
         }
      } catch (final Exception e) {
         throw new Exception("Exception in accept", e);
      } finally {
         if (null != serverSocket) {
            serverSocket.close();
            serverSocket = null;
         }
      }
   }
}
