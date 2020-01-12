package com.javatechie.jenkin.api;


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;



@SRunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsDemoApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("Test Case Executing...");
		assertEquals(true, true);
	}

}