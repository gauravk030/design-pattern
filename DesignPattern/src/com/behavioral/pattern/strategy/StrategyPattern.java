package com.behavioral.pattern.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentServiceII paymentService = new PaymentServiceII();
        paymentService.setPaymentStrategy(new UPIPayment());
        paymentService.pay();
    }
}