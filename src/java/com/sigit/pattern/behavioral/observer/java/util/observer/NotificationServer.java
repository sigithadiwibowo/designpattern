package com.sigit.pattern.behavioral.observer.java.util.observer;


import java.util.Observable;
import java.util.Observer;

public class NotificationServer extends Observable {

    public NotificationServer(Observer... registerObserver) {
        for (Observer observer : registerObserver) {
            this.addObserver(observer);
        }
    }

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }
}
