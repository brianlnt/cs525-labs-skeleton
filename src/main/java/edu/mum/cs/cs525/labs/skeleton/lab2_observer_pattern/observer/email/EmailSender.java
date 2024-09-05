package edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.email;

import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.event.AccountChangeType;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.Observer;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.subject.AccountService;

public class EmailSender implements Observer {

    private AccountService accountService;

    public EmailSender(AccountService accountService) {
        this.accountService = accountService;
        accountService.attach(AccountChangeType.CREATE_NEW_ACCOUNT, this);
    }

    @Override
    public void update(Account account) {
        System.out.println("Email: account " + account.getAccountNumber() + " is created");
    }
}
