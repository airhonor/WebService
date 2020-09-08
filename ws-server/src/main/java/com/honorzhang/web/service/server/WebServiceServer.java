package com.honorzhang.web.service.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author honorzhang
 */
@SpringBootApplication
@EnableScheduling
public class WebServiceServer {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceServer.class, args);
    }

}
