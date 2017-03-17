package com.jarana.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Customer;
import com.jarana.entities.InvoiceHeader;
import com.jarana.repository.InvoiceHeaderDAO;

@Transactional
@Service("invoiceheaderService")
public class InvoiceHeaderServiceImpl implements InvoiceHeaderService {

	@Autowired
	private InvoiceHeaderDAO invoiceheaderDAO;

	public List<InvoiceHeader> findAll() {
		List<InvoiceHeader> listInvoiceHeader = invoiceheaderDAO.findAll();
		return listInvoiceHeader;
	}

	public InvoiceHeader findOne(Long ihInvNb) {
		return invoiceheaderDAO.findOne(ihInvNb);
	}

	//public List<InvoiceHeader> findBycustomer(Customer customer) {
	//	return invoiceheaderDAO.findBycustomer(customer);
	//}

	public void create (InvoiceHeader invoiceheader) {
		invoiceheaderDAO.save(invoiceheader);
	}

	public void update (InvoiceHeader invoiceheader) {
		invoiceheaderDAO.save(invoiceheader);
	}

	public void delete (InvoiceHeader invoiceheader) {
		invoiceheaderDAO.delete(invoiceheader);
	}

	@Override
	public InvoiceHeader findOneDet(Long ihInvNb) {
		return invoiceheaderDAO.findOneDet(ihInvNb);
	}

	@Override
	public List<InvoiceHeader> findByCustomerName(String name) {
		
		return invoiceheaderDAO.findByCustomerName(name);
	}

	@Override
	public List<InvoiceHeader> findByCustomerNameByDates(String name, Date startDate, Date endDate) {
		
		return invoiceheaderDAO.findByCustomerNameByDates(name, startDate, endDate);
	}

}
