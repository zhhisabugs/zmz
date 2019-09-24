package com.tiger.zmz.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {
    private long id;
    private String content;
}
