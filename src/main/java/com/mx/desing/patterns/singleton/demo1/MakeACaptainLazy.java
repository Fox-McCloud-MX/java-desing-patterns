package com.mx.desing.patterns.singleton.demo1;

public class MakeACaptainLazy {

    private static MakeACaptainLazy _captain;

    private MakeACaptainLazy() { //We make the constructor private to prevent the use of "new"
    }

    //this implementation isn't thread safe.
    public static MakeACaptainLazy getCaptain() { // Lazy initialization
        if (_captain == null) {
            _captain = new MakeACaptainLazy();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return _captain;
    }
}
