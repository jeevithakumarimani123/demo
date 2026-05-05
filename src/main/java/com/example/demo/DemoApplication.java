package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
	
	public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Demo Application started.slightly changes to check 99999");
	}

	public static void main(String[] args) {
		
		logger.info("Demo Application main method");
		SpringApplication.run(DemoApplication.class, args);
	}
	
}
