package edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.service;

import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.behavior.InterestBehavior;
import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.dao.AccountDAO;
import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.dao.AccountDAOImpl;
import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.model.Customer;

import java.util.Collection;
import java.util.List;

public class AccountServiceImpl implements AccountService {
	private AccountDAO accountDAO;
	
	public AccountServiceImpl(){
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, InterestBehavior interestBehavior, String customerName) {
		Account account = new Account(accountNumber, interestBehavior);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);
		
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		
		accountDAO.updateAccount(account);
	}

	public Account getAccount(String accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void addInterest(String accountNumber, double amount) {
		Collection<Account> accounts = accountDAO.getAccounts();
		for (Account account : accounts) {
			account.addInterest();
			accountDAO.updateAccount(account);
		}
	}
}
