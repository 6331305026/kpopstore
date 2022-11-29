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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class BandController {
  
  @Autowired
  private BandRepository bandRepo;
  
  @GetMapping("/band")
  public ResponseEntity<List<Band>> getAllBands() {
	  try {
		  List<Band> bandList = new ArrayList<>();
		  bandRepo.findAll().forEach(bandList::add);
		  
		  if(bandList.isEmpty()) {
			  return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		  }
		  return new ResponseEntity<>(bandList, HttpStatus.OK);
	  }catch(Exception e) {
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	  }
  }
  
  @GetMapping("/band/{id}")
  public ResponseEntity<Band> getBandById(@PathVariable Long id) {
	  Optional<Band> bandData = bandRepo.findById(id);
	  
	  if(bandData.isPresent()) {
		  return new ResponseEntity<>(bandData.get(), HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @PostMapping("/band")
  public ResponseEntity<Band> addBand(@RequestBody Band band) {
	  Band bandObj = bandRepo.save(band);
	  
	  return new ResponseEntity<>(bandObj, HttpStatus.OK);
  }
  
  @PostMapping("/band/{id}")
  public ResponseEntity<Band> updateBandById(@PathVariable Long id, @RequestBody Band newBandData) {
	  Optional<Band> oldBandData = bandRepo.findById(id);
	  
	  if(oldBandData.isPresent()) {
		  Band updatedBandData = oldBandData.get();
		  updatedBandData.setBandName(newBandData.getBandName());
		  
		  Band bandObj = bandRepo.save(updatedBandData);
		  return new ResponseEntity<>(bandObj, HttpStatus.OK);
	  }
	  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
  
  @DeleteMapping("/band/{id}")
  public ResponseEntity<HttpStatus> deleteBandById(@PathVariable Long id) {
	  bandRepo.deleteById(id);
	  return new ResponseEntity<>(HttpStatus.OK);
  }
}