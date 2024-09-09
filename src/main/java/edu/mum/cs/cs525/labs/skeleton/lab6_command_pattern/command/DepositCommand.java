package edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command;

import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.service.AccountService;

public class DepositCommand implements Command{

    AccountService accountService;
    private String accountNumber;
    private double amount;

    public DepositCommand(AccountService accountService,  String accountNumber, double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        this.accountService.deposit(accountNumber, amount);
    }

    @Override
    public void undo() {
        this.accountService.withdraw(accountNumber, amount);
    }

    @Override
    public void redo() {
        this.execute();
    }
}
