package com.spring.applicationcontext.xml.part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
		Student s=context.getBean("std2",Student.class);
//		Address a=context.getBean("add",Address.class);
		System.out.println(s);
	}
}
