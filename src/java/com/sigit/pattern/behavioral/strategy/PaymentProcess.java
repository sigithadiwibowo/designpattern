package com.sigit.pattern.behavioral.strategy;


public class PaymentProcess {


    private PaymentMethod method;

    public PaymentProcess(PaymentMethod method) {
        this.method = method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public void doPay(int nominal) {
        method.doPay(nominal);
    }


}
