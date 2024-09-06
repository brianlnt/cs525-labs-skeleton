package edu.mum.cs.cs525.labs.skeleton.decorator_pattern;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage; //composition
    public abstract String getDescription();  // Needs to override this
}
