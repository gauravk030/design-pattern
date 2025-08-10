package com.behavioral.pattern.observer.badcode;

public class WeatherStation1 {
    private float temp;
    private DisplayDevice1 displayDevice;

    public WeatherStation1(DisplayDevice1 displayDevice){
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp){
        this.temp = temp;
        notifyDevice();
    }

    public void notifyDevice(){
        displayDevice.showTemperature(temp);
    }
}
