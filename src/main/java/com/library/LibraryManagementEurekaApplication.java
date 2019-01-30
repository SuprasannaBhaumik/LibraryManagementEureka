package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer 
public class LibraryManagementEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementEurekaApplication.class, args);
	}

}

