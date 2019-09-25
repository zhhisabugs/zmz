package com.tiger.zmz.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZmzEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmzEurekaApplication.class, args);
    }

}
