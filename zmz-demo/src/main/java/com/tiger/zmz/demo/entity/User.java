package com.tiger.zmz.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class User {

    private String name;

    private String blog;
}
