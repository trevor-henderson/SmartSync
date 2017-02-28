package com.smartsync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SmartsyncApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartsyncApiGatewayApplication.class, args);
	}
}