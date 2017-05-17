package com.sigit.pattern.creational.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/17/2017.
 *         Copyright 2017
 */


public class RulerOfOlympusTest {

    @Test
    public void testOlympusBuilt() throws Exception {
        Olympus olympus = Olympus.getInstance();
        Assert.assertNotNull(olympus);
    }

    @Test
    public void testOlympusAndDifferentPlace() throws Exception {
        Olympus olympusIndonesia = Olympus.getInstance();
        Olympus olympusMalaysia = Olympus.getInstance();
        Assert.assertEquals(olympusMalaysia, olympusIndonesia);
    }


    @Test
    public void testOlympusDefaultRulerIsZeus() throws Exception {
        Olympus olympusIndonesia = Olympus.getInstance();
        olympusIndonesia.setRuleOfOlympus(Zeus.getInstance());
        Assert.assertEquals(olympusIndonesia.getRulerOfTheOlympus() , "Thunder and the sky");
    }

    @Test
    public void testChangeRulerOfTheOlympusToThanatos() throws Exception {
        Olympus olympusIndonesia = Olympus.getInstance();
        olympusIndonesia.setRuleOfOlympus(Thanatos.getInstance());
        Assert.assertEquals(olympusIndonesia.getRulerOfTheOlympus() , "Death");
    }
}
