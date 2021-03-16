package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
