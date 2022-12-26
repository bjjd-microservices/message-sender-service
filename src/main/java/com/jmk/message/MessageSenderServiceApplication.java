package com.jmk.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@EnableFeignClients(basePackages = "com.jmk")
@ComponentScan(basePackages = { "com.jmk" })
public class MessageSenderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageSenderServiceApplication.class, args);
	}

}

