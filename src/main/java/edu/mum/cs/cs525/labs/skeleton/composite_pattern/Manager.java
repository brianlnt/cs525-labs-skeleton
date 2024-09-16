package edu.mum.cs.cs525.labs.skeleton.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Person{
    List<Person> personList = new ArrayList<>();
    private double bonus;

    public boolean addPerson(Person person){
        return personList.add(person);
    }

    @Override
    public double getBudget() {
        double budget = 0;

        budget += getSalary();
        for (Person person : personList) {
            budget += person.getBudget();
        }
        return budget;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return bonus + super.getSalary();
    }
}
