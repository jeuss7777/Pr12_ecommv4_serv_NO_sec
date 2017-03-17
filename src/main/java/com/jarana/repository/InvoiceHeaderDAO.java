package com.jarana.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jarana.entities.InvoiceHeader;

@Repository("invoiceheaderDAO")
public interface InvoiceHeaderDAO extends JpaRepository<InvoiceHeader, Long> {

	 public List<InvoiceHeader> findByihInvNb(Long ihInvNb);
	 
	 @Query("Select ih1 FROM InvoiceHeader ih1 INNER JOIN FETCH ih1.customer INNER JOIN FETCH ih1.invoiceDetails WHERE ih1.ihInvNb = :ihInvNb")
	 public InvoiceHeader findOneDet(@Param("ihInvNb") Long ihInvNb);
	 
	 @Query("FROM InvoiceHeader where customer.cuLastNm = :name ")
	 public List<InvoiceHeader> findByCustomerName(@Param("name") String name);
	 
	 @Query("Select ih1 FROM InvoiceHeader ih1 INNER JOIN FETCH ih1.customer c INNER JOIN FETCH ih1.invoiceDetails where c.cuLastNm = :name and ih1.ihInvDt >= :startDate and ih1.ihInvDt <= :endDate ")
	 public List<InvoiceHeader> findByCustomerNameByDates(@Param("name") String name, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
