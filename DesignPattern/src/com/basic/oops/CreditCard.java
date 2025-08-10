package com.basic.oops;

public class CreditCard extends Card{
    CreditCard(String name, long accNum) {
        super(name, accNum);
    }

    @Override
    public void pay() {
        System.out.println("Credit card payment successful...");
    }
}
