package com.jarana.service;
import java.util.List;

import com.jarana.entities.Tax;
public interface TaxService {
	public List<Tax> findAll();
//	public Tax findOne(TYPE PK);
//	public List<Tax> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (Tax tax);
	public void update (Tax tax);
	public void delete (Tax tax);
}
