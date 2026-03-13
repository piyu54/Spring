package com.aspectdemo;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@ComponentScan("com.aspectdemo")
@EnableAspectJAutoProxy
public class Config {

}
