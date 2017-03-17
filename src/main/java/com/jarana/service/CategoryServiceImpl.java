package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Category;
import com.jarana.repository.CategoryDAO;

@Transactional
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;

	public List<Category> findAll() {
		List<Category> listCategory = categoryDAO.findAll();
		return listCategory;
	}

//	public Category findOne(TYPE PK) {
//		return categoryDAO.findOne(PK);
//	}

//	public List<Category> findBy-ReplaceFIELD(TYPE FIELD) {
//		return categoryDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (Category category) {
		categoryDAO.save(category);
	}

	public void update (Category category) {
		categoryDAO.save(category);
	}

	public void delete (Category category) {
		categoryDAO.delete(category);
	}

}
