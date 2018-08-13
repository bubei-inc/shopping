package com.zhao.shopping.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ShoppingEurekaApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ShoppingEurekaApplication.class).web(true).run(args);
    }
}
