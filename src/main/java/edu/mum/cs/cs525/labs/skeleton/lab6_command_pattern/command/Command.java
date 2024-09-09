package edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command;

public interface Command {
    public void execute();
    public void undo();
    public void redo();
}
