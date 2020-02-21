package com.jacky.app01.client;

import com.jacky.app01.model.OrderPriceModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chenjiaqi
 * @create 2020-02-21
 */
@FeignClient(value = "app02-8082", fallbackFactory = TestFallBackFactory.class, configuration = config.class)
public interface TestClient {
    @RequestMapping(value = "/calculatePrice.do", method = RequestMethod.POST)
    OrderPriceModel calculatePrice();
}
