package com.jarana.entities;
// Generated Mar 12, 2017 11:10:29 PM by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Vendor generated by hbm2java
 */
@Entity
@Table(name = "Vendor", catalog = "ecommv2")
public class Vendor implements java.io.Serializable {

	private Long veVendorNb;
	private String veVendorNm;
	private String veAddress;
	private String veCity;
	private String veState;
	private Integer veZipCode;
	private String veCountry;
	private String veTelephone;
	private Set<Part> parts = new HashSet<Part>(0);
	private Set<PoDetail> poDetails = new HashSet<PoDetail>(0);
	private Set<PoHeader> poHeaders = new HashSet<PoHeader>(0);

	public Vendor() {
	}

	public Vendor(String veVendorNm, String veAddress, String veCity, String veState, Integer veZipCode,
			String veCountry, String veTelephone, Set<Part> parts, Set<PoDetail> poDetails, Set<PoHeader> poHeaders) {
		this.veVendorNm = veVendorNm;
		this.veAddress = veAddress;
		this.veCity = veCity;
		this.veState = veState;
		this.veZipCode = veZipCode;
		this.veCountry = veCountry;
		this.veTelephone = veTelephone;
		this.parts = parts;
		this.poDetails = poDetails;
		this.poHeaders = poHeaders;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ve_vendor_nb", unique = true, nullable = false)
	public Long getVeVendorNb() {
		return this.veVendorNb;
	}

	public void setVeVendorNb(Long veVendorNb) {
		this.veVendorNb = veVendorNb;
	}

	@Column(name = "ve_vendor_nm", length = 60)
	public String getVeVendorNm() {
		return this.veVendorNm;
	}

	public void setVeVendorNm(String veVendorNm) {
		this.veVendorNm = veVendorNm;
	}

	@Column(name = "ve_address")
	public String getVeAddress() {
		return this.veAddress;
	}

	public void setVeAddress(String veAddress) {
		this.veAddress = veAddress;
	}

	@Column(name = "ve_city", length = 25)
	public String getVeCity() {
		return this.veCity;
	}

	public void setVeCity(String veCity) {
		this.veCity = veCity;
	}

	@Column(name = "ve_state", length = 20)
	public String getVeState() {
		return this.veState;
	}

	public void setVeState(String veState) {
		this.veState = veState;
	}

	@Column(name = "ve_zip_code")
	public Integer getVeZipCode() {
		return this.veZipCode;
	}

	public void setVeZipCode(Integer veZipCode) {
		this.veZipCode = veZipCode;
	}

	@Column(name = "ve_country", length = 25)
	public String getVeCountry() {
		return this.veCountry;
	}

	public void setVeCountry(String veCountry) {
		this.veCountry = veCountry;
	}

	@Column(name = "ve_telephone", length = 16)
	public String getVeTelephone() {
		return this.veTelephone;
	}

	public void setVeTelephone(String veTelephone) {
		this.veTelephone = veTelephone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vendor")
	public Set<Part> getParts() {
		return this.parts;
	}

	public void setParts(Set<Part> parts) {
		this.parts = parts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vendor")
	public Set<PoDetail> getPoDetails() {
		return this.poDetails;
	}

	public void setPoDetails(Set<PoDetail> poDetails) {
		this.poDetails = poDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vendor")
	public Set<PoHeader> getPoHeaders() {
		return this.poHeaders;
	}

	public void setPoHeaders(Set<PoHeader> poHeaders) {
		this.poHeaders = poHeaders;
	}

}