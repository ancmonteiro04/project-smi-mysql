package br.net.smi.lancamento.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.net.smi.lancamento.model.Categoria;
import br.net.smi.lancamento.service.CategoriaService;


@RestController
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@RequestMapping(method=RequestMethod.GET, value="/categorias")
	public List<Categoria> getAllCategorias(){
		return categoriaService.getAllCategorias();
	}

	@RequestMapping(method=RequestMethod.GET, value="/categoria/{id}")
	public Categoria getCategoria(@PathVariable Long id){
		return categoriaService.getCategoria(id);
	}

	@RequestMapping(method=RequestMethod.POST, value="/categoria")
	public void addCategoria(@RequestBody Categoria categoria){
		 categoriaService.addCategoria(categoria);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/categoria/{id}")
	public void updateCategoria(@RequestBody Categoria categoria, @PathVariable Long id){
		categoriaService.updateCategoria(id, categoria);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/categoria/{id}")
	public void deleteCategoria(@PathVariable Long id){
		categoriaService.deleteCategoria(id);
	}
	
	
}
