package com.stasore.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class IntmallRibboApplication {

    /*将RestTemplate注入到spring容器中
    LoadBalanced负载均衡默认为轮询
    通过注入在controller中就可以使用调用生产者实例*/
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(IntmallRibboApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @GetMapping("ad")
    public String ad(){
        return "post port is "+port;
    }

}
