/**
 * FileName: BaseUserBiz
 * Author:   xiangjunzhong
 * Date:     2018/3/1 10:49
 * Description:
 */
package com.github.wxiaoqi.learning.uc.biz;

import com.github.wxiaoqi.learning.common.biz.BaseBiz;
import com.github.wxiaoqi.learning.uc.entity.BaseUser;
import com.github.wxiaoqi.learning.uc.mapper.BaseUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/1 10:49
 * @since 1.0.0
 */
@Service
@Transactional
public class BaseUserBiz extends BaseBiz<BaseUserMapper, BaseUser> {

}