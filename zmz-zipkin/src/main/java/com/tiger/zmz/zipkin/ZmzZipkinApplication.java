package com.tiger.zmz.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class ZmzZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZmzZipkinApplication.class, args);
    }

}
