package com.basic.oops;

public class UPI implements PaymentMethod {
    String upiId;

    UPI(String upiId){
        this.upiId = upiId;
    }

    public void pay() {
        System.out.println("UPI payment successful...");
    }
}
