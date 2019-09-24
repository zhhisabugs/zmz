package com.tiger.zmz.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhanghai2
 * @description 账户
 * @since 2019-9-21
 */
@Data
public class Account implements Serializable {
    private int id;
    private String name;
    private double money;
}
