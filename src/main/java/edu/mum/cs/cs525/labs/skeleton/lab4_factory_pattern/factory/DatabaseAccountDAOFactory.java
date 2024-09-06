package edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.factory;

import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.dao.AccountDAO;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.dao.AccountDAOImpl;

public class DatabaseAccountDAOFactory implements AccountDAOFactory {
    @Override
    public AccountDAO createAccountDAO() {
        return new AccountDAOImpl();
    }
}
