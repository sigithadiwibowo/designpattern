package com.sigit.pattern.stuctural.abstractdocument;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo 
 * created date 5/10/2017.
 * Copyright 2017
 */



public class SaladTest {

    @Test
    public void testCreateSalad() throws Exception {
        Salad salad = new Salad();
        Assert.assertNotNull(salad);

    }

    @Test
    public void testGetBumbuSalad() throws Exception {
        Salad salad = new Salad();
        Assert.assertEquals(salad.getHasSauce().getName() , "mayonnaise");
    }

    @Test
    public void testGetSalad() throws Exception {
        Salad salad = new Salad();
        Assert.assertEquals(salad.getVegetable("tomat") , "tomat");

    }
}
