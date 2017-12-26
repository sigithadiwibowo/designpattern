package com.sigit.pattern.stuctural.facade;


import com.sigit.pattern.stuctural.facade.salesorder.SalesOrderRepoImpl;
import org.testng.annotations.Test;

public class SalesOrderRepoTest {

    @Test
    public void testPrintSalesOrder() throws Exception {
        SalesOrderRepoImpl repo = new SalesOrderRepoImpl();
        repo.printSalesOrder("2");
    }
}
