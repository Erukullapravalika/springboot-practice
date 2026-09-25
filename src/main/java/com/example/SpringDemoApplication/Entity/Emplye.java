package com.example.SpringDemoApplication.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope("prototype")
/* if Emplye is singleton which is injecting User but User is request
 * it leads to unsatisfied dependency issue:scope request is not active for current thread
 * so when trying to inject request bean inside singleton bean leads to issue
 * because request bean cannot be added insided singleton bean unless we have ongoing fetch api or any other api running
 * proxyMode -- creates a proxy and injects the user here
 */
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
