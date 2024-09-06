package edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern;

import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.factory.AccountDAOFactory;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.factory.DatabaseAccountDAOFactory;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.factory.MockAccountDAOFactory;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.model.AccountEntry;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.model.Customer;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.service.AccountService;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.service.AccountServiceImpl;

public class Application {
	public static void main(String[] args) {

		AccountDAOFactory accountDAOFactory;

		if(isTestEnvironment()){
			System.out.println("We are on Test Environment");
			accountDAOFactory = new MockAccountDAOFactory();
		} else {
			System.out.println("We are on Production Environment");
			accountDAOFactory = new DatabaseAccountDAOFactory();
		}

		AccountService accountService = new AccountServiceImpl(accountDAOFactory);

		// create 2 accounts;
		accountService.createAccount("1263862", "Frank Brown");
		accountService.createAccount("4253892", "John Doe");
		// use account 1;
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		// use account 2;
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		// show balances

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

	private static boolean isTestEnvironment() {
		return true;
	}

}
