package com.chaabane.project.bourseService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BourseServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(BourseServiceApplication.class, args);

	}
}
