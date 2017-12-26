package com.sigit.pattern.behavioral.interceptfilter.customerservice;

import com.sigit.pattern.behavioral.interceptfilter.CustomerServiceFilterChain;
import com.sigit.pattern.behavioral.interceptfilter.Issue;
import com.sigit.pattern.behavioral.interceptfilter.ServiceHandler;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class StaffCustomerService implements ServiceHandler {

    @Override
    public void doHandleIssue(Issue issue, CustomerServiceFilterChain filterChain) {
        issue.setHandleBy(this.toString());
        System.out.println("StaffCustomerService.doHandleIssue");
        if (issue.getIssuePriority() > 10) {
            filterChain.doHandleIssue(issue);
            // tell customer its done
            System.out.println(this.toString() + " said that issue is closed");
        } else {
            System.out.println("Issue closed by : " + issue.getHandleBy());
        }

    }


    @Override
    public String toString() {
        return "Staff CS";
    }
}
