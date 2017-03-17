package com.jarana.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.PoHeader;
import com.jarana.service.PoHeaderService;

@Controller
@RequestMapping("/poheader")
public class PoHeaderController { 

	@Autowired
	private PoHeaderService poheaderService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<PoHeader> findAll() {
		return poheaderService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public PoHeader find(@PathVariable("id") Type id) {
//		return poheaderService.findOne(id);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}", method = RequestMethod.GET)
//	@ResponseBody
//	public List<PoHeader> findBy-ReplaceFIELD(@PathVariable("FIELD") TYPE FIELD) {
//		return poheaderService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody PoHeader poheader) {
		poheaderService.create(poheader);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody PoHeader poheader) {
		poheaderService.update(poheader);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody PoHeader poheader) {
		poheaderService.delete(poheader);
	}

}
