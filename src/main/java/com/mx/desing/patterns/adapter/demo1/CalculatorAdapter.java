package com.mx.desing.patterns.adapter.demo1;

/*
Calculate the area of a Triangle using CalculatorAdapter. 
Please note here: this time our input is a Triangle.
 */
public class CalculatorAdapter {

    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle t) {
        calculator = new Calculator();
        triangle = t;
        Rect r = new Rect(); 
        r.l = triangle.b;
        r.w = 0.5 * triangle.h; //Area of Triangle=0.5*base*height
        return calculator.getArea(r);
    }
}
