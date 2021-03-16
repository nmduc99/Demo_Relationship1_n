package com.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.entity.Address;
import com.demo.entity.Customer;
import com.demo.repository.AddressRepository;

@SpringBootApplication
public class DemoNativeQueryRelationshipApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(DemoNativeQueryRelationshipApplication.class, args);
		
		AddressRepository addressRepository =  configurableApplicationContext.getBean(AddressRepository.class);
		
		Address address  = new Address("Tuy Hoa","Phu Yen");
		Customer newcus = new Customer("Nam","0316358",address);
		
		List<Customer> customer = Arrays.asList(newcus);
		
		address.setCustomers(customer);
		addressRepository.save(address);
		
	}
	
}
