package com.mx.desing.patterns.observer.demo2;

public class ObserverInt implements IObserver {

    @Override
    public void update(int i) {
        System.out.println("ObserverInt: myIntValue in Subject is now: " + i);
    }
}
