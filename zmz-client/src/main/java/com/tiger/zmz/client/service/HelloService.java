package com.tiger.zmz.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhanghai2
 * @date 2019-9-26
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hello(String name) {
        return restTemplate.getForObject("http://zmz-service/hello?name=" + name, String.class);
    }

}
