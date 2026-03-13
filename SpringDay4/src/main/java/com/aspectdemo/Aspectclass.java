package com.aspectdemo;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspectclass {

	@Before("execution(* com.aspectdemo.*.*(..))")
	public void before()
	{
		System.out.println("recharge expiring soon");
	}
	
//	@After("execution(* com.aspectdemo.*.*(..))")
//	public void after()
//	{
//		System.out.println("Successfully recharge ");
//	}
}
