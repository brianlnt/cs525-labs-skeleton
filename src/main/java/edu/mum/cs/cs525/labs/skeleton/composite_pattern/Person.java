package edu.mum.cs.cs525.labs.skeleton.composite_pattern;

public abstract class Person {
    String name;
    double salary;
    double budget;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double getBudget();
}
