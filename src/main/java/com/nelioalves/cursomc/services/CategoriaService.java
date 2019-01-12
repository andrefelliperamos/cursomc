package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> objCategoria = repo.findById(id);
		return objCategoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto Não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())
				); 
	}
}


