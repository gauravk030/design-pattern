package com.solid.ocprinciple;

import com.basic.oops.PaymentMethod;

public class UPI implements PaymentMethod {

    public void pay() {
        System.out.println("Making payment via upi");
    }
}
