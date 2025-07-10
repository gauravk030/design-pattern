package com.solid.principles.ocprinciple;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.paymentProcess(new CreditCard());
        processor.paymentProcess(new DebitCard());
        processor.paymentProcess(new UPI());
    }
}
