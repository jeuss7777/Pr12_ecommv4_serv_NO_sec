package com.jarana.service;
import java.util.List;

import com.jarana.entities.PoHeader;
public interface PoHeaderService {
	public List<PoHeader> findAll();
//	public PoHeader findOne(TYPE PK);
//	public List<PoHeader> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (PoHeader poheader);
	public void update (PoHeader poheader);
	public void delete (PoHeader poheader);
}
