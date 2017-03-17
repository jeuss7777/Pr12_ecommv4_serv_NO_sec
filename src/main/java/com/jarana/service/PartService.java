package com.jarana.service;
import java.util.List;

import com.jarana.entities.Part;
public interface PartService {
	public List<Part> findAll();
//	public Part findOne(TYPE PK);
//	public List<Part> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (Part part);
	public void update (Part part);
	public void delete (Part part);
}
