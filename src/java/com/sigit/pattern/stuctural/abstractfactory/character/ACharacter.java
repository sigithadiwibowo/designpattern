package com.sigit.pattern.stuctural.abstractfactory.character;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sigit Hadi wibowo
 *         created date 8/19/2016.
 *         Copyright 2016
 */


public abstract class ACharacter {

    private int health = 0;
    private int armor = 0;
    private int attackRange = 0;
    private int movementSpeed = 0 ;

    public ACharacter() {
        this.health = getDefaultHealth();
        this.armor = getDefaultArmor();
        this.attackRange = getDefaultAttackRange() ;
        this.movementSpeed = getDefaultMovementSpeed();
    }

    private List<CrowdControlType> crowdControlTypeList = new ArrayList<>();

    public List<CrowdControlType> getEffectCrowdControl() {
        return crowdControlTypeList;
    }

    public void addCrowdControl(CrowdControlType crowdControlType) {
        crowdControlTypeList.add(crowdControlType);
    }

    public void resetCrowdControl(CrowdControlType crowdControlType) {
        crowdControlTypeList = new ArrayList<>();
    }

    public void removeCrowdControl(CrowdControlType crowdControlType) {
        crowdControlTypeList.remove(crowdControlType);
    }

    public abstract RangeType getRangeType();

    public abstract int getDefaultAttackRange();

    public abstract int getDefaultHealth();

    public abstract int getDefaultArmor();

    public abstract int getDefaultMovementSpeed();

    protected final void addHealthPoint(int health) {
        this.health = this.health + health;
    }

    protected final void subtractHealthPoint(int health) {
        this.health = this.health - health;
    }

    protected final void addArmorPoint(int armor) {
        this.armor = this.armor + armor;
    }

    protected final void subtractArmorPoint(int armor) {
        this.armor = this.armor - armor;
    }

    public final boolean isLive() {
        return health != 0;
    }

    public final int getHealth() {
        return health;
    }

    public final int getArmor() {
        return armor;
    }

    public final int getAttackRange(){
        return attackRange ;
    }

    public final int getMovementSpeed(){
        return movementSpeed ;
    }
}
