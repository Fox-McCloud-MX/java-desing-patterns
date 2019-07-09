package com.mx.desing.patterns.singleton.demo1;

/*
This method does not need to use the synchronization technique and eager 
initialization. 
It is regarded as the standard method to implement singletons in Java.
*/
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
