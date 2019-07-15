package com.tiger.zmz.client.demo;

import com.tiger.zmz.client.config.AbstractUnitTestSupport;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author zhanghai2
 * @Description: 实例测试
 * @date 2019-7-15
 */
public class DemoControllerTest extends AbstractUnitTestSupport {

  @Test
  public void testHello() throws Exception {
    MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/demo/hello").contentType(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().is2xxSuccessful()).andDo(MockMvcResultHandlers.print()).andReturn();
    result.getResponse().getContentAsString();
  }
}
