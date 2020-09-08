package com.honorzhang.web.service.client;

import com.honorzhang.web.service.client.service.WsAuthorClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * @program: ws
 * @author: zgr
 * @create: 2020-09-08 13:13
 **/
@Configuration
public class WSConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.honorzhang.web.service.example.client");
        return marshaller;
    }

    @Bean
    public WsAuthorClient wsClient(Jaxb2Marshaller marshaller) {
        WsAuthorClient client = new WsAuthorClient();
        //默认对应的ws服务地址 client请求中还能动态修改的
        client.setDefaultUri("http://127.0.0.1:8090/ws");
        client.setMarshaller(marshaller);//指定转换类
        client.setUnmarshaller(marshaller);
        return client;
    }
}
