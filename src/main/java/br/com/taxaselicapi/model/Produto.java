package br.com.taxaselicapi.model;

import io.swagger.annotations.ApiModelProperty;

public class Produto {
	
	@ApiModelProperty(value = "Codigo do produto")
	private Long codigo;
	
	@ApiModelProperty(value = "Nome do produto")
	private String nome;
	
	@ApiModelProperty(value = "Valor do produto")
	private Double valor;
	
	
	public Produto(Long codigo, String nome, Double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public Produto() {
	
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}


	
	
}
