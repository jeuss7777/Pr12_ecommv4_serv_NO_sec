package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Part;
import com.jarana.repository.PartDAO;

@Transactional
@Service("partService")
public class PartServiceImpl implements PartService {

	@Autowired
	private PartDAO partDAO;

	public List<Part> findAll() {
		List<Part> listPart = partDAO.findAll();
		return listPart;
	}

//	public Part findOne(TYPE PK) {
//		return partDAO.findOne(PK);
//	}

//	public List<Part> findBy-ReplaceFIELD(TYPE FIELD) {
//		return partDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (Part part) {
		partDAO.save(part);
	}

	public void update (Part part) {
		partDAO.save(part);
	}

	public void delete (Part part) {
		partDAO.delete(part);
	}

}
