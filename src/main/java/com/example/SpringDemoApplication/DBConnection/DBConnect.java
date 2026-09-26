package com.example.SpringDemoApplication.DBConnection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DBConnect {
	@Value("${db.username}")
	String username;
	
	@Value("${db.password}")
	String password;
	
	@PostConstruct
	public void init() {
		System.out.println("DBConnect Init");
		System.out.println("username: " +username + " | password: " + password);
		
		
	}

}
