package com.jarana.service;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jarana.entities.Customer;
import com.jarana.entities.InvoiceHeader;
public interface InvoiceHeaderService {
	public List<InvoiceHeader> findAll();
	
	public InvoiceHeader findOne(Long ihInvNb);
	public InvoiceHeader findOneDet(@Param("ihInvNb") Long ihInvNb);
	
	//public List<InvoiceHeader> findBycustomer(Customer customer);
	public void create (InvoiceHeader invoiceheader);
	public void update (InvoiceHeader invoiceheader);
	public void delete (InvoiceHeader invoiceheader);
	
	public List<InvoiceHeader> findByCustomerName(@Param("name") String name);
	 
	public List<InvoiceHeader> findByCustomerNameByDates(@Param("name") String name, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
