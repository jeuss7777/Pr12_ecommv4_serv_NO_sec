package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jarana.entities.InvoiceDetail;
import com.jarana.entities.InvoiceDetailId;
import com.jarana.entities.PoDetail;

@Repository("invoicedetailDAO")
public interface InvoiceDetailDAO extends JpaRepository<InvoiceDetail, InvoiceDetailId> {

	 //List<InvoiceDetail> findByid(InvoiceDetail id);
	 
	 @Query("Select id1 FROM InvoiceDetail id1 INNER JOIN FETCH id1.part p WHERE p.paSkuNb=:paSkuNb")
	 List<InvoiceDetail> findBySku(@Param(value = "paSkuNb") Long paSkuNb);
	 
}
