package edu.mum.cs.cs525.labs.skeleton.practice.composite;

public class TestDrive {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Thinh", 1000);
        Employee emp2 = new Employee("Bob", 2000);

        Manager manager = new Manager("Brian", 10000, 100);
        manager.addHire(emp1);
        manager.addHire(emp2);

        Manager ceo = new Manager("David", 200000, 200);
        ceo.addHire(manager);

        Counter counter = new Counter();
        ceo.process(counter);
        System.out.println("Number of staff: " + counter.getCount());

        Salary salary = new Salary();
        ceo.process(salary);
        System.out.println("Total salary: " + salary.getTotalSalary());

        Budget budget = new Budget();
        ceo.process(budget);
        System.out.println("Total budget: " + budget.getTotalBudget());
    }
}
