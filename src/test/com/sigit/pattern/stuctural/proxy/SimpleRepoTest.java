package com.sigit.pattern.stuctural.proxy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/22/2017.
 *         Copyright 2017
 */


public class SimpleRepoTest {
    SimpleRepo repo;

    @BeforeMethod
    public void setUp() throws Exception {
        repo = new SimpleRepoImpl();
    }

    @Test
    public void testCreateInstance() throws Exception {
        SimpleEntity entity = (SimpleEntity) repo.find("test");
        Assert.assertNotNull(entity);
    }


    @Test
    public void testGetLazyObjectWithoutInitialize() throws Exception {
        SimpleEntity entity = (SimpleEntity) repo.find("test");
        Assert.assertNull(entity.getSampleLazyProperties());
    }


    @Test
    public void testGetLazyObjectWithInitialize() throws Exception {
        SimpleEntity entity = (SimpleEntity) repo.find("test");
        PersistentManager.initialize(entity);
        Assert.assertNotNull(entity.getSampleLazyProperties());
    }



}
