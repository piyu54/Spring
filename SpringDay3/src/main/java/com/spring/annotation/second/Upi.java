package com.spring.annotation.second;

import org.springframework.stereotype.Component;

@Component("upi")
public class Upi implements Payment{

	@Override
	public String Pay() {
		return "Payment done using upi ";
		
	}
}
