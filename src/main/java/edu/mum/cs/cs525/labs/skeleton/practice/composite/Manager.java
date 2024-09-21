package edu.mum.cs.cs525.labs.skeleton.practice.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Manager extends Hire{
    List<Hire> hireList = new ArrayList<>();
    double bonus;

    Manager(String name, double salary, double bonus){
        super(name,salary);
        this.bonus = bonus;
    }

    public void addHire(Hire hire){
        hireList.add(hire);
    }
    public void removeHire(Hire hire){
        hireList.remove(hire);
    }

    public double getBudget() {
        return this.bonus + super.getSalary();
    }

    @Override
    public void process(Consumer<Hire> action) {
        action.accept(this);
        for(Hire hire: hireList){
            hire.process(action);
        }
    }
}
