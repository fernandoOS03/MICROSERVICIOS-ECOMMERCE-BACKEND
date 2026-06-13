package com.categorias.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.categorias.model.Categoria;

@Service
public class CategoriaService {
	
	public List<Categoria> listarCategorias(){
		return List.of(
				new Categoria(1, "Electrónica"),
				new Categoria(2, "Ropa"),
				new Categoria(3, "Hogar") );
	}

}
