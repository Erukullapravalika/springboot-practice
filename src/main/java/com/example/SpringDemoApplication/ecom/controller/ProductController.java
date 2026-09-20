package com.example.SpringDemoApplication.ecom.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product/v1")
public class ProductController {
	
	@GetMapping("/getProduct/{productId}")
	public ResponseEntity<String> getBookbyId(@PathVariable Integer bookId){
		return ResponseEntity.ok("Product");
		
	}

}
