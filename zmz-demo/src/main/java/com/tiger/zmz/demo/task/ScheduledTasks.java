package com.tiger.zmz.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Slf4j
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 30000)
    public void reportCurrentTime() {
        log.info("-----现在时间是：{}", dateFormat.format(new Date()));
    }
}
