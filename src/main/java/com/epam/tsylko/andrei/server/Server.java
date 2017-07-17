package com.epam.tsylko.andrei.server;


import com.epam.tsylko.andrei.controller.Controller;
import org.apache.log4j.Logger;


import java.util.concurrent.*;

public class Server {
    private final static Logger logger = Logger.getLogger(Server.class);

    private final static int THREAD_AMOUNT = 10;
        private final static ExecutorService service = Executors.newFixedThreadPool(THREAD_AMOUNT);
//    private final static ExecutorService service = Executors.newCachedThreadPool();

    private static final Server instance = new Server();


    private Server() {
    }

    public static Server getInstance() {
        return instance;
    }


//    public String xxx(String request){
//          processRequest(request);
//        while (!service.isTerminated()) {
//
//        }
//        return
//    }


    public String processRequest(String request) {

        String response = "";
        if (logger.isDebugEnabled()) {
            logger.debug("Server.processRequest()");
        }
        try {
//            ExecutorService service = Executors.newCachedThreadPool();
            Future<String> future = service.submit(new Worker(request));

            response = future.get();
        } catch (InterruptedException | ExecutionException e) {
            logger.error("Thread was died.", e);
        } finally {
//            service.shutdown();
        }
        return response;
    }

}


