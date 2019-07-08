package com.mx.desing.patterns.observer.demo2;

public class ObserverPatternEx {
    public static void main(String[] args) {
        System.out.println("*** Modified Observer Pattern Demo***\n");
        
        Subject sub = new Subject();
        ObserverInt ob1 = new ObserverInt();
        ObserverString ob2 = new ObserverString();
        
        //register observer
        sub.register(ob1);
        sub.register(ob2);
        
        sub.setMyValue(5);
        System.out.println();
        
        sub.setMyValue(25);
        System.out.println("Value changed to 25");
        
        sub.unregister(ob1); //unregister ob1 only
        sub.setMyValue(100); //Now only ob2 will observe the change
        
        sub.setStringValue("New Value");
    }
}
