package com.mx.desing.patterns.proxy;

/*
What are the different types of proxies?

Mainly we are familiar with the following types:

Remote proxies.
    They will hide that actual object which is in a different address space.

Virtual proxies. 
    They are used to perform optimization techniques like the creation of a 
    heavy object on a demand basis.

Protection proxies. 
    They generally deal with different access rights.

Smart reference. 
    It can also perform some additional housekeeping work when an object is accessed.
*/
public class Proxy extends Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call happening now");
        if (cs == null) { //Lazy initialization
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
