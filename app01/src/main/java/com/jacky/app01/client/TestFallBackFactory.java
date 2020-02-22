package com.jacky.app01.client;

import com.jacky.app01.model.OrderPriceModel;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author chenjiaqi
 * @create 2020-02-21
 */
@Slf4j
public class TestFallBackFactory implements FallbackFactory<TestClient> {
    @Override
    public TestClient create(Throwable throwable) {
        log.error("TestFallBackFactory fallback reason was: {} ", throwable.getMessage(), throwable);
        return new TestClient() {

            @Override
            public OrderPriceModel calculatePrice() {
                return null;
            }
        };
    }
}
