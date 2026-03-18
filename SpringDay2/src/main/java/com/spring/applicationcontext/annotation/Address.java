package com.spring.applicationcontext.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Address {

	@Value("nagpur")
	private String City;
	@Value("India")
	private String Country;
	@Value("MH")
	private String State;
	
	public Address() {
		
	}

	public Address(String city, String country, String state) {
		super();
		City = city;
		Country = country;
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [City=" + City + ", Country=" + Country + ", State=" + State + "]";
	}
	
	
	
	
}
