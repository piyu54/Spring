package com.spring.annotation.second;

import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCard implements Payment{

	@Override
	public String Pay() {
		return "Payment done using Credit Card";
		
	}

	
}
