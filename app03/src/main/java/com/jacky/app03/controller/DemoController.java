package com.jacky.app03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Authror jacky
 * @create 2020-02-23
 */
@RestController
public class DemoController {
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String demo(@RequestParam(value = "orderId", required = false) String orderId) {
        return "Hello World";
    }
}