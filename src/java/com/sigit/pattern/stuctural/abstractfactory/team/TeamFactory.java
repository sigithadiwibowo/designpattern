package com.sigit.pattern.stuctural.abstractfactory.team;

import com.sigit.pattern.stuctural.abstractfactory.character.hero.*;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */

public interface TeamFactory {

    public IsAgilityHero getCarryHero();
    public IsStrengthHero getTankerHero();
    public IsIntelligentHero getSupportHero();
    public IsHero getOfflanerHero();
    public IsHero getPusherHero();

}
