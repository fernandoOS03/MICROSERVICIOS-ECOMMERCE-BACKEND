package com.catagalo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Tema05ServicioCatagaloApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tema05ServicioCatagaloApplication.class, args);
	}

}
