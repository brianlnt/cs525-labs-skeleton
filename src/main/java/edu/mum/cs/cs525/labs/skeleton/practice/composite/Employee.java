package edu.mum.cs.cs525.labs.skeleton.practice.composite;

import java.util.function.Consumer;

public class Employee extends Hire {

    Employee(String name, double salary){
        super(name, salary);
    }

    public double getBudget(){
        return super.getSalary();
    }

    @Override
    public void process(Consumer<Hire> action) {
        action.accept(this);
    }
}
