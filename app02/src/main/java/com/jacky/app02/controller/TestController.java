package com.jacky.app02.controller;

import com.jacky.app02.model.OrderPriceModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiaqi
 * @create 2020-02-21
 */
@RestController
public class TestController {
    @RequestMapping(value = "/calculatePrice.do", method = RequestMethod.POST)
    public OrderPriceModel calculatePrice() {
        OrderPriceModel data = new OrderPriceModel();
        return data;
    }
}
