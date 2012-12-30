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
      try {
         /*
          * thread pool
          */
         final ExecutorService executorService = new ThreadPoolExecutor(maxThreads, maxThreads, 1, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(maxThreads, true),
               new ThreadPoolExecutor.CallerRunsPolicy());
         /*
          * listener
          */
         final ServerSocket serverSocket = new ServerSocket(serverConfiguration.getPort());
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
      }
   }
}
