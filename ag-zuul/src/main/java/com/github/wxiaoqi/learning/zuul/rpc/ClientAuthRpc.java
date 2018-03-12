package com.github.wxiaoqi.learning.zuul.rpc;

import com.github.wxiaoqi.learning.common.vo.ObjectRestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ace on 2017/9/12.
 */
@FeignClient("ag-auth")
public interface ClientAuthRpc {

    @RequestMapping(value = "/client/token", method = RequestMethod.POST)
    public ObjectRestResponse<String> getAccessToken(@RequestParam("clientId") String clientId, @RequestParam("secret") String secret);
}