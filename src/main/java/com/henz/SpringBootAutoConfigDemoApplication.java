package com.henz;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Simply put, the Spring Boot autoconfiguration represents a way to automatically configure a Spring application based on the dependencies that are present on the classpath.

This can make development faster and easier by eliminating the need for defining certain beans that are included in the auto-configuration classes.
 * 
 * */

/**
 * also activate debug logger to see full logs
 * 
 * in application.properties: logging.level.org.springframework: DEBUG
 * 
 * */


@SpringBootApplication
public class SpringBootAutoConfigDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootAutoConfigDemoApplication.class, args);
		
		//show all beans
		Arrays.asList(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
		//see spring-boot-autoconfigure jar
	}

}
