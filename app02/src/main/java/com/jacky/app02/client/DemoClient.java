package com.jacky.app02.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenjiaqi
 * @create 2020-02-19
 */
@FeignClient(value = "app01-8081")
public interface DemoClient {
    @RequestMapping("/demo/demo.do")
    String demo();
}
