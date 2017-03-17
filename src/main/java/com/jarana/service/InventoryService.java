package com.jarana.service;
import java.util.List;

import com.jarana.entities.Inventory;
public interface InventoryService {
	public List<Inventory> findAll();
//	public Inventory findOne(TYPE PK);
//	public List<Inventory> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (Inventory inventory);
	public void update (Inventory inventory);
	public void delete (Inventory inventory);
}
