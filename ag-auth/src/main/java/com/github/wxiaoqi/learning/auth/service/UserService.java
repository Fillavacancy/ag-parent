/**
 * FileName: UserService
 * Author:   xiangjunzhong
 * Date:     2018/3/2 10:51
 * Description:
 */
package com.github.wxiaoqi.learning.auth.service;

import com.github.wxiaoqi.learning.auth.bean.UserInfo;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 10:51
 * @since 1.0.0
 */
public interface UserService {

    UserInfo login(String username, String password);
}