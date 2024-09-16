package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import edu.mum.cs.cs525.labs.skeleton.lab1_strategy_pattern.model.Customer;

import java.util.function.Consumer;

public class Employee extends Hire{

    Employee(String name, double salary){
        super(name,salary);
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    @Override
    public void accept(Consumer<? extends Hire> action) {
        ((Consumer<Hire>) action).accept(this);
    }
}
