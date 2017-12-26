package com.sigit.pattern.behavioral.command;


public class Villain implements TargetExecution {
    @Override
    public void setTargetStatus(String statue) {
        System.out.println(statue);
    }
}
