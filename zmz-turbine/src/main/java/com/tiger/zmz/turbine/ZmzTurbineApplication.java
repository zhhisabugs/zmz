package com.tiger.zmz.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine
@EnableEurekaClient
@SpringBootApplication
public class ZmzTurbineApplication {

    public static void main(String[] args) {
        // new SpringApplicationBuilder(ZmzTurbineApplication.class).web(true).run(args);
        SpringApplication.run(ZmzTurbineApplication.class, args);
    }

}
