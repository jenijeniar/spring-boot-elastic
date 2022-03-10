package com.jeni.elastic.springelastic;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringBootElasticApplicationTests {
	public static Logger log= (Logger) LoggerFactory.getLogger(SpringBootElasticApplication.class);

	@Test
	void contextLoads() {
		assertEquals(true,true);
		log.info("Application executed");
	}

}
