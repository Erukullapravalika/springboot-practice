package com.example.SpringDemoApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemoApplication.Entity.User;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(value="/api")
public class EmplyeController {
	
	/* 
	 * same user bean is used in EmplyeeController and UserController
	 * singleton scope -- the same bean instance is created wherever created
	 * 
	 * Emplye Controller init
	 * User initialized
	 * user obj hashcode: 890453800
	 * Emplye Controller Hash Code:1057743280 User Object Hash Code:890453800
	 * User Controller Init
	 * User Controller Hashcode:10593274 User Object Hashcode:890453800	 
	 */
	@Autowired
	User user;
	
	public EmplyeController() {
		System.out.println("Emplye Controller init");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Emplye Controller Hash Code:" +this.hashCode()+" "+ 
				"User Object Hash Code:" +user.hashCode());
	}
	
	@GetMapping(path="/fetchUser")
	public ResponseEntity<String> getUserDetails(){
		System.out.println("Fetch user api");
		return ResponseEntity.status(HttpStatus.OK).body("OK");
	}

}
