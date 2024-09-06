package edu.mum.cs.cs525.labs.skeleton.lab3_decorator_pattern.behavior;

public class CheckingInterest implements InterestBehavior{

    @Override
    public String getDescription() {
        return "Checking Interest";
    }

    @Override
    public double calculateInterest(double balance) {
        if (balance < 1000) {
            return balance * 0.01;
        } else if (balance <= 5000) {
            return balance * 0.02;
        } else {
            return balance * 0.04;
        }
    }
}
