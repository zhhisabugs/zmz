package com.tiger.zmz.dao.redis;

import com.tiger.zmz.common.model.SysUser;
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

  @Test
  public void testObj() throws Exception {
    SysUser sysUser = new SysUser();
    sysUser.setAccount("test");
    sysUser.setPassword("123456");
    sysUser.setName("test");
    ValueOperations<String, SysUser> operations = redisTemplate.opsForValue();
    operations.set("admin.sysUser", sysUser);
    operations.set("admin.sysUser.time", sysUser, 1, TimeUnit.SECONDS);
    Thread.sleep(1000);
    boolean exists = redisTemplate.hasKey("admin.sysUser");
    if (exists) {
      System.out.printf("exist sysUser");
    } else {
      System.out.println("sysUser does not exist");
    }
  }
}
