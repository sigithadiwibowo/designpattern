package com.sigit.pattern.stuctural.facade;


import com.sigit.pattern.stuctural.facade.stock.StockRepoImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StockRepoTest {


    @Test
    public void testCheckReadyStock() throws Exception {
        StockRepoImpl repo = new StockRepoImpl();
        Assert.assertEquals(repo.isReady("2"), true);
    }


    @Test
    public void testOutOfStock() throws Exception {
        StockRepoImpl repo = new StockRepoImpl();
        Assert.assertEquals(repo.isReady("1"), false);
    }
}
