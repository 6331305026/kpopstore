package com.mfu.kpopmart_backend.domain;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="PRODUCT_ID")
	private Long id;

	@Column(name="PRODUCT_PIC")
	private String pic;
	
	@Column(name="PRODUCT_NAME")
	private String name;
	
	@Column(name="PRODUCT_DESC")
	private String desc;
	
	@Column(name="PRODUCT_PRICE")
	private String price;
	
	@JsonIgnore
	@OneToMany(mappedBy = "orderProduct")
    private Set<Order> orderIn;
	
//	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="BAND_ID")
	private Band band;
	
	public Product() {}

	public Product(Long id, String pic, String name, String desc, String price) {
		this.id = id;
		this.pic = pic;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	public Product(String pic, String name, String desc, String price) {
		this(null,pic,name,desc,price);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Set<Order> getOrderIn() {
		return orderIn;
	}

	public void setOrderIn(Set<Order> orderIn) {
		this.orderIn = orderIn;
	}

	public Band getBand() {
		return band;
	}

	public void setBand(Band band) {
		this.band = band;
	}
}

