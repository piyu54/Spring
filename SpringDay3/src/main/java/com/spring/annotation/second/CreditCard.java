package com.spring.annotation.second;

public class CreditCard implements Payment{

	@Override
	public void Pay() {
		System.out.println("Payment done using Credit Card");
		
	}

	
}
