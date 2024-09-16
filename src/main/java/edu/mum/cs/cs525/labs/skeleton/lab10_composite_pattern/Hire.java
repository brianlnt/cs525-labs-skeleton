package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import java.util.function.Consumer;

public abstract class Hire {
    String name;
    double salary;

    Hire(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();

    public abstract void process(Consumer<Hire> action);
}
