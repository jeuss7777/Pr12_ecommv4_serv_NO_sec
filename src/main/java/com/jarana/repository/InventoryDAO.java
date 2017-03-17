package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Inventory;

@Repository("inventoryDAO")
public interface InventoryDAO extends JpaRepository<Inventory, String> {

	 List<Inventory> findByinLocatCd(String inLocatCd);
}
