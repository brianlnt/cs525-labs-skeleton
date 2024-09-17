package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern;

public class HighState implements FanState {

    @Override
    public void pullGreen(CeilingFan ceilingFan) {
        System.out.println("Fan is Off");
        ceilingFan.setFanState(new OffState());
    }

    @Override
    public void pullRed(CeilingFan ceilingFan) {
        System.out.println("Fan is on Medium speed");
        ceilingFan.setFanState(new MediumState());
    }

}
