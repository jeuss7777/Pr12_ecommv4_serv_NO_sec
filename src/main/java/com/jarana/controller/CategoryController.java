package com.jarana.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.Category;
import com.jarana.service.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController { 

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Category> findAll() {
		return categoryService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public Category find(@PathVariable("id") Type id) {
//		return categoryService.findOne(id);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Category> findBy-ReplaceFIELD(@PathVariable("FIELD") TYPE FIELD) {
//		return categoryService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody Category category) {
		categoryService.create(category);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody Category category) {
		categoryService.update(category);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Category category) {
		categoryService.delete(category);
	}

}
