package com.sigit.pattern.behavioral.observer.java.util.observer;


import java.util.Observable;
import java.util.Observer;

public class SMSNotification implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("you got message in your sms \"" + arg + "\"");

    }
}
