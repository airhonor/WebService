package com.honorzhang.web.service.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author honorzhang
 */
@SpringBootApplication
@EnableScheduling
public class WebServiceClient {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceClient.class, args);
    }

}
