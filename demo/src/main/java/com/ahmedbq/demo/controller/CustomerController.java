package com.ahmedbq.demo.controller;

import com.ahmedbq.demo.entity.Customer;
import com.ahmedbq.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/all")
    List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/save")
    Customer saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
