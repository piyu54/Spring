package com.spring.annotation.first;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("123")
	private int stdId;
	@Value("piyali")
	private String stdName;
	@Value("nagpur")
	private String stdCity;
	
	
	public Student() {
		
	}


	public Student(int stdId, String stdName, String stdCity) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCity = stdCity;
	}


	public int getStdId() {
		return stdId;
	}


	public void setStdId(int stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getStdCity() {
		return stdCity;
	}


	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}


	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCity=" + stdCity + "]";
	}
	
}
