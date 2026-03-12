package com.spring.annotation.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	
	@Autowired
	@Qualifier("credit")
	Payment one;
	
	@Autowired
	@Qualifier("upi")
	Payment two;

	public Payment getOne() {
		return one;
	}

	public void setOne(Payment one) {
		this.one = one;
	}

	public Payment getTwo() {
		return two;
	}

	public void setTwo(Payment two) {
		this.two = two;
	}

	@Override
	public String toString() {
		return "Person [one=" + one + ", two=" + two + "]";
	}
	
	
	
}
