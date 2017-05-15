package com.sigit.pattern.creational.abstractfactory.character.hero;

/**
 * @author Sigit Hadi wibowo 
 * created date 8/19/2016.
 * Copyright 2016
 */



public abstract class AStrengthHero extends AHero implements IsStrengthHero {

    @Override
    public final HeroType getHeroType() {
        return HeroType.STR;
    }
}
