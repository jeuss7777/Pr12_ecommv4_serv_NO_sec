package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Tax;
import com.jarana.repository.TaxDAO;

@Transactional
@Service("taxService")
public class TaxServiceImpl implements TaxService {

	@Autowired
	private TaxDAO taxDAO;

	public List<Tax> findAll() {
		List<Tax> listTax = taxDAO.findAll();
		return listTax;
	}

//	public Tax findOne(TYPE PK) {
//		return taxDAO.findOne(PK);
//	}

//	public List<Tax> findBy-ReplaceFIELD(TYPE FIELD) {
//		return taxDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (Tax tax) {
		taxDAO.save(tax);
	}

	public void update (Tax tax) {
		taxDAO.save(tax);
	}

	public void delete (Tax tax) {
		taxDAO.delete(tax);
	}

}
