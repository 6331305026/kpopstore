package com.mfu.kpopmart_backend.domain;

import java.util.Set;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "BAND")
public class Band {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="BAND_ID")
	private Long id;

	@Column(name="BAND_NAME")
	private String name;
	
	//@JsonIgnore
	@OneToMany(mappedBy = "band")
	private Set<Product> products;
	
	public Band() {}

	public Band(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Band(String name) {
		this(null,name);
	}

	public Long getBandId() {
		return id;
	}

	public void setBandId(Long id) {
		this.id = id;
	}

	public String getBandName() {
		return name;
	}

	public void setBandName(String name) {
		this.name = name;
	}
	
//	public Set<Product> getProducts() {
//	    return this.products;
//	}
}