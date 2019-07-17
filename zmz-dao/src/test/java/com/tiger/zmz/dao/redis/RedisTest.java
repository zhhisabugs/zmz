package com.tiger.zmz.dao.redis;

import com.tiger.zmz.common.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

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

  public void testObj() throws Exception {
    User user = new User("张三", 25, 1, "13090908909");
    ValueOperations<String, User> operations = redisTemplate.opsForValue();
    operations.set("admin.user", user);
    operations.set("admin.user.time", user, 1, TimeUnit.SECONDS);
    Thread.sleep(1000);
    boolean exists = redisTemplate.hasKey("admin.user");
    if (exists) {
      System.out.printf("exist user");
    } else {
      System.out.println("user does not exist");
    }
  }
}
