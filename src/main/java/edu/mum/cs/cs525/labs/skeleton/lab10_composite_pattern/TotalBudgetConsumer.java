package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import java.util.function.Consumer;

public class TotalBudgetConsumer implements Consumer<Hire> {
    private double totalBudget = 0;

    @Override
    public void accept(Hire hire) {
        totalBudget += hire.getBudget();
        System.out.println(hire.getName() + "'s budget: " + hire.getBudget());
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
