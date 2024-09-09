package edu.mum.cs.cs525.labs.skeleton.command_pattern;

public class Client {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        GarageDoor garageDoor = new GarageDoor(); // receiver
        Command command = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(command);
        remote.start();
    }
}
