package br.net.smi.lancamento.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.net.smi.lancamento.model.Empresa;
import br.net.smi.lancamento.repository.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<Empresa> getAllEmpresas(){
		List<Empresa> empresas = new ArrayList<>();
		empresaRepository.findAll().forEach(empresas::add);
		return empresas;
	}
	
	public Empresa getEmpresa(Long id){
		return empresaRepository.findById(id).orElse(null);
	}
	
	public Empresa getEmpresaByName(String nome){
		return empresaRepository.findEmpresaByNome(nome);
	}
	
	public Empresa getEmpresaByCnpj(String cnpj){
		return empresaRepository.findEmpresaByCnpj(cnpj);
	}
	
	public void addEmpresa(Empresa empresa){
		empresaRepository.save(empresa);
	}
	
	public void updateEmpresa(Long id, Empresa empresa){
		empresaRepository.save(empresa);
	}
	
	public void deleteEmpresa(Long id){
		empresaRepository.deleteById(id);
	}
}
