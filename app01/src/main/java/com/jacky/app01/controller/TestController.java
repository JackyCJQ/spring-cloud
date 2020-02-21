package com.jacky.app01.controller;

import com.jacky.app01.client.TestClient;
import com.jacky.app01.model.OrderPriceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjiaqi
 * @create 2020-02-21
 */
@RestController
public class TestController {
    @Autowired
    private TestClient client;

    @RequestMapping(value = "/calculatePrice.do")
    public OrderPriceModel calculatePrice() {
        return client.calculatePrice();

    }
}
