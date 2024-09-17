package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.state;

import edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.context.CeilingFan;

public class LowState implements FanState {

    @Override
    public void pullGreen(CeilingFan ceilingFan) {
        System.out.println("Fan is on Medium speed");
        ceilingFan.setFanState(new MediumState());
    }

    @Override
    public void pullRed(CeilingFan ceilingFan) {
        System.out.println("Fan is Off");
        ceilingFan.setFanState(new OffState());
    }

}
