package com.sigit.pattern.stuctural.abstractfactory.character.hero.agility;


import com.sigit.pattern.stuctural.abstractfactory.character.RangeType;
import com.sigit.pattern.stuctural.abstractfactory.character.hero.AAgilityHero;
import com.sigit.pattern.stuctural.abstractfactory.skill.HasBasicSkills;

/**
 * @author Sigit Hadi wibowo 
 * created date 8/22/2016.
 * Copyright 2016
 */



public class Motred extends AAgilityHero implements HasBasicSkills {
    @Override
    protected int getDefaultStr() {
        return 16;
    }

    @Override
    protected int getDefaultAgi() {
        return 19;
    }

    @Override
    protected int getDefaultIntel() {
        return 14;
    }

    @Override
    protected int getDefaultMana() {
        return 197;
    }

    @Override
    public RangeType getRangeType() {
        return RangeType.MELEE;
    }

    @Override
    public int getDefaultAttackRange() {
        return 150;
    }

    @Override
    public int getDefaultHealth() {
        return 610;
    }

    @Override
    public int getDefaultArmor() {
        return 6;
    }

    @Override
    public int getDefaultMovementSpeed() {
        return 310;
    }

    @Override
    public String firstSkill() {
        return "Stifling Dagger";
    }

    @Override
    public String secondSkill() {
        return "Phantom Strike ";
    }

    @Override
    public String thirdSkill() {
        return "Blur";
    }

    @Override
    public String forthSkill() {
        return "Coup de grace";
    }
}
