package com.solid.ocprinciple;

import com.basic.oops.Card;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Making payment via credit card.");
    }
}
