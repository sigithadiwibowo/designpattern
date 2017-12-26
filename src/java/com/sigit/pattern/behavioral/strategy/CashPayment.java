package com.sigit.pattern.behavioral.strategy;


public class CashPayment implements PaymentMethod {
    @Override
    public void doPay(int nominal) {
        System.out.println("Payment Method by Cash : " + nominal);
    }
}
