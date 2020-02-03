package com.chaabane.project.bourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.util.stream.Stream;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    SocieteRepository societeRepository;

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);


    @Override
    public void run(String... args) throws Exception {
        logger.info("~~~~ We Got Started !");
        Stream.of("A", "B", "C").forEach(s -> societeRepository.save(new Societe(s)));
        societeRepository.findAll().forEach(s -> System.out.println(s));

    }


}
