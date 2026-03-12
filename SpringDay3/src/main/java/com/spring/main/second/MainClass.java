package com.spring.main.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.annotation.second.Person;

import com.spring.config.second.Config1;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Config1.class);
		Person p=context.getBean(Person.class);
		
		System.out.println(p.getOne().Pay());
		System.out.println(p.getTwo().Pay());
	}

}
