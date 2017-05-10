package com.sigit.pattern.stuctural.abstractdocument;

import com.sigit.pattern.stuctural.abstractdocument.sauce.HasSauce;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.HasVegetable;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.Timun;

import java.util.HashMap;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public abstract class AbstractSalad {

    private HasSauce hasSauce;
    private int spicyLevel;
    private HashMap<String, HasVegetable> mapOfVegetable = new HashMap<String, HasVegetable>();

    public AbstractSalad(HasSauce hasSauce, int spicyLevel) {
        this.hasSauce = hasSauce;
        this.spicyLevel = spicyLevel;
    }

    protected void addVegetable(HasVegetable vegetable) {
        mapOfVegetable.put(vegetable.getName(), vegetable);
    }

    public String getVegetable(String vegetable) {
        HasVegetable vege = mapOfVegetable.get(vegetable);
        return vege == null ? null : vege.getName();
    }

    public void removeVegetable(HasVegetable vegetable) {
        mapOfVegetable.remove(vegetable.getName());
    }

    protected HasSauce getHasSauce() {
        return hasSauce;
    }

    public int getSpicyLevel() {
        return spicyLevel;
    }

    public void setSpicyLevel(int spicyLevel) {
        this.spicyLevel = spicyLevel;
    }


}
