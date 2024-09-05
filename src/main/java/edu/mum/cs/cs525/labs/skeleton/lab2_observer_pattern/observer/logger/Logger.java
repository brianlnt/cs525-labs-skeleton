package edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.logger;

import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.event.AccountChangeType;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.Observer;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.subject.AccountService;

public class Logger implements Observer {

    private AccountService accountService;

    public Logger(AccountService accountService) {
        this.accountService = accountService;
        accountService.attach(AccountChangeType.EVERY_CHANGE, this);
    }

    @Override
    public void update(Account account) {
        System.out.println("Logger: balance change " + account.getBalance());
    }
}
