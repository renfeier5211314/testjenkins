package com.example.modeleurekaclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ModelEurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(ModelEurekaClient2Application.class, args);
    }


    @Value("${server.port}")
    String port;



    @RequestMapping("/test")
    public String test() {
        return "model-eureka-client2 ";
    }
}
