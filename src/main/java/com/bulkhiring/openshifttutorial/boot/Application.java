package com.bulkhiring.openshifttutorial.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan("com.bulkhiring.openshifttutorial")
@EnableMongoRepositories(basePackages = "com.bulkhiring.openshifttutorial.repository")
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
