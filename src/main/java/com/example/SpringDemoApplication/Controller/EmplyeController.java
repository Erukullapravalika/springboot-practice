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
import jakarta.servlet.http.HttpServletRequest;
@RestController
@RequestMapping(value="/api")
@Scope("session")
/* session scope -- new object for each Http Session
 * when user access any api, session is created and 
 * remains active until session is expired
 * 
 * below is the example of session scope
 * 
 * Emplye Controller init
 * Emplye Controller Hash Code:1971018858 User Object Hash Code:503367775
 * Fetch user api
 * Fetch user api
 * Fetch user apiFetch user api
 * 
 * 
 * Emplye Controller init
 * Emplye Controller Hash Code:1374832410 User Object Hash Code:503367775
 * Fetch user api
 * Fetch user api
 */
public class EmplyeController {
	
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
	
	@GetMapping(path="/logout")
	public ResponseEntity<String> logout(HttpServletRequest request){
		System.out.println("Fetch user api");
		request.getSession().invalidate();
		return ResponseEntity.status(HttpStatus.OK).body("OK");
	}

}
