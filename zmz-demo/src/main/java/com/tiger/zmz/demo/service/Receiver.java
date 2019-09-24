package com.tiger.zmz.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Slf4j
public class Receiver {
    private CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        log.info("Received message:<" + message + ">");
        latch.countDown();
    }
}
