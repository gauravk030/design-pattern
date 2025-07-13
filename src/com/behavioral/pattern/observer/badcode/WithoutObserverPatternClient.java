package com.behavioral.pattern.observer.badcode;

public class WithoutObserverPatternClient {
    public static void main(String[] args) {
        WeatherStation1 weatherStation = new WeatherStation1(new DisplayDevice1());
        weatherStation.setTemperature(26);
        weatherStation.setTemperature(30);
    }
}
