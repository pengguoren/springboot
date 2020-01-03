package com.cq.springboot.config;

import com.cq.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 彭国仁
 * @data 2020/1/3 21:35
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloservice() {
        return new HelloService();
    }
}
