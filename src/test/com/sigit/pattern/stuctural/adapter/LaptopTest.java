package com.sigit.pattern.stuctural.adapter;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/16/2017.
 *         Copyright 2017
 */


public class LaptopTest {

    @Test
    public void testReadDataWithoutSDCard() throws Exception {
        Laptop laptop = new Laptop();
        Assert.assertNull(laptop.getDataFromSDCard());
    }

    @Test
    public void testReadDataWithSDCard() throws Exception {
        Laptop laptop = new Laptop();
        laptop.setIsSDCard(new SDCard());
        Assert.assertEquals(laptop.getDataFromSDCard() , "SD card");
    }


    @Test
    public void testReadDataWithAdapterSDCard() throws Exception {

        Laptop laptop = new Laptop();
        laptop.setIsSDCard(new AdaptorSDCard());
        Assert.assertEquals(laptop.getDataFromSDCard() , "microSD");

    }
}
