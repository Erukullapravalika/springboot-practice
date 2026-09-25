package com.example.SpringDemoApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemoApplication.Entity.User;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value="/api")
@Scope("request")
public class UserController {
	@Autowired
	User user;
	public UserController() {
		System.out.println("User Controller Init");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("User Controller Hashcode:"+this.hashCode()+ " "+
		"User Object Hashcode:" +user.hashCode());
	}
	
	@GetMapping(path="/fetchUser1")
	public ResponseEntity<String> getUserDetails(){
		System.out.println("Fetch User API");
		return ResponseEntity.status(HttpStatus.OK).body("OK");
		
	}

}
