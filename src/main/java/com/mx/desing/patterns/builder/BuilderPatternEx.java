package com.mx.desing.patterns.builder;

public class BuilderPatternEx {

    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");
        Director director = new Director();
        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new MotorCycle();

        director.Construct(carBuilder); // Making Car
        Product p1 = carBuilder.GetVehicle();
        p1.Show();

        director.Construct(motorBuilder); //Making MotorCycle
        Product p2 = motorBuilder.GetVehicle();
        p2.Show();
    }
}
