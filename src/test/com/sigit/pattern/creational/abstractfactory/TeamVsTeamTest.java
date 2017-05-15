package com.sigit.pattern.creational.abstractfactory;

import com.sigit.pattern.creational.abstractfactory.character.hero.agility.Motred;
import com.sigit.pattern.creational.abstractfactory.team.SentinelTeam;
import com.sigit.pattern.creational.abstractfactory.team.TeamVsTeam;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class TeamVsTeamTest {


    @Test
    public void testArena() throws Exception {
        TeamVsTeam teamVsTeam = new TeamVsTeam(new SentinelTeam(), new SentinelTeam());
        Assert.assertNotNull(teamVsTeam);
    }

    @Test
    public void testGetFirstTeamOfSentinel() throws Exception {
        TeamVsTeam teamVsTeam = new TeamVsTeam(new SentinelTeam(), new SentinelTeam());
        Assert.assertEquals(teamVsTeam.getFirstTeam().getCarryHero().getClass() , Motred.class);
    }
}
