package com.tiger.zmz.common.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhanghai2
 * @Description: 用户类
 * @date 2019-7-15
 */
@Getter
@Setter
public class User {
  private Integer id;
  private String name;
  private Integer age;
  private Integer sex;
  private String phone;

  public User() {
  }

  public User(String name, Integer age, Integer sex, String phone) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.phone = phone;
  }

  @Override
  public String toString() {
    return JSONObject.toJSONString(this);
  }
}
