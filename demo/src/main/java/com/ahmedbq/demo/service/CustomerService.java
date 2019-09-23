package com.ahmedbq.demo.service;

import com.ahmedbq.demo.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer saveCustomer(Customer customer);
}
