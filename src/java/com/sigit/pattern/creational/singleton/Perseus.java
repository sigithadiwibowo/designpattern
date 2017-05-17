package com.sigit.pattern.creational.singleton;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/17/2017.
 *         Copyright 2017
 */


public class Perseus implements GodOfGreekMythology, DemiGodOfGreekMythology {

    private static Perseus instance;

    public static Perseus getInstance() {
        if (instance == null) {
            instance = new Perseus();
        }
        return instance;
    }

    private Perseus() {

    }

    @Override
    public int age() {
        return 30;
    }

    @Override
    public String godOf() {
        return "Son of Zeus";
    }


}
