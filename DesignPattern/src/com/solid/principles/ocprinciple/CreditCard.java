package com.solid.principles.ocprinciple;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Making payment via credit card.");
    }
}
