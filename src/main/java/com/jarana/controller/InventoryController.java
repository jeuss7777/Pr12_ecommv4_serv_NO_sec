package com.jarana.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarana.entities.Inventory;
import com.jarana.service.InventoryService;

@Controller
@RequestMapping("/inventory")
public class InventoryController { 

	@Autowired
	private InventoryService inventoryService;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Inventory> findAll() {
		return inventoryService.findAll();
	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	@ResponseBody
//	public Inventory find(@PathVariable("id") Type id) {
//		return inventoryService.findOne(id);
//	}

//	@RequestMapping(value = "/WISHED_FIELD_NAME/{FIELD}", method = RequestMethod.GET)
//	@ResponseBody
//	public List<Inventory> findBy-ReplaceFIELD(@PathVariable("FIELD") TYPE FIELD) {
//		return inventoryService.findBy-ReplaceFIELD(FIELD);
//	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void create(@RequestBody Inventory inventory) {
		inventoryService.create(inventory);
	}

	@RequestMapping(value = "/edit", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public void update(@RequestBody Inventory inventory) {
		inventoryService.update(inventory);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public void delete(@RequestBody Inventory inventory) {
		inventoryService.delete(inventory);
	}

}
