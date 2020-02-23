package com.jacky.app03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authror jacky
 * @create 2020-02-23
 */
@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo() {
        return "hello,world";
    }
}
