package com.sigit.pattern.behavioral.command;


public class KillThemAll implements AbsoluteCommand {

    public KillThemAll() {

    }

    @Override
    public void execute(TargetExecution execution) {
        System.out.println("no witness , should be no one ");
        execution.setTargetStatus("ALL OF THEM SHOULD BE DEAD");
    }
}
