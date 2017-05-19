package com.sigit.pattern.behavioral.interceptfilter;

import com.sigit.pattern.behavioral.interceptfilter.customerservice.ManagerCustomerService;
import com.sigit.pattern.behavioral.interceptfilter.customerservice.SPVCustomerService;
import com.sigit.pattern.behavioral.interceptfilter.customerservice.StaffCustomerService;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/18/2017.
 *         Copyright 2017
 */


public class IssueRegisterTest {

//    @Test(enabled = false)
    @Test()
    public void testIssueHandleByStaffCustomer() throws Exception {
        Issue issue = new Issue();
        issue.setIssuePriority(10);
        Customer customer = new Customer(issue);
        ComplainProcess process = new ComplainProcess();
//        process.addFilterCustomerChain(new StaffCustomerService());
//        process.addFilterCustomerChain(new SPVCustomerService());
//        process.addFilterCustomerChain(new ManagerCustomerService());
        process.doProcess(customer);
    }


    @Test()
//    @Test(enabled = false)
    public void testIssueHandleBySPVCustomer() throws Exception {
        Issue issue = new Issue();
        issue.setIssuePriority(20);
        Customer customer = new Customer(issue);
        ComplainProcess process = new ComplainProcess();
//        process.addFilterCustomerChain(new StaffCustomerService());
//        process.addFilterCustomerChain(new SPVCustomerService());
//        process.addFilterCustomerChain(new ManagerCustomerService());
        process.doProcess(customer);
    }



    @Test()
//@Test(enabled = false)
    public void testIssueHandleByManager() throws Exception {
        Issue issue = new Issue();
        issue.setIssuePriority(30);
        Customer customer = new Customer(issue);
        ComplainProcess process = new ComplainProcess();
//        process.addFilterCustomerChain(new StaffCustomerService());
//        process.addFilterCustomerChain(new SPVCustomerService());
//        process.addFilterCustomerChain(new ManagerCustomerService());
        process.doProcess(customer);
    }

    @Test()
    public void testIssueHandleByManagement() throws Exception {
        Issue issue = new Issue();
        issue.setIssuePriority(50);
        Customer customer = new Customer(issue);
        ComplainProcess process = new ComplainProcess();
        process.doProcess(customer);
    }
}
