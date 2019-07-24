package com.mx.desing.patterns.prototype;

public class PrototypePatternEx {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");
        
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 100000;
        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price = 500000;
        BasicCar bc1;

        bc1 = nano_base.clone(); //Clone Nano Object

        bc1.price = nano_base.price + BasicCar.setPrice(); //Price will be more than 100000 for sure
        System.out.println("Car is: " + bc1.modelname + " and it's price is Rs." + bc1.price);

        bc1 = ford_basic.clone(); //Clone Ford Object

        bc1.price = ford_basic.price + BasicCar.setPrice(); //Price will be more than 500000 for sure
        System.out.println("Car is: " + bc1.modelname + " and it's price is Rs." + bc1.price);
    }
}
