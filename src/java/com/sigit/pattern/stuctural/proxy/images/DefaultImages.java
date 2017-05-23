package com.sigit.pattern.stuctural.proxy.images;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/23/2017.
 *         Copyright 2017
 */


public class DefaultImages implements Images {

    private RealImages realImages;
    private String url;
    private String defaultUrl;

    public DefaultImages(String target) {
        this.defaultUrl = "/localhost";
        this.url = target;
    }


    @Override
    public void repaintImage(CanvasImages canvasImages) {
        if (realImages != null) {
            realImages.repaintImage(canvasImages);
        } else {
            System.out.println("DefaultImages.repaintImage - " + defaultUrl);
            canvasImages.setImageToBeView(defaultUrl);

            realImages = new RealImages(url);
            // lets assume triggered by different thread / asyncTask .
            this.repaintImage(canvasImages);
        }
    }

    @Override
    public int getHeight() {
        if (realImages == null) {
            return 400;
        } else {
            return realImages.getHeight();
        }
    }

    @Override
    public int getWidth() {
        if (realImages == null) {
            return 400;
        } else {
            return realImages.getWidth();
        }
    }
}
