package com.sigit.pattern.stuctural.facade;


import com.sigit.pattern.stuctural.facade.salesorder.SalesOrderRepoImpl;
import com.sigit.pattern.stuctural.facade.stock.StockRepoImpl;
import org.testng.annotations.Test;

public class PaymentProcessTest {


    @Test
    public void testFullProcessPaymentOutOfStock() throws Exception {
        PaymentProcess paymentProcess = new PaymentProcess(new StockRepoImpl() , new SalesOrderRepoImpl());
        paymentProcess.doBuyProduct("1");
    }



    @Test
    public void testFullProcessPaymentReadyStock() throws Exception {
        PaymentProcess paymentProcess = new PaymentProcess(new StockRepoImpl() , new SalesOrderRepoImpl());
        paymentProcess.doBuyProduct("2");
    }
}
