package com.example.SpringDemoApplication.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class User {
	
	@Autowired
	Order order; 
	
	public User(Order order) {
		this.order=order;
		System.out.println("Intialized user");
	} 
	
	@PostConstruct
	/* @PostConstruct is used to run a method after 
	 * Spring has created the bean and completed its dependency injection.
	 * After constructing user bean set it inside order
	 */ 
	public void init() {
		order.setOrder(this);
	}
	
	

}
