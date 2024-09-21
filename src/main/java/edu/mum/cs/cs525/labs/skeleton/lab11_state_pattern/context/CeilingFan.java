package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.context;

import edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.state.FanState;
import edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.state.OffState;

public class CeilingFan {
    private FanState fanState;

    public CeilingFan() {
        this.fanState = new OffState();
    }

    public void setFanState(FanState fanState) {
        this.fanState = fanState;
    }

    public void pullGreen() {
        this.fanState = fanState.pullGreen();
    }

    public void pullRed() {
        this.fanState = fanState.pullRed();
    }
}
