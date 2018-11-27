package br.net.smi.lancamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.net.smi.lancamento.model.Empresa;
import br.net.smi.lancamento.service.EmpresaService;


@RestController
public class EmpresaController {
	@Autowired
	private EmpresaService empresaService;
	
	@RequestMapping(method=RequestMethod.GET, value="/empresas")
	public List<Empresa> getAllEmpresas(){
		return empresaService.getAllEmpresas();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/empresa/{id}")
	public Empresa getEmpresa(@PathVariable Long id){
		return empresaService.getEmpresa(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/filtraEmpresaName/{nome}")
	public Empresa getEmpresaByName(@PathVariable String nome){
		return empresaService.getEmpresaByName(nome);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/filtraEmpresaCnpj/{cnpj}")
	public Empresa getEmpresabyCnpj(@PathVariable String cnpj){
		return empresaService.getEmpresaByCnpj(cnpj);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/empresa")
	public void addEmpresa(@RequestBody Empresa empresa){
		empresaService.addEmpresa(empresa);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/empresa/{id}")
	public void updateEmpresa(@RequestBody Empresa empresa, @PathVariable Long id){
		empresaService.updateEmpresa(id, empresa);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/empresa/{id}")
	public void deleteEmpresa(@PathVariable Long id){
		empresaService.deleteEmpresa(id);
	}
}
