/**
 * FileName: JWTRest
 * Author:   xiangjunzhong
 * Date:     2018/3/2 10:48
 * Description:
 */
package com.github.wxiaoqi.learning.auth.rest;

import com.github.wxiaoqi.learning.auth.bean.UserInfo;
import com.github.wxiaoqi.learning.auth.service.UserService;
import com.github.wxiaoqi.learning.auth.utils.JWTTokenUtil;
import com.github.wxiaoqi.learning.common.vo.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 10:48
 * @since 1.0.0
 */
@RestController
@RequestMapping("jwt")
public class JWTRest {

    @Autowired
    private JWTTokenUtil jwtTokenUtil;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ObjectRestResponse authorize(String username, String password) throws Exception {
        UserInfo userInfo = userService.login(username, password);
        return new ObjectRestResponse<String>().data(jwtTokenUtil.generateToken(userInfo));
    }
}