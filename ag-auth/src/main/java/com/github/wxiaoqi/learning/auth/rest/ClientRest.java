package com.github.wxiaoqi.learning.auth.rest;

import com.github.wxiaoqi.learning.auth.bean.ClientInfo;
import com.github.wxiaoqi.learning.auth.service.ClientService;
import com.github.wxiaoqi.learning.auth.utils.ClientTokenUtil;
import com.github.wxiaoqi.learning.common.vo.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ace on 2017/9/10.
 */
@RestController
@RequestMapping("client")
public class ClientRest {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientTokenUtil clientTokenUtil;

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ObjectRestResponse<String> getAccessToken(String clientId, String secret) throws Exception {
        ClientInfo apply = clientService.apply(clientId, secret);
        return new ObjectRestResponse<String>().data(clientTokenUtil.generateToken(apply));
    }

    @RequestMapping(value = "/myClient")
    public ObjectRestResponse<List<String>> getAllowedClient(String serviceId, String secret) {
        return new ObjectRestResponse<List<String>>().data(clientService.getAllowedClient(serviceId, secret));
    }
}
