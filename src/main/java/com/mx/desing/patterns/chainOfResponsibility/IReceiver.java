package com.mx.desing.patterns.chainOfResponsibility;

public interface IReceiver {

    Boolean ProcessMessage(Message msg);
}
