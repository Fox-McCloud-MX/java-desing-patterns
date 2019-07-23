package com.mx.desing.patterns.mediator;

import lombok.Setter;

@Setter
public class ConcreteMediator extends Mediator {

    private Friend1 friend1;
    private Friend2 friend2;
    private Boss boss;

    @Override
    public void Send(Friend frd, String msg) {

        if (frd == friend1) { //In all cases, boss is notified
            friend2.Notify(msg);
            boss.Notify(friend1.name + " sends message to " + friend2.name);
        }

        if (frd == friend2) {
            friend1.Notify(msg);
            boss.Notify(friend2.name + " sends message to " + friend1.name);
        }

        if (frd == boss) { //Boss is sending message to others
            friend1.Notify(msg);
            friend2.Notify(msg);
        }
    }

}
