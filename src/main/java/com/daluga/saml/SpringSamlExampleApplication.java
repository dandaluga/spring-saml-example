package com.daluga.saml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSamlExampleApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringSamlExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringSamlExampleApplication.class, args);
        LOGGER.debug("The SpringSamlExampleApplication has started!");
        LOGGER.debug("The SpringSamlExampleApplication has ended!");
	}
}
