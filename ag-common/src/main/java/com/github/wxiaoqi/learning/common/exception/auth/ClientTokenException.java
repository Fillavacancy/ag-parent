/**
 * FileName: ClientTokenException
 * Author:   xiangjunzhong
 * Date:     2018/3/1 14:19
 * Description:
 */
package com.github.wxiaoqi.learning.common.exception.auth;

import com.github.wxiaoqi.learning.common.constant.CommonConstants;
import com.github.wxiaoqi.learning.common.exception.BaseException;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/1 14:19
 * @since 1.0.0
 */
public class ClientTokenException extends BaseException {

    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}