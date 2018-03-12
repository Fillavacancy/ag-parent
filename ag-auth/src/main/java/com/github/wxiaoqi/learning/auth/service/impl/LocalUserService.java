/**
 * FileName: LocalUserService
 * Author:   xiangjunzhong
 * Date:     2018/3/2 10:52
 * Description:
 */
package com.github.wxiaoqi.learning.auth.service.impl;

import com.github.wxiaoqi.learning.auth.bean.UserInfo;
import com.github.wxiaoqi.learning.auth.service.UserService;
import com.github.wxiaoqi.learning.common.exception.auth.UserTokenException;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 10:52
 * @since 1.0.0
 */
@Service
public class LocalUserService implements UserService {

    @Override
    public UserInfo login(String username, String password) {
        // 此处可以变成从 user-center 获取
        UserInfo localUserInfo = new UserInfo("admin", "管理员", "1", "123456");
        if (!localUserInfo.getPassword().equals(password)) {
            throw new UserTokenException("User Password Error!");
        }
        return localUserInfo;
    }
}