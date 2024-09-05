package edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.sms;

import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.event.AccountChangeType;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.model.Account;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer.Observer;
import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.subject.AccountService;

public class SMSSender implements Observer {

    private AccountService accountService;

    public SMSSender(AccountService accountService) {
        this.accountService = accountService;
        accountService.attach(AccountChangeType.EVERY_CHANGE,this);
    }

    @Override
    public void update(Account account) {
        System.out.println("SMS: balance change " + account.getBalance());
    }
}
