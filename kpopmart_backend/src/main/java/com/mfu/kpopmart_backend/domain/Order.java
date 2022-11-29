package com.mfu.kpopmart_backend.domain;

import java.util.HashSet;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ORDER_ID")
	private Long id;

//	@Column(name="PRODUCT_NAME")
//	private String name;
//	
//	@Column(name="PRODUCT_PRICE")
//	private String price;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product orderProduct;
	
	public Order(){}
	
	public Order(Long id){
		this.id = id;
//		this.name = name;
//		this.price = price;
	}
	
//	public Order(String name, String price){
//		this(null,name, price);
//	}

	public Long getOrderId() {
		return id;
	}

	public void setOrderId(Long id) {
		this.id = id;
	}
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPrice() {
//		return price;
//	}
//
//	public void setPrice(String price) {
//		this.price = price;
//	}
	
	public Product getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(Product orderProduct) {
		this.orderProduct = orderProduct;
	}

	public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}