package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Customer;

@Repository("customerDAO")
public interface CustomerDAO extends JpaRepository<Customer, String> {

	 List<Customer> findBycuEmail(String cuEmail);
	 
	 List<Customer> findBycuLastNm(String cuLastNm);
}
