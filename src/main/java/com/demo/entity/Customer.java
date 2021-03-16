package com.demo.entity;

import javax.persistence.*;


@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private String name;
	private String phonenumber;
	@ManyToOne
	@JoinColumn(name= "address_id")
	private Address address;
	public Customer(String name, String phonenumber, Address address) {
		
		this.name = name;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	
	
}
