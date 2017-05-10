package com.sigit.pattern.stuctural.abstractfactory.character.hero;


import com.sigit.pattern.stuctural.abstractfactory.character.ACharacter;
import com.sigit.pattern.stuctural.abstractfactory.character.HasMana;

/**
 * @author Sigit Hadi wibowo
 *         created date 8/19/2016.
 *         Copyright 2016
 */


public abstract class AHero extends ACharacter implements HasStat, HasMana , IsHero{
    private int level = 1;
    private int agi = 0;
    private int str = 0;
    private int intel = 0;
    private int mana = 0;

    private final int MAX_LEVEL = 25;

    public AHero() {
        agi = getDefaultAgi();
        str = getDefaultStr();
        intel = getDefaultIntel();
        mana = getDefaultMana();

    }


    public abstract HeroType getHeroType();

    private final int UPDATE_SAME_STAT = 3;
    private final int UPDATE_OTHER_STAT = 1;


    public final void levelUp() {
        if (getLevel() < MAX_LEVEL) {
            // todo improve stat value .
            int additionalStr = 0 ;
            int additionalAgi = 0 ;
            int additionalInt = 0 ;
            if (getHeroType().equals(HeroType.AGI)) {
                additionalStr = UPDATE_OTHER_STAT ;
                additionalAgi = UPDATE_SAME_STAT ;
                additionalInt = UPDATE_OTHER_STAT ;
            } else if (getHeroType().equals(HeroType.STR)) {
                additionalStr = UPDATE_SAME_STAT ;
                additionalAgi = UPDATE_OTHER_STAT ;
                additionalInt = UPDATE_OTHER_STAT ;
            } else if (getHeroType().equals(HeroType.INT)) {
                additionalStr = UPDATE_OTHER_STAT ;
                additionalAgi = UPDATE_OTHER_STAT ;
                additionalInt = UPDATE_SAME_STAT ;
            }
            this.setStrStat(this.getStrStat() + additionalStr);
            this.setIntStat(this.getIntStat() + additionalInt);
            this.setAgiStat(this.getAgiStat() + additionalAgi);
            this.addToHealth(additionalStr);
            this.addIntoMana(additionalInt);
            this.addIntoArmor(additionalAgi);
            level++;
        }
    }

    private void addToHealth(int additionalStr){
        addHealthPoint(additionalStr * 25);
    }


    private void addIntoMana(int additionalInt){
        addManaPoint(additionalInt * 10);
    }

    private void addIntoArmor(int additionalAgi){
      addArmorPoint(Double.valueOf(additionalAgi * 0.2).intValue());
    }


    private void addManaPoint(int mana){
        this.mana = this.mana + mana ;
    }


    public final int getLevel() {
        return level;
    }


    // todo improvement flow of add status
    private void setStrStat(int str) {
        this.str = str;
    }

    private void setIntStat(int intel) {
        this.intel = intel;
    }

    private void setAgiStat(int agi) {
        this.agi = agi;
    }

    @Override
    public final int getStrStat() {
        return str;
    }

    @Override
    public final int getIntStat() {
        return intel;
    }

    @Override
    public final int getAgiStat() {
        return agi;
    }

    @Override
    public final int getManaPoint() {
        return mana;
    }

    protected abstract int getDefaultStr();

    protected abstract int getDefaultAgi();

    protected abstract int getDefaultIntel();

    protected abstract int getDefaultMana();


}
