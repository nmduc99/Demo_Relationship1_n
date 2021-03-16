package com.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String city;
	private String province;
	@OneToMany(
			mappedBy = "address",
			cascade = CascadeType.ALL,
			orphanRemoval = true			
	)
	 private List<Customer> customer = new ArrayList<>(); 	
	
	public Address(String city, String province) {
		this.city = city;
		this.province = province;
	}
	
	public void setCustomers(List<Customer> customer) {
		this.customer= customer;
	}
}
