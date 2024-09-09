package edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command;

import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.service.AccountServiceImpl;

public class WithdrawCommand implements Command {
    AccountServiceImpl accountService;
    String accountNumber;
    double amount;

    public WithdrawCommand(AccountServiceImpl accountService, String accountNumber, double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }


    @Override
    public void execute() {
        this.accountService.withdraw(accountNumber, amount);
    }

    @Override
    public void undo() {
        this.accountService.deposit(accountNumber, amount);
    }

    @Override
    public void redo() {
        this.execute();
    }
}
