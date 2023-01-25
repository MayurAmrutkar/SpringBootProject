package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		System.out.println("Executing spring boot application");
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

}
