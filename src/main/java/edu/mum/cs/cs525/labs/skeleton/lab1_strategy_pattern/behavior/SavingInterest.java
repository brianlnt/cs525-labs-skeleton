package edu.mum.cs.cs525.labs.skeleton.lab1_strategy_pattern.behavior;

public class SavingInterest implements InterestBehavior{


    @Override
    public double calculateInterest(double balance) {
        if (balance < 1000) {
            return balance * 0.015;
        } else {
            return balance * 0.025;
        }
    }
}
