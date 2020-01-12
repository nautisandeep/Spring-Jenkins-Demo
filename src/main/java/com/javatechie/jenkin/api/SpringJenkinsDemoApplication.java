package com.javatechie.jenkin.api;

import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Applciation Started...");
	}

	public void void main(String[] args) {
		logger.info("Applciation Executed...");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args)
	}

}