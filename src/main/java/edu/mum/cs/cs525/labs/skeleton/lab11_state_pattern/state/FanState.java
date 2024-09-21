package edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.state;

import edu.mum.cs.cs525.labs.skeleton.lab11_state_pattern.context.CeilingFan;

public interface FanState {
    FanState pullGreen();
    FanState pullRed();
}
