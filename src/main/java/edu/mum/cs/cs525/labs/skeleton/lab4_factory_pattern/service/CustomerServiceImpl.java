package edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.service;

import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.dao.AccountDAO;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.factory.AccountDAOFactory;
import edu.mum.cs.cs525.labs.skeleton.lab4_factory_pattern.model.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{

    private AccountDAO accountDAO;

    public CustomerServiceImpl(AccountDAOFactory factory){
        accountDAO = factory.createAccountDAO();;
    }

    @Override
    public List<Customer> getCustomers() {
        return null;
    }
}
