/**
 * FileName: WebConfig
 * Author:   xiangjunzhong
 * Date:     2018/3/1 14:40
 * Description:
 */
package com.github.wxiaoqi.learning.uc.config;

import com.github.wxiaoqi.learning.common.handler.GlobalExceptionHandler;
import com.github.wxiaoqi.learning.uc.interceptor.ClientInterceptor;
import com.github.wxiaoqi.learning.uc.interceptor.ClientTokenInterceptor;
import com.github.wxiaoqi.learning.uc.interceptor.JWTInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author xiangjunzhong
 * @create 2018/3/1 14:40
 * @since 1.0.0
 */
@Configuration
public class UserCenterConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getClientInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(getJWTInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Bean
    ClientInterceptor getClientInterceptor() {
        return new ClientInterceptor();
    }

    @Bean
    JWTInterceptor getJWTInterceptor() {
        return new JWTInterceptor();
    }

    @Bean
    ClientTokenInterceptor getClientTokenInterceptor() {
        return new ClientTokenInterceptor();
    }
}