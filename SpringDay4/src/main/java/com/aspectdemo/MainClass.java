package com.aspectdemo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {
	public static void main(String[] args) {

		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Recharge e=context.getBean(Recharge.class);
		e.myRecharge();
	}
}
