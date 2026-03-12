package com.spring.config.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.annotation.first.Student;



@Configuration
public class Config {

	@Bean
	public Student objEmp() {
		return new Student();
	}
}
