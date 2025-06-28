package com.solid.ocprinciple;

import com.basic.oops.Card;

public class DebitCard  implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Making payment via debit card.");
    }
}
