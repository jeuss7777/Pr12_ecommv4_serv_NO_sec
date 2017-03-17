package com.jarana.service;
import java.util.List;

import com.jarana.entities.PoDetail;
public interface PoDetailService {
	public List<PoDetail> findAll();
//	public PoDetail findOne(TYPE PK);
//	public List<PoDetail> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (PoDetail podetail);
	public void update (PoDetail podetail);
	public void delete (PoDetail podetail);
	public List<PoDetail> findPODetailBySku(Long paSkuNb);
}
