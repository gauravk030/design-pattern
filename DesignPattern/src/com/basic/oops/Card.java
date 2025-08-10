package com.basic.oops;

public abstract class Card implements PaymentMethod {
    protected String name;
    protected long accNum;

    Card(String name,long accNum){
        this.name = name;
        this.accNum = accNum;
    }

    public String getName() {
        return name;
    }
    public long getAccNum() {
        return accNum;
    }

    public abstract void pay();
}
