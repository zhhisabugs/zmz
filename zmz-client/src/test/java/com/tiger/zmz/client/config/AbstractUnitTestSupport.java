package com.tiger.zmz.client.config;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.web.SpringBootMockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.support.GenericWebApplicationContext;

/**
 * @author zhanghai2
 * @Description: 单元测试统一配置类
 * @date 2019-7-15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public abstract class AbstractUnitTestSupport {

  protected MockMvc mockMvc;

  @Autowired
  private GenericWebApplicationContext gwc;

  @Before
  public void setUp() {
    this.mockMvc = MockMvcBuilders.webAppContextSetup(this.gwc).build();
    log.debug("*****{} Test*****", gwc.getApplicationName());
    SpringBootMockServletContext servletContext = (SpringBootMockServletContext) gwc.getServletContext();
    // 设置context-path
    servletContext.setContextPath("/zms");
  }
}
