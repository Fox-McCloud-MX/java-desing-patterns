package com.mx.desing.patterns.observer.demo2;

/*
Let us consider a relatively complex problem. Let us assume the following:

1. Now we need to have a multiple observer class.
2. And we also want to know about the exact change in the subject. 
If you notice our earlier implementation, you can easily understand that there 
we are getting some kind of notification but our observer does not know about 
the changed value in the subject
*/
public interface IObserver {
    default void update(int i){};
    default void update(String i){};
}
