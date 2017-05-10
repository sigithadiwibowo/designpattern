package com.sigit.pattern.stuctural.abstractfactory.character;

/**
 * @author Sigit Hadi wibowo 
 * created date 8/19/2016.
 * Copyright 2016
 */



public enum RangeType {


    MELEE(1),
    RANGE(2);

    private int value;

    public static RangeType valueOf(int value) {
        if (value == MELEE.getValue()) {
            return MELEE;
        } else if (value == RANGE.getValue()) {
            return RANGE;
        }
        return null;
    }

    RangeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
