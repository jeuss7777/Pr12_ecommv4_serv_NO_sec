package com.jarana.service;
import java.util.List;

import com.jarana.entities.Customer;
public interface CustomerService {
	public List<Customer> findAll();
	public Customer findOne(String cuEmail);
	public List<Customer> findBycuLastNm(String cuLastNm);
	public void create (Customer customer);
	public void update (Customer customer);
	public void delete (Customer customer);
	
}
