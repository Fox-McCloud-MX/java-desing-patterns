package com.mx.desing.patterns.strategy;

public class Context {

    IChoice myC;

    public void SetChoice(IChoice ic) { // Set a Strategy or algorithm in the Context
        myC = ic;
    }

    public void ShowChoice(String s1, String s2) {
        myC.myChoice(s1, s2);
    }
}
