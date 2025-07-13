package com.behavioral.pattern.observer;

public class MobileDevice implements Observer{
    private String name;

    public MobileDevice(String name){
        this.name = name;
    }
    @Override
    public void update(float temp) {
        System.out.println("Mobile device "+name+" temp is updated to "+temp+"c'");
    }
}
