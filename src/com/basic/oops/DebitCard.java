package com.basic.oops;

public class DebitCard extends Card{
    DebitCard(String name, long accNum) {
        super(name, accNum);
    }

    @Override
    public void pay() {
        System.out.println("Debit card payment successful...");
    }
}
