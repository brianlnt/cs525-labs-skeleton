package edu.mum.cs.cs525.labs.skeleton.practice.composite;

import java.util.function.Consumer;

public abstract class Hire {
    String name;
    double salary;

    public Hire(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getBudget();

    public abstract void process(Consumer<Hire> action);

}
