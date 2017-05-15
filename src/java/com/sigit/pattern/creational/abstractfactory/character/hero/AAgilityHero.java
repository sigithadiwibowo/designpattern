package com.sigit.pattern.creational.abstractfactory.character.hero;

/**
 * @author Sigit Hadi wibowo 
 * created date 8/19/2016.
 * Copyright 2016
 */



public abstract class AAgilityHero extends AHero implements IsAgilityHero {

    public HeroType getHeroType(){
        return HeroType.AGI ;
    }

}
