package com.ahmedbq.demo.repo;

import com.ahmedbq.demo.entity.Customer;
import com.ahmedbq.demo.util.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findCustomerByDisabled(Boolean disable);

    Optional<Customer> findCustomerByEmail(String email);

    Optional<Customer> findCustomerByMembership(Membership membership);

}
