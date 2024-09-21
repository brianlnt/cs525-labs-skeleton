package edu.mum.cs.cs525.labs.skeleton.practice.composite;

import java.util.function.Consumer;

public class Budget implements Consumer<Hire> {
    double totalBudget = 0;

    @Override
    public void accept(Hire hire) {
        totalBudget += hire.getBudget();
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
