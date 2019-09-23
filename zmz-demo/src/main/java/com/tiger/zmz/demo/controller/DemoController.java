package com.tiger.zmz.demo.controller;

import com.tiger.zmz.demo.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author zhanghai2
 * @description hello
 * @since 2019-9-21
 */
@RestController
@EnableConfigurationProperties(ConfigBean.class)
public class DemoController {

    @ApiIgnore
    @RequestMapping("/")
    public String index() {
        return "hello";
    }

    @Value("${my.name}")
    private String name;

    @Value("${my.target}")
    private String target;

    @RequestMapping(value = "/getTarget")
    public String getMyTarget() {
        return name + "'s target is" + target;
    }

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/myInfo")
    public String myInfo() {
        return configBean.getGreeting() + "," + configBean.getUuid() + "," + configBean.getNumber();
    }
}
