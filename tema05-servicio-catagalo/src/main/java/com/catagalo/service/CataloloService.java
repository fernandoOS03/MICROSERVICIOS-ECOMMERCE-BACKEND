package com.catagalo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catagalo.feing.CategoriaFeing;
import com.catagalo.feing.CategoriaFeingClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CataloloService {

	@Autowired
	private CategoriaFeingClient clientFeing;
	
	List<CategoriaFeing> cacheCategorias = new ArrayList<CategoriaFeing>();
	
	@CircuitBreaker(name = "servicio-categorias", fallbackMethod =  "fallbackCategorias")
	public List<CategoriaFeing> obtenerCategoriasFeing(){
		
		try {
			List<CategoriaFeing> listaCategorias = clientFeing.listarCategorias();		
			
			System.out.println("Actualizar caché de categorías");
			cacheCategorias = listaCategorias;
			return listaCategorias;	
			
		} catch (Exception e) {
			System.out.println("Error al consumir servicio" + e.getMessage());
			return fallbackCategorias(e);
		}
	}

	public List<CategoriaFeing> fallbackCategorias(Throwable throwable) {
		if(!cacheCategorias.isEmpty()) {
			return cacheCategorias;
		}
		
		System.out.println("Fallback Ejecutado");
		 return List.of(new CategoriaFeing(0, "Servicio de categorias no disponible"));
	}
}
