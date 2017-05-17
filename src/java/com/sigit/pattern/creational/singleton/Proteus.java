package com.sigit.pattern.creational.singleton;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/17/2017.
 *         Copyright 2017
 */


public class Proteus implements GodOfGreekMythology {

    private static Proteus instance;

    public static Proteus getInstance() {
        if (instance == null) {
            instance = new Proteus();
        }
        return instance;
    }

    private Proteus() {
    }

    @Override
    public String godOf() {
        return "The waves and protector of the seals";
    }
}
