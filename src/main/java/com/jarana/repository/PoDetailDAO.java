package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jarana.entities.PoDetail;
import com.jarana.entities.PoDetailId;

@Repository("podetailDAO")
public interface PoDetailDAO extends JpaRepository<PoDetail, PoDetailId> {

	PoDetail findOne(PoDetailId id);
	
	@Query("Select pd1 FROM PoDetail pd1 INNER JOIN FETCH pd1.part p WHERE p.paSkuNb=:paSkuNb")
	List<PoDetail> findPODetailBySku(@Param(value = "paSkuNb") Long paSkuNb);
	
	List<PoDetail> findByid(PoDetailId id);
	 
	 
}
