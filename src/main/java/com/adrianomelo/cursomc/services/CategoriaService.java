package com.adrianomelo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianomelo.cursomc.domain.Categoria;
import com.adrianomelo.cursomc.repositories.CategoriaRepository;
import com.adrianomelo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> catOpt = repo.findById(id);
		return catOpt.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id " + id + "" + ", Tipo: " + Categoria.class.getName()));
	}

}
