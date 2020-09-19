package com.honorzhang.web.service.server.service;

import com.honorzhang.web.service.server.model.People;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 15:49
 **/
@WebService(targetNamespace = "http://service.people.com/wsdl")
public interface PeopleService {

    /**
     * 添加人员
     *
     * @param people 人员
     * @return 添加后的人员
     */
    @WebMethod
    People insertPeople(People people);
}
