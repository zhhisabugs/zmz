package com.tiger.zmz.demo.init;

import com.tiger.zmz.demo.entity.User;
import com.tiger.zmz.demo.service.GithubLookupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author zhanghai2
 * @date 2019-9-24
 */
@Slf4j
@Component
public class AppRunner implements CommandLineRunner {

    private final GithubLookupService githubLookupService;

    public AppRunner(GithubLookupService githubLookupService) {
        this.githubLookupService = githubLookupService;
    }

    @Override
    public void run(String... args) throws Exception {
        long startTime = System.currentTimeMillis();

        Future<User> page1 = githubLookupService.findUser("PivotalSoftware");
        Future<User> page2 = githubLookupService.findUser("CloudFoundry");
        Future<User> page3 = githubLookupService.findUser("Spring-Projects");

        while (!page1.isDone() && !page2.isDone() && !page3.isDone()) {
            Thread.sleep(10);
        }

        log.info("Elapsed time:" + (System.currentTimeMillis() -startTime));
        log.info("page1--->" + page1.get());
        log.info("page2--->" + page2.get());
        log.info("page3--->" + page3.get());
    }
}
