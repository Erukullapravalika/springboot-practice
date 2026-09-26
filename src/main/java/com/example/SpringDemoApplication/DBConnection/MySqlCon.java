package com.example.SpringDemoApplication.DBConnection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
/* @Profile tells spring boot to create a bean only when particular profile is set
 * for ex here profile is "dev" it will compare with active profile and it will be injected
 */
@Profile("dev")
public class MySqlCon {
	@Value("${db.username}")
	String username;
	
	@Value("${db.password}")
	String password;
	
	@PostConstruct
	public void init() {
		System.out.println("MySqlCon Init");
		System.out.println("username: " +username + " | password: " + password);
	}

}
