package com.sigit.pattern.stuctural.abstractdocument;

import com.sigit.pattern.stuctural.abstractdocument.sauce.Mayonnaise;
import com.sigit.pattern.stuctural.abstractdocument.vegetable.Tomat;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class Salad extends AbstractSalad {
    public Salad() {
        super(new Mayonnaise(), 0);
        addVegetable(new Tomat());
    }
}
