package com.sigit.pattern.behavioral.strategy;


import org.testng.annotations.Test;

public class PaymentProcessTest {

    @Test
    public void testPaymentWithCash() throws Exception {
        PaymentProcess process = new PaymentProcess(new CashPayment());
        process.doPay(1000000);
    }

    @Test
    public void testPaymentWithCreditCard() throws Exception {
        PaymentProcess process = new PaymentProcess(new CreditCardPayment("100000", "BCA"));
        process.doPay(10000000);
    }

    @Test
    public void testPaymentWithCashAndCreditCard() throws Exception {
        PaymentProcess process = new PaymentProcess(new CashPayment());
        process.doPay(10000000);
        process.setMethod(new CreditCardPayment("100000", "BCA"));
        process.doPay(4000000);
    }
}
