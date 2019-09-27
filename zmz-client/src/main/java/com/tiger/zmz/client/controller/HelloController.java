package com.tiger.zmz.client.controller;

import com.tiger.zmz.client.service.HelloService;
import com.tiger.zmz.client.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghai2
 * @date 2019-9-26
 */
@RefreshScope
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @Autowired
    HiService hiService;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return helloService.hello(name);
    }

    @RequestMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHie(name);
    }

    @Value("${version}")
    String version;

    @GetMapping("/version")
    public String getVersion() {
        return "config version is:" + version;
    }
}
