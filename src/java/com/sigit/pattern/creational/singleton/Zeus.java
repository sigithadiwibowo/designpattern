package com.sigit.pattern.creational.singleton;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/17/2017.
 *         Copyright 2017
 */


public class Zeus implements GodOfGreekMythology {

    public static Zeus instance;

    public static Zeus getInstance() {
        if (instance == null) {
            instance = new Zeus();
        }
        return instance;
    }

    private Zeus() {
    }


    @Override
    public String godOf() {
        return "Thunder and the sky";
    }
}
