package com.tiger.zmz.dao.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author zhanghai2
 * @Description: Redis测试类
 * @date 2019-7-15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

  @Autowired
  private StringRedisTemplate stringRedisTemplate;

  @Autowired
  private RedisTemplate redisTemplate;

  @Test
  public void testRedis() throws Exception {
    stringRedisTemplate.opsForValue().set("zh-test", "zmz");
    Assert.assertEquals("zmz", stringRedisTemplate.opsForValue().get("zh-test"));
  }
}
