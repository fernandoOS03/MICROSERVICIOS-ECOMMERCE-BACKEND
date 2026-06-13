package com.catagalo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catagalo.feing.CategoriaFeing;
import com.catagalo.service.CataloloService;

@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {
	
	@Autowired
	private CataloloService service;
	
	@GetMapping
	public  ResponseEntity<List<CategoriaFeing> > obtenerCategorias(){
		List<CategoriaFeing> listCateogiras = service.obtenerCategoriasFeing();
		
		if(listCateogiras.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(listCateogiras);
		
	}

}
