package com.tiger.zmz.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tiger.zmz.dao.mapper")
@SpringBootApplication
public class ZmzDaoApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZmzDaoApplication.class, args);
  }

}
