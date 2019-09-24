package com.tiger.zmz.demo.service;

import com.tiger.zmz.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Service
@Slf4j
public class GithubLookupService {

    private final RestTemplate restTemplate;

    public GithubLookupService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Async
    public Future<User> findUser(String user) throws InterruptedException {
        log.info("looking up:" + user);
        String url = String.format("https://api.github.com/users/%s", user);
        User results = restTemplate.getForObject(url, User.class);
        Thread.sleep(1000L);
        return new AsyncResult<>(results);
    }
}
