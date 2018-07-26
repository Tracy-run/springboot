package com.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringApplication {

	@RequestMapping("/")
	public String greeting(){
		return "Hello World!";
	}
	
	
	public static void main(String[] args) {
		org.springframework.boot.SpringApplication.run(SpringApplication.class,args);
	}
}
