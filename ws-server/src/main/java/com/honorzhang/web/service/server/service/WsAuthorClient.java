package com.honorzhang.web.service.server.service;

import com.honorzhang.web.service.server.client.AuthorListRequest;
import com.honorzhang.web.service.server.client.AuthorListResponse;
import com.honorzhang.web.service.server.client.AuthorRequest;
import com.honorzhang.web.service.server.client.AuthorResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.UUID;

/**
 * @program: ws
 * @author: zgr
 * @create: 2020-09-08 13:32
 **/
@Service
public class WsAuthorClient extends WebServiceGatewaySupport {
    /**
     *  获取作者信息
     *  @author oKong
     */
    public AuthorResponse getAuthor(String name) {
        AuthorRequest req = new AuthorRequest();
        req.setName(name);
        //使用 marshalSendAndReceive 进行调用
        return (AuthorResponse) getWebServiceTemplate().marshalSendAndReceive(req);
    }

    /**
     *  获取作者列表信息
     *  @author oKong
     */
    public AuthorListResponse getAuthorList(){
        AuthorListRequest request = new AuthorListRequest();
        request.setNonce(UUID.randomUUID().toString());
        return (AuthorListResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
