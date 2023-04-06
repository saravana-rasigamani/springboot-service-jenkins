package com.practice.springbootservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("---- SpringBootJenkinsApplication started ----");
	}
}
