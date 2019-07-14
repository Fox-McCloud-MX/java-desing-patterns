package com.mx.desing.patterns.command;

public class MyUndoCommand implements ICommand {

    private Receiver receiver;

    MyUndoCommand(Receiver recv) {
        receiver = recv;
    }

    @Override
    public void Do() {

        receiver.performUndo(); //Call undo in receiver
    }
}
