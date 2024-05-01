package com.jenkinspoc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsPocApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(JenkinsPocApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing......");
		logger.info("Test case executing second changes......");
		assertEquals(true, true);
	}

}
