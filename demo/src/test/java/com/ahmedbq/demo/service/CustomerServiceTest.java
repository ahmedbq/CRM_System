package com.ahmedbq.demo.service;

import com.ahmedbq.demo.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTest {
    @Autowired
    CustomerService customerService;

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getAllCustomersTest() {
        List<Customer> customers = customerService.getAllCustomers();
        log.info("Number of customers: {}", customers.size());

        for(Customer customer : customers) {
            log.info("Customer id: {} name: {}", customer.getId(), customer.getName());
        }

        assertEquals(customers.get(0).getId().intValue(), 1);
        assertEquals(customers.get(0).getName(), "Ahmed");
    }
}
