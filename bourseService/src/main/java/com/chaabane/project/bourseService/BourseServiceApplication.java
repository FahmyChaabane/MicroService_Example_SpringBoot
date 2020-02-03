package com.chaabane.project.bourseService;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class BourseServiceApplication {

	public static void main(String[] args) {

		org.springframework.context.ApplicationContext ctx = SpringApplication.run(BourseServiceApplication.class, args);
		SocieteRepository societeRepository = ctx.getBean(SocieteRepository.class);
		Stream.of("A", "B", "C").forEach(s -> societeRepository.save(new Societe(s)));
		societeRepository.findAll().forEach(s -> System.out.println(s));

	}
}
