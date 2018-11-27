package br.net.smi.lancamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.net.smi.lancamento.model.Categoria;
import br.net.smi.lancamento.model.Empresa;
import br.net.smi.lancamento.model.Lancamento;
import br.net.smi.lancamento.service.LancamentoService;

@RestController
public class LancamentoController {
	@Autowired
	private LancamentoService lancamentoService;
	
	@RequestMapping(method=RequestMethod.GET, value="/empresas/{empresaId}/lancamentos/categorias/{categoriaId}")
	public List<Lancamento> getAllLancamentos(@PathVariable Long empresaId, @PathVariable Long categoriaId){
		return lancamentoService.getAllLancamentos(empresaId, categoriaId);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/lancamento/{id}")
	public Lancamento getLancamento(@PathVariable Long id){
		return lancamentoService.getLancamento(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/empresa/{empresaId}/lancamento/categoria/{categoriaId}")
	public void addLancamento(@RequestBody Lancamento lancamento, @PathVariable Long empresaId, @PathVariable Long categoriaId){
		lancamento.setEmpresa(new Empresa(empresaId, "", "", "", ""));
		lancamento.setCategoria(new Categoria(categoriaId, ""));
		lancamentoService.addLancamento(lancamento);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/lancamento/{id}")
	public void updateLancamento(@RequestBody Lancamento lancamento, @PathVariable Long id){
		lancamentoService.updateLancamento(id, lancamento);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/lancamento/{id}")
	public void deleteLancamento(@PathVariable Long id){
		lancamentoService.deleteLancamento(id);
	}
}
