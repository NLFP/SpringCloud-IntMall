package com.stasore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableEurekaClient
@EnableScheduling
@SpringBootApplication
public class IntmallSleuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntmallSleuthApplication.class, args);
    }

}
