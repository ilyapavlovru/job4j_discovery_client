package ru.niias.job4j_discovery_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Job4jDiscoveryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Job4jDiscoveryClientApplication.class, args);
    }

}
