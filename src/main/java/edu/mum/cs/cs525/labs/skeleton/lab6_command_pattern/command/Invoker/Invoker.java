package edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command.Invoker;

import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command.Command;

public class Invoker {
    private Command action;

    public void setCommand(Command command) {
        this.action = command;
    }

    public void executeAction() {
        action.execute();
    }

    public void undoAction() {
        action.undo();
    }

    public void redoAction() {
        action.redo();
    }
}
