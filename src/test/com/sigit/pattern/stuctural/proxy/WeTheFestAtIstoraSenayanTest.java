package com.sigit.pattern.stuctural.proxy;

import com.sigit.pattern.stuctural.proxy.security.WeTheFestAtIstoraSenayan;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/24/2017.
 *         Copyright 2017
 */


public class WeTheFestAtIstoraSenayanTest {


    @Test
    public void testCreateFestival() throws Exception {
        WeTheFestAtIstoraSenayan senayan = new WeTheFestAtIstoraSenayan();
        Assert.assertNotNull(senayan);
    }

    @Test
    public void test() throws Exception {

    }
}
