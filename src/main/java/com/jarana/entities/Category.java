package com.jarana.entities;
// Generated Mar 12, 2017 11:10:29 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "Category", catalog = "ecommv2")
public class Category implements java.io.Serializable {

	private Long catId;
	private String catCatgryNm;

	public Category() {
	}

	public Category(String catCatgryNm) {
		this.catCatgryNm = catCatgryNm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cat_id", unique = true, nullable = false)
	public Long getCatId() {
		return this.catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	@Column(name = "cat_catgry_nm", nullable = false, length = 15)
	public String getCatCatgryNm() {
		return this.catCatgryNm;
	}

	public void setCatCatgryNm(String catCatgryNm) {
		this.catCatgryNm = catCatgryNm;
	}

}
