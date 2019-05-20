package com.example.modeleurekaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ModelEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(ModelEurekaClient2Application.class, args);
    }


}
