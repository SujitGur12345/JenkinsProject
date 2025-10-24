package com.example.demo;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static Logger logger =   (Logger) LoggerFactory.getLogger(JenkinsProjectApplication.class);
			
	public void init() {
		
		logger.log(Level.INFO, "Application Execution from logger ");
	}
	
	@PostConstruct
	public static void main(String[] args) {
		
		logger.log(Level.INFO, "Application Execution from main Method ");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
