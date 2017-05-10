package com.sigit.pattern.stuctural.abstractfactory.team;

import com.sigit.pattern.stuctural.abstractfactory.character.hero.IsAgilityHero;
import com.sigit.pattern.stuctural.abstractfactory.character.hero.IsHero;
import com.sigit.pattern.stuctural.abstractfactory.character.hero.IsIntelligentHero;
import com.sigit.pattern.stuctural.abstractfactory.character.hero.IsStrengthHero;
import com.sigit.pattern.stuctural.abstractfactory.character.hero.agility.Motred;
import com.sigit.pattern.stuctural.abstractfactory.character.hero.inteligent.Rylai;
import com.sigit.pattern.stuctural.abstractfactory.character.hero.strength.Centaur;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class SentinelTeam implements TeamFactory {
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
    public Motred getPusherHero() {
        return new Motred();
    }
}
