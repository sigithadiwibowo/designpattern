package com.sigit.pattern.creational.abstractfactory;

import com.sigit.pattern.creational.abstractfactory.character.hero.HeroType;
import com.sigit.pattern.creational.abstractfactory.team.ScourageTeam;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class TeamFactoryTest {


    @Test
    public void testCreateScourageTeam() throws Exception {
        ScourageTeam scourageTeam = new ScourageTeam();
        Assert.assertNotNull(scourageTeam);
    }

    @Test
    public void testGetScourageTeamCarryHero() throws Exception {
        ScourageTeam scourageTeam = new ScourageTeam();
        Assert.assertEquals(scourageTeam.getCarryHero().getHeroType().getValue(), HeroType.AGI.getValue());

    }

    @Test
    public void testGetScourageTeamCarrySkillName() throws Exception {
        ScourageTeam scourageTeam = new ScourageTeam();
        Assert.assertEquals(scourageTeam.getCarryHero().firstSkill(), "Stifling Dagger");

    }
}
