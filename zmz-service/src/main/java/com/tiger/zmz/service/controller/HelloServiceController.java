package com.tiger.zmz.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghai2
 * @date 2019-9-26
 */
@Slf4j
@RestController
public class HelloServiceController {

    @Value("${spring.application.name}")
    String serviceName;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        log.info("hello is being called");
        return "hi," + name + ", i'm " + serviceName + ":" + port;
    }
}
