package edu.mum.cs.cs525.labs.skeleton.lab3_decorator_pattern.behavior;

public interface InterestBehavior {
    String description = "Unknown Interest Promotion";

    default String getDescription() {
        return description;
    }

    double calculateInterest(double balance);
}
