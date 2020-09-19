package com.honorzhang.web.service.server;

import com.honorzhang.web.service.server.service.impl.PeopleServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

/**
 * @author honorzhang
 */
@SpringBootApplication
public class WebServiceServer {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceServer.class, args);
        System.out.println("启动并发布webservice远程服务");
        Endpoint.publish("http://127.0.0.1:8099/PeopleServiceImpl/dao?wsdl", new PeopleServiceImpl());
        System.out.println("启动并发布webservice远程服务，服务发布成功....");

    }

}
