package com.jarana.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.Vendor;
import com.jarana.service.VendorService;

@Controller
@RequestMapping("/vendor")
public class VendorController { 

	@Autowired
	private VendorService vendorService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Vendor> findAll() {
		return vendorService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public Vendor find(@PathVariable("id") Type id) {
//		return vendorService.findOne(id);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Vendor> findBy-ReplaceFIELD(@PathVariable("FIELD") TYPE FIELD) {
//		return vendorService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody Vendor vendor) {
		vendorService.create(vendor);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody Vendor vendor) {
		vendorService.update(vendor);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Vendor vendor) {
		vendorService.delete(vendor);
	}

}
