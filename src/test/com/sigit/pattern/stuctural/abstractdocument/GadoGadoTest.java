package com.sigit.pattern.stuctural.abstractdocument;

import com.sigit.pattern.stuctural.abstractdocument.vegetable.Timun;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class GadoGadoTest {


    @Test
    public void testCreateGadoGado() throws Exception {
        GadoGado gadoGado = new GadoGado();
        Assert.assertNotNull(gadoGado);
    }

    @Test(description = "pedes level mengunakan 1 , 2 , 3 , 4 ")
    public void testCreateGadoGadoPedes() throws Exception {
        GadoGado gadoGadoPedes = new GadoGado(4);
        Assert.assertEquals(gadoGadoPedes.getSpicyLevel(), 4);
    }


    @Test(description = "saos gado gado ya kacang ")
    public void testGetGadoGadoSauce() throws Exception {
        GadoGado gadoGado = new GadoGado();
        Assert.assertEquals(gadoGado.getHasSauce().getName(), "kacang");
    }

    @Test
    public void testGetSayuranGadoGado() throws Exception {
        GadoGado gadoGado = new GadoGado();
        Assert.assertEquals(gadoGado.getVegetable("kangkung"), "kangkung");
    }

    @Test
    public void testGadoGadoGakPakeTimun() throws Exception {
        GadoGado gado = new GadoGado();
        gado.doNotAddVegetable(new Timun());
        Assert.assertNull(gado.getVegetable("timun"));

    }
}
