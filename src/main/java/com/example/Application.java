package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hello World Program");
		
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}

}
