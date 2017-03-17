package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Vendor;
import com.jarana.repository.VendorDAO;

@Transactional
@Service("vendorService")
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDAO vendorDAO;

	public List<Vendor> findAll() {
		List<Vendor> listVendor = vendorDAO.findAll();
		return listVendor;
	}

//	public Vendor findOne(TYPE PK) {
//		return vendorDAO.findOne(PK);
//	}

//	public List<Vendor> findBy-ReplaceFIELD(TYPE FIELD) {
//		return vendorDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (Vendor vendor) {
		vendorDAO.save(vendor);
	}

	public void update (Vendor vendor) {
		vendorDAO.save(vendor);
	}

	public void delete (Vendor vendor) {
		vendorDAO.delete(vendor);
	}

}
