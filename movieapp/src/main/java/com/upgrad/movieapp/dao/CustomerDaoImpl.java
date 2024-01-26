package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Customer;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao{
    private SessionFactory sessionFactory;

    @Autowired
    public CustomerDaoImpl(EntityManagerFactory entityManagerFactory){
        this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
    }
    @Override
    public Customer save(Customer customer) {
        Session session =sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
        return customer;
    }

    @Override
    public Customer fetchById(int customerId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer retrievedCustomer = session.get(Customer.class,customerId);
        transaction.commit();
        session.close();
        return retrievedCustomer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(customer);
        transaction.commit();
        session.close();
        return customer;
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customerToDelete = session.get(Customer.class, id);
        session.remove(customerToDelete);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Customer> fetchAllCustomers() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Customer> customers = session.createQuery("from customer", Customer.class).getResultList();
        transaction.commit();
        session.close();
        return customers;
    }
}
