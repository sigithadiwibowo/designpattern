package com.sigit.pattern.creational.abstractfactory.character.hero.strength;


import com.sigit.pattern.creational.abstractfactory.character.hero.AStrengthHero;
import com.sigit.pattern.creational.abstractfactory.character.RangeType;
import com.sigit.pattern.creational.abstractfactory.skill.HasBasicSkills;

/**
 * @author Sigit Hadi wibowo
 *         created date 8/19/2016.
 *         Copyright 2016
 */


public class Centaur extends AStrengthHero implements HasBasicSkills {


    @Override
    protected int getDefaultStr() {
        return 17;
    }

    @Override
    protected int getDefaultAgi() {
        return 13;
    }

    @Override
    protected int getDefaultIntel() {
        return 12;
    }

    @Override
    protected int getDefaultMana() {
        return 178;
    }

    @Override
    public RangeType getRangeType() {
        return RangeType.MELEE;
    }

    @Override
    public int getDefaultHealth() {
        return 960;
    }

    @Override
    public int getDefaultArmor() {
        return 3;
    }

    @Override
    public int getDefaultMovementSpeed() {
        return 290;
    }

    @Override
    public int getDefaultAttackRange() {
        return 150;
    }

    // todo improvement more than name skill

    @Override
    public String firstSkill() {
        return "Hoof Stomp";
    }

    @Override
    public String secondSkill() {
        return "Double Edge";
    }

    @Override
    public String thirdSkill() {
        return "Return";
    }

    @Override
    public String forthSkill() {
        return "Stampede";
    }

}
