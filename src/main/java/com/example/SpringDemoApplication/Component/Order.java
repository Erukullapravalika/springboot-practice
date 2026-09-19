package com.example.SpringDemoApplication.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
	
	User user;
	
	public Order() {
		System.out.println("Initialized order");
	}

	public void setOrder(User user) {
		this.user=user;
		
		
	}

}
