package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.app") // Add this line
public class SchoolManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}

}
