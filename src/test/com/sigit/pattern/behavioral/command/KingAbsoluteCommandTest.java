package com.sigit.pattern.behavioral.command;


import org.testng.annotations.Test;

public class KingAbsoluteCommandTest {


    @Test
    public void testKingOrderToKillThemAllToVillain() throws Exception {
        KingAbsoluteCommand order = new KingAbsoluteCommand();
        order.executeKingOrder(new KillThemAll(), new Villain());
    }


    @Test
    public void testKingOrderToKillThemAllToSuperiorCommander() throws Exception {
        KingAbsoluteCommand order = new KingAbsoluteCommand();
        order.executeKingOrder(new KillThemAll(), new SuperiorCommander());
    }


    @Test
    public void testKingOrderToRequestForgivenessToVillain() throws Exception {
        KingAbsoluteCommand order = new KingAbsoluteCommand();
        order.executeKingOrder(new ForgivenessApproved(), new Villain());
    }


    @Test
    public void testKingOrderToRequestForgivenessSuperiorCommander() throws Exception {
        KingAbsoluteCommand order = new KingAbsoluteCommand();
        order.executeKingOrder(new ForgivenessApproved("Approved"), new SuperiorCommander());
    }

}
