package com.sigit.pattern.stuctural.abstractfactory.character;

/**
 * @author Sigit Hadi wibowo
 *         created date 8/19/2016.
 *         Copyright 2016
 */


public enum CrowdControlType {

    BLIND(1),
    FREEZE(2),
    STUN(3);

    private int value;

    public static CrowdControlType valueOf(int value) {
        if (value == BLIND.getValue()) {
            return BLIND;
        } else if (value == FREEZE.getValue()) {
            return FREEZE;
        } else if (value == STUN.getValue()) {
            return STUN;
        }
        return null;
    }

    CrowdControlType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
