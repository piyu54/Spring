package com.spring.main.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotation.first.Student;
import com.spring.config.first.Config;

public class MainClass {
	public static void main(String[] args) {

		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student e=context.getBean(Student.class);
		System.out.println(e);
	}
}
