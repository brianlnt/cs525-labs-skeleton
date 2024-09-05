package edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.service;

import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.behavior.InterestBehavior;
import edu.mum.cs.cs525.labs.skeleton.lab3_observer_pattern.model.Account;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber, InterestBehavior interestBehavior, String customerName);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);
    void addInterest (String accountNumber, double amount);
}
