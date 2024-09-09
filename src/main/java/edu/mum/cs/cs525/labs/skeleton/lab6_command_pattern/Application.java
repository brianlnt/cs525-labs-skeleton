package edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern;

import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command.Command;
import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command.DepositCommand;
import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command.Invoker.Invoker;
import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.model.AccountEntry;
import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.model.Customer;
import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.service.AccountService;
import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.service.AccountServiceImpl;

public class Application {
	public static void main(String[] args) {
		//Receiver
		AccountService accountService = new AccountServiceImpl();

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

		//Concrete Command
		Command depositCommand = new DepositCommand(accountService, "1263862", 11);

		Invoker invoker = new Invoker();
		invoker.setCommand(depositCommand);
		invoker.executeAction();
		invoker.undoAction();
		invoker.redoAction();
		//Account can be a Receiver, then AccountService is the Invoker

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

}
