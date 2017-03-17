package com.jarana.service;
import java.util.List;

import com.jarana.entities.Category;
public interface CategoryService {
	public List<Category> findAll();
//	public Category findOne(TYPE PK);
//	public List<Category> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (Category category);
	public void update (Category category);
	public void delete (Category category);
}
