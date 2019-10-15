package com.ahmedbq.demo.service;

import com.ahmedbq.demo.entity.Customer;
import com.ahmedbq.demo.entity.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveMultiple(List<CustomerDTO> customerDTOs);
}
