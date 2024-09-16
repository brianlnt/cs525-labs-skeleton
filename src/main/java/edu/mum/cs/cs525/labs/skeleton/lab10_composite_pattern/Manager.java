package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Manager extends Hire {
    List<Hire> hireList = new ArrayList<>();
    double bonus;
    
    Manager(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    public boolean addHire(Hire hire){
        return hireList.add(hire);
    }

    public boolean removeHire(Hire hire){
        return hireList.remove(hire);
    }

    @Override
    public void print() {
        System.out.println("Manager: " + name + ", Salary: " + salary);
        for (Hire hire : hireList) {
            hire.print();
        }
    }

    @Override
    public void process(Consumer<Hire> action) {
        action.accept(this);
        for(Hire hire : hireList){
            hire.process(action);
        }
    }

    @Override
    public double getBudget() {
        double budget = salary;
        for(Hire hire : hireList){
            budget += hire.getBudget();
        }
        return budget + bonus;
    }
}
