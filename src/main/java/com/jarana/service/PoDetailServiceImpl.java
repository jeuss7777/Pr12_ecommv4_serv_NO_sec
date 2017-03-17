package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.PoDetail;
import com.jarana.repository.PoDetailDAO;

@Transactional
@Service("podetailService")
public class PoDetailServiceImpl implements PoDetailService {

	@Autowired
	private PoDetailDAO podetailDAO;

	public List<PoDetail> findAll() {
		List<PoDetail> listPoDetail = podetailDAO.findAll();
		return listPoDetail;
	}

//	public PoDetail findOne(TYPE PK) {
//		return podetailDAO.findOne(PK);
//	}

//	public List<PoDetail> findBy-ReplaceFIELD(TYPE FIELD) {
//		return podetailDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (PoDetail podetail) {
		podetailDAO.save(podetail);
	}

	public void update (PoDetail podetail) {
		podetailDAO.save(podetail);
	}

	public void delete (PoDetail podetail) {
		podetailDAO.delete(podetail);
	}

	@Override
	public List<PoDetail> findPODetailBySku(Long paSkuNb) {
		// TODO Auto-generated method stub
		return podetailDAO.findPODetailBySku(paSkuNb);
	}

}
