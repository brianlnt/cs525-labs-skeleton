package edu.mum.cs.cs525.labs.skeleton.composite_pattern;

public class Employee extends Person {
    @Override
    public double getBudget() {
        return getSalary();
    }
}
