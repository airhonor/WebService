package com.honorzhang.web.service.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author honorzhang
 */
@SpringBootApplication
@EnableScheduling
public class WebServiceExample {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceExample.class, args);
    }

}
