package com.jeni.elastic.springelastic;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication

public class SpringBootElasticApplication {

	public static Logger log= (Logger) LoggerFactory.getLogger(SpringBootElasticApplication.class);
	@PostConstruct
	public  void init()
	{
		log.info("Application started");
	}
	public String deploy()
	{
		return "Aplication deployed";
	}

	public static void main(String[] args) {
		log.info("Application executed");
		SpringApplication.run(SpringBootElasticApplication.class, args);
	}



}
