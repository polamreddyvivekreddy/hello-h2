package org.hellotech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandLineApp.class);


    public static void main(String[] args) {

        SpringApplication.run(CommandLineApp.class);
        LOGGER.info("hello after spring run");


    }
}
