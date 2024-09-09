package edu.mum.cs.cs525.labs.skeleton.command_pattern;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void start() {
        this.slot.execute();
    }
}
