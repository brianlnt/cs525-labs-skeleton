package edu.mum.cs.cs525.labs.skeleton.practice.composite;

import java.util.function.Consumer;

public class Counter implements Consumer<Hire> {
    private int count = 0;

    @Override
    public void accept(Hire hire) {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

}
