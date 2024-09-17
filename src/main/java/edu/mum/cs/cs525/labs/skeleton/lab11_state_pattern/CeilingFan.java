package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern;

public class CeilingFan {
    private FanState fanState;

    public CeilingFan() {
        this.fanState = new OffState();
    }

    public void setFanState(FanState fanState) {
        this.fanState = fanState;
    }

    public void pullGreen() {
        fanState.pullGreen(this);
    }

    public void pullRed() {
        fanState.pullRed(this);
    }
}
