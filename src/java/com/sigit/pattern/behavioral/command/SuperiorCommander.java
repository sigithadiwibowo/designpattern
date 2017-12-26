package com.sigit.pattern.behavioral.command;


public class SuperiorCommander implements TargetExecution {
    @Override
    public void setTargetStatus(String status) {
        System.out.println(status);
        System.out.println("got some special action");
    }
}
