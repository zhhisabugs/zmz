package com.tiger.zmz.demo;

import com.tiger.zmz.demo.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhanghai2
 * @date 2019-9-23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTests {
    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis() {
        redisDao.setKey("name", "zhang");
        redisDao.setKey("age", "100");
        System.out.println("name:" + redisDao.getValue("name"));;
        System.out.println("age:"+ redisDao.getValue("age"));;
    }
}
