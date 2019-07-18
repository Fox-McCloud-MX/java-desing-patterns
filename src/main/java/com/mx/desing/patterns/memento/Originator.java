package com.mx.desing.patterns.memento;

public class Originator {

    private String state;
    Memento m;

    public void setState(String state) {
        this.state = state;
        System.out.println("State at present : " + state);
    }

    public Memento OriginatorMemento() { // Creates memento
        m = new Memento(state);
        return m;
    }

    public void Revert(Memento memento) { // Back to old state
        System.out.println("Restoring to previous state...");
        state = memento.getState();
        System.out.println("State at present :" + state);
    }
}
