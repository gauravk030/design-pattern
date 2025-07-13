package com.behavioral.pattern.observer;

import com.behavioral.pattern.observer.badcode.WeatherStation1;

import java.util.ArrayList;
import java.util.List;

//Wether station
public class WeatherStation implements Subject {
    private float temp;
    private List<Observer> observers;

    public WeatherStation(){
        this.observers = new ArrayList<>();
    }

    public void setTemperature(float temp){
        this.temp = temp;
        notifyAllObservers();
    }

    @Override
    public void attach(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyAllObservers() {
        observers.stream().forEach(o -> o.update(temp)); //Runtime polymorphism
    }
}
