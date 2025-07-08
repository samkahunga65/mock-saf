package com.lanstar.safaricom_bulksms_mocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class SafaricomBulksmsMockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafaricomBulksmsMockerApplication.class, args);
		Logger logger = LoggerFactory.getLogger(SafaricomBulksmsMockerApplication.class);
		logger.info("Started at "+ LocalDateTime.now());
	}

}
