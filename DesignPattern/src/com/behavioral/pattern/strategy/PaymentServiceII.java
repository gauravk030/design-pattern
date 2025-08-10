package com.behavioral.pattern.strategy;

public class PaymentServiceII{
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(){
        strategy.processPayment(); //Polymorphic Behaviour
    }

}
