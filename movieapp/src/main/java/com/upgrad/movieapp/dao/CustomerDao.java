package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Customer;

import java.util.List;

public interface CustomerDao {
    Customer save (Customer customer);
    Customer fetchById(int customerId);

    Customer updateCustomer(Customer customer);

    void delete(int id);

    List<Customer> fetchAllCustomers();
}
