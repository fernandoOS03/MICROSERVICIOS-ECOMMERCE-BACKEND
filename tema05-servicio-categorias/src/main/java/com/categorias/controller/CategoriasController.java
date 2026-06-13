package com.categorias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.categorias.model.Categoria;
import com.categorias.services.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasController {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public  ResponseEntity<List<Categoria> > listarCategorias(){
		List<Categoria> listCateogiras = service.listarCategorias();
		
		if(listCateogiras.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(listCateogiras);
		
	}
}
