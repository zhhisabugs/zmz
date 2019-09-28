package com.tiger.zmz.client.service;

import com.tiger.zmz.client.service.impl.HiServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhanghai2
 * @date 2019-9-26
 */
@FeignClient(name = "zmz-service", fallback = HiServiceImpl.class)
public interface HiService {

    @RequestMapping("/hello")
    String sayHi(@RequestParam(value = "name") String name);

}
