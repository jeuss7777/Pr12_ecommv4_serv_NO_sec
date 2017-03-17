package com.jarana.service;
import java.util.List;

import com.jarana.entities.Vendor;
public interface VendorService {
	public List<Vendor> findAll();
//	public Vendor findOne(TYPE PK);
//	public List<Vendor> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (Vendor vendor);
	public void update (Vendor vendor);
	public void delete (Vendor vendor);
}
