package com.tiger.zmz.client.controller;

import com.tiger.zmz.common.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghai2
 * @Description: 用户
 * @date 2019-7-15
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping("/get")
  public User getUser(@RequestParam("id") Integer id) {
    return null;
  }
}