package com.example.SpringDemoApplication.ecom.service;

import org.springframework.stereotype.Service;

@Service
public class GpayService implements PaymentService {
	@Override
	public void processPayment(double amount) {
		System.out.println("Gpay Payment Processing");
		
	}

}
