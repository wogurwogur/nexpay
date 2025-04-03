package com.project.nexpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class NexpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexpayApplication.class, args);
		
	}
}
