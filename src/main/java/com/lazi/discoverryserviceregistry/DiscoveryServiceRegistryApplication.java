package com.lazi.discoverryserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication @EnableEurekaServer
public class DiscoveryServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceRegistryApplication.class, args);
    }

}
