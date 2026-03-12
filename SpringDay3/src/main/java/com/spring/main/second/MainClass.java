package com.spring.main.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.first.Config;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		
	}

}
