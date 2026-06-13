package com.categorias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Tema05ServicioCategoriasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tema05ServicioCategoriasApplication.class, args);
	}

}
