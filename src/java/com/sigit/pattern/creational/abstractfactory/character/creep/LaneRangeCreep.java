package com.sigit.pattern.creational.abstractfactory.character.creep;


import com.sigit.pattern.creational.abstractfactory.character.ACharacter;
import com.sigit.pattern.creational.abstractfactory.character.HasMana;
import com.sigit.pattern.creational.abstractfactory.character.RangeType;

/**
 * @author Sigit Hadi wibowo 
 * created date 8/22/2016.
 * Copyright 2016
 */



public class LaneRangeCreep extends ACharacter implements IsCreep ,HasMana {
    @Override
    public RangeType getRangeType() {
        return RangeType.RANGE;
    }

    @Override
    public int getDefaultAttackRange() {
        return 500;
    }

    @Override
    public int getDefaultHealth() {
        return 320;
    }

    @Override
    public int getDefaultArmor() {
        return 0;
    }

    @Override
    public int getDefaultMovementSpeed() {
        return 270;
    }

    @Override
    public int getManaPoint() {
        return 300;
    }

    @Override
    public boolean isAggressive() {
        return true;
    }
}
