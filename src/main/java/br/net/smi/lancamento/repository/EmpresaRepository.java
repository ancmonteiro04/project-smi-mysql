package br.net.smi.lancamento.repository;

import org.springframework.data.repository.CrudRepository;
import br.net.smi.lancamento.model.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
	public Empresa findEmpresaByNome(String nome);
	public Empresa findEmpresaByCnpj(String cnpj);
	
}
