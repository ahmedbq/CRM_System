package com.ahmedbq.demo.service;

import com.ahmedbq.demo.entity.Customer;
import com.ahmedbq.demo.entity.CustomerDTO;
import com.ahmedbq.demo.repo.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void saveMultiple(List<CustomerDTO> customerDTOs) {
        List<Customer> customersToSave = new ArrayList<>();

        for(CustomerDTO dto: customerDTOs) {
            Customer customer = new Customer();
            BeanUtils.copyProperties(dto, customer);
            customersToSave.add(customer);
        }

        customerRepository.saveAll(customersToSave);
    }
}
