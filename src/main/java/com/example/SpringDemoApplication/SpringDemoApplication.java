package com.example.SpringDemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.EcomAssistantService.DeprecatedUtilityService;

@SpringBootApplication
// @ComponentScan scans the specified package and its subpackages
@ComponentScan(basePackages={"com.EcomAssistantService", "com.example.SpringDemoApplication"},
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {DeprecatedUtilityService.class}))
public class SpringDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		System.out.print("Context Created");
	}

}
