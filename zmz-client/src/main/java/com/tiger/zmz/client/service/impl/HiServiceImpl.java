package com.tiger.zmz.client.service.impl;

import com.tiger.zmz.client.service.HiService;
import org.springframework.stereotype.Service;

/**
 * @author zhanghai2
 * @date 2019-9-26
 */
@Service
public class HiServiceImpl implements HiService {
    @Override
    public String sayHi(String name) {
        return "Sorry, Some error occur";
    }
}
