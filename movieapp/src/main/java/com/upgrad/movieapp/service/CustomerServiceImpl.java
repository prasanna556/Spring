package com.upgrad.movieapp.service;

import com.upgrad.movieapp.dao.CustomerDao;
import com.upgrad.movieapp.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerDao customerDao;
    @Override
    public Customer acceptCustomerDetails(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public Customer updateCustomerDetails(int id, Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDao.fetchById(id);
    }

    @Override
    public boolean deleteCustomerById(int id) {
        customerDao.delete(id);
        return true;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.fetchAllCustomers();
    }
}
