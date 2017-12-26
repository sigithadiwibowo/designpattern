package com.sigit.pattern.behavioral.observer.java.util.observer;


import java.util.Observable;
import java.util.Observer;

public class ChatNotification implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Chat inbox : \"" + arg + "\"");
    }
}
