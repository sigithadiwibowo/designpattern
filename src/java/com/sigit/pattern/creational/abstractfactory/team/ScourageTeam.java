package com.sigit.pattern.creational.abstractfactory.team;

import com.sigit.pattern.creational.abstractfactory.character.hero.inteligent.Rylai;
import com.sigit.pattern.creational.abstractfactory.character.hero.agility.Motred;
import com.sigit.pattern.creational.abstractfactory.character.hero.strength.Centaur;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class ScourageTeam implements TeamFactory {


    @Override
    public Motred getCarryHero() {
        return new Motred();
    }

    @Override
    public Centaur getTankerHero() {
        return new Centaur();
    }

    @Override
    public Rylai getSupportHero() {
        return new Rylai();
    }

    @Override
    public Centaur getOfflanerHero() {
        return new Centaur();
    }

    @Override
    public Centaur getPusherHero() {
        return new Centaur();
    }
}
