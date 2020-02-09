package com.chaabane.project.bourseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope // curl -H "Content-Type: application/json" -d {} http://localhost:9090/actuator/refresh
@RestController
@RequestMapping("/home")
public class ControllerTestGlobalRessource {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Value("${global}")
    public String global;
    //same goes for self properties file

    @GetMapping("/global")
    public String executeGlobal() {
        logger.info("BOOM!");
        return global;
    }
}
