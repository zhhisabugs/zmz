package com.tiger.zmz.demo.storage;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
