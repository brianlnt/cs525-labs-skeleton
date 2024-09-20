package edu.mum.cs.cs525.labs.skeleton.composite;

public class Application {
	
	public static void main(String[] args) {
		Manager ceo = new Manager();
		ceo.setName("CEO");
		ceo.setSalary(100000.0);
		ceo.setBonus(20000.0);
		
		Manager headOfEngineering = new Manager();
		headOfEngineering.setName("Head of Engineering");
		headOfEngineering.setSalary(90000.0);
		headOfEngineering.setBonus(15000.0);
		
		Employee engineer1 = new Employee();
		engineer1.setName("Engineer 1");
		engineer1.setSalary(80000.0);
		
		Employee engineer2 = new Employee();
		engineer2.setName("Engineer 2");
		engineer2.setSalary(80000.0);
		
		headOfEngineering.addPerson(engineer1);
		headOfEngineering.addPerson(engineer2);
		
		ceo.addPerson(headOfEngineering);
		
		TotalBudgetConsumer budgetConsumer = new TotalBudgetConsumer();
		
		ceo.process(budgetConsumer);
		
		System.out.println("Total Budget: " + budgetConsumer.getTotalBudget());
	}
}
