package com.sigit.pattern.behavioral.interceptfilter;

import com.sigit.pattern.behavioral.interceptfilter.customerservice.ManagerCustomerService;
import com.sigit.pattern.behavioral.interceptfilter.customerservice.SPVCustomerService;
import com.sigit.pattern.behavioral.interceptfilter.customerservice.StaffCustomerService;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */

// filter manager
public class ComplainProcess {


    private CustomerServiceFilterChain filterChain ;

    public ComplainProcess() {
        filterChain = new CustomerServiceFilterChain(new ManagementResponse() , new StaffCustomerService() , new SPVCustomerService() , new ManagerCustomerService() );

    }



    public void doProcess(Customer customer  ) {
        filterChain.doHandleIssue(customer.getIssue());
    }


}
