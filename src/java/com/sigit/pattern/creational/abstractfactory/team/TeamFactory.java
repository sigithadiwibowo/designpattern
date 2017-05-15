package com.sigit.pattern.creational.abstractfactory.team;

import com.sigit.pattern.creational.abstractfactory.character.hero.IsAgilityHero;
import com.sigit.pattern.creational.abstractfactory.character.hero.IsHero;
import com.sigit.pattern.creational.abstractfactory.character.hero.IsIntelligentHero;
import com.sigit.pattern.creational.abstractfactory.character.hero.IsStrengthHero;

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
