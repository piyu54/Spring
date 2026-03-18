package com.spring.applicationcontext.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;


@Component
public class Student {

	@Value("101")
	private int stdId;
	@Value("piyu")
	private String stdName;
	
	
	@Autowired
	Address Add;
	
	public Student() {
		
	}


	public Student(int stdId, String stdName,Address Add) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.Add=Add;
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


	
	

	public Address getAdd() {
		return Add;
	}


	public void setAdd(Address add) {
		Add = add;
	}


	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", Add=" + Add + "]";
	}

	
	
}
