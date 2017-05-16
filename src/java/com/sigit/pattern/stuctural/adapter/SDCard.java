package com.sigit.pattern.stuctural.adapter;/**
 * @author Sigit Hadi wibowo 
 * created date 5/16/2017.
 * Copyright 2017
 */



public class SDCard implements IsSDCard  {
    @Override
    public Object readData() {
        return "SD card";
    }
}
