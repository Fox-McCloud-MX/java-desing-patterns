package com.mx.desing.patterns.singleton.demo1;

public class SingletonPatternEx {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        
        System.out.println("Trying to make a captain for our team");
        MakeACaptainLazy c1 = MakeACaptainLazy.getCaptain();
        
        System.out.println("Trying to make another captain for our team");
        MakeACaptainLazy c2 = MakeACaptainLazy.getCaptain();
        
        if (c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}
