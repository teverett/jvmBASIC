package com.khubla.jvmbasic.jvmbasicwww;

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
