package com.behavioral.pattern.strategy;

/**
 * 1. Difficult to maintain and extend because in future if I add a new UPI method
 * 2. I have to modify the existing code, which is again not a very good thing
 * 3. Violating open-close principle
 */
class PaymentService{
    public void processPayment(String paymentMethod){
        if(paymentMethod.equals("Credit Card")){
            System.out.println("Making payment via credit card");
        }
        else if(paymentMethod.equals("Debit Card")){
            System.out.println("Making payment via debit card");
        }
        else if(paymentMethod.equals("UPI")){
            //huge algorithm
            System.out.println("Making payment via UPI");
        }
        else{
            System.out.println("Unsupported Payment method");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("UPI");
    }
}
