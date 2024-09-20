package edu.mum.cs.cs525.labs.skeleton.composite_pattern;

public class Employee extends Person {
    String name;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public double getBudget() {
        return getSalary();
    }
}
