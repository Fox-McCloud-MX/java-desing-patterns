package com.mx.desing.patterns.factory;

abstract class IAnimalFactory {

    /*if we cannot instantiate in later stage, we'll throw exception*/
    public abstract IAnimal GetAnimalType(String type) throws Exception;
}
