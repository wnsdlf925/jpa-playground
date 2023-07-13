package com.example.jpaplayground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class JpaPlaygroundApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpaPlaygroundApplication.class, args);
	}

}
