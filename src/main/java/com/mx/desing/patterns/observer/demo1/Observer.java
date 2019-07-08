package com.mx.desing.patterns.observer.demo1;

/*
Our observer here wants to be notified when the flag value changes in the 
subject. With the output, you will discover that the observer is getting the 
notifications when the flag value changed to 5 or But there is no notification 
when the flag value changed to 50 because by this time the observer has 
unregistered himself from the subject.
*/
public class Observer {
    public void update() {
        System.out.println("flag value changed in Subject");
    }
}
