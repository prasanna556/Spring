package com.upgrad.movieapp.service;

import com.upgrad.movieapp.entities.Customer;

import java.util.List;

public interface CustomerService {
    Customer acceptCustomerDetails(Customer customer);

    Customer updateCustomerDetails(int id , Customer customer);

    Customer getCustomerById(int id);

    boolean deleteCustomerById(int id);

    List<Customer> getAllCustomers();
}
