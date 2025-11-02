package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;





@SpringBootTest
public class JenkinsProjectApplicationTests {

 public static Logger logger = LoggerFactory.getLogger(JenkinsProjectApplicationTests.class);
	
	@Test
	public void contextLoads() {
		
		//logger1.log(Level.INFO, "Application Execution from main Method ");
		
		logger.info("Application Execution from Testing Junit");
		
		assertEquals(true, true);
	}

}
