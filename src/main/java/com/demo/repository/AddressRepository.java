package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
