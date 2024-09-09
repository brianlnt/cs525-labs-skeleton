package edu.mum.cs.cs525.labs.skeleton.command_pattern;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void unexecute() {
        garageDoor.down();
    }
}
