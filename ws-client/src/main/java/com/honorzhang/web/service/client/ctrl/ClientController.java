package com.honorzhang.web.service.client.ctrl;

import com.honorzhang.web.service.client.service.ClientService;
import com.honorzhang.web.service.client.ws.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: webservice-example
 * @author: zgr
 * @create: 2020-09-16 16:30
 **/
@RestController
@RequestMapping("/ws/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping()
    public ResponseEntity<People> insertPeople(@RequestBody People people) {
        people.setCreateTime(System.currentTimeMillis());
        people.setUpdateTime(System.currentTimeMillis());
        return ResponseEntity.ok().body(clientService.insertPeople(people));
    }
}
