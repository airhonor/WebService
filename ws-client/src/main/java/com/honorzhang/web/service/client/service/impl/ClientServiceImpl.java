package com.honorzhang.web.service.client.service.impl;

import com.honorzhang.web.service.client.service.ClientService;
import com.honorzhang.web.service.client.ws.People;
import com.honorzhang.web.service.client.ws.PeopleService;
import com.honorzhang.web.service.client.ws.PeopleServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 16:24
 **/
@Service
public class ClientServiceImpl implements ClientService {

    private PeopleService wsClient;

    @PostConstruct
    public void init() {
        PeopleServiceImpl peopleService = new PeopleServiceImpl();
        wsClient = peopleService.getDao();
    }

    @Override
    public People insertPeople(People people) {
        return wsClient.insertPeople(people);
    }
}
