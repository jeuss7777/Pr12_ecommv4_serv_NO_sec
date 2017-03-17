package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.PoHeader;

@Repository("poheaderDAO")
public interface PoHeaderDAO extends JpaRepository<PoHeader, Long> {

	 List<PoHeader> findByphPoNb(Long phPoNb);
}
