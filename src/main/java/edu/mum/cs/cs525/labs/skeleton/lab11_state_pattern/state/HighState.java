package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.state;

import edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.context.CeilingFan;

public class HighState implements FanState {
    @Override
    public FanState pullGreen() {
        System.out.println("Fan is Off");
        return new OffState();
    }

    @Override
    public FanState pullRed() {
        System.out.println("Fan is on Medium speed");
        return new MediumState();
    }

//    @Override
//    public void pullGreen(CeilingFan ceilingFan) {
//        System.out.println("Fan is Off");
//        ceilingFan.setFanState(new OffState());
//    }
//
//    @Override
//    public void pullRed(CeilingFan ceilingFan) {
//        System.out.println("Fan is on Medium speed");
//        ceilingFan.setFanState(new MediumState());
//    }

}
