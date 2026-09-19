package com.example.SpringDemoApplication.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class User {
	
	/*As there is two beans like OfflineOrder and OnlineOrder of OrderType
	 * it leads to unsatisfied dependency issue
	 * to resolve it use @Primary or @Qualifier
	 */
	Order order; 
	
	
	@Autowired
	public User(@Qualifier("onlineOrder") Order order) {
		this.order = order;
		System.out.println("Intialized user");
	} 
	
	

}
