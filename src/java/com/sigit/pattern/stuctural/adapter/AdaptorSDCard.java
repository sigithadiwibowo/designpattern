package com.sigit.pattern.stuctural.adapter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/16/2017.
 *         Copyright 2017
 */


public class AdaptorSDCard implements IsSDCard {

    private MicroSD microSD = new MicroSD();

    @Override
    public Object readData() {
        return microSD.getData();
    }
}
