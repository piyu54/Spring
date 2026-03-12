package com.spring.annotation.second;

public class Upi implements Payment{

	@Override
	public void Pay() {
		System.out.println("Payment done using upi ");
		
	}
}
