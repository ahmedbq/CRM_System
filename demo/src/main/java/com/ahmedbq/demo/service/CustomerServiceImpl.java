package com.ahmedbq.demo.service;

import com.ahmedbq.demo.entity.Customer;
import com.ahmedbq.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
}
