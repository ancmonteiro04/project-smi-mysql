package br.net.smi.lancamento.repository;

import org.springframework.data.repository.CrudRepository;

import br.net.smi.lancamento.model.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

}
