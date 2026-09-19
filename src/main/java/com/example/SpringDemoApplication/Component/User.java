package com.example.SpringDemoApplication.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	Order order; 
	@Autowired
	/* @Lazy Injects beans whenever needed
	 * Delays creation of one dependency 
	 * Tells spring to give user a lazy reference/proxy to order and create order when it is actually needed
	 * can add on field level, setter level as well
	 */
	@Lazy 
	public User(Order order) {
		this.order=order;
		System.out.println("Intialized user");
	} 
	
	

}
