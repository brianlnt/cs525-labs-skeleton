package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import java.util.function.Consumer;

public class Employee extends Hire{

    Employee(String name, double salary){
        super(name,salary);
    }

    @Override
    public void print() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    @Override
    public void process(Consumer<Hire> action) {
        action.accept(this);
    }
}
