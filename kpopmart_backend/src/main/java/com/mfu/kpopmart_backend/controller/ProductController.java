package com.mfu.kpopmart_backend.controller;

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
public class ProductController {
  
  @Autowired
  private ProductRepository productRepo;
  
//  @Autowired
//  private OrderRepository orderRepo;
//  
//  @Autowired
//  private BandRepository bandRepo;
  
  @GetMapping("/products")
  public ResponseEntity<List<Product>> getAllProducts() {
	  try {
		  List<Product> productList = new ArrayList<>();
		  productRepo.findAll().forEach(productList::add);
		  
		  if(productList.isEmpty()) {
			  return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  }
		  return new ResponseEntity<>(productList, HttpStatus.OK);
	  }catch(Exception e) {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
  }
  
  @GetMapping("/products/{id}")
  public ResponseEntity<Product> getProductById(@PathVariable Long id) {
	  Optional<Product> productData = productRepo.findById(id);
	  
	  if(productData.isPresent()) {
		  return new ResponseEntity<>(productData.get(), HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/products")
  public ResponseEntity<Product> addProduct(@RequestBody Product product) {
	  Product productObj = productRepo.save(product);
	  
	  return new ResponseEntity<>(productObj, HttpStatus.OK);
  }
  
  @PostMapping("/products/{id}")
  public ResponseEntity<Product> updateProductById(@PathVariable Long id, @RequestBody Product newProductData) {
	  Optional<Product> oldProductData = productRepo.findById(id);
	  
	  if(oldProductData.isPresent()) {
		  Product updatedProductData = oldProductData.get();
		  updatedProductData.setPic(newProductData.getPic());
		  updatedProductData.setName(newProductData.getName());
		  updatedProductData.setDesc(newProductData.getDesc());
		  updatedProductData.setPrice(newProductData.getPrice());
		  
		  Product productObj = productRepo.save(updatedProductData);
		  return new ResponseEntity<>(productObj, HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @DeleteMapping("/products/{id}")
  public ResponseEntity<HttpStatus> deleteProductById(@PathVariable Long id) {
	  productRepo.deleteById(id);
	  return new ResponseEntity<>(HttpStatus.OK);
  }
}
