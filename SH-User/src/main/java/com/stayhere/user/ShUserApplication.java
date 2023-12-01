package com.stayhere.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShUserApplication.class, args);
	}

}
