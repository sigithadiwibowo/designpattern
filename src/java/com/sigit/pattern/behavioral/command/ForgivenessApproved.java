package com.sigit.pattern.behavioral.command;


public class ForgivenessApproved implements AbsoluteCommand {

    private String letterFromKing;

    public ForgivenessApproved(String letterFromKing) {
        this.letterFromKing = letterFromKing;
    }


    public ForgivenessApproved() {
        letterFromKing = null;
    }

    @Override
    public void execute(TargetExecution execution) {
        if (letterFromKing == null) {
            execution.setTargetStatus("NO FORGIVENESS");
        } else {
            execution.setTargetStatus("you are free to go");
        }
    }
}
