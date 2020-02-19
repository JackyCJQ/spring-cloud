package com.jacky.app02.controller;

import com.jacky.app02.client.DemoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiaqi
 * @create 2020-02-16
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoClient demoClient;

    @RequestMapping("/demo.do")
    public String demo() {
        return "hello,world";
    }


    @RequestMapping("/demo1.do")
    public String demo1() {
        return demoClient.demo();
    }


}