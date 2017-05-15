package com.sigit.pattern.creational.abstractfactory.character.creep;


import com.sigit.pattern.creational.abstractfactory.character.ACharacter;
import com.sigit.pattern.creational.abstractfactory.character.RangeType;

/**
 * @author Sigit Hadi wibowo 
 * created date 8/22/2016.
 * Copyright 2016
 */



public class LaneMeleeCreep extends ACharacter implements IsCreep{
    @Override
    public RangeType getRangeType() {
        return RangeType.MELEE;
    }

    @Override
    public int getDefaultAttackRange() {
        return 120;
    }

    @Override
    public int getDefaultHealth() {
        return 420;
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
    public boolean isAggressive() {
        return true;
    }
}
