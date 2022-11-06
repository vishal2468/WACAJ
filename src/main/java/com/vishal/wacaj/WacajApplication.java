package com.vishal.wacaj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class WacajApplication {

	public static void main(String[] args) {
		SpringApplication.run(WacajApplication.class, args);
	}
}
