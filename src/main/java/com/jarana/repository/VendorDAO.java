package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Vendor;

@Repository("vendorDAO")
public interface VendorDAO extends JpaRepository<Vendor, Long> {

	 List<Vendor> findByveVendorNb(Long veVendorNb);
}
