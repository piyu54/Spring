package com.spring.applicationcontext.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdMain {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Student s=context.getBean("std",Student.class);
		System.out.println(s);
	}
}
