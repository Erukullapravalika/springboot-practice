package com.example.SpringDemoApplication.ecom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SpringDemoApplication.ecom.service.CreditCardService;
import com.example.SpringDemoApplication.ecom.service.GpayService;
import com.example.SpringDemoApplication.ecom.service.PaymentService;

@Configuration
public class PaymentConfig {
	
	@Bean
	public PaymentService credictCardPaymentService() {
		return new CreditCardService();
	}
	
	@Bean
	public PaymentService gPayPaymentService() {
		return new GpayService();
	}

}
