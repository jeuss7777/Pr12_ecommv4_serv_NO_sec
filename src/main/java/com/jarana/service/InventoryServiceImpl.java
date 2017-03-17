package com.jarana.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jarana.entities.Inventory;
import com.jarana.repository.InventoryDAO;

@Transactional
@Service("inventoryService")
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryDAO inventoryDAO;

	public List<Inventory> findAll() {
		List<Inventory> listInventory = inventoryDAO.findAll();
		return listInventory;
	}

//	public Inventory findOne(TYPE PK) {
//		return inventoryDAO.findOne(PK);
//	}

//	public List<Inventory> findBy-ReplaceFIELD(TYPE FIELD) {
//		return inventoryDAO.findBy-ReplaceFIELD(FIELD);
//	}

	public void create (Inventory inventory) {
		inventoryDAO.save(inventory);
	}

	public void update (Inventory inventory) {
		inventoryDAO.save(inventory);
	}

	public void delete (Inventory inventory) {
		inventoryDAO.delete(inventory);
	}

}
