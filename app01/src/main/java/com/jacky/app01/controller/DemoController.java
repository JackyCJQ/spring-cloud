package com.jacky.app01.controller;

import com.jacky.app01.Model.Student;
import com.jacky.app01.client.DemoClient;
import com.oracle.tools.packager.Log;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class DemoController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DemoClient demoClient;

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

    @GetMapping("/discoveryClient")
    public String discoveryPing() throws RestClientException, ServiceUnavailableException {
        URI service = serviceUrl().map(s -> s.resolve("/demo/demo.do")).orElseThrow(ServiceUnavailableException::new);
        return restTemplate.getForEntity(service, String.class).getBody();
    }

    @RequestMapping("/demo.do")
    public String demo() {
        Student d=new Student();
        d.setName("sss");
        log.info("log,{}", d);
        return "hello,world";
    }
    @RequestMapping("/demo1.do")
    public String demo1() {
        return demoClient.demo();
    }


}
