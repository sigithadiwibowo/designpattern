package com.sigit.pattern.stuctural.abstractdocument;

import com.sigit.pattern.stuctural.abstractdocument.sauce.BumbuKacang;
import com.sigit.pattern.stuctural.abstractdocument.sauce.HasSauce;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.Timun;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class Ketoprak extends AbstractSalad {

    public Ketoprak(int spicyLevel) {
        super(new BumbuKacang(), spicyLevel);
        defaultVegetable();
    }

    public Ketoprak() {
        super(new BumbuKacang(), 4);
        defaultVegetable();
    }

    private void defaultVegetable() {
        addVegetable(new Timun());
    }


}
