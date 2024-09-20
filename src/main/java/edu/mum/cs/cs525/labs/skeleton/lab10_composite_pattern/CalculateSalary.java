package edu.mum.cs.cs525.labs.skeleton.lab10_composite_pattern;

import java.util.function.Consumer;

public class CalculateSalary implements Consumer<Hire> {

    double totalSalary = 0;

    @Override
    public void accept(Hire hire) {
        totalSalary += hire.getSalary();
        System.out.println(hire.getName() + "'s salary: " + hire.getSalary());
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
