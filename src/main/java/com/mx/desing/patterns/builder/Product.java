package com.mx.desing.patterns.builder;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts; // We can use any data structure that you prefer. We have used LinkedList here.

    public Product() {
        parts = new LinkedList<String>();
    }

    public void Add(String part) {
        parts.addLast(part); //Adding parts
    }

    public void Show() {
        System.out.println("\n Product completed as below :");
        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
