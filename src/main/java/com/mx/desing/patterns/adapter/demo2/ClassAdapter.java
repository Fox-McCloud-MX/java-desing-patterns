package com.mx.desing.patterns.adapter.demo2;

public class ClassAdapter extends IntegerValue {

    @Override
    public int getInteger() {
        return 2 + super.getInteger(); //Incrementing by 2
    }
}
