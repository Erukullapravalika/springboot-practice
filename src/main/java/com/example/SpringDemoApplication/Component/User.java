package com.example.SpringDemoApplication.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	//Field Injection-- Dependency is set into filed's of a class
	@Autowired
	Order order; 
	OnlineOrder onlineorder;
    
	/* Constructor Injection-- Dependency will be resolved at time of initialization of object
	 * Commonly Preferred Injection Type 
	 * Fails at Compilation if there is any missing dependency
	 */
	@Autowired
	public User(Order order, OnlineOrder onlineorder) {
		this.order=order;
		this.onlineorder=onlineorder;
		System.out.println("Intialized user");
	} 
	
	//Setter Injection- Dependency is set using setter of field
	@Autowired
	public void setOrder(Order order) {
		this.order=order;
		
	}

}
