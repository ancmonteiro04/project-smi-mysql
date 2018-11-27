package br.net.smi.lancamento.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.net.smi.lancamento.model.Categoria;
import br.net.smi.lancamento.model.Empresa;
import br.net.smi.lancamento.model.Lancamento;

public interface LancamentoRepository extends CrudRepository<Lancamento, Long> {
	public List<Empresa> findEmpresaById(Long idEmpresa);
	public List<Categoria> findCategoriaById(Long idCategoria);
}
