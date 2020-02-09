package com.example.project.dicoveryEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DicoveryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DicoveryEurekaApplication.class, args);
	}

}
