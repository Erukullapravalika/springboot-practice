package com.example.SpringDemoApplication.Entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class User {
	public User() {
		System.out.println("User initialized");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("user obj hashcode: " +this.hashCode());
		
	}

}
