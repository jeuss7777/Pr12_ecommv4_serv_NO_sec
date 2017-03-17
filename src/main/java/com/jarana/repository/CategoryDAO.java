package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Category;

@Repository("categoryDAO")
public interface CategoryDAO extends JpaRepository<Category, Long> {

	 List<Category> findBycatId(Long catId);
}
