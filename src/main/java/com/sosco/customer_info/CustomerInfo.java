package com.sosco.customer_info;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerInfo {
	
	private static final Logger log = LogManager.getLogger(CustomerInfo.class);

	public static void main(String[] args) {
		SpringApplication.run(CustomerInfo.class, args);
		log.info("debugging ... ");
	}
}
