package com.shopping.channle.allipay.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TestController {
//    @Autowired
//    private DiscoveryClient client;

    @Autowired
    RestTemplate restTemplate;

    private final Logger logger = Logger.getLogger(getClass());
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testClient(@RequestParam(value = "value_a") Integer value_a, @RequestParam(value = "value_b") Integer value_b) {
        // ServiceInstance serviceInstance = client.getLocalServiceInstance();
//        logger.info("===/test,host:"+serviceInstance.getHost()+"====serviceId:"+serviceInstance.getServiceId()+"===");
        return restTemplate.getForEntity("http://shopping-channel-alipay-service/test?value_a=3&value_b=3",String.class).getBody();

    }
}
