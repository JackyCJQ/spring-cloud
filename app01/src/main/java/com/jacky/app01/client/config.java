package com.jacky.app01.client;

import org.springframework.context.annotation.Configuration;

/**
 * @author chenjiaqi
 * @create 2020-02-21
 */
@Configuration
public class config {
    public TestFallBackFactory testFallBackFactory() {
        return new TestFallBackFactory();
    }
}
