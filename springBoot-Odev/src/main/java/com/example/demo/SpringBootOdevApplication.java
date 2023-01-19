package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringBootOdevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOdevApplication.class, args);
	System.out.println("Application");
	/*
	char a= 'a';
	char b= 'z';
	for(int i=0 ; i<10;i++) {
		System.out.println((char)('a'+Math.random()*(b-a+1)));
	}
	*/
	/*
	String string = "";
	string += (char)('1');
	string += (char)('2');
	System.out.println(string);
	*/
	}

}
