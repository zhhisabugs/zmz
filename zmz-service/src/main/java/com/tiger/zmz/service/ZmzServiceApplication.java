package com.tiger.zmz.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class ZmzServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZmzServiceApplication.class, args);
  }

}
