/**
 * FileName: UserInfo
 * Author:   xiangjunzhong
 * Date:     2018/3/2 10:56
 * Description:
 */
package com.github.wxiaoqi.learning.auth.bean;

import com.github.wxiaoqi.learning.common.util.jwt.IJWTInfo;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/2 10:56
 * @since 1.0.0
 */
public class UserInfo implements IJWTInfo {

    private String username;
    private String name;
    private String userId;
    private String password;

    public UserInfo() {
    }

    public UserInfo(String username, String name, String userId, String password) {
        this.username = username;
        this.name = name;
        this.userId = userId;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户名
     *
     * @return
     */
    @Override
    public String getUniqueName() {
        return username;
    }

    /**
     * 获取用户ID
     *
     * @return
     */
    @Override
    public String getUserId() {
        return userId;
    }

    /**
     * 获取名称
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }
}