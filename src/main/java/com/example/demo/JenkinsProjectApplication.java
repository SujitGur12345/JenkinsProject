package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsProjectApplication.class);
  	
	public static void main(String[] args) {
		
		logger.info("Application Execution from main Method");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}
	
	@PostConstruct		
	public void init() {
		
		logger.info("Application Execution from logger");
	}

}
