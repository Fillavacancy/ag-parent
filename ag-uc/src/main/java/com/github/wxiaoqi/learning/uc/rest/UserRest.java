/**
 * FileName: UserRest
 * Author:   xiangjunzhong
 * Date:     2018/2/28 16:49
 * Description:
 */
package com.github.wxiaoqi.learning.uc.rest;

import com.github.wxiaoqi.learning.common.context.BaseContextHandler;
import com.github.wxiaoqi.learning.common.rest.BaseController;
import com.github.wxiaoqi.learning.uc.biz.BaseUserBiz;
import com.github.wxiaoqi.learning.uc.entity.BaseUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/2/28 16:49
 * @since 1.0.0
 */
@RestController
@RequestMapping("user")
public class UserRest extends BaseController<BaseUserBiz, BaseUser> {

    @RequestMapping("/who")
    public String getCurrentUser() {
        return BaseContextHandler.getUsername();
    }
}