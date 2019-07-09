package com.mx.desing.patterns.singleton.demo1;

public class MakeACaptainLazyThreadSafe {

    private static MakeACaptainLazyThreadSafe _captain;

    private MakeACaptainLazyThreadSafe() { //We make the constructor private to prevent the use of "new"
    }

    //this implementation is thread safe adding synchronized
    public static synchronized MakeACaptainLazyThreadSafe getCaptain() { // Lazy initialization
        if (_captain == null) {
            _captain = new MakeACaptainLazyThreadSafe();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return _captain;
    }
}
