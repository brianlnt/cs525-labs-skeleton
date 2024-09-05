package edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.subject;

import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.event.AccountChangeType;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.Observer;

import java.util.Collection;

public interface AccountService {
    Account createAccount(String accountNumber, String customerName);
    Account getAccount(String accountNumber);
    Collection<Account> getAllAccounts();
    void deposit (String accountNumber, double amount);
    void withdraw (String accountNumber, double amount);
    void transferFunds(String fromAccountNumber, String toAccountNumber, double amount, String description);

    //Subject methods
    public void attach(AccountChangeType accountChangeType, Observer accountObserver);
    public void detach(AccountChangeType accountChangeType, Observer accountObserver);
    public void notifyObservers(AccountChangeType accountChangeType, String accountNumber);
}
