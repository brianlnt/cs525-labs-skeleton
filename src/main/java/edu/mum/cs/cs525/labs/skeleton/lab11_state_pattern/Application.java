package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern;

public class Application {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        
        fan.pullGreen(); // Low speed
        fan.pullGreen(); // Medium speed
        fan.pullGreen(); // High speed
        fan.pullGreen(); // Turning off
        fan.pullRed();   // High speed
        fan.pullRed();   // Medium speed
    }
}
