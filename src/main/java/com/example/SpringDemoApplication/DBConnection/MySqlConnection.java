package com.example.SpringDemoApplication.DBConnection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
/* ConditionalOnProperty -- beans is created conditionally
 * prefix + value will create key for which it will try to find configuration in application.properties with value mentioned in havingValue
 * for ex mysqlconnection.enabled=true if havingValue is same which is mentioned here then create a bean
 * if configuration is missing matchIfMissing acts as fall back mechanism if it is true inject the beans else dont
 */
@ConditionalOnProperty(
		prefix = "mysqlconnection",
		value = "enabled",
		havingValue = "true",
		matchIfMissing = false)

public class MySqlConnection {
	public MySqlConnection() {
		System.out.println("MySqlConnection Init");
	}

}
