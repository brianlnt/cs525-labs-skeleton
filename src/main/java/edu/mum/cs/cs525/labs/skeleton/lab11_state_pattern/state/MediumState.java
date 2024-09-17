package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.state;

import edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.context.CeilingFan;

public class MediumState implements FanState {

    @Override
    public void pullGreen(CeilingFan ceilingFan) {
        System.out.println("Fan is on High speed");
        ceilingFan.setFanState(new HighState());
    }

    @Override
    public void pullRed(CeilingFan ceilingFan) {
        System.out.println("Fan is on Low speed");
        ceilingFan.setFanState(new LowState());
    }
}
