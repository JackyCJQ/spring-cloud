package com.jacky.app01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.naming.ServiceUnavailableException;
import java.net.URI;
import java.util.Optional;

/**
 * @author chenjiaqi
 * @create 2020-02-16
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 发现其他服务
     *
     * @return
     */
    public Optional<URI> serviceUrl() {
        return discoveryClient.getInstances("app02-8082")
                .stream()
                .map(si -> si.getUri())
                .findFirst();
    }

    @RequestMapping("/demo.do")
    public String demo() {
        return "hello,world";
    }

    @GetMapping("/discoveryClient")
    public String discoveryPing() throws RestClientException, ServiceUnavailableException {
        URI service = serviceUrl().map(s -> s.resolve("/demo/demo.do")).orElseThrow(ServiceUnavailableException::new);
        return restTemplate.getForEntity(service, String.class).getBody();
    }
}
