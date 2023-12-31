package com.salary.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class ConfigurationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApplication.class, args);
	}
}
