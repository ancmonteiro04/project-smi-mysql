package br.net.smi.lancamento.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.smi.lancamento.model.Lancamento;
import br.net.smi.lancamento.repository.LancamentoRepository;

@Service
public class LancamentoService {
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public List<Lancamento> getAllLancamentos(Long empresaId, Long categoriaId){
		List<Lancamento> lancamentos = new ArrayList<>();
		lancamentoRepository.findEmpresaById(empresaId);
		lancamentoRepository.findCategoriaById(categoriaId);
		lancamentoRepository.findAll().forEach(lancamentos::add);
		return lancamentos;
	}
	
	public Lancamento getLancamento(Long id){
		return lancamentoRepository.findById(id).orElse(null);
	}
	
	public void addLancamento(Lancamento lancamento){
		lancamentoRepository.save(lancamento);
	};
	
	
	public void updateLancamento(Long id, Lancamento lancamento){
		lancamentoRepository.save(lancamento);
	}
	
	public void deleteLancamento(Long id){
		lancamentoRepository.deleteById(id);
	}
}
