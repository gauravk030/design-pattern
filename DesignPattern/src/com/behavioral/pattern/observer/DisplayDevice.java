package com.behavioral.pattern.observer;

public class DisplayDevice implements Observer {
    private String name;

    public DisplayDevice(String name){
        this.name = name;
    }

    @Override
    public void update(float temp) {
        System.out.println("Device " +name+ " temp is updated to "+temp+"c'");
    }
}
