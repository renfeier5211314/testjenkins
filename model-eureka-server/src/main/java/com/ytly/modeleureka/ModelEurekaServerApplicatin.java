package com.ytly.modeleureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ModelEurekaServerApplicatin {

    public static void main(String[] args) {
        SpringApplication.run(ModelEurekaServerApplicatin.class, args);
    }

}
