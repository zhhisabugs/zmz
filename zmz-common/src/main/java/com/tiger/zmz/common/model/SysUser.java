package com.tiger.zmz.common.model;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author zhanghai2
 * @Description: 用户类
 * @date 2019-7-15
 */
@Getter
@Setter
public class SysUser {
  private Long id;
  private String account;
  private String password;
  private String name;
  private String telephone;
  private String idCard;
  private String email;
  private Integer status;
  private LocalDateTime createTime;
  private LocalDateTime modifyTime;

  @Override
  public String toString() {
    return JSONObject.toJSONString(this);
  }
}
