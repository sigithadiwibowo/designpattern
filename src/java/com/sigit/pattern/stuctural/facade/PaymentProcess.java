package com.sigit.pattern.stuctural.facade;


import com.sigit.pattern.stuctural.facade.salesorder.SalesOrderRepo;
import com.sigit.pattern.stuctural.facade.stock.StockRepo;

public class PaymentProcess {

    private StockRepo stockRepo;
    private SalesOrderRepo salesOrderRepo;

    public PaymentProcess(StockRepo stockRepo, SalesOrderRepo salesOrderRepo) {
        this.stockRepo = stockRepo;
        this.salesOrderRepo = salesOrderRepo;
    }

    public void doBuyProduct(String productId) {
        if (stockRepo.isReady(productId)) {
            salesOrderRepo.printSalesOrder(productId);
        }
    }

}
