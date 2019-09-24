package com.tiger.zmz.demo.storage;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Getter
@Setter
@ConfigurationProperties("storage")
public class StorageProperties {
    private String location = "upload-dir";
}
