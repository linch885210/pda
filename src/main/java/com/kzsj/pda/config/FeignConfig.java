package com.kzsj.pda.config;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fcl
 * @version v1.0.0
 * @date 2019/11/1
 * @Description
 */
@Configuration
public class FeignConfig {

    //超时时间
    public static int connectTimeOutMillis = 200000;
    public static int readTimeOutMillis = 120000;
    @Bean
    public Request.Options options() {
        return new Request.Options(connectTimeOutMillis, readTimeOutMillis);
    }

    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, 1000, 4);

    }
}
