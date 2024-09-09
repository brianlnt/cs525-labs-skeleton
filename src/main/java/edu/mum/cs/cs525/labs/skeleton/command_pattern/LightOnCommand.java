package edu.mum.cs.cs525.labs.skeleton.command_pattern;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unexecute(){
        light.off();
    }
}
