package com.zhao.shoppingconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ShoppingConfigApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ShoppingConfigApplication.class).web(true).run(args);
    }
}
