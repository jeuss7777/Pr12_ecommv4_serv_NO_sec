package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.PoHeader;
import com.jarana.repository.PoHeaderDAO;

@Transactional
@Service("poheaderService")
public class PoHeaderServiceImpl implements PoHeaderService {

	@Autowired
	private PoHeaderDAO poheaderDAO;

	public List<PoHeader> findAll() {
		List<PoHeader> listPoHeader = poheaderDAO.findAll();
		return listPoHeader;
	}

//	public PoHeader findOne(TYPE PK) {
//		return poheaderDAO.findOne(PK);
//	}

//	public List<PoHeader> findBy-ReplaceFIELD(TYPE FIELD) {
//		return poheaderDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (PoHeader poheader) {
		poheaderDAO.save(poheader);
	}

	public void update (PoHeader poheader) {
		poheaderDAO.save(poheader);
	}

	public void delete (PoHeader poheader) {
		poheaderDAO.delete(poheader);
	}

}
