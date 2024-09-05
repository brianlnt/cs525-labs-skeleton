package edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.subject;

import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.dao.AccountDAO;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.dao.AccountDAOImpl;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.event.AccountChangeType;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.model.Customer;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class AccountServiceImpl implements AccountService {

	private HashMap<AccountChangeType, List<Observer>> observers;

	private AccountDAO accountDAO;
	
	public AccountServiceImpl(){
		this.observers = new HashMap<>();
		this.observers.put(AccountChangeType.CREATE_NEW_ACCOUNT, new ArrayList<>());
		this.observers.put(AccountChangeType.EVERY_CHANGE, new ArrayList<>());
		accountDAO = new AccountDAOImpl();
	}

	public Account createAccount(String accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		
		accountDAO.saveAccount(account);
		notifyObservers(AccountChangeType.CREATE_NEW_ACCOUNT, accountNumber);
		return account;
	}

	public void deposit(String accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		
		accountDAO.updateAccount(account);
		notifyObservers(AccountChangeType.EVERY_CHANGE, accountNumber);
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
		notifyObservers(AccountChangeType.EVERY_CHANGE, accountNumber);
	}


	public void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
		notifyObservers(AccountChangeType.EVERY_CHANGE, fromAccountNumber);
		notifyObservers(AccountChangeType.EVERY_CHANGE, toAccountNumber);
	}

	@Override
	public void attach(AccountChangeType accountChangeType, Observer accountObserver) {
		observers.get(accountChangeType).add(accountObserver);
	}

	@Override
	public void detach(AccountChangeType accountChangeType, Observer accountObserver) {
		observers.get(accountChangeType).remove(accountObserver);
	}

	@Override
	public void notifyObservers(AccountChangeType accountChangeType, String accountNumber) {
		List<Observer> observerList = observers.get(accountChangeType);
		observerList.forEach(observer -> observer.update(this.getAccount(accountNumber)));
	}
}
