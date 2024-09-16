package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import java.util.function.Consumer;

public class HireCounterConsumer implements Consumer<Hire> {
    int counter = 0;

    @Override
    public void accept(Hire hire) {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
