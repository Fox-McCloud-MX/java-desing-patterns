package com.mx.desing.patterns.builder;

/* Builders common interface */
public interface IBuilder {

    void BuildBody();

    void InsertWheels();

    void AddHeadlights();

    Product GetVehicle();
}
