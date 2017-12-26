package com.sigit.pattern.behavioral.interceptfilter.customerservice;

import com.sigit.pattern.behavioral.interceptfilter.CustomerServiceFilterChain;
import com.sigit.pattern.behavioral.interceptfilter.Issue;
import com.sigit.pattern.behavioral.interceptfilter.ServiceHandler;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class SPVCustomerService implements ServiceHandler {

    @Override
    public void doHandleIssue(Issue issue , CustomerServiceFilterChain filterChain) {
        issue.setHandleBy(this.toString());
        System.out.println("SPVCustomerService.doHandleIssue");
        if (issue.getIssuePriority() > 20) {
            filterChain.doHandleIssue(issue);
            System.out.println(this.toString() + " said that issue is closed");
        } else {
            System.out.println("Issue closed by : " + issue.getHandleBy());
        }
    }

    @Override
    public String toString() {
        return "SPV CS";
    }
}
