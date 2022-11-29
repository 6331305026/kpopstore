package com.mfu.kpopmart_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mfu.kpopmart_backend.repository.*;
import com.mfu.kpopmart_backend.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.mfu.kpopmart_backend.domain.*;

@RestController
public class OrderController {
  
  @Autowired
  private OrderRepository orderRepo;
  
  @Autowired
  private ProductRepository productRepo;
  
  @Autowired
  private UserRepository userRepo;
  
  @GetMapping("/order")
  public ResponseEntity<List<Order>> getAllOrders() {
	  try {
		  List<Order> orderList = new ArrayList<>();
		  orderRepo.findAll().forEach(orderList::add);
		  
		  if(orderList.isEmpty()) {
			  return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  }
		  return new ResponseEntity<>(orderList, HttpStatus.OK);
	  }catch(Exception e) {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
  }
  
  @GetMapping("/order/{id}")
  public ResponseEntity<Order> getOrderById(@PathVariable Long id) {
	  Optional<Order> orderData = orderRepo.findById(id);
	  
	  if(orderData.isPresent()) {
		  return new ResponseEntity<>(orderData.get(), HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/order")
  public ResponseEntity<Order> addOrder(@RequestBody Order order) {
	  Order orderObj = orderRepo.save(order);
	  
	  return new ResponseEntity<>(orderObj, HttpStatus.OK);
  }
  
  @PostMapping("/order/{id}")
  public ResponseEntity<Order> updateOrderById(@PathVariable Long id, @RequestBody Order newOrderData) {
	  Optional<Order> oldOrderData = orderRepo.findById(id);
	  
	  if(oldOrderData.isPresent()) {
		  Order updatedOrderData = oldOrderData.get();
//		  updatedOrderData.setName(newOrderData.getName());
//		  updatedOrderData.setPrice(newOrderData.getPrice());
		  
		  
		  Order orderObj = orderRepo.save(updatedOrderData);
		  return new ResponseEntity<>(orderObj, HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @DeleteMapping("/order/{id}")
  public ResponseEntity<HttpStatus> deleteOrderById(@PathVariable Long id) {
	  orderRepo.deleteById(id);
	  return new ResponseEntity<>(HttpStatus.OK);
  }
}