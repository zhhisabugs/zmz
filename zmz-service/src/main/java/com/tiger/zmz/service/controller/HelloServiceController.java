package com.tiger.zmz.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghai2
 * @date 2019-9-26
 */
@RestController
public class HelloServiceController {

    @Value("${spring.application.name}")
    String serviceName;

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        return "hi," + name + ", i'm " + serviceName + ":" + port;
    }
}
