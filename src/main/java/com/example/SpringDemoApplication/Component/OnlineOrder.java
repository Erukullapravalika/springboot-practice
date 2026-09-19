package com.example.SpringDemoApplication.Component;

import org.springframework.stereotype.Component;

@Component
public class OnlineOrder {
	
	public OnlineOrder() {
		System.out.println("Ordered online");
		
	}
	
	// we can change the dependency at any time after object creation using setter injection
	/* public static void main(String[] args) {
		User user = new User();
		Order order = new Order();
		
		user.setOrder(order); 
	} */

}
