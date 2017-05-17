package com.sigit.pattern.creational.singleton;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/17/2017.
 *         Copyright 2017
 */


public class Olympus {

    private static Olympus instance;

    private GodOfGreekMythology rulerOfOlympus;

    public static Olympus getInstance() {
        if (instance == null) {
            instance = new Olympus();
            instance.setRuleOfOlympus(Zeus.getInstance());
        }
        return instance;
    }

    public void setRuleOfOlympus(GodOfGreekMythology ruler) {
        rulerOfOlympus = ruler;
    }

    public String getRulerOfTheOlympus() {
        return rulerOfOlympus.godOf();
    }
}
