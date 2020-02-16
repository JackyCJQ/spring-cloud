package com.jacky.app02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiaqi
 * @create 2020-02-16
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/demo.do")
    public String demo() {
        return "hello,world";
    }
}