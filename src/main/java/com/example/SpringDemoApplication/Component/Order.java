package com.example.SpringDemoApplication.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	User user;
	
	/* order is dependent on user
	 * user is dependent on order 
	 * This is known as circular dependency
	 */
	@Autowired
	public Order(User user) {
		this.user=user;
		System.out.println("Initialized order");
	}

}
