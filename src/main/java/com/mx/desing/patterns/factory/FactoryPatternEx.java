package com.mx.desing.patterns.factory;

public class FactoryPatternEx {

    public static void main(String[] args) throws Exception {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType = animalFactory.GetAnimalType("Duck");
        DuckType.Speak();
        IAnimal TigerType = animalFactory.GetAnimalType("Tiger");
        TigerType.Speak();

        IAnimal LionType = animalFactory.GetAnimalType("Lion"); //There is no Lion type. So, an exception will be thrown
        LionType.Speak();
    }
}
