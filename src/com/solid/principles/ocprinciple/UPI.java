package com.solid.principles.ocprinciple;


public class UPI implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Making payment via upi");
    }
}
