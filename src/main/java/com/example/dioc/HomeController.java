package com.example.dioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/home")
    public String hello(){
        logger.error("FATAL error");
        logger.warn("FATAL warn");
        logger.info("FATAL info");
        logger.debug("FATAL debug");
        logger.trace("FATAL trace");
        return "Hello Sahil Code";
    }




}
