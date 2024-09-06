package edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.decorator;

import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.behavior.InterestBehavior;

public abstract class InterestPromotionDecorator implements InterestBehavior {
    public InterestBehavior interestBehavior;

    public abstract String getDescription();
}
