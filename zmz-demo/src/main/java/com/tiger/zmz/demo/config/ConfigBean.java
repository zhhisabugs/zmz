package com.tiger.zmz.demo.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * @author zhanghai2
 * @description 配置Bean
 * @since 2019-9-21
 */
@Configuration
@PropertySource("classpath:config/my.properties")
@ConfigurationProperties(prefix = "my")
@Getter
@Setter
@ToString
public class ConfigBean {
    private String name;
    private String target;
    private int number;
    private String uuid;
    private String greeting;
}
