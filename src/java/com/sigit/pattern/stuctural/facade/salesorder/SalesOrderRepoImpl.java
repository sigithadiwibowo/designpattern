package com.sigit.pattern.stuctural.facade.salesorder;


public class SalesOrderRepoImpl implements SalesOrderRepo {
    @Override
    public void printSalesOrder(String productId) {
        System.out.println("Sales order product : " + productId);
    }
}
