package com.behavioral.pattern.observer;

public interface Subject {
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyAllObservers();
}
