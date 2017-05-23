package com.sigit.pattern.stuctural.proxy;

import com.sigit.pattern.stuctural.proxy.images.CanvasImages;
import com.sigit.pattern.stuctural.proxy.images.DefaultImages;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/23/2017.
 *         Copyright 2017
 */


public class ImagesTest {

    @Test
    public void testLoading() throws Exception {
        CanvasImages canvas = new CanvasImages();
        DefaultImages images = new DefaultImages("PRODUCT CATALOG 1000 ");
        images.repaintImage(canvas);


    }
}
