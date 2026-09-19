package com.example.SpringDemoApplication.Component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary // when multiple beans are found injects the one marked with @Primary
public class OnlineOrder implements Order{
	
	public OnlineOrder() {
		System.out.println("Ordered online");
		
	}
	
}
