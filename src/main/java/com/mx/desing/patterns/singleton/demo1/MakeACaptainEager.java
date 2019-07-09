package com.mx.desing.patterns.singleton.demo1;

public class MakeACaptainEager {

    /* Early initialization */
    private static MakeACaptainEager _captain = new MakeACaptainEager();

    /* We make the constructor private to prevent the use of "new" */
    private MakeACaptainEager() {
    }

    /*Global point of access //MakeACaptain.getCaptain() is a public static //method*/
    public static MakeACaptainEager getCaptain() {
        return _captain;
    }
}
