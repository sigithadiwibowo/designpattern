package com.sigit.pattern.behavioral.interceptfilter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */

// filter manager
public class ComplainProcess {

    ManagementResponse response = new ManagementResponse();
    CustomerServiceFilterChain filterChain = new CustomerServiceFilterChain();

    public ComplainProcess() {
    }


    public void addFilterCustomerChain(ServiceHandler handler) {
        filterChain.addHandler(handler);
    }


    public void doProcess(Customer customer  ) {
        filterChain.doHandleIssue(customer.getIssue());


//        response.doHandleIssue(issue);
    }


}
