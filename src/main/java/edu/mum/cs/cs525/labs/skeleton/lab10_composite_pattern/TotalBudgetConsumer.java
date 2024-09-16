package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import java.util.function.Consumer;

public class TotalBudgetConsumer implements Consumer<Hire> {
    private double totalBudget;

    public TotalBudgetConsumer() {
        this.totalBudget = 0;
    }

    @Override
    public void accept(Hire hire) {
        totalBudget += hire.getBudget();
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
