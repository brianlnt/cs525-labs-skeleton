package edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.behavior;

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
