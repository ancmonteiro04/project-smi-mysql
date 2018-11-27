package br.net.smi.lancamento.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.smi.lancamento.model.Categoria;
import br.net.smi.lancamento.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	List<Categoria> categorias = new ArrayList<>();
	
	public List<Categoria> getAllCategorias() {
		categoriaRepository.findAll().forEach(categorias::add);
		return categorias;
	}

	public Categoria getCategoria(Long id) {
		return categoriaRepository.findById(id).orElse(null);
	}

	public void addCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	public void updateCategoria(Long id, Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	public void deleteCategoria(Long id) {
		categoriaRepository.deleteById(id);
	}

}
