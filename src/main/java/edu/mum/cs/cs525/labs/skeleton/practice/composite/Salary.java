package edu.mum.cs.cs525.labs.skeleton.practice.composite;

import java.util.function.Consumer;

public class Salary implements Consumer<Hire> {
    double totalSalary = 0;

    @Override
    public void accept(Hire hire) {
        totalSalary += hire.getSalary();
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
