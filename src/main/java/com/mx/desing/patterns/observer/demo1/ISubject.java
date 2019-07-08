package com.mx.desing.patterns.observer.demo1;


public interface ISubject {
    void register(Observer o);

    void unregister(Observer o);

    void notifyObservers();
}
