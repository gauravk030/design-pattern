package com.solid.principles.ocprinciple;

public class DebitCard  implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Making payment via debit card.");
    }
}
