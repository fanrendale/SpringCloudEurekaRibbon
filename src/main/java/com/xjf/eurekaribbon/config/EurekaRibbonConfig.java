package com.xjf.eurekaribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 应用配置类，初始化Bean和配置信息
 * @author xjf
 * @date 2019/3/28 16:52
 */
@Configuration
public class EurekaRibbonConfig {

    //初始化Bean
    @Bean
    //实现负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
