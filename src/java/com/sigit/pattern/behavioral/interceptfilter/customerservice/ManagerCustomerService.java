package com.sigit.pattern.behavioral.interceptfilter.customerservice;

import com.sigit.pattern.behavioral.interceptfilter.Issue;
import com.sigit.pattern.behavioral.interceptfilter.ServiceHandler;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class ManagerCustomerService implements ServiceHandler {

    ServiceHandler handler;


    @Override
    public void setNextHandler(ServiceHandler nextHandler) {
        this.handler = nextHandler;
    }

    @Override
    public ServiceHandler getLastHandler() {
        ServiceHandler last = this;
        while (last.getNextHandler() != null) {
            last = last.getNextHandler();
        }
        return last;
    }

    @Override
    public ServiceHandler getNextHandler() {
        return this.handler;
    }

    @Override
    public void doHandleIssue(Issue issue) {
        issue.setHandleBy(this.toString());
        System.out.println("ManagerCustomerService.doHandleIssue");
        if (issue.getIssuePriority() > 30) {
            handler.doHandleIssue(issue);
//            System.out.println(handler.toString() + " told " + lastHandlerBy.toString() + " that issue is closed");
            System.out.println(this.toString() + " said that issue is closed");
        } else {
            System.out.println("Issue closed by : " + issue.getHandleBy());
        }
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
