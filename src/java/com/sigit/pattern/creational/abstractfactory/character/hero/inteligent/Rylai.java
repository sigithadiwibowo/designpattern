package com.sigit.pattern.creational.abstractfactory.character.hero.inteligent;

;import com.sigit.pattern.creational.abstractfactory.character.RangeType;
import com.sigit.pattern.creational.abstractfactory.character.hero.AIntelligentHero;
import com.sigit.pattern.creational.abstractfactory.skill.HasBasicSkills;

/**
 * @author Sigit Hadi wibowo
 *         created date 8/22/2016.
 *         Copyright 2016
 */


public class Rylai extends AIntelligentHero implements HasBasicSkills {

    @Override
    protected int getDefaultStr() {
        return 14;
    }

    @Override
    protected int getDefaultAgi() {
        return 14;
    }

    @Override
    protected int getDefaultIntel() {
        return 17;
    }

    @Override
    protected int getDefaultMana() {
        return 400;
    }

    @Override
    public RangeType getRangeType() {
        return RangeType.RANGE;
    }

    @Override
    public int getDefaultAttackRange() {
        return 600;
    }

    @Override
    public int getDefaultHealth() {
        return 520;
    }

    @Override
    public int getDefaultArmor() {
        return 2;
    }

    @Override
    public int getDefaultMovementSpeed() {
        return 280;
    }

    @Override
    public String firstSkill() {
        return "Crystal nova";
    }

    @Override
    public String secondSkill() {
        return "Frost bite";
    }

    @Override
    public String thirdSkill() {
        return "Arcane aura";
    }

    @Override
    public String forthSkill() {
        return "Freezing field";
    }
}
