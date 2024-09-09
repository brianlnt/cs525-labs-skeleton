package edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.command;

import edu.mum.cs.cs525.labs.skeleton.lab6_command_pattern.service.AccountServiceImpl;

public class TransferCommand implements Command {
    AccountServiceImpl accountService;
    String fromAccount;
    String toAccount;
    double amount;
    String description;

    public TransferCommand(AccountServiceImpl accountService, String fromAccount, String toAccount, double amount, String description) {
        this.accountService = accountService;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.description = description;
    }


    @Override
    public void execute() {
        this.accountService.transferFunds(fromAccount, toAccount, amount, description);
    }

    @Override
    public void undo() {
        this.accountService.transferFunds(toAccount, fromAccount, amount, description);
    }

    @Override
    public void redo() {
        this.execute();
    }
}
