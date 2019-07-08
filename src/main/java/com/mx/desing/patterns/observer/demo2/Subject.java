package com.mx.desing.patterns.observer.demo2;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private int myIntValue;
    private String myStringValue;
    List<IObserver> observersList = new ArrayList<IObserver>();

    public int getMyValue() {
        return myIntValue;
    }

    public void setMyValue(int myIntValue) {
        this.myIntValue = myIntValue;
        //Notify observers
        notifyObservers(myIntValue);
    }
    
    public void setStringValue(String myStringValue) {
        this.myStringValue = myStringValue;
        //Notify observers
        notifyObservers(myStringValue);
    }
    
    @Override
    public void register(IObserver o) {
        observersList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(int updatedValue) {
        for (int i = 0; i < observersList.size(); i++) {
            observersList.get(i).update(updatedValue);
        }
    }
    
    @Override
    public void notifyObservers(String updatedValue) {
        for (int i = 0; i < observersList.size(); i++) {
            observersList.get(i).update(updatedValue);
        }
    }
}
