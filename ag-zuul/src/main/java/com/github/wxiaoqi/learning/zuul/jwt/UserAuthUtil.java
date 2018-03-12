package com.github.wxiaoqi.learning.zuul.jwt;

import com.github.wxiaoqi.learning.common.exception.auth.UserTokenException;
import com.github.wxiaoqi.learning.common.util.jwt.IJWTInfo;
import com.github.wxiaoqi.learning.common.util.jwt.JWTHelper;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ace on 2017/9/10.
 */
@Component
public class UserAuthUtil {

    @Value("${auth.user.pub-key.path}")
    private String pubKeyPath;

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        try {
            return JWTHelper.getInfoFromToken(token, pubKeyPath);
        } catch (ExpiredJwtException ex) {
            throw new UserTokenException("User token expired!");
        } catch (SignatureException ex) {
            throw new UserTokenException("User token signature error!");
        } catch (IllegalArgumentException ex) {
            throw new UserTokenException("User token is null or empty!");
        }
    }
}
