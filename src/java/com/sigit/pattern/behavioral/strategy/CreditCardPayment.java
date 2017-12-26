package com.sigit.pattern.behavioral.strategy;


public class CreditCardPayment implements PaymentMethod {

    private String creditCard;
    private String bankName;

    public CreditCardPayment(String creditCard, String bankName) {
        this.creditCard = creditCard;
        this.bankName = bankName;
    }

    @Override
    public void doPay(int nominal) {
        System.out.println("merchant request to bank : " + bankName);
        System.out.println("merchant request to bank with number :" + creditCard);
        System.out.println("merchant got paid by : " + nominal);

    }
}
