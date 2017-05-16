package com.sigit.pattern.stuctural.adapter;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/16/2017.
 *         Copyright 2017
 */


public class Laptop {

    private IsSDCard isSDCard;


    public Laptop() {
        this.isSDCard = new NotInsertedSDCard();
    }

    public void setIsSDCard(IsSDCard isSDCard) {
        this.isSDCard = isSDCard;
    }

    public IsSDCard getIsSDCard() {
        return isSDCard;
    }


    public Object getDataFromSDCard() {
        return isSDCard.readData();
    }
}
