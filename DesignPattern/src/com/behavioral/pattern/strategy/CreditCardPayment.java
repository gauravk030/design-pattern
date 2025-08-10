package com.behavioral.pattern.strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via Credit Card");
    }
}
