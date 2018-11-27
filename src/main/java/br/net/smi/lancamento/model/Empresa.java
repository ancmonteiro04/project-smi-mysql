package br.net.smi.lancamento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank(message = "Nome não pode ser vazio ou nulo")
	private String nome;

	@NotBlank(message = "cnpj não pode ser vazio ou nulo")
	private String cnpj;
	private String nomeResponsavel;
	private String contato;

	public Empresa(Long id, String nome, String cnpj, String nomeResponsavel, String contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.nomeResponsavel = nomeResponsavel;
		this.contato = contato;
	}

	public Empresa() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
}
