package com.sigit.pattern.stuctural.abstractdocument;

import com.sigit.pattern.stuctural.abstractdocument.sauce.BumbuKacang;
import com.sigit.pattern.stuctural.abstractdocument.sauce.HasSauce;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.HasVegetable;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.Kangkung;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.Kentang;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.Timun;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class GadoGado extends AbstractSalad {


    private static final int default_spicy_level = 2;


    public GadoGado() {
        super(new BumbuKacang(), default_spicy_level);
        defaultVegetable();
    }

    public GadoGado(int spicyLevel) {
        super(new BumbuKacang(), spicyLevel);
        defaultVegetable();
    }

    private void defaultVegetable() {
        addVegetable(new Kangkung());
        addVegetable(new Kentang());
        addVegetable(new Timun());
    }



    public void doNotAddVegetable(HasVegetable vegetable) {
        removeVegetable(vegetable);
    }
}
