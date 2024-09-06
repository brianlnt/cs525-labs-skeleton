package edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.factory;

import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.dao.AccountDAO;

public interface AccountDAOFactory {
    AccountDAO createAccountDAO();
}
