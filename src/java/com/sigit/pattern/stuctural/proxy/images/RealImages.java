package com.sigit.pattern.stuctural.proxy.images;/**
 * @author Sigit Hadi wibowo 
 * created date 5/23/2017.
 * Copyright 2017
 */



public class RealImages implements Images {

    private String target ;

    public RealImages(String target) {
        try {

            System.out.println("RealImages.RealImages constructed ");
            Thread.currentThread().sleep(10000);
            this.target  = target ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void repaintImage(CanvasImages canvasImages) {
        System.out.println("RealImages.repaintImage - " + target);
        canvasImages.setImageToBeView(target);

    }

    @Override
    public int getHeight() {
        return 350;
    }

    @Override
    public int getWidth() {
        return 540;
    }
}
