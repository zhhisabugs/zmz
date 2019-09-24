package com.tiger.zmz.demo.storage;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
public class StorageFileNotFoundException extends StorageException {
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
