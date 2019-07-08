package com.mx.desing.patterns.observer.demo2;

public class ObserverString implements IObserver {

    @Override
    public void update(String i) {
        System.out.println("ObserverString: myStringValue in Subject is now: " + i);
    }
}
