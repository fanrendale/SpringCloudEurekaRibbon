package com.xjf.eurekaribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 启用Eureka服务发现，相关配置
 * @author Administrator
 */
//启用Hystrix熔断机制相关配置
@EnableHystrix
//启用Eureka服务发现相关配置
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonApplication.class, args);
    }

}
