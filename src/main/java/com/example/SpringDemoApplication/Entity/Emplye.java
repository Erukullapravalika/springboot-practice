package com.example.SpringDemoApplication.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Emplye {
	
	@Autowired
	User user;
	
	public Emplye() {
		System.out.println("Emplye initialized");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Employee Hash Code: " + this.hashCode());
	}

}
