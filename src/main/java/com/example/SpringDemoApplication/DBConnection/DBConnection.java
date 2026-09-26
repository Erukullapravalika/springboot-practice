package com.example.SpringDemoApplication.DBConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DBConnection {
	@Autowired(required=false)
	MySqlConnection Mysqlconnection;
	
	// if havingValue is not same in the application.properties use required = false to avoid bean injection if not application will fail to start
	@Autowired(required = false)
	NoSqlConnection Nosqlconnection;
	
	@PostConstruct
	public void init(){
		System.out.println("DB Connection Init");
		System.out.println("MySqlConnection: " +Mysqlconnection);
		System.out.println("NoSqlConnection: " +Nosqlconnection);
	}
	
	

}
