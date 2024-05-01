package com.jenkinspoc;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPocApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsPocApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application started successfully.....#####");
	}

	public static void main(String[] args) {
		logger.info("Application executed.....");
		SpringApplication.run(JenkinsPocApplication.class, args);
	}

}
