package com.ahmedbq.demo.controller;

import com.ahmedbq.demo.entity.Customer;
import com.ahmedbq.demo.entity.CustomerDTO;
import com.ahmedbq.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Ahmed Qureshi
 * Basic CRUD API already created by Spring Data REST
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PutMapping("/saveMultiple")
    void saveMultiple(@RequestBody List<CustomerDTO> customerDTOs) {
        customerService.saveMultiple(customerDTOs);
    }

}
