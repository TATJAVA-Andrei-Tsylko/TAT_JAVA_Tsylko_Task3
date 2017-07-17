package com.epam.tsylko.andrei.server;

import com.epam.tsylko.andrei.controller.Controller;
import org.apache.log4j.Logger;

import java.util.concurrent.Callable;

public class Worker implements Callable<String> {

    private final static Logger logger = Logger.getLogger(Worker.class);
    private String msg;
    private String response;

    public Worker(String msg) {
        this.msg = msg;

    }

    public String getResponse() {
        return response;
    }

    @Override
    public String call() throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Thread name: " + Thread.currentThread().getName() + "; request: " + msg);
        }

        Controller controller = new Controller();
        response = controller.executeTask(msg);

        if (logger.isDebugEnabled()) {
            logger.debug("Thread name: " + Thread.currentThread().getName() + "; response: " + response);
        }
        return response;
    }
}
