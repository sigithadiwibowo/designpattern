package com.sigit.pattern.stuctural.abstractfactory.character.hero;

/**
 * @author Sigit Hadi wibowo
 *         created date 8/19/2016.
 *         Copyright 2016
 */


public enum HeroType {

    STR(1) ,
    AGI(2) ,
    INT(3) ,;

    private int value ;

    HeroType(int val ){
        this.value = val ;
    }


    public static HeroType valueOf(int val){
        if (val == STR.getValue()) {
            return STR;
        } else if (val == AGI.getValue()) {
            return AGI;
        }else if (val == INT.getValue()){
            return INT ;
        }
        return null;
    }


    public int getValue(){
        return value ;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
