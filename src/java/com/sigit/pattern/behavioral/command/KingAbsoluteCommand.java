package com.sigit.pattern.behavioral.command;


public class KingAbsoluteCommand  {

    public void executeKingOrder(AbsoluteCommand command , TargetExecution target){
        command.execute(target);
    }

}
