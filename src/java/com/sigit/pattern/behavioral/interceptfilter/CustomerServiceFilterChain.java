package com.sigit.pattern.behavioral.interceptfilter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class CustomerServiceFilterChain {


    private ServiceHandler handler;




    public void addHandler(ServiceHandler handler) {
        if (this.handler == null) {
            this.handler = handler;
        } else {
            this.handler.getLastHandler().setNextHandler(handler);
        }
    }

    public void doHandleIssue(Issue issue) {
        handler.doHandleIssue(issue , this );

    }


}
