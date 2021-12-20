package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookMainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMainServiceApplication.class, args);
	}

	
	@Bean
	public RestTemplate restTepmlate() {
		return new RestTemplate();
	}
}
