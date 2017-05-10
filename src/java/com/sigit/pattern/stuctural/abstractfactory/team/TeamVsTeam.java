package com.sigit.pattern.stuctural.abstractfactory.team;

/**
 * @author Sigit Hadi wibowo
 *         created date 5/10/2017.
 *         Copyright 2017
 */


public class TeamVsTeam {

    private TeamFactory firstTeam;
    private TeamFactory secondTeam;

    public TeamVsTeam(TeamFactory firstTeam, TeamFactory secondTeam) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }


    public TeamFactory getFirstTeam() {
        return firstTeam;
    }

    public TeamFactory getSecondTeam() {
        return secondTeam;
    }
}
