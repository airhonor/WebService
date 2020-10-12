package com.honorzhang.web.service.server.service.impl;

import com.honorzhang.web.service.server.mapper.PeopleMapper;
import com.honorzhang.web.service.server.model.People;
import com.honorzhang.web.service.server.service.PeopleService;
import com.honorzhang.web.service.server.utils.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 15:54
 **/
@WebService(endpointInterface = "com.honorzhang.web.service.server.service.PeopleService",
        targetNamespace = "http://service.people.com/wsdl", serviceName = "PeopleServiceImpl", portName = "dao")
@Slf4j
public class PeopleServiceImpl implements PeopleService {


    @Override
    public People insertPeople(People people) {
        PeopleMapper peopleMapper = SpringUtil.getBean(PeopleMapper.class);
        try {
            boolean flag = peopleMapper.insert(people) > 0;
            if (flag) {
                return peopleMapper.selectById(people.getId());
            } else {
                return new People();
            }
        } catch (Exception e) {
            log.error("添加人员出错", e);
            return new People();
        }
    }
}
