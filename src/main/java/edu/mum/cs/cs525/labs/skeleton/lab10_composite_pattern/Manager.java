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

    public double getSalary(){
        return salary;
    }

    public double getBonus(){
        return bonus;
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
        return getSalary() + getBonus();
    }
}
