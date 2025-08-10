package com.behavioral.pattern.strategy;

class DebitCardPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Making payment via Debit Card");
    }
}