package com.projectE.projectE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectE.projectE.model.EDetails;
import com.projectE.projectE.service.EService;

@RestController
@RequestMapping("/projectE")
public class Controller {
	
	@Autowired
	private EService eService;
	
	@PostMapping
	private ResponseEntity<Long> saveProductinDB(@RequestBody EDetails eDetails){
		long productId = eService.saveProduct(eDetails);
		return new ResponseEntity<>(productId,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	private EDetails getProductDetails(@PathVariable("id") Long productId) {
		return eService.getDetails(productId);
	}

}
