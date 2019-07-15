package com.tiger.zmz.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghai2
 * @Description: 简单的例子
 * @date 2019-7-15
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello World!";
  }
}
