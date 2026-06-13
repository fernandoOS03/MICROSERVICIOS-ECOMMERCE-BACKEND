 package com.catagalo.feing;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "servicio-categorias")
public interface CategoriaFeingClient {
	
	@GetMapping("/api/categorias")
	List<CategoriaFeing> listarCategorias();
}
