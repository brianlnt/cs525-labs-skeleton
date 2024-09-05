package edu.mum.cs.cs525.labs.skeleton.decorator_pattern;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return 0.10 + beverage.cost();  // Adds the cost of Milk
    }
}
