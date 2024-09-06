package edu.mum.cs.cs525.labs.skeleton.lab3_decorator_pattern.decorator.impl;

import edu.mum.cs.cs525.labs.skeleton.lab3_decorator_pattern.behavior.InterestBehavior;
import edu.mum.cs.cs525.labs.skeleton.lab3_decorator_pattern.decorator.InterestPromotionDecorator;

public class Promotion3 extends InterestPromotionDecorator {

    Promotion3(InterestBehavior interestBehavior){
        this.interestBehavior = interestBehavior;
    }

    @Override
    public String getDescription() {
        return interestBehavior.getDescription() + ", Promotion 3";
    }

    @Override
    public double calculateInterest(double balance) {
        return 0.03 + interestBehavior.calculateInterest(balance);
    }
}
