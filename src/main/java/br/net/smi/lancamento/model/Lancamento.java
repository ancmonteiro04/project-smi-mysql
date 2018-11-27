package br.net.smi.lancamento.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lancamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Empresa empresa;

	@ManyToOne
	private Categoria categoria;
	private String tipo;
	private LocalDate vencimento;
	private BigDecimal valor;

	public Lancamento(Long id, Long idEmpresa, Long idCategoria, String tipo, LocalDate vencimento, BigDecimal valor) {
		super();
		this.id = id;
		this.empresa = new Empresa(idEmpresa, "", "", "", "");
		this.categoria = new Categoria(idCategoria, "");
		this.tipo = tipo;
		this.valor = valor;
		this.vencimento = vencimento;
	}

	public Lancamento() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
