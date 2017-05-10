package com.sigit.pattern.stuctural.abstractdocument;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class KetoprakTest {

    @Test
    public void testCreateKetoprak() throws Exception {
        Ketoprak ketoprak = new Ketoprak();
        Assert.assertNotNull(ketoprak);
    }


    @Test
    public void testKetoprakPedes() throws Exception {
        Ketoprak ketoprak = new Ketoprak(4);
        Assert.assertEquals(ketoprak.getSpicyLevel(), 4);
    }

    @Test
    public void testKetoprakDefaultVegetable() throws Exception {
        Ketoprak ketoprak = new Ketoprak();
        Assert.assertEquals(ketoprak.getVegetable("timun"), "timun");
    }
}
