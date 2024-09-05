package edu.mum.cs.cs525.labs.skeleton.decorator_pattern;

public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
