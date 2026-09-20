package com.example.SpringDemoApplication.ecom.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.EcomAssistantService.DeprecatedUtilityService;

/* another way to use @ComponentScan along with @Configuration 
 * instead of defining it in main SpringBootClass
 */
@Configuration
@ComponentScan(basePackages="com.EcomAssistantService",
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes= {DeprecatedUtilityService.class})
)
public class EcomConfig {

}
