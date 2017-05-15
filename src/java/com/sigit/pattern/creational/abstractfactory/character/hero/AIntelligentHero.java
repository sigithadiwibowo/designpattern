package com.sigit.pattern.creational.abstractfactory.character.hero;

/**
 * @author Sigit Hadi wibowo 
 * created date 8/19/2016.
 * Copyright 2016
 */



public abstract class AIntelligentHero extends AHero implements IsIntelligentHero {

    public HeroType getHeroType(){
        return HeroType.INT ;
    }
}
