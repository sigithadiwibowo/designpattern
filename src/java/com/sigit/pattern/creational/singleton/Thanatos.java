package com.sigit.pattern.creational.singleton;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/17/2017.
 *         Copyright 2017
 */


public class Thanatos implements GodOfGreekMythology {

    private static Thanatos instance;

    public static Thanatos getInstance() {
        if (instance == null) {
            instance = new Thanatos();
        }
        return instance;
    }

    private Thanatos() {
    }

    @Override
    public String godOf() {
        return "Death";
    }
}
