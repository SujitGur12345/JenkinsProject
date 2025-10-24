package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.System.Logger;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


import java.lang.System.Logger.Level;

@SpringBootTest
public class JenkinsProjectApplicationTests {

	public static Logger logger1 =   (Logger) LoggerFactory.getLogger(JenkinsProjectApplicationTests.class);
	
	@Test
	public void contextLoads() {
		
		logger1.log(Level.INFO, "Application Execution from main Method ");
		
		assertEquals(true, true);
	}

}
