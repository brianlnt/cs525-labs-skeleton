package edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.observer;

import edu.mum.cs.cs525.labs.skeleton.lab2_observer_pattern.model.Account;

public interface Observer {
    public void update(Account account);
}
