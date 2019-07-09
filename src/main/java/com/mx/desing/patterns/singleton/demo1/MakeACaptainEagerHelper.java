package com.mx.desing.patterns.singleton.demo1;

public class MakeACaptainEagerHelper {

    private static MakeACaptainEagerHelper _captain;

    private MakeACaptainEagerHelper() {
    }

    /* Bill Pugh solution */
    private static class SingletonHelper {

        /* Nested class is referenced after getCaptain() is called */
        private static final MakeACaptainEagerHelper _captain = new MakeACaptainEagerHelper();
    }

    public static MakeACaptainEagerHelper getCaptain() {
        return SingletonHelper._captain;
    }
}
