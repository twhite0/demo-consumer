package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.context.annotation.Import;
//import org.apache.cxf.jaxrs.spring.SpringComponentScanServer;
//@Import(SpringComponentScanServer.class)

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages="com.example.endpoint")
public class RegistryConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryConsumerApplication.class, args);
	}
}
